// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaActivityPercentNotify.proto

package emu.grasscutter.net.newproto;

public final class GachaActivityPercentNotifyOuterClass {
  private GachaActivityPercentNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GachaActivityPercentNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GachaActivityPercentNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_GHHIGKFDONE = 13;</code>
     * @return The unk3300GHHIGKFDONE.
     */
    int getUnk3300GHHIGKFDONE();

    /**
     * <code>uint32 Unk3300_EOPJBPHFDEE = 6;</code>
     * @return The unk3300EOPJBPHFDEE.
     */
    int getUnk3300EOPJBPHFDEE();

    /**
     * <code>uint32 Unk3300_IOLPAJKDEEA = 5;</code>
     * @return The unk3300IOLPAJKDEEA.
     */
    int getUnk3300IOLPAJKDEEA();

    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */
    int getTargetNumMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */
    boolean containsTargetNumMap(
        int key);
    /**
     * Use {@link #getTargetNumMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getTargetNumMap();
    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getTargetNumMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */

    int getTargetNumMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */

    int getTargetNumMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8706;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GachaActivityPercentNotify}
   */
  public static final class GachaActivityPercentNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GachaActivityPercentNotify)
      GachaActivityPercentNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GachaActivityPercentNotify.newBuilder() to construct.
    private GachaActivityPercentNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GachaActivityPercentNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GachaActivityPercentNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.internal_static_GachaActivityPercentNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 12:
          return internalGetTargetNumMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.internal_static_GachaActivityPercentNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify.class, emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify.Builder.class);
    }

    public static final int UNK3300_GHHIGKFDONE_FIELD_NUMBER = 13;
    private int unk3300GHHIGKFDONE_;
    /**
     * <code>uint32 Unk3300_GHHIGKFDONE = 13;</code>
     * @return The unk3300GHHIGKFDONE.
     */
    @java.lang.Override
    public int getUnk3300GHHIGKFDONE() {
      return unk3300GHHIGKFDONE_;
    }

    public static final int UNK3300_EOPJBPHFDEE_FIELD_NUMBER = 6;
    private int unk3300EOPJBPHFDEE_;
    /**
     * <code>uint32 Unk3300_EOPJBPHFDEE = 6;</code>
     * @return The unk3300EOPJBPHFDEE.
     */
    @java.lang.Override
    public int getUnk3300EOPJBPHFDEE() {
      return unk3300EOPJBPHFDEE_;
    }

    public static final int UNK3300_IOLPAJKDEEA_FIELD_NUMBER = 5;
    private int unk3300IOLPAJKDEEA_;
    /**
     * <code>uint32 Unk3300_IOLPAJKDEEA = 5;</code>
     * @return The unk3300IOLPAJKDEEA.
     */
    @java.lang.Override
    public int getUnk3300IOLPAJKDEEA() {
      return unk3300IOLPAJKDEEA_;
    }

    public static final int TARGET_NUM_MAP_FIELD_NUMBER = 12;
    private static final class TargetNumMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.internal_static_GachaActivityPercentNotify_TargetNumMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> targetNumMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetTargetNumMap() {
      if (targetNumMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            TargetNumMapDefaultEntryHolder.defaultEntry);
      }
      return targetNumMap_;
    }

    public int getTargetNumMapCount() {
      return internalGetTargetNumMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */

    @java.lang.Override
    public boolean containsTargetNumMap(
        int key) {
      
      return internalGetTargetNumMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getTargetNumMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMap() {
      return getTargetNumMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMapMap() {
      return internalGetTargetNumMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */
    @java.lang.Override

    public int getTargetNumMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetTargetNumMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
     */
    @java.lang.Override

    public int getTargetNumMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetTargetNumMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (unk3300IOLPAJKDEEA_ != 0) {
        output.writeUInt32(5, unk3300IOLPAJKDEEA_);
      }
      if (unk3300EOPJBPHFDEE_ != 0) {
        output.writeUInt32(6, unk3300EOPJBPHFDEE_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetTargetNumMap(),
          TargetNumMapDefaultEntryHolder.defaultEntry,
          12);
      if (unk3300GHHIGKFDONE_ != 0) {
        output.writeUInt32(13, unk3300GHHIGKFDONE_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300IOLPAJKDEEA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300IOLPAJKDEEA_);
      }
      if (unk3300EOPJBPHFDEE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3300EOPJBPHFDEE_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetTargetNumMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        targetNumMap__ = TargetNumMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, targetNumMap__);
      }
      if (unk3300GHHIGKFDONE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3300GHHIGKFDONE_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify other = (emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify) obj;

      if (getUnk3300GHHIGKFDONE()
          != other.getUnk3300GHHIGKFDONE()) return false;
      if (getUnk3300EOPJBPHFDEE()
          != other.getUnk3300EOPJBPHFDEE()) return false;
      if (getUnk3300IOLPAJKDEEA()
          != other.getUnk3300IOLPAJKDEEA()) return false;
      if (!internalGetTargetNumMap().equals(
          other.internalGetTargetNumMap())) return false;
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
      hash = (37 * hash) + UNK3300_GHHIGKFDONE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300GHHIGKFDONE();
      hash = (37 * hash) + UNK3300_EOPJBPHFDEE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300EOPJBPHFDEE();
      hash = (37 * hash) + UNK3300_IOLPAJKDEEA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300IOLPAJKDEEA();
      if (!internalGetTargetNumMap().getMap().isEmpty()) {
        hash = (37 * hash) + TARGET_NUM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetTargetNumMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify prototype) {
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
     *   CMD_ID = 8706;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GachaActivityPercentNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GachaActivityPercentNotify)
        emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.internal_static_GachaActivityPercentNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetTargetNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutableTargetNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.internal_static_GachaActivityPercentNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify.class, emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300GHHIGKFDONE_ = 0;

        unk3300EOPJBPHFDEE_ = 0;

        unk3300IOLPAJKDEEA_ = 0;

        internalGetMutableTargetNumMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.internal_static_GachaActivityPercentNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify build() {
        emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify buildPartial() {
        emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify result = new emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify(this);
        int from_bitField0_ = bitField0_;
        result.unk3300GHHIGKFDONE_ = unk3300GHHIGKFDONE_;
        result.unk3300EOPJBPHFDEE_ = unk3300EOPJBPHFDEE_;
        result.unk3300IOLPAJKDEEA_ = unk3300IOLPAJKDEEA_;
        result.targetNumMap_ = internalGetTargetNumMap();
        result.targetNumMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify other) {
        if (other == emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify.getDefaultInstance()) return this;
        if (other.getUnk3300GHHIGKFDONE() != 0) {
          setUnk3300GHHIGKFDONE(other.getUnk3300GHHIGKFDONE());
        }
        if (other.getUnk3300EOPJBPHFDEE() != 0) {
          setUnk3300EOPJBPHFDEE(other.getUnk3300EOPJBPHFDEE());
        }
        if (other.getUnk3300IOLPAJKDEEA() != 0) {
          setUnk3300IOLPAJKDEEA(other.getUnk3300IOLPAJKDEEA());
        }
        internalGetMutableTargetNumMap().mergeFrom(
            other.internalGetTargetNumMap());
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
              case 40: {
                unk3300IOLPAJKDEEA_ = input.readUInt32();

                break;
              } // case 40
              case 48: {
                unk3300EOPJBPHFDEE_ = input.readUInt32();

                break;
              } // case 48
              case 98: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                targetNumMap__ = input.readMessage(
                    TargetNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableTargetNumMap().getMutableMap().put(
                    targetNumMap__.getKey(), targetNumMap__.getValue());
                break;
              } // case 98
              case 104: {
                unk3300GHHIGKFDONE_ = input.readUInt32();

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
      private int bitField0_;

      private int unk3300GHHIGKFDONE_ ;
      /**
       * <code>uint32 Unk3300_GHHIGKFDONE = 13;</code>
       * @return The unk3300GHHIGKFDONE.
       */
      @java.lang.Override
      public int getUnk3300GHHIGKFDONE() {
        return unk3300GHHIGKFDONE_;
      }
      /**
       * <code>uint32 Unk3300_GHHIGKFDONE = 13;</code>
       * @param value The unk3300GHHIGKFDONE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300GHHIGKFDONE(int value) {
        
        unk3300GHHIGKFDONE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_GHHIGKFDONE = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300GHHIGKFDONE() {
        
        unk3300GHHIGKFDONE_ = 0;
        onChanged();
        return this;
      }

      private int unk3300EOPJBPHFDEE_ ;
      /**
       * <code>uint32 Unk3300_EOPJBPHFDEE = 6;</code>
       * @return The unk3300EOPJBPHFDEE.
       */
      @java.lang.Override
      public int getUnk3300EOPJBPHFDEE() {
        return unk3300EOPJBPHFDEE_;
      }
      /**
       * <code>uint32 Unk3300_EOPJBPHFDEE = 6;</code>
       * @param value The unk3300EOPJBPHFDEE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300EOPJBPHFDEE(int value) {
        
        unk3300EOPJBPHFDEE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_EOPJBPHFDEE = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300EOPJBPHFDEE() {
        
        unk3300EOPJBPHFDEE_ = 0;
        onChanged();
        return this;
      }

      private int unk3300IOLPAJKDEEA_ ;
      /**
       * <code>uint32 Unk3300_IOLPAJKDEEA = 5;</code>
       * @return The unk3300IOLPAJKDEEA.
       */
      @java.lang.Override
      public int getUnk3300IOLPAJKDEEA() {
        return unk3300IOLPAJKDEEA_;
      }
      /**
       * <code>uint32 Unk3300_IOLPAJKDEEA = 5;</code>
       * @param value The unk3300IOLPAJKDEEA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IOLPAJKDEEA(int value) {
        
        unk3300IOLPAJKDEEA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_IOLPAJKDEEA = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IOLPAJKDEEA() {
        
        unk3300IOLPAJKDEEA_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> targetNumMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetTargetNumMap() {
        if (targetNumMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              TargetNumMapDefaultEntryHolder.defaultEntry);
        }
        return targetNumMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableTargetNumMap() {
        onChanged();;
        if (targetNumMap_ == null) {
          targetNumMap_ = com.google.protobuf.MapField.newMapField(
              TargetNumMapDefaultEntryHolder.defaultEntry);
        }
        if (!targetNumMap_.isMutable()) {
          targetNumMap_ = targetNumMap_.copy();
        }
        return targetNumMap_;
      }

      public int getTargetNumMapCount() {
        return internalGetTargetNumMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
       */

      @java.lang.Override
      public boolean containsTargetNumMap(
          int key) {
        
        return internalGetTargetNumMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getTargetNumMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMap() {
        return getTargetNumMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getTargetNumMapMap() {
        return internalGetTargetNumMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
       */
      @java.lang.Override

      public int getTargetNumMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetTargetNumMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
       */
      @java.lang.Override

      public int getTargetNumMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetTargetNumMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearTargetNumMap() {
        internalGetMutableTargetNumMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
       */

      public Builder removeTargetNumMap(
          int key) {
        
        internalGetMutableTargetNumMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableTargetNumMap() {
        return internalGetMutableTargetNumMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
       */
      public Builder putTargetNumMap(
          int key,
          int value) {
        
        
        internalGetMutableTargetNumMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; target_num_map = 12;</code>
       */

      public Builder putAllTargetNumMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableTargetNumMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:GachaActivityPercentNotify)
    }

    // @@protoc_insertion_point(class_scope:GachaActivityPercentNotify)
    private static final emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify();
    }

    public static emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GachaActivityPercentNotify>
        PARSER = new com.google.protobuf.AbstractParser<GachaActivityPercentNotify>() {
      @java.lang.Override
      public GachaActivityPercentNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GachaActivityPercentNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GachaActivityPercentNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GachaActivityPercentNotifyOuterClass.GachaActivityPercentNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaActivityPercentNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaActivityPercentNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaActivityPercentNotify_TargetNumMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaActivityPercentNotify_TargetNumMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GachaActivityPercentNotify.proto\"\357\001\n\032G" +
      "achaActivityPercentNotify\022\033\n\023Unk3300_GHH" +
      "IGKFDONE\030\r \001(\r\022\033\n\023Unk3300_EOPJBPHFDEE\030\006 " +
      "\001(\r\022\033\n\023Unk3300_IOLPAJKDEEA\030\005 \001(\r\022E\n\016targ" +
      "et_num_map\030\014 \003(\0132-.GachaActivityPercentN" +
      "otify.TargetNumMapEntry\0323\n\021TargetNumMapE" +
      "ntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\036\n\034" +
      "emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GachaActivityPercentNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GachaActivityPercentNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaActivityPercentNotify_descriptor,
        new java.lang.String[] { "Unk3300GHHIGKFDONE", "Unk3300EOPJBPHFDEE", "Unk3300IOLPAJKDEEA", "TargetNumMap", });
    internal_static_GachaActivityPercentNotify_TargetNumMapEntry_descriptor =
      internal_static_GachaActivityPercentNotify_descriptor.getNestedTypes().get(0);
    internal_static_GachaActivityPercentNotify_TargetNumMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaActivityPercentNotify_TargetNumMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
