// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReunionBriefInfoRsp.proto

package emu.grasscutter.net.oldproto;

public final class ReunionBriefInfoRspOuterClass {
  private ReunionBriefInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReunionBriefInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReunionBriefInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_activate = 13;</code>
     * @return The isActivate.
     */
    boolean getIsActivate();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
     * @return Whether the reunionBriefInfo field is set.
     */
    boolean hasReunionBriefInfo();
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
     * @return The reunionBriefInfo.
     */
    emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo getReunionBriefInfo();
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
     */
    emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder getReunionBriefInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 5068
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ReunionBriefInfoRsp}
   */
  public static final class ReunionBriefInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReunionBriefInfoRsp)
      ReunionBriefInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReunionBriefInfoRsp.newBuilder() to construct.
    private ReunionBriefInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReunionBriefInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReunionBriefInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.internal_static_ReunionBriefInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.internal_static_ReunionBriefInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp.class, emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp.Builder.class);
    }

    public static final int IS_ACTIVATE_FIELD_NUMBER = 13;
    private boolean isActivate_;
    /**
     * <code>bool is_activate = 13;</code>
     * @return The isActivate.
     */
    @java.lang.Override
    public boolean getIsActivate() {
      return isActivate_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int REUNION_BRIEF_INFO_FIELD_NUMBER = 5;
    private emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo reunionBriefInfo_;
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
     * @return Whether the reunionBriefInfo field is set.
     */
    @java.lang.Override
    public boolean hasReunionBriefInfo() {
      return reunionBriefInfo_ != null;
    }
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
     * @return The reunionBriefInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo getReunionBriefInfo() {
      return reunionBriefInfo_ == null ? emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.getDefaultInstance() : reunionBriefInfo_;
    }
    /**
     * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder getReunionBriefInfoOrBuilder() {
      return getReunionBriefInfo();
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
      if (reunionBriefInfo_ != null) {
        output.writeMessage(5, getReunionBriefInfo());
      }
      if (isActivate_ != false) {
        output.writeBool(13, isActivate_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reunionBriefInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getReunionBriefInfo());
      }
      if (isActivate_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isActivate_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp other = (emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp) obj;

      if (getIsActivate()
          != other.getIsActivate()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasReunionBriefInfo() != other.hasReunionBriefInfo()) return false;
      if (hasReunionBriefInfo()) {
        if (!getReunionBriefInfo()
            .equals(other.getReunionBriefInfo())) return false;
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
      hash = (37 * hash) + IS_ACTIVATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActivate());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasReunionBriefInfo()) {
        hash = (37 * hash) + REUNION_BRIEF_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getReunionBriefInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp prototype) {
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
     * CmdId: 5068
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ReunionBriefInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReunionBriefInfoRsp)
        emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.internal_static_ReunionBriefInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.internal_static_ReunionBriefInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp.class, emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isActivate_ = false;

        retcode_ = 0;

        if (reunionBriefInfoBuilder_ == null) {
          reunionBriefInfo_ = null;
        } else {
          reunionBriefInfo_ = null;
          reunionBriefInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.internal_static_ReunionBriefInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp build() {
        emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp buildPartial() {
        emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp result = new emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp(this);
        result.isActivate_ = isActivate_;
        result.retcode_ = retcode_;
        if (reunionBriefInfoBuilder_ == null) {
          result.reunionBriefInfo_ = reunionBriefInfo_;
        } else {
          result.reunionBriefInfo_ = reunionBriefInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp) {
          return mergeFrom((emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp other) {
        if (other == emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp.getDefaultInstance()) return this;
        if (other.getIsActivate() != false) {
          setIsActivate(other.getIsActivate());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasReunionBriefInfo()) {
          mergeReunionBriefInfo(other.getReunionBriefInfo());
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
              case 42: {
                input.readMessage(
                    getReunionBriefInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 42
              case 104: {
                isActivate_ = input.readBool();

                break;
              } // case 104
              case 112: {
                retcode_ = input.readInt32();

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

      private boolean isActivate_ ;
      /**
       * <code>bool is_activate = 13;</code>
       * @return The isActivate.
       */
      @java.lang.Override
      public boolean getIsActivate() {
        return isActivate_;
      }
      /**
       * <code>bool is_activate = 13;</code>
       * @param value The isActivate to set.
       * @return This builder for chaining.
       */
      public Builder setIsActivate(boolean value) {
        
        isActivate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_activate = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActivate() {
        
        isActivate_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo reunionBriefInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo, emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder, emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder> reunionBriefInfoBuilder_;
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       * @return Whether the reunionBriefInfo field is set.
       */
      public boolean hasReunionBriefInfo() {
        return reunionBriefInfoBuilder_ != null || reunionBriefInfo_ != null;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       * @return The reunionBriefInfo.
       */
      public emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo getReunionBriefInfo() {
        if (reunionBriefInfoBuilder_ == null) {
          return reunionBriefInfo_ == null ? emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.getDefaultInstance() : reunionBriefInfo_;
        } else {
          return reunionBriefInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       */
      public Builder setReunionBriefInfo(emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo value) {
        if (reunionBriefInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reunionBriefInfo_ = value;
          onChanged();
        } else {
          reunionBriefInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       */
      public Builder setReunionBriefInfo(
          emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder builderForValue) {
        if (reunionBriefInfoBuilder_ == null) {
          reunionBriefInfo_ = builderForValue.build();
          onChanged();
        } else {
          reunionBriefInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       */
      public Builder mergeReunionBriefInfo(emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo value) {
        if (reunionBriefInfoBuilder_ == null) {
          if (reunionBriefInfo_ != null) {
            reunionBriefInfo_ =
              emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.newBuilder(reunionBriefInfo_).mergeFrom(value).buildPartial();
          } else {
            reunionBriefInfo_ = value;
          }
          onChanged();
        } else {
          reunionBriefInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       */
      public Builder clearReunionBriefInfo() {
        if (reunionBriefInfoBuilder_ == null) {
          reunionBriefInfo_ = null;
          onChanged();
        } else {
          reunionBriefInfo_ = null;
          reunionBriefInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       */
      public emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder getReunionBriefInfoBuilder() {
        
        onChanged();
        return getReunionBriefInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       */
      public emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder getReunionBriefInfoOrBuilder() {
        if (reunionBriefInfoBuilder_ != null) {
          return reunionBriefInfoBuilder_.getMessageOrBuilder();
        } else {
          return reunionBriefInfo_ == null ?
              emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.getDefaultInstance() : reunionBriefInfo_;
        }
      }
      /**
       * <code>.ReunionBriefInfo reunion_brief_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo, emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder, emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder> 
          getReunionBriefInfoFieldBuilder() {
        if (reunionBriefInfoBuilder_ == null) {
          reunionBriefInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo, emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfo.Builder, emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.ReunionBriefInfoOrBuilder>(
                  getReunionBriefInfo(),
                  getParentForChildren(),
                  isClean());
          reunionBriefInfo_ = null;
        }
        return reunionBriefInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ReunionBriefInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:ReunionBriefInfoRsp)
    private static final emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp();
    }

    public static emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReunionBriefInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<ReunionBriefInfoRsp>() {
      @java.lang.Override
      public ReunionBriefInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReunionBriefInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReunionBriefInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.ReunionBriefInfoRspOuterClass.ReunionBriefInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReunionBriefInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReunionBriefInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ReunionBriefInfoRsp.proto\032\026ReunionBrie" +
      "fInfo.proto\"j\n\023ReunionBriefInfoRsp\022\023\n\013is" +
      "_activate\030\r \001(\010\022\017\n\007retcode\030\016 \001(\005\022-\n\022reun" +
      "ion_brief_info\030\005 \001(\0132\021.ReunionBriefInfoB" +
      "\036\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.getDescriptor(),
        });
    internal_static_ReunionBriefInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReunionBriefInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReunionBriefInfoRsp_descriptor,
        new java.lang.String[] { "IsActivate", "Retcode", "ReunionBriefInfo", });
    emu.grasscutter.net.oldproto.ReunionBriefInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}