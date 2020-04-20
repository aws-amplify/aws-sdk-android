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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VpcLink
 */
class VpcLinkJsonMarshaller {

    public void marshall(VpcLink vpcLink, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpcLink.getCreatedDate() != null) {
            java.util.Date createdDate = vpcLink.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (vpcLink.getName() != null) {
            String name = vpcLink.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (vpcLink.getSecurityGroupIds() != null) {
            java.util.List<String> securityGroupIds = vpcLink.getSecurityGroupIds();
            jsonWriter.name("SecurityGroupIds");
            jsonWriter.beginArray();
            for (String securityGroupIdsItem : securityGroupIds) {
                if (securityGroupIdsItem != null) {
                    jsonWriter.value(securityGroupIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcLink.getSubnetIds() != null) {
            java.util.List<String> subnetIds = vpcLink.getSubnetIds();
            jsonWriter.name("SubnetIds");
            jsonWriter.beginArray();
            for (String subnetIdsItem : subnetIds) {
                if (subnetIdsItem != null) {
                    jsonWriter.value(subnetIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (vpcLink.getTags() != null) {
            java.util.Map<String, String> tags = vpcLink.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (vpcLink.getVpcLinkId() != null) {
            String vpcLinkId = vpcLink.getVpcLinkId();
            jsonWriter.name("VpcLinkId");
            jsonWriter.value(vpcLinkId);
        }
        if (vpcLink.getVpcLinkStatus() != null) {
            String vpcLinkStatus = vpcLink.getVpcLinkStatus();
            jsonWriter.name("VpcLinkStatus");
            jsonWriter.value(vpcLinkStatus);
        }
        if (vpcLink.getVpcLinkStatusMessage() != null) {
            String vpcLinkStatusMessage = vpcLink.getVpcLinkStatusMessage();
            jsonWriter.name("VpcLinkStatusMessage");
            jsonWriter.value(vpcLinkStatusMessage);
        }
        if (vpcLink.getVpcLinkVersion() != null) {
            String vpcLinkVersion = vpcLink.getVpcLinkVersion();
            jsonWriter.name("VpcLinkVersion");
            jsonWriter.value(vpcLinkVersion);
        }
        jsonWriter.endObject();
    }

    private static VpcLinkJsonMarshaller instance;

    public static VpcLinkJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpcLinkJsonMarshaller();
        return instance;
    }
}
