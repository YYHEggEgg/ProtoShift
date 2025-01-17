// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MathExpressionType.proto

package emu.grasscutter.net.newproto;

public final class MathExpressionTypeOuterClass {
  private MathExpressionTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MathExpressionType}
   */
  public enum MathExpressionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_NONE = 0;</code>
     */
    MATH_EXPRESSION_TYPE_EXPR_NONE(0),
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_LEVEL = 1;</code>
     */
    MATH_EXPRESSION_TYPE_EXPR_LEVEL(1),
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_REGISTER_TIME = 2;</code>
     */
    MATH_EXPRESSION_TYPE_EXPR_REGISTER_TIME(2),
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_LAST_LOGIN_TIME = 3;</code>
     */
    MATH_EXPRESSION_TYPE_EXPR_LAST_LOGIN_TIME(3),
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_TOTAL_LOGIN_DAYS = 4;</code>
     */
    MATH_EXPRESSION_TYPE_EXPR_TOTAL_LOGIN_DAYS(4),
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_PLATFORM = 5;</code>
     */
    MATH_EXPRESSION_TYPE_EXPR_PLATFORM(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_NONE = 0;</code>
     */
    public static final int MATH_EXPRESSION_TYPE_EXPR_NONE_VALUE = 0;
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_LEVEL = 1;</code>
     */
    public static final int MATH_EXPRESSION_TYPE_EXPR_LEVEL_VALUE = 1;
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_REGISTER_TIME = 2;</code>
     */
    public static final int MATH_EXPRESSION_TYPE_EXPR_REGISTER_TIME_VALUE = 2;
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_LAST_LOGIN_TIME = 3;</code>
     */
    public static final int MATH_EXPRESSION_TYPE_EXPR_LAST_LOGIN_TIME_VALUE = 3;
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_TOTAL_LOGIN_DAYS = 4;</code>
     */
    public static final int MATH_EXPRESSION_TYPE_EXPR_TOTAL_LOGIN_DAYS_VALUE = 4;
    /**
     * <code>MATH_EXPRESSION_TYPE_EXPR_PLATFORM = 5;</code>
     */
    public static final int MATH_EXPRESSION_TYPE_EXPR_PLATFORM_VALUE = 5;


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
    public static MathExpressionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MathExpressionType forNumber(int value) {
      switch (value) {
        case 0: return MATH_EXPRESSION_TYPE_EXPR_NONE;
        case 1: return MATH_EXPRESSION_TYPE_EXPR_LEVEL;
        case 2: return MATH_EXPRESSION_TYPE_EXPR_REGISTER_TIME;
        case 3: return MATH_EXPRESSION_TYPE_EXPR_LAST_LOGIN_TIME;
        case 4: return MATH_EXPRESSION_TYPE_EXPR_TOTAL_LOGIN_DAYS;
        case 5: return MATH_EXPRESSION_TYPE_EXPR_PLATFORM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MathExpressionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MathExpressionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MathExpressionType>() {
            public MathExpressionType findValueByNumber(int number) {
              return MathExpressionType.forNumber(number);
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
      return emu.grasscutter.net.newproto.MathExpressionTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MathExpressionType[] VALUES = values();

    public static MathExpressionType valueOf(
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

    private MathExpressionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MathExpressionType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030MathExpressionType.proto*\221\002\n\022MathExpre" +
      "ssionType\022\"\n\036MATH_EXPRESSION_TYPE_EXPR_N" +
      "ONE\020\000\022#\n\037MATH_EXPRESSION_TYPE_EXPR_LEVEL" +
      "\020\001\022+\n\'MATH_EXPRESSION_TYPE_EXPR_REGISTER" +
      "_TIME\020\002\022-\n)MATH_EXPRESSION_TYPE_EXPR_LAS" +
      "T_LOGIN_TIME\020\003\022.\n*MATH_EXPRESSION_TYPE_E" +
      "XPR_TOTAL_LOGIN_DAYS\020\004\022&\n\"MATH_EXPRESSIO" +
      "N_TYPE_EXPR_PLATFORM\020\005B\036\n\034emu.grasscutte" +
      "r.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
