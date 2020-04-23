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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VolumeRecoveryPointInfo
 */
class VolumeRecoveryPointInfoJsonMarshaller {

    public void marshall(VolumeRecoveryPointInfo volumeRecoveryPointInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (volumeRecoveryPointInfo.getVolumeARN() != null) {
            String volumeARN = volumeRecoveryPointInfo.getVolumeARN();
            jsonWriter.name("VolumeARN");
            jsonWriter.value(volumeARN);
        }
        if (volumeRecoveryPointInfo.getVolumeSizeInBytes() != null) {
            Long volumeSizeInBytes = volumeRecoveryPointInfo.getVolumeSizeInBytes();
            jsonWriter.name("VolumeSizeInBytes");
            jsonWriter.value(volumeSizeInBytes);
        }
        if (volumeRecoveryPointInfo.getVolumeUsageInBytes() != null) {
            Long volumeUsageInBytes = volumeRecoveryPointInfo.getVolumeUsageInBytes();
            jsonWriter.name("VolumeUsageInBytes");
            jsonWriter.value(volumeUsageInBytes);
        }
        if (volumeRecoveryPointInfo.getVolumeRecoveryPointTime() != null) {
            String volumeRecoveryPointTime = volumeRecoveryPointInfo.getVolumeRecoveryPointTime();
            jsonWriter.name("VolumeRecoveryPointTime");
            jsonWriter.value(volumeRecoveryPointTime);
        }
        jsonWriter.endObject();
    }

    private static VolumeRecoveryPointInfoJsonMarshaller instance;

    public static VolumeRecoveryPointInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeRecoveryPointInfoJsonMarshaller();
        return instance;
    }
}
