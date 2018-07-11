// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface ListKeyRingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.ListKeyRingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the location associated with the
   * [KeyRings][google.cloud.kms.v1.KeyRing], in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the location associated with the
   * [KeyRings][google.cloud.kms.v1.KeyRing], in the format `projects/&#42;&#47;locations/&#42;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Optional limit on the number of [KeyRings][google.cloud.kms.v1.KeyRing] to include in the
   * response.  Further [KeyRings][google.cloud.kms.v1.KeyRing] can subsequently be obtained by
   * including the [ListKeyRingsResponse.next_page_token][google.cloud.kms.v1.ListKeyRingsResponse.next_page_token] in a subsequent
   * request.  If unspecified, the server will pick an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * Optional pagination token, returned earlier via
   * [ListKeyRingsResponse.next_page_token][google.cloud.kms.v1.ListKeyRingsResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional pagination token, returned earlier via
   * [ListKeyRingsResponse.next_page_token][google.cloud.kms.v1.ListKeyRingsResponse.next_page_token].
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
