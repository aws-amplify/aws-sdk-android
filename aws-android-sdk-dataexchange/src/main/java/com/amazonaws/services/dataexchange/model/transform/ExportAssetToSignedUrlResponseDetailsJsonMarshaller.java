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
 * JSON marshaller for POJO ExportAssetToSignedUrlResponseDetails
 */
class ExportAssetToSignedUrlResponseDetailsJsonMarshaller {

    public void marshall(
            ExportAssetToSignedUrlResponseDetails exportAssetToSignedUrlResponseDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportAssetToSignedUrlResponseDetails.getAssetId() != null) {
            String assetId = exportAssetToSignedUrlResponseDetails.getAssetId();
            jsonWriter.name("AssetId");
            jsonWriter.value(assetId);
        }
        if (exportAssetToSignedUrlResponseDetails.getDataSetId() != null) {
            String dataSetId = exportAssetToSignedUrlResponseDetails.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (exportAssetToSignedUrlResponseDetails.getRevisionId() != null) {
            String revisionId = exportAssetToSignedUrlResponseDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        if (exportAssetToSignedUrlResponseDetails.getSignedUrl() != null) {
            String signedUrl = exportAssetToSignedUrlResponseDetails.getSignedUrl();
            jsonWriter.name("SignedUrl");
            jsonWriter.value(signedUrl);
        }
        if (exportAssetToSignedUrlResponseDetails.getSignedUrlExpiresAt() != null) {
            java.util.Date signedUrlExpiresAt = exportAssetToSignedUrlResponseDetails
                    .getSignedUrlExpiresAt();
            jsonWriter.name("SignedUrlExpiresAt");
            jsonWriter.value(signedUrlExpiresAt);
        }
        jsonWriter.endObject();
    }

    private static ExportAssetToSignedUrlResponseDetailsJsonMarshaller instance;

    public static ExportAssetToSignedUrlResponseDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportAssetToSignedUrlResponseDetailsJsonMarshaller();
        return instance;
    }
}
