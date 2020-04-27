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
 * JSON unmarshaller for response GetDataSetResult
 */
public class GetDataSetResultJsonUnmarshaller implements
        Unmarshaller<GetDataSetResult, JsonUnmarshallerContext> {

    public GetDataSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDataSetResult getDataSetResult = new GetDataSetResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                getDataSetResult.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssetType")) {
                getDataSetResult.setAssetType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                getDataSetResult.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                getDataSetResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                getDataSetResult.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                getDataSetResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Origin")) {
                getDataSetResult.setOrigin(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OriginDetails")) {
                getDataSetResult.setOriginDetails(OriginDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceId")) {
                getDataSetResult.setSourceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                getDataSetResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UpdatedAt")) {
                getDataSetResult.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDataSetResult;
    }

    private static GetDataSetResultJsonUnmarshaller instance;

    public static GetDataSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataSetResultJsonUnmarshaller();
        return instance;
    }
}
