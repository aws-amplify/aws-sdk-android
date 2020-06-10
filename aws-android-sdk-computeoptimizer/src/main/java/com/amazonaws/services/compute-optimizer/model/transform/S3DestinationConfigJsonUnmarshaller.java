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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO S3DestinationConfig
 */
class S3DestinationConfigJsonUnmarshaller implements Unmarshaller<S3DestinationConfig, JsonUnmarshallerContext> {

    public S3DestinationConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3DestinationConfig s3DestinationConfig = new S3DestinationConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("bucket")) {
                s3DestinationConfig.setBucket(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("keyPrefix")) {
                s3DestinationConfig.setKeyPrefix(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3DestinationConfig;
    }

    private static S3DestinationConfigJsonUnmarshaller instance;
    public static S3DestinationConfigJsonUnmarshaller getInstance() {
        if (instance == null) instance = new S3DestinationConfigJsonUnmarshaller();
        return instance;
    }
}
