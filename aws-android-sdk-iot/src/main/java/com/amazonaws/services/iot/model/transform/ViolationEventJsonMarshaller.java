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
 * JSON marshaller for POJO ViolationEvent
 */
class ViolationEventJsonMarshaller {

    public void marshall(ViolationEvent violationEvent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (violationEvent.getViolationId() != null) {
            String violationId = violationEvent.getViolationId();
            jsonWriter.name("violationId");
            jsonWriter.value(violationId);
        }
        if (violationEvent.getThingName() != null) {
            String thingName = violationEvent.getThingName();
            jsonWriter.name("thingName");
            jsonWriter.value(thingName);
        }
        if (violationEvent.getSecurityProfileName() != null) {
            String securityProfileName = violationEvent.getSecurityProfileName();
            jsonWriter.name("securityProfileName");
            jsonWriter.value(securityProfileName);
        }
        if (violationEvent.getBehavior() != null) {
            Behavior behavior = violationEvent.getBehavior();
            jsonWriter.name("behavior");
            BehaviorJsonMarshaller.getInstance().marshall(behavior, jsonWriter);
        }
        if (violationEvent.getMetricValue() != null) {
            MetricValue metricValue = violationEvent.getMetricValue();
            jsonWriter.name("metricValue");
            MetricValueJsonMarshaller.getInstance().marshall(metricValue, jsonWriter);
        }
        if (violationEvent.getViolationEventType() != null) {
            String violationEventType = violationEvent.getViolationEventType();
            jsonWriter.name("violationEventType");
            jsonWriter.value(violationEventType);
        }
        if (violationEvent.getViolationEventTime() != null) {
            java.util.Date violationEventTime = violationEvent.getViolationEventTime();
            jsonWriter.name("violationEventTime");
            jsonWriter.value(violationEventTime);
        }
        jsonWriter.endObject();
    }

    private static ViolationEventJsonMarshaller instance;

    public static ViolationEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ViolationEventJsonMarshaller();
        return instance;
    }
}
