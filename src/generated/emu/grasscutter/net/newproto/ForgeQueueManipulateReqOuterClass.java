// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForgeQueueManipulateReq.proto

package emu.grasscutter.net.newproto;

public final class ForgeQueueManipulateReqOuterClass {
  private ForgeQueueManipulateReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ForgeQueueManipulateReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ForgeQueueManipulateReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 forge_queue_id = 3;</code>
     * @return The forgeQueueId.
     */
    int getForgeQueueId();

    /**
     * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
     * @return The enum numeric value on the wire for manipulateType.
     */
    int getManipulateTypeValue();
    /**
     * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
     * @return The manipulateType.
     */
    emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 622;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ForgeQueueManipulateReq}
   */
  public static final class ForgeQueueManipulateReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ForgeQueueManipulateReq)
      ForgeQueueManipulateReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ForgeQueueManipulateReq.newBuilder() to construct.
    private ForgeQueueManipulateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ForgeQueueManipulateReq() {
      manipulateType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ForgeQueueManipulateReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq.class, emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq.Builder.class);
    }

    public static final int FORGE_QUEUE_ID_FIELD_NUMBER = 3;
    private int forgeQueueId_;
    /**
     * <code>uint32 forge_queue_id = 3;</code>
     * @return The forgeQueueId.
     */
    @java.lang.Override
    public int getForgeQueueId() {
      return forgeQueueId_;
    }

    public static final int MANIPULATE_TYPE_FIELD_NUMBER = 4;
    private int manipulateType_;
    /**
     * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
     * @return The enum numeric value on the wire for manipulateType.
     */
    @java.lang.Override public int getManipulateTypeValue() {
      return manipulateType_;
    }
    /**
     * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
     * @return The manipulateType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType result = emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.valueOf(manipulateType_);
      return result == null ? emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.UNRECOGNIZED : result;
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
      if (forgeQueueId_ != 0) {
        output.writeUInt32(3, forgeQueueId_);
      }
      if (manipulateType_ != emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT.getNumber()) {
        output.writeEnum(4, manipulateType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (forgeQueueId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, forgeQueueId_);
      }
      if (manipulateType_ != emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.FORGE_QUEUE_MANIPULATE_TYPE_RECEIVE_OUTPUT.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, manipulateType_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq other = (emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq) obj;

      if (getForgeQueueId()
          != other.getForgeQueueId()) return false;
      if (manipulateType_ != other.manipulateType_) return false;
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
      hash = (37 * hash) + FORGE_QUEUE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getForgeQueueId();
      hash = (37 * hash) + MANIPULATE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + manipulateType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq prototype) {
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
     *   CMD_ID = 622;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ForgeQueueManipulateReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ForgeQueueManipulateReq)
        emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq.class, emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        forgeQueueId_ = 0;

        manipulateType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.internal_static_ForgeQueueManipulateReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq build() {
        emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq buildPartial() {
        emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq result = new emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq(this);
        result.forgeQueueId_ = forgeQueueId_;
        result.manipulateType_ = manipulateType_;
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
        if (other instanceof emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq) {
          return mergeFrom((emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq other) {
        if (other == emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq.getDefaultInstance()) return this;
        if (other.getForgeQueueId() != 0) {
          setForgeQueueId(other.getForgeQueueId());
        }
        if (other.manipulateType_ != 0) {
          setManipulateTypeValue(other.getManipulateTypeValue());
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
              case 24: {
                forgeQueueId_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                manipulateType_ = input.readEnum();

                break;
              } // case 32
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

      private int forgeQueueId_ ;
      /**
       * <code>uint32 forge_queue_id = 3;</code>
       * @return The forgeQueueId.
       */
      @java.lang.Override
      public int getForgeQueueId() {
        return forgeQueueId_;
      }
      /**
       * <code>uint32 forge_queue_id = 3;</code>
       * @param value The forgeQueueId to set.
       * @return This builder for chaining.
       */
      public Builder setForgeQueueId(int value) {
        
        forgeQueueId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 forge_queue_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearForgeQueueId() {
        
        forgeQueueId_ = 0;
        onChanged();
        return this;
      }

      private int manipulateType_ = 0;
      /**
       * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
       * @return The enum numeric value on the wire for manipulateType.
       */
      @java.lang.Override public int getManipulateTypeValue() {
        return manipulateType_;
      }
      /**
       * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
       * @param value The enum numeric value on the wire for manipulateType to set.
       * @return This builder for chaining.
       */
      public Builder setManipulateTypeValue(int value) {
        
        manipulateType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
       * @return The manipulateType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType getManipulateType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType result = emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.valueOf(manipulateType_);
        return result == null ? emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
       * @param value The manipulateType to set.
       * @return This builder for chaining.
       */
      public Builder setManipulateType(emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.ForgeQueueManipulateType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        manipulateType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForgeQueueManipulateType manipulate_type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearManipulateType() {
        
        manipulateType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ForgeQueueManipulateReq)
    }

    // @@protoc_insertion_point(class_scope:ForgeQueueManipulateReq)
    private static final emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq();
    }

    public static emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ForgeQueueManipulateReq>
        PARSER = new com.google.protobuf.AbstractParser<ForgeQueueManipulateReq>() {
      @java.lang.Override
      public ForgeQueueManipulateReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ForgeQueueManipulateReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ForgeQueueManipulateReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ForgeQueueManipulateReqOuterClass.ForgeQueueManipulateReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ForgeQueueManipulateReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ForgeQueueManipulateReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ForgeQueueManipulateReq.proto\032\036ForgeQu" +
      "eueManipulateType.proto\"e\n\027ForgeQueueMan" +
      "ipulateReq\022\026\n\016forge_queue_id\030\003 \001(\r\0222\n\017ma" +
      "nipulate_type\030\004 \001(\0162\031.ForgeQueueManipula" +
      "teTypeB\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.getDescriptor(),
        });
    internal_static_ForgeQueueManipulateReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ForgeQueueManipulateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ForgeQueueManipulateReq_descriptor,
        new java.lang.String[] { "ForgeQueueId", "ManipulateType", });
    emu.grasscutter.net.newproto.ForgeQueueManipulateTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
