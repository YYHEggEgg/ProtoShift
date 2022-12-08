// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PhotoActivityFinishReq.proto

package emu.grasscutter.net.newproto;

public final class PhotoActivityFinishReqOuterClass {
  private PhotoActivityFinishReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PhotoActivityFinishReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PhotoActivityFinishReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pos_id = 8;</code>
     * @return The posId.
     */
    int getPosId();

    /**
     * <code>uint32 check_root_id = 11;</code>
     * @return The checkRootId.
     */
    int getCheckRootId();

    /**
     * <code>bool is_succ = 15;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8395;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code PhotoActivityFinishReq}
   */
  public static final class PhotoActivityFinishReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PhotoActivityFinishReq)
      PhotoActivityFinishReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PhotoActivityFinishReq.newBuilder() to construct.
    private PhotoActivityFinishReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PhotoActivityFinishReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PhotoActivityFinishReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.internal_static_PhotoActivityFinishReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.internal_static_PhotoActivityFinishReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq.class, emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq.Builder.class);
    }

    public static final int POS_ID_FIELD_NUMBER = 8;
    private int posId_;
    /**
     * <code>uint32 pos_id = 8;</code>
     * @return The posId.
     */
    @java.lang.Override
    public int getPosId() {
      return posId_;
    }

    public static final int CHECK_ROOT_ID_FIELD_NUMBER = 11;
    private int checkRootId_;
    /**
     * <code>uint32 check_root_id = 11;</code>
     * @return The checkRootId.
     */
    @java.lang.Override
    public int getCheckRootId() {
      return checkRootId_;
    }

    public static final int IS_SUCC_FIELD_NUMBER = 15;
    private boolean isSucc_;
    /**
     * <code>bool is_succ = 15;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
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
      if (posId_ != 0) {
        output.writeUInt32(8, posId_);
      }
      if (checkRootId_ != 0) {
        output.writeUInt32(11, checkRootId_);
      }
      if (isSucc_ != false) {
        output.writeBool(15, isSucc_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (posId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, posId_);
      }
      if (checkRootId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, checkRootId_);
      }
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isSucc_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq other = (emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq) obj;

      if (getPosId()
          != other.getPosId()) return false;
      if (getCheckRootId()
          != other.getCheckRootId()) return false;
      if (getIsSucc()
          != other.getIsSucc()) return false;
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
      hash = (37 * hash) + POS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPosId();
      hash = (37 * hash) + CHECK_ROOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCheckRootId();
      hash = (37 * hash) + IS_SUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq prototype) {
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
     *   CMD_ID = 8395;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code PhotoActivityFinishReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PhotoActivityFinishReq)
        emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.internal_static_PhotoActivityFinishReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.internal_static_PhotoActivityFinishReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq.class, emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        posId_ = 0;

        checkRootId_ = 0;

        isSucc_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.internal_static_PhotoActivityFinishReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq build() {
        emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq buildPartial() {
        emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq result = new emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq(this);
        result.posId_ = posId_;
        result.checkRootId_ = checkRootId_;
        result.isSucc_ = isSucc_;
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
        if (other instanceof emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq) {
          return mergeFrom((emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq other) {
        if (other == emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq.getDefaultInstance()) return this;
        if (other.getPosId() != 0) {
          setPosId(other.getPosId());
        }
        if (other.getCheckRootId() != 0) {
          setCheckRootId(other.getCheckRootId());
        }
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
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
              case 64: {
                posId_ = input.readUInt32();

                break;
              } // case 64
              case 88: {
                checkRootId_ = input.readUInt32();

                break;
              } // case 88
              case 120: {
                isSucc_ = input.readBool();

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

      private int posId_ ;
      /**
       * <code>uint32 pos_id = 8;</code>
       * @return The posId.
       */
      @java.lang.Override
      public int getPosId() {
        return posId_;
      }
      /**
       * <code>uint32 pos_id = 8;</code>
       * @param value The posId to set.
       * @return This builder for chaining.
       */
      public Builder setPosId(int value) {
        
        posId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pos_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPosId() {
        
        posId_ = 0;
        onChanged();
        return this;
      }

      private int checkRootId_ ;
      /**
       * <code>uint32 check_root_id = 11;</code>
       * @return The checkRootId.
       */
      @java.lang.Override
      public int getCheckRootId() {
        return checkRootId_;
      }
      /**
       * <code>uint32 check_root_id = 11;</code>
       * @param value The checkRootId to set.
       * @return This builder for chaining.
       */
      public Builder setCheckRootId(int value) {
        
        checkRootId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 check_root_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCheckRootId() {
        
        checkRootId_ = 0;
        onChanged();
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool is_succ = 15;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool is_succ = 15;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_succ = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
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


      // @@protoc_insertion_point(builder_scope:PhotoActivityFinishReq)
    }

    // @@protoc_insertion_point(class_scope:PhotoActivityFinishReq)
    private static final emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq();
    }

    public static emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PhotoActivityFinishReq>
        PARSER = new com.google.protobuf.AbstractParser<PhotoActivityFinishReq>() {
      @java.lang.Override
      public PhotoActivityFinishReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PhotoActivityFinishReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PhotoActivityFinishReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.PhotoActivityFinishReqOuterClass.PhotoActivityFinishReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PhotoActivityFinishReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PhotoActivityFinishReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034PhotoActivityFinishReq.proto\"P\n\026PhotoA" +
      "ctivityFinishReq\022\016\n\006pos_id\030\010 \001(\r\022\025\n\rchec" +
      "k_root_id\030\013 \001(\r\022\017\n\007is_succ\030\017 \001(\010B\036\n\034emu." +
      "grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PhotoActivityFinishReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PhotoActivityFinishReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PhotoActivityFinishReq_descriptor,
        new java.lang.String[] { "PosId", "CheckRootId", "IsSucc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}