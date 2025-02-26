// DO NOT EDIT.
// swift-format-ignore-file
// swiftlint:disable all
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: viewuz/auth/v1/auth_service.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

struct Viewuz_Auth_V1_SignInRequest: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// E164 format
  var phoneNumber: String = String()

  /// verification session info from the response of SendVerificationCode
  var sessionInfo: String = String()

  /// The user-entered verification code from an SMS sent to the user's phone.
  var code: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Viewuz_Auth_V1_TokenResponse: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var accessToken: String = String()

  var refreshToken: String = String()

  /// The type of access token, which is always bearer.
  var tokenType: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Viewuz_Auth_V1_SignUpRequest: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// E164 format
  var phoneNumber: String = String()

  /// verification session info from the response of SendVerificationCode
  var sessionInfo: String = String()

  /// The user-entered verification code from an SMS sent to the user's phone.
  var code: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Viewuz_Auth_V1_SendVerificationCodeRequest: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  /// E164 format
  /// EXAMPLE: +998901234567
  var phoneNumber: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Viewuz_Auth_V1_SendVerificationCodeResponse: Sendable {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var sessionInfo: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "viewuz.auth.v1"

extension Viewuz_Auth_V1_SignInRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SignInRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "phone_number"),
    2: .standard(proto: "session_info"),
    3: .same(proto: "code"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.phoneNumber) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sessionInfo) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.code) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.phoneNumber.isEmpty {
      try visitor.visitSingularStringField(value: self.phoneNumber, fieldNumber: 1)
    }
    if !self.sessionInfo.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionInfo, fieldNumber: 2)
    }
    if !self.code.isEmpty {
      try visitor.visitSingularStringField(value: self.code, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Viewuz_Auth_V1_SignInRequest, rhs: Viewuz_Auth_V1_SignInRequest) -> Bool {
    if lhs.phoneNumber != rhs.phoneNumber {return false}
    if lhs.sessionInfo != rhs.sessionInfo {return false}
    if lhs.code != rhs.code {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Viewuz_Auth_V1_TokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".TokenResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "access_token"),
    2: .standard(proto: "refresh_token"),
    3: .standard(proto: "token_type"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.accessToken) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.refreshToken) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.tokenType) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.accessToken.isEmpty {
      try visitor.visitSingularStringField(value: self.accessToken, fieldNumber: 1)
    }
    if !self.refreshToken.isEmpty {
      try visitor.visitSingularStringField(value: self.refreshToken, fieldNumber: 2)
    }
    if !self.tokenType.isEmpty {
      try visitor.visitSingularStringField(value: self.tokenType, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Viewuz_Auth_V1_TokenResponse, rhs: Viewuz_Auth_V1_TokenResponse) -> Bool {
    if lhs.accessToken != rhs.accessToken {return false}
    if lhs.refreshToken != rhs.refreshToken {return false}
    if lhs.tokenType != rhs.tokenType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Viewuz_Auth_V1_SignUpRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SignUpRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "phone_number"),
    2: .standard(proto: "session_info"),
    3: .same(proto: "code"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.phoneNumber) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.sessionInfo) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.code) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.phoneNumber.isEmpty {
      try visitor.visitSingularStringField(value: self.phoneNumber, fieldNumber: 1)
    }
    if !self.sessionInfo.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionInfo, fieldNumber: 2)
    }
    if !self.code.isEmpty {
      try visitor.visitSingularStringField(value: self.code, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Viewuz_Auth_V1_SignUpRequest, rhs: Viewuz_Auth_V1_SignUpRequest) -> Bool {
    if lhs.phoneNumber != rhs.phoneNumber {return false}
    if lhs.sessionInfo != rhs.sessionInfo {return false}
    if lhs.code != rhs.code {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Viewuz_Auth_V1_SendVerificationCodeRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SendVerificationCodeRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "phone_number"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.phoneNumber) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.phoneNumber.isEmpty {
      try visitor.visitSingularStringField(value: self.phoneNumber, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Viewuz_Auth_V1_SendVerificationCodeRequest, rhs: Viewuz_Auth_V1_SendVerificationCodeRequest) -> Bool {
    if lhs.phoneNumber != rhs.phoneNumber {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Viewuz_Auth_V1_SendVerificationCodeResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".SendVerificationCodeResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "session_info"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.sessionInfo) }()
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.sessionInfo.isEmpty {
      try visitor.visitSingularStringField(value: self.sessionInfo, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Viewuz_Auth_V1_SendVerificationCodeResponse, rhs: Viewuz_Auth_V1_SendVerificationCodeResponse) -> Bool {
    if lhs.sessionInfo != rhs.sessionInfo {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
