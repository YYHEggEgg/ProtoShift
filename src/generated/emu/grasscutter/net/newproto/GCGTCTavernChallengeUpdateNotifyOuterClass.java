// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTCTavernChallengeUpdateNotify.proto

package emu.grasscutter.net.newproto;

public final class GCGTCTavernChallengeUpdateNotifyOuterClass {
  private GCGTCTavernChallengeUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTCTavernChallengeUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTCTavernChallengeUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
     * @return Whether the tavernChallenge field is set.
     */
    boolean hasTavernChallenge();
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
     * @return The tavernChallenge.
     */
    emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallenge();
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
     */
    emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeOrBuilder();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 7907;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code GCGTCTavernChallengeUpdateNotify}
   */
  public static final class GCGTCTavernChallengeUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTCTavernChallengeUpdateNotify)
      GCGTCTavernChallengeUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTCTavernChallengeUpdateNotify.newBuilder() to construct.
    private GCGTCTavernChallengeUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTCTavernChallengeUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTCTavernChallengeUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.class, emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.Builder.class);
    }

    public static final int TAVERN_CHALLENGE_FIELD_NUMBER = 12;
    private emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData tavernChallenge_;
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
     * @return Whether the tavernChallenge field is set.
     */
    @java.lang.Override
    public boolean hasTavernChallenge() {
      return tavernChallenge_ != null;
    }
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
     * @return The tavernChallenge.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallenge() {
      return tavernChallenge_ == null ? emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : tavernChallenge_;
    }
    /**
     * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeOrBuilder() {
      return getTavernChallenge();
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
      if (tavernChallenge_ != null) {
        output.writeMessage(12, getTavernChallenge());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tavernChallenge_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getTavernChallenge());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify other = (emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify) obj;

      if (hasTavernChallenge() != other.hasTavernChallenge()) return false;
      if (hasTavernChallenge()) {
        if (!getTavernChallenge()
            .equals(other.getTavernChallenge())) return false;
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
      if (hasTavernChallenge()) {
        hash = (37 * hash) + TAVERN_CHALLENGE_FIELD_NUMBER;
        hash = (53 * hash) + getTavernChallenge().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify prototype) {
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
     *   CMD_ID = 7907;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code GCGTCTavernChallengeUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTCTavernChallengeUpdateNotify)
        emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.class, emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (tavernChallengeBuilder_ == null) {
          tavernChallenge_ = null;
        } else {
          tavernChallenge_ = null;
          tavernChallengeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.internal_static_GCGTCTavernChallengeUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify build() {
        emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify buildPartial() {
        emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify result = new emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify(this);
        if (tavernChallengeBuilder_ == null) {
          result.tavernChallenge_ = tavernChallenge_;
        } else {
          result.tavernChallenge_ = tavernChallengeBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify other) {
        if (other == emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify.getDefaultInstance()) return this;
        if (other.hasTavernChallenge()) {
          mergeTavernChallenge(other.getTavernChallenge());
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
              case 98: {
                input.readMessage(
                    getTavernChallengeFieldBuilder().getBuilder(),
                    extensionRegistry);

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

      private emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData tavernChallenge_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> tavernChallengeBuilder_;
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       * @return Whether the tavernChallenge field is set.
       */
      public boolean hasTavernChallenge() {
        return tavernChallengeBuilder_ != null || tavernChallenge_ != null;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       * @return The tavernChallenge.
       */
      public emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData getTavernChallenge() {
        if (tavernChallengeBuilder_ == null) {
          return tavernChallenge_ == null ? emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : tavernChallenge_;
        } else {
          return tavernChallengeBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       */
      public Builder setTavernChallenge(emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (tavernChallengeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          tavernChallenge_ = value;
          onChanged();
        } else {
          tavernChallengeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       */
      public Builder setTavernChallenge(
          emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder builderForValue) {
        if (tavernChallengeBuilder_ == null) {
          tavernChallenge_ = builderForValue.build();
          onChanged();
        } else {
          tavernChallengeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       */
      public Builder mergeTavernChallenge(emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData value) {
        if (tavernChallengeBuilder_ == null) {
          if (tavernChallenge_ != null) {
            tavernChallenge_ =
              emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.newBuilder(tavernChallenge_).mergeFrom(value).buildPartial();
          } else {
            tavernChallenge_ = value;
          }
          onChanged();
        } else {
          tavernChallengeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       */
      public Builder clearTavernChallenge() {
        if (tavernChallengeBuilder_ == null) {
          tavernChallenge_ = null;
          onChanged();
        } else {
          tavernChallenge_ = null;
          tavernChallengeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       */
      public emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder getTavernChallengeBuilder() {
        
        onChanged();
        return getTavernChallengeFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       */
      public emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder getTavernChallengeOrBuilder() {
        if (tavernChallengeBuilder_ != null) {
          return tavernChallengeBuilder_.getMessageOrBuilder();
        } else {
          return tavernChallenge_ == null ?
              emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.getDefaultInstance() : tavernChallenge_;
        }
      }
      /**
       * <code>.GCGTCTavernChallengeData tavern_challenge = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder> 
          getTavernChallengeFieldBuilder() {
        if (tavernChallengeBuilder_ == null) {
          tavernChallengeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData, emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeData.Builder, emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.GCGTCTavernChallengeDataOrBuilder>(
                  getTavernChallenge(),
                  getParentForChildren(),
                  isClean());
          tavernChallenge_ = null;
        }
        return tavernChallengeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GCGTCTavernChallengeUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGTCTavernChallengeUpdateNotify)
    private static final emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify();
    }

    public static emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTCTavernChallengeUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGTCTavernChallengeUpdateNotify>() {
      @java.lang.Override
      public GCGTCTavernChallengeUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGTCTavernChallengeUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTCTavernChallengeUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGTCTavernChallengeUpdateNotifyOuterClass.GCGTCTavernChallengeUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTCTavernChallengeUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTCTavernChallengeUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&GCGTCTavernChallengeUpdateNotify.proto" +
      "\032\036GCGTCTavernChallengeData.proto\"W\n GCGT" +
      "CTavernChallengeUpdateNotify\0223\n\020tavern_c" +
      "hallenge\030\014 \001(\0132\031.GCGTCTavernChallengeDat" +
      "aB\036\n\034emu.grasscutter.net.newprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.getDescriptor(),
        });
    internal_static_GCGTCTavernChallengeUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTCTavernChallengeUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTCTavernChallengeUpdateNotify_descriptor,
        new java.lang.String[] { "TavernChallenge", });
    emu.grasscutter.net.newproto.GCGTCTavernChallengeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
