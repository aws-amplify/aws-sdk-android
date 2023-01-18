/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RuleTriggerEventSource
 */
class RuleTriggerEventSourceJsonMarshaller {

    public void marshall(RuleTriggerEventSource ruleTriggerEventSource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ruleTriggerEventSource.getEventSourceName() != null) {
            String eventSourceName = ruleTriggerEventSource.getEventSourceName();
            jsonWriter.name("EventSourceName");
            jsonWriter.value(eventSourceName);
        }
        if (ruleTriggerEventSource.getIntegrationAssociationId() != null) {
            String integrationAssociationId = ruleTriggerEventSource.getIntegrationAssociationId();
            jsonWriter.name("IntegrationAssociationId");
            jsonWriter.value(integrationAssociationId);
        }
        jsonWriter.endObject();
    }

    private static RuleTriggerEventSourceJsonMarshaller instance;

    public static RuleTriggerEventSourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleTriggerEventSourceJsonMarshaller();
        return instance;
    }
}
