// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGReplayOperationData.proto

package emu.grasscutter.net.newproto;

public final class GCGReplayOperationDataOuterClass {
  private GCGReplayOperationDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGReplayOperationDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGReplayOperationData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGOperation op = 1;</code>
     * @return Whether the op field is set.
     */
    boolean hasOp();
    /**
     * <code>.GCGOperation op = 1;</code>
     * @return The op.
     */
    emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation getOp();
    /**
     * <code>.GCGOperation op = 1;</code>
     */
    emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperationOrBuilder getOpOrBuilder();

    /**
     * <code>uint32 controller_id = 8;</code>
     * @return The controllerId.
     */
    int getControllerId();
  }
  /**
   * Protobuf type {@code GCGReplayOperationData}
   */
  public static final class GCGReplayOperationData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGReplayOperationData)
      GCGReplayOperationDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGReplayOperationData.newBuilder() to construct.
    private GCGReplayOperationData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGReplayOperationData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGReplayOperationData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.internal_static_GCGReplayOperationData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.internal_static_GCGReplayOperationData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData.class, emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData.Builder.class);
    }

    public static final int OP_FIELD_NUMBER = 1;
    private emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation op_;
    /**
     * <code>.GCGOperation op = 1;</code>
     * @return Whether the op field is set.
     */
    @java.lang.Override
    public boolean hasOp() {
      return op_ != null;
    }
    /**
     * <code>.GCGOperation op = 1;</code>
     * @return The op.
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation getOp() {
      return op_ == null ? emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.getDefaultInstance() : op_;
    }
    /**
     * <code>.GCGOperation op = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperationOrBuilder getOpOrBuilder() {
      return getOp();
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 8;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 8;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
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
      if (op_ != null) {
        output.writeMessage(1, getOp());
      }
      if (controllerId_ != 0) {
        output.writeUInt32(8, controllerId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (op_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getOp());
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, controllerId_);
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
      if (!(obj instanceof emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData other = (emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData) obj;

      if (hasOp() != other.hasOp()) return false;
      if (hasOp()) {
        if (!getOp()
            .equals(other.getOp())) return false;
      }
      if (getControllerId()
          != other.getControllerId()) return false;
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
      if (hasOp()) {
        hash = (37 * hash) + OP_FIELD_NUMBER;
        hash = (53 * hash) + getOp().hashCode();
      }
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData prototype) {
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
     * Protobuf type {@code GCGReplayOperationData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGReplayOperationData)
        emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.internal_static_GCGReplayOperationData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.internal_static_GCGReplayOperationData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData.class, emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData.Builder.class);
      }

      // Construct using emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (opBuilder_ == null) {
          op_ = null;
        } else {
          op_ = null;
          opBuilder_ = null;
        }
        controllerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.internal_static_GCGReplayOperationData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData getDefaultInstanceForType() {
        return emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData build() {
        emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData buildPartial() {
        emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData result = new emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData(this);
        if (opBuilder_ == null) {
          result.op_ = op_;
        } else {
          result.op_ = opBuilder_.build();
        }
        result.controllerId_ = controllerId_;
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
        if (other instanceof emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData) {
          return mergeFrom((emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData other) {
        if (other == emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData.getDefaultInstance()) return this;
        if (other.hasOp()) {
          mergeOp(other.getOp());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
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
              case 10: {
                input.readMessage(
                    getOpFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 64: {
                controllerId_ = input.readUInt32();

                break;
              } // case 64
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

      private emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation op_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation, emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.Builder, emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperationOrBuilder> opBuilder_;
      /**
       * <code>.GCGOperation op = 1;</code>
       * @return Whether the op field is set.
       */
      public boolean hasOp() {
        return opBuilder_ != null || op_ != null;
      }
      /**
       * <code>.GCGOperation op = 1;</code>
       * @return The op.
       */
      public emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation getOp() {
        if (opBuilder_ == null) {
          return op_ == null ? emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.getDefaultInstance() : op_;
        } else {
          return opBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGOperation op = 1;</code>
       */
      public Builder setOp(emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation value) {
        if (opBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          op_ = value;
          onChanged();
        } else {
          opBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGOperation op = 1;</code>
       */
      public Builder setOp(
          emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.Builder builderForValue) {
        if (opBuilder_ == null) {
          op_ = builderForValue.build();
          onChanged();
        } else {
          opBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGOperation op = 1;</code>
       */
      public Builder mergeOp(emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation value) {
        if (opBuilder_ == null) {
          if (op_ != null) {
            op_ =
              emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.newBuilder(op_).mergeFrom(value).buildPartial();
          } else {
            op_ = value;
          }
          onChanged();
        } else {
          opBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGOperation op = 1;</code>
       */
      public Builder clearOp() {
        if (opBuilder_ == null) {
          op_ = null;
          onChanged();
        } else {
          op_ = null;
          opBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGOperation op = 1;</code>
       */
      public emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.Builder getOpBuilder() {
        
        onChanged();
        return getOpFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGOperation op = 1;</code>
       */
      public emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperationOrBuilder getOpOrBuilder() {
        if (opBuilder_ != null) {
          return opBuilder_.getMessageOrBuilder();
        } else {
          return op_ == null ?
              emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.getDefaultInstance() : op_;
        }
      }
      /**
       * <code>.GCGOperation op = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation, emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.Builder, emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperationOrBuilder> 
          getOpFieldBuilder() {
        if (opBuilder_ == null) {
          opBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation, emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperation.Builder, emu.grasscutter.net.newproto.GCGOperationOuterClass.GCGOperationOrBuilder>(
                  getOp(),
                  getParentForChildren(),
                  isClean());
          op_ = null;
        }
        return opBuilder_;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 8;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 8;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGReplayOperationData)
    }

    // @@protoc_insertion_point(class_scope:GCGReplayOperationData)
    private static final emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData();
    }

    public static emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGReplayOperationData>
        PARSER = new com.google.protobuf.AbstractParser<GCGReplayOperationData>() {
      @java.lang.Override
      public GCGReplayOperationData parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGReplayOperationData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGReplayOperationData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.newproto.GCGReplayOperationDataOuterClass.GCGReplayOperationData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGReplayOperationData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGReplayOperationData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GCGReplayOperationData.proto\032\022GCGOpera" +
      "tion.proto\"J\n\026GCGReplayOperationData\022\031\n\002" +
      "op\030\001 \001(\0132\r.GCGOperation\022\025\n\rcontroller_id" +
      "\030\010 \001(\rB\036\n\034emu.grasscutter.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.newproto.GCGOperationOuterClass.getDescriptor(),
        });
    internal_static_GCGReplayOperationData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGReplayOperationData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGReplayOperationData_descriptor,
        new java.lang.String[] { "Op", "ControllerId", });
    emu.grasscutter.net.newproto.GCGOperationOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
