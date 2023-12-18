/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PreTokenGenerationVersionConfigType
 */
class PreTokenGenerationVersionConfigTypeJsonMarshaller {

    public void marshall(PreTokenGenerationVersionConfigType preTokenGenerationVersionConfigType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (preTokenGenerationVersionConfigType.getLambdaVersion() != null) {
            String lambdaVersion = preTokenGenerationVersionConfigType.getLambdaVersion();
            jsonWriter.name("LambdaVersion");
            jsonWriter.value(lambdaVersion);
        }
        if (preTokenGenerationVersionConfigType.getLambdaArn() != null) {
            String lambdaArn = preTokenGenerationVersionConfigType.getLambdaArn();
            jsonWriter.name("LambdaArn");
            jsonWriter.value(lambdaArn);
        }
        jsonWriter.endObject();
    }

    private static PreTokenGenerationVersionConfigTypeJsonMarshaller instance;

    public static PreTokenGenerationVersionConfigTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PreTokenGenerationVersionConfigTypeJsonMarshaller();
        return instance;
    }
}
