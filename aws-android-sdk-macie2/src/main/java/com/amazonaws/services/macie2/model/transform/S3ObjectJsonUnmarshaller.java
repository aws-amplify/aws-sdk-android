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
 * JSON unmarshaller for POJO S3Object
 */
class S3ObjectJsonUnmarshaller implements Unmarshaller<S3Object, JsonUnmarshallerContext> {

    public S3Object unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3Object s3Object = new S3Object();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("bucketArn")) {
                s3Object.setBucketArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eTag")) {
                s3Object.setETag(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("extension")) {
                s3Object.setExtension(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("key")) {
                s3Object.setKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModified")) {
                s3Object.setLastModified(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("path")) {
                s3Object.setPath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("publicAccess")) {
                s3Object.setPublicAccess(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("serverSideEncryption")) {
                s3Object.setServerSideEncryption(ServerSideEncryptionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("size")) {
                s3Object.setSize(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("storageClass")) {
                s3Object.setStorageClass(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                s3Object.setTags(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("versionId")) {
                s3Object.setVersionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3Object;
    }

    private static S3ObjectJsonUnmarshaller instance;

    public static S3ObjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ObjectJsonUnmarshaller();
        return instance;
    }
}
