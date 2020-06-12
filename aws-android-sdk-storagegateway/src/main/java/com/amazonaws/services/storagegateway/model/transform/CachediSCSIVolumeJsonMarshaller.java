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
 * JSON marshaller for POJO CachediSCSIVolume
 */
class CachediSCSIVolumeJsonMarshaller {

    public void marshall(CachediSCSIVolume cachediSCSIVolume, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cachediSCSIVolume.getVolumeARN() != null) {
            String volumeARN = cachediSCSIVolume.getVolumeARN();
            jsonWriter.name("VolumeARN");
            jsonWriter.value(volumeARN);
        }
        if (cachediSCSIVolume.getVolumeId() != null) {
            String volumeId = cachediSCSIVolume.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        if (cachediSCSIVolume.getVolumeType() != null) {
            String volumeType = cachediSCSIVolume.getVolumeType();
            jsonWriter.name("VolumeType");
            jsonWriter.value(volumeType);
        }
        if (cachediSCSIVolume.getVolumeStatus() != null) {
            String volumeStatus = cachediSCSIVolume.getVolumeStatus();
            jsonWriter.name("VolumeStatus");
            jsonWriter.value(volumeStatus);
        }
        if (cachediSCSIVolume.getVolumeAttachmentStatus() != null) {
            String volumeAttachmentStatus = cachediSCSIVolume.getVolumeAttachmentStatus();
            jsonWriter.name("VolumeAttachmentStatus");
            jsonWriter.value(volumeAttachmentStatus);
        }
        if (cachediSCSIVolume.getVolumeSizeInBytes() != null) {
            Long volumeSizeInBytes = cachediSCSIVolume.getVolumeSizeInBytes();
            jsonWriter.name("VolumeSizeInBytes");
            jsonWriter.value(volumeSizeInBytes);
        }
        if (cachediSCSIVolume.getVolumeProgress() != null) {
            Double volumeProgress = cachediSCSIVolume.getVolumeProgress();
            jsonWriter.name("VolumeProgress");
            jsonWriter.value(volumeProgress);
        }
        if (cachediSCSIVolume.getSourceSnapshotId() != null) {
            String sourceSnapshotId = cachediSCSIVolume.getSourceSnapshotId();
            jsonWriter.name("SourceSnapshotId");
            jsonWriter.value(sourceSnapshotId);
        }
        if (cachediSCSIVolume.getVolumeiSCSIAttributes() != null) {
            VolumeiSCSIAttributes volumeiSCSIAttributes = cachediSCSIVolume
                    .getVolumeiSCSIAttributes();
            jsonWriter.name("VolumeiSCSIAttributes");
            VolumeiSCSIAttributesJsonMarshaller.getInstance().marshall(volumeiSCSIAttributes,
                    jsonWriter);
        }
        if (cachediSCSIVolume.getCreatedDate() != null) {
            java.util.Date createdDate = cachediSCSIVolume.getCreatedDate();
            jsonWriter.name("CreatedDate");
            jsonWriter.value(createdDate);
        }
        if (cachediSCSIVolume.getVolumeUsedInBytes() != null) {
            Long volumeUsedInBytes = cachediSCSIVolume.getVolumeUsedInBytes();
            jsonWriter.name("VolumeUsedInBytes");
            jsonWriter.value(volumeUsedInBytes);
        }
        if (cachediSCSIVolume.getKMSKey() != null) {
            String kMSKey = cachediSCSIVolume.getKMSKey();
            jsonWriter.name("KMSKey");
            jsonWriter.value(kMSKey);
        }
        if (cachediSCSIVolume.getTargetName() != null) {
            String targetName = cachediSCSIVolume.getTargetName();
            jsonWriter.name("TargetName");
            jsonWriter.value(targetName);
        }
        jsonWriter.endObject();
    }

    private static CachediSCSIVolumeJsonMarshaller instance;

    public static CachediSCSIVolumeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CachediSCSIVolumeJsonMarshaller();
        return instance;
    }
}
