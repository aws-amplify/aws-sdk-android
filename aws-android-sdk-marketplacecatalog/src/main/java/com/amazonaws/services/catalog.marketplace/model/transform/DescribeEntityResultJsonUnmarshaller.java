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

package com.amazonaws.services.catalog.marketplace.model.transform;

import com.amazonaws.services.catalog.marketplace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeEntityResult
 */
public class DescribeEntityResultJsonUnmarshaller implements
        Unmarshaller<DescribeEntityResult, JsonUnmarshallerContext> {

    public DescribeEntityResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeEntityResult describeEntityResult = new DescribeEntityResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EntityType")) {
                describeEntityResult.setEntityType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EntityIdentifier")) {
                describeEntityResult.setEntityIdentifier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EntityArn")) {
                describeEntityResult.setEntityArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                describeEntityResult.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Details")) {
                describeEntityResult.setDetails(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeEntityResult;
    }

    private static DescribeEntityResultJsonUnmarshaller instance;

    public static DescribeEntityResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEntityResultJsonUnmarshaller();
        return instance;
    }
}
