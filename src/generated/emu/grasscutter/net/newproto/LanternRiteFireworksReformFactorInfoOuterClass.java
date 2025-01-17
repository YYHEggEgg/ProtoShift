// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteFireworksReformFactorInfo.proto

package emu.grasscutter.net.newproto;

public final class LanternRiteFireworksReformFactorInfoOuterClass {
  private LanternRiteFireworksReformFactorInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteFireworksReformFactorInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteFireworksReformFactorInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 factor_value = 12;</code>
     * @return The factorValue.
     */
    int getFactorValue();

    /**
     * <code>uint32 factor_id = 15;</code>
     * @return The factorId.
     */
    int getFactorId();
  }
  /**
   * Protobuf type {@code LanternRiteFireworksReformFactorInfo}
   */
  public static final class LanternRiteFireworksReformFactorInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteFireworksReformFactorInfo)
      LanternRiteFireworksReformFactorInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteFireworksReformFactorInfo.newBuilder() to construct.
    private LanternRiteFireworksReformFactorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteFireworksReformFactorInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteFireworksReformFactorInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.internal_static_LanternRiteFireworksReformFactorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.internal_static_LanternRiteFireworksReformFactorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo.class, emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo.Builder.class);
    }

    public static final int FACTOR_VALUE_FIELD_NUMBER = 12;
    private int factorValue_;
    /**
     * <code>uint32 factor_value = 12;</code>
     * @return The factorValue.
     */
    @java.lang.Override
    public int getFactorValue() {
      return factorValue_;
    }

    public static final int FACTOR_ID_FIELD_NUMBER = 15;
    private int factorId_;
    /**
     * <code>uint32 factor_id = 15;</code>
     * @return The factorId.
     */
    @java.lang.Override
    public int getFactorId() {
      return factorId_;
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
      if (factorValue_ != 0) {
        output.writeUInt32(12, factorValue_);
      }
      if (factorId_ != 0) {
        output.writeUInt32(15, factorId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (factorValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, factorValue_);
      }
      if (factorId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, factorId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo other = (emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo) obj;

      if (getFactorValue()
          != other.getFactorValue()) return false;
      if (getFactorId()
          != other.getFactorId()) return false;
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
      hash = (37 * hash) + FACTOR_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getFactorValue();
      hash = (37 * hash) + FACTOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFactorId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo prototype) {
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
     * Protobuf type {@code LanternRiteFireworksReformFactorInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteFireworksReformFactorInfo)
        emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.internal_static_LanternRiteFireworksReformFactorInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.internal_static_LanternRiteFireworksReformFactorInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo.class, emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        factorValue_ = 0;

        factorId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.internal_static_LanternRiteFireworksReformFactorInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo build() {
        emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo buildPartial() {
        emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo result = new emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo(this);
        result.factorValue_ = factorValue_;
        result.factorId_ = factorId_;
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
        if (other instanceof emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo) {
          return mergeFrom((emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo other) {
        if (other == emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo.getDefaultInstance()) return this;
        if (other.getFactorValue() != 0) {
          setFactorValue(other.getFactorValue());
        }
        if (other.getFactorId() != 0) {
          setFactorId(other.getFactorId());
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
              case 96: {
                factorValue_ = input.readUInt32();

                break;
              } // case 96
              case 120: {
                factorId_ = input.readUInt32();

                break;
              } // case 120
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

      private int factorValue_ ;
      /**
       * <code>uint32 factor_value = 12;</code>
       * @return The factorValue.
       */
      @java.lang.Override
      public int getFactorValue() {
        return factorValue_;
      }
      /**
       * <code>uint32 factor_value = 12;</code>
       * @param value The factorValue to set.
       * @return This builder for chaining.
       */
      public Builder setFactorValue(int value) {
        
        factorValue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 factor_value = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFactorValue() {
        
        factorValue_ = 0;
        onChanged();
        return this;
      }

      private int factorId_ ;
      /**
       * <code>uint32 factor_id = 15;</code>
       * @return The factorId.
       */
      @java.lang.Override
      public int getFactorId() {
        return factorId_;
      }
      /**
       * <code>uint32 factor_id = 15;</code>
       * @param value The factorId to set.
       * @return This builder for chaining.
       */
      public Builder setFactorId(int value) {
        
        factorId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 factor_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFactorId() {
        
        factorId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteFireworksReformFactorInfo)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteFireworksReformFactorInfo)
    private static final emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo();
    }

    public static emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteFireworksReformFactorInfo>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteFireworksReformFactorInfo>() {
      @java.lang.Override
      public LanternRiteFireworksReformFactorInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<LanternRiteFireworksReformFactorInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteFireworksReformFactorInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.LanternRiteFireworksReformFactorInfoOuterClass.LanternRiteFireworksReformFactorInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteFireworksReformFactorInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteFireworksReformFactorInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*LanternRiteFireworksReformFactorInfo.p" +
      "roto\"O\n$LanternRiteFireworksReformFactor" +
      "Info\022\024\n\014factor_value\030\014 \001(\r\022\021\n\tfactor_id\030" +
      "\017 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LanternRiteFireworksReformFactorInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteFireworksReformFactorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteFireworksReformFactorInfo_descriptor,
        new java.lang.String[] { "FactorValue", "FactorId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
