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

package com.amazonaws.services.dataexchange.model.transform;

import com.amazonaws.services.dataexchange.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetDestinationEntry
 */
class AssetDestinationEntryJsonMarshaller {

    public void marshall(AssetDestinationEntry assetDestinationEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (assetDestinationEntry.getAssetId() != null) {
            String assetId = assetDestinationEntry.getAssetId();
            jsonWriter.name("AssetId");
            jsonWriter.value(assetId);
        }
        if (assetDestinationEntry.getBucket() != null) {
            String bucket = assetDestinationEntry.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (assetDestinationEntry.getKey() != null) {
            String key = assetDestinationEntry.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        jsonWriter.endObject();
    }

    private static AssetDestinationEntryJsonMarshaller instance;

    public static AssetDestinationEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetDestinationEntryJsonMarshaller();
        return instance;
    }
}
