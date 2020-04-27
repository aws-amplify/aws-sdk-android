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
 * JSON marshaller for POJO ImportAssetsFromS3RequestDetails
 */
class ImportAssetsFromS3RequestDetailsJsonMarshaller {

    public void marshall(ImportAssetsFromS3RequestDetails importAssetsFromS3RequestDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (importAssetsFromS3RequestDetails.getAssetSources() != null) {
            java.util.List<AssetSourceEntry> assetSources = importAssetsFromS3RequestDetails
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
        if (importAssetsFromS3RequestDetails.getDataSetId() != null) {
            String dataSetId = importAssetsFromS3RequestDetails.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (importAssetsFromS3RequestDetails.getRevisionId() != null) {
            String revisionId = importAssetsFromS3RequestDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        jsonWriter.endObject();
    }

    private static ImportAssetsFromS3RequestDetailsJsonMarshaller instance;

    public static ImportAssetsFromS3RequestDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportAssetsFromS3RequestDetailsJsonMarshaller();
        return instance;
    }
}
