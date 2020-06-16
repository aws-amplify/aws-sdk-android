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
 * JSON marshaller for POJO AssetSourceEntry
 */
class AssetSourceEntryJsonMarshaller {

    public void marshall(AssetSourceEntry assetSourceEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (assetSourceEntry.getBucket() != null) {
            String bucket = assetSourceEntry.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (assetSourceEntry.getKey() != null) {
            String key = assetSourceEntry.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        jsonWriter.endObject();
    }

    private static AssetSourceEntryJsonMarshaller instance;

    public static AssetSourceEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssetSourceEntryJsonMarshaller();
        return instance;
    }
}
