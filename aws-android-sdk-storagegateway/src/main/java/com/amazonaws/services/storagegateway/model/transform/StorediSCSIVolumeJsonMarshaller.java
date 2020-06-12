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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StorediSCSIVolume
 */
class StorediSCSIVolumeJsonMarshaller {

    public void marshall(StorediSCSIVolume storediSCSIVolume, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (storediSCSIVolume.getVolumeARN() != null) {
            String volumeARN = storediSCSIVolume.getVolumeARN();
            jsonWriter.name("VolumeARN");
            jsonWriter.value(volumeARN);
        }
        if (storediSCSIVolume.getVolumeId() != null) {
            String volumeId = storediSCSIVolume.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        if (storediSCSIVolume.getVolumeType() != null) {
            String volumeType = storediSCSIVolume.getVolumeType();
            jsonWriter.name("VolumeType");
            jsonWriter.value(volumeType);
        }
        if (storediSCSIVolume.getVolumeStatus() != null) {
            String volumeStatus = storediSCSIVolume.getVolumeStatus();
            jsonWriter.name("VolumeStatus");
            jsonWriter.value(volumeStatus);
        }
        if (storediSCSIVolume.getVolumeAttachmentStatus() != null) {
            String volumeAttachmentStatus = storediSCSIVolume.getVolumeAttachmentStatus();
            jsonWriter.name("VolumeAttachmentStatus");
            jsonWriter.value(volumeAttachmentStatus);
        }
        if (storediSCSIVolume.getVolumeSizeInBytes() != null) {
            Long volumeSizeInBytes = storediSCSIVolume.getVolumeSizeInBytes();
            jsonWriter.name("VolumeSizeInBytes");
            jsonWriter.value(volumeSizeInBytes);
        }
        if (storediSCSIVolume.getVolumeProgress() != null) {
            Double volumeProgress = storediSCSIVolume.getVolumeProgress();
            jsonWriter.name("VolumeProgress");
            jsonWriter.value(volumeProgress);
        }
        if (storediSCSIVolume.getVolumeDiskId() != null) {
            String volumeDiskId = storediSCSIVolume.getVolumeDiskId();
            jsonWriter.name("VolumeDiskId");
            jsonWriter.value(volumeDiskId);
        }
        if (storediSCSIVolume.getSourceSnapshotId() != null) {
            String sourceSnapshotId = storediSCSIVolume.getSourceSnapshotId();
            jsonWriter.name("SourceSnapshotId");
            jsonWriter.value(sourceSnapshotId);
        }
        if (storediSCSIVolume.getPreservedExistingData() != null) {
            Boolean preservedExistingData = storediSCSIVolume.getPreservedExistingData();
            jsonWriter.name("PreservedExistingData");
            jsonWriter.value(preservedExistingData);
        }
        if (storediSCSIVolume.getVolumeiSCSIAttributes() != null) {
            VolumeiSCSIAttributes volumeiSCSIAttributes = storediSCSIVolume
                    .getVolumeiSCSIAttributes();
            jsonWriter.name("VolumeiSCSIAttributes");
            VolumeiSCSIAttributesJsonMarshaller.getInstance().marshall(volumeiSCSIAttributes,
                    jsonWriter);
        }
        if (storediSCSIVolume.getCreatedDate() != null) {
            java.util.Date createdDate = storediSCSIVolume.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (storediSCSIVolume.getVolumeUsedInBytes() != null) {
            Long volumeUsedInBytes = storediSCSIVolume.getVolumeUsedInBytes();
            jsonWriter.name("VolumeUsedInBytes");
            jsonWriter.value(volumeUsedInBytes);
        }
        if (storediSCSIVolume.getKMSKey() != null) {
            String kMSKey = storediSCSIVolume.getKMSKey();
            jsonWriter.name("KMSKey");
            jsonWriter.value(kMSKey);
        }
        if (storediSCSIVolume.getTargetName() != null) {
            String targetName = storediSCSIVolume.getTargetName();
            jsonWriter.name("TargetName");
            jsonWriter.value(targetName);
        }
        jsonWriter.endObject();
    }

    private static StorediSCSIVolumeJsonMarshaller instance;

    public static StorediSCSIVolumeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StorediSCSIVolumeJsonMarshaller();
        return instance;
    }
}
