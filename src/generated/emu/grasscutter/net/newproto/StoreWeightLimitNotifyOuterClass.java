// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoreWeightLimitNotify.proto

package emu.grasscutter.net.newproto;

public final class StoreWeightLimitNotifyOuterClass {
  private StoreWeightLimitNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StoreWeightLimitNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StoreWeightLimitNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reliquary_count_limit = 14;</code>
     * @return The reliquaryCountLimit.
     */
    int getReliquaryCountLimit();

    /**
     * <code>uint32 furniture_count_limit = 10;</code>
     * @return The furnitureCountLimit.
     */
    int getFurnitureCountLimit();

    /**
     * <code>uint32 material_count_limit = 5;</code>
     * @return The materialCountLimit.
     */
    int getMaterialCountLimit();

    /**
     * <code>uint32 weapon_count_limit = 1;</code>
     * @return The weaponCountLimit.
     */
    int getWeaponCountLimit();

    /**
     * <code>uint32 weight_limit = 8;</code>
     * @return The weightLimit.
     */
    int getWeightLimit();

    /**
     * <code>.StoreType store_type = 9;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    int getStoreTypeValue();
    /**
     * <code>.StoreType store_type = 9;</code>
     * @return The storeType.
     */
    emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType getStoreType();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 630;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code StoreWeightLimitNotify}
   */
  public static final class StoreWeightLimitNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StoreWeightLimitNotify)
      StoreWeightLimitNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StoreWeightLimitNotify.newBuilder() to construct.
    private StoreWeightLimitNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StoreWeightLimitNotify() {
      storeType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StoreWeightLimitNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.class, emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.Builder.class);
    }

    public static final int RELIQUARY_COUNT_LIMIT_FIELD_NUMBER = 14;
    private int reliquaryCountLimit_;
    /**
     * <code>uint32 reliquary_count_limit = 14;</code>
     * @return The reliquaryCountLimit.
     */
    @java.lang.Override
    public int getReliquaryCountLimit() {
      return reliquaryCountLimit_;
    }

    public static final int FURNITURE_COUNT_LIMIT_FIELD_NUMBER = 10;
    private int furnitureCountLimit_;
    /**
     * <code>uint32 furniture_count_limit = 10;</code>
     * @return The furnitureCountLimit.
     */
    @java.lang.Override
    public int getFurnitureCountLimit() {
      return furnitureCountLimit_;
    }

    public static final int MATERIAL_COUNT_LIMIT_FIELD_NUMBER = 5;
    private int materialCountLimit_;
    /**
     * <code>uint32 material_count_limit = 5;</code>
     * @return The materialCountLimit.
     */
    @java.lang.Override
    public int getMaterialCountLimit() {
      return materialCountLimit_;
    }

    public static final int WEAPON_COUNT_LIMIT_FIELD_NUMBER = 1;
    private int weaponCountLimit_;
    /**
     * <code>uint32 weapon_count_limit = 1;</code>
     * @return The weaponCountLimit.
     */
    @java.lang.Override
    public int getWeaponCountLimit() {
      return weaponCountLimit_;
    }

    public static final int WEIGHT_LIMIT_FIELD_NUMBER = 8;
    private int weightLimit_;
    /**
     * <code>uint32 weight_limit = 8;</code>
     * @return The weightLimit.
     */
    @java.lang.Override
    public int getWeightLimit() {
      return weightLimit_;
    }

    public static final int STORE_TYPE_FIELD_NUMBER = 9;
    private int storeType_;
    /**
     * <code>.StoreType store_type = 9;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    @java.lang.Override public int getStoreTypeValue() {
      return storeType_;
    }
    /**
     * <code>.StoreType store_type = 9;</code>
     * @return The storeType.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType getStoreType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
      return result == null ? emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
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
      if (weaponCountLimit_ != 0) {
        output.writeUInt32(1, weaponCountLimit_);
      }
      if (materialCountLimit_ != 0) {
        output.writeUInt32(5, materialCountLimit_);
      }
      if (weightLimit_ != 0) {
        output.writeUInt32(8, weightLimit_);
      }
      if (storeType_ != emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        output.writeEnum(9, storeType_);
      }
      if (furnitureCountLimit_ != 0) {
        output.writeUInt32(10, furnitureCountLimit_);
      }
      if (reliquaryCountLimit_ != 0) {
        output.writeUInt32(14, reliquaryCountLimit_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (weaponCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, weaponCountLimit_);
      }
      if (materialCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, materialCountLimit_);
      }
      if (weightLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, weightLimit_);
      }
      if (storeType_ != emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.STORE_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, storeType_);
      }
      if (furnitureCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, furnitureCountLimit_);
      }
      if (reliquaryCountLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, reliquaryCountLimit_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify other = (emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify) obj;

      if (getReliquaryCountLimit()
          != other.getReliquaryCountLimit()) return false;
      if (getFurnitureCountLimit()
          != other.getFurnitureCountLimit()) return false;
      if (getMaterialCountLimit()
          != other.getMaterialCountLimit()) return false;
      if (getWeaponCountLimit()
          != other.getWeaponCountLimit()) return false;
      if (getWeightLimit()
          != other.getWeightLimit()) return false;
      if (storeType_ != other.storeType_) return false;
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
      hash = (37 * hash) + RELIQUARY_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getReliquaryCountLimit();
      hash = (37 * hash) + FURNITURE_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getFurnitureCountLimit();
      hash = (37 * hash) + MATERIAL_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialCountLimit();
      hash = (37 * hash) + WEAPON_COUNT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getWeaponCountLimit();
      hash = (37 * hash) + WEIGHT_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getWeightLimit();
      hash = (37 * hash) + STORE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + storeType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify prototype) {
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
     *   CMD_ID = 630;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code StoreWeightLimitNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StoreWeightLimitNotify)
        emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.class, emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        reliquaryCountLimit_ = 0;

        furnitureCountLimit_ = 0;

        materialCountLimit_ = 0;

        weaponCountLimit_ = 0;

        weightLimit_ = 0;

        storeType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.internal_static_StoreWeightLimitNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify build() {
        emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify buildPartial() {
        emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify result = new emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify(this);
        result.reliquaryCountLimit_ = reliquaryCountLimit_;
        result.furnitureCountLimit_ = furnitureCountLimit_;
        result.materialCountLimit_ = materialCountLimit_;
        result.weaponCountLimit_ = weaponCountLimit_;
        result.weightLimit_ = weightLimit_;
        result.storeType_ = storeType_;
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
        if (other instanceof emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify other) {
        if (other == emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify.getDefaultInstance()) return this;
        if (other.getReliquaryCountLimit() != 0) {
          setReliquaryCountLimit(other.getReliquaryCountLimit());
        }
        if (other.getFurnitureCountLimit() != 0) {
          setFurnitureCountLimit(other.getFurnitureCountLimit());
        }
        if (other.getMaterialCountLimit() != 0) {
          setMaterialCountLimit(other.getMaterialCountLimit());
        }
        if (other.getWeaponCountLimit() != 0) {
          setWeaponCountLimit(other.getWeaponCountLimit());
        }
        if (other.getWeightLimit() != 0) {
          setWeightLimit(other.getWeightLimit());
        }
        if (other.storeType_ != 0) {
          setStoreTypeValue(other.getStoreTypeValue());
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
                weaponCountLimit_ = input.readUInt32();

                break;
              } // case 8
              case 40: {
                materialCountLimit_ = input.readUInt32();

                break;
              } // case 40
              case 64: {
                weightLimit_ = input.readUInt32();

                break;
              } // case 64
              case 72: {
                storeType_ = input.readEnum();

                break;
              } // case 72
              case 80: {
                furnitureCountLimit_ = input.readUInt32();

                break;
              } // case 80
              case 112: {
                reliquaryCountLimit_ = input.readUInt32();

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

      private int reliquaryCountLimit_ ;
      /**
       * <code>uint32 reliquary_count_limit = 14;</code>
       * @return The reliquaryCountLimit.
       */
      @java.lang.Override
      public int getReliquaryCountLimit() {
        return reliquaryCountLimit_;
      }
      /**
       * <code>uint32 reliquary_count_limit = 14;</code>
       * @param value The reliquaryCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setReliquaryCountLimit(int value) {
        
        reliquaryCountLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reliquary_count_limit = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearReliquaryCountLimit() {
        
        reliquaryCountLimit_ = 0;
        onChanged();
        return this;
      }

      private int furnitureCountLimit_ ;
      /**
       * <code>uint32 furniture_count_limit = 10;</code>
       * @return The furnitureCountLimit.
       */
      @java.lang.Override
      public int getFurnitureCountLimit() {
        return furnitureCountLimit_;
      }
      /**
       * <code>uint32 furniture_count_limit = 10;</code>
       * @param value The furnitureCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setFurnitureCountLimit(int value) {
        
        furnitureCountLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 furniture_count_limit = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFurnitureCountLimit() {
        
        furnitureCountLimit_ = 0;
        onChanged();
        return this;
      }

      private int materialCountLimit_ ;
      /**
       * <code>uint32 material_count_limit = 5;</code>
       * @return The materialCountLimit.
       */
      @java.lang.Override
      public int getMaterialCountLimit() {
        return materialCountLimit_;
      }
      /**
       * <code>uint32 material_count_limit = 5;</code>
       * @param value The materialCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialCountLimit(int value) {
        
        materialCountLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_count_limit = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialCountLimit() {
        
        materialCountLimit_ = 0;
        onChanged();
        return this;
      }

      private int weaponCountLimit_ ;
      /**
       * <code>uint32 weapon_count_limit = 1;</code>
       * @return The weaponCountLimit.
       */
      @java.lang.Override
      public int getWeaponCountLimit() {
        return weaponCountLimit_;
      }
      /**
       * <code>uint32 weapon_count_limit = 1;</code>
       * @param value The weaponCountLimit to set.
       * @return This builder for chaining.
       */
      public Builder setWeaponCountLimit(int value) {
        
        weaponCountLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weapon_count_limit = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeaponCountLimit() {
        
        weaponCountLimit_ = 0;
        onChanged();
        return this;
      }

      private int weightLimit_ ;
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @return The weightLimit.
       */
      @java.lang.Override
      public int getWeightLimit() {
        return weightLimit_;
      }
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @param value The weightLimit to set.
       * @return This builder for chaining.
       */
      public Builder setWeightLimit(int value) {
        
        weightLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weight_limit = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeightLimit() {
        
        weightLimit_ = 0;
        onChanged();
        return this;
      }

      private int storeType_ = 0;
      /**
       * <code>.StoreType store_type = 9;</code>
       * @return The enum numeric value on the wire for storeType.
       */
      @java.lang.Override public int getStoreTypeValue() {
        return storeType_;
      }
      /**
       * <code>.StoreType store_type = 9;</code>
       * @param value The enum numeric value on the wire for storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreTypeValue(int value) {
        
        storeType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 9;</code>
       * @return The storeType.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType getStoreType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType result = emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.valueOf(storeType_);
        return result == null ? emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType.UNRECOGNIZED : result;
      }
      /**
       * <code>.StoreType store_type = 9;</code>
       * @param value The storeType to set.
       * @return This builder for chaining.
       */
      public Builder setStoreType(emu.grasscutter.net.newproto.StoreTypeOuterClass.StoreType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        storeType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.StoreType store_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearStoreType() {
        
        storeType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StoreWeightLimitNotify)
    }

    // @@protoc_insertion_point(class_scope:StoreWeightLimitNotify)
    private static final emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify();
    }

    public static emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StoreWeightLimitNotify>
        PARSER = new com.google.protobuf.AbstractParser<StoreWeightLimitNotify>() {
      @java.lang.Override
      public StoreWeightLimitNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<StoreWeightLimitNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StoreWeightLimitNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.StoreWeightLimitNotifyOuterClass.StoreWeightLimitNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StoreWeightLimitNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StoreWeightLimitNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034StoreWeightLimitNotify.proto\032\017StoreTyp" +
      "e.proto\"\306\001\n\026StoreWeightLimitNotify\022\035\n\025re" +
      "liquary_count_limit\030\016 \001(\r\022\035\n\025furniture_c" +
      "ount_limit\030\n \001(\r\022\034\n\024material_count_limit" +
      "\030\005 \001(\r\022\032\n\022weapon_count_limit\030\001 \001(\r\022\024\n\014we" +
      "ight_limit\030\010 \001(\r\022\036\n\nstore_type\030\t \001(\0162\n.S" +
      "toreTypeB\036\n\034emu.grasscutter.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.StoreTypeOuterClass.getDescriptor(),
        });
    internal_static_StoreWeightLimitNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StoreWeightLimitNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StoreWeightLimitNotify_descriptor,
        new java.lang.String[] { "ReliquaryCountLimit", "FurnitureCountLimit", "MaterialCountLimit", "WeaponCountLimit", "WeightLimit", "StoreType", });
    emu.grasscutter.net.newproto.StoreTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
