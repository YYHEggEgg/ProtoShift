// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayOwnerInviteNotify.proto

package emu.grasscutter.net.oldproto;

public final class MpPlayOwnerInviteNotifyOuterClass {
  private MpPlayOwnerInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayOwnerInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayOwnerInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cd = 12;</code>
     * @return The cd.
     */
    int getCd();

    /**
     * <code>uint32 mp_play_id = 13;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>bool is_remain_reward = 10;</code>
     * @return The isRemainReward.
     */
    boolean getIsRemainReward();
  }
  /**
   * <pre>
   * CmdId: 1835
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code MpPlayOwnerInviteNotify}
   */
  public static final class MpPlayOwnerInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayOwnerInviteNotify)
      MpPlayOwnerInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayOwnerInviteNotify.newBuilder() to construct.
    private MpPlayOwnerInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayOwnerInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayOwnerInviteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.class, emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.Builder.class);
    }

    public static final int CD_FIELD_NUMBER = 12;
    private int cd_;
    /**
     * <code>uint32 cd = 12;</code>
     * @return The cd.
     */
    @java.lang.Override
    public int getCd() {
      return cd_;
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 13;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 13;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int IS_REMAIN_REWARD_FIELD_NUMBER = 10;
    private boolean isRemainReward_;
    /**
     * <code>bool is_remain_reward = 10;</code>
     * @return The isRemainReward.
     */
    @java.lang.Override
    public boolean getIsRemainReward() {
      return isRemainReward_;
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
      if (isRemainReward_ != false) {
        output.writeBool(10, isRemainReward_);
      }
      if (cd_ != 0) {
        output.writeUInt32(12, cd_);
      }
      if (mpPlayId_ != 0) {
        output.writeUInt32(13, mpPlayId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isRemainReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isRemainReward_);
      }
      if (cd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, cd_);
      }
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, mpPlayId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify other = (emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify) obj;

      if (getCd()
          != other.getCd()) return false;
      if (getMpPlayId()
          != other.getMpPlayId()) return false;
      if (getIsRemainReward()
          != other.getIsRemainReward()) return false;
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
      hash = (37 * hash) + CD_FIELD_NUMBER;
      hash = (53 * hash) + getCd();
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (37 * hash) + IS_REMAIN_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRemainReward());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify prototype) {
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
     * CmdId: 1835
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code MpPlayOwnerInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayOwnerInviteNotify)
        emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.class, emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cd_ = 0;

        mpPlayId_ = 0;

        isRemainReward_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.internal_static_MpPlayOwnerInviteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify build() {
        emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify buildPartial() {
        emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify result = new emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify(this);
        result.cd_ = cd_;
        result.mpPlayId_ = mpPlayId_;
        result.isRemainReward_ = isRemainReward_;
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
        if (other instanceof emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify other) {
        if (other == emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify.getDefaultInstance()) return this;
        if (other.getCd() != 0) {
          setCd(other.getCd());
        }
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
        }
        if (other.getIsRemainReward() != false) {
          setIsRemainReward(other.getIsRemainReward());
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
              case 80: {
                isRemainReward_ = input.readBool();

                break;
              } // case 80
              case 96: {
                cd_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                mpPlayId_ = input.readUInt32();

                break;
              } // case 104
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

      private int cd_ ;
      /**
       * <code>uint32 cd = 12;</code>
       * @return The cd.
       */
      @java.lang.Override
      public int getCd() {
        return cd_;
      }
      /**
       * <code>uint32 cd = 12;</code>
       * @param value The cd to set.
       * @return This builder for chaining.
       */
      public Builder setCd(int value) {
        
        cd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCd() {
        
        cd_ = 0;
        onChanged();
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 13;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 13;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private boolean isRemainReward_ ;
      /**
       * <code>bool is_remain_reward = 10;</code>
       * @return The isRemainReward.
       */
      @java.lang.Override
      public boolean getIsRemainReward() {
        return isRemainReward_;
      }
      /**
       * <code>bool is_remain_reward = 10;</code>
       * @param value The isRemainReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsRemainReward(boolean value) {
        
        isRemainReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_remain_reward = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRemainReward() {
        
        isRemainReward_ = false;
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


      // @@protoc_insertion_point(builder_scope:MpPlayOwnerInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:MpPlayOwnerInviteNotify)
    private static final emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify();
    }

    public static emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayOwnerInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayOwnerInviteNotify>() {
      @java.lang.Override
      public MpPlayOwnerInviteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MpPlayOwnerInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayOwnerInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MpPlayOwnerInviteNotifyOuterClass.MpPlayOwnerInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayOwnerInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayOwnerInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035MpPlayOwnerInviteNotify.proto\"S\n\027MpPla" +
      "yOwnerInviteNotify\022\n\n\002cd\030\014 \001(\r\022\022\n\nmp_pla" +
      "y_id\030\r \001(\r\022\030\n\020is_remain_reward\030\n \001(\010B\036\n\034" +
      "emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayOwnerInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayOwnerInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayOwnerInviteNotify_descriptor,
        new java.lang.String[] { "Cd", "MpPlayId", "IsRemainReward", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
