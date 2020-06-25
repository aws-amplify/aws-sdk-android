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
 * JSON marshaller for POJO VpnGateway
 */
class VpnGatewayJsonMarshaller {

    public void marshall(VpnGateway vpnGateway, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpnGateway.getAvailabilityZone() != null) {
            String availabilityZone = vpnGateway.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (vpnGateway.getState() != null) {
            String state = vpnGateway.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (vpnGateway.getType() != null) {
            String type = vpnGateway.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (vpnGateway.getVpcAttachments() != null) {
            java.util.List<VpcAttachment> vpcAttachments = vpnGateway.getVpcAttachments();
            jsonWriter.name("VpcAttachments");
            jsonWriter.beginArray();
            for (VpcAttachment vpcAttachmentsItem : vpcAttachments) {
                if (vpcAttachmentsItem != null) {
                    VpcAttachmentJsonMarshaller.getInstance().marshall(vpcAttachmentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnGateway.getVpnGatewayId() != null) {
            String vpnGatewayId = vpnGateway.getVpnGatewayId();
            jsonWriter.name("VpnGatewayId");
            jsonWriter.value(vpnGatewayId);
        }
        if (vpnGateway.getAmazonSideAsn() != null) {
            Long amazonSideAsn = vpnGateway.getAmazonSideAsn();
            jsonWriter.name("AmazonSideAsn");
            jsonWriter.value(amazonSideAsn);
        }
        if (vpnGateway.getTags() != null) {
            java.util.List<Tag> tags = vpnGateway.getTags();
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

    private static VpnGatewayJsonMarshaller instance;

    public static VpnGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpnGatewayJsonMarshaller();
        return instance;
    }
}
