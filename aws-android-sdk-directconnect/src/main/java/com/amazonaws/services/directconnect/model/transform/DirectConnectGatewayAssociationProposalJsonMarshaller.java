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
 * JSON marshaller for POJO DirectConnectGatewayAssociationProposal
 */
class DirectConnectGatewayAssociationProposalJsonMarshaller {

    public void marshall(
            DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (directConnectGatewayAssociationProposal.getProposalId() != null) {
            String proposalId = directConnectGatewayAssociationProposal.getProposalId();
            jsonWriter.name("proposalId");
            jsonWriter.value(proposalId);
        }
        if (directConnectGatewayAssociationProposal.getDirectConnectGatewayId() != null) {
            String directConnectGatewayId = directConnectGatewayAssociationProposal
                    .getDirectConnectGatewayId();
            jsonWriter.name("directConnectGatewayId");
            jsonWriter.value(directConnectGatewayId);
        }
        if (directConnectGatewayAssociationProposal.getDirectConnectGatewayOwnerAccount() != null) {
            String directConnectGatewayOwnerAccount = directConnectGatewayAssociationProposal
                    .getDirectConnectGatewayOwnerAccount();
            jsonWriter.name("directConnectGatewayOwnerAccount");
            jsonWriter.value(directConnectGatewayOwnerAccount);
        }
        if (directConnectGatewayAssociationProposal.getProposalState() != null) {
            String proposalState = directConnectGatewayAssociationProposal.getProposalState();
            jsonWriter.name("proposalState");
            jsonWriter.value(proposalState);
        }
        if (directConnectGatewayAssociationProposal.getAssociatedGateway() != null) {
            AssociatedGateway associatedGateway = directConnectGatewayAssociationProposal
                    .getAssociatedGateway();
            jsonWriter.name("associatedGateway");
            AssociatedGatewayJsonMarshaller.getInstance().marshall(associatedGateway, jsonWriter);
        }
        if (directConnectGatewayAssociationProposal
                .getExistingAllowedPrefixesToDirectConnectGateway() != null) {
            java.util.List<RouteFilterPrefix> existingAllowedPrefixesToDirectConnectGateway = directConnectGatewayAssociationProposal
                    .getExistingAllowedPrefixesToDirectConnectGateway();
            jsonWriter.name("existingAllowedPrefixesToDirectConnectGateway");
            jsonWriter.beginArray();
            for (RouteFilterPrefix existingAllowedPrefixesToDirectConnectGatewayItem : existingAllowedPrefixesToDirectConnectGateway) {
                if (existingAllowedPrefixesToDirectConnectGatewayItem != null) {
                    RouteFilterPrefixJsonMarshaller.getInstance().marshall(
                            existingAllowedPrefixesToDirectConnectGatewayItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (directConnectGatewayAssociationProposal
                .getRequestedAllowedPrefixesToDirectConnectGateway() != null) {
            java.util.List<RouteFilterPrefix> requestedAllowedPrefixesToDirectConnectGateway = directConnectGatewayAssociationProposal
                    .getRequestedAllowedPrefixesToDirectConnectGateway();
            jsonWriter.name("requestedAllowedPrefixesToDirectConnectGateway");
            jsonWriter.beginArray();
            for (RouteFilterPrefix requestedAllowedPrefixesToDirectConnectGatewayItem : requestedAllowedPrefixesToDirectConnectGateway) {
                if (requestedAllowedPrefixesToDirectConnectGatewayItem != null) {
                    RouteFilterPrefixJsonMarshaller.getInstance().marshall(
                            requestedAllowedPrefixesToDirectConnectGatewayItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DirectConnectGatewayAssociationProposalJsonMarshaller instance;

    public static DirectConnectGatewayAssociationProposalJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayAssociationProposalJsonMarshaller();
        return instance;
    }
}
