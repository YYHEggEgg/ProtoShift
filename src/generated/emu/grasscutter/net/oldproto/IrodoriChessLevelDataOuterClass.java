// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessLevelData.proto

package emu.grasscutter.net.oldproto;

public final class IrodoriChessLevelDataOuterClass {
  private IrodoriChessLevelDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessLevelDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessLevelData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 open_time = 8;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>.IrodoriChessMapData hard_map_data = 7;</code>
     * @return Whether the hardMapData field is set.
     */
    boolean hasHardMapData();
    /**
     * <code>.IrodoriChessMapData hard_map_data = 7;</code>
     * @return The hardMapData.
     */
    emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getHardMapData();
    /**
     * <code>.IrodoriChessMapData hard_map_data = 7;</code>
     */
    emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getHardMapDataOrBuilder();

    /**
     * <code>.IrodoriChessMapData normal_map_data = 11;</code>
     * @return Whether the normalMapData field is set.
     */
    boolean hasNormalMapData();
    /**
     * <code>.IrodoriChessMapData normal_map_data = 11;</code>
     * @return The normalMapData.
     */
    emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getNormalMapData();
    /**
     * <code>.IrodoriChessMapData normal_map_data = 11;</code>
     */
    emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getNormalMapDataOrBuilder();
  }
  /**
   * Protobuf type {@code IrodoriChessLevelData}
   */
  public static final class IrodoriChessLevelData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessLevelData)
      IrodoriChessLevelDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessLevelData.newBuilder() to construct.
    private IrodoriChessLevelData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessLevelData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessLevelData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.class, emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder.class);
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 8;
    private int openTime_;
    /**
     * <code>uint32 open_time = 8;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 15;
    private int levelId_;
    /**
     * <code>uint32 level_id = 15;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int HARD_MAP_DATA_FIELD_NUMBER = 7;
    private emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData hardMapData_;
    /**
     * <code>.IrodoriChessMapData hard_map_data = 7;</code>
     * @return Whether the hardMapData field is set.
     */
    @java.lang.Override
    public boolean hasHardMapData() {
      return hardMapData_ != null;
    }
    /**
     * <code>.IrodoriChessMapData hard_map_data = 7;</code>
     * @return The hardMapData.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getHardMapData() {
      return hardMapData_ == null ? emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : hardMapData_;
    }
    /**
     * <code>.IrodoriChessMapData hard_map_data = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getHardMapDataOrBuilder() {
      return getHardMapData();
    }

    public static final int NORMAL_MAP_DATA_FIELD_NUMBER = 11;
    private emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData normalMapData_;
    /**
     * <code>.IrodoriChessMapData normal_map_data = 11;</code>
     * @return Whether the normalMapData field is set.
     */
    @java.lang.Override
    public boolean hasNormalMapData() {
      return normalMapData_ != null;
    }
    /**
     * <code>.IrodoriChessMapData normal_map_data = 11;</code>
     * @return The normalMapData.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getNormalMapData() {
      return normalMapData_ == null ? emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : normalMapData_;
    }
    /**
     * <code>.IrodoriChessMapData normal_map_data = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getNormalMapDataOrBuilder() {
      return getNormalMapData();
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
      if (hardMapData_ != null) {
        output.writeMessage(7, getHardMapData());
      }
      if (openTime_ != 0) {
        output.writeUInt32(8, openTime_);
      }
      if (normalMapData_ != null) {
        output.writeMessage(11, getNormalMapData());
      }
      if (levelId_ != 0) {
        output.writeUInt32(15, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hardMapData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getHardMapData());
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, openTime_);
      }
      if (normalMapData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getNormalMapData());
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData other = (emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData) obj;

      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (hasHardMapData() != other.hasHardMapData()) return false;
      if (hasHardMapData()) {
        if (!getHardMapData()
            .equals(other.getHardMapData())) return false;
      }
      if (hasNormalMapData() != other.hasNormalMapData()) return false;
      if (hasNormalMapData()) {
        if (!getNormalMapData()
            .equals(other.getNormalMapData())) return false;
      }
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
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (hasHardMapData()) {
        hash = (37 * hash) + HARD_MAP_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getHardMapData().hashCode();
      }
      if (hasNormalMapData()) {
        hash = (37 * hash) + NORMAL_MAP_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getNormalMapData().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData prototype) {
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
     * Protobuf type {@code IrodoriChessLevelData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessLevelData)
        emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.class, emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        openTime_ = 0;

        levelId_ = 0;

        if (hardMapDataBuilder_ == null) {
          hardMapData_ = null;
        } else {
          hardMapData_ = null;
          hardMapDataBuilder_ = null;
        }
        if (normalMapDataBuilder_ == null) {
          normalMapData_ = null;
        } else {
          normalMapData_ = null;
          normalMapDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.internal_static_IrodoriChessLevelData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData build() {
        emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData buildPartial() {
        emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData result = new emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData(this);
        result.openTime_ = openTime_;
        result.levelId_ = levelId_;
        if (hardMapDataBuilder_ == null) {
          result.hardMapData_ = hardMapData_;
        } else {
          result.hardMapData_ = hardMapDataBuilder_.build();
        }
        if (normalMapDataBuilder_ == null) {
          result.normalMapData_ = normalMapData_;
        } else {
          result.normalMapData_ = normalMapDataBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData) {
          return mergeFrom((emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData other) {
        if (other == emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData.getDefaultInstance()) return this;
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.hasHardMapData()) {
          mergeHardMapData(other.getHardMapData());
        }
        if (other.hasNormalMapData()) {
          mergeNormalMapData(other.getNormalMapData());
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
              case 58: {
                input.readMessage(
                    getHardMapDataFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 58
              case 64: {
                openTime_ = input.readUInt32();

                break;
              } // case 64
              case 90: {
                input.readMessage(
                    getNormalMapDataFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 90
              case 120: {
                levelId_ = input.readUInt32();

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

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 8;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 8;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 15;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData hardMapData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder> hardMapDataBuilder_;
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       * @return Whether the hardMapData field is set.
       */
      public boolean hasHardMapData() {
        return hardMapDataBuilder_ != null || hardMapData_ != null;
      }
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       * @return The hardMapData.
       */
      public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getHardMapData() {
        if (hardMapDataBuilder_ == null) {
          return hardMapData_ == null ? emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : hardMapData_;
        } else {
          return hardMapDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       */
      public Builder setHardMapData(emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData value) {
        if (hardMapDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hardMapData_ = value;
          onChanged();
        } else {
          hardMapDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       */
      public Builder setHardMapData(
          emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder builderForValue) {
        if (hardMapDataBuilder_ == null) {
          hardMapData_ = builderForValue.build();
          onChanged();
        } else {
          hardMapDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       */
      public Builder mergeHardMapData(emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData value) {
        if (hardMapDataBuilder_ == null) {
          if (hardMapData_ != null) {
            hardMapData_ =
              emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.newBuilder(hardMapData_).mergeFrom(value).buildPartial();
          } else {
            hardMapData_ = value;
          }
          onChanged();
        } else {
          hardMapDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       */
      public Builder clearHardMapData() {
        if (hardMapDataBuilder_ == null) {
          hardMapData_ = null;
          onChanged();
        } else {
          hardMapData_ = null;
          hardMapDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       */
      public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder getHardMapDataBuilder() {
        
        onChanged();
        return getHardMapDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       */
      public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getHardMapDataOrBuilder() {
        if (hardMapDataBuilder_ != null) {
          return hardMapDataBuilder_.getMessageOrBuilder();
        } else {
          return hardMapData_ == null ?
              emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : hardMapData_;
        }
      }
      /**
       * <code>.IrodoriChessMapData hard_map_data = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder> 
          getHardMapDataFieldBuilder() {
        if (hardMapDataBuilder_ == null) {
          hardMapDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder>(
                  getHardMapData(),
                  getParentForChildren(),
                  isClean());
          hardMapData_ = null;
        }
        return hardMapDataBuilder_;
      }

      private emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData normalMapData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder> normalMapDataBuilder_;
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       * @return Whether the normalMapData field is set.
       */
      public boolean hasNormalMapData() {
        return normalMapDataBuilder_ != null || normalMapData_ != null;
      }
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       * @return The normalMapData.
       */
      public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData getNormalMapData() {
        if (normalMapDataBuilder_ == null) {
          return normalMapData_ == null ? emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : normalMapData_;
        } else {
          return normalMapDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       */
      public Builder setNormalMapData(emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData value) {
        if (normalMapDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          normalMapData_ = value;
          onChanged();
        } else {
          normalMapDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       */
      public Builder setNormalMapData(
          emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder builderForValue) {
        if (normalMapDataBuilder_ == null) {
          normalMapData_ = builderForValue.build();
          onChanged();
        } else {
          normalMapDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       */
      public Builder mergeNormalMapData(emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData value) {
        if (normalMapDataBuilder_ == null) {
          if (normalMapData_ != null) {
            normalMapData_ =
              emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.newBuilder(normalMapData_).mergeFrom(value).buildPartial();
          } else {
            normalMapData_ = value;
          }
          onChanged();
        } else {
          normalMapDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       */
      public Builder clearNormalMapData() {
        if (normalMapDataBuilder_ == null) {
          normalMapData_ = null;
          onChanged();
        } else {
          normalMapData_ = null;
          normalMapDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       */
      public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder getNormalMapDataBuilder() {
        
        onChanged();
        return getNormalMapDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       */
      public emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder getNormalMapDataOrBuilder() {
        if (normalMapDataBuilder_ != null) {
          return normalMapDataBuilder_.getMessageOrBuilder();
        } else {
          return normalMapData_ == null ?
              emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.getDefaultInstance() : normalMapData_;
        }
      }
      /**
       * <code>.IrodoriChessMapData normal_map_data = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder> 
          getNormalMapDataFieldBuilder() {
        if (normalMapDataBuilder_ == null) {
          normalMapDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapData.Builder, emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.IrodoriChessMapDataOrBuilder>(
                  getNormalMapData(),
                  getParentForChildren(),
                  isClean());
          normalMapData_ = null;
        }
        return normalMapDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessLevelData)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessLevelData)
    private static final emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData();
    }

    public static emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessLevelData>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessLevelData>() {
      @java.lang.Override
      public IrodoriChessLevelData parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriChessLevelData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessLevelData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessLevelDataOuterClass.IrodoriChessLevelData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessLevelData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessLevelData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033IrodoriChessLevelData.proto\032\031IrodoriCh" +
      "essMapData.proto\"\230\001\n\025IrodoriChessLevelDa" +
      "ta\022\021\n\topen_time\030\010 \001(\r\022\020\n\010level_id\030\017 \001(\r\022" +
      "+\n\rhard_map_data\030\007 \001(\0132\024.IrodoriChessMap" +
      "Data\022-\n\017normal_map_data\030\013 \001(\0132\024.IrodoriC" +
      "hessMapDataB\036\n\034emu.grasscutter.net.oldpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.getDescriptor(),
        });
    internal_static_IrodoriChessLevelData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessLevelData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessLevelData_descriptor,
        new java.lang.String[] { "OpenTime", "LevelId", "HardMapData", "NormalMapData", });
    emu.grasscutter.net.oldproto.IrodoriChessMapDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
