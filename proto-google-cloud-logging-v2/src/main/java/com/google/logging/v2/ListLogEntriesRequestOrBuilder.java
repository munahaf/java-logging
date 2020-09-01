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

public interface ListLogEntriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListLogEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Names of one or more parent resources from which to
   * retrieve log entries:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Projects listed in the `project_ids` field are added to this list.
   * </pre>
   *
   * <code>
   * repeated string resource_names = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the resourceNames.
   */
  java.util.List<java.lang.String> getResourceNamesList();
  /**
   *
   *
   * <pre>
   * Required. Names of one or more parent resources from which to
   * retrieve log entries:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Projects listed in the `project_ids` field are added to this list.
   * </pre>
   *
   * <code>
   * repeated string resource_names = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of resourceNames.
   */
  int getResourceNamesCount();
  /**
   *
   *
   * <pre>
   * Required. Names of one or more parent resources from which to
   * retrieve log entries:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Projects listed in the `project_ids` field are added to this list.
   * </pre>
   *
   * <code>
   * repeated string resource_names = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The resourceNames at the given index.
   */
  java.lang.String getResourceNames(int index);
  /**
   *
   *
   * <pre>
   * Required. Names of one or more parent resources from which to
   * retrieve log entries:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * Projects listed in the `project_ids` field are added to this list.
   * </pre>
   *
   * <code>
   * repeated string resource_names = 8 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceNames at the given index.
   */
  com.google.protobuf.ByteString getResourceNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A filter that chooses which log entries to return.  See [Advanced
   * Logs Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
   * Only log entries that match the filter are returned.  An empty filter
   * matches all log entries in the resources listed in `resource_names`.
   * Referencing a parent resource that is not listed in `resource_names` will
   * cause the filter to return no results. The maximum length of the filter is
   * 20000 characters.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A filter that chooses which log entries to return.  See [Advanced
   * Logs Queries](https://cloud.google.com/logging/docs/view/advanced-queries).
   * Only log entries that match the filter are returned.  An empty filter
   * matches all log entries in the resources listed in `resource_names`.
   * Referencing a parent resource that is not listed in `resource_names` will
   * cause the filter to return no results. The maximum length of the filter is
   * 20000 characters.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. How the results should be sorted.  Presently, the only permitted
   * values are `"timestamp asc"` (default) and `"timestamp desc"`. The first
   * option returns entries in order of increasing values of
   * `LogEntry.timestamp` (oldest first), and the second option returns entries
   * in order of decreasing timestamps (newest first).  Entries with equal
   * timestamps are returned in order of their `insert_id` values.
   * </pre>
   *
   * <code>string order_by = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. How the results should be sorted.  Presently, the only permitted
   * values are `"timestamp asc"` (default) and `"timestamp desc"`. The first
   * option returns entries in order of increasing values of
   * `LogEntry.timestamp` (oldest first), and the second option returns entries
   * in order of decreasing timestamps (newest first).  Entries with equal
   * timestamps are returned in order of their `insert_id` values.
   * </pre>
   *
   * <code>string order_by = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of results to return from this request.
   * Default is 50. If the value is negative or exceeds 1000,
   * the request is rejected. The presence of `next_page_token` in the
   * response indicates that more results might be available.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method.  `page_token` must be the value of
   * `next_page_token` from the previous response.  The values of other method
   * parameters should be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method.  `page_token` must be the value of
   * `next_page_token` from the previous response.  The values of other method
   * parameters should be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
