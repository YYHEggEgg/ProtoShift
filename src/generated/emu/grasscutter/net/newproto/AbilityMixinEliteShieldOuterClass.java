// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMixinEliteShield.proto

package emu.grasscutter.net.newproto;

public final class AbilityMixinEliteShieldOuterClass {
  private AbilityMixinEliteShieldOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMixinEliteShieldOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMixinEliteShield)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float sub_shield = 9;</code>
     * @return The subShield.
     */
    float getSubShield();
  }
  /**
   * Protobuf type {@code AbilityMixinEliteShield}
   */
  public static final class AbilityMixinEliteShield extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMixinEliteShield)
      AbilityMixinEliteShieldOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMixinEliteShield.newBuilder() to construct.
    private AbilityMixinEliteShield(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMixinEliteShield() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMixinEliteShield();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.internal_static_AbilityMixinEliteShield_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.internal_static_AbilityMixinEliteShield_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield.class, emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield.Builder.class);
    }

    public static final int SUB_SHIELD_FIELD_NUMBER = 9;
    private float subShield_;
    /**
     * <code>float sub_shield = 9;</code>
     * @return The subShield.
     */
    @java.lang.Override
    public float getSubShield() {
      return subShield_;
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
      if (java.lang.Float.floatToRawIntBits(subShield_) != 0) {
        output.writeFloat(9, subShield_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(subShield_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, subShield_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield other = (emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield) obj;

      if (java.lang.Float.floatToIntBits(getSubShield())
          != java.lang.Float.floatToIntBits(
              other.getSubShield())) return false;
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
      hash = (37 * hash) + SUB_SHIELD_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getSubShield());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield prototype) {
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
     * Protobuf type {@code AbilityMixinEliteShield}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMixinEliteShield)
        emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShieldOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.internal_static_AbilityMixinEliteShield_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.internal_static_AbilityMixinEliteShield_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield.class, emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        subShield_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.internal_static_AbilityMixinEliteShield_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield build() {
        emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield buildPartial() {
        emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield result = new emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield(this);
        result.subShield_ = subShield_;
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
        if (other instanceof emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield) {
          return mergeFrom((emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield other) {
        if (other == emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield.getDefaultInstance()) return this;
        if (other.getSubShield() != 0F) {
          setSubShield(other.getSubShield());
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
              case 77: {
                subShield_ = input.readFloat();

                break;
              } // case 77
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

      private float subShield_ ;
      /**
       * <code>float sub_shield = 9;</code>
       * @return The subShield.
       */
      @java.lang.Override
      public float getSubShield() {
        return subShield_;
      }
      /**
       * <code>float sub_shield = 9;</code>
       * @param value The subShield to set.
       * @return This builder for chaining.
       */
      public Builder setSubShield(float value) {
        
        subShield_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float sub_shield = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubShield() {
        
        subShield_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AbilityMixinEliteShield)
    }

    // @@protoc_insertion_point(class_scope:AbilityMixinEliteShield)
    private static final emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield();
    }

    public static emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMixinEliteShield>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMixinEliteShield>() {
      @java.lang.Override
      public AbilityMixinEliteShield parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityMixinEliteShield> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMixinEliteShield> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.AbilityMixinEliteShieldOuterClass.AbilityMixinEliteShield getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMixinEliteShield_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMixinEliteShield_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AbilityMixinEliteShield.proto\"-\n\027Abili" +
      "tyMixinEliteShield\022\022\n\nsub_shield\030\t \001(\002B\036" +
      "\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMixinEliteShield_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMixinEliteShield_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMixinEliteShield_descriptor,
        new java.lang.String[] { "SubShield", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
