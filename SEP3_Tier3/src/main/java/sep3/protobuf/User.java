// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package sep3.protobuf;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestCreateUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestCreateUser_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\"3\n\010UserData\022\n\n\002id\030\001 \001(\t\022\014\n\004" +
      "name\030\002 \001(\t\022\r\n\005email\030\003 \001(\t\"0\n\021RequestCrea" +
      "teUser\022\014\n\004name\030\001 \001(\t\022\r\n\005email\030\002 \001(\t2:\n\013U" +
      "serService\022+\n\nCreateUser\022\022.RequestCreate" +
      "User\032\t.UserDataB\021\n\rsep3.protobufP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UserData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UserData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserData_descriptor,
        new java.lang.String[] { "Id", "Name", "Email", });
    internal_static_RequestCreateUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RequestCreateUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestCreateUser_descriptor,
        new java.lang.String[] { "Name", "Email", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
