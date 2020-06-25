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
 * JSON marshaller for POJO EbsInstanceBlockDevice
 */
class EbsInstanceBlockDeviceJsonMarshaller {

    public void marshall(EbsInstanceBlockDevice ebsInstanceBlockDevice, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ebsInstanceBlockDevice.getAttachTime() != null) {
            java.util.Date attachTime = ebsInstanceBlockDevice.getAttachTime();
            jsonWriter.name("AttachTime");
            jsonWriter.value(attachTime);
        }
        if (ebsInstanceBlockDevice.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = ebsInstanceBlockDevice.getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (ebsInstanceBlockDevice.getStatus() != null) {
            String status = ebsInstanceBlockDevice.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (ebsInstanceBlockDevice.getVolumeId() != null) {
            String volumeId = ebsInstanceBlockDevice.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        jsonWriter.endObject();
    }

    private static EbsInstanceBlockDeviceJsonMarshaller instance;

    public static EbsInstanceBlockDeviceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EbsInstanceBlockDeviceJsonMarshaller();
        return instance;
    }
}
