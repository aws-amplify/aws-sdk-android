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

package com.amazonaws.services.ec2imagebuilder.model.transform;

import com.amazonaws.services.ec2imagebuilder.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EbsInstanceBlockDeviceSpecification
 */
class EbsInstanceBlockDeviceSpecificationJsonMarshaller {

    public void marshall(EbsInstanceBlockDeviceSpecification ebsInstanceBlockDeviceSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ebsInstanceBlockDeviceSpecification.getEncrypted() != null) {
            Boolean encrypted = ebsInstanceBlockDeviceSpecification.getEncrypted();
            jsonWriter.name("encrypted");
            jsonWriter.value(encrypted);
        }
        if (ebsInstanceBlockDeviceSpecification.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = ebsInstanceBlockDeviceSpecification
                    .getDeleteOnTermination();
            jsonWriter.name("deleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (ebsInstanceBlockDeviceSpecification.getIops() != null) {
            Integer iops = ebsInstanceBlockDeviceSpecification.getIops();
            jsonWriter.name("iops");
            jsonWriter.value(iops);
        }
        if (ebsInstanceBlockDeviceSpecification.getKmsKeyId() != null) {
            String kmsKeyId = ebsInstanceBlockDeviceSpecification.getKmsKeyId();
            jsonWriter.name("kmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (ebsInstanceBlockDeviceSpecification.getSnapshotId() != null) {
            String snapshotId = ebsInstanceBlockDeviceSpecification.getSnapshotId();
            jsonWriter.name("snapshotId");
            jsonWriter.value(snapshotId);
        }
        if (ebsInstanceBlockDeviceSpecification.getVolumeSize() != null) {
            Integer volumeSize = ebsInstanceBlockDeviceSpecification.getVolumeSize();
            jsonWriter.name("volumeSize");
            jsonWriter.value(volumeSize);
        }
        if (ebsInstanceBlockDeviceSpecification.getVolumeType() != null) {
            String volumeType = ebsInstanceBlockDeviceSpecification.getVolumeType();
            jsonWriter.name("volumeType");
            jsonWriter.value(volumeType);
        }
        jsonWriter.endObject();
    }

    private static EbsInstanceBlockDeviceSpecificationJsonMarshaller instance;

    public static EbsInstanceBlockDeviceSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EbsInstanceBlockDeviceSpecificationJsonMarshaller();
        return instance;
    }
}
