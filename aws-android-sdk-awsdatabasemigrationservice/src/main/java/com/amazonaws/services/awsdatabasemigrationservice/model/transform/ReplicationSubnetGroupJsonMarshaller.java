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

package com.amazonaws.services.awsdatabasemigrationservice.model.transform;

import com.amazonaws.services.awsdatabasemigrationservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReplicationSubnetGroup
 */
class ReplicationSubnetGroupJsonMarshaller {

    public void marshall(ReplicationSubnetGroup replicationSubnetGroup, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (replicationSubnetGroup.getReplicationSubnetGroupIdentifier() != null) {
            String replicationSubnetGroupIdentifier = replicationSubnetGroup
                    .getReplicationSubnetGroupIdentifier();
            jsonWriter.name("ReplicationSubnetGroupIdentifier");
            jsonWriter.value(replicationSubnetGroupIdentifier);
        }
        if (replicationSubnetGroup.getReplicationSubnetGroupDescription() != null) {
            String replicationSubnetGroupDescription = replicationSubnetGroup
                    .getReplicationSubnetGroupDescription();
            jsonWriter.name("ReplicationSubnetGroupDescription");
            jsonWriter.value(replicationSubnetGroupDescription);
        }
        if (replicationSubnetGroup.getVpcId() != null) {
            String vpcId = replicationSubnetGroup.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        if (replicationSubnetGroup.getSubnetGroupStatus() != null) {
            String subnetGroupStatus = replicationSubnetGroup.getSubnetGroupStatus();
            jsonWriter.name("SubnetGroupStatus");
            jsonWriter.value(subnetGroupStatus);
        }
        if (replicationSubnetGroup.getSubnets() != null) {
            java.util.List<Subnet> subnets = replicationSubnetGroup.getSubnets();
            jsonWriter.name("Subnets");
            jsonWriter.beginArray();
            for (Subnet subnetsItem : subnets) {
                if (subnetsItem != null) {
                    SubnetJsonMarshaller.getInstance().marshall(subnetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ReplicationSubnetGroupJsonMarshaller instance;

    public static ReplicationSubnetGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationSubnetGroupJsonMarshaller();
        return instance;
    }
}
