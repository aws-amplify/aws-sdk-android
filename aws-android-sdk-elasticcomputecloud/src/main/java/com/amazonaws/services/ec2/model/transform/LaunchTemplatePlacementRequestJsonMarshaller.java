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
 * JSON marshaller for POJO LaunchTemplatePlacementRequest
 */
class LaunchTemplatePlacementRequestJsonMarshaller {

    public void marshall(LaunchTemplatePlacementRequest launchTemplatePlacementRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplatePlacementRequest.getAvailabilityZone() != null) {
            String availabilityZone = launchTemplatePlacementRequest.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (launchTemplatePlacementRequest.getAffinity() != null) {
            String affinity = launchTemplatePlacementRequest.getAffinity();
            jsonWriter.name("Affinity");
            jsonWriter.value(affinity);
        }
        if (launchTemplatePlacementRequest.getGroupName() != null) {
            String groupName = launchTemplatePlacementRequest.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        if (launchTemplatePlacementRequest.getHostId() != null) {
            String hostId = launchTemplatePlacementRequest.getHostId();
            jsonWriter.name("HostId");
            jsonWriter.value(hostId);
        }
        if (launchTemplatePlacementRequest.getTenancy() != null) {
            String tenancy = launchTemplatePlacementRequest.getTenancy();
            jsonWriter.name("Tenancy");
            jsonWriter.value(tenancy);
        }
        if (launchTemplatePlacementRequest.getSpreadDomain() != null) {
            String spreadDomain = launchTemplatePlacementRequest.getSpreadDomain();
            jsonWriter.name("SpreadDomain");
            jsonWriter.value(spreadDomain);
        }
        if (launchTemplatePlacementRequest.getHostResourceGroupArn() != null) {
            String hostResourceGroupArn = launchTemplatePlacementRequest.getHostResourceGroupArn();
            jsonWriter.name("HostResourceGroupArn");
            jsonWriter.value(hostResourceGroupArn);
        }
        if (launchTemplatePlacementRequest.getPartitionNumber() != null) {
            Integer partitionNumber = launchTemplatePlacementRequest.getPartitionNumber();
            jsonWriter.name("PartitionNumber");
            jsonWriter.value(partitionNumber);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplatePlacementRequestJsonMarshaller instance;

    public static LaunchTemplatePlacementRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplatePlacementRequestJsonMarshaller();
        return instance;
    }
}
