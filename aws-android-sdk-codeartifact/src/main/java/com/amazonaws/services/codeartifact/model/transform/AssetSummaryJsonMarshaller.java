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

package com.amazonaws.services.codeartifact.model.transform;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AssetSummary
 */
class AssetSummaryJsonMarshaller {

    public void marshall(AssetSummary assetSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (assetSummary.getName() != null) {
            String name = assetSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (assetSummary.getSize() != null) {
            Long size = assetSummary.getSize();
            jsonWriter.name("size");
            jsonWriter.value(size);
        }
        if (assetSummary.getHashes() != null) {
            java.util.Map<String, String> hashes = assetSummary.getHashes();
            jsonWriter.name("hashes");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> hashesEntry : hashes.entrySet()) {
                String hashesValue = hashesEntry.getValue();
                if (hashesValue != null) {
                    jsonWriter.name(hashesEntry.getKey());
                    jsonWriter.value(hashesValue);
                }
            }
            jsonWriter.endObject();
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
