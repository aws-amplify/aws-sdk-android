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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LabelingJobSummary
 */
class LabelingJobSummaryJsonMarshaller {

    public void marshall(LabelingJobSummary labelingJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (labelingJobSummary.getLabelingJobName() != null) {
            String labelingJobName = labelingJobSummary.getLabelingJobName();
            jsonWriter.name("LabelingJobName");
            jsonWriter.value(labelingJobName);
        }
        if (labelingJobSummary.getLabelingJobArn() != null) {
            String labelingJobArn = labelingJobSummary.getLabelingJobArn();
            jsonWriter.name("LabelingJobArn");
            jsonWriter.value(labelingJobArn);
        }
        if (labelingJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = labelingJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (labelingJobSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = labelingJobSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (labelingJobSummary.getLabelingJobStatus() != null) {
            String labelingJobStatus = labelingJobSummary.getLabelingJobStatus();
            jsonWriter.name("LabelingJobStatus");
            jsonWriter.value(labelingJobStatus);
        }
        if (labelingJobSummary.getLabelCounters() != null) {
            LabelCounters labelCounters = labelingJobSummary.getLabelCounters();
            jsonWriter.name("LabelCounters");
            LabelCountersJsonMarshaller.getInstance().marshall(labelCounters, jsonWriter);
        }
        if (labelingJobSummary.getWorkteamArn() != null) {
            String workteamArn = labelingJobSummary.getWorkteamArn();
            jsonWriter.name("WorkteamArn");
            jsonWriter.value(workteamArn);
        }
        if (labelingJobSummary.getPreHumanTaskLambdaArn() != null) {
            String preHumanTaskLambdaArn = labelingJobSummary.getPreHumanTaskLambdaArn();
            jsonWriter.name("PreHumanTaskLambdaArn");
            jsonWriter.value(preHumanTaskLambdaArn);
        }
        if (labelingJobSummary.getAnnotationConsolidationLambdaArn() != null) {
            String annotationConsolidationLambdaArn = labelingJobSummary
                    .getAnnotationConsolidationLambdaArn();
            jsonWriter.name("AnnotationConsolidationLambdaArn");
            jsonWriter.value(annotationConsolidationLambdaArn);
        }
        if (labelingJobSummary.getFailureReason() != null) {
            String failureReason = labelingJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (labelingJobSummary.getLabelingJobOutput() != null) {
            LabelingJobOutput labelingJobOutput = labelingJobSummary.getLabelingJobOutput();
            jsonWriter.name("LabelingJobOutput");
            LabelingJobOutputJsonMarshaller.getInstance().marshall(labelingJobOutput, jsonWriter);
        }
        if (labelingJobSummary.getInputConfig() != null) {
            LabelingJobInputConfig inputConfig = labelingJobSummary.getInputConfig();
            jsonWriter.name("InputConfig");
            LabelingJobInputConfigJsonMarshaller.getInstance().marshall(inputConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LabelingJobSummaryJsonMarshaller instance;

    public static LabelingJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobSummaryJsonMarshaller();
        return instance;
    }
}
