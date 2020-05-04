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
 * JSON marshaller for POJO InternetGateway
 */
class InternetGatewayJsonMarshaller {

    public void marshall(InternetGateway internetGateway, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (internetGateway.getAttachments() != null) {
            java.util.List<InternetGatewayAttachment> attachments = internetGateway
                    .getAttachments();
            jsonWriter.name("Attachments");
            jsonWriter.beginArray();
            for (InternetGatewayAttachment attachmentsItem : attachments) {
                if (attachmentsItem != null) {
                    InternetGatewayAttachmentJsonMarshaller.getInstance().marshall(attachmentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (internetGateway.getInternetGatewayId() != null) {
            String internetGatewayId = internetGateway.getInternetGatewayId();
            jsonWriter.name("InternetGatewayId");
            jsonWriter.value(internetGatewayId);
        }
        if (internetGateway.getOwnerId() != null) {
            String ownerId = internetGateway.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (internetGateway.getTags() != null) {
            java.util.List<Tag> tags = internetGateway.getTags();
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

    private static InternetGatewayJsonMarshaller instance;

    public static InternetGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InternetGatewayJsonMarshaller();
        return instance;
    }
}
