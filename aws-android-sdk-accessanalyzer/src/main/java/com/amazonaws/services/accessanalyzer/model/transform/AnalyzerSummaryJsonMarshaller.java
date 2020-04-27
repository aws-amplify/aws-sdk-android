/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AnalyzerSummary
 */
class AnalyzerSummaryJsonMarshaller {

    public void marshall(AnalyzerSummary analyzerSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (analyzerSummary.getArn() != null) {
            String arn = analyzerSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (analyzerSummary.getCreatedAt() != null) {
            java.util.Date createdAt = analyzerSummary.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (analyzerSummary.getLastResourceAnalyzed() != null) {
            String lastResourceAnalyzed = analyzerSummary.getLastResourceAnalyzed();
            jsonWriter.name("lastResourceAnalyzed");
            jsonWriter.value(lastResourceAnalyzed);
        }
        if (analyzerSummary.getLastResourceAnalyzedAt() != null) {
            java.util.Date lastResourceAnalyzedAt = analyzerSummary.getLastResourceAnalyzedAt();
            jsonWriter.name("lastResourceAnalyzedAt");
            jsonWriter.value(lastResourceAnalyzedAt);
        }
        if (analyzerSummary.getName() != null) {
            String name = analyzerSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (analyzerSummary.getStatus() != null) {
            String status = analyzerSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (analyzerSummary.getStatusReason() != null) {
            StatusReason statusReason = analyzerSummary.getStatusReason();
            jsonWriter.name("statusReason");
            StatusReasonJsonMarshaller.getInstance().marshall(statusReason, jsonWriter);
        }
        if (analyzerSummary.getTags() != null) {
            java.util.Map<String, String> tags = analyzerSummary.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (analyzerSummary.getType() != null) {
            String type = analyzerSummary.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static AnalyzerSummaryJsonMarshaller instance;

    public static AnalyzerSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AnalyzerSummaryJsonMarshaller();
        return instance;
    }
}
