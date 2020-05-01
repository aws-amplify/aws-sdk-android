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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MountTargetDescription
 */
class MountTargetDescriptionJsonMarshaller {

    public void marshall(MountTargetDescription mountTargetDescription, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mountTargetDescription.getOwnerId() != null) {
            String ownerId = mountTargetDescription.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (mountTargetDescription.getMountTargetId() != null) {
            String mountTargetId = mountTargetDescription.getMountTargetId();
            jsonWriter.name("MountTargetId");
            jsonWriter.value(mountTargetId);
        }
        if (mountTargetDescription.getFileSystemId() != null) {
            String fileSystemId = mountTargetDescription.getFileSystemId();
            jsonWriter.name("FileSystemId");
            jsonWriter.value(fileSystemId);
        }
        if (mountTargetDescription.getSubnetId() != null) {
            String subnetId = mountTargetDescription.getSubnetId();
            jsonWriter.name("SubnetId");
            jsonWriter.value(subnetId);
        }
        if (mountTargetDescription.getLifeCycleState() != null) {
            String lifeCycleState = mountTargetDescription.getLifeCycleState();
            jsonWriter.name("LifeCycleState");
            jsonWriter.value(lifeCycleState);
        }
        if (mountTargetDescription.getIpAddress() != null) {
            String ipAddress = mountTargetDescription.getIpAddress();
            jsonWriter.name("IpAddress");
            jsonWriter.value(ipAddress);
        }
        if (mountTargetDescription.getNetworkInterfaceId() != null) {
            String networkInterfaceId = mountTargetDescription.getNetworkInterfaceId();
            jsonWriter.name("NetworkInterfaceId");
            jsonWriter.value(networkInterfaceId);
        }
        if (mountTargetDescription.getAvailabilityZoneId() != null) {
            String availabilityZoneId = mountTargetDescription.getAvailabilityZoneId();
            jsonWriter.name("AvailabilityZoneId");
            jsonWriter.value(availabilityZoneId);
        }
        if (mountTargetDescription.getAvailabilityZoneName() != null) {
            String availabilityZoneName = mountTargetDescription.getAvailabilityZoneName();
            jsonWriter.name("AvailabilityZoneName");
            jsonWriter.value(availabilityZoneName);
        }
        jsonWriter.endObject();
    }

    private static MountTargetDescriptionJsonMarshaller instance;

    public static MountTargetDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MountTargetDescriptionJsonMarshaller();
        return instance;
    }
}
