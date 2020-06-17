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
 * JSON marshaller for POJO EbsBlockDevice
 */
class EbsBlockDeviceJsonMarshaller {

    public void marshall(EbsBlockDevice ebsBlockDevice, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ebsBlockDevice.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = ebsBlockDevice.getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (ebsBlockDevice.getIops() != null) {
            Integer iops = ebsBlockDevice.getIops();
            jsonWriter.name("Iops");
            jsonWriter.value(iops);
        }
        if (ebsBlockDevice.getSnapshotId() != null) {
            String snapshotId = ebsBlockDevice.getSnapshotId();
            jsonWriter.name("SnapshotId");
            jsonWriter.value(snapshotId);
        }
        if (ebsBlockDevice.getVolumeSize() != null) {
            Integer volumeSize = ebsBlockDevice.getVolumeSize();
            jsonWriter.name("VolumeSize");
            jsonWriter.value(volumeSize);
        }
        if (ebsBlockDevice.getVolumeType() != null) {
            String volumeType = ebsBlockDevice.getVolumeType();
            jsonWriter.name("VolumeType");
            jsonWriter.value(volumeType);
        }
        if (ebsBlockDevice.getKmsKeyId() != null) {
            String kmsKeyId = ebsBlockDevice.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (ebsBlockDevice.getEncrypted() != null) {
            Boolean encrypted = ebsBlockDevice.getEncrypted();
            jsonWriter.name("Encrypted");
            jsonWriter.value(encrypted);
        }
        jsonWriter.endObject();
    }

    private static EbsBlockDeviceJsonMarshaller instance;

    public static EbsBlockDeviceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EbsBlockDeviceJsonMarshaller();
        return instance;
    }
}
