/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeDatasetResult
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public class DescribeDatasetResultJsonUnmarshaller implements
        Unmarshaller<DescribeDatasetResult, JsonUnmarshallerContext> {

    public DescribeDatasetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDatasetResult describeDatasetResult = new DescribeDatasetResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Dataset")) {
                describeDatasetResult.setDataset(DatasetJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeDatasetResult;
    }

    private static DescribeDatasetResultJsonUnmarshaller instance;

    public static DescribeDatasetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDatasetResultJsonUnmarshaller();
        return instance;
    }
}
