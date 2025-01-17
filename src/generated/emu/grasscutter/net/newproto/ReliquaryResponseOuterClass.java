// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryResponse.proto

package emu.grasscutter.net.newproto;

public final class ReliquaryResponseOuterClass {
  private ReliquaryResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 equip_type = 15;</code>
     * @return The equipType.
     */
    int getEquipType();

    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    java.util.List<emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI> 
        getUnk2700DMDHDIHGPFAList();
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI getUnk2700DMDHDIHGPFA(int index);
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    int getUnk2700DMDHDIHGPFACount();
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    java.util.List<? extends emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder> 
        getUnk2700DMDHDIHGPFAOrBuilderList();
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder getUnk2700DMDHDIHGPFAOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ReliquaryResponse}
   */
  public static final class ReliquaryResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryResponse)
      ReliquaryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryResponse.newBuilder() to construct.
    private ReliquaryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryResponse() {
      unk2700DMDHDIHGPFA_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse.class, emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse.Builder.class);
    }

    public static final int EQUIP_TYPE_FIELD_NUMBER = 15;
    private int equipType_;
    /**
     * <code>uint32 equip_type = 15;</code>
     * @return The equipType.
     */
    @java.lang.Override
    public int getEquipType() {
      return equipType_;
    }

    public static final int UNK2700_DMDHDIHGPFA_FIELD_NUMBER = 13;
    private java.util.List<emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI> unk2700DMDHDIHGPFA_;
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI> getUnk2700DMDHDIHGPFAList() {
      return unk2700DMDHDIHGPFA_;
    }
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder> 
        getUnk2700DMDHDIHGPFAOrBuilderList() {
      return unk2700DMDHDIHGPFA_;
    }
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    @java.lang.Override
    public int getUnk2700DMDHDIHGPFACount() {
      return unk2700DMDHDIHGPFA_.size();
    }
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI getUnk2700DMDHDIHGPFA(int index) {
      return unk2700DMDHDIHGPFA_.get(index);
    }
    /**
     * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder getUnk2700DMDHDIHGPFAOrBuilder(
        int index) {
      return unk2700DMDHDIHGPFA_.get(index);
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
      for (int i = 0; i < unk2700DMDHDIHGPFA_.size(); i++) {
        output.writeMessage(13, unk2700DMDHDIHGPFA_.get(i));
      }
      if (equipType_ != 0) {
        output.writeUInt32(15, equipType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700DMDHDIHGPFA_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, unk2700DMDHDIHGPFA_.get(i));
      }
      if (equipType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, equipType_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse other = (emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse) obj;

      if (getEquipType()
          != other.getEquipType()) return false;
      if (!getUnk2700DMDHDIHGPFAList()
          .equals(other.getUnk2700DMDHDIHGPFAList())) return false;
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
      hash = (37 * hash) + EQUIP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEquipType();
      if (getUnk2700DMDHDIHGPFACount() > 0) {
        hash = (37 * hash) + UNK2700_DMDHDIHGPFA_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700DMDHDIHGPFAList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse prototype) {
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
     * Protobuf type {@code ReliquaryResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryResponse)
        emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse.class, emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        equipType_ = 0;

        if (unk2700DMDHDIHGPFABuilder_ == null) {
          unk2700DMDHDIHGPFA_ = java.util.Collections.emptyList();
        } else {
          unk2700DMDHDIHGPFA_ = null;
          unk2700DMDHDIHGPFABuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse build() {
        emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse buildPartial() {
        emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse result = new emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse(this);
        int from_bitField0_ = bitField0_;
        result.equipType_ = equipType_;
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700DMDHDIHGPFA_ = java.util.Collections.unmodifiableList(unk2700DMDHDIHGPFA_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700DMDHDIHGPFA_ = unk2700DMDHDIHGPFA_;
        } else {
          result.unk2700DMDHDIHGPFA_ = unk2700DMDHDIHGPFABuilder_.build();
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
        if (other instanceof emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse) {
          return mergeFrom((emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse other) {
        if (other == emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse.getDefaultInstance()) return this;
        if (other.getEquipType() != 0) {
          setEquipType(other.getEquipType());
        }
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          if (!other.unk2700DMDHDIHGPFA_.isEmpty()) {
            if (unk2700DMDHDIHGPFA_.isEmpty()) {
              unk2700DMDHDIHGPFA_ = other.unk2700DMDHDIHGPFA_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700DMDHDIHGPFAIsMutable();
              unk2700DMDHDIHGPFA_.addAll(other.unk2700DMDHDIHGPFA_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700DMDHDIHGPFA_.isEmpty()) {
            if (unk2700DMDHDIHGPFABuilder_.isEmpty()) {
              unk2700DMDHDIHGPFABuilder_.dispose();
              unk2700DMDHDIHGPFABuilder_ = null;
              unk2700DMDHDIHGPFA_ = other.unk2700DMDHDIHGPFA_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700DMDHDIHGPFABuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700DMDHDIHGPFAFieldBuilder() : null;
            } else {
              unk2700DMDHDIHGPFABuilder_.addAllMessages(other.unk2700DMDHDIHGPFA_);
            }
          }
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
              case 106: {
                emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI m =
                    input.readMessage(
                        emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.parser(),
                        extensionRegistry);
                if (unk2700DMDHDIHGPFABuilder_ == null) {
                  ensureUnk2700DMDHDIHGPFAIsMutable();
                  unk2700DMDHDIHGPFA_.add(m);
                } else {
                  unk2700DMDHDIHGPFABuilder_.addMessage(m);
                }
                break;
              } // case 106
              case 120: {
                equipType_ = input.readUInt32();

                break;
              } // case 120
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

      private int equipType_ ;
      /**
       * <code>uint32 equip_type = 15;</code>
       * @return The equipType.
       */
      @java.lang.Override
      public int getEquipType() {
        return equipType_;
      }
      /**
       * <code>uint32 equip_type = 15;</code>
       * @param value The equipType to set.
       * @return This builder for chaining.
       */
      public Builder setEquipType(int value) {
        
        equipType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 equip_type = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEquipType() {
        
        equipType_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI> unk2700DMDHDIHGPFA_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700DMDHDIHGPFAIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700DMDHDIHGPFA_ = new java.util.ArrayList<emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI>(unk2700DMDHDIHGPFA_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder> unk2700DMDHDIHGPFABuilder_;

      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI> getUnk2700DMDHDIHGPFAList() {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700DMDHDIHGPFA_);
        } else {
          return unk2700DMDHDIHGPFABuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public int getUnk2700DMDHDIHGPFACount() {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          return unk2700DMDHDIHGPFA_.size();
        } else {
          return unk2700DMDHDIHGPFABuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI getUnk2700DMDHDIHGPFA(int index) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          return unk2700DMDHDIHGPFA_.get(index);
        } else {
          return unk2700DMDHDIHGPFABuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder setUnk2700DMDHDIHGPFA(
          int index, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI value) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700DMDHDIHGPFAIsMutable();
          unk2700DMDHDIHGPFA_.set(index, value);
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder setUnk2700DMDHDIHGPFA(
          int index, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder builderForValue) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          ensureUnk2700DMDHDIHGPFAIsMutable();
          unk2700DMDHDIHGPFA_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder addUnk2700DMDHDIHGPFA(emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI value) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700DMDHDIHGPFAIsMutable();
          unk2700DMDHDIHGPFA_.add(value);
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder addUnk2700DMDHDIHGPFA(
          int index, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI value) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700DMDHDIHGPFAIsMutable();
          unk2700DMDHDIHGPFA_.add(index, value);
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder addUnk2700DMDHDIHGPFA(
          emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder builderForValue) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          ensureUnk2700DMDHDIHGPFAIsMutable();
          unk2700DMDHDIHGPFA_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder addUnk2700DMDHDIHGPFA(
          int index, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder builderForValue) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          ensureUnk2700DMDHDIHGPFAIsMutable();
          unk2700DMDHDIHGPFA_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder addAllUnk2700DMDHDIHGPFA(
          java.lang.Iterable<? extends emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI> values) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          ensureUnk2700DMDHDIHGPFAIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700DMDHDIHGPFA_);
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder clearUnk2700DMDHDIHGPFA() {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          unk2700DMDHDIHGPFA_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public Builder removeUnk2700DMDHDIHGPFA(int index) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          ensureUnk2700DMDHDIHGPFAIsMutable();
          unk2700DMDHDIHGPFA_.remove(index);
          onChanged();
        } else {
          unk2700DMDHDIHGPFABuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder getUnk2700DMDHDIHGPFABuilder(
          int index) {
        return getUnk2700DMDHDIHGPFAFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder getUnk2700DMDHDIHGPFAOrBuilder(
          int index) {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          return unk2700DMDHDIHGPFA_.get(index);  } else {
          return unk2700DMDHDIHGPFABuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder> 
           getUnk2700DMDHDIHGPFAOrBuilderList() {
        if (unk2700DMDHDIHGPFABuilder_ != null) {
          return unk2700DMDHDIHGPFABuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700DMDHDIHGPFA_);
        }
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder addUnk2700DMDHDIHGPFABuilder() {
        return getUnk2700DMDHDIHGPFAFieldBuilder().addBuilder(
            emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder addUnk2700DMDHDIHGPFABuilder(
          int index) {
        return getUnk2700DMDHDIHGPFAFieldBuilder().addBuilder(
            index, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_GBBDJMDIDEI Unk2700_DMDHDIHGPFA = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder> 
           getUnk2700DMDHDIHGPFABuilderList() {
        return getUnk2700DMDHDIHGPFAFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder> 
          getUnk2700DMDHDIHGPFAFieldBuilder() {
        if (unk2700DMDHDIHGPFABuilder_ == null) {
          unk2700DMDHDIHGPFABuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEI.Builder, emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.Unk2700_GBBDJMDIDEIOrBuilder>(
                  unk2700DMDHDIHGPFA_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700DMDHDIHGPFA_ = null;
        }
        return unk2700DMDHDIHGPFABuilder_;
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


      // @@protoc_insertion_point(builder_scope:ReliquaryResponse)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryResponse)
    private static final emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse();
    }

    public static emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryResponse>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryResponse>() {
      @java.lang.Override
      public ReliquaryResponse parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReliquaryResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.ReliquaryResponseOuterClass.ReliquaryResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ReliquaryResponse.proto\032\031Unk2700_GBBDJ" +
      "MDIDEI.proto\"Z\n\021ReliquaryResponse\022\022\n\nequ" +
      "ip_type\030\017 \001(\r\0221\n\023Unk2700_DMDHDIHGPFA\030\r \003" +
      "(\0132\024.Unk2700_GBBDJMDIDEIB\036\n\034emu.grasscut" +
      "ter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.getDescriptor(),
        });
    internal_static_ReliquaryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryResponse_descriptor,
        new java.lang.String[] { "EquipType", "Unk2700DMDHDIHGPFA", });
    emu.grasscutter.net.newproto.Unk2700GBBDJMDIDEI.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
