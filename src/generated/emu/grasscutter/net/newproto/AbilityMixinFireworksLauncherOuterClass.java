// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMixinFireworksLauncher.proto

package emu.grasscutter.net.newproto;

public final class AbilityMixinFireworksLauncherOuterClass {
  private AbilityMixinFireworksLauncherOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMixinFireworksLauncherOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMixinFireworksLauncher)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_FHGLEJNJIHK = 5;</code>
     * @return The unk3300FHGLEJNJIHK.
     */
    int getUnk3300FHGLEJNJIHK();

    /**
     * <code>uint32 Unk3300_BFJBDJLAOJL = 4;</code>
     * @return The unk3300BFJBDJLAOJL.
     */
    int getUnk3300BFJBDJLAOJL();

    /**
     * <code>uint32 Unk3300_LPPKOFHKCPH = 7;</code>
     * @return The unk3300LPPKOFHKCPH.
     */
    int getUnk3300LPPKOFHKCPH();

    /**
     * <code>uint32 Unk3300_BDGCGLGNAIB = 3;</code>
     * @return The unk3300BDGCGLGNAIB.
     */
    int getUnk3300BDGCGLGNAIB();

    /**
     * <code>repeated uint32 fireworks_config = 12;</code>
     * @return A list containing the fireworksConfig.
     */
    java.util.List<java.lang.Integer> getFireworksConfigList();
    /**
     * <code>repeated uint32 fireworks_config = 12;</code>
     * @return The count of fireworksConfig.
     */
    int getFireworksConfigCount();
    /**
     * <code>repeated uint32 fireworks_config = 12;</code>
     * @param index The index of the element to return.
     * @return The fireworksConfig at the given index.
     */
    int getFireworksConfig(int index);

    /**
     * <code>uint32 phase = 1;</code>
     * @return The phase.
     */
    int getPhase();
  }
  /**
   * Protobuf type {@code AbilityMixinFireworksLauncher}
   */
  public static final class AbilityMixinFireworksLauncher extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMixinFireworksLauncher)
      AbilityMixinFireworksLauncherOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMixinFireworksLauncher.newBuilder() to construct.
    private AbilityMixinFireworksLauncher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMixinFireworksLauncher() {
      fireworksConfig_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMixinFireworksLauncher();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.class, emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.Builder.class);
    }

    public static final int UNK3300_FHGLEJNJIHK_FIELD_NUMBER = 5;
    private int unk3300FHGLEJNJIHK_;
    /**
     * <code>uint32 Unk3300_FHGLEJNJIHK = 5;</code>
     * @return The unk3300FHGLEJNJIHK.
     */
    @java.lang.Override
    public int getUnk3300FHGLEJNJIHK() {
      return unk3300FHGLEJNJIHK_;
    }

    public static final int UNK3300_BFJBDJLAOJL_FIELD_NUMBER = 4;
    private int unk3300BFJBDJLAOJL_;
    /**
     * <code>uint32 Unk3300_BFJBDJLAOJL = 4;</code>
     * @return The unk3300BFJBDJLAOJL.
     */
    @java.lang.Override
    public int getUnk3300BFJBDJLAOJL() {
      return unk3300BFJBDJLAOJL_;
    }

    public static final int UNK3300_LPPKOFHKCPH_FIELD_NUMBER = 7;
    private int unk3300LPPKOFHKCPH_;
    /**
     * <code>uint32 Unk3300_LPPKOFHKCPH = 7;</code>
     * @return The unk3300LPPKOFHKCPH.
     */
    @java.lang.Override
    public int getUnk3300LPPKOFHKCPH() {
      return unk3300LPPKOFHKCPH_;
    }

    public static final int UNK3300_BDGCGLGNAIB_FIELD_NUMBER = 3;
    private int unk3300BDGCGLGNAIB_;
    /**
     * <code>uint32 Unk3300_BDGCGLGNAIB = 3;</code>
     * @return The unk3300BDGCGLGNAIB.
     */
    @java.lang.Override
    public int getUnk3300BDGCGLGNAIB() {
      return unk3300BDGCGLGNAIB_;
    }

    public static final int FIREWORKS_CONFIG_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList fireworksConfig_;
    /**
     * <code>repeated uint32 fireworks_config = 12;</code>
     * @return A list containing the fireworksConfig.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFireworksConfigList() {
      return fireworksConfig_;
    }
    /**
     * <code>repeated uint32 fireworks_config = 12;</code>
     * @return The count of fireworksConfig.
     */
    public int getFireworksConfigCount() {
      return fireworksConfig_.size();
    }
    /**
     * <code>repeated uint32 fireworks_config = 12;</code>
     * @param index The index of the element to return.
     * @return The fireworksConfig at the given index.
     */
    public int getFireworksConfig(int index) {
      return fireworksConfig_.getInt(index);
    }
    private int fireworksConfigMemoizedSerializedSize = -1;

    public static final int PHASE_FIELD_NUMBER = 1;
    private int phase_;
    /**
     * <code>uint32 phase = 1;</code>
     * @return The phase.
     */
    @java.lang.Override
    public int getPhase() {
      return phase_;
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
      getSerializedSize();
      if (phase_ != 0) {
        output.writeUInt32(1, phase_);
      }
      if (unk3300BDGCGLGNAIB_ != 0) {
        output.writeUInt32(3, unk3300BDGCGLGNAIB_);
      }
      if (unk3300BFJBDJLAOJL_ != 0) {
        output.writeUInt32(4, unk3300BFJBDJLAOJL_);
      }
      if (unk3300FHGLEJNJIHK_ != 0) {
        output.writeUInt32(5, unk3300FHGLEJNJIHK_);
      }
      if (unk3300LPPKOFHKCPH_ != 0) {
        output.writeUInt32(7, unk3300LPPKOFHKCPH_);
      }
      if (getFireworksConfigList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(fireworksConfigMemoizedSerializedSize);
      }
      for (int i = 0; i < fireworksConfig_.size(); i++) {
        output.writeUInt32NoTag(fireworksConfig_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (phase_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, phase_);
      }
      if (unk3300BDGCGLGNAIB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3300BDGCGLGNAIB_);
      }
      if (unk3300BFJBDJLAOJL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3300BFJBDJLAOJL_);
      }
      if (unk3300FHGLEJNJIHK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3300FHGLEJNJIHK_);
      }
      if (unk3300LPPKOFHKCPH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300LPPKOFHKCPH_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fireworksConfig_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fireworksConfig_.getInt(i));
        }
        size += dataSize;
        if (!getFireworksConfigList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fireworksConfigMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher other = (emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher) obj;

      if (getUnk3300FHGLEJNJIHK()
          != other.getUnk3300FHGLEJNJIHK()) return false;
      if (getUnk3300BFJBDJLAOJL()
          != other.getUnk3300BFJBDJLAOJL()) return false;
      if (getUnk3300LPPKOFHKCPH()
          != other.getUnk3300LPPKOFHKCPH()) return false;
      if (getUnk3300BDGCGLGNAIB()
          != other.getUnk3300BDGCGLGNAIB()) return false;
      if (!getFireworksConfigList()
          .equals(other.getFireworksConfigList())) return false;
      if (getPhase()
          != other.getPhase()) return false;
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
      hash = (37 * hash) + UNK3300_FHGLEJNJIHK_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300FHGLEJNJIHK();
      hash = (37 * hash) + UNK3300_BFJBDJLAOJL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300BFJBDJLAOJL();
      hash = (37 * hash) + UNK3300_LPPKOFHKCPH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300LPPKOFHKCPH();
      hash = (37 * hash) + UNK3300_BDGCGLGNAIB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300BDGCGLGNAIB();
      if (getFireworksConfigCount() > 0) {
        hash = (37 * hash) + FIREWORKS_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getFireworksConfigList().hashCode();
      }
      hash = (37 * hash) + PHASE_FIELD_NUMBER;
      hash = (53 * hash) + getPhase();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher prototype) {
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
     * Protobuf type {@code AbilityMixinFireworksLauncher}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMixinFireworksLauncher)
        emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncherOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.class, emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3300FHGLEJNJIHK_ = 0;

        unk3300BFJBDJLAOJL_ = 0;

        unk3300LPPKOFHKCPH_ = 0;

        unk3300BDGCGLGNAIB_ = 0;

        fireworksConfig_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        phase_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.internal_static_AbilityMixinFireworksLauncher_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher build() {
        emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher buildPartial() {
        emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher result = new emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher(this);
        int from_bitField0_ = bitField0_;
        result.unk3300FHGLEJNJIHK_ = unk3300FHGLEJNJIHK_;
        result.unk3300BFJBDJLAOJL_ = unk3300BFJBDJLAOJL_;
        result.unk3300LPPKOFHKCPH_ = unk3300LPPKOFHKCPH_;
        result.unk3300BDGCGLGNAIB_ = unk3300BDGCGLGNAIB_;
        if (((bitField0_ & 0x00000001) != 0)) {
          fireworksConfig_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fireworksConfig_ = fireworksConfig_;
        result.phase_ = phase_;
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
        if (other instanceof emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher) {
          return mergeFrom((emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher other) {
        if (other == emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher.getDefaultInstance()) return this;
        if (other.getUnk3300FHGLEJNJIHK() != 0) {
          setUnk3300FHGLEJNJIHK(other.getUnk3300FHGLEJNJIHK());
        }
        if (other.getUnk3300BFJBDJLAOJL() != 0) {
          setUnk3300BFJBDJLAOJL(other.getUnk3300BFJBDJLAOJL());
        }
        if (other.getUnk3300LPPKOFHKCPH() != 0) {
          setUnk3300LPPKOFHKCPH(other.getUnk3300LPPKOFHKCPH());
        }
        if (other.getUnk3300BDGCGLGNAIB() != 0) {
          setUnk3300BDGCGLGNAIB(other.getUnk3300BDGCGLGNAIB());
        }
        if (!other.fireworksConfig_.isEmpty()) {
          if (fireworksConfig_.isEmpty()) {
            fireworksConfig_ = other.fireworksConfig_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFireworksConfigIsMutable();
            fireworksConfig_.addAll(other.fireworksConfig_);
          }
          onChanged();
        }
        if (other.getPhase() != 0) {
          setPhase(other.getPhase());
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
                phase_ = input.readUInt32();

                break;
              } // case 8
              case 24: {
                unk3300BDGCGLGNAIB_ = input.readUInt32();

                break;
              } // case 24
              case 32: {
                unk3300BFJBDJLAOJL_ = input.readUInt32();

                break;
              } // case 32
              case 40: {
                unk3300FHGLEJNJIHK_ = input.readUInt32();

                break;
              } // case 40
              case 56: {
                unk3300LPPKOFHKCPH_ = input.readUInt32();

                break;
              } // case 56
              case 96: {
                int v = input.readUInt32();
                ensureFireworksConfigIsMutable();
                fireworksConfig_.addInt(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFireworksConfigIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  fireworksConfig_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 98
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

      private int unk3300FHGLEJNJIHK_ ;
      /**
       * <code>uint32 Unk3300_FHGLEJNJIHK = 5;</code>
       * @return The unk3300FHGLEJNJIHK.
       */
      @java.lang.Override
      public int getUnk3300FHGLEJNJIHK() {
        return unk3300FHGLEJNJIHK_;
      }
      /**
       * <code>uint32 Unk3300_FHGLEJNJIHK = 5;</code>
       * @param value The unk3300FHGLEJNJIHK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300FHGLEJNJIHK(int value) {
        
        unk3300FHGLEJNJIHK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_FHGLEJNJIHK = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300FHGLEJNJIHK() {
        
        unk3300FHGLEJNJIHK_ = 0;
        onChanged();
        return this;
      }

      private int unk3300BFJBDJLAOJL_ ;
      /**
       * <code>uint32 Unk3300_BFJBDJLAOJL = 4;</code>
       * @return The unk3300BFJBDJLAOJL.
       */
      @java.lang.Override
      public int getUnk3300BFJBDJLAOJL() {
        return unk3300BFJBDJLAOJL_;
      }
      /**
       * <code>uint32 Unk3300_BFJBDJLAOJL = 4;</code>
       * @param value The unk3300BFJBDJLAOJL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300BFJBDJLAOJL(int value) {
        
        unk3300BFJBDJLAOJL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_BFJBDJLAOJL = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300BFJBDJLAOJL() {
        
        unk3300BFJBDJLAOJL_ = 0;
        onChanged();
        return this;
      }

      private int unk3300LPPKOFHKCPH_ ;
      /**
       * <code>uint32 Unk3300_LPPKOFHKCPH = 7;</code>
       * @return The unk3300LPPKOFHKCPH.
       */
      @java.lang.Override
      public int getUnk3300LPPKOFHKCPH() {
        return unk3300LPPKOFHKCPH_;
      }
      /**
       * <code>uint32 Unk3300_LPPKOFHKCPH = 7;</code>
       * @param value The unk3300LPPKOFHKCPH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300LPPKOFHKCPH(int value) {
        
        unk3300LPPKOFHKCPH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_LPPKOFHKCPH = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300LPPKOFHKCPH() {
        
        unk3300LPPKOFHKCPH_ = 0;
        onChanged();
        return this;
      }

      private int unk3300BDGCGLGNAIB_ ;
      /**
       * <code>uint32 Unk3300_BDGCGLGNAIB = 3;</code>
       * @return The unk3300BDGCGLGNAIB.
       */
      @java.lang.Override
      public int getUnk3300BDGCGLGNAIB() {
        return unk3300BDGCGLGNAIB_;
      }
      /**
       * <code>uint32 Unk3300_BDGCGLGNAIB = 3;</code>
       * @param value The unk3300BDGCGLGNAIB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300BDGCGLGNAIB(int value) {
        
        unk3300BDGCGLGNAIB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_BDGCGLGNAIB = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300BDGCGLGNAIB() {
        
        unk3300BDGCGLGNAIB_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fireworksConfig_ = emptyIntList();
      private void ensureFireworksConfigIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fireworksConfig_ = mutableCopy(fireworksConfig_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 fireworks_config = 12;</code>
       * @return A list containing the fireworksConfig.
       */
      public java.util.List<java.lang.Integer>
          getFireworksConfigList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(fireworksConfig_) : fireworksConfig_;
      }
      /**
       * <code>repeated uint32 fireworks_config = 12;</code>
       * @return The count of fireworksConfig.
       */
      public int getFireworksConfigCount() {
        return fireworksConfig_.size();
      }
      /**
       * <code>repeated uint32 fireworks_config = 12;</code>
       * @param index The index of the element to return.
       * @return The fireworksConfig at the given index.
       */
      public int getFireworksConfig(int index) {
        return fireworksConfig_.getInt(index);
      }
      /**
       * <code>repeated uint32 fireworks_config = 12;</code>
       * @param index The index to set the value at.
       * @param value The fireworksConfig to set.
       * @return This builder for chaining.
       */
      public Builder setFireworksConfig(
          int index, int value) {
        ensureFireworksConfigIsMutable();
        fireworksConfig_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fireworks_config = 12;</code>
       * @param value The fireworksConfig to add.
       * @return This builder for chaining.
       */
      public Builder addFireworksConfig(int value) {
        ensureFireworksConfigIsMutable();
        fireworksConfig_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fireworks_config = 12;</code>
       * @param values The fireworksConfig to add.
       * @return This builder for chaining.
       */
      public Builder addAllFireworksConfig(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFireworksConfigIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fireworksConfig_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 fireworks_config = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFireworksConfig() {
        fireworksConfig_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int phase_ ;
      /**
       * <code>uint32 phase = 1;</code>
       * @return The phase.
       */
      @java.lang.Override
      public int getPhase() {
        return phase_;
      }
      /**
       * <code>uint32 phase = 1;</code>
       * @param value The phase to set.
       * @return This builder for chaining.
       */
      public Builder setPhase(int value) {
        
        phase_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 phase = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhase() {
        
        phase_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityMixinFireworksLauncher)
    }

    // @@protoc_insertion_point(class_scope:AbilityMixinFireworksLauncher)
    private static final emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher();
    }

    public static emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMixinFireworksLauncher>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMixinFireworksLauncher>() {
      @java.lang.Override
      public AbilityMixinFireworksLauncher parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityMixinFireworksLauncher> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMixinFireworksLauncher> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.AbilityMixinFireworksLauncherOuterClass.AbilityMixinFireworksLauncher getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMixinFireworksLauncher_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMixinFireworksLauncher_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#AbilityMixinFireworksLauncher.proto\"\274\001" +
      "\n\035AbilityMixinFireworksLauncher\022\033\n\023Unk33" +
      "00_FHGLEJNJIHK\030\005 \001(\r\022\033\n\023Unk3300_BFJBDJLA" +
      "OJL\030\004 \001(\r\022\033\n\023Unk3300_LPPKOFHKCPH\030\007 \001(\r\022\033" +
      "\n\023Unk3300_BDGCGLGNAIB\030\003 \001(\r\022\030\n\020fireworks" +
      "_config\030\014 \003(\r\022\r\n\005phase\030\001 \001(\rB\036\n\034emu.gras" +
      "scutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMixinFireworksLauncher_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMixinFireworksLauncher_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMixinFireworksLauncher_descriptor,
        new java.lang.String[] { "Unk3300FHGLEJNJIHK", "Unk3300BFJBDJLAOJL", "Unk3300LPPKOFHKCPH", "Unk3300BDGCGLGNAIB", "FireworksConfig", "Phase", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
