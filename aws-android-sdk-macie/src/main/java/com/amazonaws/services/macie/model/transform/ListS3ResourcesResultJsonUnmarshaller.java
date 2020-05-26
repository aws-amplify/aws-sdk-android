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

package com.amazonaws.services.macie.model.transform;

import com.amazonaws.services.macie.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListS3ResourcesResult
 */
public class ListS3ResourcesResultJsonUnmarshaller implements
        Unmarshaller<ListS3ResourcesResult, JsonUnmarshallerContext> {

    public ListS3ResourcesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListS3ResourcesResult listS3ResourcesResult = new ListS3ResourcesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("s3Resources")) {
                listS3ResourcesResult
                        .setS3Resources(new ListUnmarshaller<S3ResourceClassification>(
                                S3ResourceClassificationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listS3ResourcesResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listS3ResourcesResult;
    }

    private static ListS3ResourcesResultJsonUnmarshaller instance;

    public static ListS3ResourcesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListS3ResourcesResultJsonUnmarshaller();
        return instance;
    }
}
