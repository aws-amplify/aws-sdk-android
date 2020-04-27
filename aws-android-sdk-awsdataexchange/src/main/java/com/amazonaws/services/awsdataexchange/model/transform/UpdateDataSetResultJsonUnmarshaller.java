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
 * JSON unmarshaller for response UpdateDataSetResult
 */
public class UpdateDataSetResultJsonUnmarshaller implements
        Unmarshaller<UpdateDataSetResult, JsonUnmarshallerContext> {

    public UpdateDataSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateDataSetResult updateDataSetResult = new UpdateDataSetResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                updateDataSetResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssetType")) {
                updateDataSetResult.setAssetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                updateDataSetResult.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                updateDataSetResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                updateDataSetResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                updateDataSetResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Origin")) {
                updateDataSetResult.setOrigin(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OriginDetails")) {
                updateDataSetResult.setOriginDetails(OriginDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceId")) {
                updateDataSetResult.setSourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpdatedAt")) {
                updateDataSetResult.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateDataSetResult;
    }

    private static UpdateDataSetResultJsonUnmarshaller instance;

    public static UpdateDataSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDataSetResultJsonUnmarshaller();
        return instance;
    }
}
