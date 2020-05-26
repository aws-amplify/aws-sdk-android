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
 * JSON unmarshaller for response UpdateS3ResourcesResult
 */
public class UpdateS3ResourcesResultJsonUnmarshaller implements
        Unmarshaller<UpdateS3ResourcesResult, JsonUnmarshallerContext> {

    public UpdateS3ResourcesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateS3ResourcesResult updateS3ResourcesResult = new UpdateS3ResourcesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("failedS3Resources")) {
                updateS3ResourcesResult
                        .setFailedS3Resources(new ListUnmarshaller<FailedS3Resource>(
                                FailedS3ResourceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateS3ResourcesResult;
    }

    private static UpdateS3ResourcesResultJsonUnmarshaller instance;

    public static UpdateS3ResourcesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateS3ResourcesResultJsonUnmarshaller();
        return instance;
    }
}
