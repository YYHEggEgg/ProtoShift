// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonEntryInfoReq.proto

package emu.grasscutter.net.oldproto;

public final class DungeonEntryInfoReqOuterClass {
  private DungeonEntryInfoReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonEntryInfoReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonEntryInfoReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 point_id = 2;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair> 
        getScenePointIdListList();
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair getScenePointIdList(int index);
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    int getScenePointIdListCount();
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getScenePointIdListOrBuilderList();
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder getScenePointIdListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 972
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code DungeonEntryInfoReq}
   */
  public static final class DungeonEntryInfoReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonEntryInfoReq)
      DungeonEntryInfoReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonEntryInfoReq.newBuilder() to construct.
    private DungeonEntryInfoReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonEntryInfoReq() {
      scenePointIdList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonEntryInfoReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.internal_static_DungeonEntryInfoReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.internal_static_DungeonEntryInfoReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq.class, emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq.Builder.class);
    }

    public static final int POINT_ID_FIELD_NUMBER = 2;
    private int pointId_;
    /**
     * <code>uint32 point_id = 2;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 9;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int SCENE_POINT_ID_LIST_FIELD_NUMBER = 4;
    private java.util.List<emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair> scenePointIdList_;
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair> getScenePointIdListList() {
      return scenePointIdList_;
    }
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getScenePointIdListOrBuilderList() {
      return scenePointIdList_;
    }
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    @java.lang.Override
    public int getScenePointIdListCount() {
      return scenePointIdList_.size();
    }
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair getScenePointIdList(int index) {
      return scenePointIdList_.get(index);
    }
    /**
     * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder getScenePointIdListOrBuilder(
        int index) {
      return scenePointIdList_.get(index);
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
      if (pointId_ != 0) {
        output.writeUInt32(2, pointId_);
      }
      for (int i = 0; i < scenePointIdList_.size(); i++) {
        output.writeMessage(4, scenePointIdList_.get(i));
      }
      if (sceneId_ != 0) {
        output.writeUInt32(9, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, pointId_);
      }
      for (int i = 0; i < scenePointIdList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, scenePointIdList_.get(i));
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, sceneId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq other = (emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq) obj;

      if (getPointId()
          != other.getPointId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (!getScenePointIdListList()
          .equals(other.getScenePointIdListList())) return false;
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
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      if (getScenePointIdListCount() > 0) {
        hash = (37 * hash) + SCENE_POINT_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getScenePointIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq prototype) {
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
     * CmdId: 972
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code DungeonEntryInfoReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonEntryInfoReq)
        emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.internal_static_DungeonEntryInfoReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.internal_static_DungeonEntryInfoReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq.class, emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        pointId_ = 0;

        sceneId_ = 0;

        if (scenePointIdListBuilder_ == null) {
          scenePointIdList_ = java.util.Collections.emptyList();
        } else {
          scenePointIdList_ = null;
          scenePointIdListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.internal_static_DungeonEntryInfoReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq build() {
        emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq buildPartial() {
        emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq result = new emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq(this);
        int from_bitField0_ = bitField0_;
        result.pointId_ = pointId_;
        result.sceneId_ = sceneId_;
        if (scenePointIdListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            scenePointIdList_ = java.util.Collections.unmodifiableList(scenePointIdList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.scenePointIdList_ = scenePointIdList_;
        } else {
          result.scenePointIdList_ = scenePointIdListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq) {
          return mergeFrom((emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq other) {
        if (other == emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq.getDefaultInstance()) return this;
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (scenePointIdListBuilder_ == null) {
          if (!other.scenePointIdList_.isEmpty()) {
            if (scenePointIdList_.isEmpty()) {
              scenePointIdList_ = other.scenePointIdList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureScenePointIdListIsMutable();
              scenePointIdList_.addAll(other.scenePointIdList_);
            }
            onChanged();
          }
        } else {
          if (!other.scenePointIdList_.isEmpty()) {
            if (scenePointIdListBuilder_.isEmpty()) {
              scenePointIdListBuilder_.dispose();
              scenePointIdListBuilder_ = null;
              scenePointIdList_ = other.scenePointIdList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              scenePointIdListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getScenePointIdListFieldBuilder() : null;
            } else {
              scenePointIdListBuilder_.addAllMessages(other.scenePointIdList_);
            }
          }
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
              case 16: {
                pointId_ = input.readUInt32();

                break;
              } // case 16
              case 34: {
                emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.parser(),
                        extensionRegistry);
                if (scenePointIdListBuilder_ == null) {
                  ensureScenePointIdListIsMutable();
                  scenePointIdList_.add(m);
                } else {
                  scenePointIdListBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 72: {
                sceneId_ = input.readUInt32();

                break;
              } // case 72
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
      private int bitField0_;

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 2;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 2;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair> scenePointIdList_ =
        java.util.Collections.emptyList();
      private void ensureScenePointIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          scenePointIdList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair>(scenePointIdList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> scenePointIdListBuilder_;

      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair> getScenePointIdListList() {
        if (scenePointIdListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(scenePointIdList_);
        } else {
          return scenePointIdListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public int getScenePointIdListCount() {
        if (scenePointIdListBuilder_ == null) {
          return scenePointIdList_.size();
        } else {
          return scenePointIdListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair getScenePointIdList(int index) {
        if (scenePointIdListBuilder_ == null) {
          return scenePointIdList_.get(index);
        } else {
          return scenePointIdListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder setScenePointIdList(
          int index, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair value) {
        if (scenePointIdListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureScenePointIdListIsMutable();
          scenePointIdList_.set(index, value);
          onChanged();
        } else {
          scenePointIdListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder setScenePointIdList(
          int index, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (scenePointIdListBuilder_ == null) {
          ensureScenePointIdListIsMutable();
          scenePointIdList_.set(index, builderForValue.build());
          onChanged();
        } else {
          scenePointIdListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder addScenePointIdList(emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair value) {
        if (scenePointIdListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureScenePointIdListIsMutable();
          scenePointIdList_.add(value);
          onChanged();
        } else {
          scenePointIdListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder addScenePointIdList(
          int index, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair value) {
        if (scenePointIdListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureScenePointIdListIsMutable();
          scenePointIdList_.add(index, value);
          onChanged();
        } else {
          scenePointIdListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder addScenePointIdList(
          emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (scenePointIdListBuilder_ == null) {
          ensureScenePointIdListIsMutable();
          scenePointIdList_.add(builderForValue.build());
          onChanged();
        } else {
          scenePointIdListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder addScenePointIdList(
          int index, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (scenePointIdListBuilder_ == null) {
          ensureScenePointIdListIsMutable();
          scenePointIdList_.add(index, builderForValue.build());
          onChanged();
        } else {
          scenePointIdListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder addAllScenePointIdList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair> values) {
        if (scenePointIdListBuilder_ == null) {
          ensureScenePointIdListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, scenePointIdList_);
          onChanged();
        } else {
          scenePointIdListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder clearScenePointIdList() {
        if (scenePointIdListBuilder_ == null) {
          scenePointIdList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          scenePointIdListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public Builder removeScenePointIdList(int index) {
        if (scenePointIdListBuilder_ == null) {
          ensureScenePointIdListIsMutable();
          scenePointIdList_.remove(index);
          onChanged();
        } else {
          scenePointIdListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder getScenePointIdListBuilder(
          int index) {
        return getScenePointIdListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder getScenePointIdListOrBuilder(
          int index) {
        if (scenePointIdListBuilder_ == null) {
          return scenePointIdList_.get(index);  } else {
          return scenePointIdListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
           getScenePointIdListOrBuilderList() {
        if (scenePointIdListBuilder_ != null) {
          return scenePointIdListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(scenePointIdList_);
        }
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder addScenePointIdListBuilder() {
        return getScenePointIdListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder addScenePointIdListBuilder(
          int index) {
        return getScenePointIdListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair scene_point_id_list = 4;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder> 
           getScenePointIdListBuilderList() {
        return getScenePointIdListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
          getScenePointIdListFieldBuilder() {
        if (scenePointIdListBuilder_ == null) {
          scenePointIdListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder>(
                  scenePointIdList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          scenePointIdList_ = null;
        }
        return scenePointIdListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DungeonEntryInfoReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonEntryInfoReq)
    private static final emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq();
    }

    public static emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonEntryInfoReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonEntryInfoReq>() {
      @java.lang.Override
      public DungeonEntryInfoReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonEntryInfoReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonEntryInfoReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.DungeonEntryInfoReqOuterClass.DungeonEntryInfoReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonEntryInfoReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonEntryInfoReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031DungeonEntryInfoReq.proto\032\020Uint32Pair." +
      "proto\"c\n\023DungeonEntryInfoReq\022\020\n\010point_id" +
      "\030\002 \001(\r\022\020\n\010scene_id\030\t \001(\r\022(\n\023scene_point_" +
      "id_list\030\004 \003(\0132\013.Uint32PairB\036\n\034emu.grassc" +
      "utter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.Uint32PairOuterClass.getDescriptor(),
        });
    internal_static_DungeonEntryInfoReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonEntryInfoReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonEntryInfoReq_descriptor,
        new java.lang.String[] { "PointId", "SceneId", "ScenePointIdList", });
    emu.grasscutter.net.oldproto.Uint32PairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}