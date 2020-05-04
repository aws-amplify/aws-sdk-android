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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VpcLink
 */
class VpcLinkJsonMarshaller {

    public void marshall(VpcLink vpcLink, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpcLink.getId() != null) {
            String id = vpcLink.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (vpcLink.getName() != null) {
            String name = vpcLink.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (vpcLink.getDescription() != null) {
            String description = vpcLink.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (vpcLink.getTargetArns() != null) {
            java.util.List<String> targetArns = vpcLink.getTargetArns();
            jsonWriter.name("targetArns");
            jsonWriter.beginArray();
            for (String targetArnsItem : targetArns) {
                if (targetArnsItem != null) {
                    jsonWriter.value(targetArnsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcLink.getStatus() != null) {
            String status = vpcLink.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (vpcLink.getStatusMessage() != null) {
            String statusMessage = vpcLink.getStatusMessage();
            jsonWriter.name("statusMessage");
            jsonWriter.value(statusMessage);
        }
        if (vpcLink.getTags() != null) {
            java.util.Map<String, String> tags = vpcLink.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static VpcLinkJsonMarshaller instance;

    public static VpcLinkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcLinkJsonMarshaller();
        return instance;
    }
}
