// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/contact/v1/contact_service.proto

package com.viewuz.contact.v1;

public interface BatchCreateContactsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:viewuz.contact.v1.BatchCreateContactsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  java.util.List<com.viewuz.contact.v1.Contact> 
      getContactsList();
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  com.viewuz.contact.v1.Contact getContacts(int index);
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  int getContactsCount();
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  java.util.List<? extends com.viewuz.contact.v1.ContactOrBuilder> 
      getContactsOrBuilderList();
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  com.viewuz.contact.v1.ContactOrBuilder getContactsOrBuilder(
      int index);
}
