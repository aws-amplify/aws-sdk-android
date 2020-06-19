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
 * JSON marshaller for POJO TransitGatewayPeeringAttachment
 */
class TransitGatewayPeeringAttachmentJsonMarshaller {

    public void marshall(TransitGatewayPeeringAttachment transitGatewayPeeringAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayPeeringAttachment.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayPeeringAttachment
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayPeeringAttachment.getRequesterTgwInfo() != null) {
            PeeringTgwInfo requesterTgwInfo = transitGatewayPeeringAttachment.getRequesterTgwInfo();
            jsonWriter.name("RequesterTgwInfo");
            PeeringTgwInfoJsonMarshaller.getInstance().marshall(requesterTgwInfo, jsonWriter);
        }
        if (transitGatewayPeeringAttachment.getAccepterTgwInfo() != null) {
            PeeringTgwInfo accepterTgwInfo = transitGatewayPeeringAttachment.getAccepterTgwInfo();
            jsonWriter.name("AccepterTgwInfo");
            PeeringTgwInfoJsonMarshaller.getInstance().marshall(accepterTgwInfo, jsonWriter);
        }
        if (transitGatewayPeeringAttachment.getStatus() != null) {
            PeeringAttachmentStatus status = transitGatewayPeeringAttachment.getStatus();
            jsonWriter.name("Status");
            PeeringAttachmentStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (transitGatewayPeeringAttachment.getState() != null) {
            String state = transitGatewayPeeringAttachment.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (transitGatewayPeeringAttachment.getCreationTime() != null) {
            java.util.Date creationTime = transitGatewayPeeringAttachment.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transitGatewayPeeringAttachment.getTags() != null) {
            java.util.List<Tag> tags = transitGatewayPeeringAttachment.getTags();
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

    private static TransitGatewayPeeringAttachmentJsonMarshaller instance;

    public static TransitGatewayPeeringAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayPeeringAttachmentJsonMarshaller();
        return instance;
    }
}
