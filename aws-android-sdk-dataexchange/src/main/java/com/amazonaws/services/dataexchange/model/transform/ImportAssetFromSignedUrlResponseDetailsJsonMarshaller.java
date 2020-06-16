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
 * JSON marshaller for POJO ImportAssetFromSignedUrlResponseDetails
 */
class ImportAssetFromSignedUrlResponseDetailsJsonMarshaller {

    public void marshall(
            ImportAssetFromSignedUrlResponseDetails importAssetFromSignedUrlResponseDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (importAssetFromSignedUrlResponseDetails.getAssetName() != null) {
            String assetName = importAssetFromSignedUrlResponseDetails.getAssetName();
            jsonWriter.name("AssetName");
            jsonWriter.value(assetName);
        }
        if (importAssetFromSignedUrlResponseDetails.getDataSetId() != null) {
            String dataSetId = importAssetFromSignedUrlResponseDetails.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (importAssetFromSignedUrlResponseDetails.getMd5Hash() != null) {
            String md5Hash = importAssetFromSignedUrlResponseDetails.getMd5Hash();
            jsonWriter.name("Md5Hash");
            jsonWriter.value(md5Hash);
        }
        if (importAssetFromSignedUrlResponseDetails.getRevisionId() != null) {
            String revisionId = importAssetFromSignedUrlResponseDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        if (importAssetFromSignedUrlResponseDetails.getSignedUrl() != null) {
            String signedUrl = importAssetFromSignedUrlResponseDetails.getSignedUrl();
            jsonWriter.name("SignedUrl");
            jsonWriter.value(signedUrl);
        }
        if (importAssetFromSignedUrlResponseDetails.getSignedUrlExpiresAt() != null) {
            java.util.Date signedUrlExpiresAt = importAssetFromSignedUrlResponseDetails
                    .getSignedUrlExpiresAt();
            jsonWriter.name("SignedUrlExpiresAt");
            jsonWriter.value(signedUrlExpiresAt);
        }
        jsonWriter.endObject();
    }

    private static ImportAssetFromSignedUrlResponseDetailsJsonMarshaller instance;

    public static ImportAssetFromSignedUrlResponseDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportAssetFromSignedUrlResponseDetailsJsonMarshaller();
        return instance;
    }
}
