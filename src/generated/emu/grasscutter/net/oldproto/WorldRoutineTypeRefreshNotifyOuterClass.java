// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldRoutineTypeRefreshNotify.proto

package emu.grasscutter.net.oldproto;

public final class WorldRoutineTypeRefreshNotifyOuterClass {
  private WorldRoutineTypeRefreshNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldRoutineTypeRefreshNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldRoutineTypeRefreshNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
     * @return Whether the worldRoutineType field is set.
     */
    boolean hasWorldRoutineType();
    /**
     * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
     * @return The worldRoutineType.
     */
    emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo getWorldRoutineType();
    /**
     * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
     */
    emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfoOrBuilder getWorldRoutineTypeOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 3525
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code WorldRoutineTypeRefreshNotify}
   */
  public static final class WorldRoutineTypeRefreshNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldRoutineTypeRefreshNotify)
      WorldRoutineTypeRefreshNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldRoutineTypeRefreshNotify.newBuilder() to construct.
    private WorldRoutineTypeRefreshNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldRoutineTypeRefreshNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldRoutineTypeRefreshNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.internal_static_WorldRoutineTypeRefreshNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.internal_static_WorldRoutineTypeRefreshNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify.class, emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify.Builder.class);
    }

    public static final int WORLD_ROUTINE_TYPE_FIELD_NUMBER = 7;
    private emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo worldRoutineType_;
    /**
     * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
     * @return Whether the worldRoutineType field is set.
     */
    @java.lang.Override
    public boolean hasWorldRoutineType() {
      return worldRoutineType_ != null;
    }
    /**
     * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
     * @return The worldRoutineType.
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo getWorldRoutineType() {
      return worldRoutineType_ == null ? emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.getDefaultInstance() : worldRoutineType_;
    }
    /**
     * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfoOrBuilder getWorldRoutineTypeOrBuilder() {
      return getWorldRoutineType();
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
      if (worldRoutineType_ != null) {
        output.writeMessage(7, getWorldRoutineType());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (worldRoutineType_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getWorldRoutineType());
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify other = (emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify) obj;

      if (hasWorldRoutineType() != other.hasWorldRoutineType()) return false;
      if (hasWorldRoutineType()) {
        if (!getWorldRoutineType()
            .equals(other.getWorldRoutineType())) return false;
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
      if (hasWorldRoutineType()) {
        hash = (37 * hash) + WORLD_ROUTINE_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getWorldRoutineType().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify prototype) {
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
     * CmdId: 3525
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code WorldRoutineTypeRefreshNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldRoutineTypeRefreshNotify)
        emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.internal_static_WorldRoutineTypeRefreshNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.internal_static_WorldRoutineTypeRefreshNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify.class, emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (worldRoutineTypeBuilder_ == null) {
          worldRoutineType_ = null;
        } else {
          worldRoutineType_ = null;
          worldRoutineTypeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.internal_static_WorldRoutineTypeRefreshNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify build() {
        emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify buildPartial() {
        emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify result = new emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify(this);
        if (worldRoutineTypeBuilder_ == null) {
          result.worldRoutineType_ = worldRoutineType_;
        } else {
          result.worldRoutineType_ = worldRoutineTypeBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify other) {
        if (other == emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify.getDefaultInstance()) return this;
        if (other.hasWorldRoutineType()) {
          mergeWorldRoutineType(other.getWorldRoutineType());
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
              case 58: {
                input.readMessage(
                    getWorldRoutineTypeFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 58
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

      private emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo worldRoutineType_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo, emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.Builder, emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfoOrBuilder> worldRoutineTypeBuilder_;
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       * @return Whether the worldRoutineType field is set.
       */
      public boolean hasWorldRoutineType() {
        return worldRoutineTypeBuilder_ != null || worldRoutineType_ != null;
      }
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       * @return The worldRoutineType.
       */
      public emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo getWorldRoutineType() {
        if (worldRoutineTypeBuilder_ == null) {
          return worldRoutineType_ == null ? emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.getDefaultInstance() : worldRoutineType_;
        } else {
          return worldRoutineTypeBuilder_.getMessage();
        }
      }
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       */
      public Builder setWorldRoutineType(emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo value) {
        if (worldRoutineTypeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          worldRoutineType_ = value;
          onChanged();
        } else {
          worldRoutineTypeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       */
      public Builder setWorldRoutineType(
          emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.Builder builderForValue) {
        if (worldRoutineTypeBuilder_ == null) {
          worldRoutineType_ = builderForValue.build();
          onChanged();
        } else {
          worldRoutineTypeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       */
      public Builder mergeWorldRoutineType(emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo value) {
        if (worldRoutineTypeBuilder_ == null) {
          if (worldRoutineType_ != null) {
            worldRoutineType_ =
              emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.newBuilder(worldRoutineType_).mergeFrom(value).buildPartial();
          } else {
            worldRoutineType_ = value;
          }
          onChanged();
        } else {
          worldRoutineTypeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       */
      public Builder clearWorldRoutineType() {
        if (worldRoutineTypeBuilder_ == null) {
          worldRoutineType_ = null;
          onChanged();
        } else {
          worldRoutineType_ = null;
          worldRoutineTypeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       */
      public emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.Builder getWorldRoutineTypeBuilder() {
        
        onChanged();
        return getWorldRoutineTypeFieldBuilder().getBuilder();
      }
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       */
      public emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfoOrBuilder getWorldRoutineTypeOrBuilder() {
        if (worldRoutineTypeBuilder_ != null) {
          return worldRoutineTypeBuilder_.getMessageOrBuilder();
        } else {
          return worldRoutineType_ == null ?
              emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.getDefaultInstance() : worldRoutineType_;
        }
      }
      /**
       * <code>.WorldRoutineTypeInfo world_routine_type = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo, emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.Builder, emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfoOrBuilder> 
          getWorldRoutineTypeFieldBuilder() {
        if (worldRoutineTypeBuilder_ == null) {
          worldRoutineTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo, emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfo.Builder, emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.WorldRoutineTypeInfoOrBuilder>(
                  getWorldRoutineType(),
                  getParentForChildren(),
                  isClean());
          worldRoutineType_ = null;
        }
        return worldRoutineTypeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WorldRoutineTypeRefreshNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldRoutineTypeRefreshNotify)
    private static final emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify();
    }

    public static emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldRoutineTypeRefreshNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldRoutineTypeRefreshNotify>() {
      @java.lang.Override
      public WorldRoutineTypeRefreshNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WorldRoutineTypeRefreshNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldRoutineTypeRefreshNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.WorldRoutineTypeRefreshNotifyOuterClass.WorldRoutineTypeRefreshNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldRoutineTypeRefreshNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldRoutineTypeRefreshNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#WorldRoutineTypeRefreshNotify.proto\032\032W" +
      "orldRoutineTypeInfo.proto\"R\n\035WorldRoutin" +
      "eTypeRefreshNotify\0221\n\022world_routine_type" +
      "\030\007 \001(\0132\025.WorldRoutineTypeInfoB\036\n\034emu.gra" +
      "sscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.getDescriptor(),
        });
    internal_static_WorldRoutineTypeRefreshNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldRoutineTypeRefreshNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldRoutineTypeRefreshNotify_descriptor,
        new java.lang.String[] { "WorldRoutineType", });
    emu.grasscutter.net.oldproto.WorldRoutineTypeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}