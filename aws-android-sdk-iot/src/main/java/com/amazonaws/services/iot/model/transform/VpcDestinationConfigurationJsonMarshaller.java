/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VpcDestinationConfiguration
 */
class VpcDestinationConfigurationJsonMarshaller {

    public void marshall(VpcDestinationConfiguration vpcDestinationConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpcDestinationConfiguration.getSubnetIds() != null) {
            java.util.List<String> subnetIds = vpcDestinationConfiguration.getSubnetIds();
            jsonWriter.name("subnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcDestinationConfiguration.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = vpcDestinationConfiguration.getSecurityGroups();
            jsonWriter.name("securityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcDestinationConfiguration.getVpcId() != null) {
            String vpcId = vpcDestinationConfiguration.getVpcId();
            jsonWriter.name("vpcId");
            jsonWriter.value(vpcId);
        }
        if (vpcDestinationConfiguration.getRoleArn() != null) {
            String roleArn = vpcDestinationConfiguration.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static VpcDestinationConfigurationJsonMarshaller instance;

    public static VpcDestinationConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcDestinationConfigurationJsonMarshaller();
        return instance;
    }
}
