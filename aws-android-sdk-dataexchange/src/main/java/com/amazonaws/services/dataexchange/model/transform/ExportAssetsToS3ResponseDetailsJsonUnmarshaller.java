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
 * JSON unmarshaller for POJO ExportAssetsToS3ResponseDetails
 */
class ExportAssetsToS3ResponseDetailsJsonUnmarshaller implements
        Unmarshaller<ExportAssetsToS3ResponseDetails, JsonUnmarshallerContext> {

    public ExportAssetsToS3ResponseDetails unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ExportAssetsToS3ResponseDetails exportAssetsToS3ResponseDetails = new ExportAssetsToS3ResponseDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssetDestinations")) {
                exportAssetsToS3ResponseDetails
                        .setAssetDestinations(new ListUnmarshaller<AssetDestinationEntry>(
                                AssetDestinationEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DataSetId")) {
                exportAssetsToS3ResponseDetails.setDataSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encryption")) {
                exportAssetsToS3ResponseDetails
                        .setEncryption(ExportServerSideEncryptionJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RevisionId")) {
                exportAssetsToS3ResponseDetails.setRevisionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return exportAssetsToS3ResponseDetails;
    }

    private static ExportAssetsToS3ResponseDetailsJsonUnmarshaller instance;

    public static ExportAssetsToS3ResponseDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExportAssetsToS3ResponseDetailsJsonUnmarshaller();
        return instance;
    }
}
