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
 * JSON marshaller for POJO TransitGatewayPropagation
 */
class TransitGatewayPropagationJsonMarshaller {

    public void marshall(TransitGatewayPropagation transitGatewayPropagation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayPropagation.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayPropagation
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayPropagation.getResourceId() != null) {
            String resourceId = transitGatewayPropagation.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (transitGatewayPropagation.getResourceType() != null) {
            String resourceType = transitGatewayPropagation.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (transitGatewayPropagation.getTransitGatewayRouteTableId() != null) {
            String transitGatewayRouteTableId = transitGatewayPropagation
                    .getTransitGatewayRouteTableId();
            jsonWriter.name("TransitGatewayRouteTableId");
            jsonWriter.value(transitGatewayRouteTableId);
        }
        if (transitGatewayPropagation.getState() != null) {
            String state = transitGatewayPropagation.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayPropagationJsonMarshaller instance;

    public static TransitGatewayPropagationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayPropagationJsonMarshaller();
        return instance;
    }
}
