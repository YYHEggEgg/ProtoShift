// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessPlayerInfoNotify.proto

package emu.grasscutter.net.oldproto;

public final class IrodoriChessPlayerInfoNotifyOuterClass {
  private IrodoriChessPlayerInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriChessPlayerInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriChessPlayerInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
     * @return Whether the playerInfo field is set.
     */
    boolean hasPlayerInfo();
    /**
     * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
     * @return The playerInfo.
     */
    emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getPlayerInfo();
    /**
     * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
     */
    emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder getPlayerInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 5364
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code IrodoriChessPlayerInfoNotify}
   */
  public static final class IrodoriChessPlayerInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriChessPlayerInfoNotify)
      IrodoriChessPlayerInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriChessPlayerInfoNotify.newBuilder() to construct.
    private IrodoriChessPlayerInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriChessPlayerInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriChessPlayerInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.class, emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.Builder.class);
    }

    public static final int PLAYER_INFO_FIELD_NUMBER = 6;
    private emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo playerInfo_;
    /**
     * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
     * @return Whether the playerInfo field is set.
     */
    @java.lang.Override
    public boolean hasPlayerInfo() {
      return playerInfo_ != null;
    }
    /**
     * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
     * @return The playerInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getPlayerInfo() {
      return playerInfo_ == null ? emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.getDefaultInstance() : playerInfo_;
    }
    /**
     * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
      return getPlayerInfo();
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
      if (playerInfo_ != null) {
        output.writeMessage(6, getPlayerInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getPlayerInfo());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify other = (emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify) obj;

      if (hasPlayerInfo() != other.hasPlayerInfo()) return false;
      if (hasPlayerInfo()) {
        if (!getPlayerInfo()
            .equals(other.getPlayerInfo())) return false;
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
      if (hasPlayerInfo()) {
        hash = (37 * hash) + PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify prototype) {
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
     * CmdId: 5364
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code IrodoriChessPlayerInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriChessPlayerInfoNotify)
        emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.class, emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.internal_static_IrodoriChessPlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify build() {
        emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify buildPartial() {
        emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify result = new emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify(this);
        if (playerInfoBuilder_ == null) {
          result.playerInfo_ = playerInfo_;
        } else {
          result.playerInfo_ = playerInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify other) {
        if (other == emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify.getDefaultInstance()) return this;
        if (other.hasPlayerInfo()) {
          mergePlayerInfo(other.getPlayerInfo());
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
              case 50: {
                input.readMessage(
                    getPlayerInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 50
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

      private emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo playerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo, emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder, emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder> playerInfoBuilder_;
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       * @return Whether the playerInfo field is set.
       */
      public boolean hasPlayerInfo() {
        return playerInfoBuilder_ != null || playerInfo_ != null;
      }
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       * @return The playerInfo.
       */
      public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo getPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          return playerInfo_ == null ? emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.getDefaultInstance() : playerInfo_;
        } else {
          return playerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       */
      public Builder setPlayerInfo(emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          playerInfo_ = value;
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       */
      public Builder setPlayerInfo(
          emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder builderForValue) {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = builderForValue.build();
          onChanged();
        } else {
          playerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       */
      public Builder mergePlayerInfo(emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo value) {
        if (playerInfoBuilder_ == null) {
          if (playerInfo_ != null) {
            playerInfo_ =
              emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.newBuilder(playerInfo_).mergeFrom(value).buildPartial();
          } else {
            playerInfo_ = value;
          }
          onChanged();
        } else {
          playerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       */
      public Builder clearPlayerInfo() {
        if (playerInfoBuilder_ == null) {
          playerInfo_ = null;
          onChanged();
        } else {
          playerInfo_ = null;
          playerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       */
      public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder getPlayerInfoBuilder() {
        
        onChanged();
        return getPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       */
      public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder getPlayerInfoOrBuilder() {
        if (playerInfoBuilder_ != null) {
          return playerInfoBuilder_.getMessageOrBuilder();
        } else {
          return playerInfo_ == null ?
              emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.getDefaultInstance() : playerInfo_;
        }
      }
      /**
       * <code>.IrodoriChessPlayerInfo player_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo, emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder, emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder> 
          getPlayerInfoFieldBuilder() {
        if (playerInfoBuilder_ == null) {
          playerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo, emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfo.Builder, emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.IrodoriChessPlayerInfoOrBuilder>(
                  getPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          playerInfo_ = null;
        }
        return playerInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IrodoriChessPlayerInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:IrodoriChessPlayerInfoNotify)
    private static final emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify();
    }

    public static emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriChessPlayerInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriChessPlayerInfoNotify>() {
      @java.lang.Override
      public IrodoriChessPlayerInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriChessPlayerInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriChessPlayerInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoNotifyOuterClass.IrodoriChessPlayerInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriChessPlayerInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriChessPlayerInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"IrodoriChessPlayerInfoNotify.proto\032\034Ir" +
      "odoriChessPlayerInfo.proto\"L\n\034IrodoriChe" +
      "ssPlayerInfoNotify\022,\n\013player_info\030\006 \001(\0132" +
      "\027.IrodoriChessPlayerInfoB\036\n\034emu.grasscut" +
      "ter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_IrodoriChessPlayerInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriChessPlayerInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriChessPlayerInfoNotify_descriptor,
        new java.lang.String[] { "PlayerInfo", });
    emu.grasscutter.net.oldproto.IrodoriChessPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
