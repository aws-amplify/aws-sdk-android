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
 * JSON marshaller for POJO TransitGatewayRouteAttachment
 */
class TransitGatewayRouteAttachmentJsonMarshaller {

    public void marshall(TransitGatewayRouteAttachment transitGatewayRouteAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayRouteAttachment.getResourceId() != null) {
            String resourceId = transitGatewayRouteAttachment.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (transitGatewayRouteAttachment.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayRouteAttachment
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayRouteAttachment.getResourceType() != null) {
            String resourceType = transitGatewayRouteAttachment.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayRouteAttachmentJsonMarshaller instance;

    public static TransitGatewayRouteAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayRouteAttachmentJsonMarshaller();
        return instance;
    }
}
