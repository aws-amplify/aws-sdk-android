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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO S3Storage
 */
class S3StorageJsonUnmarshaller implements Unmarshaller<S3Storage, JsonUnmarshallerContext> {

    public S3Storage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3Storage s3Storage = new S3Storage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AWSAccessKeyId")) {
                s3Storage.setAWSAccessKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bucket")) {
                s3Storage.setBucket(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Prefix")) {
                s3Storage.setPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UploadPolicy")) {
                s3Storage.setUploadPolicy(ByteBufferJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UploadPolicySignature")) {
                s3Storage.setUploadPolicySignature(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3Storage;
    }

    private static S3StorageJsonUnmarshaller instance;

    public static S3StorageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3StorageJsonUnmarshaller();
        return instance;
    }
}
