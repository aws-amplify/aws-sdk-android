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
 * JSON marshaller for POJO ExportAssetsToS3RequestDetails
 */
class ExportAssetsToS3RequestDetailsJsonMarshaller {

    public void marshall(ExportAssetsToS3RequestDetails exportAssetsToS3RequestDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportAssetsToS3RequestDetails.getAssetDestinations() != null) {
            java.util.List<AssetDestinationEntry> assetDestinations = exportAssetsToS3RequestDetails
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
        if (exportAssetsToS3RequestDetails.getDataSetId() != null) {
            String dataSetId = exportAssetsToS3RequestDetails.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (exportAssetsToS3RequestDetails.getEncryption() != null) {
            ExportServerSideEncryption encryption = exportAssetsToS3RequestDetails.getEncryption();
            jsonWriter.name("Encryption");
            ExportServerSideEncryptionJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (exportAssetsToS3RequestDetails.getRevisionId() != null) {
            String revisionId = exportAssetsToS3RequestDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        jsonWriter.endObject();
    }

    private static ExportAssetsToS3RequestDetailsJsonMarshaller instance;

    public static ExportAssetsToS3RequestDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportAssetsToS3RequestDetailsJsonMarshaller();
        return instance;
    }
}
