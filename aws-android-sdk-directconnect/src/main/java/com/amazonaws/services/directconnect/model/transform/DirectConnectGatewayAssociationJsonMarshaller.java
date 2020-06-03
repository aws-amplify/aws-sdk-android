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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DirectConnectGatewayAssociation
 */
class DirectConnectGatewayAssociationJsonMarshaller {

    public void marshall(DirectConnectGatewayAssociation directConnectGatewayAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (directConnectGatewayAssociation.getDirectConnectGatewayId() != null) {
            String directConnectGatewayId = directConnectGatewayAssociation
                    .getDirectConnectGatewayId();
            jsonWriter.name("directConnectGatewayId");
            jsonWriter.value(directConnectGatewayId);
        }
        if (directConnectGatewayAssociation.getDirectConnectGatewayOwnerAccount() != null) {
            String directConnectGatewayOwnerAccount = directConnectGatewayAssociation
                    .getDirectConnectGatewayOwnerAccount();
            jsonWriter.name("directConnectGatewayOwnerAccount");
            jsonWriter.value(directConnectGatewayOwnerAccount);
        }
        if (directConnectGatewayAssociation.getAssociationState() != null) {
            String associationState = directConnectGatewayAssociation.getAssociationState();
            jsonWriter.name("associationState");
            jsonWriter.value(associationState);
        }
        if (directConnectGatewayAssociation.getStateChangeError() != null) {
            String stateChangeError = directConnectGatewayAssociation.getStateChangeError();
            jsonWriter.name("stateChangeError");
            jsonWriter.value(stateChangeError);
        }
        if (directConnectGatewayAssociation.getAssociatedGateway() != null) {
            AssociatedGateway associatedGateway = directConnectGatewayAssociation
                    .getAssociatedGateway();
            jsonWriter.name("associatedGateway");
            AssociatedGatewayJsonMarshaller.getInstance().marshall(associatedGateway, jsonWriter);
        }
        if (directConnectGatewayAssociation.getAssociationId() != null) {
            String associationId = directConnectGatewayAssociation.getAssociationId();
            jsonWriter.name("associationId");
            jsonWriter.value(associationId);
        }
        if (directConnectGatewayAssociation.getAllowedPrefixesToDirectConnectGateway() != null) {
            java.util.List<RouteFilterPrefix> allowedPrefixesToDirectConnectGateway = directConnectGatewayAssociation
                    .getAllowedPrefixesToDirectConnectGateway();
            jsonWriter.name("allowedPrefixesToDirectConnectGateway");
            jsonWriter.beginArray();
            for (RouteFilterPrefix allowedPrefixesToDirectConnectGatewayItem : allowedPrefixesToDirectConnectGateway) {
                if (allowedPrefixesToDirectConnectGatewayItem != null) {
                    RouteFilterPrefixJsonMarshaller.getInstance().marshall(
                            allowedPrefixesToDirectConnectGatewayItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (directConnectGatewayAssociation.getVirtualGatewayId() != null) {
            String virtualGatewayId = directConnectGatewayAssociation.getVirtualGatewayId();
            jsonWriter.name("virtualGatewayId");
            jsonWriter.value(virtualGatewayId);
        }
        if (directConnectGatewayAssociation.getVirtualGatewayRegion() != null) {
            String virtualGatewayRegion = directConnectGatewayAssociation.getVirtualGatewayRegion();
            jsonWriter.name("virtualGatewayRegion");
            jsonWriter.value(virtualGatewayRegion);
        }
        if (directConnectGatewayAssociation.getVirtualGatewayOwnerAccount() != null) {
            String virtualGatewayOwnerAccount = directConnectGatewayAssociation
                    .getVirtualGatewayOwnerAccount();
            jsonWriter.name("virtualGatewayOwnerAccount");
            jsonWriter.value(virtualGatewayOwnerAccount);
        }
        jsonWriter.endObject();
    }

    private static DirectConnectGatewayAssociationJsonMarshaller instance;

    public static DirectConnectGatewayAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayAssociationJsonMarshaller();
        return instance;
    }
}
