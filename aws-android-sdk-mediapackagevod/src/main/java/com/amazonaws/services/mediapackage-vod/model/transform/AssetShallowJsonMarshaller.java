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
package com.amazonaws.services.mediapackage-vod.model.transform;

import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetShallow
 */
class AssetShallowJsonMarshaller {

    public void marshall(AssetShallow assetShallow, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (assetShallow.getArn() != null) {
            String arn = assetShallow.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (assetShallow.getCreatedAt() != null) {
            String createdAt = assetShallow.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (assetShallow.getId() != null) {
            String id = assetShallow.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (assetShallow.getPackagingGroupId() != null) {
            String packagingGroupId = assetShallow.getPackagingGroupId();
            jsonWriter.name("PackagingGroupId");
            jsonWriter.value(packagingGroupId);
        }
        if (assetShallow.getResourceId() != null) {
            String resourceId = assetShallow.getResourceId();
            jsonWriter.name("ResourceId");
            jsonWriter.value(resourceId);
        }
        if (assetShallow.getSourceArn() != null) {
            String sourceArn = assetShallow.getSourceArn();
            jsonWriter.name("SourceArn");
            jsonWriter.value(sourceArn);
        }
        if (assetShallow.getSourceRoleArn() != null) {
            String sourceRoleArn = assetShallow.getSourceRoleArn();
            jsonWriter.name("SourceRoleArn");
            jsonWriter.value(sourceRoleArn);
        }
        if (assetShallow.getTags() != null) {
            java.util.Map<String, String> tags = assetShallow.getTags();
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
        jsonWriter.endObject();
    }

    private static AssetShallowJsonMarshaller instance;
    public static AssetShallowJsonMarshaller getInstance() {
        if (instance == null) instance = new AssetShallowJsonMarshaller();
        return instance;
    }
}
