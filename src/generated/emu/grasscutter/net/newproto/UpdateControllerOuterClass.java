// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdateController.proto

package emu.grasscutter.net.newproto;

public final class UpdateControllerOuterClass {
  private UpdateControllerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdateControllerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdateController)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair> 
        getUnk3250NFPDNMMICBHList();
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair getUnk3250NFPDNMMICBH(int index);
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    int getUnk3250NFPDNMMICBHCount();
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getUnk3250NFPDNMMICBHOrBuilderList();
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder getUnk3250NFPDNMMICBHOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code UpdateController}
   */
  public static final class UpdateController extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdateController)
      UpdateControllerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdateController.newBuilder() to construct.
    private UpdateController(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdateController() {
      unk3250NFPDNMMICBH_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdateController();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.UpdateControllerOuterClass.internal_static_UpdateController_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.UpdateControllerOuterClass.internal_static_UpdateController_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController.class, emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController.Builder.class);
    }

    public static final int UNK3250_NFPDNMMICBH_FIELD_NUMBER = 8;
    private java.util.List<emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair> unk3250NFPDNMMICBH_;
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair> getUnk3250NFPDNMMICBHList() {
      return unk3250NFPDNMMICBH_;
    }
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getUnk3250NFPDNMMICBHOrBuilderList() {
      return unk3250NFPDNMMICBH_;
    }
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    @java.lang.Override
    public int getUnk3250NFPDNMMICBHCount() {
      return unk3250NFPDNMMICBH_.size();
    }
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair getUnk3250NFPDNMMICBH(int index) {
      return unk3250NFPDNMMICBH_.get(index);
    }
    /**
     * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder getUnk3250NFPDNMMICBHOrBuilder(
        int index) {
      return unk3250NFPDNMMICBH_.get(index);
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
      for (int i = 0; i < unk3250NFPDNMMICBH_.size(); i++) {
        output.writeMessage(8, unk3250NFPDNMMICBH_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk3250NFPDNMMICBH_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, unk3250NFPDNMMICBH_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController other = (emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController) obj;

      if (!getUnk3250NFPDNMMICBHList()
          .equals(other.getUnk3250NFPDNMMICBHList())) return false;
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
      if (getUnk3250NFPDNMMICBHCount() > 0) {
        hash = (37 * hash) + UNK3250_NFPDNMMICBH_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250NFPDNMMICBHList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController prototype) {
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
     * Protobuf type {@code UpdateController}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdateController)
        emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateControllerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.UpdateControllerOuterClass.internal_static_UpdateController_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.UpdateControllerOuterClass.internal_static_UpdateController_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController.class, emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          unk3250NFPDNMMICBH_ = java.util.Collections.emptyList();
        } else {
          unk3250NFPDNMMICBH_ = null;
          unk3250NFPDNMMICBHBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.UpdateControllerOuterClass.internal_static_UpdateController_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController build() {
        emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController buildPartial() {
        emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController result = new emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController(this);
        int from_bitField0_ = bitField0_;
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk3250NFPDNMMICBH_ = java.util.Collections.unmodifiableList(unk3250NFPDNMMICBH_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk3250NFPDNMMICBH_ = unk3250NFPDNMMICBH_;
        } else {
          result.unk3250NFPDNMMICBH_ = unk3250NFPDNMMICBHBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController) {
          return mergeFrom((emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController other) {
        if (other == emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController.getDefaultInstance()) return this;
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          if (!other.unk3250NFPDNMMICBH_.isEmpty()) {
            if (unk3250NFPDNMMICBH_.isEmpty()) {
              unk3250NFPDNMMICBH_ = other.unk3250NFPDNMMICBH_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk3250NFPDNMMICBHIsMutable();
              unk3250NFPDNMMICBH_.addAll(other.unk3250NFPDNMMICBH_);
            }
            onChanged();
          }
        } else {
          if (!other.unk3250NFPDNMMICBH_.isEmpty()) {
            if (unk3250NFPDNMMICBHBuilder_.isEmpty()) {
              unk3250NFPDNMMICBHBuilder_.dispose();
              unk3250NFPDNMMICBHBuilder_ = null;
              unk3250NFPDNMMICBH_ = other.unk3250NFPDNMMICBH_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk3250NFPDNMMICBHBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk3250NFPDNMMICBHFieldBuilder() : null;
            } else {
              unk3250NFPDNMMICBHBuilder_.addAllMessages(other.unk3250NFPDNMMICBH_);
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
              case 66: {
                emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.parser(),
                        extensionRegistry);
                if (unk3250NFPDNMMICBHBuilder_ == null) {
                  ensureUnk3250NFPDNMMICBHIsMutable();
                  unk3250NFPDNMMICBH_.add(m);
                } else {
                  unk3250NFPDNMMICBHBuilder_.addMessage(m);
                }
                break;
              } // case 66
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

      private java.util.List<emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair> unk3250NFPDNMMICBH_ =
        java.util.Collections.emptyList();
      private void ensureUnk3250NFPDNMMICBHIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3250NFPDNMMICBH_ = new java.util.ArrayList<emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair>(unk3250NFPDNMMICBH_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder> unk3250NFPDNMMICBHBuilder_;

      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair> getUnk3250NFPDNMMICBHList() {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk3250NFPDNMMICBH_);
        } else {
          return unk3250NFPDNMMICBHBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public int getUnk3250NFPDNMMICBHCount() {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          return unk3250NFPDNMMICBH_.size();
        } else {
          return unk3250NFPDNMMICBHBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair getUnk3250NFPDNMMICBH(int index) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          return unk3250NFPDNMMICBH_.get(index);
        } else {
          return unk3250NFPDNMMICBHBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder setUnk3250NFPDNMMICBH(
          int index, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair value) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk3250NFPDNMMICBHIsMutable();
          unk3250NFPDNMMICBH_.set(index, value);
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder setUnk3250NFPDNMMICBH(
          int index, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          ensureUnk3250NFPDNMMICBHIsMutable();
          unk3250NFPDNMMICBH_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder addUnk3250NFPDNMMICBH(emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair value) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk3250NFPDNMMICBHIsMutable();
          unk3250NFPDNMMICBH_.add(value);
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder addUnk3250NFPDNMMICBH(
          int index, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair value) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk3250NFPDNMMICBHIsMutable();
          unk3250NFPDNMMICBH_.add(index, value);
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder addUnk3250NFPDNMMICBH(
          emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          ensureUnk3250NFPDNMMICBHIsMutable();
          unk3250NFPDNMMICBH_.add(builderForValue.build());
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder addUnk3250NFPDNMMICBH(
          int index, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          ensureUnk3250NFPDNMMICBHIsMutable();
          unk3250NFPDNMMICBH_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder addAllUnk3250NFPDNMMICBH(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair> values) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          ensureUnk3250NFPDNMMICBHIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk3250NFPDNMMICBH_);
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder clearUnk3250NFPDNMMICBH() {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          unk3250NFPDNMMICBH_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public Builder removeUnk3250NFPDNMMICBH(int index) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          ensureUnk3250NFPDNMMICBHIsMutable();
          unk3250NFPDNMMICBH_.remove(index);
          onChanged();
        } else {
          unk3250NFPDNMMICBHBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder getUnk3250NFPDNMMICBHBuilder(
          int index) {
        return getUnk3250NFPDNMMICBHFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder getUnk3250NFPDNMMICBHOrBuilder(
          int index) {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          return unk3250NFPDNMMICBH_.get(index);  } else {
          return unk3250NFPDNMMICBHBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
           getUnk3250NFPDNMMICBHOrBuilderList() {
        if (unk3250NFPDNMMICBHBuilder_ != null) {
          return unk3250NFPDNMMICBHBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk3250NFPDNMMICBH_);
        }
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder addUnk3250NFPDNMMICBHBuilder() {
        return getUnk3250NFPDNMMICBHFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder addUnk3250NFPDNMMICBHBuilder(
          int index) {
        return getUnk3250NFPDNMMICBHFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair Unk3250_NFPDNMMICBH = 8;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder> 
           getUnk3250NFPDNMMICBHBuilderList() {
        return getUnk3250NFPDNMMICBHFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
          getUnk3250NFPDNMMICBHFieldBuilder() {
        if (unk3250NFPDNMMICBHBuilder_ == null) {
          unk3250NFPDNMMICBHBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.grasscutter.net.newproto.Uint32PairOuterClass.Uint32PairOrBuilder>(
                  unk3250NFPDNMMICBH_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk3250NFPDNMMICBH_ = null;
        }
        return unk3250NFPDNMMICBHBuilder_;
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


      // @@protoc_insertion_point(builder_scope:UpdateController)
    }

    // @@protoc_insertion_point(class_scope:UpdateController)
    private static final emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController();
    }

    public static emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdateController>
        PARSER = new com.google.protobuf.AbstractParser<UpdateController>() {
      @java.lang.Override
      public UpdateController parsePartialFrom(
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

    public static com.google.protobuf.Parser<UpdateController> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdateController> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.UpdateControllerOuterClass.UpdateController getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateController_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateController_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026UpdateController.proto\032\020Uint32Pair.pro" +
      "to\"<\n\020UpdateController\022(\n\023Unk3250_NFPDNM" +
      "MICBH\030\010 \003(\0132\013.Uint32PairB\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Uint32PairOuterClass.getDescriptor(),
        });
    internal_static_UpdateController_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdateController_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateController_descriptor,
        new java.lang.String[] { "Unk3250NFPDNMMICBH", });
    emu.grasscutter.net.newproto.Uint32PairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}