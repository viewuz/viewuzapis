// Code generated by protoc-gen-ts_proto. DO NOT EDIT.
// versions:
//   protoc-gen-ts_proto  v2.3.0
//   protoc               unknown
// source: viewuz/user/v1/user_service.proto

/* eslint-disable */
import { type Empty } from "../../../google/protobuf/empty";
import { type User } from "./user";

export interface GetUserRequest {
  /** The name of the user to get */
  name: string;
}

export interface UpdateUserRequest {
  /**
   * The user to update.
   * The user's `name` field is used to identify the user to update.
   */
  user:
    | User
    | undefined;
  /** The list of fields to update. */
  updateMask: string[] | undefined;
}

export interface UploadProfileImageRequest {
  /** The name of the user to upload profile image */
  user: string;
}

export interface UploadProfileImageResponse {
  /** The signed url to upload the profile image with PUT */
  signedUrl: string;
}

export interface VerifyPhoneNumberRequest {
  /** The name of the user to verify phone number */
  user: string;
  /** The phone number to update and verify in E164 format */
  phoneNumber: string;
  /** you can get viewuz.auth.*.SendVerificationCode method */
  sessionInfo: string;
  /** The user-entered verification code from an SMS sent to the user's phone. */
  code: string;
}

export interface UserSerivce {
  /** Get the user */
  getUser(request: GetUserRequest): Promise<User>;
  /** Update the user */
  updateUser(request: UpdateUserRequest): Promise<User>;
  /**
   * Update the user profile_image_url and get uploadeable signed url
   * must upload to real image to the signed url
   */
  uploadProfileImage(request: UploadProfileImageRequest): Promise<UploadProfileImageResponse>;
  /** Update the user phone_number */
  verifyPhoneNumber(request: VerifyPhoneNumberRequest): Promise<Empty>;
}
