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
 * JSON marshaller for POJO AwsEc2SecurityGroupUserIdGroupPair
 */
class AwsEc2SecurityGroupUserIdGroupPairJsonMarshaller {

    public void marshall(AwsEc2SecurityGroupUserIdGroupPair awsEc2SecurityGroupUserIdGroupPair,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsEc2SecurityGroupUserIdGroupPair.getGroupId() != null) {
            String groupId = awsEc2SecurityGroupUserIdGroupPair.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (awsEc2SecurityGroupUserIdGroupPair.getGroupName() != null) {
            String groupName = awsEc2SecurityGroupUserIdGroupPair.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (awsEc2SecurityGroupUserIdGroupPair.getPeeringStatus() != null) {
            String peeringStatus = awsEc2SecurityGroupUserIdGroupPair.getPeeringStatus();
            jsonWriter.name("PeeringStatus");
            jsonWriter.value(peeringStatus);
        }
        if (awsEc2SecurityGroupUserIdGroupPair.getUserId() != null) {
            String userId = awsEc2SecurityGroupUserIdGroupPair.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (awsEc2SecurityGroupUserIdGroupPair.getVpcId() != null) {
            String vpcId = awsEc2SecurityGroupUserIdGroupPair.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (awsEc2SecurityGroupUserIdGroupPair.getVpcPeeringConnectionId() != null) {
            String vpcPeeringConnectionId = awsEc2SecurityGroupUserIdGroupPair
                    .getVpcPeeringConnectionId();
            jsonWriter.name("VpcPeeringConnectionId");
            jsonWriter.value(vpcPeeringConnectionId);
        }
        jsonWriter.endObject();
    }

    private static AwsEc2SecurityGroupUserIdGroupPairJsonMarshaller instance;

    public static AwsEc2SecurityGroupUserIdGroupPairJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupUserIdGroupPairJsonMarshaller();
        return instance;
    }
}
