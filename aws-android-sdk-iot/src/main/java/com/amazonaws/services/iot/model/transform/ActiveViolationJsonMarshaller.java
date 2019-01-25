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
 * JSON marshaller for POJO ActiveViolation
 */
class ActiveViolationJsonMarshaller {

    public void marshall(ActiveViolation activeViolation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (activeViolation.getViolationId() != null) {
            String violationId = activeViolation.getViolationId();
            jsonWriter.name("violationId");
            jsonWriter.value(violationId);
        }
        if (activeViolation.getThingName() != null) {
            String thingName = activeViolation.getThingName();
            jsonWriter.name("thingName");
            jsonWriter.value(thingName);
        }
        if (activeViolation.getSecurityProfileName() != null) {
            String securityProfileName = activeViolation.getSecurityProfileName();
            jsonWriter.name("securityProfileName");
            jsonWriter.value(securityProfileName);
        }
        if (activeViolation.getBehavior() != null) {
            Behavior behavior = activeViolation.getBehavior();
            jsonWriter.name("behavior");
            BehaviorJsonMarshaller.getInstance().marshall(behavior, jsonWriter);
        }
        if (activeViolation.getLastViolationValue() != null) {
            MetricValue lastViolationValue = activeViolation.getLastViolationValue();
            jsonWriter.name("lastViolationValue");
            MetricValueJsonMarshaller.getInstance().marshall(lastViolationValue, jsonWriter);
        }
        if (activeViolation.getLastViolationTime() != null) {
            java.util.Date lastViolationTime = activeViolation.getLastViolationTime();
            jsonWriter.name("lastViolationTime");
            jsonWriter.value(lastViolationTime);
        }
        if (activeViolation.getViolationStartTime() != null) {
            java.util.Date violationStartTime = activeViolation.getViolationStartTime();
            jsonWriter.name("violationStartTime");
            jsonWriter.value(violationStartTime);
        }
        jsonWriter.endObject();
    }

    private static ActiveViolationJsonMarshaller instance;

    public static ActiveViolationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActiveViolationJsonMarshaller();
        return instance;
    }
}
