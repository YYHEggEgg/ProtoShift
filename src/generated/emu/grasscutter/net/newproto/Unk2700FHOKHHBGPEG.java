// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_FHOKHHBGPEG.proto

package emu.grasscutter.net.newproto;

public final class Unk2700FHOKHHBGPEG {
  private Unk2700FHOKHHBGPEG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Unk2700_FHOKHHBGPEG}
   */
  public enum Unk2700_FHOKHHBGPEG
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unk2700_FHOKHHBGPEG_NONE = 0;</code>
     */
    Unk2700_FHOKHHBGPEG_NONE(0),
    /**
     * <code>Unk2700_FHOKHHBGPEG_FAIL = 1;</code>
     */
    Unk2700_FHOKHHBGPEG_FAIL(1),
    /**
     * <code>Unk2700_FHOKHHBGPEG_SUCC = 2;</code>
     */
    Unk2700_FHOKHHBGPEG_SUCC(2),
    /**
     * <code>Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE = 3;</code>
     */
    Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>Unk2700_FHOKHHBGPEG_NONE = 0;</code>
     */
    public static final int Unk2700_FHOKHHBGPEG_NONE_VALUE = 0;
    /**
     * <code>Unk2700_FHOKHHBGPEG_FAIL = 1;</code>
     */
    public static final int Unk2700_FHOKHHBGPEG_FAIL_VALUE = 1;
    /**
     * <code>Unk2700_FHOKHHBGPEG_SUCC = 2;</code>
     */
    public static final int Unk2700_FHOKHHBGPEG_SUCC_VALUE = 2;
    /**
     * <code>Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE = 3;</code>
     */
    public static final int Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE_VALUE = 3;


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
    public static Unk2700_FHOKHHBGPEG valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Unk2700_FHOKHHBGPEG forNumber(int value) {
      switch (value) {
        case 0: return Unk2700_FHOKHHBGPEG_NONE;
        case 1: return Unk2700_FHOKHHBGPEG_FAIL;
        case 2: return Unk2700_FHOKHHBGPEG_SUCC;
        case 3: return Unk2700_FHOKHHBGPEG_Unk2700_GGDJFCKGBGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Unk2700_FHOKHHBGPEG>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Unk2700_FHOKHHBGPEG> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Unk2700_FHOKHHBGPEG>() {
            public Unk2700_FHOKHHBGPEG findValueByNumber(int number) {
              return Unk2700_FHOKHHBGPEG.forNumber(number);
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
      return emu.grasscutter.net.newproto.Unk2700FHOKHHBGPEG.getDescriptor().getEnumTypes().get(0);
    }

    private static final Unk2700_FHOKHHBGPEG[] VALUES = values();

    public static Unk2700_FHOKHHBGPEG valueOf(
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

    private Unk2700_FHOKHHBGPEG(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Unk2700_FHOKHHBGPEG)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_FHOKHHBGPEG.proto*\234\001\n\023Unk2700_" +
      "FHOKHHBGPEG\022\034\n\030Unk2700_FHOKHHBGPEG_NONE\020" +
      "\000\022\034\n\030Unk2700_FHOKHHBGPEG_FAIL\020\001\022\034\n\030Unk27" +
      "00_FHOKHHBGPEG_SUCC\020\002\022+\n\'Unk2700_FHOKHHB" +
      "GPEG_Unk2700_GGDJFCKGBGE\020\003B\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}