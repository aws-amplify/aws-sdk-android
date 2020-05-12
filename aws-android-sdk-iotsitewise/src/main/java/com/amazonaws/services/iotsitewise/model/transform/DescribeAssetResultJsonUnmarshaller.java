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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeAssetResult
 */
public class DescribeAssetResultJsonUnmarshaller implements
        Unmarshaller<DescribeAssetResult, JsonUnmarshallerContext> {

    public DescribeAssetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAssetResult describeAssetResult = new DescribeAssetResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("assetId")) {
                describeAssetResult.setAssetId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetArn")) {
                describeAssetResult.setAssetArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetName")) {
                describeAssetResult.setAssetName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetModelId")) {
                describeAssetResult.setAssetModelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetProperties")) {
                describeAssetResult.setAssetProperties(new ListUnmarshaller<AssetProperty>(
                        AssetPropertyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("assetHierarchies")) {
                describeAssetResult.setAssetHierarchies(new ListUnmarshaller<AssetHierarchy>(
                        AssetHierarchyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("assetCreationDate")) {
                describeAssetResult.setAssetCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetLastUpdateDate")) {
                describeAssetResult.setAssetLastUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetStatus")) {
                describeAssetResult.setAssetStatus(AssetStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAssetResult;
    }

    private static DescribeAssetResultJsonUnmarshaller instance;

    public static DescribeAssetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAssetResultJsonUnmarshaller();
        return instance;
    }
}
