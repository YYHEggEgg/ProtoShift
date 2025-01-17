// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlessingAcceptGivePicRsp.proto

package emu.grasscutter.net.newproto;

public final class BlessingAcceptGivePicRspOuterClass {
  private BlessingAcceptGivePicRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlessingAcceptGivePicRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlessingAcceptGivePicRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 index = 15;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>uint32 pic_id = 12;</code>
     * @return The picId.
     */
    int getPicId();

    /**
     * <code>uint32 uid = 4;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2010;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code BlessingAcceptGivePicRsp}
   */
  public static final class BlessingAcceptGivePicRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlessingAcceptGivePicRsp)
      BlessingAcceptGivePicRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlessingAcceptGivePicRsp.newBuilder() to construct.
    private BlessingAcceptGivePicRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlessingAcceptGivePicRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlessingAcceptGivePicRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.internal_static_BlessingAcceptGivePicRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.internal_static_BlessingAcceptGivePicRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp.class, emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp.Builder.class);
    }

    public static final int INDEX_FIELD_NUMBER = 15;
    private int index_;
    /**
     * <code>uint32 index = 15;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    public static final int PIC_ID_FIELD_NUMBER = 12;
    private int picId_;
    /**
     * <code>uint32 pic_id = 12;</code>
     * @return The picId.
     */
    @java.lang.Override
    public int getPicId() {
      return picId_;
    }

    public static final int UID_FIELD_NUMBER = 4;
    private int uid_;
    /**
     * <code>uint32 uid = 4;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (uid_ != 0) {
        output.writeUInt32(4, uid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (picId_ != 0) {
        output.writeUInt32(12, picId_);
      }
      if (index_ != 0) {
        output.writeUInt32(15, index_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, uid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (picId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, picId_);
      }
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, index_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp other = (emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp) obj;

      if (getIndex()
          != other.getIndex()) return false;
      if (getPicId()
          != other.getPicId()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (37 * hash) + PIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPicId();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp prototype) {
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
     *   CMD_ID = 2010;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code BlessingAcceptGivePicRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlessingAcceptGivePicRsp)
        emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.internal_static_BlessingAcceptGivePicRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.internal_static_BlessingAcceptGivePicRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp.class, emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        index_ = 0;

        picId_ = 0;

        uid_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.internal_static_BlessingAcceptGivePicRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp build() {
        emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp buildPartial() {
        emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp result = new emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp(this);
        result.index_ = index_;
        result.picId_ = picId_;
        result.uid_ = uid_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp other) {
        if (other == emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp.getDefaultInstance()) return this;
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (other.getPicId() != 0) {
          setPicId(other.getPicId());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 32: {
                uid_ = input.readUInt32();

                break;
              } // case 32
              case 64: {
                retcode_ = input.readInt32();

                break;
              } // case 64
              case 96: {
                picId_ = input.readUInt32();

                break;
              } // case 96
              case 120: {
                index_ = input.readUInt32();

                break;
              } // case 120
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

      private int index_ ;
      /**
       * <code>uint32 index = 15;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 15;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }

      private int picId_ ;
      /**
       * <code>uint32 pic_id = 12;</code>
       * @return The picId.
       */
      @java.lang.Override
      public int getPicId() {
        return picId_;
      }
      /**
       * <code>uint32 pic_id = 12;</code>
       * @param value The picId to set.
       * @return This builder for chaining.
       */
      public Builder setPicId(int value) {
        
        picId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pic_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPicId() {
        
        picId_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 4;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 4;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BlessingAcceptGivePicRsp)
    }

    // @@protoc_insertion_point(class_scope:BlessingAcceptGivePicRsp)
    private static final emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp();
    }

    public static emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlessingAcceptGivePicRsp>
        PARSER = new com.google.protobuf.AbstractParser<BlessingAcceptGivePicRsp>() {
      @java.lang.Override
      public BlessingAcceptGivePicRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlessingAcceptGivePicRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlessingAcceptGivePicRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.BlessingAcceptGivePicRspOuterClass.BlessingAcceptGivePicRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlessingAcceptGivePicRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlessingAcceptGivePicRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036BlessingAcceptGivePicRsp.proto\"W\n\030Bles" +
      "singAcceptGivePicRsp\022\r\n\005index\030\017 \001(\r\022\016\n\006p" +
      "ic_id\030\014 \001(\r\022\013\n\003uid\030\004 \001(\r\022\017\n\007retcode\030\010 \001(" +
      "\005B\036\n\034emu.grasscutter.net.newprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlessingAcceptGivePicRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlessingAcceptGivePicRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlessingAcceptGivePicRsp_descriptor,
        new java.lang.String[] { "Index", "PicId", "Uid", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
