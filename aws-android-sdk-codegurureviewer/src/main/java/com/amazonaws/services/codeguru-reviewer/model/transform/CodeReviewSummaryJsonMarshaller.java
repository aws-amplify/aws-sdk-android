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
package com.amazonaws.services.codeguru-reviewer.model.transform;

import com.amazonaws.services.codeguru-reviewer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CodeReviewSummary
 */
class CodeReviewSummaryJsonMarshaller {

    public void marshall(CodeReviewSummary codeReviewSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (codeReviewSummary.getName() != null) {
            String name = codeReviewSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (codeReviewSummary.getCodeReviewArn() != null) {
            String codeReviewArn = codeReviewSummary.getCodeReviewArn();
            jsonWriter.name("CodeReviewArn");
            jsonWriter.value(codeReviewArn);
        }
        if (codeReviewSummary.getRepositoryName() != null) {
            String repositoryName = codeReviewSummary.getRepositoryName();
            jsonWriter.name("RepositoryName");
            jsonWriter.value(repositoryName);
        }
        if (codeReviewSummary.getOwner() != null) {
            String owner = codeReviewSummary.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (codeReviewSummary.getProviderType() != null) {
            String providerType = codeReviewSummary.getProviderType();
            jsonWriter.name("ProviderType");
            jsonWriter.value(providerType);
        }
        if (codeReviewSummary.getState() != null) {
            String state = codeReviewSummary.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (codeReviewSummary.getCreatedTimeStamp() != null) {
            java.util.Date createdTimeStamp = codeReviewSummary.getCreatedTimeStamp();
            jsonWriter.name("CreatedTimeStamp");
            jsonWriter.value(createdTimeStamp);
        }
        if (codeReviewSummary.getLastUpdatedTimeStamp() != null) {
            java.util.Date lastUpdatedTimeStamp = codeReviewSummary.getLastUpdatedTimeStamp();
            jsonWriter.name("LastUpdatedTimeStamp");
            jsonWriter.value(lastUpdatedTimeStamp);
        }
        if (codeReviewSummary.getType() != null) {
            String type = codeReviewSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (codeReviewSummary.getPullRequestId() != null) {
            String pullRequestId = codeReviewSummary.getPullRequestId();
            jsonWriter.name("PullRequestId");
            jsonWriter.value(pullRequestId);
        }
        if (codeReviewSummary.getMetricsSummary() != null) {
            MetricsSummary metricsSummary = codeReviewSummary.getMetricsSummary();
            jsonWriter.name("MetricsSummary");
            MetricsSummaryJsonMarshaller.getInstance().marshall(metricsSummary, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CodeReviewSummaryJsonMarshaller instance;
    public static CodeReviewSummaryJsonMarshaller getInstance() {
        if (instance == null) instance = new CodeReviewSummaryJsonMarshaller();
        return instance;
    }
}
