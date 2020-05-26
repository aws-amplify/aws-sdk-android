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
 * JSON unmarshaller for POJO TransitGatewayMulticastGroup
 */
class TransitGatewayMulticastGroupJsonUnmarshaller implements
        Unmarshaller<TransitGatewayMulticastGroup, JsonUnmarshallerContext> {

    public TransitGatewayMulticastGroup unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransitGatewayMulticastGroup transitGatewayMulticastGroup = new TransitGatewayMulticastGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GroupIpAddress")) {
                transitGatewayMulticastGroup.setGroupIpAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransitGatewayAttachmentId")) {
                transitGatewayMulticastGroup.setTransitGatewayAttachmentId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetId")) {
                transitGatewayMulticastGroup.setSubnetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                transitGatewayMulticastGroup.setResourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                transitGatewayMulticastGroup.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInterfaceId")) {
                transitGatewayMulticastGroup.setNetworkInterfaceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupMember")) {
                transitGatewayMulticastGroup.setGroupMember(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupSource")) {
                transitGatewayMulticastGroup.setGroupSource(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MemberType")) {
                transitGatewayMulticastGroup.setMemberType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceType")) {
                transitGatewayMulticastGroup.setSourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transitGatewayMulticastGroup;
    }

    private static TransitGatewayMulticastGroupJsonUnmarshaller instance;

    public static TransitGatewayMulticastGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastGroupJsonUnmarshaller();
        return instance;
    }
}
