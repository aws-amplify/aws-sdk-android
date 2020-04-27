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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HyperParameterTuningJobSummary
 */
class HyperParameterTuningJobSummaryJsonMarshaller {

    public void marshall(HyperParameterTuningJobSummary hyperParameterTuningJobSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hyperParameterTuningJobSummary.getHyperParameterTuningJobName() != null) {
            String hyperParameterTuningJobName = hyperParameterTuningJobSummary
                    .getHyperParameterTuningJobName();
            jsonWriter.name("HyperParameterTuningJobName");
            jsonWriter.value(hyperParameterTuningJobName);
        }
        if (hyperParameterTuningJobSummary.getHyperParameterTuningJobArn() != null) {
            String hyperParameterTuningJobArn = hyperParameterTuningJobSummary
                    .getHyperParameterTuningJobArn();
            jsonWriter.name("HyperParameterTuningJobArn");
            jsonWriter.value(hyperParameterTuningJobArn);
        }
        if (hyperParameterTuningJobSummary.getHyperParameterTuningJobStatus() != null) {
            String hyperParameterTuningJobStatus = hyperParameterTuningJobSummary
                    .getHyperParameterTuningJobStatus();
            jsonWriter.name("HyperParameterTuningJobStatus");
            jsonWriter.value(hyperParameterTuningJobStatus);
        }
        if (hyperParameterTuningJobSummary.getStrategy() != null) {
            String strategy = hyperParameterTuningJobSummary.getStrategy();
            jsonWriter.name("Strategy");
            jsonWriter.value(strategy);
        }
        if (hyperParameterTuningJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = hyperParameterTuningJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (hyperParameterTuningJobSummary.getHyperParameterTuningEndTime() != null) {
            java.util.Date hyperParameterTuningEndTime = hyperParameterTuningJobSummary
                    .getHyperParameterTuningEndTime();
            jsonWriter.name("HyperParameterTuningEndTime");
            jsonWriter.value(hyperParameterTuningEndTime);
        }
        if (hyperParameterTuningJobSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = hyperParameterTuningJobSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (hyperParameterTuningJobSummary.getTrainingJobStatusCounters() != null) {
            TrainingJobStatusCounters trainingJobStatusCounters = hyperParameterTuningJobSummary
                    .getTrainingJobStatusCounters();
            jsonWriter.name("TrainingJobStatusCounters");
            TrainingJobStatusCountersJsonMarshaller.getInstance().marshall(
                    trainingJobStatusCounters, jsonWriter);
        }
        if (hyperParameterTuningJobSummary.getObjectiveStatusCounters() != null) {
            ObjectiveStatusCounters objectiveStatusCounters = hyperParameterTuningJobSummary
                    .getObjectiveStatusCounters();
            jsonWriter.name("ObjectiveStatusCounters");
            ObjectiveStatusCountersJsonMarshaller.getInstance().marshall(objectiveStatusCounters,
                    jsonWriter);
        }
        if (hyperParameterTuningJobSummary.getResourceLimits() != null) {
            ResourceLimits resourceLimits = hyperParameterTuningJobSummary.getResourceLimits();
            jsonWriter.name("ResourceLimits");
            ResourceLimitsJsonMarshaller.getInstance().marshall(resourceLimits, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HyperParameterTuningJobSummaryJsonMarshaller instance;

    public static HyperParameterTuningJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTuningJobSummaryJsonMarshaller();
        return instance;
    }
}
