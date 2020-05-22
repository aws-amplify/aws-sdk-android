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
 * JSON unmarshaller for response DescribeAssetModelResult
 */
public class DescribeAssetModelResultJsonUnmarshaller implements
        Unmarshaller<DescribeAssetModelResult, JsonUnmarshallerContext> {

    public DescribeAssetModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAssetModelResult describeAssetModelResult = new DescribeAssetModelResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("assetModelId")) {
                describeAssetModelResult.setAssetModelId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetModelArn")) {
                describeAssetModelResult.setAssetModelArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetModelName")) {
                describeAssetModelResult.setAssetModelName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetModelDescription")) {
                describeAssetModelResult.setAssetModelDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetModelProperties")) {
                describeAssetModelResult
                        .setAssetModelProperties(new ListUnmarshaller<AssetModelProperty>(
                                AssetModelPropertyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("assetModelHierarchies")) {
                describeAssetModelResult
                        .setAssetModelHierarchies(new ListUnmarshaller<AssetModelHierarchy>(
                                AssetModelHierarchyJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("assetModelCreationDate")) {
                describeAssetModelResult.setAssetModelCreationDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetModelLastUpdateDate")) {
                describeAssetModelResult.setAssetModelLastUpdateDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("assetModelStatus")) {
                describeAssetModelResult.setAssetModelStatus(AssetModelStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAssetModelResult;
    }

    private static DescribeAssetModelResultJsonUnmarshaller instance;

    public static DescribeAssetModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAssetModelResultJsonUnmarshaller();
        return instance;
    }
}
