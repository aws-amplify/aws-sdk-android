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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsKmsKeyDetails
 */
class AwsKmsKeyDetailsJsonUnmarshaller implements
        Unmarshaller<AwsKmsKeyDetails, JsonUnmarshallerContext> {

    public AwsKmsKeyDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsKmsKeyDetails awsKmsKeyDetails = new AwsKmsKeyDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AWSAccountId")) {
                awsKmsKeyDetails.setAWSAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                awsKmsKeyDetails.setCreationDate(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyId")) {
                awsKmsKeyDetails.setKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyManager")) {
                awsKmsKeyDetails.setKeyManager(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyState")) {
                awsKmsKeyDetails.setKeyState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Origin")) {
                awsKmsKeyDetails.setOrigin(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsKmsKeyDetails;
    }

    private static AwsKmsKeyDetailsJsonUnmarshaller instance;

    public static AwsKmsKeyDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsKmsKeyDetailsJsonUnmarshaller();
        return instance;
    }
}
