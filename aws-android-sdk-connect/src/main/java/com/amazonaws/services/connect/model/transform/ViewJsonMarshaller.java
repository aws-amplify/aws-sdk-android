/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO View
 */
class ViewJsonMarshaller {

    public void marshall(View view, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (view.getId() != null) {
            String id = view.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (view.getArn() != null) {
            String arn = view.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (view.getName() != null) {
            String name = view.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (view.getStatus() != null) {
            String status = view.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (view.getType() != null) {
            String type = view.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (view.getDescription() != null) {
            String description = view.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (view.getVersion() != null) {
            Integer version = view.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (view.getVersionDescription() != null) {
            String versionDescription = view.getVersionDescription();
            jsonWriter.name("VersionDescription");
            jsonWriter.value(versionDescription);
        }
        if (view.getContent() != null) {
            ViewContent content = view.getContent();
            jsonWriter.name("Content");
            ViewContentJsonMarshaller.getInstance().marshall(content, jsonWriter);
        }
        if (view.getTags() != null) {
            java.util.Map<String, String> tags = view.getTags();
            jsonWriter.name("Tags");
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
        if (view.getCreatedTime() != null) {
            java.util.Date createdTime = view.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (view.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = view.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (view.getViewContentSha256() != null) {
            String viewContentSha256 = view.getViewContentSha256();
            jsonWriter.name("ViewContentSha256");
            jsonWriter.value(viewContentSha256);
        }
        jsonWriter.endObject();
    }

    private static ViewJsonMarshaller instance;

    public static ViewJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ViewJsonMarshaller();
        return instance;
    }
}
