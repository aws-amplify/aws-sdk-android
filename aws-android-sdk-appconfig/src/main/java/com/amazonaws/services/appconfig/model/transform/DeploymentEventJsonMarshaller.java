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

package com.amazonaws.services.appconfig.model.transform;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DeploymentEvent
 */
class DeploymentEventJsonMarshaller {

    public void marshall(DeploymentEvent deploymentEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (deploymentEvent.getEventType() != null) {
            String eventType = deploymentEvent.getEventType();
            jsonWriter.name("EventType");
            jsonWriter.value(eventType);
        }
        if (deploymentEvent.getTriggeredBy() != null) {
            String triggeredBy = deploymentEvent.getTriggeredBy();
            jsonWriter.name("TriggeredBy");
            jsonWriter.value(triggeredBy);
        }
        if (deploymentEvent.getDescription() != null) {
            String description = deploymentEvent.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (deploymentEvent.getOccurredAt() != null) {
            java.util.Date occurredAt = deploymentEvent.getOccurredAt();
            jsonWriter.name("OccurredAt");
            jsonWriter.value(occurredAt);
        }
        jsonWriter.endObject();
    }

    private static DeploymentEventJsonMarshaller instance;

    public static DeploymentEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentEventJsonMarshaller();
        return instance;
    }
}
