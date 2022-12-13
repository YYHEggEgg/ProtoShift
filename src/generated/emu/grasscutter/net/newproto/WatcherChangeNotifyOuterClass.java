// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WatcherChangeNotify.proto

package emu.grasscutter.net.newproto;

public final class WatcherChangeNotifyOuterClass {
  private WatcherChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WatcherChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WatcherChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 removed_watcher_list = 10;</code>
     * @return A list containing the removedWatcherList.
     */
    java.util.List<java.lang.Integer> getRemovedWatcherListList();
    /**
     * <code>repeated uint32 removed_watcher_list = 10;</code>
     * @return The count of removedWatcherList.
     */
    int getRemovedWatcherListCount();
    /**
     * <code>repeated uint32 removed_watcher_list = 10;</code>
     * @param index The index of the element to return.
     * @return The removedWatcherList at the given index.
     */
    int getRemovedWatcherList(int index);

    /**
     * <code>repeated uint32 new_watcher_list = 5;</code>
     * @return A list containing the newWatcherList.
     */
    java.util.List<java.lang.Integer> getNewWatcherListList();
    /**
     * <code>repeated uint32 new_watcher_list = 5;</code>
     * @return The count of newWatcherList.
     */
    int getNewWatcherListCount();
    /**
     * <code>repeated uint32 new_watcher_list = 5;</code>
     * @param index The index of the element to return.
     * @return The newWatcherList at the given index.
     */
    int getNewWatcherList(int index);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2230;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code WatcherChangeNotify}
   */
  public static final class WatcherChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WatcherChangeNotify)
      WatcherChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WatcherChangeNotify.newBuilder() to construct.
    private WatcherChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WatcherChangeNotify() {
      removedWatcherList_ = emptyIntList();
      newWatcherList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WatcherChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.class, emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.Builder.class);
    }

    public static final int REMOVED_WATCHER_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList removedWatcherList_;
    /**
     * <code>repeated uint32 removed_watcher_list = 10;</code>
     * @return A list containing the removedWatcherList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRemovedWatcherListList() {
      return removedWatcherList_;
    }
    /**
     * <code>repeated uint32 removed_watcher_list = 10;</code>
     * @return The count of removedWatcherList.
     */
    public int getRemovedWatcherListCount() {
      return removedWatcherList_.size();
    }
    /**
     * <code>repeated uint32 removed_watcher_list = 10;</code>
     * @param index The index of the element to return.
     * @return The removedWatcherList at the given index.
     */
    public int getRemovedWatcherList(int index) {
      return removedWatcherList_.getInt(index);
    }
    private int removedWatcherListMemoizedSerializedSize = -1;

    public static final int NEW_WATCHER_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList newWatcherList_;
    /**
     * <code>repeated uint32 new_watcher_list = 5;</code>
     * @return A list containing the newWatcherList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getNewWatcherListList() {
      return newWatcherList_;
    }
    /**
     * <code>repeated uint32 new_watcher_list = 5;</code>
     * @return The count of newWatcherList.
     */
    public int getNewWatcherListCount() {
      return newWatcherList_.size();
    }
    /**
     * <code>repeated uint32 new_watcher_list = 5;</code>
     * @param index The index of the element to return.
     * @return The newWatcherList at the given index.
     */
    public int getNewWatcherList(int index) {
      return newWatcherList_.getInt(index);
    }
    private int newWatcherListMemoizedSerializedSize = -1;

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
      if (getNewWatcherListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(newWatcherListMemoizedSerializedSize);
      }
      for (int i = 0; i < newWatcherList_.size(); i++) {
        output.writeUInt32NoTag(newWatcherList_.getInt(i));
      }
      if (getRemovedWatcherListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(removedWatcherListMemoizedSerializedSize);
      }
      for (int i = 0; i < removedWatcherList_.size(); i++) {
        output.writeUInt32NoTag(removedWatcherList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < newWatcherList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(newWatcherList_.getInt(i));
        }
        size += dataSize;
        if (!getNewWatcherListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        newWatcherListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < removedWatcherList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(removedWatcherList_.getInt(i));
        }
        size += dataSize;
        if (!getRemovedWatcherListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        removedWatcherListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify other = (emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify) obj;

      if (!getRemovedWatcherListList()
          .equals(other.getRemovedWatcherListList())) return false;
      if (!getNewWatcherListList()
          .equals(other.getNewWatcherListList())) return false;
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
      if (getRemovedWatcherListCount() > 0) {
        hash = (37 * hash) + REMOVED_WATCHER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRemovedWatcherListList().hashCode();
      }
      if (getNewWatcherListCount() > 0) {
        hash = (37 * hash) + NEW_WATCHER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getNewWatcherListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify prototype) {
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
     *   CMD_ID = 2230;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code WatcherChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WatcherChangeNotify)
        emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.class, emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        removedWatcherList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        newWatcherList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.internal_static_WatcherChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify build() {
        emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify buildPartial() {
        emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify result = new emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          removedWatcherList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.removedWatcherList_ = removedWatcherList_;
        if (((bitField0_ & 0x00000002) != 0)) {
          newWatcherList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.newWatcherList_ = newWatcherList_;
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
        if (other instanceof emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify other) {
        if (other == emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify.getDefaultInstance()) return this;
        if (!other.removedWatcherList_.isEmpty()) {
          if (removedWatcherList_.isEmpty()) {
            removedWatcherList_ = other.removedWatcherList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRemovedWatcherListIsMutable();
            removedWatcherList_.addAll(other.removedWatcherList_);
          }
          onChanged();
        }
        if (!other.newWatcherList_.isEmpty()) {
          if (newWatcherList_.isEmpty()) {
            newWatcherList_ = other.newWatcherList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureNewWatcherListIsMutable();
            newWatcherList_.addAll(other.newWatcherList_);
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
              case 40: {
                int v = input.readUInt32();
                ensureNewWatcherListIsMutable();
                newWatcherList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureNewWatcherListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  newWatcherList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 80: {
                int v = input.readUInt32();
                ensureRemovedWatcherListIsMutable();
                removedWatcherList_.addInt(v);
                break;
              } // case 80
              case 82: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureRemovedWatcherListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  removedWatcherList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 82
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

      private com.google.protobuf.Internal.IntList removedWatcherList_ = emptyIntList();
      private void ensureRemovedWatcherListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          removedWatcherList_ = mutableCopy(removedWatcherList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 removed_watcher_list = 10;</code>
       * @return A list containing the removedWatcherList.
       */
      public java.util.List<java.lang.Integer>
          getRemovedWatcherListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(removedWatcherList_) : removedWatcherList_;
      }
      /**
       * <code>repeated uint32 removed_watcher_list = 10;</code>
       * @return The count of removedWatcherList.
       */
      public int getRemovedWatcherListCount() {
        return removedWatcherList_.size();
      }
      /**
       * <code>repeated uint32 removed_watcher_list = 10;</code>
       * @param index The index of the element to return.
       * @return The removedWatcherList at the given index.
       */
      public int getRemovedWatcherList(int index) {
        return removedWatcherList_.getInt(index);
      }
      /**
       * <code>repeated uint32 removed_watcher_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The removedWatcherList to set.
       * @return This builder for chaining.
       */
      public Builder setRemovedWatcherList(
          int index, int value) {
        ensureRemovedWatcherListIsMutable();
        removedWatcherList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 removed_watcher_list = 10;</code>
       * @param value The removedWatcherList to add.
       * @return This builder for chaining.
       */
      public Builder addRemovedWatcherList(int value) {
        ensureRemovedWatcherListIsMutable();
        removedWatcherList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 removed_watcher_list = 10;</code>
       * @param values The removedWatcherList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRemovedWatcherList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRemovedWatcherListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, removedWatcherList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 removed_watcher_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemovedWatcherList() {
        removedWatcherList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList newWatcherList_ = emptyIntList();
      private void ensureNewWatcherListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          newWatcherList_ = mutableCopy(newWatcherList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 new_watcher_list = 5;</code>
       * @return A list containing the newWatcherList.
       */
      public java.util.List<java.lang.Integer>
          getNewWatcherListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(newWatcherList_) : newWatcherList_;
      }
      /**
       * <code>repeated uint32 new_watcher_list = 5;</code>
       * @return The count of newWatcherList.
       */
      public int getNewWatcherListCount() {
        return newWatcherList_.size();
      }
      /**
       * <code>repeated uint32 new_watcher_list = 5;</code>
       * @param index The index of the element to return.
       * @return The newWatcherList at the given index.
       */
      public int getNewWatcherList(int index) {
        return newWatcherList_.getInt(index);
      }
      /**
       * <code>repeated uint32 new_watcher_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The newWatcherList to set.
       * @return This builder for chaining.
       */
      public Builder setNewWatcherList(
          int index, int value) {
        ensureNewWatcherListIsMutable();
        newWatcherList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 new_watcher_list = 5;</code>
       * @param value The newWatcherList to add.
       * @return This builder for chaining.
       */
      public Builder addNewWatcherList(int value) {
        ensureNewWatcherListIsMutable();
        newWatcherList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 new_watcher_list = 5;</code>
       * @param values The newWatcherList to add.
       * @return This builder for chaining.
       */
      public Builder addAllNewWatcherList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureNewWatcherListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, newWatcherList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 new_watcher_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearNewWatcherList() {
        newWatcherList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:WatcherChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:WatcherChangeNotify)
    private static final emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify();
    }

    public static emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WatcherChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<WatcherChangeNotify>() {
      @java.lang.Override
      public WatcherChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WatcherChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WatcherChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.WatcherChangeNotifyOuterClass.WatcherChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WatcherChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WatcherChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031WatcherChangeNotify.proto\"M\n\023WatcherCh" +
      "angeNotify\022\034\n\024removed_watcher_list\030\n \003(\r" +
      "\022\030\n\020new_watcher_list\030\005 \003(\rB\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WatcherChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WatcherChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WatcherChangeNotify_descriptor,
        new java.lang.String[] { "RemovedWatcherList", "NewWatcherList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
