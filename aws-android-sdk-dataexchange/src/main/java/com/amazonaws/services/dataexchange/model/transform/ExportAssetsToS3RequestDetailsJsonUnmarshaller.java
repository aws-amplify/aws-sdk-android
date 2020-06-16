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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ExportAssetsToS3RequestDetails
 */
class ExportAssetsToS3RequestDetailsJsonUnmarshaller implements
        Unmarshaller<ExportAssetsToS3RequestDetails, JsonUnmarshallerContext> {

    public ExportAssetsToS3RequestDetails unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ExportAssetsToS3RequestDetails exportAssetsToS3RequestDetails = new ExportAssetsToS3RequestDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssetDestinations")) {
                exportAssetsToS3RequestDetails
                        .setAssetDestinations(new ListUnmarshaller<AssetDestinationEntry>(
                                AssetDestinationEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DataSetId")) {
                exportAssetsToS3RequestDetails.setDataSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encryption")) {
                exportAssetsToS3RequestDetails
                        .setEncryption(ExportServerSideEncryptionJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RevisionId")) {
                exportAssetsToS3RequestDetails.setRevisionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return exportAssetsToS3RequestDetails;
    }

    private static ExportAssetsToS3RequestDetailsJsonUnmarshaller instance;

    public static ExportAssetsToS3RequestDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportAssetsToS3RequestDetailsJsonUnmarshaller();
        return instance;
    }
}
