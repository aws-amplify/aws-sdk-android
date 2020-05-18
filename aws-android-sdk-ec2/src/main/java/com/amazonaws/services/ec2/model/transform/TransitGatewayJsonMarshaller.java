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
 * JSON marshaller for POJO TransitGateway
 */
class TransitGatewayJsonMarshaller {

    public void marshall(TransitGateway transitGateway, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGateway.getTransitGatewayId() != null) {
            String transitGatewayId = transitGateway.getTransitGatewayId();
            jsonWriter.name("TransitGatewayId");
            jsonWriter.value(transitGatewayId);
        }
        if (transitGateway.getTransitGatewayArn() != null) {
            String transitGatewayArn = transitGateway.getTransitGatewayArn();
            jsonWriter.name("TransitGatewayArn");
            jsonWriter.value(transitGatewayArn);
        }
        if (transitGateway.getState() != null) {
            String state = transitGateway.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (transitGateway.getOwnerId() != null) {
            String ownerId = transitGateway.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (transitGateway.getDescription() != null) {
            String description = transitGateway.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (transitGateway.getCreationTime() != null) {
            java.util.Date creationTime = transitGateway.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transitGateway.getOptions() != null) {
            TransitGatewayOptions options = transitGateway.getOptions();
            jsonWriter.name("Options");
            TransitGatewayOptionsJsonMarshaller.getInstance().marshall(options, jsonWriter);
        }
        if (transitGateway.getTags() != null) {
            java.util.List<Tag> tags = transitGateway.getTags();
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

    private static TransitGatewayJsonMarshaller instance;

    public static TransitGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayJsonMarshaller();
        return instance;
    }
}
