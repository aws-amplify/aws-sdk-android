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
 * JSON unmarshaller for POJO DirectConnectGatewayAssociationProposal
 */
class DirectConnectGatewayAssociationProposalJsonUnmarshaller implements
        Unmarshaller<DirectConnectGatewayAssociationProposal, JsonUnmarshallerContext> {

    public DirectConnectGatewayAssociationProposal unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal = new DirectConnectGatewayAssociationProposal();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("proposalId")) {
                directConnectGatewayAssociationProposal.setProposalId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("directConnectGatewayId")) {
                directConnectGatewayAssociationProposal
                        .setDirectConnectGatewayId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("directConnectGatewayOwnerAccount")) {
                directConnectGatewayAssociationProposal
                        .setDirectConnectGatewayOwnerAccount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("proposalState")) {
                directConnectGatewayAssociationProposal.setProposalState(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("associatedGateway")) {
                directConnectGatewayAssociationProposal
                        .setAssociatedGateway(AssociatedGatewayJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("existingAllowedPrefixesToDirectConnectGateway")) {
                directConnectGatewayAssociationProposal
                        .setExistingAllowedPrefixesToDirectConnectGateway(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("requestedAllowedPrefixesToDirectConnectGateway")) {
                directConnectGatewayAssociationProposal
                        .setRequestedAllowedPrefixesToDirectConnectGateway(new ListUnmarshaller<RouteFilterPrefix>(
                                RouteFilterPrefixJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return directConnectGatewayAssociationProposal;
    }

    private static DirectConnectGatewayAssociationProposalJsonUnmarshaller instance;

    public static DirectConnectGatewayAssociationProposalJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayAssociationProposalJsonUnmarshaller();
        return instance;
    }
}
