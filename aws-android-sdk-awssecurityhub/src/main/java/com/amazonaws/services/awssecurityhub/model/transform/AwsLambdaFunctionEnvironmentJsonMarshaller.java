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
 * JSON marshaller for POJO AwsLambdaFunctionEnvironment
 */
class AwsLambdaFunctionEnvironmentJsonMarshaller {

    public void marshall(AwsLambdaFunctionEnvironment awsLambdaFunctionEnvironment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsLambdaFunctionEnvironment.getVariables() != null) {
            java.util.Map<String, String> variables = awsLambdaFunctionEnvironment.getVariables();
            jsonWriter.name("Variables");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> variablesEntry : variables.entrySet()) {
                String variablesValue = variablesEntry.getValue();
                if (variablesValue != null) {
                    jsonWriter.name(variablesEntry.getKey());
                    jsonWriter.value(variablesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (awsLambdaFunctionEnvironment.getError() != null) {
            AwsLambdaFunctionEnvironmentError error = awsLambdaFunctionEnvironment.getError();
            jsonWriter.name("Error");
            AwsLambdaFunctionEnvironmentErrorJsonMarshaller.getInstance().marshall(error,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AwsLambdaFunctionEnvironmentJsonMarshaller instance;

    public static AwsLambdaFunctionEnvironmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsLambdaFunctionEnvironmentJsonMarshaller();
        return instance;
    }
}
