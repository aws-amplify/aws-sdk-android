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
 * JSON marshaller for POJO AwsCodeBuildProjectDetails
 */
class AwsCodeBuildProjectDetailsJsonMarshaller {

    public void marshall(AwsCodeBuildProjectDetails awsCodeBuildProjectDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsCodeBuildProjectDetails.getEncryptionKey() != null) {
            String encryptionKey = awsCodeBuildProjectDetails.getEncryptionKey();
            jsonWriter.name("EncryptionKey");
            jsonWriter.value(encryptionKey);
        }
        if (awsCodeBuildProjectDetails.getEnvironment() != null) {
            AwsCodeBuildProjectEnvironment environment = awsCodeBuildProjectDetails
                    .getEnvironment();
            jsonWriter.name("Environment");
            AwsCodeBuildProjectEnvironmentJsonMarshaller.getInstance().marshall(environment,
                    jsonWriter);
        }
        if (awsCodeBuildProjectDetails.getName() != null) {
            String name = awsCodeBuildProjectDetails.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (awsCodeBuildProjectDetails.getSource() != null) {
            AwsCodeBuildProjectSource source = awsCodeBuildProjectDetails.getSource();
            jsonWriter.name("Source");
            AwsCodeBuildProjectSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
        }
        if (awsCodeBuildProjectDetails.getServiceRole() != null) {
            String serviceRole = awsCodeBuildProjectDetails.getServiceRole();
            jsonWriter.name("ServiceRole");
            jsonWriter.value(serviceRole);
        }
        if (awsCodeBuildProjectDetails.getVpcConfig() != null) {
            AwsCodeBuildProjectVpcConfig vpcConfig = awsCodeBuildProjectDetails.getVpcConfig();
            jsonWriter.name("VpcConfig");
            AwsCodeBuildProjectVpcConfigJsonMarshaller.getInstance()
                    .marshall(vpcConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AwsCodeBuildProjectDetailsJsonMarshaller instance;

    public static AwsCodeBuildProjectDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsCodeBuildProjectDetailsJsonMarshaller();
        return instance;
    }
}
