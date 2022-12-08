// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerGetFloorStarRewardReq.proto

package emu.grasscutter.net.oldproto;

public final class TowerGetFloorStarRewardReqOuterClass {
  private TowerGetFloorStarRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerGetFloorStarRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerGetFloorStarRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 floor_id = 15;</code>
     * @return The floorId.
     */
    int getFloorId();
  }
  /**
   * <pre>
   * CmdId: 2404
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code TowerGetFloorStarRewardReq}
   */
  public static final class TowerGetFloorStarRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerGetFloorStarRewardReq)
      TowerGetFloorStarRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerGetFloorStarRewardReq.newBuilder() to construct.
    private TowerGetFloorStarRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerGetFloorStarRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerGetFloorStarRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.internal_static_TowerGetFloorStarRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.internal_static_TowerGetFloorStarRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq.class, emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq.Builder.class);
    }

    public static final int FLOOR_ID_FIELD_NUMBER = 15;
    private int floorId_;
    /**
     * <code>uint32 floor_id = 15;</code>
     * @return The floorId.
     */
    @java.lang.Override
    public int getFloorId() {
      return floorId_;
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
      if (floorId_ != 0) {
        output.writeUInt32(15, floorId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (floorId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, floorId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq other = (emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq) obj;

      if (getFloorId()
          != other.getFloorId()) return false;
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
      hash = (37 * hash) + FLOOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFloorId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq prototype) {
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
     * CmdId: 2404
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code TowerGetFloorStarRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerGetFloorStarRewardReq)
        emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.internal_static_TowerGetFloorStarRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.internal_static_TowerGetFloorStarRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq.class, emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        floorId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.internal_static_TowerGetFloorStarRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq build() {
        emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq buildPartial() {
        emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq result = new emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq(this);
        result.floorId_ = floorId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq other) {
        if (other == emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq.getDefaultInstance()) return this;
        if (other.getFloorId() != 0) {
          setFloorId(other.getFloorId());
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
              case 120: {
                floorId_ = input.readUInt32();

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

      private int floorId_ ;
      /**
       * <code>uint32 floor_id = 15;</code>
       * @return The floorId.
       */
      @java.lang.Override
      public int getFloorId() {
        return floorId_;
      }
      /**
       * <code>uint32 floor_id = 15;</code>
       * @param value The floorId to set.
       * @return This builder for chaining.
       */
      public Builder setFloorId(int value) {
        
        floorId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 floor_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloorId() {
        
        floorId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerGetFloorStarRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TowerGetFloorStarRewardReq)
    private static final emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq();
    }

    public static emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerGetFloorStarRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TowerGetFloorStarRewardReq>() {
      @java.lang.Override
      public TowerGetFloorStarRewardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TowerGetFloorStarRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerGetFloorStarRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.TowerGetFloorStarRewardReqOuterClass.TowerGetFloorStarRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerGetFloorStarRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerGetFloorStarRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n TowerGetFloorStarRewardReq.proto\".\n\032To" +
      "werGetFloorStarRewardReq\022\020\n\010floor_id\030\017 \001" +
      "(\rB\036\n\034emu.grasscutter.net.oldprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerGetFloorStarRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerGetFloorStarRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerGetFloorStarRewardReq_descriptor,
        new java.lang.String[] { "FloorId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}