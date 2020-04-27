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
 * JSON marshaller for POJO ExportAssetsToS3ResponseDetails
 */
class ExportAssetsToS3ResponseDetailsJsonMarshaller {

    public void marshall(ExportAssetsToS3ResponseDetails exportAssetsToS3ResponseDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportAssetsToS3ResponseDetails.getAssetDestinations() != null) {
            java.util.List<AssetDestinationEntry> assetDestinations = exportAssetsToS3ResponseDetails
                    .getAssetDestinations();
            jsonWriter.name("AssetDestinations");
            jsonWriter.beginArray();
            for (AssetDestinationEntry assetDestinationsItem : assetDestinations) {
                if (assetDestinationsItem != null) {
                    AssetDestinationEntryJsonMarshaller.getInstance().marshall(
                            assetDestinationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (exportAssetsToS3ResponseDetails.getDataSetId() != null) {
            String dataSetId = exportAssetsToS3ResponseDetails.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (exportAssetsToS3ResponseDetails.getEncryption() != null) {
            ExportServerSideEncryption encryption = exportAssetsToS3ResponseDetails.getEncryption();
            jsonWriter.name("Encryption");
            ExportServerSideEncryptionJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (exportAssetsToS3ResponseDetails.getRevisionId() != null) {
            String revisionId = exportAssetsToS3ResponseDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        jsonWriter.endObject();
    }

    private static ExportAssetsToS3ResponseDetailsJsonMarshaller instance;

    public static ExportAssetsToS3ResponseDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportAssetsToS3ResponseDetailsJsonMarshaller();
        return instance;
    }
}
