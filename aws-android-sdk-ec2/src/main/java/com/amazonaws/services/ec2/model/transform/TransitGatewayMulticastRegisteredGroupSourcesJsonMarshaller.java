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
 * JSON marshaller for POJO TransitGatewayMulticastRegisteredGroupSources
 */
class TransitGatewayMulticastRegisteredGroupSourcesJsonMarshaller {

    public void marshall(
            TransitGatewayMulticastRegisteredGroupSources transitGatewayMulticastRegisteredGroupSources,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayMulticastRegisteredGroupSources.getTransitGatewayMulticastDomainId() != null) {
            String transitGatewayMulticastDomainId = transitGatewayMulticastRegisteredGroupSources
                    .getTransitGatewayMulticastDomainId();
            jsonWriter.name("TransitGatewayMulticastDomainId");
            jsonWriter.value(transitGatewayMulticastDomainId);
        }
        if (transitGatewayMulticastRegisteredGroupSources.getRegisteredNetworkInterfaceIds() != null) {
            java.util.List<String> registeredNetworkInterfaceIds = transitGatewayMulticastRegisteredGroupSources
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
        if (transitGatewayMulticastRegisteredGroupSources.getGroupIpAddress() != null) {
            String groupIpAddress = transitGatewayMulticastRegisteredGroupSources
                    .getGroupIpAddress();
            jsonWriter.name("GroupIpAddress");
            jsonWriter.value(groupIpAddress);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayMulticastRegisteredGroupSourcesJsonMarshaller instance;

    public static TransitGatewayMulticastRegisteredGroupSourcesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastRegisteredGroupSourcesJsonMarshaller();
        return instance;
    }
}
