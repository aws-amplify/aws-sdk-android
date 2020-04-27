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
 * JSON marshaller for POJO ExportAssetToSignedUrlRequestDetails
 */
class ExportAssetToSignedUrlRequestDetailsJsonMarshaller {

    public void marshall(ExportAssetToSignedUrlRequestDetails exportAssetToSignedUrlRequestDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportAssetToSignedUrlRequestDetails.getAssetId() != null) {
            String assetId = exportAssetToSignedUrlRequestDetails.getAssetId();
            jsonWriter.name("AssetId");
            jsonWriter.value(assetId);
        }
        if (exportAssetToSignedUrlRequestDetails.getDataSetId() != null) {
            String dataSetId = exportAssetToSignedUrlRequestDetails.getDataSetId();
            jsonWriter.name("DataSetId");
            jsonWriter.value(dataSetId);
        }
        if (exportAssetToSignedUrlRequestDetails.getRevisionId() != null) {
            String revisionId = exportAssetToSignedUrlRequestDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        jsonWriter.endObject();
    }

    private static ExportAssetToSignedUrlRequestDetailsJsonMarshaller instance;

    public static ExportAssetToSignedUrlRequestDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExportAssetToSignedUrlRequestDetailsJsonMarshaller();
        return instance;
    }
}
