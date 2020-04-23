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
 * JSON marshaller for POJO Alarm
 */
class AlarmJsonMarshaller {

    public void marshall(Alarm alarm, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (alarm.getAlarmName() != null) {
            String alarmName = alarm.getAlarmName();
            jsonWriter.name("AlarmName");
            jsonWriter.value(alarmName);
        }
        if (alarm.getAlarmARN() != null) {
            String alarmARN = alarm.getAlarmARN();
            jsonWriter.name("AlarmARN");
            jsonWriter.value(alarmARN);
        }
        jsonWriter.endObject();
    }

    private static AlarmJsonMarshaller instance;

    public static AlarmJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AlarmJsonMarshaller();
        return instance;
    }
}
