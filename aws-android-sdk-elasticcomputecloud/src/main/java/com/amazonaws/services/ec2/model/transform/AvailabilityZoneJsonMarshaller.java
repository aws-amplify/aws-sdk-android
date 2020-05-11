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
 * JSON marshaller for POJO AvailabilityZone
 */
class AvailabilityZoneJsonMarshaller {

    public void marshall(AvailabilityZone availabilityZone, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (availabilityZone.getState() != null) {
            String state = availabilityZone.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (availabilityZone.getOptInStatus() != null) {
            String optInStatus = availabilityZone.getOptInStatus();
            jsonWriter.name("OptInStatus");
            jsonWriter.value(optInStatus);
        }
        if (availabilityZone.getMessages() != null) {
            java.util.List<AvailabilityZoneMessage> messages = availabilityZone.getMessages();
            jsonWriter.name("Messages");
            jsonWriter.beginArray();
            for (AvailabilityZoneMessage messagesItem : messages) {
                if (messagesItem != null) {
                    AvailabilityZoneMessageJsonMarshaller.getInstance().marshall(messagesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (availabilityZone.getRegionName() != null) {
            String regionName = availabilityZone.getRegionName();
            jsonWriter.name("RegionName");
            jsonWriter.value(regionName);
        }
        if (availabilityZone.getZoneName() != null) {
            String zoneName = availabilityZone.getZoneName();
            jsonWriter.name("ZoneName");
            jsonWriter.value(zoneName);
        }
        if (availabilityZone.getZoneId() != null) {
            String zoneId = availabilityZone.getZoneId();
            jsonWriter.name("ZoneId");
            jsonWriter.value(zoneId);
        }
        if (availabilityZone.getGroupName() != null) {
            String groupName = availabilityZone.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (availabilityZone.getNetworkBorderGroup() != null) {
            String networkBorderGroup = availabilityZone.getNetworkBorderGroup();
            jsonWriter.name("NetworkBorderGroup");
            jsonWriter.value(networkBorderGroup);
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
