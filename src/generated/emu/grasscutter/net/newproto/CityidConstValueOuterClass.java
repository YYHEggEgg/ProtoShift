// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CityidConstValue.proto

package emu.grasscutter.net.newproto;

public final class CityidConstValueOuterClass {
  private CityidConstValueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CityidConstValue}
   */
  public enum CityidConstValue
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CITYID_CONST_VALUE_NONE = 0;</code>
     */
    CITYID_CONST_VALUE_NONE(0),
    /**
     * <code>CITYID_CONST_VALUE_MENGDE = 1;</code>
     */
    CITYID_CONST_VALUE_MENGDE(1),
    /**
     * <code>CITYID_CONST_VALUE_LIYUE = 2;</code>
     */
    CITYID_CONST_VALUE_LIYUE(2),
    /**
     * <code>CITYID_CONST_VALUE_DAOQI = 3;</code>
     */
    CITYID_CONST_VALUE_DAOQI(3),
    /**
     * <code>CITYID_CONST_VALUE_XUMI = 4;</code>
     */
    CITYID_CONST_VALUE_XUMI(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CITYID_CONST_VALUE_NONE = 0;</code>
     */
    public static final int CITYID_CONST_VALUE_NONE_VALUE = 0;
    /**
     * <code>CITYID_CONST_VALUE_MENGDE = 1;</code>
     */
    public static final int CITYID_CONST_VALUE_MENGDE_VALUE = 1;
    /**
     * <code>CITYID_CONST_VALUE_LIYUE = 2;</code>
     */
    public static final int CITYID_CONST_VALUE_LIYUE_VALUE = 2;
    /**
     * <code>CITYID_CONST_VALUE_DAOQI = 3;</code>
     */
    public static final int CITYID_CONST_VALUE_DAOQI_VALUE = 3;
    /**
     * <code>CITYID_CONST_VALUE_XUMI = 4;</code>
     */
    public static final int CITYID_CONST_VALUE_XUMI_VALUE = 4;


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
    public static CityidConstValue valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CityidConstValue forNumber(int value) {
      switch (value) {
        case 0: return CITYID_CONST_VALUE_NONE;
        case 1: return CITYID_CONST_VALUE_MENGDE;
        case 2: return CITYID_CONST_VALUE_LIYUE;
        case 3: return CITYID_CONST_VALUE_DAOQI;
        case 4: return CITYID_CONST_VALUE_XUMI;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CityidConstValue>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CityidConstValue> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CityidConstValue>() {
            public CityidConstValue findValueByNumber(int number) {
              return CityidConstValue.forNumber(number);
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
      return emu.grasscutter.net.newproto.CityidConstValueOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CityidConstValue[] VALUES = values();

    public static CityidConstValue valueOf(
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

    private CityidConstValue(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CityidConstValue)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026CityidConstValue.proto*\247\001\n\020CityidConst" +
      "Value\022\033\n\027CITYID_CONST_VALUE_NONE\020\000\022\035\n\031CI" +
      "TYID_CONST_VALUE_MENGDE\020\001\022\034\n\030CITYID_CONS" +
      "T_VALUE_LIYUE\020\002\022\034\n\030CITYID_CONST_VALUE_DA" +
      "OQI\020\003\022\033\n\027CITYID_CONST_VALUE_XUMI\020\004B\036\n\034em" +
      "u.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
