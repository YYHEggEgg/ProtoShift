// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueHealAvatarsRsp.proto

package emu.grasscutter.net.oldproto;

public final class RogueHealAvatarsRspOuterClass {
  private RogueHealAvatarsRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueHealAvatarsRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueHealAvatarsRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 10;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 cell_id = 14;</code>
     * @return The cellId.
     */
    int getCellId();
  }
  /**
   * <pre>
   * CmdId: 8949
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code RogueHealAvatarsRsp}
   */
  public static final class RogueHealAvatarsRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueHealAvatarsRsp)
      RogueHealAvatarsRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueHealAvatarsRsp.newBuilder() to construct.
    private RogueHealAvatarsRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueHealAvatarsRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueHealAvatarsRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.internal_static_RogueHealAvatarsRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.internal_static_RogueHealAvatarsRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp.class, emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 10;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 10;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CELL_ID_FIELD_NUMBER = 14;
    private int cellId_;
    /**
     * <code>uint32 cell_id = 14;</code>
     * @return The cellId.
     */
    @java.lang.Override
    public int getCellId() {
      return cellId_;
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
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(10, dungeonId_);
      }
      if (cellId_ != 0) {
        output.writeUInt32(14, cellId_);
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
          .computeInt32Size(9, retcode_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, dungeonId_);
      }
      if (cellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, cellId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp other = (emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCellId()
          != other.getCellId()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp prototype) {
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
     * CmdId: 8949
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code RogueHealAvatarsRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueHealAvatarsRsp)
        emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.internal_static_RogueHealAvatarsRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.internal_static_RogueHealAvatarsRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp.class, emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        dungeonId_ = 0;

        retcode_ = 0;

        cellId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.internal_static_RogueHealAvatarsRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp build() {
        emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp buildPartial() {
        emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp result = new emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp(this);
        result.dungeonId_ = dungeonId_;
        result.retcode_ = retcode_;
        result.cellId_ = cellId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp other) {
        if (other == emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCellId() != 0) {
          setCellId(other.getCellId());
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
              case 72: {
                retcode_ = input.readInt32();

                break;
              } // case 72
              case 80: {
                dungeonId_ = input.readUInt32();

                break;
              } // case 80
              case 112: {
                cellId_ = input.readUInt32();

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

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int cellId_ ;
      /**
       * <code>uint32 cell_id = 14;</code>
       * @return The cellId.
       */
      @java.lang.Override
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>uint32 cell_id = 14;</code>
       * @param value The cellId to set.
       * @return This builder for chaining.
       */
      public Builder setCellId(int value) {
        
        cellId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellId() {
        
        cellId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RogueHealAvatarsRsp)
    }

    // @@protoc_insertion_point(class_scope:RogueHealAvatarsRsp)
    private static final emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp();
    }

    public static emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueHealAvatarsRsp>
        PARSER = new com.google.protobuf.AbstractParser<RogueHealAvatarsRsp>() {
      @java.lang.Override
      public RogueHealAvatarsRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueHealAvatarsRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueHealAvatarsRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.RogueHealAvatarsRspOuterClass.RogueHealAvatarsRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueHealAvatarsRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueHealAvatarsRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031RogueHealAvatarsRsp.proto\"K\n\023RogueHeal" +
      "AvatarsRsp\022\022\n\ndungeon_id\030\n \001(\r\022\017\n\007retcod" +
      "e\030\t \001(\005\022\017\n\007cell_id\030\016 \001(\rB\036\n\034emu.grasscut" +
      "ter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RogueHealAvatarsRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueHealAvatarsRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueHealAvatarsRsp_descriptor,
        new java.lang.String[] { "DungeonId", "Retcode", "CellId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
