// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_LGIKLPBOJOI.proto

package emu.grasscutter.net.newproto;

public final class Unk2800LGIKLPBOJOI {
  private Unk2800LGIKLPBOJOI() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_LGIKLPBOJOIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_LGIKLPBOJOI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activity_id = 12;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
     * @return A list containing the unk2800AEKPBKAAHFL.
     */
    java.util.List<java.lang.Integer> getUnk2800AEKPBKAAHFLList();
    /**
     * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
     * @return The count of unk2800AEKPBKAAHFL.
     */
    int getUnk2800AEKPBKAAHFLCount();
    /**
     * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
     * @param index The index of the element to return.
     * @return The unk2800AEKPBKAAHFL at the given index.
     */
    int getUnk2800AEKPBKAAHFL(int index);
  }
  /**
   * <pre>
   * CmdId: 8259
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2800_LGIKLPBOJOI}
   */
  public static final class Unk2800_LGIKLPBOJOI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_LGIKLPBOJOI)
      Unk2800_LGIKLPBOJOIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_LGIKLPBOJOI.newBuilder() to construct.
    private Unk2800_LGIKLPBOJOI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_LGIKLPBOJOI() {
      unk2800AEKPBKAAHFL_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_LGIKLPBOJOI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.internal_static_Unk2800_LGIKLPBOJOI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.internal_static_Unk2800_LGIKLPBOJOI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI.class, emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI.Builder.class);
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 12;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 12;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int UNK2800_AEKPBKAAHFL_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList unk2800AEKPBKAAHFL_;
    /**
     * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
     * @return A list containing the unk2800AEKPBKAAHFL.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk2800AEKPBKAAHFLList() {
      return unk2800AEKPBKAAHFL_;
    }
    /**
     * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
     * @return The count of unk2800AEKPBKAAHFL.
     */
    public int getUnk2800AEKPBKAAHFLCount() {
      return unk2800AEKPBKAAHFL_.size();
    }
    /**
     * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
     * @param index The index of the element to return.
     * @return The unk2800AEKPBKAAHFL at the given index.
     */
    public int getUnk2800AEKPBKAAHFL(int index) {
      return unk2800AEKPBKAAHFL_.getInt(index);
    }
    private int unk2800AEKPBKAAHFLMemoizedSerializedSize = -1;

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
      if (activityId_ != 0) {
        output.writeUInt32(12, activityId_);
      }
      if (getUnk2800AEKPBKAAHFLList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(unk2800AEKPBKAAHFLMemoizedSerializedSize);
      }
      for (int i = 0; i < unk2800AEKPBKAAHFL_.size(); i++) {
        output.writeUInt32NoTag(unk2800AEKPBKAAHFL_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, activityId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < unk2800AEKPBKAAHFL_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk2800AEKPBKAAHFL_.getInt(i));
        }
        size += dataSize;
        if (!getUnk2800AEKPBKAAHFLList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk2800AEKPBKAAHFLMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI other = (emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI) obj;

      if (getActivityId()
          != other.getActivityId()) return false;
      if (!getUnk2800AEKPBKAAHFLList()
          .equals(other.getUnk2800AEKPBKAAHFLList())) return false;
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
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      if (getUnk2800AEKPBKAAHFLCount() > 0) {
        hash = (37 * hash) + UNK2800_AEKPBKAAHFL_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2800AEKPBKAAHFLList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI prototype) {
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
     * CmdId: 8259
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2800_LGIKLPBOJOI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_LGIKLPBOJOI)
        emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.internal_static_Unk2800_LGIKLPBOJOI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.internal_static_Unk2800_LGIKLPBOJOI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI.class, emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        activityId_ = 0;

        unk2800AEKPBKAAHFL_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.internal_static_Unk2800_LGIKLPBOJOI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI build() {
        emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI buildPartial() {
        emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI result = new emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI(this);
        int from_bitField0_ = bitField0_;
        result.activityId_ = activityId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk2800AEKPBKAAHFL_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk2800AEKPBKAAHFL_ = unk2800AEKPBKAAHFL_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI other) {
        if (other == emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI.getDefaultInstance()) return this;
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (!other.unk2800AEKPBKAAHFL_.isEmpty()) {
          if (unk2800AEKPBKAAHFL_.isEmpty()) {
            unk2800AEKPBKAAHFL_ = other.unk2800AEKPBKAAHFL_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk2800AEKPBKAAHFLIsMutable();
            unk2800AEKPBKAAHFL_.addAll(other.unk2800AEKPBKAAHFL_);
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
              case 96: {
                activityId_ = input.readUInt32();

                break;
              } // case 96
              case 112: {
                int v = input.readUInt32();
                ensureUnk2800AEKPBKAAHFLIsMutable();
                unk2800AEKPBKAAHFL_.addInt(v);
                break;
              } // case 112
              case 114: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk2800AEKPBKAAHFLIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk2800AEKPBKAAHFL_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 114
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

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 12;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 12;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk2800AEKPBKAAHFL_ = emptyIntList();
      private void ensureUnk2800AEKPBKAAHFLIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2800AEKPBKAAHFL_ = mutableCopy(unk2800AEKPBKAAHFL_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
       * @return A list containing the unk2800AEKPBKAAHFL.
       */
      public java.util.List<java.lang.Integer>
          getUnk2800AEKPBKAAHFLList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk2800AEKPBKAAHFL_) : unk2800AEKPBKAAHFL_;
      }
      /**
       * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
       * @return The count of unk2800AEKPBKAAHFL.
       */
      public int getUnk2800AEKPBKAAHFLCount() {
        return unk2800AEKPBKAAHFL_.size();
      }
      /**
       * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
       * @param index The index of the element to return.
       * @return The unk2800AEKPBKAAHFL at the given index.
       */
      public int getUnk2800AEKPBKAAHFL(int index) {
        return unk2800AEKPBKAAHFL_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
       * @param index The index to set the value at.
       * @param value The unk2800AEKPBKAAHFL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2800AEKPBKAAHFL(
          int index, int value) {
        ensureUnk2800AEKPBKAAHFLIsMutable();
        unk2800AEKPBKAAHFL_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
       * @param value The unk2800AEKPBKAAHFL to add.
       * @return This builder for chaining.
       */
      public Builder addUnk2800AEKPBKAAHFL(int value) {
        ensureUnk2800AEKPBKAAHFLIsMutable();
        unk2800AEKPBKAAHFL_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
       * @param values The unk2800AEKPBKAAHFL to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk2800AEKPBKAAHFL(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk2800AEKPBKAAHFLIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk2800AEKPBKAAHFL_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk2800_AEKPBKAAHFL = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2800AEKPBKAAHFL() {
        unk2800AEKPBKAAHFL_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:Unk2800_LGIKLPBOJOI)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_LGIKLPBOJOI)
    private static final emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI();
    }

    public static emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_LGIKLPBOJOI>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_LGIKLPBOJOI>() {
      @java.lang.Override
      public Unk2800_LGIKLPBOJOI parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2800_LGIKLPBOJOI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_LGIKLPBOJOI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2800LGIKLPBOJOI.Unk2800_LGIKLPBOJOI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_LGIKLPBOJOI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_LGIKLPBOJOI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_LGIKLPBOJOI.proto\"G\n\023Unk2800_L" +
      "GIKLPBOJOI\022\023\n\013activity_id\030\014 \001(\r\022\033\n\023Unk28" +
      "00_AEKPBKAAHFL\030\016 \003(\rB\036\n\034emu.grasscutter." +
      "net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2800_LGIKLPBOJOI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_LGIKLPBOJOI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_LGIKLPBOJOI_descriptor,
        new java.lang.String[] { "ActivityId", "Unk2800AEKPBKAAHFL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}