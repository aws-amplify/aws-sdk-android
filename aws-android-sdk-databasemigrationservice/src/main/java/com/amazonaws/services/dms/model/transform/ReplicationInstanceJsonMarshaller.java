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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReplicationInstance
 */
class ReplicationInstanceJsonMarshaller {

    public void marshall(ReplicationInstance replicationInstance, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicationInstance.getReplicationInstanceIdentifier() != null) {
            String replicationInstanceIdentifier = replicationInstance
                    .getReplicationInstanceIdentifier();
            jsonWriter.name("ReplicationInstanceIdentifier");
            jsonWriter.value(replicationInstanceIdentifier);
        }
        if (replicationInstance.getReplicationInstanceClass() != null) {
            String replicationInstanceClass = replicationInstance.getReplicationInstanceClass();
            jsonWriter.name("ReplicationInstanceClass");
            jsonWriter.value(replicationInstanceClass);
        }
        if (replicationInstance.getReplicationInstanceStatus() != null) {
            String replicationInstanceStatus = replicationInstance.getReplicationInstanceStatus();
            jsonWriter.name("ReplicationInstanceStatus");
            jsonWriter.value(replicationInstanceStatus);
        }
        if (replicationInstance.getAllocatedStorage() != null) {
            Integer allocatedStorage = replicationInstance.getAllocatedStorage();
            jsonWriter.name("AllocatedStorage");
            jsonWriter.value(allocatedStorage);
        }
        if (replicationInstance.getInstanceCreateTime() != null) {
            java.util.Date instanceCreateTime = replicationInstance.getInstanceCreateTime();
            jsonWriter.name("InstanceCreateTime");
            jsonWriter.value(instanceCreateTime);
        }
        if (replicationInstance.getVpcSecurityGroups() != null) {
            java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups = replicationInstance
                    .getVpcSecurityGroups();
            jsonWriter.name("VpcSecurityGroups");
            jsonWriter.beginArray();
            for (VpcSecurityGroupMembership vpcSecurityGroupsItem : vpcSecurityGroups) {
                if (vpcSecurityGroupsItem != null) {
                    VpcSecurityGroupMembershipJsonMarshaller.getInstance().marshall(
                            vpcSecurityGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (replicationInstance.getAvailabilityZone() != null) {
            String availabilityZone = replicationInstance.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (replicationInstance.getReplicationSubnetGroup() != null) {
            ReplicationSubnetGroup replicationSubnetGroup = replicationInstance
                    .getReplicationSubnetGroup();
            jsonWriter.name("ReplicationSubnetGroup");
            ReplicationSubnetGroupJsonMarshaller.getInstance().marshall(replicationSubnetGroup,
                    jsonWriter);
        }
        if (replicationInstance.getPreferredMaintenanceWindow() != null) {
            String preferredMaintenanceWindow = replicationInstance.getPreferredMaintenanceWindow();
            jsonWriter.name("PreferredMaintenanceWindow");
            jsonWriter.value(preferredMaintenanceWindow);
        }
        if (replicationInstance.getPendingModifiedValues() != null) {
            ReplicationPendingModifiedValues pendingModifiedValues = replicationInstance
                    .getPendingModifiedValues();
            jsonWriter.name("PendingModifiedValues");
            ReplicationPendingModifiedValuesJsonMarshaller.getInstance().marshall(
                    pendingModifiedValues, jsonWriter);
        }
        if (replicationInstance.getMultiAZ() != null) {
            Boolean multiAZ = replicationInstance.getMultiAZ();
            jsonWriter.name("MultiAZ");
            jsonWriter.value(multiAZ);
        }
        if (replicationInstance.getEngineVersion() != null) {
            String engineVersion = replicationInstance.getEngineVersion();
            jsonWriter.name("EngineVersion");
            jsonWriter.value(engineVersion);
        }
        if (replicationInstance.getAutoMinorVersionUpgrade() != null) {
            Boolean autoMinorVersionUpgrade = replicationInstance.getAutoMinorVersionUpgrade();
            jsonWriter.name("AutoMinorVersionUpgrade");
            jsonWriter.value(autoMinorVersionUpgrade);
        }
        if (replicationInstance.getKmsKeyId() != null) {
            String kmsKeyId = replicationInstance.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (replicationInstance.getReplicationInstanceArn() != null) {
            String replicationInstanceArn = replicationInstance.getReplicationInstanceArn();
            jsonWriter.name("ReplicationInstanceArn");
            jsonWriter.value(replicationInstanceArn);
        }
        if (replicationInstance.getReplicationInstancePublicIpAddress() != null) {
            String replicationInstancePublicIpAddress = replicationInstance
                    .getReplicationInstancePublicIpAddress();
            jsonWriter.name("ReplicationInstancePublicIpAddress");
            jsonWriter.value(replicationInstancePublicIpAddress);
        }
        if (replicationInstance.getReplicationInstancePrivateIpAddress() != null) {
            String replicationInstancePrivateIpAddress = replicationInstance
                    .getReplicationInstancePrivateIpAddress();
            jsonWriter.name("ReplicationInstancePrivateIpAddress");
            jsonWriter.value(replicationInstancePrivateIpAddress);
        }
        if (replicationInstance.getReplicationInstancePublicIpAddresses() != null) {
            java.util.List<String> replicationInstancePublicIpAddresses = replicationInstance
                    .getReplicationInstancePublicIpAddresses();
            jsonWriter.name("ReplicationInstancePublicIpAddresses");
            jsonWriter.beginArray();
            for (String replicationInstancePublicIpAddressesItem : replicationInstancePublicIpAddresses) {
                if (replicationInstancePublicIpAddressesItem != null) {
                    jsonWriter.value(replicationInstancePublicIpAddressesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (replicationInstance.getReplicationInstancePrivateIpAddresses() != null) {
            java.util.List<String> replicationInstancePrivateIpAddresses = replicationInstance
                    .getReplicationInstancePrivateIpAddresses();
            jsonWriter.name("ReplicationInstancePrivateIpAddresses");
            jsonWriter.beginArray();
            for (String replicationInstancePrivateIpAddressesItem : replicationInstancePrivateIpAddresses) {
                if (replicationInstancePrivateIpAddressesItem != null) {
                    jsonWriter.value(replicationInstancePrivateIpAddressesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (replicationInstance.getPubliclyAccessible() != null) {
            Boolean publiclyAccessible = replicationInstance.getPubliclyAccessible();
            jsonWriter.name("PubliclyAccessible");
            jsonWriter.value(publiclyAccessible);
        }
        if (replicationInstance.getSecondaryAvailabilityZone() != null) {
            String secondaryAvailabilityZone = replicationInstance.getSecondaryAvailabilityZone();
            jsonWriter.name("SecondaryAvailabilityZone");
            jsonWriter.value(secondaryAvailabilityZone);
        }
        if (replicationInstance.getFreeUntil() != null) {
            java.util.Date freeUntil = replicationInstance.getFreeUntil();
            jsonWriter.name("FreeUntil");
            jsonWriter.value(freeUntil);
        }
        if (replicationInstance.getDnsNameServers() != null) {
            String dnsNameServers = replicationInstance.getDnsNameServers();
            jsonWriter.name("DnsNameServers");
            jsonWriter.value(dnsNameServers);
        }
        jsonWriter.endObject();
    }

    private static ReplicationInstanceJsonMarshaller instance;

    public static ReplicationInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationInstanceJsonMarshaller();
        return instance;
    }
}
