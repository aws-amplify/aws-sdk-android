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
 * JSON marshaller for POJO LocalGatewayRoute
 */
class LocalGatewayRouteJsonMarshaller {

    public void marshall(LocalGatewayRoute localGatewayRoute, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (localGatewayRoute.getDestinationCidrBlock() != null) {
            String destinationCidrBlock = localGatewayRoute.getDestinationCidrBlock();
            jsonWriter.name("DestinationCidrBlock");
            jsonWriter.value(destinationCidrBlock);
        }
        if (localGatewayRoute.getLocalGatewayVirtualInterfaceGroupId() != null) {
            String localGatewayVirtualInterfaceGroupId = localGatewayRoute
                    .getLocalGatewayVirtualInterfaceGroupId();
            jsonWriter.name("LocalGatewayVirtualInterfaceGroupId");
            jsonWriter.value(localGatewayVirtualInterfaceGroupId);
        }
        if (localGatewayRoute.getType() != null) {
            String type = localGatewayRoute.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (localGatewayRoute.getState() != null) {
            String state = localGatewayRoute.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (localGatewayRoute.getLocalGatewayRouteTableId() != null) {
            String localGatewayRouteTableId = localGatewayRoute.getLocalGatewayRouteTableId();
            jsonWriter.name("LocalGatewayRouteTableId");
            jsonWriter.value(localGatewayRouteTableId);
        }
        jsonWriter.endObject();
    }

    private static LocalGatewayRouteJsonMarshaller instance;

    public static LocalGatewayRouteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayRouteJsonMarshaller();
        return instance;
    }
}
