package com.viewuz.auth.v1

import com.viewuz.auth.v1.AuthServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for viewuz.auth.v1.AuthService.
 */
public object AuthServiceGrpcKt {
  public const val SERVICE_NAME: String = AuthServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val signInMethod: MethodDescriptor<SignInRequest, TokenResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getSignInMethod()

  public val signUpMethod: MethodDescriptor<SignUpRequest, TokenResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getSignUpMethod()

  public val sendVerificationCodeMethod:
      MethodDescriptor<SendVerificationCodeRequest, SendVerificationCodeResponse>
    @JvmStatic
    get() = AuthServiceGrpc.getSendVerificationCodeMethod()

  /**
   * A stub for issuing RPCs to a(n) viewuz.auth.v1.AuthService service as suspending coroutines.
   */
  @StubFor(AuthServiceGrpc::class)
  public class AuthServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AuthServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AuthServiceCoroutineStub =
        AuthServiceCoroutineStub(channel, callOptions)

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
    public suspend fun signIn(request: SignInRequest, headers: Metadata = Metadata()): TokenResponse
        = unaryRpc(
      channel,
      AuthServiceGrpc.getSignInMethod(),
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
    public suspend fun signUp(request: SignUpRequest, headers: Metadata = Metadata()): TokenResponse
        = unaryRpc(
      channel,
      AuthServiceGrpc.getSignUpMethod(),
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
    public suspend fun sendVerificationCode(request: SendVerificationCodeRequest, headers: Metadata
        = Metadata()): SendVerificationCodeResponse = unaryRpc(
      channel,
      AuthServiceGrpc.getSendVerificationCodeMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the viewuz.auth.v1.AuthService service based on Kotlin coroutines.
   */
  public abstract class AuthServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for viewuz.auth.v1.AuthService.SignIn.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun signIn(request: SignInRequest): TokenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.auth.v1.AuthService.SignIn is unimplemented"))

    /**
     * Returns the response to an RPC for viewuz.auth.v1.AuthService.SignUp.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun signUp(request: SignUpRequest): TokenResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.auth.v1.AuthService.SignUp is unimplemented"))

    /**
     * Returns the response to an RPC for viewuz.auth.v1.AuthService.SendVerificationCode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendVerificationCode(request: SendVerificationCodeRequest):
        SendVerificationCodeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method viewuz.auth.v1.AuthService.SendVerificationCode is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getSignInMethod(),
      implementation = ::signIn
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getSignUpMethod(),
      implementation = ::signUp
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AuthServiceGrpc.getSendVerificationCodeMethod(),
      implementation = ::sendVerificationCode
    )).build()
  }
}
