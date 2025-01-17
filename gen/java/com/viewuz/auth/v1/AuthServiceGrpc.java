package com.viewuz.auth.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: viewuz/auth/v1/auth_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viewuz.auth.v1.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viewuz.auth.v1.SignInRequest,
      com.viewuz.auth.v1.TokenResponse> getSignInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignIn",
      requestType = com.viewuz.auth.v1.SignInRequest.class,
      responseType = com.viewuz.auth.v1.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.auth.v1.SignInRequest,
      com.viewuz.auth.v1.TokenResponse> getSignInMethod() {
    io.grpc.MethodDescriptor<com.viewuz.auth.v1.SignInRequest, com.viewuz.auth.v1.TokenResponse> getSignInMethod;
    if ((getSignInMethod = AuthServiceGrpc.getSignInMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSignInMethod = AuthServiceGrpc.getSignInMethod) == null) {
          AuthServiceGrpc.getSignInMethod = getSignInMethod =
              io.grpc.MethodDescriptor.<com.viewuz.auth.v1.SignInRequest, com.viewuz.auth.v1.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.auth.v1.SignInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.auth.v1.TokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("SignIn"))
              .build();
        }
      }
    }
    return getSignInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viewuz.auth.v1.SignUpRequest,
      com.viewuz.auth.v1.TokenResponse> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignUp",
      requestType = com.viewuz.auth.v1.SignUpRequest.class,
      responseType = com.viewuz.auth.v1.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.auth.v1.SignUpRequest,
      com.viewuz.auth.v1.TokenResponse> getSignUpMethod() {
    io.grpc.MethodDescriptor<com.viewuz.auth.v1.SignUpRequest, com.viewuz.auth.v1.TokenResponse> getSignUpMethod;
    if ((getSignUpMethod = AuthServiceGrpc.getSignUpMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSignUpMethod = AuthServiceGrpc.getSignUpMethod) == null) {
          AuthServiceGrpc.getSignUpMethod = getSignUpMethod =
              io.grpc.MethodDescriptor.<com.viewuz.auth.v1.SignUpRequest, com.viewuz.auth.v1.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SignUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.auth.v1.SignUpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.auth.v1.TokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("SignUp"))
              .build();
        }
      }
    }
    return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viewuz.auth.v1.SendVerificationCodeRequest,
      com.viewuz.auth.v1.SendVerificationCodeResponse> getSendVerificationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendVerificationCode",
      requestType = com.viewuz.auth.v1.SendVerificationCodeRequest.class,
      responseType = com.viewuz.auth.v1.SendVerificationCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.auth.v1.SendVerificationCodeRequest,
      com.viewuz.auth.v1.SendVerificationCodeResponse> getSendVerificationCodeMethod() {
    io.grpc.MethodDescriptor<com.viewuz.auth.v1.SendVerificationCodeRequest, com.viewuz.auth.v1.SendVerificationCodeResponse> getSendVerificationCodeMethod;
    if ((getSendVerificationCodeMethod = AuthServiceGrpc.getSendVerificationCodeMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getSendVerificationCodeMethod = AuthServiceGrpc.getSendVerificationCodeMethod) == null) {
          AuthServiceGrpc.getSendVerificationCodeMethod = getSendVerificationCodeMethod =
              io.grpc.MethodDescriptor.<com.viewuz.auth.v1.SendVerificationCodeRequest, com.viewuz.auth.v1.SendVerificationCodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendVerificationCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.auth.v1.SendVerificationCodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.auth.v1.SendVerificationCodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("SendVerificationCode"))
              .build();
        }
      }
    }
    return getSendVerificationCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sign in with phone number and verification code
     * </pre>
     */
    default void signIn(com.viewuz.auth.v1.SignInRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.auth.v1.TokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignInMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sign up with phone number and verification code
     * </pre>
     */
    default void signUp(com.viewuz.auth.v1.SignUpRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.auth.v1.TokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send Phone Verification Code
     * </pre>
     */
    default void sendVerificationCode(com.viewuz.auth.v1.SendVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.auth.v1.SendVerificationCodeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendVerificationCodeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sign in with phone number and verification code
     * </pre>
     */
    public void signIn(com.viewuz.auth.v1.SignInRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.auth.v1.TokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sign up with phone number and verification code
     * </pre>
     */
    public void signUp(com.viewuz.auth.v1.SignUpRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.auth.v1.TokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send Phone Verification Code
     * </pre>
     */
    public void sendVerificationCode(com.viewuz.auth.v1.SendVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.auth.v1.SendVerificationCodeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendVerificationCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sign in with phone number and verification code
     * </pre>
     */
    public com.viewuz.auth.v1.TokenResponse signIn(com.viewuz.auth.v1.SignInRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sign up with phone number and verification code
     * </pre>
     */
    public com.viewuz.auth.v1.TokenResponse signUp(com.viewuz.auth.v1.SignUpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send Phone Verification Code
     * </pre>
     */
    public com.viewuz.auth.v1.SendVerificationCodeResponse sendVerificationCode(com.viewuz.auth.v1.SendVerificationCodeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendVerificationCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sign in with phone number and verification code
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.auth.v1.TokenResponse> signIn(
        com.viewuz.auth.v1.SignInRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sign up with phone number and verification code
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.auth.v1.TokenResponse> signUp(
        com.viewuz.auth.v1.SignUpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send Phone Verification Code
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.auth.v1.SendVerificationCodeResponse> sendVerificationCode(
        com.viewuz.auth.v1.SendVerificationCodeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendVerificationCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_IN = 0;
  private static final int METHODID_SIGN_UP = 1;
  private static final int METHODID_SEND_VERIFICATION_CODE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_IN:
          serviceImpl.signIn((com.viewuz.auth.v1.SignInRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.auth.v1.TokenResponse>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((com.viewuz.auth.v1.SignUpRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.auth.v1.TokenResponse>) responseObserver);
          break;
        case METHODID_SEND_VERIFICATION_CODE:
          serviceImpl.sendVerificationCode((com.viewuz.auth.v1.SendVerificationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.auth.v1.SendVerificationCodeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSignInMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.auth.v1.SignInRequest,
              com.viewuz.auth.v1.TokenResponse>(
                service, METHODID_SIGN_IN)))
        .addMethod(
          getSignUpMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.auth.v1.SignUpRequest,
              com.viewuz.auth.v1.TokenResponse>(
                service, METHODID_SIGN_UP)))
        .addMethod(
          getSendVerificationCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.auth.v1.SendVerificationCodeRequest,
              com.viewuz.auth.v1.SendVerificationCodeResponse>(
                service, METHODID_SEND_VERIFICATION_CODE)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viewuz.auth.v1.AuthServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getSignInMethod())
              .addMethod(getSignUpMethod())
              .addMethod(getSendVerificationCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
