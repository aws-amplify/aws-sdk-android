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
 * JSON unmarshaller for POJO BucketMetadata
 */
class BucketMetadataJsonUnmarshaller implements
        Unmarshaller<BucketMetadata, JsonUnmarshallerContext> {

    public BucketMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BucketMetadata bucketMetadata = new BucketMetadata();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("accountId")) {
                bucketMetadata.setAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bucketArn")) {
                bucketMetadata.setBucketArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bucketCreatedAt")) {
                bucketMetadata.setBucketCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bucketName")) {
                bucketMetadata.setBucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("classifiableObjectCount")) {
                bucketMetadata.setClassifiableObjectCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdated")) {
                bucketMetadata.setLastUpdated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("objectCount")) {
                bucketMetadata.setObjectCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("objectCountByEncryptionType")) {
                bucketMetadata
                        .setObjectCountByEncryptionType(ObjectCountByEncryptionTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("publicAccess")) {
                bucketMetadata.setPublicAccess(BucketPublicAccessJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                bucketMetadata.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("replicationDetails")) {
                bucketMetadata.setReplicationDetails(ReplicationDetailsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("sharedAccess")) {
                bucketMetadata.setSharedAccess(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sizeInBytes")) {
                bucketMetadata.setSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sizeInBytesCompressed")) {
                bucketMetadata.setSizeInBytesCompressed(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                bucketMetadata.setTags(new ListUnmarshaller<KeyValuePair>(
                        KeyValuePairJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("versioning")) {
                bucketMetadata.setVersioning(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return bucketMetadata;
    }

    private static BucketMetadataJsonUnmarshaller instance;

    public static BucketMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BucketMetadataJsonUnmarshaller();
        return instance;
    }
}
