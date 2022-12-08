// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestDestroyNpcRsp.proto

package emu.grasscutter.net.newproto;

public final class QuestDestroyNpcRspOuterClass {
  private QuestDestroyNpcRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestDestroyNpcRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestDestroyNpcRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 npc_id = 14;</code>
     * @return The npcId.
     */
    int getNpcId();

    /**
     * <code>uint32 parent_quest_id = 8;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 489;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code QuestDestroyNpcRsp}
   */
  public static final class QuestDestroyNpcRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestDestroyNpcRsp)
      QuestDestroyNpcRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestDestroyNpcRsp.newBuilder() to construct.
    private QuestDestroyNpcRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestDestroyNpcRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestDestroyNpcRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.internal_static_QuestDestroyNpcRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.internal_static_QuestDestroyNpcRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp.class, emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp.Builder.class);
    }

    public static final int NPC_ID_FIELD_NUMBER = 14;
    private int npcId_;
    /**
     * <code>uint32 npc_id = 14;</code>
     * @return The npcId.
     */
    @java.lang.Override
    public int getNpcId() {
      return npcId_;
    }

    public static final int PARENT_QUEST_ID_FIELD_NUMBER = 8;
    private int parentQuestId_;
    /**
     * <code>uint32 parent_quest_id = 8;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_;
    /**
     * <code>int32 retcode = 13;</code>
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
      if (parentQuestId_ != 0) {
        output.writeUInt32(8, parentQuestId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      if (npcId_ != 0) {
        output.writeUInt32(14, npcId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, parentQuestId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
      }
      if (npcId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, npcId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp other = (emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp) obj;

      if (getNpcId()
          != other.getNpcId()) return false;
      if (getParentQuestId()
          != other.getParentQuestId()) return false;
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
      hash = (37 * hash) + NPC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcId();
      hash = (37 * hash) + PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp prototype) {
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
     *   CMD_ID = 489;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code QuestDestroyNpcRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestDestroyNpcRsp)
        emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.internal_static_QuestDestroyNpcRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.internal_static_QuestDestroyNpcRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp.class, emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        npcId_ = 0;

        parentQuestId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.internal_static_QuestDestroyNpcRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp build() {
        emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp buildPartial() {
        emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp result = new emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp(this);
        result.npcId_ = npcId_;
        result.parentQuestId_ = parentQuestId_;
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
        if (other instanceof emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp) {
          return mergeFrom((emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp other) {
        if (other == emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp.getDefaultInstance()) return this;
        if (other.getNpcId() != 0) {
          setNpcId(other.getNpcId());
        }
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
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
              case 64: {
                parentQuestId_ = input.readUInt32();

                break;
              } // case 64
              case 104: {
                retcode_ = input.readInt32();

                break;
              } // case 104
              case 112: {
                npcId_ = input.readUInt32();

                break;
              } // case 112
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

      private int npcId_ ;
      /**
       * <code>uint32 npc_id = 14;</code>
       * @return The npcId.
       */
      @java.lang.Override
      public int getNpcId() {
        return npcId_;
      }
      /**
       * <code>uint32 npc_id = 14;</code>
       * @param value The npcId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcId(int value) {
        
        npcId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcId() {
        
        npcId_ = 0;
        onChanged();
        return this;
      }

      private int parentQuestId_ ;
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parent_quest_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 13;</code>
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


      // @@protoc_insertion_point(builder_scope:QuestDestroyNpcRsp)
    }

    // @@protoc_insertion_point(class_scope:QuestDestroyNpcRsp)
    private static final emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp();
    }

    public static emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestDestroyNpcRsp>
        PARSER = new com.google.protobuf.AbstractParser<QuestDestroyNpcRsp>() {
      @java.lang.Override
      public QuestDestroyNpcRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestDestroyNpcRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestDestroyNpcRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.QuestDestroyNpcRspOuterClass.QuestDestroyNpcRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestDestroyNpcRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestDestroyNpcRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030QuestDestroyNpcRsp.proto\"N\n\022QuestDestr" +
      "oyNpcRsp\022\016\n\006npc_id\030\016 \001(\r\022\027\n\017parent_quest" +
      "_id\030\010 \001(\r\022\017\n\007retcode\030\r \001(\005B\036\n\034emu.grassc" +
      "utter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestDestroyNpcRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestDestroyNpcRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestDestroyNpcRsp_descriptor,
        new java.lang.String[] { "NpcId", "ParentQuestId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}