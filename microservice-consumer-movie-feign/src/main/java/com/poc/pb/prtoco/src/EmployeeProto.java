package com.poc.pb.prtoco.src;

public final class EmployeeProto {
	  private EmployeeProto() {}
	  public static void registerAllExtensions(
	      com.google.protobuf.ExtensionRegistryLite registry) {
	  }

	  public static void registerAllExtensions(
	      com.google.protobuf.ExtensionRegistry registry) {
	    registerAllExtensions(
	        (com.google.protobuf.ExtensionRegistryLite) registry);
	  }
	  public interface EmployeeOrBuilder extends
	      // @@protoc_insertion_point(interface_extends:com.poc.pb.spring.microservice.proto.Employee)
	      com.google.protobuf.MessageOrBuilder {

	    /**
	     * <code>optional int32 id = 1;</code>
	     */
	    int getId();

	    /**
	     * <code>optional string first_name = 2;</code>
	     */
	    java.lang.String getFirstName();
	    /**
	     * <code>optional string first_name = 2;</code>
	     */
	    com.google.protobuf.ByteString
	        getFirstNameBytes();

	    /**
	     * <code>optional string second_name = 3;</code>
	     */
	    java.lang.String getSecondName();
	    /**
	     * <code>optional string second_name = 3;</code>
	     */
	    com.google.protobuf.ByteString
	        getSecondNameBytes();
	  }
	  /**
	   * Protobuf type {@code com.poc.pb.spring.microservice.proto.Employee}
	   */
	  public  static final class Employee extends
	      com.google.protobuf.GeneratedMessageV3 implements
	      // @@protoc_insertion_point(message_implements:com.poc.pb.spring.microservice.proto.Employee)
	      EmployeeOrBuilder {
	    // Use Employee.newBuilder() to construct.
	    private Employee(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
	      super(builder);
	    }
	    private Employee() {
	      id_ = 0;
	      firstName_ = "";
	      secondName_ = "";
	    }

	    @java.lang.Override
	    public final com.google.protobuf.UnknownFieldSet
	    getUnknownFields() {
	      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
	    }
	    private Employee(
	        com.google.protobuf.CodedInputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      this();
	      int mutable_bitField0_ = 0;
	      try {
	        boolean done = false;
	        while (!done) {
	          int tag = input.readTag();
	          switch (tag) {
	            case 0:
	              done = true;
	              break;
	            default: {
	              if (!input.skipField(tag)) {
	                done = true;
	              }
	              break;
	            }
	            case 8: {

	              id_ = input.readInt32();
	              break;
	            }
	            case 18: {
	              java.lang.String s = input.readStringRequireUtf8();

	              firstName_ = s;
	              break;
	            }
	            case 26: {
	              java.lang.String s = input.readStringRequireUtf8();

	              secondName_ = s;
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
	        makeExtensionsImmutable();
	      }
	    }
	    public static final com.google.protobuf.Descriptors.Descriptor
	        getDescriptor() {
	      return com.poc.pb.prtoco.src.EmployeeProto.internal_static_com_poc_pb_spring_microservice_proto_Employee_descriptor;
	    }

	    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
	        internalGetFieldAccessorTable() {
	      return com.poc.pb.prtoco.src.EmployeeProto.internal_static_com_poc_pb_spring_microservice_proto_Employee_fieldAccessorTable
	          .ensureFieldAccessorsInitialized(
	              com.poc.pb.prtoco.src.EmployeeProto.Employee.class, com.poc.pb.prtoco.src.EmployeeProto.Employee.Builder.class);
	    }

	    public static final int ID_FIELD_NUMBER = 1;
	    private int id_;
	    /**
	     * <code>optional int32 id = 1;</code>
	     */
	    public int getId() {
	      return id_;
	    }

	    public static final int FIRST_NAME_FIELD_NUMBER = 2;
	    private volatile java.lang.Object firstName_;
	    /**
	     * <code>optional string first_name = 2;</code>
	     */
	    public java.lang.String getFirstName() {
	      java.lang.Object ref = firstName_;
	      if (ref instanceof java.lang.String) {
	        return (java.lang.String) ref;
	      } else {
	        com.google.protobuf.ByteString bs = 
	            (com.google.protobuf.ByteString) ref;
	        java.lang.String s = bs.toStringUtf8();
	        firstName_ = s;
	        return s;
	      }
	    }
	    /**
	     * <code>optional string first_name = 2;</code>
	     */
	    public com.google.protobuf.ByteString
	        getFirstNameBytes() {
	      java.lang.Object ref = firstName_;
	      if (ref instanceof java.lang.String) {
	        com.google.protobuf.ByteString b = 
	            com.google.protobuf.ByteString.copyFromUtf8(
	                (java.lang.String) ref);
	        firstName_ = b;
	        return b;
	      } else {
	        return (com.google.protobuf.ByteString) ref;
	      }
	    }

	    public static final int SECOND_NAME_FIELD_NUMBER = 3;
	    private volatile java.lang.Object secondName_;
	    /**
	     * <code>optional string second_name = 3;</code>
	     */
	    public java.lang.String getSecondName() {
	      java.lang.Object ref = secondName_;
	      if (ref instanceof java.lang.String) {
	        return (java.lang.String) ref;
	      } else {
	        com.google.protobuf.ByteString bs = 
	            (com.google.protobuf.ByteString) ref;
	        java.lang.String s = bs.toStringUtf8();
	        secondName_ = s;
	        return s;
	      }
	    }
	    /**
	     * <code>optional string second_name = 3;</code>
	     */
	    public com.google.protobuf.ByteString
	        getSecondNameBytes() {
	      java.lang.Object ref = secondName_;
	      if (ref instanceof java.lang.String) {
	        com.google.protobuf.ByteString b = 
	            com.google.protobuf.ByteString.copyFromUtf8(
	                (java.lang.String) ref);
	        secondName_ = b;
	        return b;
	      } else {
	        return (com.google.protobuf.ByteString) ref;
	      }
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
	      if (id_ != 0) {
	        output.writeInt32(1, id_);
	      }
	      if (!getFirstNameBytes().isEmpty()) {
	        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
	      }
	      if (!getSecondNameBytes().isEmpty()) {
	        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, secondName_);
	      }
	    }

	    public int getSerializedSize() {
	      int size = memoizedSize;
	      if (size != -1) return size;

	      size = 0;
	      if (id_ != 0) {
	        size += com.google.protobuf.CodedOutputStream
	          .computeInt32Size(1, id_);
	      }
	      if (!getFirstNameBytes().isEmpty()) {
	        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
	      }
	      if (!getSecondNameBytes().isEmpty()) {
	        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, secondName_);
	      }
	      memoizedSize = size;
	      return size;
	    }

	    private static final long serialVersionUID = 0L;
	    @java.lang.Override
	    public boolean equals(final java.lang.Object obj) {
	      if (obj == this) {
	       return true;
	      }
	      if (!(obj instanceof com.poc.pb.prtoco.src.EmployeeProto.Employee)) {
	        return super.equals(obj);
	      }
	      com.poc.pb.prtoco.src.EmployeeProto.Employee other = (com.poc.pb.prtoco.src.EmployeeProto.Employee) obj;

	      boolean result = true;
	      result = result && (getId()
	          == other.getId());
	      result = result && getFirstName()
	          .equals(other.getFirstName());
	      result = result && getSecondName()
	          .equals(other.getSecondName());
	      return result;
	    }

	    @java.lang.Override
	    public int hashCode() {
	      if (memoizedHashCode != 0) {
	        return memoizedHashCode;
	      }
	      int hash = 41;
	      hash = (19 * hash) + getDescriptorForType().hashCode();
	      hash = (37 * hash) + ID_FIELD_NUMBER;
	      hash = (53 * hash) + getId();
	      hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
	      hash = (53 * hash) + getFirstName().hashCode();
	      hash = (37 * hash) + SECOND_NAME_FIELD_NUMBER;
	      hash = (53 * hash) + getSecondName().hashCode();
	      hash = (29 * hash) + unknownFields.hashCode();
	      memoizedHashCode = hash;
	      return hash;
	    }

	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseFrom(
	        com.google.protobuf.ByteString data)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return PARSER.parseFrom(data);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseFrom(
	        com.google.protobuf.ByteString data,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return PARSER.parseFrom(data, extensionRegistry);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseFrom(byte[] data)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return PARSER.parseFrom(data);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseFrom(
	        byte[] data,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws com.google.protobuf.InvalidProtocolBufferException {
	      return PARSER.parseFrom(data, extensionRegistry);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseFrom(java.io.InputStream input)
	        throws java.io.IOException {
	      return com.google.protobuf.GeneratedMessageV3
	          .parseWithIOException(PARSER, input);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseFrom(
	        java.io.InputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      return com.google.protobuf.GeneratedMessageV3
	          .parseWithIOException(PARSER, input, extensionRegistry);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseDelimitedFrom(java.io.InputStream input)
	        throws java.io.IOException {
	      return com.google.protobuf.GeneratedMessageV3
	          .parseDelimitedWithIOException(PARSER, input);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseDelimitedFrom(
	        java.io.InputStream input,
	        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	        throws java.io.IOException {
	      return com.google.protobuf.GeneratedMessageV3
	          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseFrom(
	        com.google.protobuf.CodedInputStream input)
	        throws java.io.IOException {
	      return com.google.protobuf.GeneratedMessageV3
	          .parseWithIOException(PARSER, input);
	    }
	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee parseFrom(
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
	    public static Builder newBuilder(com.poc.pb.prtoco.src.EmployeeProto.Employee prototype) {
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
	     * Protobuf type {@code com.poc.pb.spring.microservice.proto.Employee}
	     */
	    public static final class Builder extends
	        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
	        // @@protoc_insertion_point(builder_implements:com.poc.pb.spring.microservice.proto.Employee)
	        com.poc.pb.prtoco.src.EmployeeProto.EmployeeOrBuilder {
	      public static final com.google.protobuf.Descriptors.Descriptor
	          getDescriptor() {
	        return com.poc.pb.prtoco.src.EmployeeProto.internal_static_com_poc_pb_spring_microservice_proto_Employee_descriptor;
	      }

	      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
	          internalGetFieldAccessorTable() {
	        return com.poc.pb.prtoco.src.EmployeeProto.internal_static_com_poc_pb_spring_microservice_proto_Employee_fieldAccessorTable
	            .ensureFieldAccessorsInitialized(
	                com.poc.pb.prtoco.src.EmployeeProto.Employee.class, com.poc.pb.prtoco.src.EmployeeProto.Employee.Builder.class);
	      }

	      // Construct using com.poc.pb.prtoco.src.EmployeeProto.Employee.newBuilder()
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
	        id_ = 0;

	        firstName_ = "";

	        secondName_ = "";

	        return this;
	      }

	      public com.google.protobuf.Descriptors.Descriptor
	          getDescriptorForType() {
	        return com.poc.pb.prtoco.src.EmployeeProto.internal_static_com_poc_pb_spring_microservice_proto_Employee_descriptor;
	      }

	      public com.poc.pb.prtoco.src.EmployeeProto.Employee getDefaultInstanceForType() {
	        return com.poc.pb.prtoco.src.EmployeeProto.Employee.getDefaultInstance();
	      }

	      public com.poc.pb.prtoco.src.EmployeeProto.Employee build() {
	        com.poc.pb.prtoco.src.EmployeeProto.Employee result = buildPartial();
	        if (!result.isInitialized()) {
	          throw newUninitializedMessageException(result);
	        }
	        return result;
	      }

	      public com.poc.pb.prtoco.src.EmployeeProto.Employee buildPartial() {
	        com.poc.pb.prtoco.src.EmployeeProto.Employee result = new com.poc.pb.prtoco.src.EmployeeProto.Employee(this);
	        result.id_ = id_;
	        result.firstName_ = firstName_;
	        result.secondName_ = secondName_;
	        onBuilt();
	        return result;
	      }

	      public Builder clone() {
	        return (Builder) super.clone();
	      }
	      public Builder setField(
	          com.google.protobuf.Descriptors.FieldDescriptor field,
	          Object value) {
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
	          int index, Object value) {
	        return (Builder) super.setRepeatedField(field, index, value);
	      }
	      public Builder addRepeatedField(
	          com.google.protobuf.Descriptors.FieldDescriptor field,
	          Object value) {
	        return (Builder) super.addRepeatedField(field, value);
	      }
	      public Builder mergeFrom(com.google.protobuf.Message other) {
	        if (other instanceof com.poc.pb.prtoco.src.EmployeeProto.Employee) {
	          return mergeFrom((com.poc.pb.prtoco.src.EmployeeProto.Employee)other);
	        } else {
	          super.mergeFrom(other);
	          return this;
	        }
	      }

	      public Builder mergeFrom(com.poc.pb.prtoco.src.EmployeeProto.Employee other) {
	        if (other == com.poc.pb.prtoco.src.EmployeeProto.Employee.getDefaultInstance()) return this;
	        if (other.getId() != 0) {
	          setId(other.getId());
	        }
	        if (!other.getFirstName().isEmpty()) {
	          firstName_ = other.firstName_;
	          onChanged();
	        }
	        if (!other.getSecondName().isEmpty()) {
	          secondName_ = other.secondName_;
	          onChanged();
	        }
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
	        com.poc.pb.prtoco.src.EmployeeProto.Employee parsedMessage = null;
	        try {
	          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
	        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
	          parsedMessage = (com.poc.pb.prtoco.src.EmployeeProto.Employee) e.getUnfinishedMessage();
	          throw e.unwrapIOException();
	        } finally {
	          if (parsedMessage != null) {
	            mergeFrom(parsedMessage);
	          }
	        }
	        return this;
	      }

	      private int id_ ;
	      /**
	       * <code>optional int32 id = 1;</code>
	       */
	      public int getId() {
	        return id_;
	      }
	      /**
	       * <code>optional int32 id = 1;</code>
	       */
	      public Builder setId(int value) {
	        
	        id_ = value;
	        onChanged();
	        return this;
	      }
	      /**
	       * <code>optional int32 id = 1;</code>
	       */
	      public Builder clearId() {
	        
	        id_ = 0;
	        onChanged();
	        return this;
	      }

	      private java.lang.Object firstName_ = "";
	      /**
	       * <code>optional string first_name = 2;</code>
	       */
	      public java.lang.String getFirstName() {
	        java.lang.Object ref = firstName_;
	        if (!(ref instanceof java.lang.String)) {
	          com.google.protobuf.ByteString bs =
	              (com.google.protobuf.ByteString) ref;
	          java.lang.String s = bs.toStringUtf8();
	          firstName_ = s;
	          return s;
	        } else {
	          return (java.lang.String) ref;
	        }
	      }
	      /**
	       * <code>optional string first_name = 2;</code>
	       */
	      public com.google.protobuf.ByteString
	          getFirstNameBytes() {
	        java.lang.Object ref = firstName_;
	        if (ref instanceof String) {
	          com.google.protobuf.ByteString b = 
	              com.google.protobuf.ByteString.copyFromUtf8(
	                  (java.lang.String) ref);
	          firstName_ = b;
	          return b;
	        } else {
	          return (com.google.protobuf.ByteString) ref;
	        }
	      }
	      /**
	       * <code>optional string first_name = 2;</code>
	       */
	      public Builder setFirstName(
	          java.lang.String value) {
	        if (value == null) {
	    throw new NullPointerException();
	  }
	  
	        firstName_ = value;
	        onChanged();
	        return this;
	      }
	      /**
	       * <code>optional string first_name = 2;</code>
	       */
	      public Builder clearFirstName() {
	        
	        firstName_ = getDefaultInstance().getFirstName();
	        onChanged();
	        return this;
	      }
	      /**
	       * <code>optional string first_name = 2;</code>
	       */
	      public Builder setFirstNameBytes(
	          com.google.protobuf.ByteString value) {
	        if (value == null) {
	    throw new NullPointerException();
	  }
	  checkByteStringIsUtf8(value);
	        
	        firstName_ = value;
	        onChanged();
	        return this;
	      }

	      private java.lang.Object secondName_ = "";
	      /**
	       * <code>optional string second_name = 3;</code>
	       */
	      public java.lang.String getSecondName() {
	        java.lang.Object ref = secondName_;
	        if (!(ref instanceof java.lang.String)) {
	          com.google.protobuf.ByteString bs =
	              (com.google.protobuf.ByteString) ref;
	          java.lang.String s = bs.toStringUtf8();
	          secondName_ = s;
	          return s;
	        } else {
	          return (java.lang.String) ref;
	        }
	      }
	      /**
	       * <code>optional string second_name = 3;</code>
	       */
	      public com.google.protobuf.ByteString
	          getSecondNameBytes() {
	        java.lang.Object ref = secondName_;
	        if (ref instanceof String) {
	          com.google.protobuf.ByteString b = 
	              com.google.protobuf.ByteString.copyFromUtf8(
	                  (java.lang.String) ref);
	          secondName_ = b;
	          return b;
	        } else {
	          return (com.google.protobuf.ByteString) ref;
	        }
	      }
	      /**
	       * <code>optional string second_name = 3;</code>
	       */
	      public Builder setSecondName(
	          java.lang.String value) {
	        if (value == null) {
	    throw new NullPointerException();
	  }
	  
	        secondName_ = value;
	        onChanged();
	        return this;
	      }
	      /**
	       * <code>optional string second_name = 3;</code>
	       */
	      public Builder clearSecondName() {
	        
	        secondName_ = getDefaultInstance().getSecondName();
	        onChanged();
	        return this;
	      }
	      /**
	       * <code>optional string second_name = 3;</code>
	       */
	      public Builder setSecondNameBytes(
	          com.google.protobuf.ByteString value) {
	        if (value == null) {
	    throw new NullPointerException();
	  }
	  checkByteStringIsUtf8(value);
	        
	        secondName_ = value;
	        onChanged();
	        return this;
	      }
	      public final Builder setUnknownFields(
	          final com.google.protobuf.UnknownFieldSet unknownFields) {
	        return this;
	      }

	      public final Builder mergeUnknownFields(
	          final com.google.protobuf.UnknownFieldSet unknownFields) {
	        return this;
	      }


	      // @@protoc_insertion_point(builder_scope:com.poc.pb.spring.microservice.proto.Employee)
	    }

	    // @@protoc_insertion_point(class_scope:com.poc.pb.spring.microservice.proto.Employee)
	    private static final com.poc.pb.prtoco.src.EmployeeProto.Employee DEFAULT_INSTANCE;
	    static {
	      DEFAULT_INSTANCE = new com.poc.pb.prtoco.src.EmployeeProto.Employee();
	    }

	    public static com.poc.pb.prtoco.src.EmployeeProto.Employee getDefaultInstance() {
	      return DEFAULT_INSTANCE;
	    }

	    private static final com.google.protobuf.Parser<Employee>
	        PARSER = new com.google.protobuf.AbstractParser<Employee>() {
	      public Employee parsePartialFrom(
	          com.google.protobuf.CodedInputStream input,
	          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
	          throws com.google.protobuf.InvalidProtocolBufferException {
	          return new Employee(input, extensionRegistry);
	      }
	    };

	    public static com.google.protobuf.Parser<Employee> parser() {
	      return PARSER;
	    }

	    @java.lang.Override
	    public com.google.protobuf.Parser<Employee> getParserForType() {
	      return PARSER;
	    }

	    public com.poc.pb.prtoco.src.EmployeeProto.Employee getDefaultInstanceForType() {
	      return DEFAULT_INSTANCE;
	    }

	  }

	  private static final com.google.protobuf.Descriptors.Descriptor
	    internal_static_com_poc_pb_spring_microservice_proto_Employee_descriptor;
	  private static final 
	    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
	      internal_static_com_poc_pb_spring_microservice_proto_Employee_fieldAccessorTable;

	  public static com.google.protobuf.Descriptors.FileDescriptor
	      getDescriptor() {
	    return descriptor;
	  }
	  private static  com.google.protobuf.Descriptors.FileDescriptor
	      descriptor;
	  static {
	    java.lang.String[] descriptorData = {
	      "\n\016employee.proto\022$com.poc.pb.spring.micr" +
	      "oservice.proto\"?\n\010Employee\022\n\n\002id\030\001 \001(\005\022\022" +
	      "\n\nfirst_name\030\002 \001(\t\022\023\n\013second_name\030\003 \001(\tB" +
	      "&\n\025com.poc.pb.prtoco.srcB\rEmployeeProtob" +
	      "\006proto3"
	    };
	    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
	        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
	          public com.google.protobuf.ExtensionRegistry assignDescriptors(
	              com.google.protobuf.Descriptors.FileDescriptor root) {
	            descriptor = root;
	            return null;
	          }
	        };
	    com.google.protobuf.Descriptors.FileDescriptor
	      .internalBuildGeneratedFileFrom(descriptorData,
	        new com.google.protobuf.Descriptors.FileDescriptor[] {
	        }, assigner);
	    internal_static_com_poc_pb_spring_microservice_proto_Employee_descriptor =
	      getDescriptor().getMessageTypes().get(0);
	    internal_static_com_poc_pb_spring_microservice_proto_Employee_fieldAccessorTable = new
	      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
	        internal_static_com_poc_pb_spring_microservice_proto_Employee_descriptor,
	        new java.lang.String[] { "Id", "FirstName", "SecondName", });
	  }

	  // @@protoc_insertion_point(outer_class_scope)
	}
