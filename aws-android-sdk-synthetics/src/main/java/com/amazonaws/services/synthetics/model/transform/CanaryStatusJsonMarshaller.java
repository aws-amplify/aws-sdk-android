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
 * JSON marshaller for POJO CanaryStatus
 */
class CanaryStatusJsonMarshaller {

    public void marshall(CanaryStatus canaryStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (canaryStatus.getState() != null) {
            String state = canaryStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (canaryStatus.getStateReason() != null) {
            String stateReason = canaryStatus.getStateReason();
            jsonWriter.name("StateReason");
            jsonWriter.value(stateReason);
        }
        if (canaryStatus.getStateReasonCode() != null) {
            String stateReasonCode = canaryStatus.getStateReasonCode();
            jsonWriter.name("StateReasonCode");
            jsonWriter.value(stateReasonCode);
        }
        jsonWriter.endObject();
    }

    private static CanaryStatusJsonMarshaller instance;

    public static CanaryStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryStatusJsonMarshaller();
        return instance;
    }
}
