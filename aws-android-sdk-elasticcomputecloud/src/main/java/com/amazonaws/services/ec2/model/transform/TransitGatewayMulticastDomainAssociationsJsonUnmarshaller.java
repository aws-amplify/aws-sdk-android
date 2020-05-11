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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TransitGatewayMulticastDomainAssociations
 */
class TransitGatewayMulticastDomainAssociationsJsonUnmarshaller implements
        Unmarshaller<TransitGatewayMulticastDomainAssociations, JsonUnmarshallerContext> {

    public TransitGatewayMulticastDomainAssociations unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TransitGatewayMulticastDomainAssociations transitGatewayMulticastDomainAssociations = new TransitGatewayMulticastDomainAssociations();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TransitGatewayMulticastDomainId")) {
                transitGatewayMulticastDomainAssociations
                        .setTransitGatewayMulticastDomainId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("TransitGatewayAttachmentId")) {
                transitGatewayMulticastDomainAssociations
                        .setTransitGatewayAttachmentId(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("ResourceId")) {
                transitGatewayMulticastDomainAssociations.setResourceId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ResourceType")) {
                transitGatewayMulticastDomainAssociations.setResourceType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Subnets")) {
                transitGatewayMulticastDomainAssociations
                        .setSubnets(new ListUnmarshaller<SubnetAssociation>(
                                SubnetAssociationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return transitGatewayMulticastDomainAssociations;
    }

    private static TransitGatewayMulticastDomainAssociationsJsonUnmarshaller instance;

    public static TransitGatewayMulticastDomainAssociationsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastDomainAssociationsJsonUnmarshaller();
        return instance;
    }
}
