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
 * JSON marshaller for POJO TransitGatewayMulticastDeregisteredGroupSources
 */
class TransitGatewayMulticastDeregisteredGroupSourcesJsonMarshaller {

    public void marshall(
            TransitGatewayMulticastDeregisteredGroupSources transitGatewayMulticastDeregisteredGroupSources,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayMulticastDeregisteredGroupSources.getTransitGatewayMulticastDomainId() != null) {
            String transitGatewayMulticastDomainId = transitGatewayMulticastDeregisteredGroupSources
                    .getTransitGatewayMulticastDomainId();
            jsonWriter.name("TransitGatewayMulticastDomainId");
            jsonWriter.value(transitGatewayMulticastDomainId);
        }
        if (transitGatewayMulticastDeregisteredGroupSources.getDeregisteredNetworkInterfaceIds() != null) {
            java.util.List<String> deregisteredNetworkInterfaceIds = transitGatewayMulticastDeregisteredGroupSources
                    .getDeregisteredNetworkInterfaceIds();
            jsonWriter.name("DeregisteredNetworkInterfaceIds");
            jsonWriter.beginArray();
            for (String deregisteredNetworkInterfaceIdsItem : deregisteredNetworkInterfaceIds) {
                if (deregisteredNetworkInterfaceIdsItem != null) {
                    jsonWriter.value(deregisteredNetworkInterfaceIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (transitGatewayMulticastDeregisteredGroupSources.getGroupIpAddress() != null) {
            String groupIpAddress = transitGatewayMulticastDeregisteredGroupSources
                    .getGroupIpAddress();
            jsonWriter.name("GroupIpAddress");
            jsonWriter.value(groupIpAddress);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayMulticastDeregisteredGroupSourcesJsonMarshaller instance;

    public static TransitGatewayMulticastDeregisteredGroupSourcesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastDeregisteredGroupSourcesJsonMarshaller();
        return instance;
    }
}
