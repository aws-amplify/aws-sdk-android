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
 * JSON marshaller for POJO AssociatedAssetsSummary
 */
class AssociatedAssetsSummaryJsonMarshaller {

    public void marshall(AssociatedAssetsSummary associatedAssetsSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (associatedAssetsSummary.getId() != null) {
            String id = associatedAssetsSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (associatedAssetsSummary.getArn() != null) {
            String arn = associatedAssetsSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (associatedAssetsSummary.getName() != null) {
            String name = associatedAssetsSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (associatedAssetsSummary.getAssetModelId() != null) {
            String assetModelId = associatedAssetsSummary.getAssetModelId();
            jsonWriter.name("assetModelId");
            jsonWriter.value(assetModelId);
        }
        if (associatedAssetsSummary.getCreationDate() != null) {
            java.util.Date creationDate = associatedAssetsSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (associatedAssetsSummary.getLastUpdateDate() != null) {
            java.util.Date lastUpdateDate = associatedAssetsSummary.getLastUpdateDate();
            jsonWriter.name("lastUpdateDate");
            jsonWriter.value(lastUpdateDate);
        }
        if (associatedAssetsSummary.getStatus() != null) {
            AssetStatus status = associatedAssetsSummary.getStatus();
            jsonWriter.name("status");
            AssetStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (associatedAssetsSummary.getHierarchies() != null) {
            java.util.List<AssetHierarchy> hierarchies = associatedAssetsSummary.getHierarchies();
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

    private static AssociatedAssetsSummaryJsonMarshaller instance;

    public static AssociatedAssetsSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssociatedAssetsSummaryJsonMarshaller();
        return instance;
    }
}
