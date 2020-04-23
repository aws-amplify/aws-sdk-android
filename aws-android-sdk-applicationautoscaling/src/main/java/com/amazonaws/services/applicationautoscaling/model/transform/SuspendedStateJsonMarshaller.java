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

package com.amazonaws.services.applicationautoscaling.model.transform;

import com.amazonaws.services.applicationautoscaling.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SuspendedState
 */
class SuspendedStateJsonMarshaller {

    public void marshall(SuspendedState suspendedState, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (suspendedState.getDynamicScalingInSuspended() != null) {
            Boolean dynamicScalingInSuspended = suspendedState.getDynamicScalingInSuspended();
            jsonWriter.name("DynamicScalingInSuspended");
            jsonWriter.value(dynamicScalingInSuspended);
        }
        if (suspendedState.getDynamicScalingOutSuspended() != null) {
            Boolean dynamicScalingOutSuspended = suspendedState.getDynamicScalingOutSuspended();
            jsonWriter.name("DynamicScalingOutSuspended");
            jsonWriter.value(dynamicScalingOutSuspended);
        }
        if (suspendedState.getScheduledScalingSuspended() != null) {
            Boolean scheduledScalingSuspended = suspendedState.getScheduledScalingSuspended();
            jsonWriter.name("ScheduledScalingSuspended");
            jsonWriter.value(scheduledScalingSuspended);
        }
        jsonWriter.endObject();
    }

    private static SuspendedStateJsonMarshaller instance;

    public static SuspendedStateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SuspendedStateJsonMarshaller();
        return instance;
    }
}
