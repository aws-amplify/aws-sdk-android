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
 * JSON marshaller for POJO AwsCodeBuildProjectVpcConfig
 */
class AwsCodeBuildProjectVpcConfigJsonMarshaller {

    public void marshall(AwsCodeBuildProjectVpcConfig awsCodeBuildProjectVpcConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsCodeBuildProjectVpcConfig.getVpcId() != null) {
            String vpcId = awsCodeBuildProjectVpcConfig.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (awsCodeBuildProjectVpcConfig.getSubnets() != null) {
            java.util.List<String> subnets = awsCodeBuildProjectVpcConfig.getSubnets();
            jsonWriter.name("Subnets");
            jsonWriter.beginArray();
            for (String subnetsItem : subnets) {
                if (subnetsItem != null) {
                    jsonWriter.value(subnetsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (awsCodeBuildProjectVpcConfig.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = awsCodeBuildProjectVpcConfig
                    .getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
                    jsonWriter.value(securityGroupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AwsCodeBuildProjectVpcConfigJsonMarshaller instance;

    public static AwsCodeBuildProjectVpcConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsCodeBuildProjectVpcConfigJsonMarshaller();
        return instance;
    }
}
