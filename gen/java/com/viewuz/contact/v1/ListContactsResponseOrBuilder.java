// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/contact/v1/contact_service.proto

package com.viewuz.contact.v1;

public interface ListContactsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:viewuz.contact.v1.ListContactsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The contacts from the specified user.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  java.util.List<com.viewuz.contact.v1.Contact> 
      getContactsList();
  /**
   * <pre>
   * The contacts from the specified user.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  com.viewuz.contact.v1.Contact getContacts(int index);
  /**
   * <pre>
   * The contacts from the specified user.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  int getContactsCount();
  /**
   * <pre>
   * The contacts from the specified user.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  java.util.List<? extends com.viewuz.contact.v1.ContactOrBuilder> 
      getContactsOrBuilderList();
  /**
   * <pre>
   * The contacts from the specified user.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  com.viewuz.contact.v1.ContactOrBuilder getContactsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
