// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2800_BPOJIIDEADD.proto

package emu.grasscutter.net.newproto;

public final class Unk2800BPOJIIDEADD {
  private Unk2800BPOJIIDEADD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2800_BPOJIIDEADDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2800_BPOJIIDEADD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_DFGHKDBENED = 1;</code>
     * @return The unk3250DFGHKDBENED.
     */
    int getUnk3250DFGHKDBENED();

    /**
     * <code>bool is_finished = 9;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 open_time = 11;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    int getUnk3250PPIHJFNMEFB();

    /**
     * <code>uint32 Unk3250_FIKPLGJIBGP = 13;</code>
     * @return The unk3250FIKPLGJIBGP.
     */
    int getUnk3250FIKPLGJIBGP();
  }
  /**
   * Protobuf type {@code Unk2800_BPOJIIDEADD}
   */
  public static final class Unk2800_BPOJIIDEADD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2800_BPOJIIDEADD)
      Unk2800_BPOJIIDEADDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2800_BPOJIIDEADD.newBuilder() to construct.
    private Unk2800_BPOJIIDEADD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2800_BPOJIIDEADD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2800_BPOJIIDEADD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.internal_static_Unk2800_BPOJIIDEADD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.internal_static_Unk2800_BPOJIIDEADD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD.class, emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD.Builder.class);
    }

    public static final int UNK3250_DFGHKDBENED_FIELD_NUMBER = 1;
    private int unk3250DFGHKDBENED_;
    /**
     * <code>uint32 Unk3250_DFGHKDBENED = 1;</code>
     * @return The unk3250DFGHKDBENED.
     */
    @java.lang.Override
    public int getUnk3250DFGHKDBENED() {
      return unk3250DFGHKDBENED_;
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 9;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 9;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 11;
    private int openTime_;
    /**
     * <code>uint32 open_time = 11;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 10;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 10;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int UNK3250_PPIHJFNMEFB_FIELD_NUMBER = 12;
    private int unk3250PPIHJFNMEFB_;
    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    @java.lang.Override
    public int getUnk3250PPIHJFNMEFB() {
      return unk3250PPIHJFNMEFB_;
    }

    public static final int UNK3250_FIKPLGJIBGP_FIELD_NUMBER = 13;
    private int unk3250FIKPLGJIBGP_;
    /**
     * <code>uint32 Unk3250_FIKPLGJIBGP = 13;</code>
     * @return The unk3250FIKPLGJIBGP.
     */
    @java.lang.Override
    public int getUnk3250FIKPLGJIBGP() {
      return unk3250FIKPLGJIBGP_;
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
      if (unk3250DFGHKDBENED_ != 0) {
        output.writeUInt32(1, unk3250DFGHKDBENED_);
      }
      if (isFinished_ != false) {
        output.writeBool(9, isFinished_);
      }
      if (isOpen_ != false) {
        output.writeBool(10, isOpen_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(11, openTime_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        output.writeUInt32(12, unk3250PPIHJFNMEFB_);
      }
      if (unk3250FIKPLGJIBGP_ != 0) {
        output.writeUInt32(13, unk3250FIKPLGJIBGP_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250DFGHKDBENED_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, unk3250DFGHKDBENED_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isFinished_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isOpen_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, openTime_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3250PPIHJFNMEFB_);
      }
      if (unk3250FIKPLGJIBGP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk3250FIKPLGJIBGP_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD other = (emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD) obj;

      if (getUnk3250DFGHKDBENED()
          != other.getUnk3250DFGHKDBENED()) return false;
      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getUnk3250PPIHJFNMEFB()
          != other.getUnk3250PPIHJFNMEFB()) return false;
      if (getUnk3250FIKPLGJIBGP()
          != other.getUnk3250FIKPLGJIBGP()) return false;
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
      hash = (37 * hash) + UNK3250_DFGHKDBENED_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250DFGHKDBENED();
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + UNK3250_PPIHJFNMEFB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPIHJFNMEFB();
      hash = (37 * hash) + UNK3250_FIKPLGJIBGP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250FIKPLGJIBGP();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD prototype) {
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
     * Protobuf type {@code Unk2800_BPOJIIDEADD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2800_BPOJIIDEADD)
        emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.internal_static_Unk2800_BPOJIIDEADD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.internal_static_Unk2800_BPOJIIDEADD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD.class, emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3250DFGHKDBENED_ = 0;

        isFinished_ = false;

        openTime_ = 0;

        isOpen_ = false;

        unk3250PPIHJFNMEFB_ = 0;

        unk3250FIKPLGJIBGP_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.internal_static_Unk2800_BPOJIIDEADD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD build() {
        emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD buildPartial() {
        emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD result = new emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD(this);
        result.unk3250DFGHKDBENED_ = unk3250DFGHKDBENED_;
        result.isFinished_ = isFinished_;
        result.openTime_ = openTime_;
        result.isOpen_ = isOpen_;
        result.unk3250PPIHJFNMEFB_ = unk3250PPIHJFNMEFB_;
        result.unk3250FIKPLGJIBGP_ = unk3250FIKPLGJIBGP_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD other) {
        if (other == emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD.getDefaultInstance()) return this;
        if (other.getUnk3250DFGHKDBENED() != 0) {
          setUnk3250DFGHKDBENED(other.getUnk3250DFGHKDBENED());
        }
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getUnk3250PPIHJFNMEFB() != 0) {
          setUnk3250PPIHJFNMEFB(other.getUnk3250PPIHJFNMEFB());
        }
        if (other.getUnk3250FIKPLGJIBGP() != 0) {
          setUnk3250FIKPLGJIBGP(other.getUnk3250FIKPLGJIBGP());
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
                unk3250DFGHKDBENED_ = input.readUInt32();

                break;
              } // case 8
              case 72: {
                isFinished_ = input.readBool();

                break;
              } // case 72
              case 80: {
                isOpen_ = input.readBool();

                break;
              } // case 80
              case 88: {
                openTime_ = input.readUInt32();

                break;
              } // case 88
              case 96: {
                unk3250PPIHJFNMEFB_ = input.readUInt32();

                break;
              } // case 96
              case 104: {
                unk3250FIKPLGJIBGP_ = input.readUInt32();

                break;
              } // case 104
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

      private int unk3250DFGHKDBENED_ ;
      /**
       * <code>uint32 Unk3250_DFGHKDBENED = 1;</code>
       * @return The unk3250DFGHKDBENED.
       */
      @java.lang.Override
      public int getUnk3250DFGHKDBENED() {
        return unk3250DFGHKDBENED_;
      }
      /**
       * <code>uint32 Unk3250_DFGHKDBENED = 1;</code>
       * @param value The unk3250DFGHKDBENED to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250DFGHKDBENED(int value) {
        
        unk3250DFGHKDBENED_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_DFGHKDBENED = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250DFGHKDBENED() {
        
        unk3250DFGHKDBENED_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 9;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 9;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 11;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 11;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
        
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        
        openTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 10;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int unk3250PPIHJFNMEFB_ ;
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
       * @return The unk3250PPIHJFNMEFB.
       */
      @java.lang.Override
      public int getUnk3250PPIHJFNMEFB() {
        return unk3250PPIHJFNMEFB_;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
       * @param value The unk3250PPIHJFNMEFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPIHJFNMEFB(int value) {
        
        unk3250PPIHJFNMEFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PPIHJFNMEFB() {
        
        unk3250PPIHJFNMEFB_ = 0;
        onChanged();
        return this;
      }

      private int unk3250FIKPLGJIBGP_ ;
      /**
       * <code>uint32 Unk3250_FIKPLGJIBGP = 13;</code>
       * @return The unk3250FIKPLGJIBGP.
       */
      @java.lang.Override
      public int getUnk3250FIKPLGJIBGP() {
        return unk3250FIKPLGJIBGP_;
      }
      /**
       * <code>uint32 Unk3250_FIKPLGJIBGP = 13;</code>
       * @param value The unk3250FIKPLGJIBGP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250FIKPLGJIBGP(int value) {
        
        unk3250FIKPLGJIBGP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_FIKPLGJIBGP = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250FIKPLGJIBGP() {
        
        unk3250FIKPLGJIBGP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2800_BPOJIIDEADD)
    }

    // @@protoc_insertion_point(class_scope:Unk2800_BPOJIIDEADD)
    private static final emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD();
    }

    public static emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2800_BPOJIIDEADD>
        PARSER = new com.google.protobuf.AbstractParser<Unk2800_BPOJIIDEADD>() {
      @java.lang.Override
      public Unk2800_BPOJIIDEADD parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2800_BPOJIIDEADD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2800_BPOJIIDEADD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2800BPOJIIDEADD.Unk2800_BPOJIIDEADD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2800_BPOJIIDEADD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2800_BPOJIIDEADD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2800_BPOJIIDEADD.proto\"\245\001\n\023Unk2800_" +
      "BPOJIIDEADD\022\033\n\023Unk3250_DFGHKDBENED\030\001 \001(\r" +
      "\022\023\n\013is_finished\030\t \001(\010\022\021\n\topen_time\030\013 \001(\r" +
      "\022\017\n\007is_open\030\n \001(\010\022\033\n\023Unk3250_PPIHJFNMEFB" +
      "\030\014 \001(\r\022\033\n\023Unk3250_FIKPLGJIBGP\030\r \001(\rB\036\n\034e" +
      "mu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2800_BPOJIIDEADD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2800_BPOJIIDEADD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2800_BPOJIIDEADD_descriptor,
        new java.lang.String[] { "Unk3250DFGHKDBENED", "IsFinished", "OpenTime", "IsOpen", "Unk3250PPIHJFNMEFB", "Unk3250FIKPLGJIBGP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
