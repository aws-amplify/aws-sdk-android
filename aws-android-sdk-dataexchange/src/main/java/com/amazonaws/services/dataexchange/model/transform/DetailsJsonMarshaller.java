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
 * JSON marshaller for POJO Details
 */
class DetailsJsonMarshaller {

    public void marshall(Details details, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (details.getImportAssetFromSignedUrlJobErrorDetails() != null) {
            ImportAssetFromSignedUrlJobErrorDetails importAssetFromSignedUrlJobErrorDetails = details
                    .getImportAssetFromSignedUrlJobErrorDetails();
            jsonWriter.name("ImportAssetFromSignedUrlJobErrorDetails");
            ImportAssetFromSignedUrlJobErrorDetailsJsonMarshaller.getInstance().marshall(
                    importAssetFromSignedUrlJobErrorDetails, jsonWriter);
        }
        if (details.getImportAssetsFromS3JobErrorDetails() != null) {
            java.util.List<AssetSourceEntry> importAssetsFromS3JobErrorDetails = details
                    .getImportAssetsFromS3JobErrorDetails();
            jsonWriter.name("ImportAssetsFromS3JobErrorDetails");
            jsonWriter.beginArray();
            for (AssetSourceEntry importAssetsFromS3JobErrorDetailsItem : importAssetsFromS3JobErrorDetails) {
                if (importAssetsFromS3JobErrorDetailsItem != null) {
                    AssetSourceEntryJsonMarshaller.getInstance().marshall(
                            importAssetsFromS3JobErrorDetailsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DetailsJsonMarshaller instance;

    public static DetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetailsJsonMarshaller();
        return instance;
    }
}
