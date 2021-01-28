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
 * JSON marshaller for POJO VpcDestinationSummary
 */
class VpcDestinationSummaryJsonMarshaller {

    public void marshall(VpcDestinationSummary vpcDestinationSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (vpcDestinationSummary.getSubnetIds() != null) {
            java.util.List<String> subnetIds = vpcDestinationSummary.getSubnetIds();
            jsonWriter.name("subnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcDestinationSummary.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = vpcDestinationSummary.getSecurityGroups();
            jsonWriter.name("securityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcDestinationSummary.getVpcId() != null) {
            String vpcId = vpcDestinationSummary.getVpcId();
            jsonWriter.name("vpcId");
            jsonWriter.value(vpcId);
        }
        if (vpcDestinationSummary.getRoleArn() != null) {
            String roleArn = vpcDestinationSummary.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static VpcDestinationSummaryJsonMarshaller instance;

    public static VpcDestinationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcDestinationSummaryJsonMarshaller();
        return instance;
    }
}
