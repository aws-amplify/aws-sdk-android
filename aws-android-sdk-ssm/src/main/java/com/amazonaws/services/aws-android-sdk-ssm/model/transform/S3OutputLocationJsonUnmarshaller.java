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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO S3OutputLocation
 */
class S3OutputLocationJsonUnmarshaller implements Unmarshaller<S3OutputLocation, JsonUnmarshallerContext> {

    public S3OutputLocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3OutputLocation s3OutputLocation = new S3OutputLocation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OutputS3Region")) {
                s3OutputLocation.setOutputS3Region(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OutputS3BucketName")) {
                s3OutputLocation.setOutputS3BucketName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OutputS3KeyPrefix")) {
                s3OutputLocation.setOutputS3KeyPrefix(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3OutputLocation;
    }

    private static S3OutputLocationJsonUnmarshaller instance;
    public static S3OutputLocationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new S3OutputLocationJsonUnmarshaller();
        return instance;
    }
}
