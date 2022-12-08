// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionActivityDetailInfo.proto

package emu.grasscutter.net.oldproto;

public final class PotionActivityDetailInfoOuterClass {
  private PotionActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    java.util.List<emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData> 
        getStageListList();
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData getStageList(int index);
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    int getStageListCount();
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
        getStageListOrBuilderList();
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code PotionActivityDetailInfo}
   */
  public static final class PotionActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionActivityDetailInfo)
      PotionActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionActivityDetailInfo.newBuilder() to construct.
    private PotionActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionActivityDetailInfo() {
      stageList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.class, emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.Builder.class);
    }

    public static final int STAGE_LIST_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData> stageList_;
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData> getStageListList() {
      return stageList_;
    }
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
        getStageListOrBuilderList() {
      return stageList_;
    }
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    @java.lang.Override
    public int getStageListCount() {
      return stageList_.size();
    }
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData getStageList(int index) {
      return stageList_.get(index);
    }
    /**
     * <code>repeated .PotionStageData stage_list = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageListOrBuilder(
        int index) {
      return stageList_.get(index);
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
      for (int i = 0; i < stageList_.size(); i++) {
        output.writeMessage(10, stageList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stageList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, stageList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo other = (emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo) obj;

      if (!getStageListList()
          .equals(other.getStageListList())) return false;
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
      if (getStageListCount() > 0) {
        hash = (37 * hash) + STAGE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStageListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo prototype) {
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
     * Protobuf type {@code PotionActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionActivityDetailInfo)
        emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.class, emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (stageListBuilder_ == null) {
          stageList_ = java.util.Collections.emptyList();
        } else {
          stageList_ = null;
          stageListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.internal_static_PotionActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo build() {
        emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo buildPartial() {
        emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo result = new emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        if (stageListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            stageList_ = java.util.Collections.unmodifiableList(stageList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stageList_ = stageList_;
        } else {
          result.stageList_ = stageListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo other) {
        if (other == emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo.getDefaultInstance()) return this;
        if (stageListBuilder_ == null) {
          if (!other.stageList_.isEmpty()) {
            if (stageList_.isEmpty()) {
              stageList_ = other.stageList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStageListIsMutable();
              stageList_.addAll(other.stageList_);
            }
            onChanged();
          }
        } else {
          if (!other.stageList_.isEmpty()) {
            if (stageListBuilder_.isEmpty()) {
              stageListBuilder_.dispose();
              stageListBuilder_ = null;
              stageList_ = other.stageList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stageListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStageListFieldBuilder() : null;
            } else {
              stageListBuilder_.addAllMessages(other.stageList_);
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
              case 82: {
                emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData m =
                    input.readMessage(
                        emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.parser(),
                        extensionRegistry);
                if (stageListBuilder_ == null) {
                  ensureStageListIsMutable();
                  stageList_.add(m);
                } else {
                  stageListBuilder_.addMessage(m);
                }
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

      private java.util.List<emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData> stageList_ =
        java.util.Collections.emptyList();
      private void ensureStageListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageList_ = new java.util.ArrayList<emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData>(stageList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder> stageListBuilder_;

      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData> getStageListList() {
        if (stageListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageList_);
        } else {
          return stageListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public int getStageListCount() {
        if (stageListBuilder_ == null) {
          return stageList_.size();
        } else {
          return stageListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData getStageList(int index) {
        if (stageListBuilder_ == null) {
          return stageList_.get(index);
        } else {
          return stageListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder setStageList(
          int index, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData value) {
        if (stageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageListIsMutable();
          stageList_.set(index, value);
          onChanged();
        } else {
          stageListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder setStageList(
          int index, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder builderForValue) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          stageList_.set(index, builderForValue.build());
          onChanged();
        } else {
          stageListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder addStageList(emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData value) {
        if (stageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageListIsMutable();
          stageList_.add(value);
          onChanged();
        } else {
          stageListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder addStageList(
          int index, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData value) {
        if (stageListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageListIsMutable();
          stageList_.add(index, value);
          onChanged();
        } else {
          stageListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder addStageList(
          emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder builderForValue) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          stageList_.add(builderForValue.build());
          onChanged();
        } else {
          stageListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder addStageList(
          int index, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder builderForValue) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          stageList_.add(index, builderForValue.build());
          onChanged();
        } else {
          stageListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder addAllStageList(
          java.lang.Iterable<? extends emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData> values) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, stageList_);
          onChanged();
        } else {
          stageListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder clearStageList() {
        if (stageListBuilder_ == null) {
          stageList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stageListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public Builder removeStageList(int index) {
        if (stageListBuilder_ == null) {
          ensureStageListIsMutable();
          stageList_.remove(index);
          onChanged();
        } else {
          stageListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder getStageListBuilder(
          int index) {
        return getStageListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder getStageListOrBuilder(
          int index) {
        if (stageListBuilder_ == null) {
          return stageList_.get(index);  } else {
          return stageListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
           getStageListOrBuilderList() {
        if (stageListBuilder_ != null) {
          return stageListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageList_);
        }
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder addStageListBuilder() {
        return getStageListFieldBuilder().addBuilder(
            emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder addStageListBuilder(
          int index) {
        return getStageListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.getDefaultInstance());
      }
      /**
       * <code>repeated .PotionStageData stage_list = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder> 
           getStageListBuilderList() {
        return getStageListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder> 
          getStageListFieldBuilder() {
        if (stageListBuilder_ == null) {
          stageListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageData.Builder, emu.grasscutter.net.oldproto.PotionStageDataOuterClass.PotionStageDataOrBuilder>(
                  stageList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          stageList_ = null;
        }
        return stageListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PotionActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:PotionActivityDetailInfo)
    private static final emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo();
    }

    public static emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<PotionActivityDetailInfo>() {
      @java.lang.Override
      public PotionActivityDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PotionActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.PotionActivityDetailInfoOuterClass.PotionActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PotionActivityDetailInfo.proto\032\025Potion" +
      "StageData.proto\"@\n\030PotionActivityDetailI" +
      "nfo\022$\n\nstage_list\030\n \003(\0132\020.PotionStageDat" +
      "aB\036\n\034emu.grasscutter.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.PotionStageDataOuterClass.getDescriptor(),
        });
    internal_static_PotionActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionActivityDetailInfo_descriptor,
        new java.lang.String[] { "StageList", });
    emu.grasscutter.net.oldproto.PotionStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}