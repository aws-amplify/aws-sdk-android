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
package com.amazonaws.services.aws-android-sdk-secretsmanager.model.transform;

import com.amazonaws.services.aws-android-sdk-secretsmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for response CancelRotateSecretResult
 */
public class CancelRotateSecretResultJsonUnmarshaller implements Unmarshaller<CancelRotateSecretResult, JsonUnmarshallerContext> {

    public CancelRotateSecretResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CancelRotateSecretResult cancelRotateSecretResult = new CancelRotateSecretResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ARN")) {
                cancelRotateSecretResult.setARN(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Name")) {
                cancelRotateSecretResult.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("VersionId")) {
                cancelRotateSecretResult.setVersionId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return cancelRotateSecretResult;
    }

    private static CancelRotateSecretResultJsonUnmarshaller instance;
    public static CancelRotateSecretResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CancelRotateSecretResultJsonUnmarshaller();
        return instance;
    }
}
