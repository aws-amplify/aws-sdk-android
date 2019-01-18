/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CloudwatchAlarmAction
 */
class CloudwatchAlarmActionJsonMarshaller {

    public void marshall(CloudwatchAlarmAction cloudwatchAlarmAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cloudwatchAlarmAction.getRoleArn() != null) {
            String roleArn = cloudwatchAlarmAction.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        if (cloudwatchAlarmAction.getAlarmName() != null) {
            String alarmName = cloudwatchAlarmAction.getAlarmName();
            jsonWriter.name("alarmName");
            jsonWriter.value(alarmName);
        }
        if (cloudwatchAlarmAction.getStateReason() != null) {
            String stateReason = cloudwatchAlarmAction.getStateReason();
            jsonWriter.name("stateReason");
            jsonWriter.value(stateReason);
        }
        if (cloudwatchAlarmAction.getStateValue() != null) {
            String stateValue = cloudwatchAlarmAction.getStateValue();
            jsonWriter.name("stateValue");
            jsonWriter.value(stateValue);
        }
        jsonWriter.endObject();
    }

    private static CloudwatchAlarmActionJsonMarshaller instance;

    public static CloudwatchAlarmActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudwatchAlarmActionJsonMarshaller();
        return instance;
    }
}
