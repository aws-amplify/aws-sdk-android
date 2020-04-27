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
 * JSON marshaller for POJO ImportAssetsFromS3ResponseDetails
 */
class ImportAssetsFromS3ResponseDetailsJsonMarshaller {

    public void marshall(ImportAssetsFromS3ResponseDetails importAssetsFromS3ResponseDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (importAssetsFromS3ResponseDetails.getAssetSources() != null) {
            java.util.List<AssetSourceEntry> assetSources = importAssetsFromS3ResponseDetails
                    .getAssetSources();
            jsonWriter.name("AssetSources");
            jsonWriter.beginArray();
            for (AssetSourceEntry assetSourcesItem : assetSources) {
                if (assetSourcesItem != null) {
                    AssetSourceEntryJsonMarshaller.getInstance().marshall(assetSourcesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (importAssetsFromS3ResponseDetails.getDataSetId() != null) {
            String dataSetId = importAssetsFromS3ResponseDetails.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (importAssetsFromS3ResponseDetails.getRevisionId() != null) {
            String revisionId = importAssetsFromS3ResponseDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        jsonWriter.endObject();
    }

    private static ImportAssetsFromS3ResponseDetailsJsonMarshaller instance;

    public static ImportAssetsFromS3ResponseDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportAssetsFromS3ResponseDetailsJsonMarshaller();
        return instance;
    }
}
