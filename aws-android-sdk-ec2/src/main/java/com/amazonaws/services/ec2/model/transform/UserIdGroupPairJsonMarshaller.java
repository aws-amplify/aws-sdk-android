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
 * JSON marshaller for POJO UserIdGroupPair
 */
class UserIdGroupPairJsonMarshaller {

    public void marshall(UserIdGroupPair userIdGroupPair, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userIdGroupPair.getDescription() != null) {
            String description = userIdGroupPair.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (userIdGroupPair.getGroupId() != null) {
            String groupId = userIdGroupPair.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (userIdGroupPair.getGroupName() != null) {
            String groupName = userIdGroupPair.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (userIdGroupPair.getPeeringStatus() != null) {
            String peeringStatus = userIdGroupPair.getPeeringStatus();
            jsonWriter.name("PeeringStatus");
            jsonWriter.value(peeringStatus);
        }
        if (userIdGroupPair.getUserId() != null) {
            String userId = userIdGroupPair.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (userIdGroupPair.getVpcId() != null) {
            String vpcId = userIdGroupPair.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (userIdGroupPair.getVpcPeeringConnectionId() != null) {
            String vpcPeeringConnectionId = userIdGroupPair.getVpcPeeringConnectionId();
            jsonWriter.name("VpcPeeringConnectionId");
            jsonWriter.value(vpcPeeringConnectionId);
        }
        jsonWriter.endObject();
    }

    private static UserIdGroupPairJsonMarshaller instance;

    public static UserIdGroupPairJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserIdGroupPairJsonMarshaller();
        return instance;
    }
}
