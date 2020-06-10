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
 * JSON marshaller for POJO LaunchTemplateEbsBlockDeviceRequest
 */
class LaunchTemplateEbsBlockDeviceRequestJsonMarshaller {

    public void marshall(LaunchTemplateEbsBlockDeviceRequest launchTemplateEbsBlockDeviceRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateEbsBlockDeviceRequest.getEncrypted() != null) {
            Boolean encrypted = launchTemplateEbsBlockDeviceRequest.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        if (launchTemplateEbsBlockDeviceRequest.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = launchTemplateEbsBlockDeviceRequest
                    .getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (launchTemplateEbsBlockDeviceRequest.getIops() != null) {
            Integer iops = launchTemplateEbsBlockDeviceRequest.getIops();
            jsonWriter.name("Iops");
            jsonWriter.value(iops);
        }
        if (launchTemplateEbsBlockDeviceRequest.getKmsKeyId() != null) {
            String kmsKeyId = launchTemplateEbsBlockDeviceRequest.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (launchTemplateEbsBlockDeviceRequest.getSnapshotId() != null) {
            String snapshotId = launchTemplateEbsBlockDeviceRequest.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (launchTemplateEbsBlockDeviceRequest.getVolumeSize() != null) {
            Integer volumeSize = launchTemplateEbsBlockDeviceRequest.getVolumeSize();
            jsonWriter.name("VolumeSize");
            jsonWriter.value(volumeSize);
        }
        if (launchTemplateEbsBlockDeviceRequest.getVolumeType() != null) {
            String volumeType = launchTemplateEbsBlockDeviceRequest.getVolumeType();
            jsonWriter.name("VolumeType");
            jsonWriter.value(volumeType);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateEbsBlockDeviceRequestJsonMarshaller instance;

    public static LaunchTemplateEbsBlockDeviceRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateEbsBlockDeviceRequestJsonMarshaller();
        return instance;
    }
}
