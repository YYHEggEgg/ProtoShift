// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamPlayerLeaveReason.proto

package emu.grasscutter.net.newproto;

public final class DungeonCandidateTeamPlayerLeaveReasonOuterClass {
  private DungeonCandidateTeamPlayerLeaveReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DungeonCandidateTeamPlayerLeaveReason}
   */
  public enum DungeonCandidateTeamPlayerLeaveReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL = 0;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL(0),
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DIE = 1;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DIE(1),
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_BE_KICK = 2;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_BE_KICK(2),
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DISCONNECT = 3;</code>
     */
    DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DISCONNECT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL = 0;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL_VALUE = 0;
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DIE = 1;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DIE_VALUE = 1;
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_BE_KICK = 2;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_BE_KICK_VALUE = 2;
    /**
     * <code>DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DISCONNECT = 3;</code>
     */
    public static final int DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DISCONNECT_VALUE = 3;


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
    public static DungeonCandidateTeamPlayerLeaveReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DungeonCandidateTeamPlayerLeaveReason forNumber(int value) {
      switch (value) {
        case 0: return DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL;
        case 1: return DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DIE;
        case 2: return DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_BE_KICK;
        case 3: return DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DISCONNECT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DungeonCandidateTeamPlayerLeaveReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DungeonCandidateTeamPlayerLeaveReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DungeonCandidateTeamPlayerLeaveReason>() {
            public DungeonCandidateTeamPlayerLeaveReason findValueByNumber(int number) {
              return DungeonCandidateTeamPlayerLeaveReason.forNumber(number);
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
      return emu.grasscutter.net.newproto.DungeonCandidateTeamPlayerLeaveReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DungeonCandidateTeamPlayerLeaveReason[] VALUES = values();

    public static DungeonCandidateTeamPlayerLeaveReason valueOf(
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

    private DungeonCandidateTeamPlayerLeaveReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DungeonCandidateTeamPlayerLeaveReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+DungeonCandidateTeamPlayerLeaveReason." +
      "proto*\231\002\n%DungeonCandidateTeamPlayerLeav" +
      "eReason\022:\n6DUNGEON_CANDIDATE_TEAM_PLAYER" +
      "_LEAVE_REASON_TPLR_NORMAL\020\000\0227\n3DUNGEON_C" +
      "ANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_D" +
      "IE\020\001\022;\n7DUNGEON_CANDIDATE_TEAM_PLAYER_LE" +
      "AVE_REASON_TPLR_BE_KICK\020\002\022>\n:DUNGEON_CAN" +
      "DIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DIS" +
      "CONNECT\020\003B\036\n\034emu.grasscutter.net.newprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
