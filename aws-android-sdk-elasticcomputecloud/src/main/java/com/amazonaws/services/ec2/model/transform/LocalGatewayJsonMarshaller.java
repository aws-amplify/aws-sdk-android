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
 * JSON marshaller for POJO LocalGateway
 */
class LocalGatewayJsonMarshaller {

    public void marshall(LocalGateway localGateway, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (localGateway.getLocalGatewayId() != null) {
            String localGatewayId = localGateway.getLocalGatewayId();
            jsonWriter.name("LocalGatewayId");
            jsonWriter.value(localGatewayId);
        }
        if (localGateway.getOutpostArn() != null) {
            String outpostArn = localGateway.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        if (localGateway.getOwnerId() != null) {
            String ownerId = localGateway.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (localGateway.getState() != null) {
            String state = localGateway.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (localGateway.getTags() != null) {
            java.util.List<Tag> tags = localGateway.getTags();
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

    private static LocalGatewayJsonMarshaller instance;

    public static LocalGatewayJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocalGatewayJsonMarshaller();
        return instance;
    }
}
