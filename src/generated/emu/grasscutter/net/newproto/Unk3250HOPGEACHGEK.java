// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3250_HOPGEACHGEK.proto

package emu.grasscutter.net.newproto;

public final class Unk3250HOPGEACHGEK {
  private Unk3250HOPGEACHGEK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3250_HOPGEACHGEKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3250_HOPGEACHGEK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @return A list containing the unk3250JDGLLFNGLGI.
     */
    java.util.List<java.lang.Integer> getUnk3250JDGLLFNGLGIList();
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @return The count of unk3250JDGLLFNGLGI.
     */
    int getUnk3250JDGLLFNGLGICount();
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @param index The index of the element to return.
     * @return The unk3250JDGLLFNGLGI at the given index.
     */
    int getUnk3250JDGLLFNGLGI(int index);
  }
  /**
   * <pre>
   * CmdId: 5373
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3250_HOPGEACHGEK}
   */
  public static final class Unk3250_HOPGEACHGEK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3250_HOPGEACHGEK)
      Unk3250_HOPGEACHGEKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3250_HOPGEACHGEK.newBuilder() to construct.
    private Unk3250_HOPGEACHGEK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3250_HOPGEACHGEK() {
      unk3250JDGLLFNGLGI_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3250_HOPGEACHGEK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.internal_static_Unk3250_HOPGEACHGEK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.internal_static_Unk3250_HOPGEACHGEK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK.class, emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int UNK3250_JDGLLFNGLGI_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList unk3250JDGLLFNGLGI_;
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @return A list containing the unk3250JDGLLFNGLGI.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnk3250JDGLLFNGLGIList() {
      return unk3250JDGLLFNGLGI_;
    }
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @return The count of unk3250JDGLLFNGLGI.
     */
    public int getUnk3250JDGLLFNGLGICount() {
      return unk3250JDGLLFNGLGI_.size();
    }
    /**
     * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
     * @param index The index of the element to return.
     * @return The unk3250JDGLLFNGLGI at the given index.
     */
    public int getUnk3250JDGLLFNGLGI(int index) {
      return unk3250JDGLLFNGLGI_.getInt(index);
    }
    private int unk3250JDGLLFNGLGIMemoizedSerializedSize = -1;

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
      if (getUnk3250JDGLLFNGLGIList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(unk3250JDGLLFNGLGIMemoizedSerializedSize);
      }
      for (int i = 0; i < unk3250JDGLLFNGLGI_.size(); i++) {
        output.writeUInt32NoTag(unk3250JDGLLFNGLGI_.getInt(i));
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
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
        for (int i = 0; i < unk3250JDGLLFNGLGI_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unk3250JDGLLFNGLGI_.getInt(i));
        }
        size += dataSize;
        if (!getUnk3250JDGLLFNGLGIList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unk3250JDGLLFNGLGIMemoizedSerializedSize = dataSize;
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK other = (emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getUnk3250JDGLLFNGLGIList()
          .equals(other.getUnk3250JDGLLFNGLGIList())) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (getUnk3250JDGLLFNGLGICount() > 0) {
        hash = (37 * hash) + UNK3250_JDGLLFNGLGI_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3250JDGLLFNGLGIList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK prototype) {
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
     * CmdId: 5373
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3250_HOPGEACHGEK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3250_HOPGEACHGEK)
        emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.internal_static_Unk3250_HOPGEACHGEK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.internal_static_Unk3250_HOPGEACHGEK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK.class, emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        uid_ = 0;

        unk3250JDGLLFNGLGI_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.internal_static_Unk3250_HOPGEACHGEK_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK build() {
        emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK buildPartial() {
        emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK result = new emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK(this);
        int from_bitField0_ = bitField0_;
        result.uid_ = uid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unk3250JDGLLFNGLGI_ = unk3250JDGLLFNGLGI_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK other) {
        if (other == emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.unk3250JDGLLFNGLGI_.isEmpty()) {
          if (unk3250JDGLLFNGLGI_.isEmpty()) {
            unk3250JDGLLFNGLGI_ = other.unk3250JDGLLFNGLGI_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnk3250JDGLLFNGLGIIsMutable();
            unk3250JDGLLFNGLGI_.addAll(other.unk3250JDGLLFNGLGI_);
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
                ensureUnk3250JDGLLFNGLGIIsMutable();
                unk3250JDGLLFNGLGI_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUnk3250JDGLLFNGLGIIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  unk3250JDGLLFNGLGI_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 18
              case 80: {
                uid_ = input.readUInt32();

                break;
              } // case 80
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

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList unk3250JDGLLFNGLGI_ = emptyIntList();
      private void ensureUnk3250JDGLLFNGLGIIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3250JDGLLFNGLGI_ = mutableCopy(unk3250JDGLLFNGLGI_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @return A list containing the unk3250JDGLLFNGLGI.
       */
      public java.util.List<java.lang.Integer>
          getUnk3250JDGLLFNGLGIList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unk3250JDGLLFNGLGI_) : unk3250JDGLLFNGLGI_;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @return The count of unk3250JDGLLFNGLGI.
       */
      public int getUnk3250JDGLLFNGLGICount() {
        return unk3250JDGLLFNGLGI_.size();
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @param index The index of the element to return.
       * @return The unk3250JDGLLFNGLGI at the given index.
       */
      public int getUnk3250JDGLLFNGLGI(int index) {
        return unk3250JDGLLFNGLGI_.getInt(index);
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @param index The index to set the value at.
       * @param value The unk3250JDGLLFNGLGI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250JDGLLFNGLGI(
          int index, int value) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        unk3250JDGLLFNGLGI_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @param value The unk3250JDGLLFNGLGI to add.
       * @return This builder for chaining.
       */
      public Builder addUnk3250JDGLLFNGLGI(int value) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        unk3250JDGLLFNGLGI_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @param values The unk3250JDGLLFNGLGI to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnk3250JDGLLFNGLGI(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnk3250JDGLLFNGLGIIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unk3250JDGLLFNGLGI_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 Unk3250_JDGLLFNGLGI = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250JDGLLFNGLGI() {
        unk3250JDGLLFNGLGI_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:Unk3250_HOPGEACHGEK)
    }

    // @@protoc_insertion_point(class_scope:Unk3250_HOPGEACHGEK)
    private static final emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK();
    }

    public static emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3250_HOPGEACHGEK>
        PARSER = new com.google.protobuf.AbstractParser<Unk3250_HOPGEACHGEK>() {
      @java.lang.Override
      public Unk3250_HOPGEACHGEK parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3250_HOPGEACHGEK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3250_HOPGEACHGEK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3250HOPGEACHGEK.Unk3250_HOPGEACHGEK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3250_HOPGEACHGEK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3250_HOPGEACHGEK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3250_HOPGEACHGEK.proto\"?\n\023Unk3250_H" +
      "OPGEACHGEK\022\013\n\003uid\030\n \001(\r\022\033\n\023Unk3250_JDGLL" +
      "FNGLGI\030\002 \003(\rB\036\n\034emu.grasscutter.net.newp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3250_HOPGEACHGEK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3250_HOPGEACHGEK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3250_HOPGEACHGEK_descriptor,
        new java.lang.String[] { "Uid", "Unk3250JDGLLFNGLGI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
