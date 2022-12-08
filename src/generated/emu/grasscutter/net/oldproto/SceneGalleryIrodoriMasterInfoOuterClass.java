// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryIrodoriMasterInfo.proto

package emu.grasscutter.net.oldproto;

public final class SceneGalleryIrodoriMasterInfoOuterClass {
  private SceneGalleryIrodoriMasterInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryIrodoriMasterInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryIrodoriMasterInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 8;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 difficulty = 1;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>bool is_cg_viewed = 5;</code>
     * @return The isCgViewed.
     */
    boolean getIsCgViewed();
  }
  /**
   * Protobuf type {@code SceneGalleryIrodoriMasterInfo}
   */
  public static final class SceneGalleryIrodoriMasterInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryIrodoriMasterInfo)
      SceneGalleryIrodoriMasterInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryIrodoriMasterInfo.newBuilder() to construct.
    private SceneGalleryIrodoriMasterInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryIrodoriMasterInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryIrodoriMasterInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.internal_static_SceneGalleryIrodoriMasterInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.internal_static_SceneGalleryIrodoriMasterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo.class, emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 8;
    private int levelId_;
    /**
     * <code>uint32 level_id = 8;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 1;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 1;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int IS_CG_VIEWED_FIELD_NUMBER = 5;
    private boolean isCgViewed_;
    /**
     * <code>bool is_cg_viewed = 5;</code>
     * @return The isCgViewed.
     */
    @java.lang.Override
    public boolean getIsCgViewed() {
      return isCgViewed_;
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
      if (difficulty_ != 0) {
        output.writeUInt32(1, difficulty_);
      }
      if (isCgViewed_ != false) {
        output.writeBool(5, isCgViewed_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(8, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, difficulty_);
      }
      if (isCgViewed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isCgViewed_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo other = (emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getIsCgViewed()
          != other.getIsCgViewed()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + IS_CG_VIEWED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCgViewed());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo prototype) {
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
     * Protobuf type {@code SceneGalleryIrodoriMasterInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryIrodoriMasterInfo)
        emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.internal_static_SceneGalleryIrodoriMasterInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.internal_static_SceneGalleryIrodoriMasterInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo.class, emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        levelId_ = 0;

        difficulty_ = 0;

        isCgViewed_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.internal_static_SceneGalleryIrodoriMasterInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo build() {
        emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo buildPartial() {
        emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo result = new emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo(this);
        result.levelId_ = levelId_;
        result.difficulty_ = difficulty_;
        result.isCgViewed_ = isCgViewed_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo other) {
        if (other == emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getIsCgViewed() != false) {
          setIsCgViewed(other.getIsCgViewed());
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
              case 8: {
                difficulty_ = input.readUInt32();

                break;
              } // case 8
              case 40: {
                isCgViewed_ = input.readBool();

                break;
              } // case 40
              case 64: {
                levelId_ = input.readUInt32();

                break;
              } // case 64
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 8;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 8;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 1;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 1;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private boolean isCgViewed_ ;
      /**
       * <code>bool is_cg_viewed = 5;</code>
       * @return The isCgViewed.
       */
      @java.lang.Override
      public boolean getIsCgViewed() {
        return isCgViewed_;
      }
      /**
       * <code>bool is_cg_viewed = 5;</code>
       * @param value The isCgViewed to set.
       * @return This builder for chaining.
       */
      public Builder setIsCgViewed(boolean value) {
        
        isCgViewed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_cg_viewed = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCgViewed() {
        
        isCgViewed_ = false;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryIrodoriMasterInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryIrodoriMasterInfo)
    private static final emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo();
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryIrodoriMasterInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryIrodoriMasterInfo>() {
      @java.lang.Override
      public SceneGalleryIrodoriMasterInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryIrodoriMasterInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryIrodoriMasterInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SceneGalleryIrodoriMasterInfoOuterClass.SceneGalleryIrodoriMasterInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryIrodoriMasterInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryIrodoriMasterInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGalleryIrodoriMasterInfo.proto\"[\n" +
      "\035SceneGalleryIrodoriMasterInfo\022\020\n\010level_" +
      "id\030\010 \001(\r\022\022\n\ndifficulty\030\001 \001(\r\022\024\n\014is_cg_vi" +
      "ewed\030\005 \001(\010B\036\n\034emu.grasscutter.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryIrodoriMasterInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryIrodoriMasterInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryIrodoriMasterInfo_descriptor,
        new java.lang.String[] { "LevelId", "Difficulty", "IsCgViewed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}