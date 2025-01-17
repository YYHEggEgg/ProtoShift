// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatChannel.proto

package emu.grasscutter.net.newproto;

public final class ChatChannelOuterClass {
  private ChatChannelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ChatChannel}
   */
  public enum ChatChannel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHAT_CHANNEL_TEAM = 0;</code>
     */
    CHAT_CHANNEL_TEAM(0),
    /**
     * <code>CHAT_CHANNEL_FRIEND = 1;</code>
     */
    CHAT_CHANNEL_FRIEND(1),
    /**
     * <code>CHAT_CHANNEL_NONE = 2;</code>
     */
    CHAT_CHANNEL_NONE(2),
    /**
     * <code>CHAT_CHANNEL_HIDEANDSEEK = 3;</code>
     */
    CHAT_CHANNEL_HIDEANDSEEK(3),
    /**
     * <code>CHAT_CHANNEL_HIDEANDSEEK_TEAM = 5;</code>
     */
    CHAT_CHANNEL_HIDEANDSEEK_TEAM(5),
    /**
     * <code>CHAT_CHANNEL_ALL = 10;</code>
     */
    CHAT_CHANNEL_ALL(10),
    /**
     * <code>CHAT_CHANNEL_TEST = 100;</code>
     */
    CHAT_CHANNEL_TEST(100),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CHAT_CHANNEL_TEAM = 0;</code>
     */
    public static final int CHAT_CHANNEL_TEAM_VALUE = 0;
    /**
     * <code>CHAT_CHANNEL_FRIEND = 1;</code>
     */
    public static final int CHAT_CHANNEL_FRIEND_VALUE = 1;
    /**
     * <code>CHAT_CHANNEL_NONE = 2;</code>
     */
    public static final int CHAT_CHANNEL_NONE_VALUE = 2;
    /**
     * <code>CHAT_CHANNEL_HIDEANDSEEK = 3;</code>
     */
    public static final int CHAT_CHANNEL_HIDEANDSEEK_VALUE = 3;
    /**
     * <code>CHAT_CHANNEL_HIDEANDSEEK_TEAM = 5;</code>
     */
    public static final int CHAT_CHANNEL_HIDEANDSEEK_TEAM_VALUE = 5;
    /**
     * <code>CHAT_CHANNEL_ALL = 10;</code>
     */
    public static final int CHAT_CHANNEL_ALL_VALUE = 10;
    /**
     * <code>CHAT_CHANNEL_TEST = 100;</code>
     */
    public static final int CHAT_CHANNEL_TEST_VALUE = 100;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ChatChannel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChatChannel forNumber(int value) {
      switch (value) {
        case 0: return CHAT_CHANNEL_TEAM;
        case 1: return CHAT_CHANNEL_FRIEND;
        case 2: return CHAT_CHANNEL_NONE;
        case 3: return CHAT_CHANNEL_HIDEANDSEEK;
        case 5: return CHAT_CHANNEL_HIDEANDSEEK_TEAM;
        case 10: return CHAT_CHANNEL_ALL;
        case 100: return CHAT_CHANNEL_TEST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChatChannel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChatChannel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChatChannel>() {
            public ChatChannel findValueByNumber(int number) {
              return ChatChannel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ChatChannelOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChatChannel[] VALUES = values();

    public static ChatChannel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ChatChannel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChatChannel)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ChatChannel.proto*\302\001\n\013ChatChannel\022\025\n\021C" +
      "HAT_CHANNEL_TEAM\020\000\022\027\n\023CHAT_CHANNEL_FRIEN" +
      "D\020\001\022\025\n\021CHAT_CHANNEL_NONE\020\002\022\034\n\030CHAT_CHANN" +
      "EL_HIDEANDSEEK\020\003\022!\n\035CHAT_CHANNEL_HIDEAND" +
      "SEEK_TEAM\020\005\022\024\n\020CHAT_CHANNEL_ALL\020\n\022\025\n\021CHA" +
      "T_CHANNEL_TEST\020dB\036\n\034emu.grasscutter.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
