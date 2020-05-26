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
 * JSON unmarshaller for POJO FailedS3Resource
 */
class FailedS3ResourceJsonUnmarshaller implements
        Unmarshaller<FailedS3Resource, JsonUnmarshallerContext> {

    public FailedS3Resource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FailedS3Resource failedS3Resource = new FailedS3Resource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("failedItem")) {
                failedS3Resource.setFailedItem(S3ResourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorCode")) {
                failedS3Resource.setErrorCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("errorMessage")) {
                failedS3Resource.setErrorMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return failedS3Resource;
    }

    private static FailedS3ResourceJsonUnmarshaller instance;

    public static FailedS3ResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FailedS3ResourceJsonUnmarshaller();
        return instance;
    }
}
