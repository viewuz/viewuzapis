// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/auth/v1/auth_error_reason.proto

package com.viewuz.auth.v1;

public final class AuthErrorReasonProto {
  private AuthErrorReasonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&viewuz/auth/v1/auth_error_reason.proto" +
      "\022\016viewuz.auth.v1\032\034google/api/annotations" +
      ".proto*`\n\017AuthErrorReason\022!\n\035AUTH_ERROR_" +
      "REASON_UNSPECIFIED\020\000\022\030\n\024PHONE_NUMBER_INV" +
      "ALID\020\001\022\020\n\014CODE_INVALID\020\002B\204\001\n\022com.viewuz." +
      "auth.v1B\024AuthErrorReasonProtoP\001\242\002\003VAX\252\002\016" +
      "Viewuz.Auth.V1\312\002\016Viewuz\\Auth\\V1\342\002\032Viewuz" +
      "\\Auth\\V1\\GPBMetadata\352\002\020Viewuz::Auth::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
