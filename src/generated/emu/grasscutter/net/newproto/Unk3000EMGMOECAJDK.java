// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_EMGMOECAJDK.proto

package emu.grasscutter.net.newproto;

public final class Unk3000EMGMOECAJDK {
  private Unk3000EMGMOECAJDK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_EMGMOECAJDKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_EMGMOECAJDK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
     * @return A list containing the unk3000CNNFGFBBBFP.
     */
    java.util.List<java.lang.Integer> getUnk3000CNNFGFBBBFPList();
    /**
     * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
     * @return The count of unk3000CNNFGFBBBFP.
     */
    int getUnk3000CNNFGFBBBFPCount();
    /**
     * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
     * @param index The index of the element to return.
     * @return The unk3000CNNFGFBBBFP at the given index.
     */
    int getUnk3000CNNFGFBBBFP(int index);
  }
  /**
   * <pre>
   * CmdId: 6010
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_EMGMOECAJDK}
   */
  public static final class Unk3000_EMGMOECAJDK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_EMGMOECAJDK)
      Unk3000_EMGMOECAJDKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_EMGMOECAJDK.newBuilder() to construct.
    private Unk3000_EMGMOECAJDK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_EMGMOECAJDK() {
      unk3000CNNFGFBBBFP_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_EMGMOECAJDK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.internal_static_Unk3000_EMGMOECAJDK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.internal_static_Unk3000_EMGMOECAJDK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK.class, emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK.Builder.class);
    }

    public static final int UNK3000_CNNFGFBBBFP_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList unk3000CNNFGFBBBFP_;
    /**
     * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
     * @return A list containing the unk3000CNNFGFBBBFP.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3000CNNFGFBBBFPList() {
      return unk3000CNNFGFBBBFP_;
    }
    /**
     * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
     * @return The count of unk3000CNNFGFBBBFP.
     */
    public int getUnk3000CNNFGFBBBFPCount() {
      return unk3000CNNFGFBBBFP_.size();
    }
    /**
     * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
     * @param index The index of the element to return.
     * @return The unk3000CNNFGFBBBFP at the given index.
     */
    public int getUnk3000CNNFGFBBBFP(int index) {
      return unk3000CNNFGFBBBFP_.getInt(index);
    }
    private int unk3000CNNFGFBBBFPMemoizedSerializedSize = -1;

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
      if (getUnk3000CNNFGFBBBFPList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(unk3000CNNFGFBBBFPMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3000CNNFGFBBBFP_.size(); i++) {
        output.writeUInt32NoTag(unk3000CNNFGFBBBFP_.getInt(i));
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
        for (int i = 0; i < unk3000CNNFGFBBBFP_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3000CNNFGFBBBFP_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3000CNNFGFBBBFPList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3000CNNFGFBBBFPMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK other = (emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK) obj;

      if (!getUnk3000CNNFGFBBBFPList()
          .equals(other.getUnk3000CNNFGFBBBFPList())) return false;
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
      if (getUnk3000CNNFGFBBBFPCount() > 0) {
        hash = (37 * hash) + UNK3000_CNNFGFBBBFP_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3000CNNFGFBBBFPList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK prototype) {
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
     * CmdId: 6010
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_EMGMOECAJDK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_EMGMOECAJDK)
        emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.internal_static_Unk3000_EMGMOECAJDK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.internal_static_Unk3000_EMGMOECAJDK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK.class, emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3000CNNFGFBBBFP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.internal_static_Unk3000_EMGMOECAJDK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK build() {
        emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK buildPartial() {
        emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK result = new emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3000CNNFGFBBBFP_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3000CNNFGFBBBFP_ = unk3000CNNFGFBBBFP_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK other) {
        if (other == emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK.getDefaultInstance()) return this;
        if (!other.unk3000CNNFGFBBBFP_.isEmpty()) {
          if (unk3000CNNFGFBBBFP_.isEmpty()) {
            unk3000CNNFGFBBBFP_ = other.unk3000CNNFGFBBBFP_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3000CNNFGFBBBFPIsMutable();
            unk3000CNNFGFBBBFP_.addAll(other.unk3000CNNFGFBBBFP_);
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
                int v = input.readUInt32();
                ensureUnk3000CNNFGFBBBFPIsMutable();
                unk3000CNNFGFBBBFP_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3000CNNFGFBBBFPIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3000CNNFGFBBBFP_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
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

      private com.google.protobuf.Internal.IntList unk3000CNNFGFBBBFP_ = emptyIntList();
      private void ensureUnk3000CNNFGFBBBFPIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3000CNNFGFBBBFP_ = mutableCopy(unk3000CNNFGFBBBFP_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
       * @return A list containing the unk3000CNNFGFBBBFP.
       */
      public java.util.List<java.lang.Integer>
          getUnk3000CNNFGFBBBFPList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3000CNNFGFBBBFP_) : unk3000CNNFGFBBBFP_;
      }
      /**
       * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
       * @return The count of unk3000CNNFGFBBBFP.
       */
      public int getUnk3000CNNFGFBBBFPCount() {
        return unk3000CNNFGFBBBFP_.size();
      }
      /**
       * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
       * @param index The index of the element to return.
       * @return The unk3000CNNFGFBBBFP at the given index.
       */
      public int getUnk3000CNNFGFBBBFP(int index) {
        return unk3000CNNFGFBBBFP_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
       * @param index The index to set the value at.
       * @param value The unk3000CNNFGFBBBFP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000CNNFGFBBBFP(
          int index, int value) {
        ensureUnk3000CNNFGFBBBFPIsMutable();
        unk3000CNNFGFBBBFP_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
       * @param value The unk3000CNNFGFBBBFP to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3000CNNFGFBBBFP(int value) {
        ensureUnk3000CNNFGFBBBFPIsMutable();
        unk3000CNNFGFBBBFP_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
       * @param values The unk3000CNNFGFBBBFP to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3000CNNFGFBBBFP(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3000CNNFGFBBBFPIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3000CNNFGFBBBFP_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3000_CNNFGFBBBFP = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000CNNFGFBBBFP() {
        unk3000CNNFGFBBBFP_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk3000_EMGMOECAJDK)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_EMGMOECAJDK)
    private static final emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK();
    }

    public static emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_EMGMOECAJDK>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_EMGMOECAJDK>() {
      @java.lang.Override
      public Unk3000_EMGMOECAJDK parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3000_EMGMOECAJDK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_EMGMOECAJDK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3000EMGMOECAJDK.Unk3000_EMGMOECAJDK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_EMGMOECAJDK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_EMGMOECAJDK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_EMGMOECAJDK.proto\"2\n\023Unk3000_E" +
      "MGMOECAJDK\022\033\n\023Unk3000_CNNFGFBBBFP\030\002 \003(\rB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_EMGMOECAJDK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_EMGMOECAJDK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_EMGMOECAJDK_descriptor,
        new java.lang.String[] { "Unk3000CNNFGFBBBFP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}