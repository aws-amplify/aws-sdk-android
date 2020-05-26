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
 * JSON marshaller for POJO TransitGatewayAttachment
 */
class TransitGatewayAttachmentJsonMarshaller {

    public void marshall(TransitGatewayAttachment transitGatewayAttachment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayAttachment.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayAttachment
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayAttachment.getTransitGatewayId() != null) {
            String transitGatewayId = transitGatewayAttachment.getTransitGatewayId();
            jsonWriter.name("TransitGatewayId");
            jsonWriter.value(transitGatewayId);
        }
        if (transitGatewayAttachment.getTransitGatewayOwnerId() != null) {
            String transitGatewayOwnerId = transitGatewayAttachment.getTransitGatewayOwnerId();
            jsonWriter.name("TransitGatewayOwnerId");
            jsonWriter.value(transitGatewayOwnerId);
        }
        if (transitGatewayAttachment.getResourceOwnerId() != null) {
            String resourceOwnerId = transitGatewayAttachment.getResourceOwnerId();
            jsonWriter.name("ResourceOwnerId");
            jsonWriter.value(resourceOwnerId);
        }
        if (transitGatewayAttachment.getResourceType() != null) {
            String resourceType = transitGatewayAttachment.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (transitGatewayAttachment.getResourceId() != null) {
            String resourceId = transitGatewayAttachment.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (transitGatewayAttachment.getState() != null) {
            String state = transitGatewayAttachment.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (transitGatewayAttachment.getAssociation() != null) {
            TransitGatewayAttachmentAssociation association = transitGatewayAttachment
                    .getAssociation();
            jsonWriter.name("Association");
            TransitGatewayAttachmentAssociationJsonMarshaller.getInstance().marshall(association,
                    jsonWriter);
        }
        if (transitGatewayAttachment.getCreationTime() != null) {
            java.util.Date creationTime = transitGatewayAttachment.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transitGatewayAttachment.getTags() != null) {
            java.util.List<Tag> tags = transitGatewayAttachment.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TransitGatewayAttachmentJsonMarshaller instance;

    public static TransitGatewayAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayAttachmentJsonMarshaller();
        return instance;
    }
}
