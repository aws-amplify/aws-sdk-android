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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeRefreshSchemasStatusResult
 */
public class DescribeRefreshSchemasStatusResultJsonUnmarshaller implements
        Unmarshaller<DescribeRefreshSchemasStatusResult, JsonUnmarshallerContext> {

    public DescribeRefreshSchemasStatusResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeRefreshSchemasStatusResult describeRefreshSchemasStatusResult = new DescribeRefreshSchemasStatusResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("RefreshSchemasStatus")) {
                describeRefreshSchemasStatusResult
                        .setRefreshSchemasStatus(RefreshSchemasStatusJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeRefreshSchemasStatusResult;
    }

    private static DescribeRefreshSchemasStatusResultJsonUnmarshaller instance;

    public static DescribeRefreshSchemasStatusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRefreshSchemasStatusResultJsonUnmarshaller();
        return instance;
    }
}
