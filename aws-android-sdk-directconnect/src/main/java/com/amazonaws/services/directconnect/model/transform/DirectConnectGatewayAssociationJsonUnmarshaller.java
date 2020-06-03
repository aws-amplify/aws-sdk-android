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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DirectConnectGatewayAssociation
 */
class DirectConnectGatewayAssociationJsonUnmarshaller implements
        Unmarshaller<DirectConnectGatewayAssociation, JsonUnmarshallerContext> {

    public DirectConnectGatewayAssociation unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DirectConnectGatewayAssociation directConnectGatewayAssociation = new DirectConnectGatewayAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("directConnectGatewayId")) {
                directConnectGatewayAssociation.setDirectConnectGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayOwnerAccount")) {
                directConnectGatewayAssociation
                        .setDirectConnectGatewayOwnerAccount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("associationState")) {
                directConnectGatewayAssociation.setAssociationState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("stateChangeError")) {
                directConnectGatewayAssociation.setStateChangeError(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("associatedGateway")) {
                directConnectGatewayAssociation
                        .setAssociatedGateway(AssociatedGatewayJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("associationId")) {
                directConnectGatewayAssociation.setAssociationId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("allowedPrefixesToDirectConnectGateway")) {
                directConnectGatewayAssociation
                        .setAllowedPrefixesToDirectConnectGateway(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("virtualGatewayId")) {
                directConnectGatewayAssociation.setVirtualGatewayId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayRegion")) {
                directConnectGatewayAssociation.setVirtualGatewayRegion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("virtualGatewayOwnerAccount")) {
                directConnectGatewayAssociation
                        .setVirtualGatewayOwnerAccount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return directConnectGatewayAssociation;
    }

    private static DirectConnectGatewayAssociationJsonUnmarshaller instance;

    public static DirectConnectGatewayAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayAssociationJsonUnmarshaller();
        return instance;
    }
}
