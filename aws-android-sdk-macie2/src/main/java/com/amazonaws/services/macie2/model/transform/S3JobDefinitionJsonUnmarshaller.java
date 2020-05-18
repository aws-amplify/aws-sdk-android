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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3JobDefinition
 */
class S3JobDefinitionJsonUnmarshaller implements
        Unmarshaller<S3JobDefinition, JsonUnmarshallerContext> {

    public S3JobDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3JobDefinition s3JobDefinition = new S3JobDefinition();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("bucketDefinitions")) {
                s3JobDefinition
                        .setBucketDefinitions(new ListUnmarshaller<S3BucketDefinitionForJob>(
                                S3BucketDefinitionForJobJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("scoping")) {
                s3JobDefinition.setScoping(ScopingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3JobDefinition;
    }

    private static S3JobDefinitionJsonUnmarshaller instance;

    public static S3JobDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3JobDefinitionJsonUnmarshaller();
        return instance;
    }
}
