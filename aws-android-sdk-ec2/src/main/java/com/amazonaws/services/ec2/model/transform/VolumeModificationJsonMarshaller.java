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
 * JSON marshaller for POJO VolumeModification
 */
class VolumeModificationJsonMarshaller {

    public void marshall(VolumeModification volumeModification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (volumeModification.getVolumeId() != null) {
            String volumeId = volumeModification.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        if (volumeModification.getModificationState() != null) {
            String modificationState = volumeModification.getModificationState();
            jsonWriter.name("ModificationState");
            jsonWriter.value(modificationState);
        }
        if (volumeModification.getStatusMessage() != null) {
            String statusMessage = volumeModification.getStatusMessage();
            jsonWriter.name("StatusMessage");
            jsonWriter.value(statusMessage);
        }
        if (volumeModification.getTargetSize() != null) {
            Integer targetSize = volumeModification.getTargetSize();
            jsonWriter.name("TargetSize");
            jsonWriter.value(targetSize);
        }
        if (volumeModification.getTargetIops() != null) {
            Integer targetIops = volumeModification.getTargetIops();
            jsonWriter.name("TargetIops");
            jsonWriter.value(targetIops);
        }
        if (volumeModification.getTargetVolumeType() != null) {
            String targetVolumeType = volumeModification.getTargetVolumeType();
            jsonWriter.name("TargetVolumeType");
            jsonWriter.value(targetVolumeType);
        }
        if (volumeModification.getOriginalSize() != null) {
            Integer originalSize = volumeModification.getOriginalSize();
            jsonWriter.name("OriginalSize");
            jsonWriter.value(originalSize);
        }
        if (volumeModification.getOriginalIops() != null) {
            Integer originalIops = volumeModification.getOriginalIops();
            jsonWriter.name("OriginalIops");
            jsonWriter.value(originalIops);
        }
        if (volumeModification.getOriginalVolumeType() != null) {
            String originalVolumeType = volumeModification.getOriginalVolumeType();
            jsonWriter.name("OriginalVolumeType");
            jsonWriter.value(originalVolumeType);
        }
        if (volumeModification.getProgress() != null) {
            Long progress = volumeModification.getProgress();
            jsonWriter.name("Progress");
            jsonWriter.value(progress);
        }
        if (volumeModification.getStartTime() != null) {
            java.util.Date startTime = volumeModification.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (volumeModification.getEndTime() != null) {
            java.util.Date endTime = volumeModification.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        jsonWriter.endObject();
    }

    private static VolumeModificationJsonMarshaller instance;

    public static VolumeModificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeModificationJsonMarshaller();
        return instance;
    }
}
