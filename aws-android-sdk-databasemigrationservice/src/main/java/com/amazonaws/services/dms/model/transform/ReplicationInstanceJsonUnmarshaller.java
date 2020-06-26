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
 * JSON unmarshaller for POJO ReplicationInstance
 */
class ReplicationInstanceJsonUnmarshaller implements
        Unmarshaller<ReplicationInstance, JsonUnmarshallerContext> {

    public ReplicationInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReplicationInstance replicationInstance = new ReplicationInstance();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ReplicationInstanceIdentifier")) {
                replicationInstance.setReplicationInstanceIdentifier(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationInstanceClass")) {
                replicationInstance.setReplicationInstanceClass(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationInstanceStatus")) {
                replicationInstance.setReplicationInstanceStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllocatedStorage")) {
                replicationInstance.setAllocatedStorage(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCreateTime")) {
                replicationInstance.setInstanceCreateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcSecurityGroups")) {
                replicationInstance
                        .setVpcSecurityGroups(new ListUnmarshaller<VpcSecurityGroupMembership>(
                                VpcSecurityGroupMembershipJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                replicationInstance.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationSubnetGroup")) {
                replicationInstance
                        .setReplicationSubnetGroup(ReplicationSubnetGroupJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("PreferredMaintenanceWindow")) {
                replicationInstance.setPreferredMaintenanceWindow(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PendingModifiedValues")) {
                replicationInstance
                        .setPendingModifiedValues(ReplicationPendingModifiedValuesJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MultiAZ")) {
                replicationInstance.setMultiAZ(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EngineVersion")) {
                replicationInstance.setEngineVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AutoMinorVersionUpgrade")) {
                replicationInstance.setAutoMinorVersionUpgrade(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KmsKeyId")) {
                replicationInstance.setKmsKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationInstanceArn")) {
                replicationInstance.setReplicationInstanceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationInstancePublicIpAddress")) {
                replicationInstance.setReplicationInstancePublicIpAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationInstancePrivateIpAddress")) {
                replicationInstance.setReplicationInstancePrivateIpAddress(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReplicationInstancePublicIpAddresses")) {
                replicationInstance
                        .setReplicationInstancePublicIpAddresses(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ReplicationInstancePrivateIpAddresses")) {
                replicationInstance
                        .setReplicationInstancePrivateIpAddresses(new ListUnmarshaller<String>(
                                StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PubliclyAccessible")) {
                replicationInstance.setPubliclyAccessible(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecondaryAvailabilityZone")) {
                replicationInstance.setSecondaryAvailabilityZone(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FreeUntil")) {
                replicationInstance.setFreeUntil(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsNameServers")) {
                replicationInstance.setDnsNameServers(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return replicationInstance;
    }

    private static ReplicationInstanceJsonUnmarshaller instance;

    public static ReplicationInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationInstanceJsonUnmarshaller();
        return instance;
    }
}
