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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetSummary
 */
class AssetSummaryJsonMarshaller {

    public void marshall(AssetSummary assetSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (assetSummary.getId() != null) {
            String id = assetSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (assetSummary.getArn() != null) {
            String arn = assetSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (assetSummary.getName() != null) {
            String name = assetSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (assetSummary.getAssetModelId() != null) {
            String assetModelId = assetSummary.getAssetModelId();
            jsonWriter.name("assetModelId");
            jsonWriter.value(assetModelId);
        }
        if (assetSummary.getCreationDate() != null) {
            java.util.Date creationDate = assetSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (assetSummary.getLastUpdateDate() != null) {
            java.util.Date lastUpdateDate = assetSummary.getLastUpdateDate();
            jsonWriter.name("lastUpdateDate");
            jsonWriter.value(lastUpdateDate);
        }
        if (assetSummary.getStatus() != null) {
            AssetStatus status = assetSummary.getStatus();
            jsonWriter.name("status");
            AssetStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (assetSummary.getHierarchies() != null) {
            java.util.List<AssetHierarchy> hierarchies = assetSummary.getHierarchies();
            jsonWriter.name("hierarchies");
            jsonWriter.beginArray();
            for (AssetHierarchy hierarchiesItem : hierarchies) {
                if (hierarchiesItem != null) {
                    AssetHierarchyJsonMarshaller.getInstance()
                            .marshall(hierarchiesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AssetSummaryJsonMarshaller instance;

    public static AssetSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetSummaryJsonMarshaller();
        return instance;
    }
}
