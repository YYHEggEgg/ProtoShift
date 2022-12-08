// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegionSearchChangeRegionNotify.proto

package emu.grasscutter.net.oldproto;

public final class RegionSearchChangeRegionNotifyOuterClass {
  private RegionSearchChangeRegionNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RegionSearchChangeRegionNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RegionSearchChangeRegionNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
     * @return The enum numeric value on the wire for event.
     */
    int getEventValue();
    /**
     * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
     * @return The event.
     */
    emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent getEvent();

    /**
     * <code>uint32 region_id = 10;</code>
     * @return The regionId.
     */
    int getRegionId();
  }
  /**
   * <pre>
   * CmdId: 5618
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code RegionSearchChangeRegionNotify}
   */
  public static final class RegionSearchChangeRegionNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RegionSearchChangeRegionNotify)
      RegionSearchChangeRegionNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RegionSearchChangeRegionNotify.newBuilder() to construct.
    private RegionSearchChangeRegionNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RegionSearchChangeRegionNotify() {
      event_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RegionSearchChangeRegionNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.internal_static_RegionSearchChangeRegionNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.internal_static_RegionSearchChangeRegionNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.class, emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code RegionSearchChangeRegionNotify.RegionEvent}
     */
    public enum RegionEvent
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>REGION_EVENT_NONE = 0;</code>
       */
      REGION_EVENT_NONE(0),
      /**
       * <code>REGION_EVENT_ENTER = 1;</code>
       */
      REGION_EVENT_ENTER(1),
      /**
       * <code>REGION_EVENT_LEAVE = 2;</code>
       */
      REGION_EVENT_LEAVE(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>REGION_EVENT_NONE = 0;</code>
       */
      public static final int REGION_EVENT_NONE_VALUE = 0;
      /**
       * <code>REGION_EVENT_ENTER = 1;</code>
       */
      public static final int REGION_EVENT_ENTER_VALUE = 1;
      /**
       * <code>REGION_EVENT_LEAVE = 2;</code>
       */
      public static final int REGION_EVENT_LEAVE_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RegionEvent valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static RegionEvent forNumber(int value) {
        switch (value) {
          case 0: return REGION_EVENT_NONE;
          case 1: return REGION_EVENT_ENTER;
          case 2: return REGION_EVENT_LEAVE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RegionEvent>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          RegionEvent> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RegionEvent>() {
              public RegionEvent findValueByNumber(int number) {
                return RegionEvent.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final RegionEvent[] VALUES = values();

      public static RegionEvent valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private RegionEvent(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:RegionSearchChangeRegionNotify.RegionEvent)
    }

    public static final int EVENT_FIELD_NUMBER = 1;
    private int event_;
    /**
     * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
     * @return The enum numeric value on the wire for event.
     */
    @java.lang.Override public int getEventValue() {
      return event_;
    }
    /**
     * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
     * @return The event.
     */
    @java.lang.Override public emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent getEvent() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent result = emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent.valueOf(event_);
      return result == null ? emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent.UNRECOGNIZED : result;
    }

    public static final int REGION_ID_FIELD_NUMBER = 10;
    private int regionId_;
    /**
     * <code>uint32 region_id = 10;</code>
     * @return The regionId.
     */
    @java.lang.Override
    public int getRegionId() {
      return regionId_;
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
      if (event_ != emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent.REGION_EVENT_NONE.getNumber()) {
        output.writeEnum(1, event_);
      }
      if (regionId_ != 0) {
        output.writeUInt32(10, regionId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (event_ != emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent.REGION_EVENT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, event_);
      }
      if (regionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, regionId_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify other = (emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify) obj;

      if (event_ != other.event_) return false;
      if (getRegionId()
          != other.getRegionId()) return false;
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
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + event_;
      hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRegionId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify prototype) {
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
     * CmdId: 5618
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code RegionSearchChangeRegionNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RegionSearchChangeRegionNotify)
        emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.internal_static_RegionSearchChangeRegionNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.internal_static_RegionSearchChangeRegionNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.class, emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        event_ = 0;

        regionId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.internal_static_RegionSearchChangeRegionNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify build() {
        emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify buildPartial() {
        emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify result = new emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify(this);
        result.event_ = event_;
        result.regionId_ = regionId_;
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
        if (other instanceof emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify) {
          return mergeFrom((emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify other) {
        if (other == emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.getDefaultInstance()) return this;
        if (other.event_ != 0) {
          setEventValue(other.getEventValue());
        }
        if (other.getRegionId() != 0) {
          setRegionId(other.getRegionId());
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
                event_ = input.readEnum();

                break;
              } // case 8
              case 80: {
                regionId_ = input.readUInt32();

                break;
              } // case 80
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

      private int event_ = 0;
      /**
       * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
       * @return The enum numeric value on the wire for event.
       */
      @java.lang.Override public int getEventValue() {
        return event_;
      }
      /**
       * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
       * @param value The enum numeric value on the wire for event to set.
       * @return This builder for chaining.
       */
      public Builder setEventValue(int value) {
        
        event_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
       * @return The event.
       */
      @java.lang.Override
      public emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent getEvent() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent result = emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent.valueOf(event_);
        return result == null ? emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent.UNRECOGNIZED : result;
      }
      /**
       * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
       * @param value The event to set.
       * @return This builder for chaining.
       */
      public Builder setEvent(emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify.RegionEvent value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        event_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RegionSearchChangeRegionNotify.RegionEvent event = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEvent() {
        
        event_ = 0;
        onChanged();
        return this;
      }

      private int regionId_ ;
      /**
       * <code>uint32 region_id = 10;</code>
       * @return The regionId.
       */
      @java.lang.Override
      public int getRegionId() {
        return regionId_;
      }
      /**
       * <code>uint32 region_id = 10;</code>
       * @param value The regionId to set.
       * @return This builder for chaining.
       */
      public Builder setRegionId(int value) {
        
        regionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 region_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRegionId() {
        
        regionId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RegionSearchChangeRegionNotify)
    }

    // @@protoc_insertion_point(class_scope:RegionSearchChangeRegionNotify)
    private static final emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify();
    }

    public static emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegionSearchChangeRegionNotify>
        PARSER = new com.google.protobuf.AbstractParser<RegionSearchChangeRegionNotify>() {
      @java.lang.Override
      public RegionSearchChangeRegionNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RegionSearchChangeRegionNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegionSearchChangeRegionNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.RegionSearchChangeRegionNotifyOuterClass.RegionSearchChangeRegionNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegionSearchChangeRegionNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegionSearchChangeRegionNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$RegionSearchChangeRegionNotify.proto\"\305" +
      "\001\n\036RegionSearchChangeRegionNotify\022:\n\005eve" +
      "nt\030\001 \001(\0162+.RegionSearchChangeRegionNotif" +
      "y.RegionEvent\022\021\n\tregion_id\030\n \001(\r\"T\n\013Regi" +
      "onEvent\022\025\n\021REGION_EVENT_NONE\020\000\022\026\n\022REGION" +
      "_EVENT_ENTER\020\001\022\026\n\022REGION_EVENT_LEAVE\020\002B\036" +
      "\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RegionSearchChangeRegionNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegionSearchChangeRegionNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegionSearchChangeRegionNotify_descriptor,
        new java.lang.String[] { "Event", "RegionId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}