/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ProjectVersionDescription
 */
class ProjectVersionDescriptionJsonMarshaller {

    public void marshall(ProjectVersionDescription projectVersionDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (projectVersionDescription.getProjectVersionArn() != null) {
            String projectVersionArn = projectVersionDescription.getProjectVersionArn();
            jsonWriter.name("ProjectVersionArn");
            jsonWriter.value(projectVersionArn);
        }
        if (projectVersionDescription.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = projectVersionDescription.getCreationTimestamp();
            jsonWriter.name("CreationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (projectVersionDescription.getMinInferenceUnits() != null) {
            Integer minInferenceUnits = projectVersionDescription.getMinInferenceUnits();
            jsonWriter.name("MinInferenceUnits");
            jsonWriter.value(minInferenceUnits);
        }
        if (projectVersionDescription.getStatus() != null) {
            String status = projectVersionDescription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (projectVersionDescription.getStatusMessage() != null) {
            String statusMessage = projectVersionDescription.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (projectVersionDescription.getBillableTrainingTimeInSeconds() != null) {
            Long billableTrainingTimeInSeconds = projectVersionDescription
                    .getBillableTrainingTimeInSeconds();
            jsonWriter.name("BillableTrainingTimeInSeconds");
            jsonWriter.value(billableTrainingTimeInSeconds);
        }
        if (projectVersionDescription.getTrainingEndTimestamp() != null) {
            java.util.Date trainingEndTimestamp = projectVersionDescription
                    .getTrainingEndTimestamp();
            jsonWriter.name("TrainingEndTimestamp");
            jsonWriter.value(trainingEndTimestamp);
        }
        if (projectVersionDescription.getOutputConfig() != null) {
            OutputConfig outputConfig = projectVersionDescription.getOutputConfig();
            jsonWriter.name("OutputConfig");
            OutputConfigJsonMarshaller.getInstance().marshall(outputConfig, jsonWriter);
        }
        if (projectVersionDescription.getTrainingDataResult() != null) {
            TrainingDataResult trainingDataResult = projectVersionDescription
                    .getTrainingDataResult();
            jsonWriter.name("TrainingDataResult");
            TrainingDataResultJsonMarshaller.getInstance().marshall(trainingDataResult, jsonWriter);
        }
        if (projectVersionDescription.getTestingDataResult() != null) {
            TestingDataResult testingDataResult = projectVersionDescription.getTestingDataResult();
            jsonWriter.name("TestingDataResult");
            TestingDataResultJsonMarshaller.getInstance().marshall(testingDataResult, jsonWriter);
        }
        if (projectVersionDescription.getEvaluationResult() != null) {
            EvaluationResult evaluationResult = projectVersionDescription.getEvaluationResult();
            jsonWriter.name("EvaluationResult");
            EvaluationResultJsonMarshaller.getInstance().marshall(evaluationResult, jsonWriter);
        }
        if (projectVersionDescription.getManifestSummary() != null) {
            GroundTruthManifest manifestSummary = projectVersionDescription.getManifestSummary();
            jsonWriter.name("ManifestSummary");
            GroundTruthManifestJsonMarshaller.getInstance().marshall(manifestSummary, jsonWriter);
        }
        if (projectVersionDescription.getKmsKeyId() != null) {
            String kmsKeyId = projectVersionDescription.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        jsonWriter.endObject();
    }

    private static ProjectVersionDescriptionJsonMarshaller instance;

    public static ProjectVersionDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectVersionDescriptionJsonMarshaller();
        return instance;
    }
}
