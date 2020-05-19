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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO IpPermission
 */
class IpPermissionJsonUnmarshaller implements Unmarshaller<IpPermission, JsonUnmarshallerContext> {

    public IpPermission unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        IpPermission ipPermission = new IpPermission();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FromPort")) {
                ipPermission.setFromPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IpProtocol")) {
                ipPermission.setIpProtocol(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IpRanges")) {
                ipPermission.setIpRanges(new ListUnmarshaller<IpRange>(IpRangeJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Ipv6Ranges")) {
                ipPermission.setIpv6Ranges(new ListUnmarshaller<Ipv6Range>(
                        Ipv6RangeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PrefixListIds")) {
                ipPermission.setPrefixListIds(new ListUnmarshaller<PrefixListId>(
                        PrefixListIdJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ToPort")) {
                ipPermission.setToPort(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserIdGroupPairs")) {
                ipPermission.setUserIdGroupPairs(new ListUnmarshaller<UserIdGroupPair>(
                        UserIdGroupPairJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return ipPermission;
    }

    private static IpPermissionJsonUnmarshaller instance;

    public static IpPermissionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpPermissionJsonUnmarshaller();
        return instance;
    }
}
