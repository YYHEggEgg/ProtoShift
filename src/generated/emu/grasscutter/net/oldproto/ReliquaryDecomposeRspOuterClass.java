// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryDecomposeRsp.proto

package emu.grasscutter.net.oldproto;

public final class ReliquaryDecomposeRspOuterClass {
  private ReliquaryDecomposeRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryDecomposeRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryDecomposeRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint64 guid_list = 14;</code>
     * @return A list containing the guidList.
     */
    java.util.List<java.lang.Long> getGuidListList();
    /**
     * <code>repeated uint64 guid_list = 14;</code>
     * @return The count of guidList.
     */
    int getGuidListCount();
    /**
     * <code>repeated uint64 guid_list = 14;</code>
     * @param index The index of the element to return.
     * @return The guidList at the given index.
     */
    long getGuidList(int index);
  }
  /**
   * <pre>
   * CmdId: 611
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ReliquaryDecomposeRsp}
   */
  public static final class ReliquaryDecomposeRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryDecomposeRsp)
      ReliquaryDecomposeRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryDecomposeRsp.newBuilder() to construct.
    private ReliquaryDecomposeRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryDecomposeRsp() {
      guidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryDecomposeRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp.class, emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GUID_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.LongList guidList_;
    /**
     * <code>repeated uint64 guid_list = 14;</code>
     * @return A list containing the guidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getGuidListList() {
      return guidList_;
    }
    /**
     * <code>repeated uint64 guid_list = 14;</code>
     * @return The count of guidList.
     */
    public int getGuidListCount() {
      return guidList_.size();
    }
    /**
     * <code>repeated uint64 guid_list = 14;</code>
     * @param index The index of the element to return.
     * @return The guidList at the given index.
     */
    public long getGuidList(int index) {
      return guidList_.getLong(index);
    }
    private int guidListMemoizedSerializedSize = -1;

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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (getGuidListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(guidListMemoizedSerializedSize);
      }
      for (int i = 0; i < guidList_.size(); i++) {
        output.writeUInt64NoTag(guidList_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < guidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(guidList_.getLong(i));
        }
        size += dataSize;
        if (!getGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        guidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp other = (emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getGuidListList()
          .equals(other.getGuidListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getGuidListCount() > 0) {
        hash = (37 * hash) + GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getGuidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp prototype) {
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
     * CmdId: 611
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ReliquaryDecomposeRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryDecomposeRsp)
        emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp.class, emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        guidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp build() {
        emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp buildPartial() {
        emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp result = new emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          guidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.guidList_ = guidList_;
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
        if (other instanceof emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp other) {
        if (other == emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.guidList_.isEmpty()) {
          if (guidList_.isEmpty()) {
            guidList_ = other.guidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGuidListIsMutable();
            guidList_.addAll(other.guidList_);
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
              case 24: {
                retcode_ = input.readInt32();

                break;
              } // case 24
              case 112: {
                long v = input.readUInt64();
                ensureGuidListIsMutable();
                guidList_.addLong(v);
                break;
              } // case 112
              case 114: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  guidList_.addLong(input.readUInt64());
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList guidList_ = emptyLongList();
      private void ensureGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          guidList_ = mutableCopy(guidList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 guid_list = 14;</code>
       * @return A list containing the guidList.
       */
      public java.util.List<java.lang.Long>
          getGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(guidList_) : guidList_;
      }
      /**
       * <code>repeated uint64 guid_list = 14;</code>
       * @return The count of guidList.
       */
      public int getGuidListCount() {
        return guidList_.size();
      }
      /**
       * <code>repeated uint64 guid_list = 14;</code>
       * @param index The index of the element to return.
       * @return The guidList at the given index.
       */
      public long getGuidList(int index) {
        return guidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 guid_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The guidList to set.
       * @return This builder for chaining.
       */
      public Builder setGuidList(
          int index, long value) {
        ensureGuidListIsMutable();
        guidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guid_list = 14;</code>
       * @param value The guidList to add.
       * @return This builder for chaining.
       */
      public Builder addGuidList(long value) {
        ensureGuidListIsMutable();
        guidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guid_list = 14;</code>
       * @param values The guidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, guidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 guid_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuidList() {
        guidList_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:ReliquaryDecomposeRsp)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryDecomposeRsp)
    private static final emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp();
    }

    public static emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryDecomposeRsp>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryDecomposeRsp>() {
      @java.lang.Override
      public ReliquaryDecomposeRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReliquaryDecomposeRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryDecomposeRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ReliquaryDecomposeRspOuterClass.ReliquaryDecomposeRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryDecomposeRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryDecomposeRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ReliquaryDecomposeRsp.proto\";\n\025Reliqua" +
      "ryDecomposeRsp\022\017\n\007retcode\030\003 \001(\005\022\021\n\tguid_" +
      "list\030\016 \003(\004B\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReliquaryDecomposeRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryDecomposeRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryDecomposeRsp_descriptor,
        new java.lang.String[] { "Retcode", "GuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}