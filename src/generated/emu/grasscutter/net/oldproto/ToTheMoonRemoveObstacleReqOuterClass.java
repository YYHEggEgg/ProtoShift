// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ToTheMoonRemoveObstacleReq.proto

package emu.grasscutter.net.oldproto;

public final class ToTheMoonRemoveObstacleReqOuterClass {
  private ToTheMoonRemoveObstacleReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ToTheMoonRemoveObstacleReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ToTheMoonRemoveObstacleReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 handle = 12;</code>
     * @return The handle.
     */
    int getHandle();

    /**
     * <code>uint32 scene_id = 10;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>int32 query_id = 11;</code>
     * @return The queryId.
     */
    int getQueryId();
  }
  /**
   * <pre>
   * CmdId: 6190
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ToTheMoonRemoveObstacleReq}
   */
  public static final class ToTheMoonRemoveObstacleReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ToTheMoonRemoveObstacleReq)
      ToTheMoonRemoveObstacleReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ToTheMoonRemoveObstacleReq.newBuilder() to construct.
    private ToTheMoonRemoveObstacleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ToTheMoonRemoveObstacleReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ToTheMoonRemoveObstacleReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.class, emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ToTheMoonRemoveObstacleReq.ObstacleType}
     */
    public enum ObstacleType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>OBSTACLE_TYPE_BOX = 0;</code>
       */
      OBSTACLE_TYPE_BOX(0),
      /**
       * <code>OBSTACLE_TYPE_CAPSULE = 1;</code>
       */
      OBSTACLE_TYPE_CAPSULE(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>OBSTACLE_TYPE_BOX = 0;</code>
       */
      public static final int OBSTACLE_TYPE_BOX_VALUE = 0;
      /**
       * <code>OBSTACLE_TYPE_CAPSULE = 1;</code>
       */
      public static final int OBSTACLE_TYPE_CAPSULE_VALUE = 1;


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
      public static ObstacleType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ObstacleType forNumber(int value) {
        switch (value) {
          case 0: return OBSTACLE_TYPE_BOX;
          case 1: return OBSTACLE_TYPE_CAPSULE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ObstacleType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ObstacleType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ObstacleType>() {
              public ObstacleType findValueByNumber(int number) {
                return ObstacleType.forNumber(number);
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
        return emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final ObstacleType[] VALUES = values();

      public static ObstacleType valueOf(
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

      private ObstacleType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ToTheMoonRemoveObstacleReq.ObstacleType)
    }

    public static final int HANDLE_FIELD_NUMBER = 12;
    private int handle_;
    /**
     * <code>int32 handle = 12;</code>
     * @return The handle.
     */
    @java.lang.Override
    public int getHandle() {
      return handle_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 10;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 10;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int QUERY_ID_FIELD_NUMBER = 11;
    private int queryId_;
    /**
     * <code>int32 query_id = 11;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(10, sceneId_);
      }
      if (queryId_ != 0) {
        output.writeInt32(11, queryId_);
      }
      if (handle_ != 0) {
        output.writeInt32(12, handle_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, sceneId_);
      }
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, queryId_);
      }
      if (handle_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, handle_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq other = (emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq) obj;

      if (getHandle()
          != other.getHandle()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getQueryId()
          != other.getQueryId()) return false;
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
      hash = (37 * hash) + HANDLE_FIELD_NUMBER;
      hash = (53 * hash) + getHandle();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq prototype) {
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
     * CmdId: 6190
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ToTheMoonRemoveObstacleReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ToTheMoonRemoveObstacleReq)
        emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.class, emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        handle_ = 0;

        sceneId_ = 0;

        queryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq build() {
        emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq buildPartial() {
        emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq result = new emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq(this);
        result.handle_ = handle_;
        result.sceneId_ = sceneId_;
        result.queryId_ = queryId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq other) {
        if (other == emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.getDefaultInstance()) return this;
        if (other.getHandle() != 0) {
          setHandle(other.getHandle());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
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
              case 80: {
                sceneId_ = input.readUInt32();

                break;
              } // case 80
              case 88: {
                queryId_ = input.readInt32();

                break;
              } // case 88
              case 96: {
                handle_ = input.readInt32();

                break;
              } // case 96
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

      private int handle_ ;
      /**
       * <code>int32 handle = 12;</code>
       * @return The handle.
       */
      @java.lang.Override
      public int getHandle() {
        return handle_;
      }
      /**
       * <code>int32 handle = 12;</code>
       * @param value The handle to set.
       * @return This builder for chaining.
       */
      public Builder setHandle(int value) {
        
        handle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 handle = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearHandle() {
        
        handle_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 10;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 10;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int queryId_ ;
      /**
       * <code>int32 query_id = 11;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 query_id = 11;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 query_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ToTheMoonRemoveObstacleReq)
    }

    // @@protoc_insertion_point(class_scope:ToTheMoonRemoveObstacleReq)
    private static final emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq();
    }

    public static emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ToTheMoonRemoveObstacleReq>
        PARSER = new com.google.protobuf.AbstractParser<ToTheMoonRemoveObstacleReq>() {
      @java.lang.Override
      public ToTheMoonRemoveObstacleReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ToTheMoonRemoveObstacleReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ToTheMoonRemoveObstacleReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ToTheMoonRemoveObstacleReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ToTheMoonRemoveObstacleReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ToTheMoonRemoveObstacleReq.proto\"\222\001\n\032T" +
      "oTheMoonRemoveObstacleReq\022\016\n\006handle\030\014 \001(" +
      "\005\022\020\n\010scene_id\030\n \001(\r\022\020\n\010query_id\030\013 \001(\005\"@\n" +
      "\014ObstacleType\022\025\n\021OBSTACLE_TYPE_BOX\020\000\022\031\n\025" +
      "OBSTACLE_TYPE_CAPSULE\020\001B\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ToTheMoonRemoveObstacleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ToTheMoonRemoveObstacleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ToTheMoonRemoveObstacleReq_descriptor,
        new java.lang.String[] { "Handle", "SceneId", "QueryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}