/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public final class LoggingProto {
  private LoggingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_DeleteLogRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_DeleteLogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListLogEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListLogEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListLogsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_logging_v2_ListLogsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/logging/v2/logging.proto\022\021googl"
          + "e.logging.v2\032\027google/api/client.proto\032\037g"
          + "oogle/api/field_behavior.proto\032#google/a"
          + "pi/monitored_resource.proto\032\031google/api/"
          + "resource.proto\032!google/logging/v2/log_en"
          + "try.proto\032&google/logging/v2/logging_con"
          + "fig.proto\032\036google/protobuf/duration.prot"
          + "o\032\033google/protobuf/empty.proto\032 google/p"
          + "rotobuf/field_mask.proto\032\037google/protobu"
          + "f/timestamp.proto\032\027google/rpc/status.pro"
          + "to\032\034google/api/annotations.proto\"H\n\020Dele"
          + "teLogRequest\0224\n\010log_name\030\001 \001(\tB\"\340A\002\372A\034\n\032"
          + "logging.googleapis.com/Log\"\346\002\n\026WriteLogE"
          + "ntriesRequest\0224\n\010log_name\030\001 \001(\tB\"\340A\001\372A\034\n"
          + "\032logging.googleapis.com/Log\0224\n\010resource\030"
          + "\002 \001(\0132\035.google.api.MonitoredResourceB\003\340A"
          + "\001\022J\n\006labels\030\003 \003(\01325.google.logging.v2.Wr"
          + "iteLogEntriesRequest.LabelsEntryB\003\340A\001\0221\n"
          + "\007entries\030\004 \003(\0132\033.google.logging.v2.LogEn"
          + "tryB\003\340A\002\022\034\n\017partial_success\030\005 \001(\010B\003\340A\001\022\024"
          + "\n\007dry_run\030\006 \001(\010B\003\340A\001\032-\n\013LabelsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\031\n\027WriteLogE"
          + "ntriesResponse\"\310\001\n\034WriteLogEntriesPartia"
          + "lErrors\022]\n\020log_entry_errors\030\001 \003(\0132C.goog"
          + "le.logging.v2.WriteLogEntriesPartialErro"
          + "rs.LogEntryErrorsEntry\032I\n\023LogEntryErrors"
          + "Entry\022\013\n\003key\030\001 \001(\005\022!\n\005value\030\002 \001(\0132\022.goog"
          + "le.rpc.Status:\0028\001\"\260\001\n\025ListLogEntriesRequ"
          + "est\022:\n\016resource_names\030\010 \003(\tB\"\340A\002\372A\034\022\032log"
          + "ging.googleapis.com/Log\022\023\n\006filter\030\002 \001(\tB"
          + "\003\340A\001\022\025\n\010order_by\030\003 \001(\tB\003\340A\001\022\026\n\tpage_size"
          + "\030\004 \001(\005B\003\340A\001\022\027\n\npage_token\030\005 \001(\tB\003\340A\001\"_\n\026"
          + "ListLogEntriesResponse\022,\n\007entries\030\001 \003(\0132"
          + "\033.google.logging.v2.LogEntry\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\"Z\n\'ListMonitoredResourceDe"
          + "scriptorsRequest\022\026\n\tpage_size\030\001 \001(\005B\003\340A\001"
          + "\022\027\n\npage_token\030\002 \001(\tB\003\340A\001\"\212\001\n(ListMonito"
          + "redResourceDescriptorsResponse\022E\n\024resour"
          + "ce_descriptors\030\001 \003(\0132\'.google.api.Monito"
          + "redResourceDescriptor\022\027\n\017next_page_token"
          + "\030\002 \001(\t\"v\n\017ListLogsRequest\0222\n\006parent\030\001 \001("
          + "\tB\"\340A\002\372A\034\022\032logging.googleapis.com/Log\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001("
          + "\tB\003\340A\001\">\n\020ListLogsResponse\022\021\n\tlog_names\030"
          + "\003 \003(\t\022\027\n\017next_page_token\030\002 \001(\t2\335\n\n\020Loggi"
          + "ngServiceV2\022\223\002\n\tDeleteLog\022#.google.loggi"
          + "ng.v2.DeleteLogRequest\032\026.google.protobuf"
          + ".Empty\"\310\001\202\323\344\223\002\266\001* /v2/{log_name=projects"
          + "/*/logs/*}Z\033*\031/v2/{log_name=*/*/logs/*}Z"
          + "\'*%/v2/{log_name=organizations/*/logs/*}"
          + "Z!*\037/v2/{log_name=folders/*/logs/*}Z)*\'/"
          + "v2/{log_name=billingAccounts/*/logs/*}\332A"
          + "\010log_name\022\251\001\n\017WriteLogEntries\022).google.l"
          + "ogging.v2.WriteLogEntriesRequest\032*.googl"
          + "e.logging.v2.WriteLogEntriesResponse\"?\202\323"
          + "\344\223\002\026\"\021/v2/entries:write:\001*\332A log_name,re"
          + "source,labels,entries\022\243\001\n\016ListLogEntries"
          + "\022(.google.logging.v2.ListLogEntriesReque"
          + "st\032).google.logging.v2.ListLogEntriesRes"
          + "ponse\"<\202\323\344\223\002\025\"\020/v2/entries:list:\001*\332A\036res"
          + "ource_names,filter,order_by\022\305\001\n ListMoni"
          + "toredResourceDescriptors\022:.google.loggin"
          + "g.v2.ListMonitoredResourceDescriptorsReq"
          + "uest\032;.google.logging.v2.ListMonitoredRe"
          + "sourceDescriptorsResponse\"(\202\323\344\223\002\"\022 /v2/m"
          + "onitoredResourceDescriptors\022\210\002\n\010ListLogs"
          + "\022\".google.logging.v2.ListLogsRequest\032#.g"
          + "oogle.logging.v2.ListLogsResponse\"\262\001\202\323\344\223"
          + "\002\242\001\022\025/v2/{parent=*/*}/logsZ\036\022\034/v2/{paren"
          + "t=projects/*}/logsZ#\022!/v2/{parent=organi"
          + "zations/*}/logsZ\035\022\033/v2/{parent=folders/*"
          + "}/logsZ%\022#/v2/{parent=billingAccounts/*}"
          + "/logs\332A\006parent\032\215\002\312A\026logging.googleapis.c"
          + "om\322A\360\001https://www.googleapis.com/auth/cl"
          + "oud-platform,https://www.googleapis.com/"
          + "auth/cloud-platform.read-only,https://ww"
          + "w.googleapis.com/auth/logging.admin,http"
          + "s://www.googleapis.com/auth/logging.read"
          + ",https://www.googleapis.com/auth/logging"
          + ".writeB\265\001\n\025com.google.logging.v2B\014Loggin"
          + "gProtoP\001Z8google.golang.org/genproto/goo"
          + "gleapis/logging/v2;logging\370\001\001\252\002\027Google.C"
          + "loud.Logging.V2\312\002\027Google\\Cloud\\Logging\\V"
          + "2\352\002\032Google::Cloud::Logging::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.logging.v2.LogEntryProto.getDescriptor(),
              com.google.logging.v2.LoggingConfigProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_logging_v2_DeleteLogRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v2_DeleteLogRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_DeleteLogRequest_descriptor,
            new java.lang.String[] {
              "LogName",
            });
    internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v2_WriteLogEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor,
            new java.lang.String[] {
              "LogName", "Resource", "Labels", "Entries", "PartialSuccess", "DryRun",
            });
    internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor =
        internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v2_WriteLogEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor,
            new java.lang.String[] {
              "LogEntryErrors",
            });
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor =
        internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_logging_v2_ListLogEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_logging_v2_ListLogEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListLogEntriesRequest_descriptor,
            new java.lang.String[] {
              "ResourceNames", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_logging_v2_ListLogEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_logging_v2_ListLogEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListLogEntriesResponse_descriptor,
            new java.lang.String[] {
              "Entries", "NextPageToken",
            });
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "PageSize", "PageToken",
            });
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "ResourceDescriptors", "NextPageToken",
            });
    internal_static_google_logging_v2_ListLogsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_logging_v2_ListLogsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListLogsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_logging_v2_ListLogsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_logging_v2_ListLogsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_logging_v2_ListLogsResponse_descriptor,
            new java.lang.String[] {
              "LogNames", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.logging.v2.LogEntryProto.getDescriptor();
    com.google.logging.v2.LoggingConfigProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
