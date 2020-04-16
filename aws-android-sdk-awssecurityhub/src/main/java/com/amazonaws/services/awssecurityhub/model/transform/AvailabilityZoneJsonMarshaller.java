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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AvailabilityZone
 */
class AvailabilityZoneJsonMarshaller {

    public void marshall(AvailabilityZone availabilityZone, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (availabilityZone.getZoneName() != null) {
            String zoneName = availabilityZone.getZoneName();
            jsonWriter.name("ZoneName");
            jsonWriter.value(zoneName);
        }
        if (availabilityZone.getSubnetId() != null) {
            String subnetId = availabilityZone.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        jsonWriter.endObject();
    }

    private static AvailabilityZoneJsonMarshaller instance;

    public static AvailabilityZoneJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AvailabilityZoneJsonMarshaller();
        return instance;
    }
}
