/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MediaAnalysisJobDescription
 */
class MediaAnalysisJobDescriptionJsonMarshaller {

    public void marshall(MediaAnalysisJobDescription mediaAnalysisJobDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mediaAnalysisJobDescription.getJobId() != null) {
            String jobId = mediaAnalysisJobDescription.getJobId();
            jsonWriter.name("JobId");
            jsonWriter.value(jobId);
        }
        if (mediaAnalysisJobDescription.getJobName() != null) {
            String jobName = mediaAnalysisJobDescription.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (mediaAnalysisJobDescription.getOperationsConfig() != null) {
            MediaAnalysisOperationsConfig operationsConfig = mediaAnalysisJobDescription
                    .getOperationsConfig();
            jsonWriter.name("OperationsConfig");
            MediaAnalysisOperationsConfigJsonMarshaller.getInstance().marshall(operationsConfig,
                    jsonWriter);
        }
        if (mediaAnalysisJobDescription.getStatus() != null) {
            String status = mediaAnalysisJobDescription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (mediaAnalysisJobDescription.getFailureDetails() != null) {
            MediaAnalysisJobFailureDetails failureDetails = mediaAnalysisJobDescription
                    .getFailureDetails();
            jsonWriter.name("FailureDetails");
            MediaAnalysisJobFailureDetailsJsonMarshaller.getInstance().marshall(failureDetails,
                    jsonWriter);
        }
        if (mediaAnalysisJobDescription.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = mediaAnalysisJobDescription.getCreationTimestamp();
            jsonWriter.name("CreationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (mediaAnalysisJobDescription.getCompletionTimestamp() != null) {
            java.util.Date completionTimestamp = mediaAnalysisJobDescription
                    .getCompletionTimestamp();
            jsonWriter.name("CompletionTimestamp");
            jsonWriter.value(completionTimestamp);
        }
        if (mediaAnalysisJobDescription.getInput() != null) {
            MediaAnalysisInput input = mediaAnalysisJobDescription.getInput();
            jsonWriter.name("Input");
            MediaAnalysisInputJsonMarshaller.getInstance().marshall(input, jsonWriter);
        }
        if (mediaAnalysisJobDescription.getOutputConfig() != null) {
            MediaAnalysisOutputConfig outputConfig = mediaAnalysisJobDescription.getOutputConfig();
            jsonWriter.name("OutputConfig");
            MediaAnalysisOutputConfigJsonMarshaller.getInstance()
                    .marshall(outputConfig, jsonWriter);
        }
        if (mediaAnalysisJobDescription.getKmsKeyId() != null) {
            String kmsKeyId = mediaAnalysisJobDescription.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (mediaAnalysisJobDescription.getResults() != null) {
            MediaAnalysisResults results = mediaAnalysisJobDescription.getResults();
            jsonWriter.name("Results");
            MediaAnalysisResultsJsonMarshaller.getInstance().marshall(results, jsonWriter);
        }
        if (mediaAnalysisJobDescription.getManifestSummary() != null) {
            MediaAnalysisManifestSummary manifestSummary = mediaAnalysisJobDescription
                    .getManifestSummary();
            jsonWriter.name("ManifestSummary");
            MediaAnalysisManifestSummaryJsonMarshaller.getInstance().marshall(manifestSummary,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MediaAnalysisJobDescriptionJsonMarshaller instance;

    public static MediaAnalysisJobDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MediaAnalysisJobDescriptionJsonMarshaller();
        return instance;
    }
}
