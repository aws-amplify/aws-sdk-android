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
 * JSON marshaller for POJO Host
 */
class HostJsonMarshaller {

    public void marshall(Host host, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (host.getAutoPlacement() != null) {
            String autoPlacement = host.getAutoPlacement();
            jsonWriter.name("AutoPlacement");
            jsonWriter.value(autoPlacement);
        }
        if (host.getAvailabilityZone() != null) {
            String availabilityZone = host.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (host.getAvailableCapacity() != null) {
            AvailableCapacity availableCapacity = host.getAvailableCapacity();
            jsonWriter.name("AvailableCapacity");
            AvailableCapacityJsonMarshaller.getInstance().marshall(availableCapacity, jsonWriter);
        }
        if (host.getClientToken() != null) {
            String clientToken = host.getClientToken();
            jsonWriter.name("ClientToken");
            jsonWriter.value(clientToken);
        }
        if (host.getHostId() != null) {
            String hostId = host.getHostId();
            jsonWriter.name("HostId");
            jsonWriter.value(hostId);
        }
        if (host.getHostProperties() != null) {
            HostProperties hostProperties = host.getHostProperties();
            jsonWriter.name("HostProperties");
            HostPropertiesJsonMarshaller.getInstance().marshall(hostProperties, jsonWriter);
        }
        if (host.getHostReservationId() != null) {
            String hostReservationId = host.getHostReservationId();
            jsonWriter.name("HostReservationId");
            jsonWriter.value(hostReservationId);
        }
        if (host.getInstances() != null) {
            java.util.List<HostInstance> instances = host.getInstances();
            jsonWriter.name("Instances");
            jsonWriter.beginArray();
            for (HostInstance instancesItem : instances) {
                if (instancesItem != null) {
                    HostInstanceJsonMarshaller.getInstance().marshall(instancesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (host.getState() != null) {
            String state = host.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (host.getAllocationTime() != null) {
            java.util.Date allocationTime = host.getAllocationTime();
            jsonWriter.name("AllocationTime");
            jsonWriter.value(allocationTime);
        }
        if (host.getReleaseTime() != null) {
            java.util.Date releaseTime = host.getReleaseTime();
            jsonWriter.name("ReleaseTime");
            jsonWriter.value(releaseTime);
        }
        if (host.getTags() != null) {
            java.util.List<Tag> tags = host.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (host.getHostRecovery() != null) {
            String hostRecovery = host.getHostRecovery();
            jsonWriter.name("HostRecovery");
            jsonWriter.value(hostRecovery);
        }
        if (host.getAllowsMultipleInstanceTypes() != null) {
            String allowsMultipleInstanceTypes = host.getAllowsMultipleInstanceTypes();
            jsonWriter.name("AllowsMultipleInstanceTypes");
            jsonWriter.value(allowsMultipleInstanceTypes);
        }
        if (host.getOwnerId() != null) {
            String ownerId = host.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (host.getAvailabilityZoneId() != null) {
            String availabilityZoneId = host.getAvailabilityZoneId();
            jsonWriter.name("AvailabilityZoneId");
            jsonWriter.value(availabilityZoneId);
        }
        if (host.getMemberOfServiceLinkedResourceGroup() != null) {
            Boolean memberOfServiceLinkedResourceGroup = host
                    .getMemberOfServiceLinkedResourceGroup();
            jsonWriter.name("MemberOfServiceLinkedResourceGroup");
            jsonWriter.value(memberOfServiceLinkedResourceGroup);
        }
        jsonWriter.endObject();
    }

    private static HostJsonMarshaller instance;

    public static HostJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HostJsonMarshaller();
        return instance;
    }
}
