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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsKmsKeyDetails
 */
class AwsKmsKeyDetailsJsonMarshaller {

    public void marshall(AwsKmsKeyDetails awsKmsKeyDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsKmsKeyDetails.getAWSAccountId() != null) {
            String aWSAccountId = awsKmsKeyDetails.getAWSAccountId();
            jsonWriter.name("AWSAccountId");
            jsonWriter.value(aWSAccountId);
        }
        if (awsKmsKeyDetails.getCreationDate() != null) {
            Double creationDate = awsKmsKeyDetails.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (awsKmsKeyDetails.getKeyId() != null) {
            String keyId = awsKmsKeyDetails.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        if (awsKmsKeyDetails.getKeyManager() != null) {
            String keyManager = awsKmsKeyDetails.getKeyManager();
            jsonWriter.name("KeyManager");
            jsonWriter.value(keyManager);
        }
        if (awsKmsKeyDetails.getKeyState() != null) {
            String keyState = awsKmsKeyDetails.getKeyState();
            jsonWriter.name("KeyState");
            jsonWriter.value(keyState);
        }
        if (awsKmsKeyDetails.getOrigin() != null) {
            String origin = awsKmsKeyDetails.getOrigin();
            jsonWriter.name("Origin");
            jsonWriter.value(origin);
        }
        jsonWriter.endObject();
    }

    private static AwsKmsKeyDetailsJsonMarshaller instance;

    public static AwsKmsKeyDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsKmsKeyDetailsJsonMarshaller();
        return instance;
    }
}
