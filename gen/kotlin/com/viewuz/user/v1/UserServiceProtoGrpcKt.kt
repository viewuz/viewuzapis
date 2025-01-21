package com.viewuz.user.v1

import com.google.protobuf.Empty
import com.viewuz.user.v1.UserSerivceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for viewuz.user.v1.UserSerivce.
 */
public object UserSerivceGrpcKt {
  public const val SERVICE_NAME: String = UserSerivceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getUserMethod: MethodDescriptor<GetUserRequest, User>
    @JvmStatic
    get() = UserSerivceGrpc.getGetUserMethod()

  public val updateUserMethod: MethodDescriptor<UpdateUserRequest, User>
    @JvmStatic
    get() = UserSerivceGrpc.getUpdateUserMethod()

  public val uploadProfileImageMethod:
      MethodDescriptor<UploadProfileImageRequest, UploadProfileImageResponse>
    @JvmStatic
    get() = UserSerivceGrpc.getUploadProfileImageMethod()

  public val verifyPhoneNumberMethod: MethodDescriptor<VerifyPhoneNumberRequest, Empty>
    @JvmStatic
    get() = UserSerivceGrpc.getVerifyPhoneNumberMethod()

  /**
   * A stub for issuing RPCs to a(n) viewuz.user.v1.UserSerivce service as suspending coroutines.
   */
  @StubFor(UserSerivceGrpc::class)
  public class UserSerivceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UserSerivceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UserSerivceCoroutineStub =
        UserSerivceCoroutineStub(channel, callOptions)

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
    public suspend fun getUser(request: GetUserRequest, headers: Metadata = Metadata()): User =
        unaryRpc(
      channel,
      UserSerivceGrpc.getGetUserMethod(),
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
    public suspend fun updateUser(request: UpdateUserRequest, headers: Metadata = Metadata()): User
        = unaryRpc(
      channel,
      UserSerivceGrpc.getUpdateUserMethod(),
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
    public suspend fun uploadProfileImage(request: UploadProfileImageRequest, headers: Metadata =
        Metadata()): UploadProfileImageResponse = unaryRpc(
      channel,
      UserSerivceGrpc.getUploadProfileImageMethod(),
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
    public suspend fun verifyPhoneNumber(request: VerifyPhoneNumberRequest, headers: Metadata =
        Metadata()): Empty = unaryRpc(
      channel,
      UserSerivceGrpc.getVerifyPhoneNumberMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the viewuz.user.v1.UserSerivce service based on Kotlin coroutines.
   */
  public abstract class UserSerivceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for viewuz.user.v1.UserSerivce.GetUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUser(request: GetUserRequest): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.user.v1.UserSerivce.GetUser is unimplemented"))

    /**
     * Returns the response to an RPC for viewuz.user.v1.UserSerivce.UpdateUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateUser(request: UpdateUserRequest): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.user.v1.UserSerivce.UpdateUser is unimplemented"))

    /**
     * Returns the response to an RPC for viewuz.user.v1.UserSerivce.UploadProfileImage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadProfileImage(request: UploadProfileImageRequest):
        UploadProfileImageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.user.v1.UserSerivce.UploadProfileImage is unimplemented"))

    /**
     * Returns the response to an RPC for viewuz.user.v1.UserSerivce.VerifyPhoneNumber.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun verifyPhoneNumber(request: VerifyPhoneNumberRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.user.v1.UserSerivce.VerifyPhoneNumber is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserSerivceGrpc.getGetUserMethod(),
      implementation = ::getUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserSerivceGrpc.getUpdateUserMethod(),
      implementation = ::updateUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserSerivceGrpc.getUploadProfileImageMethod(),
      implementation = ::uploadProfileImage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UserSerivceGrpc.getVerifyPhoneNumberMethod(),
      implementation = ::verifyPhoneNumber
    )).build()
  }
}
