// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_GIFGEDBCPFC_ServerRsp.proto

package emu.grasscutter.net.newproto;

public final class Unk2700GIFGEDBCPFCServerRsp {
  private Unk2700GIFGEDBCPFCServerRsp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_GIFGEDBCPFC_ServerRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_GIFGEDBCPFC_ServerRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 Unk2700_KHDDIJNOICK = 4;</code>
     * @return The unk2700KHDDIJNOICK.
     */
    long getUnk2700KHDDIJNOICK();

    /**
     * <code>uint32 parent_quest_id = 7;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 495
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_GIFGEDBCPFC_ServerRsp}
   */
  public static final class Unk2700_GIFGEDBCPFC_ServerRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_GIFGEDBCPFC_ServerRsp)
      Unk2700_GIFGEDBCPFC_ServerRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_GIFGEDBCPFC_ServerRsp.newBuilder() to construct.
    private Unk2700_GIFGEDBCPFC_ServerRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_GIFGEDBCPFC_ServerRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_GIFGEDBCPFC_ServerRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp.class, emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp.Builder.class);
    }

    public static final int UNK2700_KHDDIJNOICK_FIELD_NUMBER = 4;
    private long unk2700KHDDIJNOICK_;
    /**
     * <code>uint64 Unk2700_KHDDIJNOICK = 4;</code>
     * @return The unk2700KHDDIJNOICK.
     */
    @java.lang.Override
    public long getUnk2700KHDDIJNOICK() {
      return unk2700KHDDIJNOICK_;
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 7;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 7;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      if (unk2700KHDDIJNOICK_ != 0L) {
        output.writeUInt64(4, unk2700KHDDIJNOICK_);
      }
      if (parentQuestId_ != 0) {
        output.writeUInt32(7, parentQuestId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      if (unk2700KHDDIJNOICK_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, unk2700KHDDIJNOICK_);
      }
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, parentQuestId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp other = (emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp) obj;

      if (getUnk2700KHDDIJNOICK()
          != other.getUnk2700KHDDIJNOICK()) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + UNK2700_KHDDIJNOICK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk2700KHDDIJNOICK());
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 495
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_GIFGEDBCPFC_ServerRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_GIFGEDBCPFC_ServerRsp)
        emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp.class, emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2700KHDDIJNOICK_ = 0L;

        parentQuestId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp build() {
        emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp buildPartial() {
        emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp result = new emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp(this);
        result.unk2700KHDDIJNOICK_ = unk2700KHDDIJNOICK_;
        result.parentQuestId_ = parentQuestId_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp other) {
        if (other == emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp.getDefaultInstance()) return this;
        if (other.getUnk2700KHDDIJNOICK() != 0L) {
          setUnk2700KHDDIJNOICK(other.getUnk2700KHDDIJNOICK());
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                retcode_ = input.readInt32();

                break;
              } // case 8
              case 32: {
                unk2700KHDDIJNOICK_ = input.readUInt64();

                break;
              } // case 32
              case 56: {
                parentQuestId_ = input.readUInt32();

                break;
              } // case 56
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }

      private long unk2700KHDDIJNOICK_ ;
      /**
       * <code>uint64 Unk2700_KHDDIJNOICK = 4;</code>
       * @return The unk2700KHDDIJNOICK.
       */
      @java.lang.Override
      public long getUnk2700KHDDIJNOICK() {
        return unk2700KHDDIJNOICK_;
      }
      /**
       * <code>uint64 Unk2700_KHDDIJNOICK = 4;</code>
       * @param value The unk2700KHDDIJNOICK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KHDDIJNOICK(long value) {
        
        unk2700KHDDIJNOICK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk2700_KHDDIJNOICK = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KHDDIJNOICK() {
        
        unk2700KHDDIJNOICK_ = 0L;
        onChanged();
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Unk2700_GIFGEDBCPFC_ServerRsp)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_GIFGEDBCPFC_ServerRsp)
    private static final emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp();
    }

    public static emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_GIFGEDBCPFC_ServerRsp>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_GIFGEDBCPFC_ServerRsp>() {
      @java.lang.Override
      public Unk2700_GIFGEDBCPFC_ServerRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Unk2700_GIFGEDBCPFC_ServerRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_GIFGEDBCPFC_ServerRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700GIFGEDBCPFCServerRsp.Unk2700_GIFGEDBCPFC_ServerRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#Unk2700_GIFGEDBCPFC_ServerRsp.proto\"f\n" +
      "\035Unk2700_GIFGEDBCPFC_ServerRsp\022\033\n\023Unk270" +
      "0_KHDDIJNOICK\030\004 \001(\004\022\027\n\017parent_quest_id\030\007" +
      " \001(\r\022\017\n\007retcode\030\001 \001(\005B\036\n\034emu.grasscutter" +
      ".net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_GIFGEDBCPFC_ServerRsp_descriptor,
        new java.lang.String[] { "Unk2700KHDDIJNOICK", "ParentQuestId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}