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
 * JSON unmarshaller for response UpdateAssetResult
 */
public class UpdateAssetResultJsonUnmarshaller implements
        Unmarshaller<UpdateAssetResult, JsonUnmarshallerContext> {

    public UpdateAssetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateAssetResult updateAssetResult = new UpdateAssetResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                updateAssetResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssetDetails")) {
                updateAssetResult.setAssetDetails(AssetDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssetType")) {
                updateAssetResult.setAssetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                updateAssetResult.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DataSetId")) {
                updateAssetResult.setDataSetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                updateAssetResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                updateAssetResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RevisionId")) {
                updateAssetResult.setRevisionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceId")) {
                updateAssetResult.setSourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedAt")) {
                updateAssetResult.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateAssetResult;
    }

    private static UpdateAssetResultJsonUnmarshaller instance;

    public static UpdateAssetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateAssetResultJsonUnmarshaller();
        return instance;
    }
}
