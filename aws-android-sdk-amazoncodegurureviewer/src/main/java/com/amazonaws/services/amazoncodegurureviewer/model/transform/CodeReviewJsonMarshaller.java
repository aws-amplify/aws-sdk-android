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

package com.amazonaws.services.amazoncodegurureviewer.model.transform;

import com.amazonaws.services.amazoncodegurureviewer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CodeReview
 */
class CodeReviewJsonMarshaller {

    public void marshall(CodeReview codeReview, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (codeReview.getName() != null) {
            String name = codeReview.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (codeReview.getCodeReviewArn() != null) {
            String codeReviewArn = codeReview.getCodeReviewArn();
            jsonWriter.name("CodeReviewArn");
            jsonWriter.value(codeReviewArn);
        }
        if (codeReview.getRepositoryName() != null) {
            String repositoryName = codeReview.getRepositoryName();
            jsonWriter.name("RepositoryName");
            jsonWriter.value(repositoryName);
        }
        if (codeReview.getOwner() != null) {
            String owner = codeReview.getOwner();
            jsonWriter.name("Owner");
            jsonWriter.value(owner);
        }
        if (codeReview.getProviderType() != null) {
            String providerType = codeReview.getProviderType();
            jsonWriter.name("ProviderType");
            jsonWriter.value(providerType);
        }
        if (codeReview.getState() != null) {
            String state = codeReview.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (codeReview.getStateReason() != null) {
            String stateReason = codeReview.getStateReason();
            jsonWriter.name("StateReason");
            jsonWriter.value(stateReason);
        }
        if (codeReview.getCreatedTimeStamp() != null) {
            java.util.Date createdTimeStamp = codeReview.getCreatedTimeStamp();
            jsonWriter.name("CreatedTimeStamp");
            jsonWriter.value(createdTimeStamp);
        }
        if (codeReview.getLastUpdatedTimeStamp() != null) {
            java.util.Date lastUpdatedTimeStamp = codeReview.getLastUpdatedTimeStamp();
            jsonWriter.name("LastUpdatedTimeStamp");
            jsonWriter.value(lastUpdatedTimeStamp);
        }
        if (codeReview.getType() != null) {
            String type = codeReview.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (codeReview.getPullRequestId() != null) {
            String pullRequestId = codeReview.getPullRequestId();
            jsonWriter.name("PullRequestId");
            jsonWriter.value(pullRequestId);
        }
        if (codeReview.getSourceCodeType() != null) {
            SourceCodeType sourceCodeType = codeReview.getSourceCodeType();
            jsonWriter.name("SourceCodeType");
            SourceCodeTypeJsonMarshaller.getInstance().marshall(sourceCodeType, jsonWriter);
        }
        if (codeReview.getMetrics() != null) {
            Metrics metrics = codeReview.getMetrics();
            jsonWriter.name("Metrics");
            MetricsJsonMarshaller.getInstance().marshall(metrics, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static CodeReviewJsonMarshaller instance;

    public static CodeReviewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CodeReviewJsonMarshaller();
        return instance;
    }
}
