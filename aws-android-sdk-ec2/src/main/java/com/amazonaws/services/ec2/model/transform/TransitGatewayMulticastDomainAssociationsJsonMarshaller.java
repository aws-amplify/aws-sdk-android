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
 * JSON marshaller for POJO TransitGatewayMulticastDomainAssociations
 */
class TransitGatewayMulticastDomainAssociationsJsonMarshaller {

    public void marshall(
            TransitGatewayMulticastDomainAssociations transitGatewayMulticastDomainAssociations,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayMulticastDomainAssociations.getTransitGatewayMulticastDomainId() != null) {
            String transitGatewayMulticastDomainId = transitGatewayMulticastDomainAssociations
                    .getTransitGatewayMulticastDomainId();
            jsonWriter.name("TransitGatewayMulticastDomainId");
            jsonWriter.value(transitGatewayMulticastDomainId);
        }
        if (transitGatewayMulticastDomainAssociations.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayMulticastDomainAssociations
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayMulticastDomainAssociations.getResourceId() != null) {
            String resourceId = transitGatewayMulticastDomainAssociations.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (transitGatewayMulticastDomainAssociations.getResourceType() != null) {
            String resourceType = transitGatewayMulticastDomainAssociations.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (transitGatewayMulticastDomainAssociations.getSubnets() != null) {
            java.util.List<SubnetAssociation> subnets = transitGatewayMulticastDomainAssociations
                    .getSubnets();
            jsonWriter.name("Subnets");
            jsonWriter.beginArray();
            for (SubnetAssociation subnetsItem : subnets) {
                if (subnetsItem != null) {
                    SubnetAssociationJsonMarshaller.getInstance().marshall(subnetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayMulticastDomainAssociationsJsonMarshaller instance;

    public static TransitGatewayMulticastDomainAssociationsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastDomainAssociationsJsonMarshaller();
        return instance;
    }
}
