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
 * JSON marshaller for POJO TransitGatewayMulticastDomain
 */
class TransitGatewayMulticastDomainJsonMarshaller {

    public void marshall(TransitGatewayMulticastDomain transitGatewayMulticastDomain,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (transitGatewayMulticastDomain.getTransitGatewayMulticastDomainId() != null) {
            String transitGatewayMulticastDomainId = transitGatewayMulticastDomain
                    .getTransitGatewayMulticastDomainId();
            jsonWriter.name("TransitGatewayMulticastDomainId");
            jsonWriter.value(transitGatewayMulticastDomainId);
        }
        if (transitGatewayMulticastDomain.getTransitGatewayId() != null) {
            String transitGatewayId = transitGatewayMulticastDomain.getTransitGatewayId();
            jsonWriter.name("TransitGatewayId");
            jsonWriter.value(transitGatewayId);
        }
        if (transitGatewayMulticastDomain.getState() != null) {
            String state = transitGatewayMulticastDomain.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (transitGatewayMulticastDomain.getCreationTime() != null) {
            java.util.Date creationTime = transitGatewayMulticastDomain.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (transitGatewayMulticastDomain.getTags() != null) {
            java.util.List<Tag> tags = transitGatewayMulticastDomain.getTags();
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

    private static TransitGatewayMulticastDomainJsonMarshaller instance;

    public static TransitGatewayMulticastDomainJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayMulticastDomainJsonMarshaller();
        return instance;
    }
}
