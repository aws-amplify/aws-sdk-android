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
 * JSON marshaller for POJO ComponentSummary
 */
class ComponentSummaryJsonMarshaller {

    public void marshall(ComponentSummary componentSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (componentSummary.getArn() != null) {
            String arn = componentSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (componentSummary.getName() != null) {
            String name = componentSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (componentSummary.getVersion() != null) {
            String version = componentSummary.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (componentSummary.getPlatform() != null) {
            String platform = componentSummary.getPlatform();
            jsonWriter.name("platform");
            jsonWriter.value(platform);
        }
        if (componentSummary.getType() != null) {
            String type = componentSummary.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (componentSummary.getOwner() != null) {
            String owner = componentSummary.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (componentSummary.getDescription() != null) {
            String description = componentSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (componentSummary.getChangeDescription() != null) {
            String changeDescription = componentSummary.getChangeDescription();
            jsonWriter.name("changeDescription");
            jsonWriter.value(changeDescription);
        }
        if (componentSummary.getDateCreated() != null) {
            String dateCreated = componentSummary.getDateCreated();
            jsonWriter.name("dateCreated");
            jsonWriter.value(dateCreated);
        }
        if (componentSummary.getTags() != null) {
            java.util.Map<String, String> tags = componentSummary.getTags();
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

    private static ComponentSummaryJsonMarshaller instance;

    public static ComponentSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComponentSummaryJsonMarshaller();
        return instance;
    }
}
