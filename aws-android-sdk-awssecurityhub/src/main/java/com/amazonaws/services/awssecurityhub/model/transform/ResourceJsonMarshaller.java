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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Resource
 */
class ResourceJsonMarshaller {

    public void marshall(Resource resource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resource.getType() != null) {
            String type = resource.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (resource.getId() != null) {
            String id = resource.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (resource.getPartition() != null) {
            String partition = resource.getPartition();
            jsonWriter.name("Partition");
            jsonWriter.value(partition);
        }
        if (resource.getRegion() != null) {
            String region = resource.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (resource.getTags() != null) {
            java.util.Map<String, String> tags = resource.getTags();
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
        if (resource.getDetails() != null) {
            ResourceDetails details = resource.getDetails();
            jsonWriter.name("Details");
            ResourceDetailsJsonMarshaller.getInstance().marshall(details, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResourceJsonMarshaller instance;

    public static ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceJsonMarshaller();
        return instance;
    }
}
