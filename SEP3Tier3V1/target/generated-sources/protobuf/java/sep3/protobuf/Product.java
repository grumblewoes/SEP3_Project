// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package sep3.protobuf;

/**
 * Protobuf type {@code Product}
 */
public final class Product extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Product)
    ProductOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Product.newBuilder() to construct.
  private Product(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Product() {
    name_ = "";
    manufacturer_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Product();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sep3.protobuf.ProductProto.internal_static_Product_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sep3.protobuf.ProductProto.internal_static_Product_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sep3.protobuf.Product.class, sep3.protobuf.Product.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_ = 0;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MANUFACTURER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object manufacturer_ = "";
  /**
   * <code>string manufacturer = 3;</code>
   * @return The manufacturer.
   */
  @java.lang.Override
  public java.lang.String getManufacturer() {
    java.lang.Object ref = manufacturer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      manufacturer_ = s;
      return s;
    }
  }
  /**
   * <code>string manufacturer = 3;</code>
   * @return The bytes for manufacturer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getManufacturerBytes() {
    java.lang.Object ref = manufacturer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      manufacturer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 5;
  private double price_ = 0D;
  /**
   * <code>double price = 5;</code>
   * @return The price.
   */
  @java.lang.Override
  public double getPrice() {
    return price_;
  }

  public static final int STOCK_FIELD_NUMBER = 6;
  private int stock_ = 0;
  /**
   * <code>int32 stock = 6;</code>
   * @return The stock.
   */
  @java.lang.Override
  public int getStock() {
    return stock_;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(manufacturer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, manufacturer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    if (java.lang.Double.doubleToRawLongBits(price_) != 0) {
      output.writeDouble(5, price_);
    }
    if (stock_ != 0) {
      output.writeInt32(6, stock_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(manufacturer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, manufacturer_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
    }
    if (java.lang.Double.doubleToRawLongBits(price_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, price_);
    }
    if (stock_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, stock_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sep3.protobuf.Product)) {
      return super.equals(obj);
    }
    sep3.protobuf.Product other = (sep3.protobuf.Product) obj;

    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getManufacturer()
        .equals(other.getManufacturer())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (java.lang.Double.doubleToLongBits(getPrice())
        != java.lang.Double.doubleToLongBits(
            other.getPrice())) return false;
    if (getStock()
        != other.getStock()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + MANUFACTURER_FIELD_NUMBER;
    hash = (53 * hash) + getManufacturer().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + STOCK_FIELD_NUMBER;
    hash = (53 * hash) + getStock();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sep3.protobuf.Product parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.protobuf.Product parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.protobuf.Product parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.protobuf.Product parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.protobuf.Product parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.protobuf.Product parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.protobuf.Product parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.protobuf.Product parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static sep3.protobuf.Product parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static sep3.protobuf.Product parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.protobuf.Product parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.protobuf.Product parseFrom(
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
  public static Builder newBuilder(sep3.protobuf.Product prototype) {
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
   * Protobuf type {@code Product}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Product)
      sep3.protobuf.ProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sep3.protobuf.ProductProto.internal_static_Product_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sep3.protobuf.ProductProto.internal_static_Product_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sep3.protobuf.Product.class, sep3.protobuf.Product.Builder.class);
    }

    // Construct using sep3.protobuf.Product.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = 0;
      name_ = "";
      manufacturer_ = "";
      description_ = "";
      price_ = 0D;
      stock_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sep3.protobuf.ProductProto.internal_static_Product_descriptor;
    }

    @java.lang.Override
    public sep3.protobuf.Product getDefaultInstanceForType() {
      return sep3.protobuf.Product.getDefaultInstance();
    }

    @java.lang.Override
    public sep3.protobuf.Product build() {
      sep3.protobuf.Product result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sep3.protobuf.Product buildPartial() {
      sep3.protobuf.Product result = new sep3.protobuf.Product(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(sep3.protobuf.Product result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.manufacturer_ = manufacturer_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.price_ = price_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.stock_ = stock_;
      }
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
      if (other instanceof sep3.protobuf.Product) {
        return mergeFrom((sep3.protobuf.Product)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sep3.protobuf.Product other) {
      if (other == sep3.protobuf.Product.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getManufacturer().isEmpty()) {
        manufacturer_ = other.manufacturer_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (other.getStock() != 0) {
        setStock(other.getStock());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              manufacturer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 41: {
              price_ = input.readDouble();
              bitField0_ |= 0x00000010;
              break;
            } // case 41
            case 48: {
              stock_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object manufacturer_ = "";
    /**
     * <code>string manufacturer = 3;</code>
     * @return The manufacturer.
     */
    public java.lang.String getManufacturer() {
      java.lang.Object ref = manufacturer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        manufacturer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string manufacturer = 3;</code>
     * @return The bytes for manufacturer.
     */
    public com.google.protobuf.ByteString
        getManufacturerBytes() {
      java.lang.Object ref = manufacturer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        manufacturer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string manufacturer = 3;</code>
     * @param value The manufacturer to set.
     * @return This builder for chaining.
     */
    public Builder setManufacturer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      manufacturer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string manufacturer = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearManufacturer() {
      manufacturer_ = getDefaultInstance().getManufacturer();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string manufacturer = 3;</code>
     * @param value The bytes for manufacturer to set.
     * @return This builder for chaining.
     */
    public Builder setManufacturerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      manufacturer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 4;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 5;</code>
     * @return The price.
     */
    @java.lang.Override
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 5;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(double value) {

      price_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      bitField0_ = (bitField0_ & ~0x00000010);
      price_ = 0D;
      onChanged();
      return this;
    }

    private int stock_ ;
    /**
     * <code>int32 stock = 6;</code>
     * @return The stock.
     */
    @java.lang.Override
    public int getStock() {
      return stock_;
    }
    /**
     * <code>int32 stock = 6;</code>
     * @param value The stock to set.
     * @return This builder for chaining.
     */
    public Builder setStock(int value) {

      stock_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int32 stock = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearStock() {
      bitField0_ = (bitField0_ & ~0x00000020);
      stock_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Product)
  }

  // @@protoc_insertion_point(class_scope:Product)
  private static final sep3.protobuf.Product DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sep3.protobuf.Product();
  }

  public static sep3.protobuf.Product getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Product>
      PARSER = new com.google.protobuf.AbstractParser<Product>() {
    @java.lang.Override
    public Product parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Product> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Product> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sep3.protobuf.Product getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

