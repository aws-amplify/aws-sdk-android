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
 * JSON unmarshaller for POJO AwsEc2SecurityGroupIpPermission
 */
class AwsEc2SecurityGroupIpPermissionJsonUnmarshaller implements
        Unmarshaller<AwsEc2SecurityGroupIpPermission, JsonUnmarshallerContext> {

    public AwsEc2SecurityGroupIpPermission unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AwsEc2SecurityGroupIpPermission awsEc2SecurityGroupIpPermission = new AwsEc2SecurityGroupIpPermission();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("IpProtocol")) {
                awsEc2SecurityGroupIpPermission.setIpProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FromPort")) {
                awsEc2SecurityGroupIpPermission.setFromPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ToPort")) {
                awsEc2SecurityGroupIpPermission.setToPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserIdGroupPairs")) {
                awsEc2SecurityGroupIpPermission
                        .setUserIdGroupPairs(new ListUnmarshaller<AwsEc2SecurityGroupUserIdGroupPair>(
                                AwsEc2SecurityGroupUserIdGroupPairJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("IpRanges")) {
                awsEc2SecurityGroupIpPermission
                        .setIpRanges(new ListUnmarshaller<AwsEc2SecurityGroupIpRange>(
                                AwsEc2SecurityGroupIpRangeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Ipv6Ranges")) {
                awsEc2SecurityGroupIpPermission
                        .setIpv6Ranges(new ListUnmarshaller<AwsEc2SecurityGroupIpv6Range>(
                                AwsEc2SecurityGroupIpv6RangeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PrefixListIds")) {
                awsEc2SecurityGroupIpPermission
                        .setPrefixListIds(new ListUnmarshaller<AwsEc2SecurityGroupPrefixListId>(
                                AwsEc2SecurityGroupPrefixListIdJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return awsEc2SecurityGroupIpPermission;
    }

    private static AwsEc2SecurityGroupIpPermissionJsonUnmarshaller instance;

    public static AwsEc2SecurityGroupIpPermissionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupIpPermissionJsonUnmarshaller();
        return instance;
    }
}
