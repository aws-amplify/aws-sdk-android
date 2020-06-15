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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SmartHomeAppliance
 */
class SmartHomeApplianceJsonMarshaller {

    public void marshall(SmartHomeAppliance smartHomeAppliance, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (smartHomeAppliance.getFriendlyName() != null) {
            String friendlyName = smartHomeAppliance.getFriendlyName();
            jsonWriter.name("FriendlyName");
            jsonWriter.value(friendlyName);
        }
        if (smartHomeAppliance.getDescription() != null) {
            String description = smartHomeAppliance.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (smartHomeAppliance.getManufacturerName() != null) {
            String manufacturerName = smartHomeAppliance.getManufacturerName();
            jsonWriter.name("ManufacturerName");
            jsonWriter.value(manufacturerName);
        }
        jsonWriter.endObject();
    }

    private static SmartHomeApplianceJsonMarshaller instance;

    public static SmartHomeApplianceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SmartHomeApplianceJsonMarshaller();
        return instance;
    }
}
