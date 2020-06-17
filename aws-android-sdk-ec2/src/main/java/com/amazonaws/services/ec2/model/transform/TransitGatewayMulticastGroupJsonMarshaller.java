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
 * JSON marshaller for POJO TransitGatewayMulticastGroup
 */
class TransitGatewayMulticastGroupJsonMarshaller {

    public void marshall(TransitGatewayMulticastGroup transitGatewayMulticastGroup,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayMulticastGroup.getGroupIpAddress() != null) {
            String groupIpAddress = transitGatewayMulticastGroup.getGroupIpAddress();
            jsonWriter.name("GroupIpAddress");
            jsonWriter.value(groupIpAddress);
        }
        if (transitGatewayMulticastGroup.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayMulticastGroup
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayMulticastGroup.getSubnetId() != null) {
            String subnetId = transitGatewayMulticastGroup.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (transitGatewayMulticastGroup.getResourceId() != null) {
            String resourceId = transitGatewayMulticastGroup.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (transitGatewayMulticastGroup.getResourceType() != null) {
            String resourceType = transitGatewayMulticastGroup.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (transitGatewayMulticastGroup.getNetworkInterfaceId() != null) {
            String networkInterfaceId = transitGatewayMulticastGroup.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (transitGatewayMulticastGroup.getGroupMember() != null) {
            Boolean groupMember = transitGatewayMulticastGroup.getGroupMember();
            jsonWriter.name("GroupMember");
            jsonWriter.value(groupMember);
        }
        if (transitGatewayMulticastGroup.getGroupSource() != null) {
            Boolean groupSource = transitGatewayMulticastGroup.getGroupSource();
            jsonWriter.name("GroupSource");
            jsonWriter.value(groupSource);
        }
        if (transitGatewayMulticastGroup.getMemberType() != null) {
            String memberType = transitGatewayMulticastGroup.getMemberType();
            jsonWriter.name("MemberType");
            jsonWriter.value(memberType);
        }
        if (transitGatewayMulticastGroup.getSourceType() != null) {
            String sourceType = transitGatewayMulticastGroup.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayMulticastGroupJsonMarshaller instance;

    public static TransitGatewayMulticastGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastGroupJsonMarshaller();
        return instance;
    }
}
