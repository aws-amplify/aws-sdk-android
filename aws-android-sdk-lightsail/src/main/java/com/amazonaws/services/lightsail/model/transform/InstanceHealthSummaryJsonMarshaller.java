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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceHealthSummary
 */
class InstanceHealthSummaryJsonMarshaller {

    public void marshall(InstanceHealthSummary instanceHealthSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceHealthSummary.getInstanceName() != null) {
            String instanceName = instanceHealthSummary.getInstanceName();
            jsonWriter.name("instanceName");
            jsonWriter.value(instanceName);
        }
        if (instanceHealthSummary.getInstanceHealth() != null) {
            String instanceHealth = instanceHealthSummary.getInstanceHealth();
            jsonWriter.name("instanceHealth");
            jsonWriter.value(instanceHealth);
        }
        if (instanceHealthSummary.getInstanceHealthReason() != null) {
            String instanceHealthReason = instanceHealthSummary.getInstanceHealthReason();
            jsonWriter.name("instanceHealthReason");
            jsonWriter.value(instanceHealthReason);
        }
        jsonWriter.endObject();
    }

    private static InstanceHealthSummaryJsonMarshaller instance;

    public static InstanceHealthSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceHealthSummaryJsonMarshaller();
        return instance;
    }
}
