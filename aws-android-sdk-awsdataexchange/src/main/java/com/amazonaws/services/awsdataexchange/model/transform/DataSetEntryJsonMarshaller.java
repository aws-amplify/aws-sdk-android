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
 * JSON marshaller for POJO DataSetEntry
 */
class DataSetEntryJsonMarshaller {

    public void marshall(DataSetEntry dataSetEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataSetEntry.getArn() != null) {
            String arn = dataSetEntry.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (dataSetEntry.getAssetType() != null) {
            String assetType = dataSetEntry.getAssetType();
            jsonWriter.name("AssetType");
            jsonWriter.value(assetType);
        }
        if (dataSetEntry.getCreatedAt() != null) {
            java.util.Date createdAt = dataSetEntry.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (dataSetEntry.getDescription() != null) {
            String description = dataSetEntry.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (dataSetEntry.getId() != null) {
            String id = dataSetEntry.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (dataSetEntry.getName() != null) {
            String name = dataSetEntry.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (dataSetEntry.getOrigin() != null) {
            String origin = dataSetEntry.getOrigin();
            jsonWriter.name("Origin");
            jsonWriter.value(origin);
        }
        if (dataSetEntry.getOriginDetails() != null) {
            OriginDetails originDetails = dataSetEntry.getOriginDetails();
            jsonWriter.name("OriginDetails");
            OriginDetailsJsonMarshaller.getInstance().marshall(originDetails, jsonWriter);
        }
        if (dataSetEntry.getSourceId() != null) {
            String sourceId = dataSetEntry.getSourceId();
            jsonWriter.name("SourceId");
            jsonWriter.value(sourceId);
        }
        if (dataSetEntry.getUpdatedAt() != null) {
            java.util.Date updatedAt = dataSetEntry.getUpdatedAt();
            jsonWriter.name("UpdatedAt");
            jsonWriter.value(updatedAt);
        }
        jsonWriter.endObject();
    }

    private static DataSetEntryJsonMarshaller instance;

    public static DataSetEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DataSetEntryJsonMarshaller();
        return instance;
    }
}
