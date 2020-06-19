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
 * JSON marshaller for POJO SecurityGroup
 */
class SecurityGroupJsonMarshaller {

    public void marshall(SecurityGroup securityGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (securityGroup.getDescription() != null) {
            String description = securityGroup.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (securityGroup.getGroupName() != null) {
            String groupName = securityGroup.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (securityGroup.getIpPermissions() != null) {
            java.util.List<IpPermission> ipPermissions = securityGroup.getIpPermissions();
            jsonWriter.name("IpPermissions");
            jsonWriter.beginArray();
            for (IpPermission ipPermissionsItem : ipPermissions) {
                if (ipPermissionsItem != null) {
                    IpPermissionJsonMarshaller.getInstance()
                            .marshall(ipPermissionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (securityGroup.getOwnerId() != null) {
            String ownerId = securityGroup.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (securityGroup.getGroupId() != null) {
            String groupId = securityGroup.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (securityGroup.getIpPermissionsEgress() != null) {
            java.util.List<IpPermission> ipPermissionsEgress = securityGroup
                    .getIpPermissionsEgress();
            jsonWriter.name("IpPermissionsEgress");
            jsonWriter.beginArray();
            for (IpPermission ipPermissionsEgressItem : ipPermissionsEgress) {
                if (ipPermissionsEgressItem != null) {
                    IpPermissionJsonMarshaller.getInstance().marshall(ipPermissionsEgressItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (securityGroup.getTags() != null) {
            java.util.List<Tag> tags = securityGroup.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (securityGroup.getVpcId() != null) {
            String vpcId = securityGroup.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static SecurityGroupJsonMarshaller instance;

    public static SecurityGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityGroupJsonMarshaller();
        return instance;
    }
}
