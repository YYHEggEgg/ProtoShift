// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayBattleInfoNotify.proto

package emu.grasscutter.net.newproto;

public final class ScenePlayBattleInfoNotifyOuterClass {
  private ScenePlayBattleInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayBattleInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayBattleInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ScenePlayBattleInfo battle_info = 8;</code>
     * @return Whether the battleInfo field is set.
     */
    boolean hasBattleInfo();
    /**
     * <code>.ScenePlayBattleInfo battle_info = 8;</code>
     * @return The battleInfo.
     */
    emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo getBattleInfo();
    /**
     * <code>.ScenePlayBattleInfo battle_info = 8;</code>
     */
    emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder getBattleInfoOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 4429;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ScenePlayBattleInfoNotify}
   */
  public static final class ScenePlayBattleInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayBattleInfoNotify)
      ScenePlayBattleInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayBattleInfoNotify.newBuilder() to construct.
    private ScenePlayBattleInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayBattleInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayBattleInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.internal_static_ScenePlayBattleInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.internal_static_ScenePlayBattleInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify.class, emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify.Builder.class);
    }

    public static final int BATTLE_INFO_FIELD_NUMBER = 8;
    private emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo battleInfo_;
    /**
     * <code>.ScenePlayBattleInfo battle_info = 8;</code>
     * @return Whether the battleInfo field is set.
     */
    @java.lang.Override
    public boolean hasBattleInfo() {
      return battleInfo_ != null;
    }
    /**
     * <code>.ScenePlayBattleInfo battle_info = 8;</code>
     * @return The battleInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo getBattleInfo() {
      return battleInfo_ == null ? emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.getDefaultInstance() : battleInfo_;
    }
    /**
     * <code>.ScenePlayBattleInfo battle_info = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder getBattleInfoOrBuilder() {
      return getBattleInfo();
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
      if (battleInfo_ != null) {
        output.writeMessage(8, getBattleInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (battleInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getBattleInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify other = (emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify) obj;

      if (hasBattleInfo() != other.hasBattleInfo()) return false;
      if (hasBattleInfo()) {
        if (!getBattleInfo()
            .equals(other.getBattleInfo())) return false;
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
      if (hasBattleInfo()) {
        hash = (37 * hash) + BATTLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBattleInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify prototype) {
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
     *   CMD_ID = 4429;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ScenePlayBattleInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayBattleInfoNotify)
        emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.internal_static_ScenePlayBattleInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.internal_static_ScenePlayBattleInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify.class, emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (battleInfoBuilder_ == null) {
          battleInfo_ = null;
        } else {
          battleInfo_ = null;
          battleInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.internal_static_ScenePlayBattleInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify build() {
        emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify buildPartial() {
        emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify result = new emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify(this);
        if (battleInfoBuilder_ == null) {
          result.battleInfo_ = battleInfo_;
        } else {
          result.battleInfo_ = battleInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify other) {
        if (other == emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify.getDefaultInstance()) return this;
        if (other.hasBattleInfo()) {
          mergeBattleInfo(other.getBattleInfo());
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
              case 66: {
                input.readMessage(
                    getBattleInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 66
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

      private emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo battleInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo, emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder, emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder> battleInfoBuilder_;
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       * @return Whether the battleInfo field is set.
       */
      public boolean hasBattleInfo() {
        return battleInfoBuilder_ != null || battleInfo_ != null;
      }
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       * @return The battleInfo.
       */
      public emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo getBattleInfo() {
        if (battleInfoBuilder_ == null) {
          return battleInfo_ == null ? emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.getDefaultInstance() : battleInfo_;
        } else {
          return battleInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       */
      public Builder setBattleInfo(emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo value) {
        if (battleInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          battleInfo_ = value;
          onChanged();
        } else {
          battleInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       */
      public Builder setBattleInfo(
          emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder builderForValue) {
        if (battleInfoBuilder_ == null) {
          battleInfo_ = builderForValue.build();
          onChanged();
        } else {
          battleInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       */
      public Builder mergeBattleInfo(emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo value) {
        if (battleInfoBuilder_ == null) {
          if (battleInfo_ != null) {
            battleInfo_ =
              emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.newBuilder(battleInfo_).mergeFrom(value).buildPartial();
          } else {
            battleInfo_ = value;
          }
          onChanged();
        } else {
          battleInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       */
      public Builder clearBattleInfo() {
        if (battleInfoBuilder_ == null) {
          battleInfo_ = null;
          onChanged();
        } else {
          battleInfo_ = null;
          battleInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       */
      public emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder getBattleInfoBuilder() {
        
        onChanged();
        return getBattleInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       */
      public emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder getBattleInfoOrBuilder() {
        if (battleInfoBuilder_ != null) {
          return battleInfoBuilder_.getMessageOrBuilder();
        } else {
          return battleInfo_ == null ?
              emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.getDefaultInstance() : battleInfo_;
        }
      }
      /**
       * <code>.ScenePlayBattleInfo battle_info = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo, emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder, emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder> 
          getBattleInfoFieldBuilder() {
        if (battleInfoBuilder_ == null) {
          battleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo, emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder, emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder>(
                  getBattleInfo(),
                  getParentForChildren(),
                  isClean());
          battleInfo_ = null;
        }
        return battleInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayBattleInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayBattleInfoNotify)
    private static final emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify();
    }

    public static emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayBattleInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayBattleInfoNotify>() {
      @java.lang.Override
      public ScenePlayBattleInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ScenePlayBattleInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayBattleInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ScenePlayBattleInfoNotifyOuterClass.ScenePlayBattleInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayBattleInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayBattleInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ScenePlayBattleInfoNotify.proto\032\031Scene" +
      "PlayBattleInfo.proto\"F\n\031ScenePlayBattleI" +
      "nfoNotify\022)\n\013battle_info\030\010 \001(\0132\024.ScenePl" +
      "ayBattleInfoB\036\n\034emu.grasscutter.net.newp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayBattleInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayBattleInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayBattleInfoNotify_descriptor,
        new java.lang.String[] { "BattleInfo", });
    emu.grasscutter.net.newproto.ScenePlayBattleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
