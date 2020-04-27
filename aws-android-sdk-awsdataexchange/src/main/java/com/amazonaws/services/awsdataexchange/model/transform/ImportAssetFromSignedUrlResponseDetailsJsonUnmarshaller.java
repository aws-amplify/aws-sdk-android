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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ImportAssetFromSignedUrlResponseDetails
 */
class ImportAssetFromSignedUrlResponseDetailsJsonUnmarshaller implements
        Unmarshaller<ImportAssetFromSignedUrlResponseDetails, JsonUnmarshallerContext> {

    public ImportAssetFromSignedUrlResponseDetails unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImportAssetFromSignedUrlResponseDetails importAssetFromSignedUrlResponseDetails = new ImportAssetFromSignedUrlResponseDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssetName")) {
                importAssetFromSignedUrlResponseDetails.setAssetName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSetId")) {
                importAssetFromSignedUrlResponseDetails.setDataSetId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Md5Hash")) {
                importAssetFromSignedUrlResponseDetails.setMd5Hash(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RevisionId")) {
                importAssetFromSignedUrlResponseDetails.setRevisionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SignedUrl")) {
                importAssetFromSignedUrlResponseDetails.setSignedUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SignedUrlExpiresAt")) {
                importAssetFromSignedUrlResponseDetails.setSignedUrlExpiresAt(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return importAssetFromSignedUrlResponseDetails;
    }

    private static ImportAssetFromSignedUrlResponseDetailsJsonUnmarshaller instance;

    public static ImportAssetFromSignedUrlResponseDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportAssetFromSignedUrlResponseDetailsJsonUnmarshaller();
        return instance;
    }
}
