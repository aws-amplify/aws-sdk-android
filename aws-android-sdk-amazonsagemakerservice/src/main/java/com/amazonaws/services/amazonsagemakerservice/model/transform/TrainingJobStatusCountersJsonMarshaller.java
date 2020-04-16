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
 * JSON marshaller for POJO TrainingJobStatusCounters
 */
class TrainingJobStatusCountersJsonMarshaller {

    public void marshall(TrainingJobStatusCounters trainingJobStatusCounters,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trainingJobStatusCounters.getCompleted() != null) {
            Integer completed = trainingJobStatusCounters.getCompleted();
            jsonWriter.name("Completed");
            jsonWriter.value(completed);
        }
        if (trainingJobStatusCounters.getInProgress() != null) {
            Integer inProgress = trainingJobStatusCounters.getInProgress();
            jsonWriter.name("InProgress");
            jsonWriter.value(inProgress);
        }
        if (trainingJobStatusCounters.getRetryableError() != null) {
            Integer retryableError = trainingJobStatusCounters.getRetryableError();
            jsonWriter.name("RetryableError");
            jsonWriter.value(retryableError);
        }
        if (trainingJobStatusCounters.getNonRetryableError() != null) {
            Integer nonRetryableError = trainingJobStatusCounters.getNonRetryableError();
            jsonWriter.name("NonRetryableError");
            jsonWriter.value(nonRetryableError);
        }
        if (trainingJobStatusCounters.getStopped() != null) {
            Integer stopped = trainingJobStatusCounters.getStopped();
            jsonWriter.name("Stopped");
            jsonWriter.value(stopped);
        }
        jsonWriter.endObject();
    }

    private static TrainingJobStatusCountersJsonMarshaller instance;

    public static TrainingJobStatusCountersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrainingJobStatusCountersJsonMarshaller();
        return instance;
    }
}
