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
 * JSON marshaller for POJO TrainingJobSummary
 */
class TrainingJobSummaryJsonMarshaller {

    public void marshall(TrainingJobSummary trainingJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trainingJobSummary.getTrainingJobName() != null) {
            String trainingJobName = trainingJobSummary.getTrainingJobName();
            jsonWriter.name("TrainingJobName");
            jsonWriter.value(trainingJobName);
        }
        if (trainingJobSummary.getTrainingJobArn() != null) {
            String trainingJobArn = trainingJobSummary.getTrainingJobArn();
            jsonWriter.name("TrainingJobArn");
            jsonWriter.value(trainingJobArn);
        }
        if (trainingJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = trainingJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (trainingJobSummary.getTrainingEndTime() != null) {
            java.util.Date trainingEndTime = trainingJobSummary.getTrainingEndTime();
            jsonWriter.name("TrainingEndTime");
            jsonWriter.value(trainingEndTime);
        }
        if (trainingJobSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = trainingJobSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (trainingJobSummary.getTrainingJobStatus() != null) {
            String trainingJobStatus = trainingJobSummary.getTrainingJobStatus();
            jsonWriter.name("TrainingJobStatus");
            jsonWriter.value(trainingJobStatus);
        }
        jsonWriter.endObject();
    }

    private static TrainingJobSummaryJsonMarshaller instance;

    public static TrainingJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrainingJobSummaryJsonMarshaller();
        return instance;
    }
}
