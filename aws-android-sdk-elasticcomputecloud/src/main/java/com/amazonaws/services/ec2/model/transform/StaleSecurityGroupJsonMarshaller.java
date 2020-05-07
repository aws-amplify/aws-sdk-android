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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StaleSecurityGroup
 */
class StaleSecurityGroupJsonMarshaller {

    public void marshall(StaleSecurityGroup staleSecurityGroup, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (staleSecurityGroup.getDescription() != null) {
            String description = staleSecurityGroup.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (staleSecurityGroup.getGroupId() != null) {
            String groupId = staleSecurityGroup.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (staleSecurityGroup.getGroupName() != null) {
            String groupName = staleSecurityGroup.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (staleSecurityGroup.getStaleIpPermissions() != null) {
            java.util.List<StaleIpPermission> staleIpPermissions = staleSecurityGroup
                    .getStaleIpPermissions();
            jsonWriter.name("StaleIpPermissions");
            jsonWriter.beginArray();
            for (StaleIpPermission staleIpPermissionsItem : staleIpPermissions) {
                if (staleIpPermissionsItem != null) {
                    StaleIpPermissionJsonMarshaller.getInstance().marshall(staleIpPermissionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (staleSecurityGroup.getStaleIpPermissionsEgress() != null) {
            java.util.List<StaleIpPermission> staleIpPermissionsEgress = staleSecurityGroup
                    .getStaleIpPermissionsEgress();
            jsonWriter.name("StaleIpPermissionsEgress");
            jsonWriter.beginArray();
            for (StaleIpPermission staleIpPermissionsEgressItem : staleIpPermissionsEgress) {
                if (staleIpPermissionsEgressItem != null) {
                    StaleIpPermissionJsonMarshaller.getInstance().marshall(
                            staleIpPermissionsEgressItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (staleSecurityGroup.getVpcId() != null) {
            String vpcId = staleSecurityGroup.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static StaleSecurityGroupJsonMarshaller instance;

    public static StaleSecurityGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StaleSecurityGroupJsonMarshaller();
        return instance;
    }
}
