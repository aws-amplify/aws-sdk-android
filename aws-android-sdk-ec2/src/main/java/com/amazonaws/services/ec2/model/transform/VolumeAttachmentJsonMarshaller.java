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
 * JSON marshaller for POJO VolumeAttachment
 */
class VolumeAttachmentJsonMarshaller {

    public void marshall(VolumeAttachment volumeAttachment, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (volumeAttachment.getAttachTime() != null) {
            java.util.Date attachTime = volumeAttachment.getAttachTime();
            jsonWriter.name("AttachTime");
            jsonWriter.value(attachTime);
        }
        if (volumeAttachment.getDevice() != null) {
            String device = volumeAttachment.getDevice();
            jsonWriter.name("Device");
            jsonWriter.value(device);
        }
        if (volumeAttachment.getInstanceId() != null) {
            String instanceId = volumeAttachment.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (volumeAttachment.getState() != null) {
            String state = volumeAttachment.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (volumeAttachment.getVolumeId() != null) {
            String volumeId = volumeAttachment.getVolumeId();
            jsonWriter.name("VolumeId");
            jsonWriter.value(volumeId);
        }
        if (volumeAttachment.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = volumeAttachment.getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        jsonWriter.endObject();
    }

    private static VolumeAttachmentJsonMarshaller instance;

    public static VolumeAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeAttachmentJsonMarshaller();
        return instance;
    }
}
