// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/contact/v1/contact_service.proto

package com.viewuz.contact.v1;

/**
 * Protobuf type {@code viewuz.contact.v1.BatchCreateContactsResponse}
 */
public final class BatchCreateContactsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:viewuz.contact.v1.BatchCreateContactsResponse)
    BatchCreateContactsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchCreateContactsResponse.newBuilder() to construct.
  private BatchCreateContactsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchCreateContactsResponse() {
    contacts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchCreateContactsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.viewuz.contact.v1.ContactServiceProto.internal_static_viewuz_contact_v1_BatchCreateContactsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.viewuz.contact.v1.ContactServiceProto.internal_static_viewuz_contact_v1_BatchCreateContactsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.viewuz.contact.v1.BatchCreateContactsResponse.class, com.viewuz.contact.v1.BatchCreateContactsResponse.Builder.class);
  }

  public static final int CONTACTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.viewuz.contact.v1.Contact> contacts_;
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  @java.lang.Override
  public java.util.List<com.viewuz.contact.v1.Contact> getContactsList() {
    return contacts_;
  }
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.viewuz.contact.v1.ContactOrBuilder> 
      getContactsOrBuilderList() {
    return contacts_;
  }
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  @java.lang.Override
  public int getContactsCount() {
    return contacts_.size();
  }
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  @java.lang.Override
  public com.viewuz.contact.v1.Contact getContacts(int index) {
    return contacts_.get(index);
  }
  /**
   * <pre>
   * Contacts created.
   * </pre>
   *
   * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
   */
  @java.lang.Override
  public com.viewuz.contact.v1.ContactOrBuilder getContactsOrBuilder(
      int index) {
    return contacts_.get(index);
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
    for (int i = 0; i < contacts_.size(); i++) {
      output.writeMessage(1, contacts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < contacts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, contacts_.get(i));
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
    if (!(obj instanceof com.viewuz.contact.v1.BatchCreateContactsResponse)) {
      return super.equals(obj);
    }
    com.viewuz.contact.v1.BatchCreateContactsResponse other = (com.viewuz.contact.v1.BatchCreateContactsResponse) obj;

    if (!getContactsList()
        .equals(other.getContactsList())) return false;
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
    if (getContactsCount() > 0) {
      hash = (37 * hash) + CONTACTS_FIELD_NUMBER;
      hash = (53 * hash) + getContactsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.viewuz.contact.v1.BatchCreateContactsResponse parseFrom(
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
  public static Builder newBuilder(com.viewuz.contact.v1.BatchCreateContactsResponse prototype) {
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
   * Protobuf type {@code viewuz.contact.v1.BatchCreateContactsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:viewuz.contact.v1.BatchCreateContactsResponse)
      com.viewuz.contact.v1.BatchCreateContactsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.viewuz.contact.v1.ContactServiceProto.internal_static_viewuz_contact_v1_BatchCreateContactsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.viewuz.contact.v1.ContactServiceProto.internal_static_viewuz_contact_v1_BatchCreateContactsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.viewuz.contact.v1.BatchCreateContactsResponse.class, com.viewuz.contact.v1.BatchCreateContactsResponse.Builder.class);
    }

    // Construct using com.viewuz.contact.v1.BatchCreateContactsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (contactsBuilder_ == null) {
        contacts_ = java.util.Collections.emptyList();
      } else {
        contacts_ = null;
        contactsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.viewuz.contact.v1.ContactServiceProto.internal_static_viewuz_contact_v1_BatchCreateContactsResponse_descriptor;
    }

    @java.lang.Override
    public com.viewuz.contact.v1.BatchCreateContactsResponse getDefaultInstanceForType() {
      return com.viewuz.contact.v1.BatchCreateContactsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.viewuz.contact.v1.BatchCreateContactsResponse build() {
      com.viewuz.contact.v1.BatchCreateContactsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.viewuz.contact.v1.BatchCreateContactsResponse buildPartial() {
      com.viewuz.contact.v1.BatchCreateContactsResponse result = new com.viewuz.contact.v1.BatchCreateContactsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.viewuz.contact.v1.BatchCreateContactsResponse result) {
      if (contactsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contacts_ = java.util.Collections.unmodifiableList(contacts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contacts_ = contacts_;
      } else {
        result.contacts_ = contactsBuilder_.build();
      }
    }

    private void buildPartial0(com.viewuz.contact.v1.BatchCreateContactsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.viewuz.contact.v1.BatchCreateContactsResponse) {
        return mergeFrom((com.viewuz.contact.v1.BatchCreateContactsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.viewuz.contact.v1.BatchCreateContactsResponse other) {
      if (other == com.viewuz.contact.v1.BatchCreateContactsResponse.getDefaultInstance()) return this;
      if (contactsBuilder_ == null) {
        if (!other.contacts_.isEmpty()) {
          if (contacts_.isEmpty()) {
            contacts_ = other.contacts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContactsIsMutable();
            contacts_.addAll(other.contacts_);
          }
          onChanged();
        }
      } else {
        if (!other.contacts_.isEmpty()) {
          if (contactsBuilder_.isEmpty()) {
            contactsBuilder_.dispose();
            contactsBuilder_ = null;
            contacts_ = other.contacts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contactsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContactsFieldBuilder() : null;
          } else {
            contactsBuilder_.addAllMessages(other.contacts_);
          }
        }
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
            case 10: {
              com.viewuz.contact.v1.Contact m =
                  input.readMessage(
                      com.viewuz.contact.v1.Contact.parser(),
                      extensionRegistry);
              if (contactsBuilder_ == null) {
                ensureContactsIsMutable();
                contacts_.add(m);
              } else {
                contactsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<com.viewuz.contact.v1.Contact> contacts_ =
      java.util.Collections.emptyList();
    private void ensureContactsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contacts_ = new java.util.ArrayList<com.viewuz.contact.v1.Contact>(contacts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.viewuz.contact.v1.Contact, com.viewuz.contact.v1.Contact.Builder, com.viewuz.contact.v1.ContactOrBuilder> contactsBuilder_;

    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public java.util.List<com.viewuz.contact.v1.Contact> getContactsList() {
      if (contactsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contacts_);
      } else {
        return contactsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public int getContactsCount() {
      if (contactsBuilder_ == null) {
        return contacts_.size();
      } else {
        return contactsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public com.viewuz.contact.v1.Contact getContacts(int index) {
      if (contactsBuilder_ == null) {
        return contacts_.get(index);
      } else {
        return contactsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder setContacts(
        int index, com.viewuz.contact.v1.Contact value) {
      if (contactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactsIsMutable();
        contacts_.set(index, value);
        onChanged();
      } else {
        contactsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder setContacts(
        int index, com.viewuz.contact.v1.Contact.Builder builderForValue) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        contacts_.set(index, builderForValue.build());
        onChanged();
      } else {
        contactsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder addContacts(com.viewuz.contact.v1.Contact value) {
      if (contactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactsIsMutable();
        contacts_.add(value);
        onChanged();
      } else {
        contactsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder addContacts(
        int index, com.viewuz.contact.v1.Contact value) {
      if (contactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactsIsMutable();
        contacts_.add(index, value);
        onChanged();
      } else {
        contactsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder addContacts(
        com.viewuz.contact.v1.Contact.Builder builderForValue) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        contacts_.add(builderForValue.build());
        onChanged();
      } else {
        contactsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder addContacts(
        int index, com.viewuz.contact.v1.Contact.Builder builderForValue) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        contacts_.add(index, builderForValue.build());
        onChanged();
      } else {
        contactsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder addAllContacts(
        java.lang.Iterable<? extends com.viewuz.contact.v1.Contact> values) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contacts_);
        onChanged();
      } else {
        contactsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder clearContacts() {
      if (contactsBuilder_ == null) {
        contacts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contactsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public Builder removeContacts(int index) {
      if (contactsBuilder_ == null) {
        ensureContactsIsMutable();
        contacts_.remove(index);
        onChanged();
      } else {
        contactsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public com.viewuz.contact.v1.Contact.Builder getContactsBuilder(
        int index) {
      return getContactsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public com.viewuz.contact.v1.ContactOrBuilder getContactsOrBuilder(
        int index) {
      if (contactsBuilder_ == null) {
        return contacts_.get(index);  } else {
        return contactsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public java.util.List<? extends com.viewuz.contact.v1.ContactOrBuilder> 
         getContactsOrBuilderList() {
      if (contactsBuilder_ != null) {
        return contactsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contacts_);
      }
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public com.viewuz.contact.v1.Contact.Builder addContactsBuilder() {
      return getContactsFieldBuilder().addBuilder(
          com.viewuz.contact.v1.Contact.getDefaultInstance());
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public com.viewuz.contact.v1.Contact.Builder addContactsBuilder(
        int index) {
      return getContactsFieldBuilder().addBuilder(
          index, com.viewuz.contact.v1.Contact.getDefaultInstance());
    }
    /**
     * <pre>
     * Contacts created.
     * </pre>
     *
     * <code>repeated .viewuz.contact.v1.Contact contacts = 1 [json_name = "contacts"];</code>
     */
    public java.util.List<com.viewuz.contact.v1.Contact.Builder> 
         getContactsBuilderList() {
      return getContactsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.viewuz.contact.v1.Contact, com.viewuz.contact.v1.Contact.Builder, com.viewuz.contact.v1.ContactOrBuilder> 
        getContactsFieldBuilder() {
      if (contactsBuilder_ == null) {
        contactsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.viewuz.contact.v1.Contact, com.viewuz.contact.v1.Contact.Builder, com.viewuz.contact.v1.ContactOrBuilder>(
                contacts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        contacts_ = null;
      }
      return contactsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:viewuz.contact.v1.BatchCreateContactsResponse)
  }

  // @@protoc_insertion_point(class_scope:viewuz.contact.v1.BatchCreateContactsResponse)
  private static final com.viewuz.contact.v1.BatchCreateContactsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.viewuz.contact.v1.BatchCreateContactsResponse();
  }

  public static com.viewuz.contact.v1.BatchCreateContactsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateContactsResponse>
      PARSER = new com.google.protobuf.AbstractParser<BatchCreateContactsResponse>() {
    @java.lang.Override
    public BatchCreateContactsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCreateContactsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateContactsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.viewuz.contact.v1.BatchCreateContactsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

