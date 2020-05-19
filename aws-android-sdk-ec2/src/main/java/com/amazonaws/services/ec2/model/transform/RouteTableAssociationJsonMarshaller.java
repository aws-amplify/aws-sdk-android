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
 * JSON marshaller for POJO RouteTableAssociation
 */
class RouteTableAssociationJsonMarshaller {

    public void marshall(RouteTableAssociation routeTableAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (routeTableAssociation.getMain() != null) {
            Boolean main = routeTableAssociation.getMain();
            jsonWriter.name("Main");
            jsonWriter.value(main);
        }
        if (routeTableAssociation.getRouteTableAssociationId() != null) {
            String routeTableAssociationId = routeTableAssociation.getRouteTableAssociationId();
            jsonWriter.name("RouteTableAssociationId");
            jsonWriter.value(routeTableAssociationId);
        }
        if (routeTableAssociation.getRouteTableId() != null) {
            String routeTableId = routeTableAssociation.getRouteTableId();
            jsonWriter.name("RouteTableId");
            jsonWriter.value(routeTableId);
        }
        if (routeTableAssociation.getSubnetId() != null) {
            String subnetId = routeTableAssociation.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (routeTableAssociation.getGatewayId() != null) {
            String gatewayId = routeTableAssociation.getGatewayId();
            jsonWriter.name("GatewayId");
            jsonWriter.value(gatewayId);
        }
        if (routeTableAssociation.getAssociationState() != null) {
            RouteTableAssociationState associationState = routeTableAssociation
                    .getAssociationState();
            jsonWriter.name("AssociationState");
            RouteTableAssociationStateJsonMarshaller.getInstance().marshall(associationState,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RouteTableAssociationJsonMarshaller instance;

    public static RouteTableAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteTableAssociationJsonMarshaller();
        return instance;
    }
}
