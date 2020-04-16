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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AwsEc2SecurityGroupUserIdGroupPair
 */
class AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller implements
        Unmarshaller<AwsEc2SecurityGroupUserIdGroupPair, JsonUnmarshallerContext> {

    public AwsEc2SecurityGroupUserIdGroupPair unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsEc2SecurityGroupUserIdGroupPair awsEc2SecurityGroupUserIdGroupPair = new AwsEc2SecurityGroupUserIdGroupPair();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GroupId")) {
                awsEc2SecurityGroupUserIdGroupPair.setGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupName")) {
                awsEc2SecurityGroupUserIdGroupPair.setGroupName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PeeringStatus")) {
                awsEc2SecurityGroupUserIdGroupPair.setPeeringStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserId")) {
                awsEc2SecurityGroupUserIdGroupPair.setUserId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                awsEc2SecurityGroupUserIdGroupPair.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcPeeringConnectionId")) {
                awsEc2SecurityGroupUserIdGroupPair.setVpcPeeringConnectionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsEc2SecurityGroupUserIdGroupPair;
    }

    private static AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller instance;

    public static AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller();
        return instance;
    }
}
