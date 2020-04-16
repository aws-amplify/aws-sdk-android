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
 * JSON unmarshaller for POJO AwsEc2SecurityGroupDetails
 */
class AwsEc2SecurityGroupDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2SecurityGroupDetails, JsonUnmarshallerContext> {

    public AwsEc2SecurityGroupDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsEc2SecurityGroupDetails awsEc2SecurityGroupDetails = new AwsEc2SecurityGroupDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GroupName")) {
                awsEc2SecurityGroupDetails.setGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupId")) {
                awsEc2SecurityGroupDetails.setGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OwnerId")) {
                awsEc2SecurityGroupDetails.setOwnerId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                awsEc2SecurityGroupDetails.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IpPermissions")) {
                awsEc2SecurityGroupDetails
                        .setIpPermissions(new ListUnmarshaller<AwsEc2SecurityGroupIpPermission>(
                                AwsEc2SecurityGroupIpPermissionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IpPermissionsEgress")) {
                awsEc2SecurityGroupDetails
                        .setIpPermissionsEgress(new ListUnmarshaller<AwsEc2SecurityGroupIpPermission>(
                                AwsEc2SecurityGroupIpPermissionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsEc2SecurityGroupDetails;
    }

    private static AwsEc2SecurityGroupDetailsJsonUnmarshaller instance;

    public static AwsEc2SecurityGroupDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupDetailsJsonUnmarshaller();
        return instance;
    }
}
