// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_MCADFHBEBEA.proto

package emu.grasscutter.net.newproto;

public final class Unk3150MCADFHBEBEA {
  private Unk3150MCADFHBEBEA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_MCADFHBEBEAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_MCADFHBEBEA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3150_LEEGABHMLHA = 14;</code>
     * @return The unk3150LEEGABHMLHA.
     */
    int getUnk3150LEEGABHMLHA();

    /**
     * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
     * @return The enum numeric value on the wire for unk3150EOGGPMLMLPC.
     */
    int getUnk3150EOGGPMLMLPCValue();
    /**
     * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
     * @return The unk3150EOGGPMLMLPC.
     */
    emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC getUnk3150EOGGPMLMLPC();
  }
  /**
   * Protobuf type {@code Unk3150_MCADFHBEBEA}
   */
  public static final class Unk3150_MCADFHBEBEA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_MCADFHBEBEA)
      Unk3150_MCADFHBEBEAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_MCADFHBEBEA.newBuilder() to construct.
    private Unk3150_MCADFHBEBEA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_MCADFHBEBEA() {
      unk3150EOGGPMLMLPC_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_MCADFHBEBEA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.internal_static_Unk3150_MCADFHBEBEA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.internal_static_Unk3150_MCADFHBEBEA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA.class, emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA.Builder.class);
    }

    public static final int UNK3150_LEEGABHMLHA_FIELD_NUMBER = 14;
    private int unk3150LEEGABHMLHA_;
    /**
     * <code>uint32 Unk3150_LEEGABHMLHA = 14;</code>
     * @return The unk3150LEEGABHMLHA.
     */
    @java.lang.Override
    public int getUnk3150LEEGABHMLHA() {
      return unk3150LEEGABHMLHA_;
    }

    public static final int UNK3150_EOGGPMLMLPC_FIELD_NUMBER = 12;
    private int unk3150EOGGPMLMLPC_;
    /**
     * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
     * @return The enum numeric value on the wire for unk3150EOGGPMLMLPC.
     */
    @java.lang.Override public int getUnk3150EOGGPMLMLPCValue() {
      return unk3150EOGGPMLMLPC_;
    }
    /**
     * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
     * @return The unk3150EOGGPMLMLPC.
     */
    @java.lang.Override public emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC getUnk3150EOGGPMLMLPC() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC result = emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC.valueOf(unk3150EOGGPMLMLPC_);
      return result == null ? emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC.UNRECOGNIZED : result;
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
      if (unk3150EOGGPMLMLPC_ != emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC.Unk3150_AFMOHGCKFNC_Unk3150_FBJILPONICB.getNumber()) {
        output.writeEnum(12, unk3150EOGGPMLMLPC_);
      }
      if (unk3150LEEGABHMLHA_ != 0) {
        output.writeUInt32(14, unk3150LEEGABHMLHA_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150EOGGPMLMLPC_ != emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC.Unk3150_AFMOHGCKFNC_Unk3150_FBJILPONICB.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, unk3150EOGGPMLMLPC_);
      }
      if (unk3150LEEGABHMLHA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3150LEEGABHMLHA_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA other = (emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA) obj;

      if (getUnk3150LEEGABHMLHA()
          != other.getUnk3150LEEGABHMLHA()) return false;
      if (unk3150EOGGPMLMLPC_ != other.unk3150EOGGPMLMLPC_) return false;
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
      hash = (37 * hash) + UNK3150_LEEGABHMLHA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150LEEGABHMLHA();
      hash = (37 * hash) + UNK3150_EOGGPMLMLPC_FIELD_NUMBER;
      hash = (53 * hash) + unk3150EOGGPMLMLPC_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA prototype) {
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
     * Protobuf type {@code Unk3150_MCADFHBEBEA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_MCADFHBEBEA)
        emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.internal_static_Unk3150_MCADFHBEBEA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.internal_static_Unk3150_MCADFHBEBEA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA.class, emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk3150LEEGABHMLHA_ = 0;

        unk3150EOGGPMLMLPC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.internal_static_Unk3150_MCADFHBEBEA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA build() {
        emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA buildPartial() {
        emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA result = new emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA(this);
        result.unk3150LEEGABHMLHA_ = unk3150LEEGABHMLHA_;
        result.unk3150EOGGPMLMLPC_ = unk3150EOGGPMLMLPC_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA other) {
        if (other == emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA.getDefaultInstance()) return this;
        if (other.getUnk3150LEEGABHMLHA() != 0) {
          setUnk3150LEEGABHMLHA(other.getUnk3150LEEGABHMLHA());
        }
        if (other.unk3150EOGGPMLMLPC_ != 0) {
          setUnk3150EOGGPMLMLPCValue(other.getUnk3150EOGGPMLMLPCValue());
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
              case 96: {
                unk3150EOGGPMLMLPC_ = input.readEnum();

                break;
              } // case 96
              case 112: {
                unk3150LEEGABHMLHA_ = input.readUInt32();

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

      private int unk3150LEEGABHMLHA_ ;
      /**
       * <code>uint32 Unk3150_LEEGABHMLHA = 14;</code>
       * @return The unk3150LEEGABHMLHA.
       */
      @java.lang.Override
      public int getUnk3150LEEGABHMLHA() {
        return unk3150LEEGABHMLHA_;
      }
      /**
       * <code>uint32 Unk3150_LEEGABHMLHA = 14;</code>
       * @param value The unk3150LEEGABHMLHA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150LEEGABHMLHA(int value) {
        
        unk3150LEEGABHMLHA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_LEEGABHMLHA = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150LEEGABHMLHA() {
        
        unk3150LEEGABHMLHA_ = 0;
        onChanged();
        return this;
      }

      private int unk3150EOGGPMLMLPC_ = 0;
      /**
       * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
       * @return The enum numeric value on the wire for unk3150EOGGPMLMLPC.
       */
      @java.lang.Override public int getUnk3150EOGGPMLMLPCValue() {
        return unk3150EOGGPMLMLPC_;
      }
      /**
       * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
       * @param value The enum numeric value on the wire for unk3150EOGGPMLMLPC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150EOGGPMLMLPCValue(int value) {
        
        unk3150EOGGPMLMLPC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
       * @return The unk3150EOGGPMLMLPC.
       */
      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC getUnk3150EOGGPMLMLPC() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC result = emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC.valueOf(unk3150EOGGPMLMLPC_);
        return result == null ? emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
       * @param value The unk3150EOGGPMLMLPC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150EOGGPMLMLPC(emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.Unk3150_AFMOHGCKFNC value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk3150EOGGPMLMLPC_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk3150_AFMOHGCKFNC Unk3150_EOGGPMLMLPC = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150EOGGPMLMLPC() {
        
        unk3150EOGGPMLMLPC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_MCADFHBEBEA)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_MCADFHBEBEA)
    private static final emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA();
    }

    public static emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_MCADFHBEBEA>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_MCADFHBEBEA>() {
      @java.lang.Override
      public Unk3150_MCADFHBEBEA parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk3150_MCADFHBEBEA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_MCADFHBEBEA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk3150MCADFHBEBEA.Unk3150_MCADFHBEBEA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_MCADFHBEBEA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_MCADFHBEBEA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_MCADFHBEBEA.proto\032\031Unk3150_AFM" +
      "OHGCKFNC.proto\"e\n\023Unk3150_MCADFHBEBEA\022\033\n" +
      "\023Unk3150_LEEGABHMLHA\030\016 \001(\r\0221\n\023Unk3150_EO" +
      "GGPMLMLPC\030\014 \001(\0162\024.Unk3150_AFMOHGCKFNCB\036\n" +
      "\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.getDescriptor(),
        });
    internal_static_Unk3150_MCADFHBEBEA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_MCADFHBEBEA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_MCADFHBEBEA_descriptor,
        new java.lang.String[] { "Unk3150LEEGABHMLHA", "Unk3150EOGGPMLMLPC", });
    emu.grasscutter.net.newproto.Unk3150AFMOHGCKFNC.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}