// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_PBDLCHLNGHG.proto

package emu.grasscutter.net.newproto;

public final class Unk3150PBDLCHLNGHG {
  private Unk3150PBDLCHLNGHG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_PBDLCHLNGHGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_PBDLCHLNGHG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
     * @return The unk3150OKCMOIDKJGJ.
     */
    java.lang.String getUnk3150OKCMOIDKJGJ();
    /**
     * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
     * @return The bytes for unk3150OKCMOIDKJGJ.
     */
    com.google.protobuf.ByteString
        getUnk3150OKCMOIDKJGJBytes();

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
     * @return Whether the sceneArrangementInfo field is set.
     */
    boolean hasSceneArrangementInfo();
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
     * @return The sceneArrangementInfo.
     */
    emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo();
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
     */
    emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 4661
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_PBDLCHLNGHG}
   */
  public static final class Unk3150_PBDLCHLNGHG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_PBDLCHLNGHG)
      Unk3150_PBDLCHLNGHGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_PBDLCHLNGHG.newBuilder() to construct.
    private Unk3150_PBDLCHLNGHG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_PBDLCHLNGHG() {
      unk3150OKCMOIDKJGJ_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_PBDLCHLNGHG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.internal_static_Unk3150_PBDLCHLNGHG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.internal_static_Unk3150_PBDLCHLNGHG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG.class, emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG.Builder.class);
    }

    public static final int UNK3150_OKCMOIDKJGJ_FIELD_NUMBER = 5;
    private volatile java.lang.Object unk3150OKCMOIDKJGJ_;
    /**
     * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
     * @return The unk3150OKCMOIDKJGJ.
     */
    @java.lang.Override
    public java.lang.String getUnk3150OKCMOIDKJGJ() {
      java.lang.Object ref = unk3150OKCMOIDKJGJ_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unk3150OKCMOIDKJGJ_ = s;
        return s;
      }
    }
    /**
     * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
     * @return The bytes for unk3150OKCMOIDKJGJ.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUnk3150OKCMOIDKJGJBytes() {
      java.lang.Object ref = unk3150OKCMOIDKJGJ_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unk3150OKCMOIDKJGJ_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCENE_ARRANGEMENT_INFO_FIELD_NUMBER = 15;
    private emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
     * @return Whether the sceneArrangementInfo field is set.
     */
    @java.lang.Override
    public boolean hasSceneArrangementInfo() {
      return sceneArrangementInfo_ != null;
    }
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
     * @return The sceneArrangementInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
      return sceneArrangementInfo_ == null ? emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
    }
    /**
     * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
      return getSceneArrangementInfo();
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3150OKCMOIDKJGJ_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, unk3150OKCMOIDKJGJ_);
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (sceneArrangementInfo_ != null) {
        output.writeMessage(15, getSceneArrangementInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unk3150OKCMOIDKJGJ_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, unk3150OKCMOIDKJGJ_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (sceneArrangementInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getSceneArrangementInfo());
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG other = (emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG) obj;

      if (!getUnk3150OKCMOIDKJGJ()
          .equals(other.getUnk3150OKCMOIDKJGJ())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasSceneArrangementInfo() != other.hasSceneArrangementInfo()) return false;
      if (hasSceneArrangementInfo()) {
        if (!getSceneArrangementInfo()
            .equals(other.getSceneArrangementInfo())) return false;
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
      hash = (37 * hash) + UNK3150_OKCMOIDKJGJ_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150OKCMOIDKJGJ().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasSceneArrangementInfo()) {
        hash = (37 * hash) + SCENE_ARRANGEMENT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSceneArrangementInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG prototype) {
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
     * CmdId: 4661
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_PBDLCHLNGHG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_PBDLCHLNGHG)
        emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.internal_static_Unk3150_PBDLCHLNGHG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.internal_static_Unk3150_PBDLCHLNGHG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG.class, emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150OKCMOIDKJGJ_ = "";

        retcode_ = 0;

        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = null;
        } else {
          sceneArrangementInfo_ = null;
          sceneArrangementInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.internal_static_Unk3150_PBDLCHLNGHG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG build() {
        emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG buildPartial() {
        emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG result = new emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG(this);
        result.unk3150OKCMOIDKJGJ_ = unk3150OKCMOIDKJGJ_;
        result.retcode_ = retcode_;
        if (sceneArrangementInfoBuilder_ == null) {
          result.sceneArrangementInfo_ = sceneArrangementInfo_;
        } else {
          result.sceneArrangementInfo_ = sceneArrangementInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG other) {
        if (other == emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG.getDefaultInstance()) return this;
        if (!other.getUnk3150OKCMOIDKJGJ().isEmpty()) {
          unk3150OKCMOIDKJGJ_ = other.unk3150OKCMOIDKJGJ_;
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasSceneArrangementInfo()) {
          mergeSceneArrangementInfo(other.getSceneArrangementInfo());
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
                unk3150OKCMOIDKJGJ_ = input.readStringRequireUtf8();

                break;
              } // case 42
              case 96: {
                retcode_ = input.readInt32();

                break;
              } // case 96
              case 122: {
                input.readMessage(
                    getSceneArrangementInfoFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 122
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

      private java.lang.Object unk3150OKCMOIDKJGJ_ = "";
      /**
       * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
       * @return The unk3150OKCMOIDKJGJ.
       */
      public java.lang.String getUnk3150OKCMOIDKJGJ() {
        java.lang.Object ref = unk3150OKCMOIDKJGJ_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          unk3150OKCMOIDKJGJ_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
       * @return The bytes for unk3150OKCMOIDKJGJ.
       */
      public com.google.protobuf.ByteString
          getUnk3150OKCMOIDKJGJBytes() {
        java.lang.Object ref = unk3150OKCMOIDKJGJ_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          unk3150OKCMOIDKJGJ_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
       * @param value The unk3150OKCMOIDKJGJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150OKCMOIDKJGJ(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        unk3150OKCMOIDKJGJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150OKCMOIDKJGJ() {
        
        unk3150OKCMOIDKJGJ_ = getDefaultInstance().getUnk3150OKCMOIDKJGJ();
        onChanged();
        return this;
      }
      /**
       * <code>string Unk3150_OKCMOIDKJGJ = 5;</code>
       * @param value The bytes for unk3150OKCMOIDKJGJ to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150OKCMOIDKJGJBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        unk3150OKCMOIDKJGJ_ = value;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo sceneArrangementInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> sceneArrangementInfoBuilder_;
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       * @return Whether the sceneArrangementInfo field is set.
       */
      public boolean hasSceneArrangementInfo() {
        return sceneArrangementInfoBuilder_ != null || sceneArrangementInfo_ != null;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       * @return The sceneArrangementInfo.
       */
      public emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo getSceneArrangementInfo() {
        if (sceneArrangementInfoBuilder_ == null) {
          return sceneArrangementInfo_ == null ? emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
        } else {
          return sceneArrangementInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       */
      public Builder setSceneArrangementInfo(emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          sceneArrangementInfo_ = value;
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       */
      public Builder setSceneArrangementInfo(
          emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder builderForValue) {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = builderForValue.build();
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       */
      public Builder mergeSceneArrangementInfo(emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo value) {
        if (sceneArrangementInfoBuilder_ == null) {
          if (sceneArrangementInfo_ != null) {
            sceneArrangementInfo_ =
              emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.newBuilder(sceneArrangementInfo_).mergeFrom(value).buildPartial();
          } else {
            sceneArrangementInfo_ = value;
          }
          onChanged();
        } else {
          sceneArrangementInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       */
      public Builder clearSceneArrangementInfo() {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfo_ = null;
          onChanged();
        } else {
          sceneArrangementInfo_ = null;
          sceneArrangementInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       */
      public emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder getSceneArrangementInfoBuilder() {
        
        onChanged();
        return getSceneArrangementInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       */
      public emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder getSceneArrangementInfoOrBuilder() {
        if (sceneArrangementInfoBuilder_ != null) {
          return sceneArrangementInfoBuilder_.getMessageOrBuilder();
        } else {
          return sceneArrangementInfo_ == null ?
              emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.getDefaultInstance() : sceneArrangementInfo_;
        }
      }
      /**
       * <code>.HomeSceneArrangementInfo scene_arrangement_info = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder> 
          getSceneArrangementInfoFieldBuilder() {
        if (sceneArrangementInfoBuilder_ == null) {
          sceneArrangementInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo, emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfo.Builder, emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.HomeSceneArrangementInfoOrBuilder>(
                  getSceneArrangementInfo(),
                  getParentForChildren(),
                  isClean());
          sceneArrangementInfo_ = null;
        }
        return sceneArrangementInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_PBDLCHLNGHG)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_PBDLCHLNGHG)
    private static final emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG();
    }

    public static emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_PBDLCHLNGHG>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_PBDLCHLNGHG>() {
      @java.lang.Override
      public Unk3150_PBDLCHLNGHG parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_PBDLCHLNGHG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_PBDLCHLNGHG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150PBDLCHLNGHG.Unk3150_PBDLCHLNGHG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_PBDLCHLNGHG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_PBDLCHLNGHG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_PBDLCHLNGHG.proto\032\036HomeSceneAr" +
      "rangementInfo.proto\"~\n\023Unk3150_PBDLCHLNG" +
      "HG\022\033\n\023Unk3150_OKCMOIDKJGJ\030\005 \001(\t\022\017\n\007retco" +
      "de\030\014 \001(\005\0229\n\026scene_arrangement_info\030\017 \001(\013" +
      "2\031.HomeSceneArrangementInfoB\036\n\034emu.grass" +
      "cutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.getDescriptor(),
        });
    internal_static_Unk3150_PBDLCHLNGHG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_PBDLCHLNGHG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_PBDLCHLNGHG_descriptor,
        new java.lang.String[] { "Unk3150OKCMOIDKJGJ", "Retcode", "SceneArrangementInfo", });
    emu.grasscutter.net.newproto.HomeSceneArrangementInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}