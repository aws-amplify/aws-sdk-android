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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProgressCounters
 */
class ProgressCountersJsonMarshaller {

    public void marshall(ProgressCounters progressCounters, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (progressCounters.getTotalSteps() != null) {
            Integer totalSteps = progressCounters.getTotalSteps();
            jsonWriter.name("TotalSteps");
            jsonWriter.value(totalSteps);
        }
        if (progressCounters.getSuccessSteps() != null) {
            Integer successSteps = progressCounters.getSuccessSteps();
            jsonWriter.name("SuccessSteps");
            jsonWriter.value(successSteps);
        }
        if (progressCounters.getFailedSteps() != null) {
            Integer failedSteps = progressCounters.getFailedSteps();
            jsonWriter.name("FailedSteps");
            jsonWriter.value(failedSteps);
        }
        if (progressCounters.getCancelledSteps() != null) {
            Integer cancelledSteps = progressCounters.getCancelledSteps();
            jsonWriter.name("CancelledSteps");
            jsonWriter.value(cancelledSteps);
        }
        if (progressCounters.getTimedOutSteps() != null) {
            Integer timedOutSteps = progressCounters.getTimedOutSteps();
            jsonWriter.name("TimedOutSteps");
            jsonWriter.value(timedOutSteps);
        }
        jsonWriter.endObject();
    }

    private static ProgressCountersJsonMarshaller instance;
    public static ProgressCountersJsonMarshaller getInstance() {
        if (instance == null) instance = new ProgressCountersJsonMarshaller();
        return instance;
    }
}
