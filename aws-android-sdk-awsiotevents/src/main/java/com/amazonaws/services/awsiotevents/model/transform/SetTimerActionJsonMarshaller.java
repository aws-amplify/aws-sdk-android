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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SetTimerAction
 */
class SetTimerActionJsonMarshaller {

    public void marshall(SetTimerAction setTimerAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (setTimerAction.getTimerName() != null) {
            String timerName = setTimerAction.getTimerName();
            jsonWriter.name("timerName");
            jsonWriter.value(timerName);
        }
        if (setTimerAction.getSeconds() != null) {
            Integer seconds = setTimerAction.getSeconds();
            jsonWriter.name("seconds");
            jsonWriter.value(seconds);
        }
        if (setTimerAction.getDurationExpression() != null) {
            String durationExpression = setTimerAction.getDurationExpression();
            jsonWriter.name("durationExpression");
            jsonWriter.value(durationExpression);
        }
        jsonWriter.endObject();
    }

    private static SetTimerActionJsonMarshaller instance;

    public static SetTimerActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SetTimerActionJsonMarshaller();
        return instance;
    }
}
