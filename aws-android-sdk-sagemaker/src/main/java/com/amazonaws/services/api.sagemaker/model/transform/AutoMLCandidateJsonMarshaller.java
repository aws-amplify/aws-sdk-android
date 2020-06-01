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
 * JSON marshaller for POJO AutoMLCandidate
 */
class AutoMLCandidateJsonMarshaller {

    public void marshall(AutoMLCandidate autoMLCandidate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (autoMLCandidate.getCandidateName() != null) {
            String candidateName = autoMLCandidate.getCandidateName();
            jsonWriter.name("CandidateName");
            jsonWriter.value(candidateName);
        }
        if (autoMLCandidate.getFinalAutoMLJobObjectiveMetric() != null) {
            FinalAutoMLJobObjectiveMetric finalAutoMLJobObjectiveMetric = autoMLCandidate
                    .getFinalAutoMLJobObjectiveMetric();
            jsonWriter.name("FinalAutoMLJobObjectiveMetric");
            FinalAutoMLJobObjectiveMetricJsonMarshaller.getInstance().marshall(
                    finalAutoMLJobObjectiveMetric, jsonWriter);
        }
        if (autoMLCandidate.getObjectiveStatus() != null) {
            String objectiveStatus = autoMLCandidate.getObjectiveStatus();
            jsonWriter.name("ObjectiveStatus");
            jsonWriter.value(objectiveStatus);
        }
        if (autoMLCandidate.getCandidateSteps() != null) {
            java.util.List<AutoMLCandidateStep> candidateSteps = autoMLCandidate
                    .getCandidateSteps();
            jsonWriter.name("CandidateSteps");
            jsonWriter.beginArray();
            for (AutoMLCandidateStep candidateStepsItem : candidateSteps) {
                if (candidateStepsItem != null) {
                    AutoMLCandidateStepJsonMarshaller.getInstance().marshall(candidateStepsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (autoMLCandidate.getCandidateStatus() != null) {
            String candidateStatus = autoMLCandidate.getCandidateStatus();
            jsonWriter.name("CandidateStatus");
            jsonWriter.value(candidateStatus);
        }
        if (autoMLCandidate.getInferenceContainers() != null) {
            java.util.List<AutoMLContainerDefinition> inferenceContainers = autoMLCandidate
                    .getInferenceContainers();
            jsonWriter.name("InferenceContainers");
            jsonWriter.beginArray();
            for (AutoMLContainerDefinition inferenceContainersItem : inferenceContainers) {
                if (inferenceContainersItem != null) {
                    AutoMLContainerDefinitionJsonMarshaller.getInstance().marshall(
                            inferenceContainersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (autoMLCandidate.getCreationTime() != null) {
            java.util.Date creationTime = autoMLCandidate.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (autoMLCandidate.getEndTime() != null) {
            java.util.Date endTime = autoMLCandidate.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (autoMLCandidate.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = autoMLCandidate.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (autoMLCandidate.getFailureReason() != null) {
            String failureReason = autoMLCandidate.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static AutoMLCandidateJsonMarshaller instance;

    public static AutoMLCandidateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLCandidateJsonMarshaller();
        return instance;
    }
}
