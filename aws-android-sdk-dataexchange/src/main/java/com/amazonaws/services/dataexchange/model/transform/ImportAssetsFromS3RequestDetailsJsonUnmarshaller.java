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
 * JSON unmarshaller for POJO ImportAssetsFromS3RequestDetails
 */
class ImportAssetsFromS3RequestDetailsJsonUnmarshaller implements
        Unmarshaller<ImportAssetsFromS3RequestDetails, JsonUnmarshallerContext> {

    public ImportAssetsFromS3RequestDetails unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ImportAssetsFromS3RequestDetails importAssetsFromS3RequestDetails = new ImportAssetsFromS3RequestDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssetSources")) {
                importAssetsFromS3RequestDetails
                        .setAssetSources(new ListUnmarshaller<AssetSourceEntry>(
                                AssetSourceEntryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DataSetId")) {
                importAssetsFromS3RequestDetails.setDataSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RevisionId")) {
                importAssetsFromS3RequestDetails.setRevisionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return importAssetsFromS3RequestDetails;
    }

    private static ImportAssetsFromS3RequestDetailsJsonUnmarshaller instance;

    public static ImportAssetsFromS3RequestDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportAssetsFromS3RequestDetailsJsonUnmarshaller();
        return instance;
    }
}
