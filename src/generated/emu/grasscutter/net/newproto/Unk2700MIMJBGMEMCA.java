// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_MIMJBGMEMCA.proto

package emu.grasscutter.net.newproto;

public final class Unk2700MIMJBGMEMCA {
  private Unk2700MIMJBGMEMCA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_MIMJBGMEMCAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_MIMJBGMEMCA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_LINCFMHPMDP = 10;</code>
     * @return The unk2700LINCFMHPMDP.
     */
    int getUnk2700LINCFMHPMDP();

    /**
     * <code>uint32 Unk2700_FACFKJKIBBO = 7;</code>
     * @return The unk2700FACFKJKIBBO.
     */
    int getUnk2700FACFKJKIBBO();

    /**
     * <code>bool Unk2700_PEDCFBJLHGP = 12;</code>
     * @return The unk2700PEDCFBJLHGP.
     */
    boolean getUnk2700PEDCFBJLHGP();

    /**
     * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
     * @return The unk3250JGMHPGKOLEP.
     */
    boolean getUnk3250JGMHPGKOLEP();
  }
  /**
   * Protobuf type {@code Unk2700_MIMJBGMEMCA}
   */
  public static final class Unk2700_MIMJBGMEMCA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_MIMJBGMEMCA)
      Unk2700_MIMJBGMEMCAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_MIMJBGMEMCA.newBuilder() to construct.
    private Unk2700_MIMJBGMEMCA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_MIMJBGMEMCA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_MIMJBGMEMCA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.internal_static_Unk2700_MIMJBGMEMCA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.internal_static_Unk2700_MIMJBGMEMCA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.class, emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder.class);
    }

    public static final int UNK2700_LINCFMHPMDP_FIELD_NUMBER = 10;
    private int unk2700LINCFMHPMDP_;
    /**
     * <code>uint32 Unk2700_LINCFMHPMDP = 10;</code>
     * @return The unk2700LINCFMHPMDP.
     */
    @java.lang.Override
    public int getUnk2700LINCFMHPMDP() {
      return unk2700LINCFMHPMDP_;
    }

    public static final int UNK2700_FACFKJKIBBO_FIELD_NUMBER = 7;
    private int unk2700FACFKJKIBBO_;
    /**
     * <code>uint32 Unk2700_FACFKJKIBBO = 7;</code>
     * @return The unk2700FACFKJKIBBO.
     */
    @java.lang.Override
    public int getUnk2700FACFKJKIBBO() {
      return unk2700FACFKJKIBBO_;
    }

    public static final int UNK2700_PEDCFBJLHGP_FIELD_NUMBER = 12;
    private boolean unk2700PEDCFBJLHGP_;
    /**
     * <code>bool Unk2700_PEDCFBJLHGP = 12;</code>
     * @return The unk2700PEDCFBJLHGP.
     */
    @java.lang.Override
    public boolean getUnk2700PEDCFBJLHGP() {
      return unk2700PEDCFBJLHGP_;
    }

    public static final int UNK3250_JGMHPGKOLEP_FIELD_NUMBER = 6;
    private boolean unk3250JGMHPGKOLEP_;
    /**
     * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
     * @return The unk3250JGMHPGKOLEP.
     */
    @java.lang.Override
    public boolean getUnk3250JGMHPGKOLEP() {
      return unk3250JGMHPGKOLEP_;
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
      if (unk3250JGMHPGKOLEP_ != false) {
        output.writeBool(6, unk3250JGMHPGKOLEP_);
      }
      if (unk2700FACFKJKIBBO_ != 0) {
        output.writeUInt32(7, unk2700FACFKJKIBBO_);
      }
      if (unk2700LINCFMHPMDP_ != 0) {
        output.writeUInt32(10, unk2700LINCFMHPMDP_);
      }
      if (unk2700PEDCFBJLHGP_ != false) {
        output.writeBool(12, unk2700PEDCFBJLHGP_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250JGMHPGKOLEP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, unk3250JGMHPGKOLEP_);
      }
      if (unk2700FACFKJKIBBO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk2700FACFKJKIBBO_);
      }
      if (unk2700LINCFMHPMDP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk2700LINCFMHPMDP_);
      }
      if (unk2700PEDCFBJLHGP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, unk2700PEDCFBJLHGP_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA other = (emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA) obj;

      if (getUnk2700LINCFMHPMDP()
          != other.getUnk2700LINCFMHPMDP()) return false;
      if (getUnk2700FACFKJKIBBO()
          != other.getUnk2700FACFKJKIBBO()) return false;
      if (getUnk2700PEDCFBJLHGP()
          != other.getUnk2700PEDCFBJLHGP()) return false;
      if (getUnk3250JGMHPGKOLEP()
          != other.getUnk3250JGMHPGKOLEP()) return false;
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
      hash = (37 * hash) + UNK2700_LINCFMHPMDP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700LINCFMHPMDP();
      hash = (37 * hash) + UNK2700_FACFKJKIBBO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700FACFKJKIBBO();
      hash = (37 * hash) + UNK2700_PEDCFBJLHGP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700PEDCFBJLHGP());
      hash = (37 * hash) + UNK3250_JGMHPGKOLEP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250JGMHPGKOLEP());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA prototype) {
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
     * Protobuf type {@code Unk2700_MIMJBGMEMCA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_MIMJBGMEMCA)
        emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.internal_static_Unk2700_MIMJBGMEMCA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.internal_static_Unk2700_MIMJBGMEMCA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.class, emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        unk2700LINCFMHPMDP_ = 0;

        unk2700FACFKJKIBBO_ = 0;

        unk2700PEDCFBJLHGP_ = false;

        unk3250JGMHPGKOLEP_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.internal_static_Unk2700_MIMJBGMEMCA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA build() {
        emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA buildPartial() {
        emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA result = new emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA(this);
        result.unk2700LINCFMHPMDP_ = unk2700LINCFMHPMDP_;
        result.unk2700FACFKJKIBBO_ = unk2700FACFKJKIBBO_;
        result.unk2700PEDCFBJLHGP_ = unk2700PEDCFBJLHGP_;
        result.unk3250JGMHPGKOLEP_ = unk3250JGMHPGKOLEP_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA other) {
        if (other == emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA.getDefaultInstance()) return this;
        if (other.getUnk2700LINCFMHPMDP() != 0) {
          setUnk2700LINCFMHPMDP(other.getUnk2700LINCFMHPMDP());
        }
        if (other.getUnk2700FACFKJKIBBO() != 0) {
          setUnk2700FACFKJKIBBO(other.getUnk2700FACFKJKIBBO());
        }
        if (other.getUnk2700PEDCFBJLHGP() != false) {
          setUnk2700PEDCFBJLHGP(other.getUnk2700PEDCFBJLHGP());
        }
        if (other.getUnk3250JGMHPGKOLEP() != false) {
          setUnk3250JGMHPGKOLEP(other.getUnk3250JGMHPGKOLEP());
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
              case 48: {
                unk3250JGMHPGKOLEP_ = input.readBool();

                break;
              } // case 48
              case 56: {
                unk2700FACFKJKIBBO_ = input.readUInt32();

                break;
              } // case 56
              case 80: {
                unk2700LINCFMHPMDP_ = input.readUInt32();

                break;
              } // case 80
              case 96: {
                unk2700PEDCFBJLHGP_ = input.readBool();

                break;
              } // case 96
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

      private int unk2700LINCFMHPMDP_ ;
      /**
       * <code>uint32 Unk2700_LINCFMHPMDP = 10;</code>
       * @return The unk2700LINCFMHPMDP.
       */
      @java.lang.Override
      public int getUnk2700LINCFMHPMDP() {
        return unk2700LINCFMHPMDP_;
      }
      /**
       * <code>uint32 Unk2700_LINCFMHPMDP = 10;</code>
       * @param value The unk2700LINCFMHPMDP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700LINCFMHPMDP(int value) {
        
        unk2700LINCFMHPMDP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_LINCFMHPMDP = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700LINCFMHPMDP() {
        
        unk2700LINCFMHPMDP_ = 0;
        onChanged();
        return this;
      }

      private int unk2700FACFKJKIBBO_ ;
      /**
       * <code>uint32 Unk2700_FACFKJKIBBO = 7;</code>
       * @return The unk2700FACFKJKIBBO.
       */
      @java.lang.Override
      public int getUnk2700FACFKJKIBBO() {
        return unk2700FACFKJKIBBO_;
      }
      /**
       * <code>uint32 Unk2700_FACFKJKIBBO = 7;</code>
       * @param value The unk2700FACFKJKIBBO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700FACFKJKIBBO(int value) {
        
        unk2700FACFKJKIBBO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_FACFKJKIBBO = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700FACFKJKIBBO() {
        
        unk2700FACFKJKIBBO_ = 0;
        onChanged();
        return this;
      }

      private boolean unk2700PEDCFBJLHGP_ ;
      /**
       * <code>bool Unk2700_PEDCFBJLHGP = 12;</code>
       * @return The unk2700PEDCFBJLHGP.
       */
      @java.lang.Override
      public boolean getUnk2700PEDCFBJLHGP() {
        return unk2700PEDCFBJLHGP_;
      }
      /**
       * <code>bool Unk2700_PEDCFBJLHGP = 12;</code>
       * @param value The unk2700PEDCFBJLHGP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700PEDCFBJLHGP(boolean value) {
        
        unk2700PEDCFBJLHGP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_PEDCFBJLHGP = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700PEDCFBJLHGP() {
        
        unk2700PEDCFBJLHGP_ = false;
        onChanged();
        return this;
      }

      private boolean unk3250JGMHPGKOLEP_ ;
      /**
       * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
       * @return The unk3250JGMHPGKOLEP.
       */
      @java.lang.Override
      public boolean getUnk3250JGMHPGKOLEP() {
        return unk3250JGMHPGKOLEP_;
      }
      /**
       * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
       * @param value The unk3250JGMHPGKOLEP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250JGMHPGKOLEP(boolean value) {
        
        unk3250JGMHPGKOLEP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_JGMHPGKOLEP = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250JGMHPGKOLEP() {
        
        unk3250JGMHPGKOLEP_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_MIMJBGMEMCA)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_MIMJBGMEMCA)
    private static final emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA();
    }

    public static emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_MIMJBGMEMCA>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_MIMJBGMEMCA>() {
      @java.lang.Override
      public Unk2700_MIMJBGMEMCA parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_MIMJBGMEMCA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_MIMJBGMEMCA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700MIMJBGMEMCA.Unk2700_MIMJBGMEMCA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_MIMJBGMEMCA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_MIMJBGMEMCA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_MIMJBGMEMCA.proto\"\211\001\n\023Unk2700_" +
      "MIMJBGMEMCA\022\033\n\023Unk2700_LINCFMHPMDP\030\n \001(\r" +
      "\022\033\n\023Unk2700_FACFKJKIBBO\030\007 \001(\r\022\033\n\023Unk2700" +
      "_PEDCFBJLHGP\030\014 \001(\010\022\033\n\023Unk3250_JGMHPGKOLE" +
      "P\030\006 \001(\010B\036\n\034emu.grasscutter.net.newprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_MIMJBGMEMCA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_MIMJBGMEMCA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_MIMJBGMEMCA_descriptor,
        new java.lang.String[] { "Unk2700LINCFMHPMDP", "Unk2700FACFKJKIBBO", "Unk2700PEDCFBJLHGP", "Unk3250JGMHPGKOLEP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
