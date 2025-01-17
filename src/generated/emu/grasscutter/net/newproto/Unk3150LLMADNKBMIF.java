// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_LLMADNKBMIF.proto

package emu.grasscutter.net.newproto;

public final class Unk3150LLMADNKBMIF {
  private Unk3150LLMADNKBMIF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_LLMADNKBMIFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_LLMADNKBMIF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 slot_id = 11;</code>
     * @return The slotId.
     */
    int getSlotId();
  }
  /**
   * <pre>
   * CmdId: 4788
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_LLMADNKBMIF}
   */
  public static final class Unk3150_LLMADNKBMIF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_LLMADNKBMIF)
      Unk3150_LLMADNKBMIFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_LLMADNKBMIF.newBuilder() to construct.
    private Unk3150_LLMADNKBMIF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_LLMADNKBMIF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_LLMADNKBMIF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.internal_static_Unk3150_LLMADNKBMIF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.internal_static_Unk3150_LLMADNKBMIF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF.class, emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SLOT_ID_FIELD_NUMBER = 11;
    private int slotId_;
    /**
     * <code>uint32 slot_id = 11;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
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
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (slotId_ != 0) {
        output.writeUInt32(11, slotId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, slotId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF other = (emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getSlotId()
          != other.getSlotId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF prototype) {
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
     * CmdId: 4788
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_LLMADNKBMIF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_LLMADNKBMIF)
        emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.internal_static_Unk3150_LLMADNKBMIF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.internal_static_Unk3150_LLMADNKBMIF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF.class, emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        slotId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.internal_static_Unk3150_LLMADNKBMIF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF build() {
        emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF buildPartial() {
        emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF result = new emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF(this);
        result.retcode_ = retcode_;
        result.slotId_ = slotId_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF other) {
        if (other == emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
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
              case 24: {
                retcode_ = input.readInt32();

                break;
              } // case 24
              case 88: {
                slotId_ = input.readUInt32();

                break;
              } // case 88
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slot_id = 11;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slot_id = 11;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {
        
        slotId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        
        slotId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_LLMADNKBMIF)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_LLMADNKBMIF)
    private static final emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF();
    }

    public static emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_LLMADNKBMIF>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_LLMADNKBMIF>() {
      @java.lang.Override
      public Unk3150_LLMADNKBMIF parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_LLMADNKBMIF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_LLMADNKBMIF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150LLMADNKBMIF.Unk3150_LLMADNKBMIF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_LLMADNKBMIF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_LLMADNKBMIF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_LLMADNKBMIF.proto\"7\n\023Unk3150_L" +
      "LMADNKBMIF\022\017\n\007retcode\030\003 \001(\005\022\017\n\007slot_id\030\013" +
      " \001(\rB\036\n\034emu.grasscutter.net.newprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_LLMADNKBMIF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_LLMADNKBMIF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_LLMADNKBMIF_descriptor,
        new java.lang.String[] { "Retcode", "SlotId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
