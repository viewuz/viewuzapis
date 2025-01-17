// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/auth/v1/auth_service.proto

package com.viewuz.auth.v1;

public interface TokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:viewuz.auth.v1.TokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string access_token = 1 [json_name = "accessToken"];</code>
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <code>string access_token = 1 [json_name = "accessToken"];</code>
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
   * @return The refreshToken.
   */
  java.lang.String getRefreshToken();
  /**
   * <code>string refresh_token = 2 [json_name = "refreshToken"];</code>
   * @return The bytes for refreshToken.
   */
  com.google.protobuf.ByteString
      getRefreshTokenBytes();

  /**
   * <pre>
   * The type of access token, which is always bearer.
   * </pre>
   *
   * <code>string token_type = 3 [json_name = "tokenType"];</code>
   * @return The tokenType.
   */
  java.lang.String getTokenType();
  /**
   * <pre>
   * The type of access token, which is always bearer.
   * </pre>
   *
   * <code>string token_type = 3 [json_name = "tokenType"];</code>
   * @return The bytes for tokenType.
   */
  com.google.protobuf.ByteString
      getTokenTypeBytes();
}
