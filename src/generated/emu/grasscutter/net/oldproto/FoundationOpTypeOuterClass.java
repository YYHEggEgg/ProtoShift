// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoundationOpType.proto

package emu.grasscutter.net.oldproto;

public final class FoundationOpTypeOuterClass {
  private FoundationOpTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code FoundationOpType}
   */
  public enum FoundationOpType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FOUNDATION_OP_TYPE_NONE = 0;</code>
     */
    FOUNDATION_OP_TYPE_NONE(0),
    /**
     * <code>FOUNDATION_OP_TYPE_BUILD = 1;</code>
     */
    FOUNDATION_OP_TYPE_BUILD(1),
    /**
     * <code>FOUNDATION_OP_TYPE_DEMOLITION = 2;</code>
     */
    FOUNDATION_OP_TYPE_DEMOLITION(2),
    /**
     * <code>FOUNDATION_OP_TYPE_REBUILD = 3;</code>
     */
    FOUNDATION_OP_TYPE_REBUILD(3),
    /**
     * <code>FOUNDATION_OP_TYPE_ROTATE = 4;</code>
     */
    FOUNDATION_OP_TYPE_ROTATE(4),
    /**
     * <code>FOUNDATION_OP_TYPE_LOCK = 5;</code>
     */
    FOUNDATION_OP_TYPE_LOCK(5),
    /**
     * <code>FOUNDATION_OP_TYPE_UNLOCK = 6;</code>
     */
    FOUNDATION_OP_TYPE_UNLOCK(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FOUNDATION_OP_TYPE_NONE = 0;</code>
     */
    public static final int FOUNDATION_OP_TYPE_NONE_VALUE = 0;
    /**
     * <code>FOUNDATION_OP_TYPE_BUILD = 1;</code>
     */
    public static final int FOUNDATION_OP_TYPE_BUILD_VALUE = 1;
    /**
     * <code>FOUNDATION_OP_TYPE_DEMOLITION = 2;</code>
     */
    public static final int FOUNDATION_OP_TYPE_DEMOLITION_VALUE = 2;
    /**
     * <code>FOUNDATION_OP_TYPE_REBUILD = 3;</code>
     */
    public static final int FOUNDATION_OP_TYPE_REBUILD_VALUE = 3;
    /**
     * <code>FOUNDATION_OP_TYPE_ROTATE = 4;</code>
     */
    public static final int FOUNDATION_OP_TYPE_ROTATE_VALUE = 4;
    /**
     * <code>FOUNDATION_OP_TYPE_LOCK = 5;</code>
     */
    public static final int FOUNDATION_OP_TYPE_LOCK_VALUE = 5;
    /**
     * <code>FOUNDATION_OP_TYPE_UNLOCK = 6;</code>
     */
    public static final int FOUNDATION_OP_TYPE_UNLOCK_VALUE = 6;


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
    public static FoundationOpType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FoundationOpType forNumber(int value) {
      switch (value) {
        case 0: return FOUNDATION_OP_TYPE_NONE;
        case 1: return FOUNDATION_OP_TYPE_BUILD;
        case 2: return FOUNDATION_OP_TYPE_DEMOLITION;
        case 3: return FOUNDATION_OP_TYPE_REBUILD;
        case 4: return FOUNDATION_OP_TYPE_ROTATE;
        case 5: return FOUNDATION_OP_TYPE_LOCK;
        case 6: return FOUNDATION_OP_TYPE_UNLOCK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FoundationOpType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FoundationOpType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FoundationOpType>() {
            public FoundationOpType findValueByNumber(int number) {
              return FoundationOpType.forNumber(number);
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
      return emu.grasscutter.net.oldproto.FoundationOpTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final FoundationOpType[] VALUES = values();

    public static FoundationOpType valueOf(
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

    private FoundationOpType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:FoundationOpType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FoundationOpType.proto*\353\001\n\020FoundationO" +
      "pType\022\033\n\027FOUNDATION_OP_TYPE_NONE\020\000\022\034\n\030FO" +
      "UNDATION_OP_TYPE_BUILD\020\001\022!\n\035FOUNDATION_O" +
      "P_TYPE_DEMOLITION\020\002\022\036\n\032FOUNDATION_OP_TYP" +
      "E_REBUILD\020\003\022\035\n\031FOUNDATION_OP_TYPE_ROTATE" +
      "\020\004\022\033\n\027FOUNDATION_OP_TYPE_LOCK\020\005\022\035\n\031FOUND" +
      "ATION_OP_TYPE_UNLOCK\020\006B\036\n\034emu.grasscutte" +
      "r.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
