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
 * JSON unmarshaller for response GetBucketStatisticsResult
 */
public class GetBucketStatisticsResultJsonUnmarshaller implements
        Unmarshaller<GetBucketStatisticsResult, JsonUnmarshallerContext> {

    public GetBucketStatisticsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBucketStatisticsResult getBucketStatisticsResult = new GetBucketStatisticsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("bucketCount")) {
                getBucketStatisticsResult.setBucketCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bucketCountByEffectivePermission")) {
                getBucketStatisticsResult
                        .setBucketCountByEffectivePermission(BucketCountByEffectivePermissionJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("bucketCountByEncryptionType")) {
                getBucketStatisticsResult
                        .setBucketCountByEncryptionType(BucketCountByEncryptionTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("bucketCountBySharedAccessType")) {
                getBucketStatisticsResult
                        .setBucketCountBySharedAccessType(BucketCountBySharedAccessTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("classifiableObjectCount")) {
                getBucketStatisticsResult.setClassifiableObjectCount(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdated")) {
                getBucketStatisticsResult.setLastUpdated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("objectCount")) {
                getBucketStatisticsResult.setObjectCount(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sizeInBytes")) {
                getBucketStatisticsResult.setSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sizeInBytesCompressed")) {
                getBucketStatisticsResult.setSizeInBytesCompressed(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getBucketStatisticsResult;
    }

    private static GetBucketStatisticsResultJsonUnmarshaller instance;

    public static GetBucketStatisticsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBucketStatisticsResultJsonUnmarshaller();
        return instance;
    }
}
