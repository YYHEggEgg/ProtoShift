// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_NKIDCOKNPFF.proto

package emu.grasscutter.net.newproto;

public final class Unk2700NKIDCOKNPFF {
  private Unk2700NKIDCOKNPFF() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_NKIDCOKNPFFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_NKIDCOKNPFF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 building_points = 4;</code>
     * @return The buildingPoints.
     */
    int getBuildingPoints();

    /**
     * <code>uint32 Unk2700_CDOKENJJJMH = 12;</code>
     * @return The unk2700CDOKENJJJMH.
     */
    int getUnk2700CDOKENJJJMH();

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * Protobuf type {@code Unk2700_NKIDCOKNPFF}
   */
  public static final class Unk2700_NKIDCOKNPFF extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_NKIDCOKNPFF)
      Unk2700_NKIDCOKNPFFOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_NKIDCOKNPFF.newBuilder() to construct.
    private Unk2700_NKIDCOKNPFF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_NKIDCOKNPFF() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_NKIDCOKNPFF();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.internal_static_Unk2700_NKIDCOKNPFF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.internal_static_Unk2700_NKIDCOKNPFF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF.class, emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF.Builder.class);
    }

    public static final int BUILDING_POINTS_FIELD_NUMBER = 4;
    private int buildingPoints_;
    /**
     * <code>uint32 building_points = 4;</code>
     * @return The buildingPoints.
     */
    @java.lang.Override
    public int getBuildingPoints() {
      return buildingPoints_;
    }

    public static final int UNK2700_CDOKENJJJMH_FIELD_NUMBER = 12;
    private int unk2700CDOKENJJJMH_;
    /**
     * <code>uint32 Unk2700_CDOKENJJJMH = 12;</code>
     * @return The unk2700CDOKENJJJMH.
     */
    @java.lang.Override
    public int getUnk2700CDOKENJJJMH() {
      return unk2700CDOKENJJJMH_;
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (buildingPoints_ != 0) {
        output.writeUInt32(4, buildingPoints_);
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
      }
      if (unk2700CDOKENJJJMH_ != 0) {
        output.writeUInt32(12, unk2700CDOKENJJJMH_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (buildingPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, buildingPoints_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
      }
      if (unk2700CDOKENJJJMH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk2700CDOKENJJJMH_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF other = (emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF) obj;

      if (getBuildingPoints()
          != other.getBuildingPoints()) return false;
      if (getUnk2700CDOKENJJJMH()
          != other.getUnk2700CDOKENJJJMH()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + BUILDING_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getBuildingPoints();
      hash = (37 * hash) + UNK2700_CDOKENJJJMH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700CDOKENJJJMH();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF prototype) {
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
     * Protobuf type {@code Unk2700_NKIDCOKNPFF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_NKIDCOKNPFF)
        emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.internal_static_Unk2700_NKIDCOKNPFF_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.internal_static_Unk2700_NKIDCOKNPFF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF.class, emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        buildingPoints_ = 0;

        unk2700CDOKENJJJMH_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.internal_static_Unk2700_NKIDCOKNPFF_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF build() {
        emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF buildPartial() {
        emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF result = new emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF(this);
        result.buildingPoints_ = buildingPoints_;
        result.unk2700CDOKENJJJMH_ = unk2700CDOKENJJJMH_;
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF) {
          return mergeFrom((emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF other) {
        if (other == emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF.getDefaultInstance()) return this;
        if (other.getBuildingPoints() != 0) {
          setBuildingPoints(other.getBuildingPoints());
        }
        if (other.getUnk2700CDOKENJJJMH() != 0) {
          setUnk2700CDOKENJJJMH(other.getUnk2700CDOKENJJJMH());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
              case 32: {
                buildingPoints_ = input.readUInt32();

                break;
              } // case 32
              case 80: {
                uid_ = input.readUInt32();

                break;
              } // case 80
              case 96: {
                unk2700CDOKENJJJMH_ = input.readUInt32();

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

      private int buildingPoints_ ;
      /**
       * <code>uint32 building_points = 4;</code>
       * @return The buildingPoints.
       */
      @java.lang.Override
      public int getBuildingPoints() {
        return buildingPoints_;
      }
      /**
       * <code>uint32 building_points = 4;</code>
       * @param value The buildingPoints to set.
       * @return This builder for chaining.
       */
      public Builder setBuildingPoints(int value) {
        
        buildingPoints_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 building_points = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuildingPoints() {
        
        buildingPoints_ = 0;
        onChanged();
        return this;
      }

      private int unk2700CDOKENJJJMH_ ;
      /**
       * <code>uint32 Unk2700_CDOKENJJJMH = 12;</code>
       * @return The unk2700CDOKENJJJMH.
       */
      @java.lang.Override
      public int getUnk2700CDOKENJJJMH() {
        return unk2700CDOKENJJJMH_;
      }
      /**
       * <code>uint32 Unk2700_CDOKENJJJMH = 12;</code>
       * @param value The unk2700CDOKENJJJMH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700CDOKENJJJMH(int value) {
        
        unk2700CDOKENJJJMH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_CDOKENJJJMH = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700CDOKENJJJMH() {
        
        unk2700CDOKENJJJMH_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_NKIDCOKNPFF)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_NKIDCOKNPFF)
    private static final emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF();
    }

    public static emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_NKIDCOKNPFF>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_NKIDCOKNPFF>() {
      @java.lang.Override
      public Unk2700_NKIDCOKNPFF parsePartialFrom(
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

    public static com.google.protobuf.Parser<Unk2700_NKIDCOKNPFF> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_NKIDCOKNPFF> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.Unk2700NKIDCOKNPFF.Unk2700_NKIDCOKNPFF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_NKIDCOKNPFF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_NKIDCOKNPFF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_NKIDCOKNPFF.proto\"X\n\023Unk2700_N" +
      "KIDCOKNPFF\022\027\n\017building_points\030\004 \001(\r\022\033\n\023U" +
      "nk2700_CDOKENJJJMH\030\014 \001(\r\022\013\n\003uid\030\n \001(\rB\036\n" +
      "\034emu.grasscutter.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_NKIDCOKNPFF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_NKIDCOKNPFF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_NKIDCOKNPFF_descriptor,
        new java.lang.String[] { "BuildingPoints", "Unk2700CDOKENJJJMH", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}