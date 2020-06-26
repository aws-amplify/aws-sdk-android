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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReplicationSubnetGroup
 */
class ReplicationSubnetGroupJsonUnmarshaller implements
        Unmarshaller<ReplicationSubnetGroup, JsonUnmarshallerContext> {

    public ReplicationSubnetGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReplicationSubnetGroup replicationSubnetGroup = new ReplicationSubnetGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ReplicationSubnetGroupIdentifier")) {
                replicationSubnetGroup.setReplicationSubnetGroupIdentifier(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationSubnetGroupDescription")) {
                replicationSubnetGroup.setReplicationSubnetGroupDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                replicationSubnetGroup.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetGroupStatus")) {
                replicationSubnetGroup.setSubnetGroupStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Subnets")) {
                replicationSubnetGroup.setSubnets(new ListUnmarshaller<Subnet>(
                        SubnetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return replicationSubnetGroup;
    }

    private static ReplicationSubnetGroupJsonUnmarshaller instance;

    public static ReplicationSubnetGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationSubnetGroupJsonUnmarshaller();
        return instance;
    }
}
