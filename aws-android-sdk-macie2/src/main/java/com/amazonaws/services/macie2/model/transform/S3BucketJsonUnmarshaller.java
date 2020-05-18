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
 * JSON unmarshaller for POJO S3Bucket
 */
class S3BucketJsonUnmarshaller implements Unmarshaller<S3Bucket, JsonUnmarshallerContext> {

    public S3Bucket unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3Bucket s3Bucket = new S3Bucket();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                s3Bucket.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                s3Bucket.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("defaultServerSideEncryption")) {
                s3Bucket.setDefaultServerSideEncryption(ServerSideEncryptionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                s3Bucket.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("owner")) {
                s3Bucket.setOwner(S3BucketOwnerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("publicAccess")) {
                s3Bucket.setPublicAccess(BucketPublicAccessJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                s3Bucket.setTags(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3Bucket;
    }

    private static S3BucketJsonUnmarshaller instance;

    public static S3BucketJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3BucketJsonUnmarshaller();
        return instance;
    }
}
