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
 * JSON marshaller for POJO HyperParameterTrainingJobSummary
 */
class HyperParameterTrainingJobSummaryJsonMarshaller {

    public void marshall(HyperParameterTrainingJobSummary hyperParameterTrainingJobSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hyperParameterTrainingJobSummary.getTrainingJobDefinitionName() != null) {
            String trainingJobDefinitionName = hyperParameterTrainingJobSummary
                    .getTrainingJobDefinitionName();
            jsonWriter.name("TrainingJobDefinitionName");
            jsonWriter.value(trainingJobDefinitionName);
        }
        if (hyperParameterTrainingJobSummary.getTrainingJobName() != null) {
            String trainingJobName = hyperParameterTrainingJobSummary.getTrainingJobName();
            jsonWriter.name("TrainingJobName");
            jsonWriter.value(trainingJobName);
        }
        if (hyperParameterTrainingJobSummary.getTrainingJobArn() != null) {
            String trainingJobArn = hyperParameterTrainingJobSummary.getTrainingJobArn();
            jsonWriter.name("TrainingJobArn");
            jsonWriter.value(trainingJobArn);
        }
        if (hyperParameterTrainingJobSummary.getTuningJobName() != null) {
            String tuningJobName = hyperParameterTrainingJobSummary.getTuningJobName();
            jsonWriter.name("TuningJobName");
            jsonWriter.value(tuningJobName);
        }
        if (hyperParameterTrainingJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = hyperParameterTrainingJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (hyperParameterTrainingJobSummary.getTrainingStartTime() != null) {
            java.util.Date trainingStartTime = hyperParameterTrainingJobSummary
                    .getTrainingStartTime();
            jsonWriter.name("TrainingStartTime");
            jsonWriter.value(trainingStartTime);
        }
        if (hyperParameterTrainingJobSummary.getTrainingEndTime() != null) {
            java.util.Date trainingEndTime = hyperParameterTrainingJobSummary.getTrainingEndTime();
            jsonWriter.name("TrainingEndTime");
            jsonWriter.value(trainingEndTime);
        }
        if (hyperParameterTrainingJobSummary.getTrainingJobStatus() != null) {
            String trainingJobStatus = hyperParameterTrainingJobSummary.getTrainingJobStatus();
            jsonWriter.name("TrainingJobStatus");
            jsonWriter.value(trainingJobStatus);
        }
        if (hyperParameterTrainingJobSummary.getTunedHyperParameters() != null) {
            java.util.Map<String, String> tunedHyperParameters = hyperParameterTrainingJobSummary
                    .getTunedHyperParameters();
            jsonWriter.name("TunedHyperParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tunedHyperParametersEntry : tunedHyperParameters
                    .entrySet()) {
                String tunedHyperParametersValue = tunedHyperParametersEntry.getValue();
                if (tunedHyperParametersValue != null) {
                    jsonWriter.name(tunedHyperParametersEntry.getKey());
                    jsonWriter.value(tunedHyperParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (hyperParameterTrainingJobSummary.getFailureReason() != null) {
            String failureReason = hyperParameterTrainingJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (hyperParameterTrainingJobSummary.getFinalHyperParameterTuningJobObjectiveMetric() != null) {
            FinalHyperParameterTuningJobObjectiveMetric finalHyperParameterTuningJobObjectiveMetric = hyperParameterTrainingJobSummary
                    .getFinalHyperParameterTuningJobObjectiveMetric();
            jsonWriter.name("FinalHyperParameterTuningJobObjectiveMetric");
            FinalHyperParameterTuningJobObjectiveMetricJsonMarshaller.getInstance().marshall(
                    finalHyperParameterTuningJobObjectiveMetric, jsonWriter);
        }
        if (hyperParameterTrainingJobSummary.getObjectiveStatus() != null) {
            String objectiveStatus = hyperParameterTrainingJobSummary.getObjectiveStatus();
            jsonWriter.name("ObjectiveStatus");
            jsonWriter.value(objectiveStatus);
        }
        jsonWriter.endObject();
    }

    private static HyperParameterTrainingJobSummaryJsonMarshaller instance;

    public static HyperParameterTrainingJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTrainingJobSummaryJsonMarshaller();
        return instance;
    }
}
