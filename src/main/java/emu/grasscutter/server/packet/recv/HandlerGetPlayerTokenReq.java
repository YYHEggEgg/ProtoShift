
package emu.grasscutter.server.packet.recv;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.utils.Crypto;
import emu.grasscutter.utils.Utils;

import javax.crypto.Cipher;
import java.nio.ByteBuffer;

@Opcodes(value = PacketOpcodes.newOpcodes.GetPlayerTokenReq, type = 1)
public class HandlerGetPlayerTokenReq extends PacketHandler {
    public static class Packet extends BasePacket {

        public Packet(byte[] header, emu.grasscutter.net.newproto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq req) {
            super(header, new PacketOpcodes(PacketOpcodes.oldOpcodes.GetPlayerTokenReq, 2));

            var q = emu.grasscutter.net.oldproto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.newBuilder();
            try {
                String json = JsonFormat.printer().print(req);
                JsonFormat.parser().ignoringUnknownFields().merge(json, q);
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }

            this.setUseDispatchKey(true);
            this.setData(q.build());
        }
    }
    @Override
    public BasePacket Packet(byte[] payload) throws Exception {
        return new Packet(new byte[0],emu.grasscutter.net.newproto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(payload));
    }
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        emu.grasscutter.net.newproto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq req = emu.grasscutter.net.newproto.GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(payload);
        // Auto template
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, Crypto.CUR_SIGNING_KEY);

        var client_seed_encrypted = Utils.base64Decode(req.getClientRandKey());
        session.setClientSeed(ByteBuffer.wrap(cipher.doFinal(client_seed_encrypted)).getLong());
        session.send(new Packet(header, req));
    }

}
