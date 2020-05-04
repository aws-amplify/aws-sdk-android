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
 * JSON marshaller for POJO TrafficMirrorSession
 */
class TrafficMirrorSessionJsonMarshaller {

    public void marshall(TrafficMirrorSession trafficMirrorSession, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trafficMirrorSession.getTrafficMirrorSessionId() != null) {
            String trafficMirrorSessionId = trafficMirrorSession.getTrafficMirrorSessionId();
            jsonWriter.name("TrafficMirrorSessionId");
            jsonWriter.value(trafficMirrorSessionId);
        }
        if (trafficMirrorSession.getTrafficMirrorTargetId() != null) {
            String trafficMirrorTargetId = trafficMirrorSession.getTrafficMirrorTargetId();
            jsonWriter.name("TrafficMirrorTargetId");
            jsonWriter.value(trafficMirrorTargetId);
        }
        if (trafficMirrorSession.getTrafficMirrorFilterId() != null) {
            String trafficMirrorFilterId = trafficMirrorSession.getTrafficMirrorFilterId();
            jsonWriter.name("TrafficMirrorFilterId");
            jsonWriter.value(trafficMirrorFilterId);
        }
        if (trafficMirrorSession.getNetworkInterfaceId() != null) {
            String networkInterfaceId = trafficMirrorSession.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (trafficMirrorSession.getOwnerId() != null) {
            String ownerId = trafficMirrorSession.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (trafficMirrorSession.getPacketLength() != null) {
            Integer packetLength = trafficMirrorSession.getPacketLength();
            jsonWriter.name("PacketLength");
            jsonWriter.value(packetLength);
        }
        if (trafficMirrorSession.getSessionNumber() != null) {
            Integer sessionNumber = trafficMirrorSession.getSessionNumber();
            jsonWriter.name("SessionNumber");
            jsonWriter.value(sessionNumber);
        }
        if (trafficMirrorSession.getVirtualNetworkId() != null) {
            Integer virtualNetworkId = trafficMirrorSession.getVirtualNetworkId();
            jsonWriter.name("VirtualNetworkId");
            jsonWriter.value(virtualNetworkId);
        }
        if (trafficMirrorSession.getDescription() != null) {
            String description = trafficMirrorSession.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (trafficMirrorSession.getTags() != null) {
            java.util.List<Tag> tags = trafficMirrorSession.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrafficMirrorSessionJsonMarshaller instance;

    public static TrafficMirrorSessionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorSessionJsonMarshaller();
        return instance;
    }
}
