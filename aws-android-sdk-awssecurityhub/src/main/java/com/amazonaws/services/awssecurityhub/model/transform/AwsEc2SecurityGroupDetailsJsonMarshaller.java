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
 * JSON marshaller for POJO AwsEc2SecurityGroupDetails
 */
class AwsEc2SecurityGroupDetailsJsonMarshaller {

    public void marshall(AwsEc2SecurityGroupDetails awsEc2SecurityGroupDetails,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsEc2SecurityGroupDetails.getGroupName() != null) {
            String groupName = awsEc2SecurityGroupDetails.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (awsEc2SecurityGroupDetails.getGroupId() != null) {
            String groupId = awsEc2SecurityGroupDetails.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (awsEc2SecurityGroupDetails.getOwnerId() != null) {
            String ownerId = awsEc2SecurityGroupDetails.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (awsEc2SecurityGroupDetails.getVpcId() != null) {
            String vpcId = awsEc2SecurityGroupDetails.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (awsEc2SecurityGroupDetails.getIpPermissions() != null) {
            java.util.List<AwsEc2SecurityGroupIpPermission> ipPermissions = awsEc2SecurityGroupDetails
                    .getIpPermissions();
            jsonWriter.name("IpPermissions");
            jsonWriter.beginArray();
            for (AwsEc2SecurityGroupIpPermission ipPermissionsItem : ipPermissions) {
                if (ipPermissionsItem != null) {
                    AwsEc2SecurityGroupIpPermissionJsonMarshaller.getInstance().marshall(
                            ipPermissionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsEc2SecurityGroupDetails.getIpPermissionsEgress() != null) {
            java.util.List<AwsEc2SecurityGroupIpPermission> ipPermissionsEgress = awsEc2SecurityGroupDetails
                    .getIpPermissionsEgress();
            jsonWriter.name("IpPermissionsEgress");
            jsonWriter.beginArray();
            for (AwsEc2SecurityGroupIpPermission ipPermissionsEgressItem : ipPermissionsEgress) {
                if (ipPermissionsEgressItem != null) {
                    AwsEc2SecurityGroupIpPermissionJsonMarshaller.getInstance().marshall(
                            ipPermissionsEgressItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static AwsEc2SecurityGroupDetailsJsonMarshaller instance;

    public static AwsEc2SecurityGroupDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupDetailsJsonMarshaller();
        return instance;
    }
}
