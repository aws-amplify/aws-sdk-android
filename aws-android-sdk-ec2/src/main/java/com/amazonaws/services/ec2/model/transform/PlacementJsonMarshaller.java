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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Placement
 */
class PlacementJsonMarshaller {

    public void marshall(Placement placement, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (placement.getAvailabilityZone() != null) {
            String availabilityZone = placement.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (placement.getAffinity() != null) {
            String affinity = placement.getAffinity();
            jsonWriter.name("Affinity");
            jsonWriter.value(affinity);
        }
        if (placement.getGroupName() != null) {
            String groupName = placement.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (placement.getPartitionNumber() != null) {
            Integer partitionNumber = placement.getPartitionNumber();
            jsonWriter.name("PartitionNumber");
            jsonWriter.value(partitionNumber);
        }
        if (placement.getHostId() != null) {
            String hostId = placement.getHostId();
            jsonWriter.name("HostId");
            jsonWriter.value(hostId);
        }
        if (placement.getTenancy() != null) {
            String tenancy = placement.getTenancy();
            jsonWriter.name("Tenancy");
            jsonWriter.value(tenancy);
        }
        if (placement.getSpreadDomain() != null) {
            String spreadDomain = placement.getSpreadDomain();
            jsonWriter.name("SpreadDomain");
            jsonWriter.value(spreadDomain);
        }
        if (placement.getHostResourceGroupArn() != null) {
            String hostResourceGroupArn = placement.getHostResourceGroupArn();
            jsonWriter.name("HostResourceGroupArn");
            jsonWriter.value(hostResourceGroupArn);
        }
        jsonWriter.endObject();
    }

    private static PlacementJsonMarshaller instance;

    public static PlacementJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PlacementJsonMarshaller();
        return instance;
    }
}
