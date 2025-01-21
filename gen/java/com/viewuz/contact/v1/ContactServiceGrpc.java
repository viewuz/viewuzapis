package com.viewuz.contact.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: viewuz/contact/v1/contact_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContactServiceGrpc {

  private ContactServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "viewuz.contact.v1.ContactService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.viewuz.contact.v1.CreateContactRequest,
      com.viewuz.contact.v1.Contact> getCreateContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateContact",
      requestType = com.viewuz.contact.v1.CreateContactRequest.class,
      responseType = com.viewuz.contact.v1.Contact.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.contact.v1.CreateContactRequest,
      com.viewuz.contact.v1.Contact> getCreateContactMethod() {
    io.grpc.MethodDescriptor<com.viewuz.contact.v1.CreateContactRequest, com.viewuz.contact.v1.Contact> getCreateContactMethod;
    if ((getCreateContactMethod = ContactServiceGrpc.getCreateContactMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getCreateContactMethod = ContactServiceGrpc.getCreateContactMethod) == null) {
          ContactServiceGrpc.getCreateContactMethod = getCreateContactMethod =
              io.grpc.MethodDescriptor.<com.viewuz.contact.v1.CreateContactRequest, com.viewuz.contact.v1.Contact>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.contact.v1.CreateContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.contact.v1.Contact.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("CreateContact"))
              .build();
        }
      }
    }
    return getCreateContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viewuz.contact.v1.BatchCreateContactsRequest,
      com.viewuz.contact.v1.BatchCreateContactsResponse> getBatchCreateContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchCreateContacts",
      requestType = com.viewuz.contact.v1.BatchCreateContactsRequest.class,
      responseType = com.viewuz.contact.v1.BatchCreateContactsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.contact.v1.BatchCreateContactsRequest,
      com.viewuz.contact.v1.BatchCreateContactsResponse> getBatchCreateContactsMethod() {
    io.grpc.MethodDescriptor<com.viewuz.contact.v1.BatchCreateContactsRequest, com.viewuz.contact.v1.BatchCreateContactsResponse> getBatchCreateContactsMethod;
    if ((getBatchCreateContactsMethod = ContactServiceGrpc.getBatchCreateContactsMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getBatchCreateContactsMethod = ContactServiceGrpc.getBatchCreateContactsMethod) == null) {
          ContactServiceGrpc.getBatchCreateContactsMethod = getBatchCreateContactsMethod =
              io.grpc.MethodDescriptor.<com.viewuz.contact.v1.BatchCreateContactsRequest, com.viewuz.contact.v1.BatchCreateContactsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchCreateContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.contact.v1.BatchCreateContactsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.contact.v1.BatchCreateContactsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("BatchCreateContacts"))
              .build();
        }
      }
    }
    return getBatchCreateContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.viewuz.contact.v1.ListContactsRequest,
      com.viewuz.contact.v1.ListContactsResponse> getListContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContacts",
      requestType = com.viewuz.contact.v1.ListContactsRequest.class,
      responseType = com.viewuz.contact.v1.ListContactsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.viewuz.contact.v1.ListContactsRequest,
      com.viewuz.contact.v1.ListContactsResponse> getListContactsMethod() {
    io.grpc.MethodDescriptor<com.viewuz.contact.v1.ListContactsRequest, com.viewuz.contact.v1.ListContactsResponse> getListContactsMethod;
    if ((getListContactsMethod = ContactServiceGrpc.getListContactsMethod) == null) {
      synchronized (ContactServiceGrpc.class) {
        if ((getListContactsMethod = ContactServiceGrpc.getListContactsMethod) == null) {
          ContactServiceGrpc.getListContactsMethod = getListContactsMethod =
              io.grpc.MethodDescriptor.<com.viewuz.contact.v1.ListContactsRequest, com.viewuz.contact.v1.ListContactsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.contact.v1.ListContactsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.viewuz.contact.v1.ListContactsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactServiceMethodDescriptorSupplier("ListContacts"))
              .build();
        }
      }
    }
    return getListContactsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContactServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactServiceStub>() {
        @java.lang.Override
        public ContactServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactServiceStub(channel, callOptions);
        }
      };
    return ContactServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContactServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactServiceBlockingStub>() {
        @java.lang.Override
        public ContactServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactServiceBlockingStub(channel, callOptions);
        }
      };
    return ContactServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContactServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactServiceFutureStub>() {
        @java.lang.Override
        public ContactServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactServiceFutureStub(channel, callOptions);
        }
      };
    return ContactServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create the contact for the user
     * </pre>
     */
    default void createContact(com.viewuz.contact.v1.CreateContactRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.contact.v1.Contact> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch create contact for the user
     * it's working as snyc local contacts
     * </pre>
     */
    default void batchCreateContacts(com.viewuz.contact.v1.BatchCreateContactsRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.contact.v1.BatchCreateContactsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchCreateContactsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all contacts for the user
     * </pre>
     */
    default void listContacts(com.viewuz.contact.v1.ListContactsRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.contact.v1.ListContactsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListContactsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContactService.
   */
  public static abstract class ContactServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContactServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContactService.
   */
  public static final class ContactServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ContactServiceStub> {
    private ContactServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create the contact for the user
     * </pre>
     */
    public void createContact(com.viewuz.contact.v1.CreateContactRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.contact.v1.Contact> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch create contact for the user
     * it's working as snyc local contacts
     * </pre>
     */
    public void batchCreateContacts(com.viewuz.contact.v1.BatchCreateContactsRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.contact.v1.BatchCreateContactsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchCreateContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all contacts for the user
     * </pre>
     */
    public void listContacts(com.viewuz.contact.v1.ListContactsRequest request,
        io.grpc.stub.StreamObserver<com.viewuz.contact.v1.ListContactsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListContactsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContactService.
   */
  public static final class ContactServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContactServiceBlockingStub> {
    private ContactServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create the contact for the user
     * </pre>
     */
    public com.viewuz.contact.v1.Contact createContact(com.viewuz.contact.v1.CreateContactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch create contact for the user
     * it's working as snyc local contacts
     * </pre>
     */
    public com.viewuz.contact.v1.BatchCreateContactsResponse batchCreateContacts(com.viewuz.contact.v1.BatchCreateContactsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchCreateContactsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all contacts for the user
     * </pre>
     */
    public com.viewuz.contact.v1.ListContactsResponse listContacts(com.viewuz.contact.v1.ListContactsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListContactsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContactService.
   */
  public static final class ContactServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContactServiceFutureStub> {
    private ContactServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create the contact for the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.contact.v1.Contact> createContact(
        com.viewuz.contact.v1.CreateContactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch create contact for the user
     * it's working as snyc local contacts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.contact.v1.BatchCreateContactsResponse> batchCreateContacts(
        com.viewuz.contact.v1.BatchCreateContactsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchCreateContactsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all contacts for the user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.viewuz.contact.v1.ListContactsResponse> listContacts(
        com.viewuz.contact.v1.ListContactsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListContactsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CONTACT = 0;
  private static final int METHODID_BATCH_CREATE_CONTACTS = 1;
  private static final int METHODID_LIST_CONTACTS = 2;

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
        case METHODID_CREATE_CONTACT:
          serviceImpl.createContact((com.viewuz.contact.v1.CreateContactRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.contact.v1.Contact>) responseObserver);
          break;
        case METHODID_BATCH_CREATE_CONTACTS:
          serviceImpl.batchCreateContacts((com.viewuz.contact.v1.BatchCreateContactsRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.contact.v1.BatchCreateContactsResponse>) responseObserver);
          break;
        case METHODID_LIST_CONTACTS:
          serviceImpl.listContacts((com.viewuz.contact.v1.ListContactsRequest) request,
              (io.grpc.stub.StreamObserver<com.viewuz.contact.v1.ListContactsResponse>) responseObserver);
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
          getCreateContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.contact.v1.CreateContactRequest,
              com.viewuz.contact.v1.Contact>(
                service, METHODID_CREATE_CONTACT)))
        .addMethod(
          getBatchCreateContactsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.contact.v1.BatchCreateContactsRequest,
              com.viewuz.contact.v1.BatchCreateContactsResponse>(
                service, METHODID_BATCH_CREATE_CONTACTS)))
        .addMethod(
          getListContactsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.viewuz.contact.v1.ListContactsRequest,
              com.viewuz.contact.v1.ListContactsResponse>(
                service, METHODID_LIST_CONTACTS)))
        .build();
  }

  private static abstract class ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContactServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.viewuz.contact.v1.ContactServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContactService");
    }
  }

  private static final class ContactServiceFileDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier {
    ContactServiceFileDescriptorSupplier() {}
  }

  private static final class ContactServiceMethodDescriptorSupplier
      extends ContactServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContactServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContactServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContactServiceFileDescriptorSupplier())
              .addMethod(getCreateContactMethod())
              .addMethod(getBatchCreateContactsMethod())
              .addMethod(getListContactsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
