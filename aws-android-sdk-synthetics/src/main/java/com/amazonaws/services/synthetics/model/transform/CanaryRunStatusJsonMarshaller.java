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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CanaryRunStatus
 */
class CanaryRunStatusJsonMarshaller {

    public void marshall(CanaryRunStatus canaryRunStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (canaryRunStatus.getState() != null) {
            String state = canaryRunStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (canaryRunStatus.getStateReason() != null) {
            String stateReason = canaryRunStatus.getStateReason();
            jsonWriter.name("StateReason");
            jsonWriter.value(stateReason);
        }
        if (canaryRunStatus.getStateReasonCode() != null) {
            String stateReasonCode = canaryRunStatus.getStateReasonCode();
            jsonWriter.name("StateReasonCode");
            jsonWriter.value(stateReasonCode);
        }
        jsonWriter.endObject();
    }

    private static CanaryRunStatusJsonMarshaller instance;

    public static CanaryRunStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryRunStatusJsonMarshaller();
        return instance;
    }
}
