// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_AFOPONDCLKC.proto

package emu.grasscutter.net.newproto;

public final class Unk2700AFOPONDCLKC {
  private Unk2700AFOPONDCLKC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_AFOPONDCLKCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_AFOPONDCLKC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 15;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     * @return Whether the profilePicture field is set.
     */
    boolean hasProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     * @return The profilePicture.
     */
    emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture getProfilePicture();
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     */
    emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder();

    /**
     * <code>repeated uint32 item_id_list = 5;</code>
     * @return A list containing the itemIdList.
     */
    java.util.List<java.lang.Integer> getItemIdListList();
    /**
     * <code>repeated uint32 item_id_list = 5;</code>
     * @return The count of itemIdList.
     */
    int getItemIdListCount();
    /**
     * <code>repeated uint32 item_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    int getItemIdList(int index);

    /**
     * <code>string nickname = 8;</code>
     * @return The nickname.
     */
    java.lang.String getNickname();
    /**
     * <code>string nickname = 8;</code>
     * @return The bytes for nickname.
     */
    com.google.protobuf.ByteString
        getNicknameBytes();
  }
  /**
   * Protobuf type {@code Unk2700_AFOPONDCLKC}
   */
  public static final class Unk2700_AFOPONDCLKC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_AFOPONDCLKC)
      Unk2700_AFOPONDCLKCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_AFOPONDCLKC.newBuilder() to construct.
    private Unk2700_AFOPONDCLKC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_AFOPONDCLKC() {
      itemIdList_ = emptyIntList();
      nickname_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_AFOPONDCLKC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.internal_static_Unk2700_AFOPONDCLKC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.internal_static_Unk2700_AFOPONDCLKC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC.class, emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 15;
    private int uid_;
    /**
     * <code>uint32 uid = 15;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int PROFILE_PICTURE_FIELD_NUMBER = 11;
    private emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     * @return Whether the profilePicture field is set.
     */
    @java.lang.Override
    public boolean hasProfilePicture() {
      return profilePicture_ != null;
    }
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     * @return The profilePicture.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
      return profilePicture_ == null ? emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
    }
    /**
     * <code>.ProfilePicture profile_picture = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
      return getProfilePicture();
    }

    public static final int ITEM_ID_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList itemIdList_;
    /**
     * <code>repeated uint32 item_id_list = 5;</code>
     * @return A list containing the itemIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getItemIdListList() {
      return itemIdList_;
    }
    /**
     * <code>repeated uint32 item_id_list = 5;</code>
     * @return The count of itemIdList.
     */
    public int getItemIdListCount() {
      return itemIdList_.size();
    }
    /**
     * <code>repeated uint32 item_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The itemIdList at the given index.
     */
    public int getItemIdList(int index) {
      return itemIdList_.getInt(index);
    }
    private int itemIdListMemoizedSerializedSize = -1;

    public static final int NICKNAME_FIELD_NUMBER = 8;
    private volatile java.lang.Object nickname_;
    /**
     * <code>string nickname = 8;</code>
     * @return The nickname.
     */
    @java.lang.Override
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 8;</code>
     * @return The bytes for nickname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (getItemIdListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(itemIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < itemIdList_.size(); i++) {
        output.writeUInt32NoTag(itemIdList_.getInt(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 8, nickname_);
      }
      if (profilePicture_ != null) {
        output.writeMessage(11, getProfilePicture());
      }
      if (uid_ != 0) {
        output.writeUInt32(15, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < itemIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(itemIdList_.getInt(i));
        }
        size += dataSize;
        if (!getItemIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        itemIdListMemoizedSerializedSize = dataSize;
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, nickname_);
      }
      if (profilePicture_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getProfilePicture());
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC other = (emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC) obj;

      if (getUid()
          != other.getUid()) return false;
      if (hasProfilePicture() != other.hasProfilePicture()) return false;
      if (hasProfilePicture()) {
        if (!getProfilePicture()
            .equals(other.getProfilePicture())) return false;
      }
      if (!getItemIdListList()
          .equals(other.getItemIdListList())) return false;
      if (!getNickname()
          .equals(other.getNickname())) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      if (hasProfilePicture()) {
        hash = (37 * hash) + PROFILE_PICTURE_FIELD_NUMBER;
        hash = (53 * hash) + getProfilePicture().hashCode();
      }
      if (getItemIdListCount() > 0) {
        hash = (37 * hash) + ITEM_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemIdListList().hashCode();
      }
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC prototype) {
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
     * Protobuf type {@code Unk2700_AFOPONDCLKC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_AFOPONDCLKC)
        emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.internal_static_Unk2700_AFOPONDCLKC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.internal_static_Unk2700_AFOPONDCLKC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC.class, emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        uid_ = 0;

        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }
        itemIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        nickname_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.internal_static_Unk2700_AFOPONDCLKC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC build() {
        emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC buildPartial() {
        emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC result = new emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC(this);
        int from_bitField0_ = bitField0_;
        result.uid_ = uid_;
        if (profilePictureBuilder_ == null) {
          result.profilePicture_ = profilePicture_;
        } else {
          result.profilePicture_ = profilePictureBuilder_.build();
        }
        if (((bitField0_ & 0x00000001) != 0)) {
          itemIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.itemIdList_ = itemIdList_;
        result.nickname_ = nickname_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC other) {
        if (other == emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.hasProfilePicture()) {
          mergeProfilePicture(other.getProfilePicture());
        }
        if (!other.itemIdList_.isEmpty()) {
          if (itemIdList_.isEmpty()) {
            itemIdList_ = other.itemIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemIdListIsMutable();
            itemIdList_.addAll(other.itemIdList_);
          }
          onChanged();
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
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
              case 40: {
                int v = input.readUInt32();
                ensureItemIdListIsMutable();
                itemIdList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureItemIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  itemIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 66: {
                nickname_ = input.readStringRequireUtf8();

                break;
              } // case 66
              case 90: {
                input.readMessage(
                    getProfilePictureFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 90
              case 120: {
                uid_ = input.readUInt32();

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

      private int uid_ ;
      /**
       * <code>uint32 uid = 15;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 15;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture profilePicture_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePictureOrBuilder> profilePictureBuilder_;
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       * @return Whether the profilePicture field is set.
       */
      public boolean hasProfilePicture() {
        return profilePictureBuilder_ != null || profilePicture_ != null;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       * @return The profilePicture.
       */
      public emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture getProfilePicture() {
        if (profilePictureBuilder_ == null) {
          return profilePicture_ == null ? emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        } else {
          return profilePictureBuilder_.getMessage();
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public Builder setProfilePicture(emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          profilePicture_ = value;
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public Builder setProfilePicture(
          emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.Builder builderForValue) {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = builderForValue.build();
          onChanged();
        } else {
          profilePictureBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public Builder mergeProfilePicture(emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture value) {
        if (profilePictureBuilder_ == null) {
          if (profilePicture_ != null) {
            profilePicture_ =
              emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.newBuilder(profilePicture_).mergeFrom(value).buildPartial();
          } else {
            profilePicture_ = value;
          }
          onChanged();
        } else {
          profilePictureBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public Builder clearProfilePicture() {
        if (profilePictureBuilder_ == null) {
          profilePicture_ = null;
          onChanged();
        } else {
          profilePicture_ = null;
          profilePictureBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.Builder getProfilePictureBuilder() {
        
        onChanged();
        return getProfilePictureFieldBuilder().getBuilder();
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      public emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePictureOrBuilder getProfilePictureOrBuilder() {
        if (profilePictureBuilder_ != null) {
          return profilePictureBuilder_.getMessageOrBuilder();
        } else {
          return profilePicture_ == null ?
              emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.getDefaultInstance() : profilePicture_;
        }
      }
      /**
       * <code>.ProfilePicture profile_picture = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePictureOrBuilder> 
          getProfilePictureFieldBuilder() {
        if (profilePictureBuilder_ == null) {
          profilePictureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture, emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePicture.Builder, emu.grasscutter.net.newproto.ProfilePictureOuterClass.ProfilePictureOrBuilder>(
                  getProfilePicture(),
                  getParentForChildren(),
                  isClean());
          profilePicture_ = null;
        }
        return profilePictureBuilder_;
      }

      private com.google.protobuf.Internal.IntList itemIdList_ = emptyIntList();
      private void ensureItemIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemIdList_ = mutableCopy(itemIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 item_id_list = 5;</code>
       * @return A list containing the itemIdList.
       */
      public java.util.List<java.lang.Integer>
          getItemIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(itemIdList_) : itemIdList_;
      }
      /**
       * <code>repeated uint32 item_id_list = 5;</code>
       * @return The count of itemIdList.
       */
      public int getItemIdListCount() {
        return itemIdList_.size();
      }
      /**
       * <code>repeated uint32 item_id_list = 5;</code>
       * @param index The index of the element to return.
       * @return The itemIdList at the given index.
       */
      public int getItemIdList(int index) {
        return itemIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 item_id_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The itemIdList to set.
       * @return This builder for chaining.
       */
      public Builder setItemIdList(
          int index, int value) {
        ensureItemIdListIsMutable();
        itemIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 5;</code>
       * @param value The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addItemIdList(int value) {
        ensureItemIdListIsMutable();
        itemIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 5;</code>
       * @param values The itemIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllItemIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureItemIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 item_id_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemIdList() {
        itemIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.lang.Object nickname_ = "";
      /**
       * <code>string nickname = 8;</code>
       * @return The nickname.
       */
      public java.lang.String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nickname = 8;</code>
       * @return The bytes for nickname.
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        java.lang.Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 8;</code>
       * @param value The nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 8;</code>
       * @param value The bytes for nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_AFOPONDCLKC)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_AFOPONDCLKC)
    private static final emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC();
    }

    public static emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_AFOPONDCLKC>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_AFOPONDCLKC>() {
      @java.lang.Override
      public Unk2700_AFOPONDCLKC parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_AFOPONDCLKC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_AFOPONDCLKC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700AFOPONDCLKC.Unk2700_AFOPONDCLKC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_AFOPONDCLKC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_AFOPONDCLKC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_AFOPONDCLKC.proto\032\024ProfilePict" +
      "ure.proto\"t\n\023Unk2700_AFOPONDCLKC\022\013\n\003uid\030" +
      "\017 \001(\r\022(\n\017profile_picture\030\013 \001(\0132\017.Profile" +
      "Picture\022\024\n\014item_id_list\030\005 \003(\r\022\020\n\010nicknam" +
      "e\030\010 \001(\tB\036\n\034emu.grasscutter.net.newprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.ProfilePictureOuterClass.getDescriptor(),
        });
    internal_static_Unk2700_AFOPONDCLKC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_AFOPONDCLKC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_AFOPONDCLKC_descriptor,
        new java.lang.String[] { "Uid", "ProfilePicture", "ItemIdList", "Nickname", });
    emu.grasscutter.net.newproto.ProfilePictureOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
