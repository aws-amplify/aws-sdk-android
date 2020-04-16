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
 * JSON unmarshaller for POJO AwsLambdaFunctionDetails
 */
class AwsLambdaFunctionDetailsJsonUnmarshaller implements
        Unmarshaller<AwsLambdaFunctionDetails, JsonUnmarshallerContext> {

    public AwsLambdaFunctionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsLambdaFunctionDetails awsLambdaFunctionDetails = new AwsLambdaFunctionDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Code")) {
                awsLambdaFunctionDetails.setCode(AwsLambdaFunctionCodeJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodeSha256")) {
                awsLambdaFunctionDetails.setCodeSha256(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeadLetterConfig")) {
                awsLambdaFunctionDetails
                        .setDeadLetterConfig(AwsLambdaFunctionDeadLetterConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Environment")) {
                awsLambdaFunctionDetails
                        .setEnvironment(AwsLambdaFunctionEnvironmentJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("FunctionName")) {
                awsLambdaFunctionDetails.setFunctionName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Handler")) {
                awsLambdaFunctionDetails.setHandler(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyArn")) {
                awsLambdaFunctionDetails.setKmsKeyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModified")) {
                awsLambdaFunctionDetails.setLastModified(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Layers")) {
                awsLambdaFunctionDetails.setLayers(new ListUnmarshaller<AwsLambdaFunctionLayer>(
                        AwsLambdaFunctionLayerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MasterArn")) {
                awsLambdaFunctionDetails.setMasterArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MemorySize")) {
                awsLambdaFunctionDetails.setMemorySize(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RevisionId")) {
                awsLambdaFunctionDetails.setRevisionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Role")) {
                awsLambdaFunctionDetails.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Runtime")) {
                awsLambdaFunctionDetails.setRuntime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timeout")) {
                awsLambdaFunctionDetails.setTimeout(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TracingConfig")) {
                awsLambdaFunctionDetails
                        .setTracingConfig(AwsLambdaFunctionTracingConfigJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("VpcConfig")) {
                awsLambdaFunctionDetails.setVpcConfig(AwsLambdaFunctionVpcConfigJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                awsLambdaFunctionDetails.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsLambdaFunctionDetails;
    }

    private static AwsLambdaFunctionDetailsJsonUnmarshaller instance;

    public static AwsLambdaFunctionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsLambdaFunctionDetailsJsonUnmarshaller();
        return instance;
    }
}
