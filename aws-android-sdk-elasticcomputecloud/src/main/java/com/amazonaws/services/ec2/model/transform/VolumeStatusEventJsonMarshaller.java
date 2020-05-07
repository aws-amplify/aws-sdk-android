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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VolumeStatusEvent
 */
class VolumeStatusEventJsonMarshaller {

    public void marshall(VolumeStatusEvent volumeStatusEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (volumeStatusEvent.getDescription() != null) {
            String description = volumeStatusEvent.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (volumeStatusEvent.getEventId() != null) {
            String eventId = volumeStatusEvent.getEventId();
            jsonWriter.name("EventId");
            jsonWriter.value(eventId);
        }
        if (volumeStatusEvent.getEventType() != null) {
            String eventType = volumeStatusEvent.getEventType();
            jsonWriter.name("EventType");
            jsonWriter.value(eventType);
        }
        if (volumeStatusEvent.getNotAfter() != null) {
            java.util.Date notAfter = volumeStatusEvent.getNotAfter();
            jsonWriter.name("NotAfter");
            jsonWriter.value(notAfter);
        }
        if (volumeStatusEvent.getNotBefore() != null) {
            java.util.Date notBefore = volumeStatusEvent.getNotBefore();
            jsonWriter.name("NotBefore");
            jsonWriter.value(notBefore);
        }
        if (volumeStatusEvent.getInstanceId() != null) {
            String instanceId = volumeStatusEvent.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        jsonWriter.endObject();
    }

    private static VolumeStatusEventJsonMarshaller instance;

    public static VolumeStatusEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeStatusEventJsonMarshaller();
        return instance;
    }
}
