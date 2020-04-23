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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChapInfo
 */
class ChapInfoJsonMarshaller {

    public void marshall(ChapInfo chapInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (chapInfo.getTargetARN() != null) {
            String targetARN = chapInfo.getTargetARN();
            jsonWriter.name("TargetARN");
            jsonWriter.value(targetARN);
        }
        if (chapInfo.getSecretToAuthenticateInitiator() != null) {
            String secretToAuthenticateInitiator = chapInfo.getSecretToAuthenticateInitiator();
            jsonWriter.name("SecretToAuthenticateInitiator");
            jsonWriter.value(secretToAuthenticateInitiator);
        }
        if (chapInfo.getInitiatorName() != null) {
            String initiatorName = chapInfo.getInitiatorName();
            jsonWriter.name("InitiatorName");
            jsonWriter.value(initiatorName);
        }
        if (chapInfo.getSecretToAuthenticateTarget() != null) {
            String secretToAuthenticateTarget = chapInfo.getSecretToAuthenticateTarget();
            jsonWriter.name("SecretToAuthenticateTarget");
            jsonWriter.value(secretToAuthenticateTarget);
        }
        jsonWriter.endObject();
    }

    private static ChapInfoJsonMarshaller instance;

    public static ChapInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChapInfoJsonMarshaller();
        return instance;
    }
}
