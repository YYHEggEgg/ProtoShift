// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MarkEntityInMinMapNotify.proto

package emu.grasscutter.net.oldproto;

public final class MarkEntityInMinMapNotifyOuterClass {
  private MarkEntityInMinMapNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MarkEntityInMinMapNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MarkEntityInMinMapNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector position = 4;</code>
     * @return Whether the position field is set.
     */
    boolean hasPosition();
    /**
     * <code>.Vector position = 4;</code>
     * @return The position.
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.Vector getPosition();
    /**
     * <code>.Vector position = 4;</code>
     */
    emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder();

    /**
     * <code>uint32 monster_id = 7;</code>
     * @return The monsterId.
     */
    int getMonsterId();

    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 202
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code MarkEntityInMinMapNotify}
   */
  public static final class MarkEntityInMinMapNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MarkEntityInMinMapNotify)
      MarkEntityInMinMapNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MarkEntityInMinMapNotify.newBuilder() to construct.
    private MarkEntityInMinMapNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MarkEntityInMinMapNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MarkEntityInMinMapNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.class, emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.Builder.class);
    }

    public static final int POSITION_FIELD_NUMBER = 4;
    private emu.grasscutter.net.oldproto.VectorOuterClass.Vector position_;
    /**
     * <code>.Vector position = 4;</code>
     * @return Whether the position field is set.
     */
    @java.lang.Override
    public boolean hasPosition() {
      return position_ != null;
    }
    /**
     * <code>.Vector position = 4;</code>
     * @return The position.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getPosition() {
      return position_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : position_;
    }
    /**
     * <code>.Vector position = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
      return getPosition();
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 7;
    private int monsterId_;
    /**
     * <code>uint32 monster_id = 7;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 14;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 14;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (position_ != null) {
        output.writeMessage(4, getPosition());
      }
      if (monsterId_ != 0) {
        output.writeUInt32(7, monsterId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(14, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (position_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getPosition());
      }
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, monsterId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify other = (emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify) obj;

      if (hasPosition() != other.hasPosition()) return false;
      if (hasPosition()) {
        if (!getPosition()
            .equals(other.getPosition())) return false;
      }
      if (getMonsterId()
          != other.getMonsterId()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify prototype) {
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
     * CmdId: 202
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code MarkEntityInMinMapNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MarkEntityInMinMapNotify)
        emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.class, emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (positionBuilder_ == null) {
          position_ = null;
        } else {
          position_ = null;
          positionBuilder_ = null;
        }
        monsterId_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.internal_static_MarkEntityInMinMapNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify build() {
        emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify buildPartial() {
        emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify result = new emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify(this);
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        result.monsterId_ = monsterId_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify other) {
        if (other == emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify.getDefaultInstance()) return this;
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
              case 34: {
                input.readMessage(
                    getPositionFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 34
              case 56: {
                monsterId_ = input.readUInt32();

                break;
              } // case 56
              case 112: {
                entityId_ = input.readUInt32();

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

      private emu.grasscutter.net.oldproto.VectorOuterClass.Vector position_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> positionBuilder_;
      /**
       * <code>.Vector position = 4;</code>
       * @return Whether the position field is set.
       */
      public boolean hasPosition() {
        return positionBuilder_ != null || position_ != null;
      }
      /**
       * <code>.Vector position = 4;</code>
       * @return The position.
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector getPosition() {
        if (positionBuilder_ == null) {
          return position_ == null ? emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector position = 4;</code>
       */
      public Builder setPosition(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 4;</code>
       */
      public Builder setPosition(
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector position = 4;</code>
       */
      public Builder mergePosition(emu.grasscutter.net.oldproto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (position_ != null) {
            position_ =
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector position = 4;</code>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = null;
          onChanged();
        } else {
          position_ = null;
          positionBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector position = 4;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder getPositionBuilder() {
        
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector position = 4;</code>
       */
      public emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_ == null ?
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        }
      }
      /**
       * <code>.Vector position = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.VectorOuterClass.Vector, emu.grasscutter.net.oldproto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getPosition(),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 7;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 7;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {
        
        monsterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        
        monsterId_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MarkEntityInMinMapNotify)
    }

    // @@protoc_insertion_point(class_scope:MarkEntityInMinMapNotify)
    private static final emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify();
    }

    public static emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MarkEntityInMinMapNotify>
        PARSER = new com.google.protobuf.AbstractParser<MarkEntityInMinMapNotify>() {
      @java.lang.Override
      public MarkEntityInMinMapNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MarkEntityInMinMapNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MarkEntityInMinMapNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.MarkEntityInMinMapNotifyOuterClass.MarkEntityInMinMapNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MarkEntityInMinMapNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MarkEntityInMinMapNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036MarkEntityInMinMapNotify.proto\032\014Vector" +
      ".proto\"\\\n\030MarkEntityInMinMapNotify\022\031\n\010po" +
      "sition\030\004 \001(\0132\007.Vector\022\022\n\nmonster_id\030\007 \001(" +
      "\r\022\021\n\tentity_id\030\016 \001(\rB\036\n\034emu.grasscutter." +
      "net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_MarkEntityInMinMapNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MarkEntityInMinMapNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MarkEntityInMinMapNotify_descriptor,
        new java.lang.String[] { "Position", "MonsterId", "EntityId", });
    emu.grasscutter.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}