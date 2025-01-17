// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AreaPlayInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class AreaPlayInfoNotifyOuterClass {
  private AreaPlayInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AreaPlayInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AreaPlayInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 detail_play_type = 14;</code>
     * @return The detailPlayType.
     */
    int getDetailPlayType();

    /**
     * <code>.AreaPlayType area_play_type = 11;</code>
     * @return The enum numeric value on the wire for areaPlayType.
     */
    int getAreaPlayTypeValue();
    /**
     * <code>.AreaPlayType area_play_type = 11;</code>
     * @return The areaPlayType.
     */
    emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType getAreaPlayType();
  }
  /**
   * <pre>
   * CmdId: 3323
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code AreaPlayInfoNotify}
   */
  public static final class AreaPlayInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AreaPlayInfoNotify)
      AreaPlayInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AreaPlayInfoNotify.newBuilder() to construct.
    private AreaPlayInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AreaPlayInfoNotify() {
      areaPlayType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AreaPlayInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.internal_static_AreaPlayInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.internal_static_AreaPlayInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify.class, emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify.Builder.class);
    }

    public static final int DETAIL_PLAY_TYPE_FIELD_NUMBER = 14;
    private int detailPlayType_;
    /**
     * <code>uint32 detail_play_type = 14;</code>
     * @return The detailPlayType.
     */
    @java.lang.Override
    public int getDetailPlayType() {
      return detailPlayType_;
    }

    public static final int AREA_PLAY_TYPE_FIELD_NUMBER = 11;
    private int areaPlayType_;
    /**
     * <code>.AreaPlayType area_play_type = 11;</code>
     * @return The enum numeric value on the wire for areaPlayType.
     */
    @java.lang.Override public int getAreaPlayTypeValue() {
      return areaPlayType_;
    }
    /**
     * <code>.AreaPlayType area_play_type = 11;</code>
     * @return The areaPlayType.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType getAreaPlayType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType result = emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType.valueOf(areaPlayType_);
      return result == null ? emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType.UNRECOGNIZED : result;
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
      if (areaPlayType_ != emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType.AREA_PLAY_TYPE_NONE.getNumber()) {
        output.writeEnum(11, areaPlayType_);
      }
      if (detailPlayType_ != 0) {
        output.writeUInt32(14, detailPlayType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (areaPlayType_ != emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType.AREA_PLAY_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, areaPlayType_);
      }
      if (detailPlayType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, detailPlayType_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify other = (emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify) obj;

      if (getDetailPlayType()
          != other.getDetailPlayType()) return false;
      if (areaPlayType_ != other.areaPlayType_) return false;
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
      hash = (37 * hash) + DETAIL_PLAY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getDetailPlayType();
      hash = (37 * hash) + AREA_PLAY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + areaPlayType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify prototype) {
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
     * CmdId: 3323
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code AreaPlayInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AreaPlayInfoNotify)
        emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.internal_static_AreaPlayInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.internal_static_AreaPlayInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify.class, emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        detailPlayType_ = 0;

        areaPlayType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.internal_static_AreaPlayInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify build() {
        emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify result = new emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify(this);
        result.detailPlayType_ = detailPlayType_;
        result.areaPlayType_ = areaPlayType_;
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
        if (other instanceof emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify.getDefaultInstance()) return this;
        if (other.getDetailPlayType() != 0) {
          setDetailPlayType(other.getDetailPlayType());
        }
        if (other.areaPlayType_ != 0) {
          setAreaPlayTypeValue(other.getAreaPlayTypeValue());
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
              case 88: {
                areaPlayType_ = input.readEnum();

                break;
              } // case 88
              case 112: {
                detailPlayType_ = input.readUInt32();

                break;
              } // case 112
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

      private int detailPlayType_ ;
      /**
       * <code>uint32 detail_play_type = 14;</code>
       * @return The detailPlayType.
       */
      @java.lang.Override
      public int getDetailPlayType() {
        return detailPlayType_;
      }
      /**
       * <code>uint32 detail_play_type = 14;</code>
       * @param value The detailPlayType to set.
       * @return This builder for chaining.
       */
      public Builder setDetailPlayType(int value) {
        
        detailPlayType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 detail_play_type = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDetailPlayType() {
        
        detailPlayType_ = 0;
        onChanged();
        return this;
      }

      private int areaPlayType_ = 0;
      /**
       * <code>.AreaPlayType area_play_type = 11;</code>
       * @return The enum numeric value on the wire for areaPlayType.
       */
      @java.lang.Override public int getAreaPlayTypeValue() {
        return areaPlayType_;
      }
      /**
       * <code>.AreaPlayType area_play_type = 11;</code>
       * @param value The enum numeric value on the wire for areaPlayType to set.
       * @return This builder for chaining.
       */
      public Builder setAreaPlayTypeValue(int value) {
        
        areaPlayType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.AreaPlayType area_play_type = 11;</code>
       * @return The areaPlayType.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType getAreaPlayType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType result = emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType.valueOf(areaPlayType_);
        return result == null ? emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType.UNRECOGNIZED : result;
      }
      /**
       * <code>.AreaPlayType area_play_type = 11;</code>
       * @param value The areaPlayType to set.
       * @return This builder for chaining.
       */
      public Builder setAreaPlayType(emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.AreaPlayType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        areaPlayType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AreaPlayType area_play_type = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaPlayType() {
        
        areaPlayType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AreaPlayInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:AreaPlayInfoNotify)
    private static final emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AreaPlayInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<AreaPlayInfoNotify>() {
      @java.lang.Override
      public AreaPlayInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AreaPlayInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AreaPlayInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.AreaPlayInfoNotifyOuterClass.AreaPlayInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AreaPlayInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AreaPlayInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030AreaPlayInfoNotify.proto\032\022AreaPlayType" +
      ".proto\"U\n\022AreaPlayInfoNotify\022\030\n\020detail_p" +
      "lay_type\030\016 \001(\r\022%\n\016area_play_type\030\013 \001(\0162\r" +
      ".AreaPlayTypeB\036\n\034emu.grasscutter.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.getDescriptor(),
        });
    internal_static_AreaPlayInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AreaPlayInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AreaPlayInfoNotify_descriptor,
        new java.lang.String[] { "DetailPlayType", "AreaPlayType", });
    emu.grasscutter.net.oldproto.AreaPlayTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
