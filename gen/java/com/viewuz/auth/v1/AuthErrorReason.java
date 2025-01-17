// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/auth/v1/auth_error_reason.proto

package com.viewuz.auth.v1;

/**
 * Protobuf enum {@code viewuz.auth.v1.AuthErrorReason}
 */
public enum AuthErrorReason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AUTH_ERROR_REASON_UNSPECIFIED = 0;</code>
   */
  AUTH_ERROR_REASON_UNSPECIFIED(0),
  /**
   * <pre>
   * cannot be signup or signin
   * </pre>
   *
   * <code>PHONE_NUMBER_INVALID = 1;</code>
   */
  PHONE_NUMBER_INVALID(1),
  /**
   * <pre>
   * the code is not matched or session info is invalid
   * </pre>
   *
   * <code>CODE_INVALID = 2;</code>
   */
  CODE_INVALID(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AUTH_ERROR_REASON_UNSPECIFIED = 0;</code>
   */
  public static final int AUTH_ERROR_REASON_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * cannot be signup or signin
   * </pre>
   *
   * <code>PHONE_NUMBER_INVALID = 1;</code>
   */
  public static final int PHONE_NUMBER_INVALID_VALUE = 1;
  /**
   * <pre>
   * the code is not matched or session info is invalid
   * </pre>
   *
   * <code>CODE_INVALID = 2;</code>
   */
  public static final int CODE_INVALID_VALUE = 2;


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
  public static AuthErrorReason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AuthErrorReason forNumber(int value) {
    switch (value) {
      case 0: return AUTH_ERROR_REASON_UNSPECIFIED;
      case 1: return PHONE_NUMBER_INVALID;
      case 2: return CODE_INVALID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AuthErrorReason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AuthErrorReason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AuthErrorReason>() {
          public AuthErrorReason findValueByNumber(int number) {
            return AuthErrorReason.forNumber(number);
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
    return com.viewuz.auth.v1.AuthErrorReasonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AuthErrorReason[] VALUES = values();

  public static AuthErrorReason valueOf(
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

  private AuthErrorReason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:viewuz.auth.v1.AuthErrorReason)
}

