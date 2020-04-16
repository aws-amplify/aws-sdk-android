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
 * JSON marshaller for POJO AwsLambdaFunctionDetails
 */
class AwsLambdaFunctionDetailsJsonMarshaller {

    public void marshall(AwsLambdaFunctionDetails awsLambdaFunctionDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsLambdaFunctionDetails.getCode() != null) {
            AwsLambdaFunctionCode code = awsLambdaFunctionDetails.getCode();
            jsonWriter.name("Code");
            AwsLambdaFunctionCodeJsonMarshaller.getInstance().marshall(code, jsonWriter);
        }
        if (awsLambdaFunctionDetails.getCodeSha256() != null) {
            String codeSha256 = awsLambdaFunctionDetails.getCodeSha256();
            jsonWriter.name("CodeSha256");
            jsonWriter.value(codeSha256);
        }
        if (awsLambdaFunctionDetails.getDeadLetterConfig() != null) {
            AwsLambdaFunctionDeadLetterConfig deadLetterConfig = awsLambdaFunctionDetails
                    .getDeadLetterConfig();
            jsonWriter.name("DeadLetterConfig");
            AwsLambdaFunctionDeadLetterConfigJsonMarshaller.getInstance().marshall(
                    deadLetterConfig, jsonWriter);
        }
        if (awsLambdaFunctionDetails.getEnvironment() != null) {
            AwsLambdaFunctionEnvironment environment = awsLambdaFunctionDetails.getEnvironment();
            jsonWriter.name("Environment");
            AwsLambdaFunctionEnvironmentJsonMarshaller.getInstance().marshall(environment,
                    jsonWriter);
        }
        if (awsLambdaFunctionDetails.getFunctionName() != null) {
            String functionName = awsLambdaFunctionDetails.getFunctionName();
            jsonWriter.name("FunctionName");
            jsonWriter.value(functionName);
        }
        if (awsLambdaFunctionDetails.getHandler() != null) {
            String handler = awsLambdaFunctionDetails.getHandler();
            jsonWriter.name("Handler");
            jsonWriter.value(handler);
        }
        if (awsLambdaFunctionDetails.getKmsKeyArn() != null) {
            String kmsKeyArn = awsLambdaFunctionDetails.getKmsKeyArn();
            jsonWriter.name("KmsKeyArn");
            jsonWriter.value(kmsKeyArn);
        }
        if (awsLambdaFunctionDetails.getLastModified() != null) {
            String lastModified = awsLambdaFunctionDetails.getLastModified();
            jsonWriter.name("LastModified");
            jsonWriter.value(lastModified);
        }
        if (awsLambdaFunctionDetails.getLayers() != null) {
            java.util.List<AwsLambdaFunctionLayer> layers = awsLambdaFunctionDetails.getLayers();
            jsonWriter.name("Layers");
            jsonWriter.beginArray();
            for (AwsLambdaFunctionLayer layersItem : layers) {
                if (layersItem != null) {
                    AwsLambdaFunctionLayerJsonMarshaller.getInstance().marshall(layersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsLambdaFunctionDetails.getMasterArn() != null) {
            String masterArn = awsLambdaFunctionDetails.getMasterArn();
            jsonWriter.name("MasterArn");
            jsonWriter.value(masterArn);
        }
        if (awsLambdaFunctionDetails.getMemorySize() != null) {
            Integer memorySize = awsLambdaFunctionDetails.getMemorySize();
            jsonWriter.name("MemorySize");
            jsonWriter.value(memorySize);
        }
        if (awsLambdaFunctionDetails.getRevisionId() != null) {
            String revisionId = awsLambdaFunctionDetails.getRevisionId();
            jsonWriter.name("RevisionId");
            jsonWriter.value(revisionId);
        }
        if (awsLambdaFunctionDetails.getRole() != null) {
            String role = awsLambdaFunctionDetails.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (awsLambdaFunctionDetails.getRuntime() != null) {
            String runtime = awsLambdaFunctionDetails.getRuntime();
            jsonWriter.name("Runtime");
            jsonWriter.value(runtime);
        }
        if (awsLambdaFunctionDetails.getTimeout() != null) {
            Integer timeout = awsLambdaFunctionDetails.getTimeout();
            jsonWriter.name("Timeout");
            jsonWriter.value(timeout);
        }
        if (awsLambdaFunctionDetails.getTracingConfig() != null) {
            AwsLambdaFunctionTracingConfig tracingConfig = awsLambdaFunctionDetails
                    .getTracingConfig();
            jsonWriter.name("TracingConfig");
            AwsLambdaFunctionTracingConfigJsonMarshaller.getInstance().marshall(tracingConfig,
                    jsonWriter);
        }
        if (awsLambdaFunctionDetails.getVpcConfig() != null) {
            AwsLambdaFunctionVpcConfig vpcConfig = awsLambdaFunctionDetails.getVpcConfig();
            jsonWriter.name("VpcConfig");
            AwsLambdaFunctionVpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        if (awsLambdaFunctionDetails.getVersion() != null) {
            String version = awsLambdaFunctionDetails.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static AwsLambdaFunctionDetailsJsonMarshaller instance;

    public static AwsLambdaFunctionDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsLambdaFunctionDetailsJsonMarshaller();
        return instance;
    }
}
