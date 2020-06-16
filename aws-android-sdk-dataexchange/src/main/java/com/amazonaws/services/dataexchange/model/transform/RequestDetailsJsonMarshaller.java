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
 * JSON marshaller for POJO RequestDetails
 */
class RequestDetailsJsonMarshaller {

    public void marshall(RequestDetails requestDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (requestDetails.getExportAssetToSignedUrl() != null) {
            ExportAssetToSignedUrlRequestDetails exportAssetToSignedUrl = requestDetails
                    .getExportAssetToSignedUrl();
            jsonWriter.name("ExportAssetToSignedUrl");
            ExportAssetToSignedUrlRequestDetailsJsonMarshaller.getInstance().marshall(
                    exportAssetToSignedUrl, jsonWriter);
        }
        if (requestDetails.getExportAssetsToS3() != null) {
            ExportAssetsToS3RequestDetails exportAssetsToS3 = requestDetails.getExportAssetsToS3();
            jsonWriter.name("ExportAssetsToS3");
            ExportAssetsToS3RequestDetailsJsonMarshaller.getInstance().marshall(exportAssetsToS3,
                    jsonWriter);
        }
        if (requestDetails.getImportAssetFromSignedUrl() != null) {
            ImportAssetFromSignedUrlRequestDetails importAssetFromSignedUrl = requestDetails
                    .getImportAssetFromSignedUrl();
            jsonWriter.name("ImportAssetFromSignedUrl");
            ImportAssetFromSignedUrlRequestDetailsJsonMarshaller.getInstance().marshall(
                    importAssetFromSignedUrl, jsonWriter);
        }
        if (requestDetails.getImportAssetsFromS3() != null) {
            ImportAssetsFromS3RequestDetails importAssetsFromS3 = requestDetails
                    .getImportAssetsFromS3();
            jsonWriter.name("ImportAssetsFromS3");
            ImportAssetsFromS3RequestDetailsJsonMarshaller.getInstance().marshall(
                    importAssetsFromS3, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RequestDetailsJsonMarshaller instance;

    public static RequestDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RequestDetailsJsonMarshaller();
        return instance;
    }
}
