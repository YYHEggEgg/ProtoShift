// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryHomeSeekFurnitureInfo.proto

package emu.grasscutter.net.oldproto;

public final class SceneGalleryHomeSeekFurnitureInfoOuterClass {
  private SceneGalleryHomeSeekFurnitureInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryHomeSeekFurnitureInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryHomeSeekFurnitureInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_tide_left_num = 6;</code>
     * @return The curTideLeftNum.
     */
    int getCurTideLeftNum();

    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */
    int getPlayerScoreMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */
    boolean containsPlayerScoreMap(
        int key);
    /**
     * Use {@link #getPlayerScoreMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPlayerScoreMap();
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPlayerScoreMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */

    int getPlayerScoreMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */

    int getPlayerScoreMapOrThrow(
        int key);

    /**
     * <code>uint32 cur_tide_duration_time = 12;</code>
     * @return The curTideDurationTime.
     */
    int getCurTideDurationTime();

    /**
     * <code>uint32 cur_tide_total_num = 9;</code>
     * @return The curTideTotalNum.
     */
    int getCurTideTotalNum();
  }
  /**
   * Protobuf type {@code SceneGalleryHomeSeekFurnitureInfo}
   */
  public static final class SceneGalleryHomeSeekFurnitureInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryHomeSeekFurnitureInfo)
      SceneGalleryHomeSeekFurnitureInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryHomeSeekFurnitureInfo.newBuilder() to construct.
    private SceneGalleryHomeSeekFurnitureInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryHomeSeekFurnitureInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryHomeSeekFurnitureInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetPlayerScoreMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.class, emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.Builder.class);
    }

    public static final int CUR_TIDE_LEFT_NUM_FIELD_NUMBER = 6;
    private int curTideLeftNum_;
    /**
     * <code>uint32 cur_tide_left_num = 6;</code>
     * @return The curTideLeftNum.
     */
    @java.lang.Override
    public int getCurTideLeftNum() {
      return curTideLeftNum_;
    }

    public static final int PLAYER_SCORE_MAP_FIELD_NUMBER = 8;
    private static final class PlayerScoreMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> playerScoreMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetPlayerScoreMap() {
      if (playerScoreMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PlayerScoreMapDefaultEntryHolder.defaultEntry);
      }
      return playerScoreMap_;
    }

    public int getPlayerScoreMapCount() {
      return internalGetPlayerScoreMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */

    @java.lang.Override
    public boolean containsPlayerScoreMap(
        int key) {
      
      return internalGetPlayerScoreMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPlayerScoreMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMap() {
      return getPlayerScoreMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMapMap() {
      return internalGetPlayerScoreMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */
    @java.lang.Override

    public int getPlayerScoreMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPlayerScoreMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
     */
    @java.lang.Override

    public int getPlayerScoreMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPlayerScoreMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int CUR_TIDE_DURATION_TIME_FIELD_NUMBER = 12;
    private int curTideDurationTime_;
    /**
     * <code>uint32 cur_tide_duration_time = 12;</code>
     * @return The curTideDurationTime.
     */
    @java.lang.Override
    public int getCurTideDurationTime() {
      return curTideDurationTime_;
    }

    public static final int CUR_TIDE_TOTAL_NUM_FIELD_NUMBER = 9;
    private int curTideTotalNum_;
    /**
     * <code>uint32 cur_tide_total_num = 9;</code>
     * @return The curTideTotalNum.
     */
    @java.lang.Override
    public int getCurTideTotalNum() {
      return curTideTotalNum_;
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
      if (curTideLeftNum_ != 0) {
        output.writeUInt32(6, curTideLeftNum_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetPlayerScoreMap(),
          PlayerScoreMapDefaultEntryHolder.defaultEntry,
          8);
      if (curTideTotalNum_ != 0) {
        output.writeUInt32(9, curTideTotalNum_);
      }
      if (curTideDurationTime_ != 0) {
        output.writeUInt32(12, curTideDurationTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curTideLeftNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, curTideLeftNum_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetPlayerScoreMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        playerScoreMap__ = PlayerScoreMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(8, playerScoreMap__);
      }
      if (curTideTotalNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, curTideTotalNum_);
      }
      if (curTideDurationTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, curTideDurationTime_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo other = (emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo) obj;

      if (getCurTideLeftNum()
          != other.getCurTideLeftNum()) return false;
      if (!internalGetPlayerScoreMap().equals(
          other.internalGetPlayerScoreMap())) return false;
      if (getCurTideDurationTime()
          != other.getCurTideDurationTime()) return false;
      if (getCurTideTotalNum()
          != other.getCurTideTotalNum()) return false;
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
      hash = (37 * hash) + CUR_TIDE_LEFT_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCurTideLeftNum();
      if (!internalGetPlayerScoreMap().getMap().isEmpty()) {
        hash = (37 * hash) + PLAYER_SCORE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPlayerScoreMap().hashCode();
      }
      hash = (37 * hash) + CUR_TIDE_DURATION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCurTideDurationTime();
      hash = (37 * hash) + CUR_TIDE_TOTAL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCurTideTotalNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo prototype) {
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
     * Protobuf type {@code SceneGalleryHomeSeekFurnitureInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryHomeSeekFurnitureInfo)
        emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetPlayerScoreMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetMutablePlayerScoreMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.class, emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        curTideLeftNum_ = 0;

        internalGetMutablePlayerScoreMap().clear();
        curTideDurationTime_ = 0;

        curTideTotalNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo build() {
        emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo buildPartial() {
        emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo result = new emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo(this);
        int from_bitField0_ = bitField0_;
        result.curTideLeftNum_ = curTideLeftNum_;
        result.playerScoreMap_ = internalGetPlayerScoreMap();
        result.playerScoreMap_.makeImmutable();
        result.curTideDurationTime_ = curTideDurationTime_;
        result.curTideTotalNum_ = curTideTotalNum_;
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
        if (other instanceof emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo other) {
        if (other == emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo.getDefaultInstance()) return this;
        if (other.getCurTideLeftNum() != 0) {
          setCurTideLeftNum(other.getCurTideLeftNum());
        }
        internalGetMutablePlayerScoreMap().mergeFrom(
            other.internalGetPlayerScoreMap());
        if (other.getCurTideDurationTime() != 0) {
          setCurTideDurationTime(other.getCurTideDurationTime());
        }
        if (other.getCurTideTotalNum() != 0) {
          setCurTideTotalNum(other.getCurTideTotalNum());
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
              case 48: {
                curTideLeftNum_ = input.readUInt32();

                break;
              } // case 48
              case 66: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                playerScoreMap__ = input.readMessage(
                    PlayerScoreMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutablePlayerScoreMap().getMutableMap().put(
                    playerScoreMap__.getKey(), playerScoreMap__.getValue());
                break;
              } // case 66
              case 72: {
                curTideTotalNum_ = input.readUInt32();

                break;
              } // case 72
              case 96: {
                curTideDurationTime_ = input.readUInt32();

                break;
              } // case 96
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

      private int curTideLeftNum_ ;
      /**
       * <code>uint32 cur_tide_left_num = 6;</code>
       * @return The curTideLeftNum.
       */
      @java.lang.Override
      public int getCurTideLeftNum() {
        return curTideLeftNum_;
      }
      /**
       * <code>uint32 cur_tide_left_num = 6;</code>
       * @param value The curTideLeftNum to set.
       * @return This builder for chaining.
       */
      public Builder setCurTideLeftNum(int value) {
        
        curTideLeftNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_tide_left_num = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurTideLeftNum() {
        
        curTideLeftNum_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> playerScoreMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetPlayerScoreMap() {
        if (playerScoreMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PlayerScoreMapDefaultEntryHolder.defaultEntry);
        }
        return playerScoreMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutablePlayerScoreMap() {
        onChanged();;
        if (playerScoreMap_ == null) {
          playerScoreMap_ = com.google.protobuf.MapField.newMapField(
              PlayerScoreMapDefaultEntryHolder.defaultEntry);
        }
        if (!playerScoreMap_.isMutable()) {
          playerScoreMap_ = playerScoreMap_.copy();
        }
        return playerScoreMap_;
      }

      public int getPlayerScoreMapCount() {
        return internalGetPlayerScoreMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
       */

      @java.lang.Override
      public boolean containsPlayerScoreMap(
          int key) {
        
        return internalGetPlayerScoreMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPlayerScoreMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMap() {
        return getPlayerScoreMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getPlayerScoreMapMap() {
        return internalGetPlayerScoreMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
       */
      @java.lang.Override

      public int getPlayerScoreMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPlayerScoreMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
       */
      @java.lang.Override

      public int getPlayerScoreMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPlayerScoreMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearPlayerScoreMap() {
        internalGetMutablePlayerScoreMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
       */

      public Builder removePlayerScoreMap(
          int key) {
        
        internalGetMutablePlayerScoreMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutablePlayerScoreMap() {
        return internalGetMutablePlayerScoreMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
       */
      public Builder putPlayerScoreMap(
          int key,
          int value) {
        
        
        internalGetMutablePlayerScoreMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; player_score_map = 8;</code>
       */

      public Builder putAllPlayerScoreMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutablePlayerScoreMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int curTideDurationTime_ ;
      /**
       * <code>uint32 cur_tide_duration_time = 12;</code>
       * @return The curTideDurationTime.
       */
      @java.lang.Override
      public int getCurTideDurationTime() {
        return curTideDurationTime_;
      }
      /**
       * <code>uint32 cur_tide_duration_time = 12;</code>
       * @param value The curTideDurationTime to set.
       * @return This builder for chaining.
       */
      public Builder setCurTideDurationTime(int value) {
        
        curTideDurationTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_tide_duration_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurTideDurationTime() {
        
        curTideDurationTime_ = 0;
        onChanged();
        return this;
      }

      private int curTideTotalNum_ ;
      /**
       * <code>uint32 cur_tide_total_num = 9;</code>
       * @return The curTideTotalNum.
       */
      @java.lang.Override
      public int getCurTideTotalNum() {
        return curTideTotalNum_;
      }
      /**
       * <code>uint32 cur_tide_total_num = 9;</code>
       * @param value The curTideTotalNum to set.
       * @return This builder for chaining.
       */
      public Builder setCurTideTotalNum(int value) {
        
        curTideTotalNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_tide_total_num = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurTideTotalNum() {
        
        curTideTotalNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryHomeSeekFurnitureInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryHomeSeekFurnitureInfo)
    private static final emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo();
    }

    public static emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryHomeSeekFurnitureInfo>() {
      @java.lang.Override
      public SceneGalleryHomeSeekFurnitureInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryHomeSeekFurnitureInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.SceneGalleryHomeSeekFurnitureInfoOuterClass.SceneGalleryHomeSeekFurnitureInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SceneGalleryHomeSeekFurnitureInfo.prot" +
      "o\"\203\002\n!SceneGalleryHomeSeekFurnitureInfo\022" +
      "\031\n\021cur_tide_left_num\030\006 \001(\r\022P\n\020player_sco" +
      "re_map\030\010 \003(\01326.SceneGalleryHomeSeekFurni" +
      "tureInfo.PlayerScoreMapEntry\022\036\n\026cur_tide" +
      "_duration_time\030\014 \001(\r\022\032\n\022cur_tide_total_n" +
      "um\030\t \001(\r\0325\n\023PlayerScoreMapEntry\022\013\n\003key\030\001" +
      " \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\036\n\034emu.grasscutt" +
      "er.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryHomeSeekFurnitureInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor,
        new java.lang.String[] { "CurTideLeftNum", "PlayerScoreMap", "CurTideDurationTime", "CurTideTotalNum", });
    internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor =
      internal_static_SceneGalleryHomeSeekFurnitureInfo_descriptor.getNestedTypes().get(0);
    internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryHomeSeekFurnitureInfo_PlayerScoreMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
