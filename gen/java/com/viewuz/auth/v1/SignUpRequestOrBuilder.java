// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/auth/v1/auth_service.proto

package com.viewuz.auth.v1;

public interface SignUpRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:viewuz.auth.v1.SignUpRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * E164 format
   * </pre>
   *
   * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <pre>
   * E164 format
   * </pre>
   *
   * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * verification session info from the response of SendVerificationCode
   * </pre>
   *
   * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
   * @return The sessionInfo.
   */
  java.lang.String getSessionInfo();
  /**
   * <pre>
   * verification session info from the response of SendVerificationCode
   * </pre>
   *
   * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
   * @return The bytes for sessionInfo.
   */
  com.google.protobuf.ByteString
      getSessionInfoBytes();

  /**
   * <pre>
   * verification code vis SMS
   * </pre>
   *
   * <code>string verification_code = 3 [json_name = "verificationCode"];</code>
   * @return The verificationCode.
   */
  java.lang.String getVerificationCode();
  /**
   * <pre>
   * verification code vis SMS
   * </pre>
   *
   * <code>string verification_code = 3 [json_name = "verificationCode"];</code>
   * @return The bytes for verificationCode.
   */
  com.google.protobuf.ByteString
      getVerificationCodeBytes();
}
