// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaOpenWishNotify.proto

package emu.grasscutter.net.newproto;

public final class GachaOpenWishNotifyOuterClass {
  private GachaOpenWishNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GachaOpenWishNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GachaOpenWishNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gacha_schedule_id = 1;</code>
     * @return The gachaScheduleId.
     */
    int getGachaScheduleId();

    /**
     * <code>uint32 gacha_type = 10;</code>
     * @return The gachaType.
     */
    int getGachaType();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 1561;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GachaOpenWishNotify}
   */
  public static final class GachaOpenWishNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GachaOpenWishNotify)
      GachaOpenWishNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GachaOpenWishNotify.newBuilder() to construct.
    private GachaOpenWishNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GachaOpenWishNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GachaOpenWishNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.internal_static_GachaOpenWishNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.internal_static_GachaOpenWishNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.class, emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.Builder.class);
    }

    public static final int GACHA_SCHEDULE_ID_FIELD_NUMBER = 1;
    private int gachaScheduleId_;
    /**
     * <code>uint32 gacha_schedule_id = 1;</code>
     * @return The gachaScheduleId.
     */
    @java.lang.Override
    public int getGachaScheduleId() {
      return gachaScheduleId_;
    }

    public static final int GACHA_TYPE_FIELD_NUMBER = 10;
    private int gachaType_;
    /**
     * <code>uint32 gacha_type = 10;</code>
     * @return The gachaType.
     */
    @java.lang.Override
    public int getGachaType() {
      return gachaType_;
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
      if (gachaScheduleId_ != 0) {
        output.writeUInt32(1, gachaScheduleId_);
      }
      if (gachaType_ != 0) {
        output.writeUInt32(10, gachaType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gachaScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, gachaScheduleId_);
      }
      if (gachaType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gachaType_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify other = (emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify) obj;

      if (getGachaScheduleId()
          != other.getGachaScheduleId()) return false;
      if (getGachaType()
          != other.getGachaType()) return false;
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
      hash = (37 * hash) + GACHA_SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGachaScheduleId();
      hash = (37 * hash) + GACHA_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getGachaType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify prototype) {
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
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 1561;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GachaOpenWishNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GachaOpenWishNotify)
        emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.internal_static_GachaOpenWishNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.internal_static_GachaOpenWishNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.class, emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gachaScheduleId_ = 0;

        gachaType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.internal_static_GachaOpenWishNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify build() {
        emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify buildPartial() {
        emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify result = new emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify(this);
        result.gachaScheduleId_ = gachaScheduleId_;
        result.gachaType_ = gachaType_;
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
        if (other instanceof emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify other) {
        if (other == emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.getDefaultInstance()) return this;
        if (other.getGachaScheduleId() != 0) {
          setGachaScheduleId(other.getGachaScheduleId());
        }
        if (other.getGachaType() != 0) {
          setGachaType(other.getGachaType());
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
                gachaScheduleId_ = input.readUInt32();

                break;
              } // case 8
              case 80: {
                gachaType_ = input.readUInt32();

                break;
              } // case 80
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

      private int gachaScheduleId_ ;
      /**
       * <code>uint32 gacha_schedule_id = 1;</code>
       * @return The gachaScheduleId.
       */
      @java.lang.Override
      public int getGachaScheduleId() {
        return gachaScheduleId_;
      }
      /**
       * <code>uint32 gacha_schedule_id = 1;</code>
       * @param value The gachaScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setGachaScheduleId(int value) {
        
        gachaScheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gacha_schedule_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaScheduleId() {
        
        gachaScheduleId_ = 0;
        onChanged();
        return this;
      }

      private int gachaType_ ;
      /**
       * <code>uint32 gacha_type = 10;</code>
       * @return The gachaType.
       */
      @java.lang.Override
      public int getGachaType() {
        return gachaType_;
      }
      /**
       * <code>uint32 gacha_type = 10;</code>
       * @param value The gachaType to set.
       * @return This builder for chaining.
       */
      public Builder setGachaType(int value) {
        
        gachaType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gacha_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaType() {
        
        gachaType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GachaOpenWishNotify)
    }

    // @@protoc_insertion_point(class_scope:GachaOpenWishNotify)
    private static final emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify();
    }

    public static emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GachaOpenWishNotify>
        PARSER = new com.google.protobuf.AbstractParser<GachaOpenWishNotify>() {
      @java.lang.Override
      public GachaOpenWishNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GachaOpenWishNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GachaOpenWishNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaOpenWishNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaOpenWishNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031GachaOpenWishNotify.proto\"D\n\023GachaOpen" +
      "WishNotify\022\031\n\021gacha_schedule_id\030\001 \001(\r\022\022\n" +
      "\ngacha_type\030\n \001(\rB\036\n\034emu.grasscutter.net" +
      ".newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GachaOpenWishNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GachaOpenWishNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaOpenWishNotify_descriptor,
        new java.lang.String[] { "GachaScheduleId", "GachaType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}