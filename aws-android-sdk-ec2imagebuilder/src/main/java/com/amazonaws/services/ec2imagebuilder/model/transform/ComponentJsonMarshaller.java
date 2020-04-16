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

package com.amazonaws.services.ec2imagebuilder.model.transform;

import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Component
 */
class ComponentJsonMarshaller {

    public void marshall(Component component, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (component.getArn() != null) {
            String arn = component.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (component.getName() != null) {
            String name = component.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (component.getVersion() != null) {
            String version = component.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (component.getDescription() != null) {
            String description = component.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (component.getChangeDescription() != null) {
            String changeDescription = component.getChangeDescription();
            jsonWriter.name("changeDescription");
            jsonWriter.value(changeDescription);
        }
        if (component.getType() != null) {
            String type = component.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (component.getPlatform() != null) {
            String platform = component.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (component.getOwner() != null) {
            String owner = component.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (component.getData() != null) {
            String data = component.getData();
            jsonWriter.name("data");
            jsonWriter.value(data);
        }
        if (component.getKmsKeyId() != null) {
            String kmsKeyId = component.getKmsKeyId();
            jsonWriter.name("kmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (component.getEncrypted() != null) {
            Boolean encrypted = component.getEncrypted();
            jsonWriter.name("encrypted");
            jsonWriter.value(encrypted);
        }
        if (component.getDateCreated() != null) {
            String dateCreated = component.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (component.getTags() != null) {
            java.util.Map<String, String> tags = component.getTags();
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

    private static ComponentJsonMarshaller instance;

    public static ComponentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComponentJsonMarshaller();
        return instance;
    }
}
