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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsVpcConfiguration
 */
class AwsVpcConfigurationJsonMarshaller {

    public void marshall(AwsVpcConfiguration awsVpcConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsVpcConfiguration.getSubnets() != null) {
            java.util.List<String> subnets = awsVpcConfiguration.getSubnets();
            jsonWriter.name("subnets");
            jsonWriter.beginArray();
            for (String subnetsItem : subnets) {
                if (subnetsItem != null) {
                    jsonWriter.value(subnetsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (awsVpcConfiguration.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = awsVpcConfiguration.getSecurityGroups();
            jsonWriter.name("securityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (awsVpcConfiguration.getAssignPublicIp() != null) {
            String assignPublicIp = awsVpcConfiguration.getAssignPublicIp();
            jsonWriter.name("assignPublicIp");
            jsonWriter.value(assignPublicIp);
        }
        jsonWriter.endObject();
    }

    private static AwsVpcConfigurationJsonMarshaller instance;

    public static AwsVpcConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsVpcConfigurationJsonMarshaller();
        return instance;
    }
}
