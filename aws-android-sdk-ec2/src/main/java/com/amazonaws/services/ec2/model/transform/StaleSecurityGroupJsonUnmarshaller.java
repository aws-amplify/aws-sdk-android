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
 * JSON unmarshaller for POJO StaleSecurityGroup
 */
class StaleSecurityGroupJsonUnmarshaller implements
        Unmarshaller<StaleSecurityGroup, JsonUnmarshallerContext> {

    public StaleSecurityGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StaleSecurityGroup staleSecurityGroup = new StaleSecurityGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Description")) {
                staleSecurityGroup.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupId")) {
                staleSecurityGroup.setGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupName")) {
                staleSecurityGroup.setGroupName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StaleIpPermissions")) {
                staleSecurityGroup.setStaleIpPermissions(new ListUnmarshaller<StaleIpPermission>(
                        StaleIpPermissionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StaleIpPermissionsEgress")) {
                staleSecurityGroup
                        .setStaleIpPermissionsEgress(new ListUnmarshaller<StaleIpPermission>(
                                StaleIpPermissionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcId")) {
                staleSecurityGroup.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return staleSecurityGroup;
    }

    private static StaleSecurityGroupJsonUnmarshaller instance;

    public static StaleSecurityGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StaleSecurityGroupJsonUnmarshaller();
        return instance;
    }
}
