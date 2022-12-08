// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CityReputationQuestInfo.proto

package emu.grasscutter.net.oldproto;

public final class CityReputationQuestInfoOuterClass {
  private CityReputationQuestInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CityReputationQuestInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CityReputationQuestInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
     * @return A list containing the takenParentQuestRewardList.
     */
    java.util.List<java.lang.Integer> getTakenParentQuestRewardListList();
    /**
     * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
     * @return The count of takenParentQuestRewardList.
     */
    int getTakenParentQuestRewardListCount();
    /**
     * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
     * @param index The index of the element to return.
     * @return The takenParentQuestRewardList at the given index.
     */
    int getTakenParentQuestRewardList(int index);

    /**
     * <code>repeated uint32 finished_parent_quest_list = 7;</code>
     * @return A list containing the finishedParentQuestList.
     */
    java.util.List<java.lang.Integer> getFinishedParentQuestListList();
    /**
     * <code>repeated uint32 finished_parent_quest_list = 7;</code>
     * @return The count of finishedParentQuestList.
     */
    int getFinishedParentQuestListCount();
    /**
     * <code>repeated uint32 finished_parent_quest_list = 7;</code>
     * @param index The index of the element to return.
     * @return The finishedParentQuestList at the given index.
     */
    int getFinishedParentQuestList(int index);
  }
  /**
   * Protobuf type {@code CityReputationQuestInfo}
   */
  public static final class CityReputationQuestInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CityReputationQuestInfo)
      CityReputationQuestInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CityReputationQuestInfo.newBuilder() to construct.
    private CityReputationQuestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CityReputationQuestInfo() {
      takenParentQuestRewardList_ = emptyIntList();
      finishedParentQuestList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CityReputationQuestInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.class, emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 2;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int TAKEN_PARENT_QUEST_REWARD_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList takenParentQuestRewardList_;
    /**
     * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
     * @return A list containing the takenParentQuestRewardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTakenParentQuestRewardListList() {
      return takenParentQuestRewardList_;
    }
    /**
     * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
     * @return The count of takenParentQuestRewardList.
     */
    public int getTakenParentQuestRewardListCount() {
      return takenParentQuestRewardList_.size();
    }
    /**
     * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
     * @param index The index of the element to return.
     * @return The takenParentQuestRewardList at the given index.
     */
    public int getTakenParentQuestRewardList(int index) {
      return takenParentQuestRewardList_.getInt(index);
    }
    private int takenParentQuestRewardListMemoizedSerializedSize = -1;

    public static final int FINISHED_PARENT_QUEST_LIST_FIELD_NUMBER = 7;
    private com.google.protobuf.Internal.IntList finishedParentQuestList_;
    /**
     * <code>repeated uint32 finished_parent_quest_list = 7;</code>
     * @return A list containing the finishedParentQuestList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFinishedParentQuestListList() {
      return finishedParentQuestList_;
    }
    /**
     * <code>repeated uint32 finished_parent_quest_list = 7;</code>
     * @return The count of finishedParentQuestList.
     */
    public int getFinishedParentQuestListCount() {
      return finishedParentQuestList_.size();
    }
    /**
     * <code>repeated uint32 finished_parent_quest_list = 7;</code>
     * @param index The index of the element to return.
     * @return The finishedParentQuestList at the given index.
     */
    public int getFinishedParentQuestList(int index) {
      return finishedParentQuestList_.getInt(index);
    }
    private int finishedParentQuestListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (isOpen_ != false) {
        output.writeBool(2, isOpen_);
      }
      if (getFinishedParentQuestListList().size() > 0) {
        output.writeUInt32NoTag(58);
        output.writeUInt32NoTag(finishedParentQuestListMemoizedSerializedSize);
      }
      for (int i = 0; i < finishedParentQuestList_.size(); i++) {
        output.writeUInt32NoTag(finishedParentQuestList_.getInt(i));
      }
      if (getTakenParentQuestRewardListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(takenParentQuestRewardListMemoizedSerializedSize);
      }
      for (int i = 0; i < takenParentQuestRewardList_.size(); i++) {
        output.writeUInt32NoTag(takenParentQuestRewardList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isOpen_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < finishedParentQuestList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(finishedParentQuestList_.getInt(i));
        }
        size += dataSize;
        if (!getFinishedParentQuestListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        finishedParentQuestListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < takenParentQuestRewardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(takenParentQuestRewardList_.getInt(i));
        }
        size += dataSize;
        if (!getTakenParentQuestRewardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        takenParentQuestRewardListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo other = (emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (!getTakenParentQuestRewardListList()
          .equals(other.getTakenParentQuestRewardListList())) return false;
      if (!getFinishedParentQuestListList()
          .equals(other.getFinishedParentQuestListList())) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      if (getTakenParentQuestRewardListCount() > 0) {
        hash = (37 * hash) + TAKEN_PARENT_QUEST_REWARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTakenParentQuestRewardListList().hashCode();
      }
      if (getFinishedParentQuestListCount() > 0) {
        hash = (37 * hash) + FINISHED_PARENT_QUEST_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFinishedParentQuestListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo prototype) {
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
     * Protobuf type {@code CityReputationQuestInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CityReputationQuestInfo)
        emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.class, emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isOpen_ = false;

        takenParentQuestRewardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        finishedParentQuestList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo build() {
        emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo buildPartial() {
        emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result = new emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo(this);
        int from_bitField0_ = bitField0_;
        result.isOpen_ = isOpen_;
        if (((bitField0_ & 0x00000001) != 0)) {
          takenParentQuestRewardList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.takenParentQuestRewardList_ = takenParentQuestRewardList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          finishedParentQuestList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.finishedParentQuestList_ = finishedParentQuestList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo other) {
        if (other == emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (!other.takenParentQuestRewardList_.isEmpty()) {
          if (takenParentQuestRewardList_.isEmpty()) {
            takenParentQuestRewardList_ = other.takenParentQuestRewardList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTakenParentQuestRewardListIsMutable();
            takenParentQuestRewardList_.addAll(other.takenParentQuestRewardList_);
          }
          onChanged();
        }
        if (!other.finishedParentQuestList_.isEmpty()) {
          if (finishedParentQuestList_.isEmpty()) {
            finishedParentQuestList_ = other.finishedParentQuestList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFinishedParentQuestListIsMutable();
            finishedParentQuestList_.addAll(other.finishedParentQuestList_);
          }
          onChanged();
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
                isOpen_ = input.readBool();

                break;
              } // case 16
              case 56: {
                int v = input.readUInt32();
                ensureFinishedParentQuestListIsMutable();
                finishedParentQuestList_.addInt(v);
                break;
              } // case 56
              case 58: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFinishedParentQuestListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  finishedParentQuestList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 58
              case 96: {
                int v = input.readUInt32();
                ensureTakenParentQuestRewardListIsMutable();
                takenParentQuestRewardList_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureTakenParentQuestRewardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  takenParentQuestRewardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 98
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

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 2;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList takenParentQuestRewardList_ = emptyIntList();
      private void ensureTakenParentQuestRewardListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          takenParentQuestRewardList_ = mutableCopy(takenParentQuestRewardList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
       * @return A list containing the takenParentQuestRewardList.
       */
      public java.util.List<java.lang.Integer>
          getTakenParentQuestRewardListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(takenParentQuestRewardList_) : takenParentQuestRewardList_;
      }
      /**
       * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
       * @return The count of takenParentQuestRewardList.
       */
      public int getTakenParentQuestRewardListCount() {
        return takenParentQuestRewardList_.size();
      }
      /**
       * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
       * @param index The index of the element to return.
       * @return The takenParentQuestRewardList at the given index.
       */
      public int getTakenParentQuestRewardList(int index) {
        return takenParentQuestRewardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The takenParentQuestRewardList to set.
       * @return This builder for chaining.
       */
      public Builder setTakenParentQuestRewardList(
          int index, int value) {
        ensureTakenParentQuestRewardListIsMutable();
        takenParentQuestRewardList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
       * @param value The takenParentQuestRewardList to add.
       * @return This builder for chaining.
       */
      public Builder addTakenParentQuestRewardList(int value) {
        ensureTakenParentQuestRewardListIsMutable();
        takenParentQuestRewardList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
       * @param values The takenParentQuestRewardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTakenParentQuestRewardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTakenParentQuestRewardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, takenParentQuestRewardList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 taken_parent_quest_reward_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearTakenParentQuestRewardList() {
        takenParentQuestRewardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList finishedParentQuestList_ = emptyIntList();
      private void ensureFinishedParentQuestListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          finishedParentQuestList_ = mutableCopy(finishedParentQuestList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 finished_parent_quest_list = 7;</code>
       * @return A list containing the finishedParentQuestList.
       */
      public java.util.List<java.lang.Integer>
          getFinishedParentQuestListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(finishedParentQuestList_) : finishedParentQuestList_;
      }
      /**
       * <code>repeated uint32 finished_parent_quest_list = 7;</code>
       * @return The count of finishedParentQuestList.
       */
      public int getFinishedParentQuestListCount() {
        return finishedParentQuestList_.size();
      }
      /**
       * <code>repeated uint32 finished_parent_quest_list = 7;</code>
       * @param index The index of the element to return.
       * @return The finishedParentQuestList at the given index.
       */
      public int getFinishedParentQuestList(int index) {
        return finishedParentQuestList_.getInt(index);
      }
      /**
       * <code>repeated uint32 finished_parent_quest_list = 7;</code>
       * @param index The index to set the value at.
       * @param value The finishedParentQuestList to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedParentQuestList(
          int index, int value) {
        ensureFinishedParentQuestListIsMutable();
        finishedParentQuestList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_parent_quest_list = 7;</code>
       * @param value The finishedParentQuestList to add.
       * @return This builder for chaining.
       */
      public Builder addFinishedParentQuestList(int value) {
        ensureFinishedParentQuestListIsMutable();
        finishedParentQuestList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_parent_quest_list = 7;</code>
       * @param values The finishedParentQuestList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFinishedParentQuestList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFinishedParentQuestListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, finishedParentQuestList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 finished_parent_quest_list = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedParentQuestList() {
        finishedParentQuestList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:CityReputationQuestInfo)
    }

    // @@protoc_insertion_point(class_scope:CityReputationQuestInfo)
    private static final emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo();
    }

    public static emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CityReputationQuestInfo>
        PARSER = new com.google.protobuf.AbstractParser<CityReputationQuestInfo>() {
      @java.lang.Override
      public CityReputationQuestInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CityReputationQuestInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CityReputationQuestInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CityReputationQuestInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CityReputationQuestInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CityReputationQuestInfo.proto\"v\n\027CityR" +
      "eputationQuestInfo\022\017\n\007is_open\030\002 \001(\010\022&\n\036t" +
      "aken_parent_quest_reward_list\030\014 \003(\r\022\"\n\032f" +
      "inished_parent_quest_list\030\007 \003(\rB\036\n\034emu.g" +
      "rasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CityReputationQuestInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CityReputationQuestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CityReputationQuestInfo_descriptor,
        new java.lang.String[] { "IsOpen", "TakenParentQuestRewardList", "FinishedParentQuestList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}