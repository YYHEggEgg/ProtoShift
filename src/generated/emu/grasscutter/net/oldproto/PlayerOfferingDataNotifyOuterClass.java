// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerOfferingDataNotify.proto

package emu.grasscutter.net.oldproto;

public final class PlayerOfferingDataNotifyOuterClass {
  private PlayerOfferingDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerOfferingDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerOfferingDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData> 
        getOfferingDataListList();
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingDataList(int index);
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    int getOfferingDataListCount();
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
        getOfferingDataListOrBuilderList();
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 2923
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerOfferingDataNotify}
   */
  public static final class PlayerOfferingDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerOfferingDataNotify)
      PlayerOfferingDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerOfferingDataNotify.newBuilder() to construct.
    private PlayerOfferingDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerOfferingDataNotify() {
      offeringDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerOfferingDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.class, emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.Builder.class);
    }

    public static final int OFFERING_DATA_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData> offeringDataList_;
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData> getOfferingDataListList() {
      return offeringDataList_;
    }
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
        getOfferingDataListOrBuilderList() {
      return offeringDataList_;
    }
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    @java.lang.Override
    public int getOfferingDataListCount() {
      return offeringDataList_.size();
    }
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingDataList(int index) {
      return offeringDataList_.get(index);
    }
    /**
     * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataListOrBuilder(
        int index) {
      return offeringDataList_.get(index);
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
      for (int i = 0; i < offeringDataList_.size(); i++) {
        output.writeMessage(2, offeringDataList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < offeringDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, offeringDataList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify other = (emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify) obj;

      if (!getOfferingDataListList()
          .equals(other.getOfferingDataListList())) return false;
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
      if (getOfferingDataListCount() > 0) {
        hash = (37 * hash) + OFFERING_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOfferingDataListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify prototype) {
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
     * CmdId: 2923
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerOfferingDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerOfferingDataNotify)
        emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.class, emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (offeringDataListBuilder_ == null) {
          offeringDataList_ = java.util.Collections.emptyList();
        } else {
          offeringDataList_ = null;
          offeringDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.internal_static_PlayerOfferingDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify build() {
        emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify buildPartial() {
        emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify result = new emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify(this);
        int from_bitField0_ = bitField0_;
        if (offeringDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            offeringDataList_ = java.util.Collections.unmodifiableList(offeringDataList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.offeringDataList_ = offeringDataList_;
        } else {
          result.offeringDataList_ = offeringDataListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify other) {
        if (other == emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify.getDefaultInstance()) return this;
        if (offeringDataListBuilder_ == null) {
          if (!other.offeringDataList_.isEmpty()) {
            if (offeringDataList_.isEmpty()) {
              offeringDataList_ = other.offeringDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureOfferingDataListIsMutable();
              offeringDataList_.addAll(other.offeringDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.offeringDataList_.isEmpty()) {
            if (offeringDataListBuilder_.isEmpty()) {
              offeringDataListBuilder_.dispose();
              offeringDataListBuilder_ = null;
              offeringDataList_ = other.offeringDataList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              offeringDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getOfferingDataListFieldBuilder() : null;
            } else {
              offeringDataListBuilder_.addAllMessages(other.offeringDataList_);
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
              case 18: {
                emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.parser(),
                        extensionRegistry);
                if (offeringDataListBuilder_ == null) {
                  ensureOfferingDataListIsMutable();
                  offeringDataList_.add(m);
                } else {
                  offeringDataListBuilder_.addMessage(m);
                }
                break;
              } // case 18
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

      private java.util.List<emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData> offeringDataList_ =
        java.util.Collections.emptyList();
      private void ensureOfferingDataListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          offeringDataList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData>(offeringDataList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> offeringDataListBuilder_;

      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData> getOfferingDataListList() {
        if (offeringDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(offeringDataList_);
        } else {
          return offeringDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public int getOfferingDataListCount() {
        if (offeringDataListBuilder_ == null) {
          return offeringDataList_.size();
        } else {
          return offeringDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData getOfferingDataList(int index) {
        if (offeringDataListBuilder_ == null) {
          return offeringDataList_.get(index);
        } else {
          return offeringDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder setOfferingDataList(
          int index, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingDataListIsMutable();
          offeringDataList_.set(index, value);
          onChanged();
        } else {
          offeringDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder setOfferingDataList(
          int index, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          offeringDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          offeringDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder addOfferingDataList(emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingDataListIsMutable();
          offeringDataList_.add(value);
          onChanged();
        } else {
          offeringDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder addOfferingDataList(
          int index, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData value) {
        if (offeringDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureOfferingDataListIsMutable();
          offeringDataList_.add(index, value);
          onChanged();
        } else {
          offeringDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder addOfferingDataList(
          emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          offeringDataList_.add(builderForValue.build());
          onChanged();
        } else {
          offeringDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder addOfferingDataList(
          int index, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder builderForValue) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          offeringDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          offeringDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder addAllOfferingDataList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData> values) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, offeringDataList_);
          onChanged();
        } else {
          offeringDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder clearOfferingDataList() {
        if (offeringDataListBuilder_ == null) {
          offeringDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          offeringDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public Builder removeOfferingDataList(int index) {
        if (offeringDataListBuilder_ == null) {
          ensureOfferingDataListIsMutable();
          offeringDataList_.remove(index);
          onChanged();
        } else {
          offeringDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder getOfferingDataListBuilder(
          int index) {
        return getOfferingDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder getOfferingDataListOrBuilder(
          int index) {
        if (offeringDataListBuilder_ == null) {
          return offeringDataList_.get(index);  } else {
          return offeringDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
           getOfferingDataListOrBuilderList() {
        if (offeringDataListBuilder_ != null) {
          return offeringDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(offeringDataList_);
        }
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder addOfferingDataListBuilder() {
        return getOfferingDataListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder addOfferingDataListBuilder(
          int index) {
        return getOfferingDataListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance());
      }
      /**
       * <code>repeated .PlayerOfferingData offering_data_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder> 
           getOfferingDataListBuilderList() {
        return getOfferingDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder> 
          getOfferingDataListFieldBuilder() {
        if (offeringDataListBuilder_ == null) {
          offeringDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder, emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder>(
                  offeringDataList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          offeringDataList_ = null;
        }
        return offeringDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerOfferingDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerOfferingDataNotify)
    private static final emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify();
    }

    public static emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerOfferingDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerOfferingDataNotify>() {
      @java.lang.Override
      public PlayerOfferingDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerOfferingDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerOfferingDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PlayerOfferingDataNotifyOuterClass.PlayerOfferingDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerOfferingDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerOfferingDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerOfferingDataNotify.proto\032\030Player" +
      "OfferingData.proto\"K\n\030PlayerOfferingData" +
      "Notify\022/\n\022offering_data_list\030\002 \003(\0132\023.Pla" +
      "yerOfferingDataB\036\n\034emu.grasscutter.net.o" +
      "ldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.getDescriptor(),
        });
    internal_static_PlayerOfferingDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerOfferingDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerOfferingDataNotify_descriptor,
        new java.lang.String[] { "OfferingDataList", });
    emu.grasscutter.net.oldproto.PlayerOfferingDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}