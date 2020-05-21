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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TrafficMirrorTarget
 */
class TrafficMirrorTargetJsonUnmarshaller implements
        Unmarshaller<TrafficMirrorTarget, JsonUnmarshallerContext> {

    public TrafficMirrorTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrafficMirrorTarget trafficMirrorTarget = new TrafficMirrorTarget();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrafficMirrorTargetId")) {
                trafficMirrorTarget.setTrafficMirrorTargetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                trafficMirrorTarget.setNetworkInterfaceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkLoadBalancerArn")) {
                trafficMirrorTarget.setNetworkLoadBalancerArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                trafficMirrorTarget.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                trafficMirrorTarget.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                trafficMirrorTarget.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                trafficMirrorTarget.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trafficMirrorTarget;
    }

    private static TrafficMirrorTargetJsonUnmarshaller instance;

    public static TrafficMirrorTargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrafficMirrorTargetJsonUnmarshaller();
        return instance;
    }
}
