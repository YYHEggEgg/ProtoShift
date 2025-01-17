// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGOperationReplay.proto

package emu.grasscutter.net.oldproto;

public final class GCGOperationReplayOuterClass {
  private GCGOperationReplayOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGOperationReplayOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGOperationReplay)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 game_id = 1;</code>
     * @return The gameId.
     */
    int getGameId();

    /**
     * <code>uint32 seed = 11;</code>
     * @return The seed.
     */
    int getSeed();

    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData> 
        getOperationDataListList();
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData getOperationDataList(int index);
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    int getOperationDataListCount();
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder> 
        getOperationDataListOrBuilderList();
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder getOperationDataListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GCGOperationReplay}
   */
  public static final class GCGOperationReplay extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGOperationReplay)
      GCGOperationReplayOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGOperationReplay.newBuilder() to construct.
    private GCGOperationReplay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGOperationReplay() {
      operationDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGOperationReplay();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.internal_static_GCGOperationReplay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.internal_static_GCGOperationReplay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay.class, emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay.Builder.class);
    }

    public static final int GAME_ID_FIELD_NUMBER = 1;
    private int gameId_;
    /**
     * <code>uint32 game_id = 1;</code>
     * @return The gameId.
     */
    @java.lang.Override
    public int getGameId() {
      return gameId_;
    }

    public static final int SEED_FIELD_NUMBER = 11;
    private int seed_;
    /**
     * <code>uint32 seed = 11;</code>
     * @return The seed.
     */
    @java.lang.Override
    public int getSeed() {
      return seed_;
    }

    public static final int OPERATION_DATA_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData> operationDataList_;
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData> getOperationDataListList() {
      return operationDataList_;
    }
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder> 
        getOperationDataListOrBuilderList() {
      return operationDataList_;
    }
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    @java.lang.Override
    public int getOperationDataListCount() {
      return operationDataList_.size();
    }
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData getOperationDataList(int index) {
      return operationDataList_.get(index);
    }
    /**
     * <code>repeated .GCGOperationData operation_data_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder getOperationDataListOrBuilder(
        int index) {
      return operationDataList_.get(index);
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
      if (gameId_ != 0) {
        output.writeUInt32(1, gameId_);
      }
      for (int i = 0; i < operationDataList_.size(); i++) {
        output.writeMessage(9, operationDataList_.get(i));
      }
      if (seed_ != 0) {
        output.writeUInt32(11, seed_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, gameId_);
      }
      for (int i = 0; i < operationDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, operationDataList_.get(i));
      }
      if (seed_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, seed_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay other = (emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay) obj;

      if (getGameId()
          != other.getGameId()) return false;
      if (getSeed()
          != other.getSeed()) return false;
      if (!getOperationDataListList()
          .equals(other.getOperationDataListList())) return false;
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
      hash = (37 * hash) + GAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGameId();
      hash = (37 * hash) + SEED_FIELD_NUMBER;
      hash = (53 * hash) + getSeed();
      if (getOperationDataListCount() > 0) {
        hash = (37 * hash) + OPERATION_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOperationDataListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay prototype) {
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
     * Protobuf type {@code GCGOperationReplay}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGOperationReplay)
        emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplayOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.internal_static_GCGOperationReplay_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.internal_static_GCGOperationReplay_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay.class, emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gameId_ = 0;

        seed_ = 0;

        if (operationDataListBuilder_ == null) {
          operationDataList_ = java.util.Collections.emptyList();
        } else {
          operationDataList_ = null;
          operationDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.internal_static_GCGOperationReplay_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay build() {
        emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay buildPartial() {
        emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay result = new emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay(this);
        int from_bitField0_ = bitField0_;
        result.gameId_ = gameId_;
        result.seed_ = seed_;
        if (operationDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            operationDataList_ = java.util.Collections.unmodifiableList(operationDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.operationDataList_ = operationDataList_;
        } else {
          result.operationDataList_ = operationDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay) {
          return mergeFrom((emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay other) {
        if (other == emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay.getDefaultInstance()) return this;
        if (other.getGameId() != 0) {
          setGameId(other.getGameId());
        }
        if (other.getSeed() != 0) {
          setSeed(other.getSeed());
        }
        if (operationDataListBuilder_ == null) {
          if (!other.operationDataList_.isEmpty()) {
            if (operationDataList_.isEmpty()) {
              operationDataList_ = other.operationDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOperationDataListIsMutable();
              operationDataList_.addAll(other.operationDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.operationDataList_.isEmpty()) {
            if (operationDataListBuilder_.isEmpty()) {
              operationDataListBuilder_.dispose();
              operationDataListBuilder_ = null;
              operationDataList_ = other.operationDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              operationDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOperationDataListFieldBuilder() : null;
            } else {
              operationDataListBuilder_.addAllMessages(other.operationDataList_);
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
              case 8: {
                gameId_ = input.readUInt32();

                break;
              } // case 8
              case 74: {
                emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.parser(),
                        extensionRegistry);
                if (operationDataListBuilder_ == null) {
                  ensureOperationDataListIsMutable();
                  operationDataList_.add(m);
                } else {
                  operationDataListBuilder_.addMessage(m);
                }
                break;
              } // case 74
              case 88: {
                seed_ = input.readUInt32();

                break;
              } // case 88
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

      private int gameId_ ;
      /**
       * <code>uint32 game_id = 1;</code>
       * @return The gameId.
       */
      @java.lang.Override
      public int getGameId() {
        return gameId_;
      }
      /**
       * <code>uint32 game_id = 1;</code>
       * @param value The gameId to set.
       * @return This builder for chaining.
       */
      public Builder setGameId(int value) {
        
        gameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 game_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameId() {
        
        gameId_ = 0;
        onChanged();
        return this;
      }

      private int seed_ ;
      /**
       * <code>uint32 seed = 11;</code>
       * @return The seed.
       */
      @java.lang.Override
      public int getSeed() {
        return seed_;
      }
      /**
       * <code>uint32 seed = 11;</code>
       * @param value The seed to set.
       * @return This builder for chaining.
       */
      public Builder setSeed(int value) {
        
        seed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seed = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeed() {
        
        seed_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData> operationDataList_ =
        java.util.Collections.emptyList();
      private void ensureOperationDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          operationDataList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData>(operationDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder> operationDataListBuilder_;

      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData> getOperationDataListList() {
        if (operationDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(operationDataList_);
        } else {
          return operationDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public int getOperationDataListCount() {
        if (operationDataListBuilder_ == null) {
          return operationDataList_.size();
        } else {
          return operationDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData getOperationDataList(int index) {
        if (operationDataListBuilder_ == null) {
          return operationDataList_.get(index);
        } else {
          return operationDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder setOperationDataList(
          int index, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData value) {
        if (operationDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOperationDataListIsMutable();
          operationDataList_.set(index, value);
          onChanged();
        } else {
          operationDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder setOperationDataList(
          int index, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder builderForValue) {
        if (operationDataListBuilder_ == null) {
          ensureOperationDataListIsMutable();
          operationDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          operationDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder addOperationDataList(emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData value) {
        if (operationDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOperationDataListIsMutable();
          operationDataList_.add(value);
          onChanged();
        } else {
          operationDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder addOperationDataList(
          int index, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData value) {
        if (operationDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOperationDataListIsMutable();
          operationDataList_.add(index, value);
          onChanged();
        } else {
          operationDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder addOperationDataList(
          emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder builderForValue) {
        if (operationDataListBuilder_ == null) {
          ensureOperationDataListIsMutable();
          operationDataList_.add(builderForValue.build());
          onChanged();
        } else {
          operationDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder addOperationDataList(
          int index, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder builderForValue) {
        if (operationDataListBuilder_ == null) {
          ensureOperationDataListIsMutable();
          operationDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          operationDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder addAllOperationDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData> values) {
        if (operationDataListBuilder_ == null) {
          ensureOperationDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, operationDataList_);
          onChanged();
        } else {
          operationDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder clearOperationDataList() {
        if (operationDataListBuilder_ == null) {
          operationDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          operationDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public Builder removeOperationDataList(int index) {
        if (operationDataListBuilder_ == null) {
          ensureOperationDataListIsMutable();
          operationDataList_.remove(index);
          onChanged();
        } else {
          operationDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder getOperationDataListBuilder(
          int index) {
        return getOperationDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder getOperationDataListOrBuilder(
          int index) {
        if (operationDataListBuilder_ == null) {
          return operationDataList_.get(index);  } else {
          return operationDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder> 
           getOperationDataListOrBuilderList() {
        if (operationDataListBuilder_ != null) {
          return operationDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(operationDataList_);
        }
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder addOperationDataListBuilder() {
        return getOperationDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder addOperationDataListBuilder(
          int index) {
        return getOperationDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGOperationData operation_data_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder> 
           getOperationDataListBuilderList() {
        return getOperationDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder> 
          getOperationDataListFieldBuilder() {
        if (operationDataListBuilder_ == null) {
          operationDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationData.Builder, emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.GCGOperationDataOrBuilder>(
                  operationDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          operationDataList_ = null;
        }
        return operationDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGOperationReplay)
    }

    // @@protoc_insertion_point(class_scope:GCGOperationReplay)
    private static final emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay();
    }

    public static emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGOperationReplay>
        PARSER = new com.google.protobuf.AbstractParser<GCGOperationReplay>() {
      @java.lang.Override
      public GCGOperationReplay parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGOperationReplay> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGOperationReplay> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.GCGOperationReplayOuterClass.GCGOperationReplay getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGOperationReplay_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGOperationReplay_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGOperationReplay.proto\032\026GCGOperation" +
      "Data.proto\"c\n\022GCGOperationReplay\022\017\n\007game" +
      "_id\030\001 \001(\r\022\014\n\004seed\030\013 \001(\r\022.\n\023operation_dat" +
      "a_list\030\t \003(\0132\021.GCGOperationDataB\036\n\034emu.g" +
      "rasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.getDescriptor(),
        });
    internal_static_GCGOperationReplay_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGOperationReplay_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGOperationReplay_descriptor,
        new java.lang.String[] { "GameId", "Seed", "OperationDataList", });
    emu.grasscutter.net.oldproto.GCGOperationDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
