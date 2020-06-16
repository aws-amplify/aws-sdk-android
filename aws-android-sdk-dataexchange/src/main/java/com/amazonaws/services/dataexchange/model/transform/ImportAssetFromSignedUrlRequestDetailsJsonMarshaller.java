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
 * JSON marshaller for POJO ImportAssetFromSignedUrlRequestDetails
 */
class ImportAssetFromSignedUrlRequestDetailsJsonMarshaller {

    public void marshall(
            ImportAssetFromSignedUrlRequestDetails importAssetFromSignedUrlRequestDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (importAssetFromSignedUrlRequestDetails.getAssetName() != null) {
            String assetName = importAssetFromSignedUrlRequestDetails.getAssetName();
            jsonWriter.name("AssetName");
            jsonWriter.value(assetName);
        }
        if (importAssetFromSignedUrlRequestDetails.getDataSetId() != null) {
            String dataSetId = importAssetFromSignedUrlRequestDetails.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (importAssetFromSignedUrlRequestDetails.getMd5Hash() != null) {
            String md5Hash = importAssetFromSignedUrlRequestDetails.getMd5Hash();
            jsonWriter.name("Md5Hash");
            jsonWriter.value(md5Hash);
        }
        if (importAssetFromSignedUrlRequestDetails.getRevisionId() != null) {
            String revisionId = importAssetFromSignedUrlRequestDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        jsonWriter.endObject();
    }

    private static ImportAssetFromSignedUrlRequestDetailsJsonMarshaller instance;

    public static ImportAssetFromSignedUrlRequestDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImportAssetFromSignedUrlRequestDetailsJsonMarshaller();
        return instance;
    }
}
