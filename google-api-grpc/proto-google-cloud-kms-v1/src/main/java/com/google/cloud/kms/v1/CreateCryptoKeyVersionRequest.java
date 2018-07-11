// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

/**
 * <pre>
 * Request message for [KeyManagementService.CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion].
 * </pre>
 *
 * Protobuf type {@code google.cloud.kms.v1.CreateCryptoKeyVersionRequest}
 */
public  final class CreateCryptoKeyVersionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.kms.v1.CreateCryptoKeyVersionRequest)
    CreateCryptoKeyVersionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCryptoKeyVersionRequest.newBuilder() to construct.
  private CreateCryptoKeyVersionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCryptoKeyVersionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateCryptoKeyVersionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.cloud.kms.v1.CryptoKeyVersion.Builder subBuilder = null;
            if (cryptoKeyVersion_ != null) {
              subBuilder = cryptoKeyVersion_.toBuilder();
            }
            cryptoKeyVersion_ = input.readMessage(com.google.cloud.kms.v1.CryptoKeyVersion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cryptoKeyVersion_);
              cryptoKeyVersion_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_CreateCryptoKeyVersionRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_CreateCryptoKeyVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest.class, com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
   * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
   * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRYPTO_KEY_VERSION_FIELD_NUMBER = 2;
  private com.google.cloud.kms.v1.CryptoKeyVersion cryptoKeyVersion_;
  /**
   * <pre>
   * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
   */
  public boolean hasCryptoKeyVersion() {
    return cryptoKeyVersion_ != null;
  }
  /**
   * <pre>
   * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
   */
  public com.google.cloud.kms.v1.CryptoKeyVersion getCryptoKeyVersion() {
    return cryptoKeyVersion_ == null ? com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance() : cryptoKeyVersion_;
  }
  /**
   * <pre>
   * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
   * </pre>
   *
   * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
   */
  public com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder getCryptoKeyVersionOrBuilder() {
    return getCryptoKeyVersion();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (cryptoKeyVersion_ != null) {
      output.writeMessage(2, getCryptoKeyVersion());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (cryptoKeyVersion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCryptoKeyVersion());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest other = (com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasCryptoKeyVersion() == other.hasCryptoKeyVersion());
    if (hasCryptoKeyVersion()) {
      result = result && getCryptoKeyVersion()
          .equals(other.getCryptoKeyVersion());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasCryptoKeyVersion()) {
      hash = (37 * hash) + CRYPTO_KEY_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getCryptoKeyVersion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Request message for [KeyManagementService.CreateCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.CreateCryptoKeyVersion].
   * </pre>
   *
   * Protobuf type {@code google.cloud.kms.v1.CreateCryptoKeyVersionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.kms.v1.CreateCryptoKeyVersionRequest)
      com.google.cloud.kms.v1.CreateCryptoKeyVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_CreateCryptoKeyVersionRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_CreateCryptoKeyVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest.class, com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (cryptoKeyVersionBuilder_ == null) {
        cryptoKeyVersion_ = null;
      } else {
        cryptoKeyVersion_ = null;
        cryptoKeyVersionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.kms.v1.KmsProto.internal_static_google_cloud_kms_v1_CreateCryptoKeyVersionRequest_descriptor;
    }

    public com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest getDefaultInstanceForType() {
      return com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest.getDefaultInstance();
    }

    public com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest build() {
      com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest buildPartial() {
      com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest result = new com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest(this);
      result.parent_ = parent_;
      if (cryptoKeyVersionBuilder_ == null) {
        result.cryptoKeyVersion_ = cryptoKeyVersion_;
      } else {
        result.cryptoKeyVersion_ = cryptoKeyVersionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest) {
        return mergeFrom((com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest other) {
      if (other == com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasCryptoKeyVersion()) {
        mergeCryptoKeyVersion(other.getCryptoKeyVersion());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
     * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
     * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
     * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
     * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
     * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.kms.v1.CryptoKeyVersion cryptoKeyVersion_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.kms.v1.CryptoKeyVersion, com.google.cloud.kms.v1.CryptoKeyVersion.Builder, com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder> cryptoKeyVersionBuilder_;
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    public boolean hasCryptoKeyVersion() {
      return cryptoKeyVersionBuilder_ != null || cryptoKeyVersion_ != null;
    }
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    public com.google.cloud.kms.v1.CryptoKeyVersion getCryptoKeyVersion() {
      if (cryptoKeyVersionBuilder_ == null) {
        return cryptoKeyVersion_ == null ? com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance() : cryptoKeyVersion_;
      } else {
        return cryptoKeyVersionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    public Builder setCryptoKeyVersion(com.google.cloud.kms.v1.CryptoKeyVersion value) {
      if (cryptoKeyVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cryptoKeyVersion_ = value;
        onChanged();
      } else {
        cryptoKeyVersionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    public Builder setCryptoKeyVersion(
        com.google.cloud.kms.v1.CryptoKeyVersion.Builder builderForValue) {
      if (cryptoKeyVersionBuilder_ == null) {
        cryptoKeyVersion_ = builderForValue.build();
        onChanged();
      } else {
        cryptoKeyVersionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    public Builder mergeCryptoKeyVersion(com.google.cloud.kms.v1.CryptoKeyVersion value) {
      if (cryptoKeyVersionBuilder_ == null) {
        if (cryptoKeyVersion_ != null) {
          cryptoKeyVersion_ =
            com.google.cloud.kms.v1.CryptoKeyVersion.newBuilder(cryptoKeyVersion_).mergeFrom(value).buildPartial();
        } else {
          cryptoKeyVersion_ = value;
        }
        onChanged();
      } else {
        cryptoKeyVersionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    public Builder clearCryptoKeyVersion() {
      if (cryptoKeyVersionBuilder_ == null) {
        cryptoKeyVersion_ = null;
        onChanged();
      } else {
        cryptoKeyVersion_ = null;
        cryptoKeyVersionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    public com.google.cloud.kms.v1.CryptoKeyVersion.Builder getCryptoKeyVersionBuilder() {
      
      onChanged();
      return getCryptoKeyVersionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    public com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder getCryptoKeyVersionOrBuilder() {
      if (cryptoKeyVersionBuilder_ != null) {
        return cryptoKeyVersionBuilder_.getMessageOrBuilder();
      } else {
        return cryptoKeyVersion_ == null ?
            com.google.cloud.kms.v1.CryptoKeyVersion.getDefaultInstance() : cryptoKeyVersion_;
      }
    }
    /**
     * <pre>
     * A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
     * </pre>
     *
     * <code>.google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.kms.v1.CryptoKeyVersion, com.google.cloud.kms.v1.CryptoKeyVersion.Builder, com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder> 
        getCryptoKeyVersionFieldBuilder() {
      if (cryptoKeyVersionBuilder_ == null) {
        cryptoKeyVersionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.kms.v1.CryptoKeyVersion, com.google.cloud.kms.v1.CryptoKeyVersion.Builder, com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder>(
                getCryptoKeyVersion(),
                getParentForChildren(),
                isClean());
        cryptoKeyVersion_ = null;
      }
      return cryptoKeyVersionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.kms.v1.CreateCryptoKeyVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.kms.v1.CreateCryptoKeyVersionRequest)
  private static final com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest();
  }

  public static com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCryptoKeyVersionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCryptoKeyVersionRequest>() {
    public CreateCryptoKeyVersionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateCryptoKeyVersionRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateCryptoKeyVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCryptoKeyVersionRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.kms.v1.CreateCryptoKeyVersionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

