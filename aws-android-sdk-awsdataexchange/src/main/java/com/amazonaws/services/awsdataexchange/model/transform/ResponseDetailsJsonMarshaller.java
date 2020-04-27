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
 * JSON marshaller for POJO ResponseDetails
 */
class ResponseDetailsJsonMarshaller {

    public void marshall(ResponseDetails responseDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (responseDetails.getExportAssetToSignedUrl() != null) {
            ExportAssetToSignedUrlResponseDetails exportAssetToSignedUrl = responseDetails
                    .getExportAssetToSignedUrl();
            jsonWriter.name("ExportAssetToSignedUrl");
            ExportAssetToSignedUrlResponseDetailsJsonMarshaller.getInstance().marshall(
                    exportAssetToSignedUrl, jsonWriter);
        }
        if (responseDetails.getExportAssetsToS3() != null) {
            ExportAssetsToS3ResponseDetails exportAssetsToS3 = responseDetails
                    .getExportAssetsToS3();
            jsonWriter.name("ExportAssetsToS3");
            ExportAssetsToS3ResponseDetailsJsonMarshaller.getInstance().marshall(exportAssetsToS3,
                    jsonWriter);
        }
        if (responseDetails.getImportAssetFromSignedUrl() != null) {
            ImportAssetFromSignedUrlResponseDetails importAssetFromSignedUrl = responseDetails
                    .getImportAssetFromSignedUrl();
            jsonWriter.name("ImportAssetFromSignedUrl");
            ImportAssetFromSignedUrlResponseDetailsJsonMarshaller.getInstance().marshall(
                    importAssetFromSignedUrl, jsonWriter);
        }
        if (responseDetails.getImportAssetsFromS3() != null) {
            ImportAssetsFromS3ResponseDetails importAssetsFromS3 = responseDetails
                    .getImportAssetsFromS3();
            jsonWriter.name("ImportAssetsFromS3");
            ImportAssetsFromS3ResponseDetailsJsonMarshaller.getInstance().marshall(
                    importAssetsFromS3, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ResponseDetailsJsonMarshaller instance;

    public static ResponseDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResponseDetailsJsonMarshaller();
        return instance;
    }
}
