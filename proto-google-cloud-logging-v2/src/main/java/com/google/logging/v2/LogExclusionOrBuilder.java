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
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface LogExclusionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogExclusion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A client-assigned identifier, such as
   * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
   * can include only letters, digits, underscores, hyphens, and periods.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. A client-assigned identifier, such as
   * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
   * can include only letters, digits, underscores, hyphens, and periods.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A description of this exclusion.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. A description of this exclusion.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. An [advanced logs filter](/logging/docs/view/advanced-queries)
   * that matches the log entries to be excluded. By using the
   * [sample function](/logging/docs/view/advanced-queries#sample),
   * you can exclude less than 100% of the matching log entries.
   * For example, the following query matches 99% of low-severity log
   * entries from Google Cloud Storage buckets:
   * `"resource.type=gcs_bucket severity&lt;ERROR sample(insertId, 0.99)"`
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Required. An [advanced logs filter](/logging/docs/view/advanced-queries)
   * that matches the log entries to be excluded. By using the
   * [sample function](/logging/docs/view/advanced-queries#sample),
   * you can exclude less than 100% of the matching log entries.
   * For example, the following query matches 99% of low-severity log
   * entries from Google Cloud Storage buckets:
   * `"resource.type=gcs_bucket severity&lt;ERROR sample(insertId, 0.99)"`
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set to True, then this exclusion is disabled and it does not
   * exclude any log entries. You can [update an
   * exclusion][google.logging.v2.ConfigServiceV2.UpdateExclusion] to change the
   * value of this field.
   * </pre>
   *
   * <code>bool disabled = 4;</code>
   *
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the exclusion.
   * This field may not be present for older exclusions.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the exclusion.
   * This field may not be present for older exclusions.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of the exclusion.
   * This field may not be present for older exclusions.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the exclusion.
   * This field may not be present for older exclusions.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the exclusion.
   * This field may not be present for older exclusions.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of the exclusion.
   * This field may not be present for older exclusions.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
