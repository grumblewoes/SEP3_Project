// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package sep3.protobuf;

public interface ProductDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProductData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string manufacturer = 3;</code>
   * @return The manufacturer.
   */
  java.lang.String getManufacturer();
  /**
   * <code>string manufacturer = 3;</code>
   * @return The bytes for manufacturer.
   */
  com.google.protobuf.ByteString
      getManufacturerBytes();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>double price = 5;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>int32 stock = 6;</code>
   * @return The stock.
   */
  int getStock();
}
