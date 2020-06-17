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
 * JSON marshaller for POJO Route
 */
class RouteJsonMarshaller {

    public void marshall(Route route, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (route.getDestinationCidrBlock() != null) {
            String destinationCidrBlock = route.getDestinationCidrBlock();
            jsonWriter.name("DestinationCidrBlock");
            jsonWriter.value(destinationCidrBlock);
        }
        if (route.getDestinationIpv6CidrBlock() != null) {
            String destinationIpv6CidrBlock = route.getDestinationIpv6CidrBlock();
            jsonWriter.name("DestinationIpv6CidrBlock");
            jsonWriter.value(destinationIpv6CidrBlock);
        }
        if (route.getDestinationPrefixListId() != null) {
            String destinationPrefixListId = route.getDestinationPrefixListId();
            jsonWriter.name("DestinationPrefixListId");
            jsonWriter.value(destinationPrefixListId);
        }
        if (route.getEgressOnlyInternetGatewayId() != null) {
            String egressOnlyInternetGatewayId = route.getEgressOnlyInternetGatewayId();
            jsonWriter.name("EgressOnlyInternetGatewayId");
            jsonWriter.value(egressOnlyInternetGatewayId);
        }
        if (route.getGatewayId() != null) {
            String gatewayId = route.getGatewayId();
            jsonWriter.name("GatewayId");
            jsonWriter.value(gatewayId);
        }
        if (route.getInstanceId() != null) {
            String instanceId = route.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (route.getInstanceOwnerId() != null) {
            String instanceOwnerId = route.getInstanceOwnerId();
            jsonWriter.name("InstanceOwnerId");
            jsonWriter.value(instanceOwnerId);
        }
        if (route.getNatGatewayId() != null) {
            String natGatewayId = route.getNatGatewayId();
            jsonWriter.name("NatGatewayId");
            jsonWriter.value(natGatewayId);
        }
        if (route.getTransitGatewayId() != null) {
            String transitGatewayId = route.getTransitGatewayId();
            jsonWriter.name("TransitGatewayId");
            jsonWriter.value(transitGatewayId);
        }
        if (route.getLocalGatewayId() != null) {
            String localGatewayId = route.getLocalGatewayId();
            jsonWriter.name("LocalGatewayId");
            jsonWriter.value(localGatewayId);
        }
        if (route.getNetworkInterfaceId() != null) {
            String networkInterfaceId = route.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (route.getOrigin() != null) {
            String origin = route.getOrigin();
            jsonWriter.name("Origin");
            jsonWriter.value(origin);
        }
        if (route.getState() != null) {
            String state = route.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (route.getVpcPeeringConnectionId() != null) {
            String vpcPeeringConnectionId = route.getVpcPeeringConnectionId();
            jsonWriter.name("VpcPeeringConnectionId");
            jsonWriter.value(vpcPeeringConnectionId);
        }
        jsonWriter.endObject();
    }

    private static RouteJsonMarshaller instance;

    public static RouteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteJsonMarshaller();
        return instance;
    }
}
