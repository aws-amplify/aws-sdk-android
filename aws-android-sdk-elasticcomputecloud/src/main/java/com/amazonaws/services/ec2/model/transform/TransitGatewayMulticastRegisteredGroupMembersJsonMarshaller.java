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
 * JSON marshaller for POJO TransitGatewayMulticastRegisteredGroupMembers
 */
class TransitGatewayMulticastRegisteredGroupMembersJsonMarshaller {

    public void marshall(
            TransitGatewayMulticastRegisteredGroupMembers transitGatewayMulticastRegisteredGroupMembers,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayMulticastRegisteredGroupMembers.getTransitGatewayMulticastDomainId() != null) {
            String transitGatewayMulticastDomainId = transitGatewayMulticastRegisteredGroupMembers
                    .getTransitGatewayMulticastDomainId();
            jsonWriter.name("TransitGatewayMulticastDomainId");
            jsonWriter.value(transitGatewayMulticastDomainId);
        }
        if (transitGatewayMulticastRegisteredGroupMembers.getRegisteredNetworkInterfaceIds() != null) {
            java.util.List<String> registeredNetworkInterfaceIds = transitGatewayMulticastRegisteredGroupMembers
                    .getRegisteredNetworkInterfaceIds();
            jsonWriter.name("RegisteredNetworkInterfaceIds");
            jsonWriter.beginArray();
            for (String registeredNetworkInterfaceIdsItem : registeredNetworkInterfaceIds) {
                if (registeredNetworkInterfaceIdsItem != null) {
                    jsonWriter.value(registeredNetworkInterfaceIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (transitGatewayMulticastRegisteredGroupMembers.getGroupIpAddress() != null) {
            String groupIpAddress = transitGatewayMulticastRegisteredGroupMembers
                    .getGroupIpAddress();
            jsonWriter.name("GroupIpAddress");
            jsonWriter.value(groupIpAddress);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayMulticastRegisteredGroupMembersJsonMarshaller instance;

    public static TransitGatewayMulticastRegisteredGroupMembersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastRegisteredGroupMembersJsonMarshaller();
        return instance;
    }
}
