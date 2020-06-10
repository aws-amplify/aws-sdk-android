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
 * JSON marshaller for POJO TransitGatewayMulticastDomainAssociation
 */
class TransitGatewayMulticastDomainAssociationJsonMarshaller {

    public void marshall(
            TransitGatewayMulticastDomainAssociation transitGatewayMulticastDomainAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayMulticastDomainAssociation.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayMulticastDomainAssociation
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayMulticastDomainAssociation.getResourceId() != null) {
            String resourceId = transitGatewayMulticastDomainAssociation.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (transitGatewayMulticastDomainAssociation.getResourceType() != null) {
            String resourceType = transitGatewayMulticastDomainAssociation.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (transitGatewayMulticastDomainAssociation.getSubnet() != null) {
            SubnetAssociation subnet = transitGatewayMulticastDomainAssociation.getSubnet();
            jsonWriter.name("Subnet");
            SubnetAssociationJsonMarshaller.getInstance().marshall(subnet, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayMulticastDomainAssociationJsonMarshaller instance;

    public static TransitGatewayMulticastDomainAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastDomainAssociationJsonMarshaller();
        return instance;
    }
}
