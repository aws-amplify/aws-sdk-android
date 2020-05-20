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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO LambdaFunctionInfo
 */
class LambdaFunctionInfoJsonUnmarshaller implements
        Unmarshaller<LambdaFunctionInfo, JsonUnmarshallerContext> {

    public LambdaFunctionInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LambdaFunctionInfo lambdaFunctionInfo = new LambdaFunctionInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("functionName")) {
                lambdaFunctionInfo.setFunctionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("functionAlias")) {
                lambdaFunctionInfo.setFunctionAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("currentVersion")) {
                lambdaFunctionInfo.setCurrentVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targetVersion")) {
                lambdaFunctionInfo.setTargetVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("targetVersionWeight")) {
                lambdaFunctionInfo.setTargetVersionWeight(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return lambdaFunctionInfo;
    }

    private static LambdaFunctionInfoJsonUnmarshaller instance;

    public static LambdaFunctionInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaFunctionInfoJsonUnmarshaller();
        return instance;
    }
}
