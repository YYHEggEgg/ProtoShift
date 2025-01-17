// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeDungeonResultInfo.proto

package emu.grasscutter.net.oldproto;

public final class EffigyChallengeDungeonResultInfoOuterClass {
  private EffigyChallengeDungeonResultInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EffigyChallengeDungeonResultInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EffigyChallengeDungeonResultInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_score = 7;</code>
     * @return The challengeScore.
     */
    int getChallengeScore();

    /**
     * <code>bool is_in_time_limit = 8;</code>
     * @return The isInTimeLimit.
     */
    boolean getIsInTimeLimit();

    /**
     * <code>uint32 challenge_id = 6;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>bool is_success = 15;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 challenge_max_score = 13;</code>
     * @return The challengeMaxScore.
     */
    int getChallengeMaxScore();
  }
  /**
   * Protobuf type {@code EffigyChallengeDungeonResultInfo}
   */
  public static final class EffigyChallengeDungeonResultInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EffigyChallengeDungeonResultInfo)
      EffigyChallengeDungeonResultInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EffigyChallengeDungeonResultInfo.newBuilder() to construct.
    private EffigyChallengeDungeonResultInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EffigyChallengeDungeonResultInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EffigyChallengeDungeonResultInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.class, emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder.class);
    }

    public static final int CHALLENGE_SCORE_FIELD_NUMBER = 7;
    private int challengeScore_;
    /**
     * <code>uint32 challenge_score = 7;</code>
     * @return The challengeScore.
     */
    @java.lang.Override
    public int getChallengeScore() {
      return challengeScore_;
    }

    public static final int IS_IN_TIME_LIMIT_FIELD_NUMBER = 8;
    private boolean isInTimeLimit_;
    /**
     * <code>bool is_in_time_limit = 8;</code>
     * @return The isInTimeLimit.
     */
    @java.lang.Override
    public boolean getIsInTimeLimit() {
      return isInTimeLimit_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 6;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 6;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 15;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 15;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 13;
    private int challengeMaxScore_;
    /**
     * <code>uint32 challenge_max_score = 13;</code>
     * @return The challengeMaxScore.
     */
    @java.lang.Override
    public int getChallengeMaxScore() {
      return challengeMaxScore_;
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
      if (challengeId_ != 0) {
        output.writeUInt32(6, challengeId_);
      }
      if (challengeScore_ != 0) {
        output.writeUInt32(7, challengeScore_);
      }
      if (isInTimeLimit_ != false) {
        output.writeBool(8, isInTimeLimit_);
      }
      if (challengeMaxScore_ != 0) {
        output.writeUInt32(13, challengeMaxScore_);
      }
      if (isSuccess_ != false) {
        output.writeBool(15, isSuccess_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, challengeId_);
      }
      if (challengeScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, challengeScore_);
      }
      if (isInTimeLimit_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isInTimeLimit_);
      }
      if (challengeMaxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, challengeMaxScore_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isSuccess_);
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
      if (!(obj instanceof emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo other = (emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo) obj;

      if (getChallengeScore()
          != other.getChallengeScore()) return false;
      if (getIsInTimeLimit()
          != other.getIsInTimeLimit()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getChallengeMaxScore()
          != other.getChallengeMaxScore()) return false;
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
      hash = (37 * hash) + CHALLENGE_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeScore();
      hash = (37 * hash) + IS_IN_TIME_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInTimeLimit());
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + CHALLENGE_MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeMaxScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo prototype) {
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
     * Protobuf type {@code EffigyChallengeDungeonResultInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EffigyChallengeDungeonResultInfo)
        emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.class, emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        challengeScore_ = 0;

        isInTimeLimit_ = false;

        challengeId_ = 0;

        isSuccess_ = false;

        challengeMaxScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.internal_static_EffigyChallengeDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo build() {
        emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo buildPartial() {
        emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo result = new emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo(this);
        result.challengeScore_ = challengeScore_;
        result.isInTimeLimit_ = isInTimeLimit_;
        result.challengeId_ = challengeId_;
        result.isSuccess_ = isSuccess_;
        result.challengeMaxScore_ = challengeMaxScore_;
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
        if (other instanceof emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo) {
          return mergeFrom((emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo other) {
        if (other == emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance()) return this;
        if (other.getChallengeScore() != 0) {
          setChallengeScore(other.getChallengeScore());
        }
        if (other.getIsInTimeLimit() != false) {
          setIsInTimeLimit(other.getIsInTimeLimit());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getChallengeMaxScore() != 0) {
          setChallengeMaxScore(other.getChallengeMaxScore());
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
                challengeId_ = input.readUInt32();

                break;
              } // case 48
              case 56: {
                challengeScore_ = input.readUInt32();

                break;
              } // case 56
              case 64: {
                isInTimeLimit_ = input.readBool();

                break;
              } // case 64
              case 104: {
                challengeMaxScore_ = input.readUInt32();

                break;
              } // case 104
              case 120: {
                isSuccess_ = input.readBool();

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

      private int challengeScore_ ;
      /**
       * <code>uint32 challenge_score = 7;</code>
       * @return The challengeScore.
       */
      @java.lang.Override
      public int getChallengeScore() {
        return challengeScore_;
      }
      /**
       * <code>uint32 challenge_score = 7;</code>
       * @param value The challengeScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeScore(int value) {
        
        challengeScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_score = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeScore() {
        
        challengeScore_ = 0;
        onChanged();
        return this;
      }

      private boolean isInTimeLimit_ ;
      /**
       * <code>bool is_in_time_limit = 8;</code>
       * @return The isInTimeLimit.
       */
      @java.lang.Override
      public boolean getIsInTimeLimit() {
        return isInTimeLimit_;
      }
      /**
       * <code>bool is_in_time_limit = 8;</code>
       * @param value The isInTimeLimit to set.
       * @return This builder for chaining.
       */
      public Builder setIsInTimeLimit(boolean value) {
        
        isInTimeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_in_time_limit = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInTimeLimit() {
        
        isInTimeLimit_ = false;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 15;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 15;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int challengeMaxScore_ ;
      /**
       * <code>uint32 challenge_max_score = 13;</code>
       * @return The challengeMaxScore.
       */
      @java.lang.Override
      public int getChallengeMaxScore() {
        return challengeMaxScore_;
      }
      /**
       * <code>uint32 challenge_max_score = 13;</code>
       * @param value The challengeMaxScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeMaxScore(int value) {
        
        challengeMaxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_max_score = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeMaxScore() {
        
        challengeMaxScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EffigyChallengeDungeonResultInfo)
    }

    // @@protoc_insertion_point(class_scope:EffigyChallengeDungeonResultInfo)
    private static final emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo();
    }

    public static emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EffigyChallengeDungeonResultInfo>
        PARSER = new com.google.protobuf.AbstractParser<EffigyChallengeDungeonResultInfo>() {
      @java.lang.Override
      public EffigyChallengeDungeonResultInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<EffigyChallengeDungeonResultInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EffigyChallengeDungeonResultInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.oldproto.EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EffigyChallengeDungeonResultInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&EffigyChallengeDungeonResultInfo.proto" +
      "\"\234\001\n EffigyChallengeDungeonResultInfo\022\027\n" +
      "\017challenge_score\030\007 \001(\r\022\030\n\020is_in_time_lim" +
      "it\030\010 \001(\010\022\024\n\014challenge_id\030\006 \001(\r\022\022\n\nis_suc" +
      "cess\030\017 \001(\010\022\033\n\023challenge_max_score\030\r \001(\rB" +
      "\036\n\034emu.grasscutter.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EffigyChallengeDungeonResultInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EffigyChallengeDungeonResultInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EffigyChallengeDungeonResultInfo_descriptor,
        new java.lang.String[] { "ChallengeScore", "IsInTimeLimit", "ChallengeId", "IsSuccess", "ChallengeMaxScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
