// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/contact/v1/contact.proto

package com.viewuz.contact.v1;

public final class ContactProto {
  private ContactProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_viewuz_contact_v1_Contact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_viewuz_contact_v1_Contact_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037viewuz/contact/v1/contact.proto\022\021viewu" +
      "z.contact.v1\032\037google/protobuf/timestamp." +
      "proto\032\031viewuz/user/v1/user.proto\032\037google" +
      "/api/field_behavior.proto\"\257\001\n\007Contact\022\027\n" +
      "\004name\030\001 \001(\tB\003\340A\010R\004name\022!\n\014display_name\030\002" +
      " \001(\tR\013displayName\022(\n\004user\030\003 \001(\0132\024.viewuz" +
      ".user.v1.UserR\004user\022>\n\ncreated_at\030\004 \001(\0132" +
      "\032.google.protobuf.TimestampB\003\340A\003R\tcreate" +
      "dAtB\213\001\n\025com.viewuz.contact.v1B\014ContactPr" +
      "otoP\001\242\002\003VCX\252\002\021Viewuz.Contact.V1\312\002\021Viewuz" +
      "\\Contact\\V1\342\002\035Viewuz\\Contact\\V1\\GPBMetad" +
      "ata\352\002\023Viewuz::Contact::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.viewuz.user.v1.UserProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_viewuz_contact_v1_Contact_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_viewuz_contact_v1_Contact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_viewuz_contact_v1_Contact_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "User", "CreatedAt", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.TimestampProto.getDescriptor();
    com.viewuz.user.v1.UserProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
