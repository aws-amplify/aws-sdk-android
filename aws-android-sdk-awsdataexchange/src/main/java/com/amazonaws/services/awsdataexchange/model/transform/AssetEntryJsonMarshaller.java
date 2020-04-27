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

package com.amazonaws.services.awsdataexchange.model.transform;

import com.amazonaws.services.awsdataexchange.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetEntry
 */
class AssetEntryJsonMarshaller {

    public void marshall(AssetEntry assetEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (assetEntry.getArn() != null) {
            String arn = assetEntry.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (assetEntry.getAssetDetails() != null) {
            AssetDetails assetDetails = assetEntry.getAssetDetails();
            jsonWriter.name("AssetDetails");
            AssetDetailsJsonMarshaller.getInstance().marshall(assetDetails, jsonWriter);
        }
        if (assetEntry.getAssetType() != null) {
            String assetType = assetEntry.getAssetType();
            jsonWriter.name("AssetType");
            jsonWriter.value(assetType);
        }
        if (assetEntry.getCreatedAt() != null) {
            java.util.Date createdAt = assetEntry.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (assetEntry.getDataSetId() != null) {
            String dataSetId = assetEntry.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (assetEntry.getId() != null) {
            String id = assetEntry.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (assetEntry.getName() != null) {
            String name = assetEntry.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (assetEntry.getRevisionId() != null) {
            String revisionId = assetEntry.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        if (assetEntry.getSourceId() != null) {
            String sourceId = assetEntry.getSourceId();
            jsonWriter.name("SourceId");
            jsonWriter.value(sourceId);
        }
        if (assetEntry.getUpdatedAt() != null) {
            java.util.Date updatedAt = assetEntry.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static AssetEntryJsonMarshaller instance;

    public static AssetEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetEntryJsonMarshaller();
        return instance;
    }
}
