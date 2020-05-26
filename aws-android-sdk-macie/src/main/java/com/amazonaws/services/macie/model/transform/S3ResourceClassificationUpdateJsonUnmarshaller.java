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
 * JSON unmarshaller for POJO S3ResourceClassificationUpdate
 */
class S3ResourceClassificationUpdateJsonUnmarshaller implements
        Unmarshaller<S3ResourceClassificationUpdate, JsonUnmarshallerContext> {

    public S3ResourceClassificationUpdate unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        S3ResourceClassificationUpdate s3ResourceClassificationUpdate = new S3ResourceClassificationUpdate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("bucketName")) {
                s3ResourceClassificationUpdate.setBucketName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("prefix")) {
                s3ResourceClassificationUpdate.setPrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("classificationTypeUpdate")) {
                s3ResourceClassificationUpdate
                        .setClassificationTypeUpdate(ClassificationTypeUpdateJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return s3ResourceClassificationUpdate;
    }

    private static S3ResourceClassificationUpdateJsonUnmarshaller instance;

    public static S3ResourceClassificationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3ResourceClassificationUpdateJsonUnmarshaller();
        return instance;
    }
}
