package com.viewuz.user.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: viewuz/user/v1/user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserSerivceGrpc {

  private UserSerivceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viewuz.user.v1.UserSerivce";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viewuz.user.v1.GetUserRequest,
      com.viewuz.user.v1.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.viewuz.user.v1.GetUserRequest.class,
      responseType = com.viewuz.user.v1.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.user.v1.GetUserRequest,
      com.viewuz.user.v1.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.viewuz.user.v1.GetUserRequest, com.viewuz.user.v1.User> getGetUserMethod;
    if ((getGetUserMethod = UserSerivceGrpc.getGetUserMethod) == null) {
      synchronized (UserSerivceGrpc.class) {
        if ((getGetUserMethod = UserSerivceGrpc.getGetUserMethod) == null) {
          UserSerivceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.viewuz.user.v1.GetUserRequest, com.viewuz.user.v1.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.user.v1.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.user.v1.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserSerivceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viewuz.user.v1.UpdateUserRequest,
      com.viewuz.user.v1.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.viewuz.user.v1.UpdateUserRequest.class,
      responseType = com.viewuz.user.v1.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.user.v1.UpdateUserRequest,
      com.viewuz.user.v1.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.viewuz.user.v1.UpdateUserRequest, com.viewuz.user.v1.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserSerivceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserSerivceGrpc.class) {
        if ((getUpdateUserMethod = UserSerivceGrpc.getUpdateUserMethod) == null) {
          UserSerivceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.viewuz.user.v1.UpdateUserRequest, com.viewuz.user.v1.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.user.v1.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.user.v1.User.getDefaultInstance()))
              .setSchemaDescriptor(new UserSerivceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viewuz.user.v1.UploadProfileImageRequest,
      com.viewuz.user.v1.UploadProfileImageResponse> getUploadProfileImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadProfileImage",
      requestType = com.viewuz.user.v1.UploadProfileImageRequest.class,
      responseType = com.viewuz.user.v1.UploadProfileImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.user.v1.UploadProfileImageRequest,
      com.viewuz.user.v1.UploadProfileImageResponse> getUploadProfileImageMethod() {
    io.grpc.MethodDescriptor<com.viewuz.user.v1.UploadProfileImageRequest, com.viewuz.user.v1.UploadProfileImageResponse> getUploadProfileImageMethod;
    if ((getUploadProfileImageMethod = UserSerivceGrpc.getUploadProfileImageMethod) == null) {
      synchronized (UserSerivceGrpc.class) {
        if ((getUploadProfileImageMethod = UserSerivceGrpc.getUploadProfileImageMethod) == null) {
          UserSerivceGrpc.getUploadProfileImageMethod = getUploadProfileImageMethod =
              io.grpc.MethodDescriptor.<com.viewuz.user.v1.UploadProfileImageRequest, com.viewuz.user.v1.UploadProfileImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadProfileImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.user.v1.UploadProfileImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.user.v1.UploadProfileImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserSerivceMethodDescriptorSupplier("UploadProfileImage"))
              .build();
        }
      }
    }
    return getUploadProfileImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viewuz.user.v1.VerifyPhoneNumberRequest,
      com.google.protobuf.Empty> getVerifyPhoneNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyPhoneNumber",
      requestType = com.viewuz.user.v1.VerifyPhoneNumberRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.user.v1.VerifyPhoneNumberRequest,
      com.google.protobuf.Empty> getVerifyPhoneNumberMethod() {
    io.grpc.MethodDescriptor<com.viewuz.user.v1.VerifyPhoneNumberRequest, com.google.protobuf.Empty> getVerifyPhoneNumberMethod;
    if ((getVerifyPhoneNumberMethod = UserSerivceGrpc.getVerifyPhoneNumberMethod) == null) {
      synchronized (UserSerivceGrpc.class) {
        if ((getVerifyPhoneNumberMethod = UserSerivceGrpc.getVerifyPhoneNumberMethod) == null) {
          UserSerivceGrpc.getVerifyPhoneNumberMethod = getVerifyPhoneNumberMethod =
              io.grpc.MethodDescriptor.<com.viewuz.user.v1.VerifyPhoneNumberRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyPhoneNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.user.v1.VerifyPhoneNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserSerivceMethodDescriptorSupplier("VerifyPhoneNumber"))
              .build();
        }
      }
    }
    return getVerifyPhoneNumberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserSerivceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSerivceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSerivceStub>() {
        @java.lang.Override
        public UserSerivceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSerivceStub(channel, callOptions);
        }
      };
    return UserSerivceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserSerivceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSerivceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSerivceBlockingStub>() {
        @java.lang.Override
        public UserSerivceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSerivceBlockingStub(channel, callOptions);
        }
      };
    return UserSerivceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserSerivceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSerivceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSerivceFutureStub>() {
        @java.lang.Override
        public UserSerivceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSerivceFutureStub(channel, callOptions);
        }
      };
    return UserSerivceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get the user
     * </pre>
     */
    default void getUser(com.viewuz.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.user.v1.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the user
     * </pre>
     */
    default void updateUser(com.viewuz.user.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.user.v1.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the user profile_image_url and get uploadeable signed url
     * must upload to real image to the signed url
     * </pre>
     */
    default void uploadProfileImage(com.viewuz.user.v1.UploadProfileImageRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.user.v1.UploadProfileImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadProfileImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the user phone_number
     * </pre>
     */
    default void verifyPhoneNumber(com.viewuz.user.v1.VerifyPhoneNumberRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyPhoneNumberMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserSerivce.
   */
  public static abstract class UserSerivceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserSerivceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserSerivce.
   */
  public static final class UserSerivceStub
      extends io.grpc.stub.AbstractAsyncStub<UserSerivceStub> {
    private UserSerivceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSerivceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSerivceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the user
     * </pre>
     */
    public void getUser(com.viewuz.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.user.v1.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the user
     * </pre>
     */
    public void updateUser(com.viewuz.user.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.user.v1.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the user profile_image_url and get uploadeable signed url
     * must upload to real image to the signed url
     * </pre>
     */
    public void uploadProfileImage(com.viewuz.user.v1.UploadProfileImageRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.user.v1.UploadProfileImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadProfileImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the user phone_number
     * </pre>
     */
    public void verifyPhoneNumber(com.viewuz.user.v1.VerifyPhoneNumberRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyPhoneNumberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserSerivce.
   */
  public static final class UserSerivceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserSerivceBlockingStub> {
    private UserSerivceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSerivceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSerivceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the user
     * </pre>
     */
    public com.viewuz.user.v1.User getUser(com.viewuz.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the user
     * </pre>
     */
    public com.viewuz.user.v1.User updateUser(com.viewuz.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the user profile_image_url and get uploadeable signed url
     * must upload to real image to the signed url
     * </pre>
     */
    public com.viewuz.user.v1.UploadProfileImageResponse uploadProfileImage(com.viewuz.user.v1.UploadProfileImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadProfileImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the user phone_number
     * </pre>
     */
    public com.google.protobuf.Empty verifyPhoneNumber(com.viewuz.user.v1.VerifyPhoneNumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyPhoneNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserSerivce.
   */
  public static final class UserSerivceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserSerivceFutureStub> {
    private UserSerivceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSerivceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSerivceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.user.v1.User> getUser(
        com.viewuz.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.user.v1.User> updateUser(
        com.viewuz.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the user profile_image_url and get uploadeable signed url
     * must upload to real image to the signed url
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.user.v1.UploadProfileImageResponse> uploadProfileImage(
        com.viewuz.user.v1.UploadProfileImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadProfileImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the user phone_number
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> verifyPhoneNumber(
        com.viewuz.user.v1.VerifyPhoneNumberRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyPhoneNumberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_UPDATE_USER = 1;
  private static final int METHODID_UPLOAD_PROFILE_IMAGE = 2;
  private static final int METHODID_VERIFY_PHONE_NUMBER = 3;

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
        case METHODID_GET_USER:
          serviceImpl.getUser((com.viewuz.user.v1.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.user.v1.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.viewuz.user.v1.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.user.v1.User>) responseObserver);
          break;
        case METHODID_UPLOAD_PROFILE_IMAGE:
          serviceImpl.uploadProfileImage((com.viewuz.user.v1.UploadProfileImageRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.user.v1.UploadProfileImageResponse>) responseObserver);
          break;
        case METHODID_VERIFY_PHONE_NUMBER:
          serviceImpl.verifyPhoneNumber((com.viewuz.user.v1.VerifyPhoneNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.user.v1.GetUserRequest,
              com.viewuz.user.v1.User>(
                service, METHODID_GET_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.user.v1.UpdateUserRequest,
              com.viewuz.user.v1.User>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getUploadProfileImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.user.v1.UploadProfileImageRequest,
              com.viewuz.user.v1.UploadProfileImageResponse>(
                service, METHODID_UPLOAD_PROFILE_IMAGE)))
        .addMethod(
          getVerifyPhoneNumberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.user.v1.VerifyPhoneNumberRequest,
              com.google.protobuf.Empty>(
                service, METHODID_VERIFY_PHONE_NUMBER)))
        .build();
  }

  private static abstract class UserSerivceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserSerivceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viewuz.user.v1.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserSerivce");
    }
  }

  private static final class UserSerivceFileDescriptorSupplier
      extends UserSerivceBaseDescriptorSupplier {
    UserSerivceFileDescriptorSupplier() {}
  }

  private static final class UserSerivceMethodDescriptorSupplier
      extends UserSerivceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserSerivceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserSerivceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserSerivceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getUploadProfileImageMethod())
              .addMethod(getVerifyPhoneNumberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
