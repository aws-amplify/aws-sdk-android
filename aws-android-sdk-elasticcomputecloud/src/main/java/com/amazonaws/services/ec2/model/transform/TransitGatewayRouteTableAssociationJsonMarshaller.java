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
 * JSON marshaller for POJO TransitGatewayRouteTableAssociation
 */
class TransitGatewayRouteTableAssociationJsonMarshaller {

    public void marshall(TransitGatewayRouteTableAssociation transitGatewayRouteTableAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayRouteTableAssociation.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayRouteTableAssociation
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayRouteTableAssociation.getResourceId() != null) {
            String resourceId = transitGatewayRouteTableAssociation.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (transitGatewayRouteTableAssociation.getResourceType() != null) {
            String resourceType = transitGatewayRouteTableAssociation.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (transitGatewayRouteTableAssociation.getState() != null) {
            String state = transitGatewayRouteTableAssociation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayRouteTableAssociationJsonMarshaller instance;

    public static TransitGatewayRouteTableAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRouteTableAssociationJsonMarshaller();
        return instance;
    }
}
