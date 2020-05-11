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
 * JSON marshaller for POJO TrafficMirrorTarget
 */
class TrafficMirrorTargetJsonMarshaller {

    public void marshall(TrafficMirrorTarget trafficMirrorTarget, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trafficMirrorTarget.getTrafficMirrorTargetId() != null) {
            String trafficMirrorTargetId = trafficMirrorTarget.getTrafficMirrorTargetId();
            jsonWriter.name("TrafficMirrorTargetId");
            jsonWriter.value(trafficMirrorTargetId);
        }
        if (trafficMirrorTarget.getNetworkInterfaceId() != null) {
            String networkInterfaceId = trafficMirrorTarget.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (trafficMirrorTarget.getNetworkLoadBalancerArn() != null) {
            String networkLoadBalancerArn = trafficMirrorTarget.getNetworkLoadBalancerArn();
            jsonWriter.name("NetworkLoadBalancerArn");
            jsonWriter.value(networkLoadBalancerArn);
        }
        if (trafficMirrorTarget.getType() != null) {
            String type = trafficMirrorTarget.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (trafficMirrorTarget.getDescription() != null) {
            String description = trafficMirrorTarget.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (trafficMirrorTarget.getOwnerId() != null) {
            String ownerId = trafficMirrorTarget.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (trafficMirrorTarget.getTags() != null) {
            java.util.List<Tag> tags = trafficMirrorTarget.getTags();
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

    private static TrafficMirrorTargetJsonMarshaller instance;

    public static TrafficMirrorTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorTargetJsonMarshaller();
        return instance;
    }
}
