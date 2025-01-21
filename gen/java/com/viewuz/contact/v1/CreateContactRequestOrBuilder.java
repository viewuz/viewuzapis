// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/contact/v1/contact_service.proto

package com.viewuz.contact.v1;

public interface CreateContactRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:viewuz.contact.v1.CreateContactRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The user to create the contact
   * </pre>
   *
   * <code>string parent = 1 [json_name = "parent", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The user to create the contact
   * </pre>
   *
   * <code>string parent = 1 [json_name = "parent", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The contact to create
   * </pre>
   *
   * <code>.viewuz.contact.v1.Contact contact = 2 [json_name = "contact", (.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the contact field is set.
   */
  boolean hasContact();
  /**
   * <pre>
   * The contact to create
   * </pre>
   *
   * <code>.viewuz.contact.v1.Contact contact = 2 [json_name = "contact", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The contact.
   */
  com.viewuz.contact.v1.Contact getContact();
  /**
   * <pre>
   * The contact to create
   * </pre>
   *
   * <code>.viewuz.contact.v1.Contact contact = 2 [json_name = "contact", (.google.api.field_behavior) = REQUIRED];</code>
   */
  com.viewuz.contact.v1.ContactOrBuilder getContactOrBuilder();
}
