// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: viewuz/auth/v1/auth_service.proto

package com.viewuz.auth.v1;

/**
 * Protobuf type {@code viewuz.auth.v1.SignInRequest}
 */
public final class SignInRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:viewuz.auth.v1.SignInRequest)
    SignInRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignInRequest.newBuilder() to construct.
  private SignInRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignInRequest() {
    phoneNumber_ = "";
    sessionInfo_ = "";
    code_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SignInRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.viewuz.auth.v1.AuthServiceProto.internal_static_viewuz_auth_v1_SignInRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.viewuz.auth.v1.AuthServiceProto.internal_static_viewuz_auth_v1_SignInRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.viewuz.auth.v1.SignInRequest.class, com.viewuz.auth.v1.SignInRequest.Builder.class);
  }

  public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object phoneNumber_ = "";
  /**
   * <pre>
   * E164 format
   * </pre>
   *
   * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
   * @return The phoneNumber.
   */
  @java.lang.Override
  public java.lang.String getPhoneNumber() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phoneNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * E164 format
   * </pre>
   *
   * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
   * @return The bytes for phoneNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhoneNumberBytes() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phoneNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSION_INFO_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sessionInfo_ = "";
  /**
   * <pre>
   * verification session info from the response of SendVerificationCode
   * </pre>
   *
   * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
   * @return The sessionInfo.
   */
  @java.lang.Override
  public java.lang.String getSessionInfo() {
    java.lang.Object ref = sessionInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionInfo_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * verification session info from the response of SendVerificationCode
   * </pre>
   *
   * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
   * @return The bytes for sessionInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionInfoBytes() {
    java.lang.Object ref = sessionInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object code_ = "";
  /**
   * <pre>
   * The user-entered verification code from an SMS sent to the user's phone.
   * </pre>
   *
   * <code>string code = 3 [json_name = "code"];</code>
   * @return The code.
   */
  @java.lang.Override
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The user-entered verification code from an SMS sent to the user's phone.
   * </pre>
   *
   * <code>string code = 3 [json_name = "code"];</code>
   * @return The bytes for code.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phoneNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phoneNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionInfo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sessionInfo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, code_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phoneNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phoneNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionInfo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sessionInfo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, code_);
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
    if (!(obj instanceof com.viewuz.auth.v1.SignInRequest)) {
      return super.equals(obj);
    }
    com.viewuz.auth.v1.SignInRequest other = (com.viewuz.auth.v1.SignInRequest) obj;

    if (!getPhoneNumber()
        .equals(other.getPhoneNumber())) return false;
    if (!getSessionInfo()
        .equals(other.getSessionInfo())) return false;
    if (!getCode()
        .equals(other.getCode())) return false;
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
    hash = (37 * hash) + PHONE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPhoneNumber().hashCode();
    hash = (37 * hash) + SESSION_INFO_FIELD_NUMBER;
    hash = (53 * hash) + getSessionInfo().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.viewuz.auth.v1.SignInRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.viewuz.auth.v1.SignInRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.viewuz.auth.v1.SignInRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.viewuz.auth.v1.SignInRequest parseFrom(
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
  public static Builder newBuilder(com.viewuz.auth.v1.SignInRequest prototype) {
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
   * Protobuf type {@code viewuz.auth.v1.SignInRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:viewuz.auth.v1.SignInRequest)
      com.viewuz.auth.v1.SignInRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.viewuz.auth.v1.AuthServiceProto.internal_static_viewuz_auth_v1_SignInRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.viewuz.auth.v1.AuthServiceProto.internal_static_viewuz_auth_v1_SignInRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.viewuz.auth.v1.SignInRequest.class, com.viewuz.auth.v1.SignInRequest.Builder.class);
    }

    // Construct using com.viewuz.auth.v1.SignInRequest.newBuilder()
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
      phoneNumber_ = "";
      sessionInfo_ = "";
      code_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.viewuz.auth.v1.AuthServiceProto.internal_static_viewuz_auth_v1_SignInRequest_descriptor;
    }

    @java.lang.Override
    public com.viewuz.auth.v1.SignInRequest getDefaultInstanceForType() {
      return com.viewuz.auth.v1.SignInRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.viewuz.auth.v1.SignInRequest build() {
      com.viewuz.auth.v1.SignInRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.viewuz.auth.v1.SignInRequest buildPartial() {
      com.viewuz.auth.v1.SignInRequest result = new com.viewuz.auth.v1.SignInRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.viewuz.auth.v1.SignInRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.phoneNumber_ = phoneNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionInfo_ = sessionInfo_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.code_ = code_;
      }
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
      if (other instanceof com.viewuz.auth.v1.SignInRequest) {
        return mergeFrom((com.viewuz.auth.v1.SignInRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.viewuz.auth.v1.SignInRequest other) {
      if (other == com.viewuz.auth.v1.SignInRequest.getDefaultInstance()) return this;
      if (!other.getPhoneNumber().isEmpty()) {
        phoneNumber_ = other.phoneNumber_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSessionInfo().isEmpty()) {
        sessionInfo_ = other.sessionInfo_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              phoneNumber_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              sessionInfo_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              code_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object phoneNumber_ = "";
    /**
     * <pre>
     * E164 format
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @return The phoneNumber.
     */
    public java.lang.String getPhoneNumber() {
      java.lang.Object ref = phoneNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * E164 format
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @return The bytes for phoneNumber.
     */
    public com.google.protobuf.ByteString
        getPhoneNumberBytes() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * E164 format
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @param value The phoneNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      phoneNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * E164 format
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneNumber() {
      phoneNumber_ = getDefaultInstance().getPhoneNumber();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * E164 format
     * </pre>
     *
     * <code>string phone_number = 1 [json_name = "phoneNumber"];</code>
     * @param value The bytes for phoneNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      phoneNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object sessionInfo_ = "";
    /**
     * <pre>
     * verification session info from the response of SendVerificationCode
     * </pre>
     *
     * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
     * @return The sessionInfo.
     */
    public java.lang.String getSessionInfo() {
      java.lang.Object ref = sessionInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * verification session info from the response of SendVerificationCode
     * </pre>
     *
     * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
     * @return The bytes for sessionInfo.
     */
    public com.google.protobuf.ByteString
        getSessionInfoBytes() {
      java.lang.Object ref = sessionInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * verification session info from the response of SendVerificationCode
     * </pre>
     *
     * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
     * @param value The sessionInfo to set.
     * @return This builder for chaining.
     */
    public Builder setSessionInfo(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sessionInfo_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * verification session info from the response of SendVerificationCode
     * </pre>
     *
     * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionInfo() {
      sessionInfo_ = getDefaultInstance().getSessionInfo();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * verification session info from the response of SendVerificationCode
     * </pre>
     *
     * <code>string session_info = 2 [json_name = "sessionInfo"];</code>
     * @param value The bytes for sessionInfo to set.
     * @return This builder for chaining.
     */
    public Builder setSessionInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sessionInfo_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     * <pre>
     * The user-entered verification code from an SMS sent to the user's phone.
     * </pre>
     *
     * <code>string code = 3 [json_name = "code"];</code>
     * @return The code.
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The user-entered verification code from an SMS sent to the user's phone.
     * </pre>
     *
     * <code>string code = 3 [json_name = "code"];</code>
     * @return The bytes for code.
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The user-entered verification code from an SMS sent to the user's phone.
     * </pre>
     *
     * <code>string code = 3 [json_name = "code"];</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      code_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user-entered verification code from an SMS sent to the user's phone.
     * </pre>
     *
     * <code>string code = 3 [json_name = "code"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      code_ = getDefaultInstance().getCode();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user-entered verification code from an SMS sent to the user's phone.
     * </pre>
     *
     * <code>string code = 3 [json_name = "code"];</code>
     * @param value The bytes for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      code_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:viewuz.auth.v1.SignInRequest)
  }

  // @@protoc_insertion_point(class_scope:viewuz.auth.v1.SignInRequest)
  private static final com.viewuz.auth.v1.SignInRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.viewuz.auth.v1.SignInRequest();
  }

  public static com.viewuz.auth.v1.SignInRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignInRequest>
      PARSER = new com.google.protobuf.AbstractParser<SignInRequest>() {
    @java.lang.Override
    public SignInRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignInRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignInRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.viewuz.auth.v1.SignInRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

