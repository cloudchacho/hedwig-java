// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hedwig/protobuf/options.proto

package io.github.cloudchacho.hedwig;

public final class Options {
  private Options() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(io.github.cloudchacho.hedwig.Options.messageOptions);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MessageOptionsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hedwig.MessageOptions)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * major version for this message type. this is required
     * </pre>
     *
     * <code>optional uint32 major_version = 1;</code>
     * @return Whether the majorVersion field is set.
     */
    boolean hasMajorVersion();
    /**
     * <pre>
     * major version for this message type. this is required
     * </pre>
     *
     * <code>optional uint32 major_version = 1;</code>
     * @return The majorVersion.
     */
    int getMajorVersion();

    /**
     * <pre>
     * minor version for this message type. this is optional since 0 is a valid minor version
     * </pre>
     *
     * <code>optional uint32 minor_version = 2;</code>
     * @return Whether the minorVersion field is set.
     */
    boolean hasMinorVersion();
    /**
     * <pre>
     * minor version for this message type. this is optional since 0 is a valid minor version
     * </pre>
     *
     * <code>optional uint32 minor_version = 2;</code>
     * @return The minorVersion.
     */
    int getMinorVersion();

    /**
     * <pre>
     * message type explicit declaration. this is optional and will be automatically
     * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     * @return Whether the messageType field is set.
     */
    boolean hasMessageType();
    /**
     * <pre>
     * message type explicit declaration. this is optional and will be automatically
     * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     * @return The messageType.
     */
    java.lang.String getMessageType();
    /**
     * <pre>
     * message type explicit declaration. this is optional and will be automatically
     * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     * @return The bytes for messageType.
     */
    com.google.protobuf.ByteString
        getMessageTypeBytes();
  }
  /**
   * Protobuf type {@code hedwig.MessageOptions}
   */
  public static final class MessageOptions extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hedwig.MessageOptions)
      MessageOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MessageOptions.newBuilder() to construct.
    private MessageOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MessageOptions() {
      messageType_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MessageOptions();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MessageOptions(
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
            case 8: {
              bitField0_ |= 0x00000001;
              majorVersion_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              minorVersion_ = input.readUInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              messageType_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
      return io.github.cloudchacho.hedwig.Options.internal_static_hedwig_MessageOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.cloudchacho.hedwig.Options.internal_static_hedwig_MessageOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.cloudchacho.hedwig.Options.MessageOptions.class, io.github.cloudchacho.hedwig.Options.MessageOptions.Builder.class);
    }

    private int bitField0_;
    public static final int MAJOR_VERSION_FIELD_NUMBER = 1;
    private int majorVersion_;
    /**
     * <pre>
     * major version for this message type. this is required
     * </pre>
     *
     * <code>optional uint32 major_version = 1;</code>
     * @return Whether the majorVersion field is set.
     */
    @java.lang.Override
    public boolean hasMajorVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * major version for this message type. this is required
     * </pre>
     *
     * <code>optional uint32 major_version = 1;</code>
     * @return The majorVersion.
     */
    @java.lang.Override
    public int getMajorVersion() {
      return majorVersion_;
    }

    public static final int MINOR_VERSION_FIELD_NUMBER = 2;
    private int minorVersion_;
    /**
     * <pre>
     * minor version for this message type. this is optional since 0 is a valid minor version
     * </pre>
     *
     * <code>optional uint32 minor_version = 2;</code>
     * @return Whether the minorVersion field is set.
     */
    @java.lang.Override
    public boolean hasMinorVersion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * minor version for this message type. this is optional since 0 is a valid minor version
     * </pre>
     *
     * <code>optional uint32 minor_version = 2;</code>
     * @return The minorVersion.
     */
    @java.lang.Override
    public int getMinorVersion() {
      return minorVersion_;
    }

    public static final int MESSAGE_TYPE_FIELD_NUMBER = 3;
    private volatile java.lang.Object messageType_;
    /**
     * <pre>
     * message type explicit declaration. this is optional and will be automatically
     * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     * @return Whether the messageType field is set.
     */
    @java.lang.Override
    public boolean hasMessageType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * message type explicit declaration. this is optional and will be automatically
     * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     * @return The messageType.
     */
    @java.lang.Override
    public java.lang.String getMessageType() {
      java.lang.Object ref = messageType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          messageType_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * message type explicit declaration. this is optional and will be automatically
     * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     * @return The bytes for messageType.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMessageTypeBytes() {
      java.lang.Object ref = messageType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, majorVersion_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, minorVersion_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messageType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, majorVersion_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, minorVersion_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, messageType_);
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
      if (!(obj instanceof io.github.cloudchacho.hedwig.Options.MessageOptions)) {
        return super.equals(obj);
      }
      io.github.cloudchacho.hedwig.Options.MessageOptions other = (io.github.cloudchacho.hedwig.Options.MessageOptions) obj;

      if (hasMajorVersion() != other.hasMajorVersion()) return false;
      if (hasMajorVersion()) {
        if (getMajorVersion()
            != other.getMajorVersion()) return false;
      }
      if (hasMinorVersion() != other.hasMinorVersion()) return false;
      if (hasMinorVersion()) {
        if (getMinorVersion()
            != other.getMinorVersion()) return false;
      }
      if (hasMessageType() != other.hasMessageType()) return false;
      if (hasMessageType()) {
        if (!getMessageType()
            .equals(other.getMessageType())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMajorVersion()) {
        hash = (37 * hash) + MAJOR_VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getMajorVersion();
      }
      if (hasMinorVersion()) {
        hash = (37 * hash) + MINOR_VERSION_FIELD_NUMBER;
        hash = (53 * hash) + getMinorVersion();
      }
      if (hasMessageType()) {
        hash = (37 * hash) + MESSAGE_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getMessageType().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.github.cloudchacho.hedwig.Options.MessageOptions parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.github.cloudchacho.hedwig.Options.MessageOptions prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code hedwig.MessageOptions}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hedwig.MessageOptions)
        io.github.cloudchacho.hedwig.Options.MessageOptionsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.github.cloudchacho.hedwig.Options.internal_static_hedwig_MessageOptions_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.github.cloudchacho.hedwig.Options.internal_static_hedwig_MessageOptions_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.github.cloudchacho.hedwig.Options.MessageOptions.class, io.github.cloudchacho.hedwig.Options.MessageOptions.Builder.class);
      }

      // Construct using io.github.cloudchacho.hedwig.Options.MessageOptions.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        majorVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        minorVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        messageType_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.github.cloudchacho.hedwig.Options.internal_static_hedwig_MessageOptions_descriptor;
      }

      @java.lang.Override
      public io.github.cloudchacho.hedwig.Options.MessageOptions getDefaultInstanceForType() {
        return io.github.cloudchacho.hedwig.Options.MessageOptions.getDefaultInstance();
      }

      @java.lang.Override
      public io.github.cloudchacho.hedwig.Options.MessageOptions build() {
        io.github.cloudchacho.hedwig.Options.MessageOptions result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.github.cloudchacho.hedwig.Options.MessageOptions buildPartial() {
        io.github.cloudchacho.hedwig.Options.MessageOptions result = new io.github.cloudchacho.hedwig.Options.MessageOptions(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.majorVersion_ = majorVersion_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.minorVersion_ = minorVersion_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.messageType_ = messageType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.github.cloudchacho.hedwig.Options.MessageOptions) {
          return mergeFrom((io.github.cloudchacho.hedwig.Options.MessageOptions)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.github.cloudchacho.hedwig.Options.MessageOptions other) {
        if (other == io.github.cloudchacho.hedwig.Options.MessageOptions.getDefaultInstance()) return this;
        if (other.hasMajorVersion()) {
          setMajorVersion(other.getMajorVersion());
        }
        if (other.hasMinorVersion()) {
          setMinorVersion(other.getMinorVersion());
        }
        if (other.hasMessageType()) {
          bitField0_ |= 0x00000004;
          messageType_ = other.messageType_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.github.cloudchacho.hedwig.Options.MessageOptions parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.github.cloudchacho.hedwig.Options.MessageOptions) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int majorVersion_ ;
      /**
       * <pre>
       * major version for this message type. this is required
       * </pre>
       *
       * <code>optional uint32 major_version = 1;</code>
       * @return Whether the majorVersion field is set.
       */
      @java.lang.Override
      public boolean hasMajorVersion() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * major version for this message type. this is required
       * </pre>
       *
       * <code>optional uint32 major_version = 1;</code>
       * @return The majorVersion.
       */
      @java.lang.Override
      public int getMajorVersion() {
        return majorVersion_;
      }
      /**
       * <pre>
       * major version for this message type. this is required
       * </pre>
       *
       * <code>optional uint32 major_version = 1;</code>
       * @param value The majorVersion to set.
       * @return This builder for chaining.
       */
      public Builder setMajorVersion(int value) {
        bitField0_ |= 0x00000001;
        majorVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * major version for this message type. this is required
       * </pre>
       *
       * <code>optional uint32 major_version = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMajorVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        majorVersion_ = 0;
        onChanged();
        return this;
      }

      private int minorVersion_ ;
      /**
       * <pre>
       * minor version for this message type. this is optional since 0 is a valid minor version
       * </pre>
       *
       * <code>optional uint32 minor_version = 2;</code>
       * @return Whether the minorVersion field is set.
       */
      @java.lang.Override
      public boolean hasMinorVersion() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * minor version for this message type. this is optional since 0 is a valid minor version
       * </pre>
       *
       * <code>optional uint32 minor_version = 2;</code>
       * @return The minorVersion.
       */
      @java.lang.Override
      public int getMinorVersion() {
        return minorVersion_;
      }
      /**
       * <pre>
       * minor version for this message type. this is optional since 0 is a valid minor version
       * </pre>
       *
       * <code>optional uint32 minor_version = 2;</code>
       * @param value The minorVersion to set.
       * @return This builder for chaining.
       */
      public Builder setMinorVersion(int value) {
        bitField0_ |= 0x00000002;
        minorVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * minor version for this message type. this is optional since 0 is a valid minor version
       * </pre>
       *
       * <code>optional uint32 minor_version = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinorVersion() {
        bitField0_ = (bitField0_ & ~0x00000002);
        minorVersion_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object messageType_ = "";
      /**
       * <pre>
       * message type explicit declaration. this is optional and will be automatically
       * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
       * </pre>
       *
       * <code>optional string message_type = 3;</code>
       * @return Whether the messageType field is set.
       */
      public boolean hasMessageType() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * message type explicit declaration. this is optional and will be automatically
       * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
       * </pre>
       *
       * <code>optional string message_type = 3;</code>
       * @return The messageType.
       */
      public java.lang.String getMessageType() {
        java.lang.Object ref = messageType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            messageType_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * message type explicit declaration. this is optional and will be automatically
       * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
       * </pre>
       *
       * <code>optional string message_type = 3;</code>
       * @return The bytes for messageType.
       */
      public com.google.protobuf.ByteString
          getMessageTypeBytes() {
        java.lang.Object ref = messageType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          messageType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * message type explicit declaration. this is optional and will be automatically
       * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
       * </pre>
       *
       * <code>optional string message_type = 3;</code>
       * @param value The messageType to set.
       * @return This builder for chaining.
       */
      public Builder setMessageType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        messageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * message type explicit declaration. this is optional and will be automatically
       * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
       * </pre>
       *
       * <code>optional string message_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessageType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        messageType_ = getDefaultInstance().getMessageType();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * message type explicit declaration. this is optional and will be automatically
       * inferred from message name assuming this format: `&lt;MessageType&gt;V&lt;MajorVersion&gt;`.
       * </pre>
       *
       * <code>optional string message_type = 3;</code>
       * @param value The bytes for messageType to set.
       * @return This builder for chaining.
       */
      public Builder setMessageTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        messageType_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hedwig.MessageOptions)
    }

    // @@protoc_insertion_point(class_scope:hedwig.MessageOptions)
    private static final io.github.cloudchacho.hedwig.Options.MessageOptions DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.github.cloudchacho.hedwig.Options.MessageOptions();
    }

    public static io.github.cloudchacho.hedwig.Options.MessageOptions getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MessageOptions>
        PARSER = new com.google.protobuf.AbstractParser<MessageOptions>() {
      @java.lang.Override
      public MessageOptions parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageOptions(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MessageOptions> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MessageOptions> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.github.cloudchacho.hedwig.Options.MessageOptions getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int MESSAGE_OPTIONS_FIELD_NUMBER = 51235;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      io.github.cloudchacho.hedwig.Options.MessageOptions> messageOptions = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        io.github.cloudchacho.hedwig.Options.MessageOptions.class,
        io.github.cloudchacho.hedwig.Options.MessageOptions.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hedwig_MessageOptions_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hedwig_MessageOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035hedwig/protobuf/options.proto\022\006hedwig\032" +
      " google/protobuf/descriptor.proto\"T\n\016Mes" +
      "sageOptions\022\025\n\rmajor_version\030\001 \001(\r\022\025\n\rmi" +
      "nor_version\030\002 \001(\r\022\024\n\014message_type\030\003 \001(\t:" +
      "R\n\017message_options\022\037.google.protobuf.Mes" +
      "sageOptions\030\243\220\003 \001(\0132\026.hedwig.MessageOpti" +
      "onsBI\n\034io.github.cloudchacho.hedwigZ)git" +
      "hub.com/cloudchacho/hedwig-go/protobuf"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_hedwig_MessageOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hedwig_MessageOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hedwig_MessageOptions_descriptor,
        new java.lang.String[] { "MajorVersion", "MinorVersion", "MessageType", });
    messageOptions.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
