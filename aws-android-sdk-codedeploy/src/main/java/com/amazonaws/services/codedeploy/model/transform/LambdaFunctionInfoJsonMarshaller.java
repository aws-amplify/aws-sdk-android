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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LambdaFunctionInfo
 */
class LambdaFunctionInfoJsonMarshaller {

    public void marshall(LambdaFunctionInfo lambdaFunctionInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lambdaFunctionInfo.getFunctionName() != null) {
            String functionName = lambdaFunctionInfo.getFunctionName();
            jsonWriter.name("functionName");
            jsonWriter.value(functionName);
        }
        if (lambdaFunctionInfo.getFunctionAlias() != null) {
            String functionAlias = lambdaFunctionInfo.getFunctionAlias();
            jsonWriter.name("functionAlias");
            jsonWriter.value(functionAlias);
        }
        if (lambdaFunctionInfo.getCurrentVersion() != null) {
            String currentVersion = lambdaFunctionInfo.getCurrentVersion();
            jsonWriter.name("currentVersion");
            jsonWriter.value(currentVersion);
        }
        if (lambdaFunctionInfo.getTargetVersion() != null) {
            String targetVersion = lambdaFunctionInfo.getTargetVersion();
            jsonWriter.name("targetVersion");
            jsonWriter.value(targetVersion);
        }
        if (lambdaFunctionInfo.getTargetVersionWeight() != null) {
            Double targetVersionWeight = lambdaFunctionInfo.getTargetVersionWeight();
            jsonWriter.name("targetVersionWeight");
            jsonWriter.value(targetVersionWeight);
        }
        jsonWriter.endObject();
    }

    private static LambdaFunctionInfoJsonMarshaller instance;

    public static LambdaFunctionInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LambdaFunctionInfoJsonMarshaller();
        return instance;
    }
}
