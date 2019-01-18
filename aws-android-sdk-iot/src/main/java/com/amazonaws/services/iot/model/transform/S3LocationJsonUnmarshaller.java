/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3Location
 */
class S3LocationJsonUnmarshaller implements Unmarshaller<S3Location, JsonUnmarshallerContext> {

    public S3Location unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3Location s3Location = new S3Location();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("bucket")) {
                s3Location.setBucket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("key")) {
                s3Location.setKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                s3Location.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3Location;
    }

    private static S3LocationJsonUnmarshaller instance;

    public static S3LocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3LocationJsonUnmarshaller();
        return instance;
    }
}
