// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NewCard.proto

package emu.grasscutter.net.newproto;

public final class NewCardOuterClass {
  private NewCardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NewCardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NewCard)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
     * @return Whether the unk3250OHPDPFACLKH field is set.
     */
    boolean hasUnk3250OHPDPFACLKH();
    /**
     * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
     * @return The unk3250OHPDPFACLKH.
     */
    emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE getUnk3250OHPDPFACLKH();
    /**
     * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
     */
    emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHEOrBuilder getUnk3250OHPDPFACLKHOrBuilder();
  }
  /**
   * Protobuf type {@code NewCard}
   */
  public static final class NewCard extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NewCard)
      NewCardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NewCard.newBuilder() to construct.
    private NewCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NewCard() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NewCard();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.NewCardOuterClass.internal_static_NewCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.NewCardOuterClass.internal_static_NewCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.NewCardOuterClass.NewCard.class, emu.grasscutter.net.newproto.NewCardOuterClass.NewCard.Builder.class);
    }

    public static final int UNK3250_OHPDPFACLKH_FIELD_NUMBER = 3;
    private emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE unk3250OHPDPFACLKH_;
    /**
     * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
     * @return Whether the unk3250OHPDPFACLKH field is set.
     */
    @java.lang.Override
    public boolean hasUnk3250OHPDPFACLKH() {
      return unk3250OHPDPFACLKH_ != null;
    }
    /**
     * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
     * @return The unk3250OHPDPFACLKH.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE getUnk3250OHPDPFACLKH() {
      return unk3250OHPDPFACLKH_ == null ? emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.getDefaultInstance() : unk3250OHPDPFACLKH_;
    }
    /**
     * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHEOrBuilder getUnk3250OHPDPFACLKHOrBuilder() {
      return getUnk3250OHPDPFACLKH();
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
      if (unk3250OHPDPFACLKH_ != null) {
        output.writeMessage(3, getUnk3250OHPDPFACLKH());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250OHPDPFACLKH_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getUnk3250OHPDPFACLKH());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.NewCardOuterClass.NewCard)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.NewCardOuterClass.NewCard other = (emu.grasscutter.net.newproto.NewCardOuterClass.NewCard) obj;

      if (hasUnk3250OHPDPFACLKH() != other.hasUnk3250OHPDPFACLKH()) return false;
      if (hasUnk3250OHPDPFACLKH()) {
        if (!getUnk3250OHPDPFACLKH()
            .equals(other.getUnk3250OHPDPFACLKH())) return false;
      }
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
      if (hasUnk3250OHPDPFACLKH()) {
        hash = (37 * hash) + UNK3250_OHPDPFACLKH_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250OHPDPFACLKH().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.NewCardOuterClass.NewCard prototype) {
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
     * Protobuf type {@code NewCard}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NewCard)
        emu.grasscutter.net.newproto.NewCardOuterClass.NewCardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.NewCardOuterClass.internal_static_NewCard_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.NewCardOuterClass.internal_static_NewCard_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.NewCardOuterClass.NewCard.class, emu.grasscutter.net.newproto.NewCardOuterClass.NewCard.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.NewCardOuterClass.NewCard.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk3250OHPDPFACLKHBuilder_ == null) {
          unk3250OHPDPFACLKH_ = null;
        } else {
          unk3250OHPDPFACLKH_ = null;
          unk3250OHPDPFACLKHBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.NewCardOuterClass.internal_static_NewCard_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.NewCardOuterClass.NewCard getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.NewCardOuterClass.NewCard.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.NewCardOuterClass.NewCard build() {
        emu.grasscutter.net.newproto.NewCardOuterClass.NewCard result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.NewCardOuterClass.NewCard buildPartial() {
        emu.grasscutter.net.newproto.NewCardOuterClass.NewCard result = new emu.grasscutter.net.newproto.NewCardOuterClass.NewCard(this);
        if (unk3250OHPDPFACLKHBuilder_ == null) {
          result.unk3250OHPDPFACLKH_ = unk3250OHPDPFACLKH_;
        } else {
          result.unk3250OHPDPFACLKH_ = unk3250OHPDPFACLKHBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.NewCardOuterClass.NewCard) {
          return mergeFrom((emu.grasscutter.net.newproto.NewCardOuterClass.NewCard)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.NewCardOuterClass.NewCard other) {
        if (other == emu.grasscutter.net.newproto.NewCardOuterClass.NewCard.getDefaultInstance()) return this;
        if (other.hasUnk3250OHPDPFACLKH()) {
          mergeUnk3250OHPDPFACLKH(other.getUnk3250OHPDPFACLKH());
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
              case 26: {
                input.readMessage(
                    getUnk3250OHPDPFACLKHFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 26
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

      private emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE unk3250OHPDPFACLKH_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE, emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.Builder, emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHEOrBuilder> unk3250OHPDPFACLKHBuilder_;
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       * @return Whether the unk3250OHPDPFACLKH field is set.
       */
      public boolean hasUnk3250OHPDPFACLKH() {
        return unk3250OHPDPFACLKHBuilder_ != null || unk3250OHPDPFACLKH_ != null;
      }
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       * @return The unk3250OHPDPFACLKH.
       */
      public emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE getUnk3250OHPDPFACLKH() {
        if (unk3250OHPDPFACLKHBuilder_ == null) {
          return unk3250OHPDPFACLKH_ == null ? emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.getDefaultInstance() : unk3250OHPDPFACLKH_;
        } else {
          return unk3250OHPDPFACLKHBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       */
      public Builder setUnk3250OHPDPFACLKH(emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE value) {
        if (unk3250OHPDPFACLKHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk3250OHPDPFACLKH_ = value;
          onChanged();
        } else {
          unk3250OHPDPFACLKHBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       */
      public Builder setUnk3250OHPDPFACLKH(
          emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.Builder builderForValue) {
        if (unk3250OHPDPFACLKHBuilder_ == null) {
          unk3250OHPDPFACLKH_ = builderForValue.build();
          onChanged();
        } else {
          unk3250OHPDPFACLKHBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       */
      public Builder mergeUnk3250OHPDPFACLKH(emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE value) {
        if (unk3250OHPDPFACLKHBuilder_ == null) {
          if (unk3250OHPDPFACLKH_ != null) {
            unk3250OHPDPFACLKH_ =
              emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.newBuilder(unk3250OHPDPFACLKH_).mergeFrom(value).buildPartial();
          } else {
            unk3250OHPDPFACLKH_ = value;
          }
          onChanged();
        } else {
          unk3250OHPDPFACLKHBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       */
      public Builder clearUnk3250OHPDPFACLKH() {
        if (unk3250OHPDPFACLKHBuilder_ == null) {
          unk3250OHPDPFACLKH_ = null;
          onChanged();
        } else {
          unk3250OHPDPFACLKH_ = null;
          unk3250OHPDPFACLKHBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.Builder getUnk3250OHPDPFACLKHBuilder() {
        
        onChanged();
        return getUnk3250OHPDPFACLKHFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       */
      public emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHEOrBuilder getUnk3250OHPDPFACLKHOrBuilder() {
        if (unk3250OHPDPFACLKHBuilder_ != null) {
          return unk3250OHPDPFACLKHBuilder_.getMessageOrBuilder();
        } else {
          return unk3250OHPDPFACLKH_ == null ?
              emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.getDefaultInstance() : unk3250OHPDPFACLKH_;
        }
      }
      /**
       * <code>.Unk3150_KDNGCBJNNHE Unk3250_OHPDPFACLKH = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE, emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.Builder, emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHEOrBuilder> 
          getUnk3250OHPDPFACLKHFieldBuilder() {
        if (unk3250OHPDPFACLKHBuilder_ == null) {
          unk3250OHPDPFACLKHBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE, emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHE.Builder, emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.Unk3150_KDNGCBJNNHEOrBuilder>(
                  getUnk3250OHPDPFACLKH(),
                  getParentForChildren(),
                  isClean());
          unk3250OHPDPFACLKH_ = null;
        }
        return unk3250OHPDPFACLKHBuilder_;
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


      // @@protoc_insertion_point(builder_scope:NewCard)
    }

    // @@protoc_insertion_point(class_scope:NewCard)
    private static final emu.grasscutter.net.newproto.NewCardOuterClass.NewCard DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.NewCardOuterClass.NewCard();
    }

    public static emu.grasscutter.net.newproto.NewCardOuterClass.NewCard getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NewCard>
        PARSER = new com.google.protobuf.AbstractParser<NewCard>() {
      @java.lang.Override
      public NewCard parsePartialFrom(
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

    public static com.google.protobuf.Parser<NewCard> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NewCard> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.NewCardOuterClass.NewCard getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NewCard_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NewCard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rNewCard.proto\032\031Unk3150_KDNGCBJNNHE.pro" +
      "to\"<\n\007NewCard\0221\n\023Unk3250_OHPDPFACLKH\030\003 \001" +
      "(\0132\024.Unk3150_KDNGCBJNNHEB\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.getDescriptor(),
        });
    internal_static_NewCard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NewCard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NewCard_descriptor,
        new java.lang.String[] { "Unk3250OHPDPFACLKH", });
    emu.grasscutter.net.newproto.Unk3150KDNGCBJNNHE.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
