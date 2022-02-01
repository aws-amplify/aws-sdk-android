/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO CustomSMSLambdaVersionConfigType
 */
class CustomSMSLambdaVersionConfigTypeJsonMarshaller {

    public void marshall(CustomSMSLambdaVersionConfigType customSMSLambdaVersionConfigType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (customSMSLambdaVersionConfigType.getLambdaVersion() != null) {
            String lambdaVersion = customSMSLambdaVersionConfigType.getLambdaVersion();
            jsonWriter.name("LambdaVersion");
            jsonWriter.value(lambdaVersion);
        }
        if (customSMSLambdaVersionConfigType.getLambdaArn() != null) {
            String lambdaArn = customSMSLambdaVersionConfigType.getLambdaArn();
            jsonWriter.name("LambdaArn");
            jsonWriter.value(lambdaArn);
        }
        jsonWriter.endObject();
    }

    private static CustomSMSLambdaVersionConfigTypeJsonMarshaller instance;

    public static CustomSMSLambdaVersionConfigTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CustomSMSLambdaVersionConfigTypeJsonMarshaller();
        return instance;
    }
}
