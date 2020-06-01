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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StepStatus
 */
class StepStatusJsonMarshaller {

    public void marshall(StepStatus stepStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stepStatus.getState() != null) {
            String state = stepStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (stepStatus.getStateChangeReason() != null) {
            StepStateChangeReason stateChangeReason = stepStatus.getStateChangeReason();
            jsonWriter.name("StateChangeReason");
            StepStateChangeReasonJsonMarshaller.getInstance().marshall(stateChangeReason,
                    jsonWriter);
        }
        if (stepStatus.getFailureDetails() != null) {
            FailureDetails failureDetails = stepStatus.getFailureDetails();
            jsonWriter.name("FailureDetails");
            FailureDetailsJsonMarshaller.getInstance().marshall(failureDetails, jsonWriter);
        }
        if (stepStatus.getTimeline() != null) {
            StepTimeline timeline = stepStatus.getTimeline();
            jsonWriter.name("Timeline");
            StepTimelineJsonMarshaller.getInstance().marshall(timeline, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static StepStatusJsonMarshaller instance;

    public static StepStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepStatusJsonMarshaller();
        return instance;
    }
}
