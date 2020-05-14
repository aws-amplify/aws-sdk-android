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
 * JSON marshaller for POJO TransitGatewayVpcAttachment
 */
class TransitGatewayVpcAttachmentJsonMarshaller {

    public void marshall(TransitGatewayVpcAttachment transitGatewayVpcAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayVpcAttachment.getTransitGatewayAttachmentId() != null) {
            String transitGatewayAttachmentId = transitGatewayVpcAttachment
                    .getTransitGatewayAttachmentId();
            jsonWriter.name("TransitGatewayAttachmentId");
            jsonWriter.value(transitGatewayAttachmentId);
        }
        if (transitGatewayVpcAttachment.getTransitGatewayId() != null) {
            String transitGatewayId = transitGatewayVpcAttachment.getTransitGatewayId();
            jsonWriter.name("TransitGatewayId");
            jsonWriter.value(transitGatewayId);
        }
        if (transitGatewayVpcAttachment.getVpcId() != null) {
            String vpcId = transitGatewayVpcAttachment.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (transitGatewayVpcAttachment.getVpcOwnerId() != null) {
            String vpcOwnerId = transitGatewayVpcAttachment.getVpcOwnerId();
            jsonWriter.name("VpcOwnerId");
            jsonWriter.value(vpcOwnerId);
        }
        if (transitGatewayVpcAttachment.getState() != null) {
            String state = transitGatewayVpcAttachment.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (transitGatewayVpcAttachment.getSubnetIds() != null) {
            java.util.List<String> subnetIds = transitGatewayVpcAttachment.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (transitGatewayVpcAttachment.getCreationTime() != null) {
            java.util.Date creationTime = transitGatewayVpcAttachment.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transitGatewayVpcAttachment.getOptions() != null) {
            TransitGatewayVpcAttachmentOptions options = transitGatewayVpcAttachment.getOptions();
            jsonWriter.name("Options");
            TransitGatewayVpcAttachmentOptionsJsonMarshaller.getInstance().marshall(options,
                    jsonWriter);
        }
        if (transitGatewayVpcAttachment.getTags() != null) {
            java.util.List<Tag> tags = transitGatewayVpcAttachment.getTags();
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

    private static TransitGatewayVpcAttachmentJsonMarshaller instance;

    public static TransitGatewayVpcAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayVpcAttachmentJsonMarshaller();
        return instance;
    }
}
