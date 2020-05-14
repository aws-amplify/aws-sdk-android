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
 * JSON marshaller for POJO LaunchTemplatePlacement
 */
class LaunchTemplatePlacementJsonMarshaller {

    public void marshall(LaunchTemplatePlacement launchTemplatePlacement, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (launchTemplatePlacement.getAvailabilityZone() != null) {
            String availabilityZone = launchTemplatePlacement.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (launchTemplatePlacement.getAffinity() != null) {
            String affinity = launchTemplatePlacement.getAffinity();
            jsonWriter.name("Affinity");
            jsonWriter.value(affinity);
        }
        if (launchTemplatePlacement.getGroupName() != null) {
            String groupName = launchTemplatePlacement.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (launchTemplatePlacement.getHostId() != null) {
            String hostId = launchTemplatePlacement.getHostId();
            jsonWriter.name("HostId");
            jsonWriter.value(hostId);
        }
        if (launchTemplatePlacement.getTenancy() != null) {
            String tenancy = launchTemplatePlacement.getTenancy();
            jsonWriter.name("Tenancy");
            jsonWriter.value(tenancy);
        }
        if (launchTemplatePlacement.getSpreadDomain() != null) {
            String spreadDomain = launchTemplatePlacement.getSpreadDomain();
            jsonWriter.name("SpreadDomain");
            jsonWriter.value(spreadDomain);
        }
        if (launchTemplatePlacement.getHostResourceGroupArn() != null) {
            String hostResourceGroupArn = launchTemplatePlacement.getHostResourceGroupArn();
            jsonWriter.name("HostResourceGroupArn");
            jsonWriter.value(hostResourceGroupArn);
        }
        if (launchTemplatePlacement.getPartitionNumber() != null) {
            Integer partitionNumber = launchTemplatePlacement.getPartitionNumber();
            jsonWriter.name("PartitionNumber");
            jsonWriter.value(partitionNumber);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplatePlacementJsonMarshaller instance;

    public static LaunchTemplatePlacementJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplatePlacementJsonMarshaller();
        return instance;
    }
}
