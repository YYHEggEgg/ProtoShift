// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_DGBNCDEIIFC.proto

package emu.grasscutter.net.newproto;

public final class Unk3250DGBNCDEIIFC {
  private Unk3250DGBNCDEIIFC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_DGBNCDEIIFCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_DGBNCDEIIFC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
     * @return A list containing the unk3250IHJFJEEBBAB.
     */
    java.util.List<java.lang.Integer> getUnk3250IHJFJEEBBABList();
    /**
     * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
     * @return The count of unk3250IHJFJEEBBAB.
     */
    int getUnk3250IHJFJEEBBABCount();
    /**
     * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
     * @param index The index of the element to return.
     * @return The unk3250IHJFJEEBBAB at the given index.
     */
    int getUnk3250IHJFJEEBBAB(int index);
  }
  /**
   * <pre>
   * CmdId: 906
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3250_DGBNCDEIIFC}
   */
  public static final class Unk3250_DGBNCDEIIFC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_DGBNCDEIIFC)
      Unk3250_DGBNCDEIIFCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_DGBNCDEIIFC.newBuilder() to construct.
    private Unk3250_DGBNCDEIIFC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_DGBNCDEIIFC() {
      unk3250IHJFJEEBBAB_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_DGBNCDEIIFC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.internal_static_Unk3250_DGBNCDEIIFC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.internal_static_Unk3250_DGBNCDEIIFC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC.class, emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC.Builder.class);
    }

    public static final int UNK3250_IHJFJEEBBAB_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList unk3250IHJFJEEBBAB_;
    /**
     * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
     * @return A list containing the unk3250IHJFJEEBBAB.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3250IHJFJEEBBABList() {
      return unk3250IHJFJEEBBAB_;
    }
    /**
     * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
     * @return The count of unk3250IHJFJEEBBAB.
     */
    public int getUnk3250IHJFJEEBBABCount() {
      return unk3250IHJFJEEBBAB_.size();
    }
    /**
     * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
     * @param index The index of the element to return.
     * @return The unk3250IHJFJEEBBAB at the given index.
     */
    public int getUnk3250IHJFJEEBBAB(int index) {
      return unk3250IHJFJEEBBAB_.getInt(index);
    }
    private int unk3250IHJFJEEBBABMemoizedSerializedSize = -1;

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
      if (getUnk3250IHJFJEEBBABList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(unk3250IHJFJEEBBABMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3250IHJFJEEBBAB_.size(); i++) {
        output.writeUInt32NoTag(unk3250IHJFJEEBBAB_.getInt(i));
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
        for (int i = 0; i < unk3250IHJFJEEBBAB_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3250IHJFJEEBBAB_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3250IHJFJEEBBABList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3250IHJFJEEBBABMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC other = (emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC) obj;

      if (!getUnk3250IHJFJEEBBABList()
          .equals(other.getUnk3250IHJFJEEBBABList())) return false;
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
      if (getUnk3250IHJFJEEBBABCount() > 0) {
        hash = (37 * hash) + UNK3250_IHJFJEEBBAB_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250IHJFJEEBBABList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC prototype) {
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
     * CmdId: 906
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3250_DGBNCDEIIFC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_DGBNCDEIIFC)
        emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.internal_static_Unk3250_DGBNCDEIIFC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.internal_static_Unk3250_DGBNCDEIIFC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC.class, emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250IHJFJEEBBAB_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.internal_static_Unk3250_DGBNCDEIIFC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC build() {
        emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC buildPartial() {
        emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC result = new emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3250IHJFJEEBBAB_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3250IHJFJEEBBAB_ = unk3250IHJFJEEBBAB_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC other) {
        if (other == emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC.getDefaultInstance()) return this;
        if (!other.unk3250IHJFJEEBBAB_.isEmpty()) {
          if (unk3250IHJFJEEBBAB_.isEmpty()) {
            unk3250IHJFJEEBBAB_ = other.unk3250IHJFJEEBBAB_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3250IHJFJEEBBABIsMutable();
            unk3250IHJFJEEBBAB_.addAll(other.unk3250IHJFJEEBBAB_);
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
              case 112: {
                int v = input.readUInt32();
                ensureUnk3250IHJFJEEBBABIsMutable();
                unk3250IHJFJEEBBAB_.addInt(v);
                break;
              } // case 112
              case 114: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3250IHJFJEEBBABIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3250IHJFJEEBBAB_.addInt(input.readUInt32());
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

      private com.google.protobuf.Internal.IntList unk3250IHJFJEEBBAB_ = emptyIntList();
      private void ensureUnk3250IHJFJEEBBABIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3250IHJFJEEBBAB_ = mutableCopy(unk3250IHJFJEEBBAB_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
       * @return A list containing the unk3250IHJFJEEBBAB.
       */
      public java.util.List<java.lang.Integer>
          getUnk3250IHJFJEEBBABList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3250IHJFJEEBBAB_) : unk3250IHJFJEEBBAB_;
      }
      /**
       * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
       * @return The count of unk3250IHJFJEEBBAB.
       */
      public int getUnk3250IHJFJEEBBABCount() {
        return unk3250IHJFJEEBBAB_.size();
      }
      /**
       * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
       * @param index The index of the element to return.
       * @return The unk3250IHJFJEEBBAB at the given index.
       */
      public int getUnk3250IHJFJEEBBAB(int index) {
        return unk3250IHJFJEEBBAB_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
       * @param index The index to set the value at.
       * @param value The unk3250IHJFJEEBBAB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250IHJFJEEBBAB(
          int index, int value) {
        ensureUnk3250IHJFJEEBBABIsMutable();
        unk3250IHJFJEEBBAB_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
       * @param value The unk3250IHJFJEEBBAB to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3250IHJFJEEBBAB(int value) {
        ensureUnk3250IHJFJEEBBABIsMutable();
        unk3250IHJFJEEBBAB_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
       * @param values The unk3250IHJFJEEBBAB to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3250IHJFJEEBBAB(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3250IHJFJEEBBABIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3250IHJFJEEBBAB_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_IHJFJEEBBAB = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250IHJFJEEBBAB() {
        unk3250IHJFJEEBBAB_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk3250_DGBNCDEIIFC)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_DGBNCDEIIFC)
    private static final emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC();
    }

    public static emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_DGBNCDEIIFC>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_DGBNCDEIIFC>() {
      @java.lang.Override
      public Unk3250_DGBNCDEIIFC parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_DGBNCDEIIFC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_DGBNCDEIIFC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250DGBNCDEIIFC.Unk3250_DGBNCDEIIFC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_DGBNCDEIIFC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_DGBNCDEIIFC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_DGBNCDEIIFC.proto\"2\n\023Unk3250_D" +
      "GBNCDEIIFC\022\033\n\023Unk3250_IHJFJEEBBAB\030\016 \003(\rB" +
      "\036\n\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_DGBNCDEIIFC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_DGBNCDEIIFC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_DGBNCDEIIFC_descriptor,
        new java.lang.String[] { "Unk3250IHJFJEEBBAB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}