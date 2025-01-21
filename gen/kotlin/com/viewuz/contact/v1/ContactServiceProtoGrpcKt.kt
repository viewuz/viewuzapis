package com.viewuz.contact.v1

import com.viewuz.contact.v1.ContactServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for viewuz.contact.v1.ContactService.
 */
public object ContactServiceGrpcKt {
  public const val SERVICE_NAME: String = ContactServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createContactMethod: MethodDescriptor<CreateContactRequest, Contact>
    @JvmStatic
    get() = ContactServiceGrpc.getCreateContactMethod()

  public val batchCreateContactsMethod:
      MethodDescriptor<BatchCreateContactsRequest, BatchCreateContactsResponse>
    @JvmStatic
    get() = ContactServiceGrpc.getBatchCreateContactsMethod()

  public val listContactsMethod: MethodDescriptor<ListContactsRequest, ListContactsResponse>
    @JvmStatic
    get() = ContactServiceGrpc.getListContactsMethod()

  /**
   * A stub for issuing RPCs to a(n) viewuz.contact.v1.ContactService service as suspending
   * coroutines.
   */
  @StubFor(ContactServiceGrpc::class)
  public class ContactServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ContactServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ContactServiceCoroutineStub =
        ContactServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createContact(request: CreateContactRequest, headers: Metadata = Metadata()):
        Contact = unaryRpc(
      channel,
      ContactServiceGrpc.getCreateContactMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun batchCreateContacts(request: BatchCreateContactsRequest, headers: Metadata =
        Metadata()): BatchCreateContactsResponse = unaryRpc(
      channel,
      ContactServiceGrpc.getBatchCreateContactsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listContacts(request: ListContactsRequest, headers: Metadata = Metadata()):
        ListContactsResponse = unaryRpc(
      channel,
      ContactServiceGrpc.getListContactsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the viewuz.contact.v1.ContactService service based on Kotlin
   * coroutines.
   */
  public abstract class ContactServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for viewuz.contact.v1.ContactService.CreateContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createContact(request: CreateContactRequest): Contact = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.contact.v1.ContactService.CreateContact is unimplemented"))

    /**
     * Returns the response to an RPC for viewuz.contact.v1.ContactService.BatchCreateContacts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun batchCreateContacts(request: BatchCreateContactsRequest):
        BatchCreateContactsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.contact.v1.ContactService.BatchCreateContacts is unimplemented"))

    /**
     * Returns the response to an RPC for viewuz.contact.v1.ContactService.ListContacts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listContacts(request: ListContactsRequest): ListContactsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.contact.v1.ContactService.ListContacts is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ContactServiceGrpc.getCreateContactMethod(),
      implementation = ::createContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ContactServiceGrpc.getBatchCreateContactsMethod(),
      implementation = ::batchCreateContacts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ContactServiceGrpc.getListContactsMethod(),
      implementation = ::listContacts
    )).build()
  }
}
