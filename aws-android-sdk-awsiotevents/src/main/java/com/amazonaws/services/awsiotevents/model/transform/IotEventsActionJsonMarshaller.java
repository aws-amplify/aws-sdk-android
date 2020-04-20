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
 * JSON marshaller for POJO IotEventsAction
 */
class IotEventsActionJsonMarshaller {

    public void marshall(IotEventsAction iotEventsAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (iotEventsAction.getInputName() != null) {
            String inputName = iotEventsAction.getInputName();
            jsonWriter.name("inputName");
            jsonWriter.value(inputName);
        }
        if (iotEventsAction.getPayload() != null) {
            Payload payload = iotEventsAction.getPayload();
            jsonWriter.name("payload");
            PayloadJsonMarshaller.getInstance().marshall(payload, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static IotEventsActionJsonMarshaller instance;

    public static IotEventsActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IotEventsActionJsonMarshaller();
        return instance;
    }
}
