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
 * JSON marshaller for POJO NetworkInterfaceAttachment
 */
class NetworkInterfaceAttachmentJsonMarshaller {

    public void marshall(NetworkInterfaceAttachment networkInterfaceAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkInterfaceAttachment.getAttachTime() != null) {
            java.util.Date attachTime = networkInterfaceAttachment.getAttachTime();
            jsonWriter.name("AttachTime");
            jsonWriter.value(attachTime);
        }
        if (networkInterfaceAttachment.getAttachmentId() != null) {
            String attachmentId = networkInterfaceAttachment.getAttachmentId();
            jsonWriter.name("AttachmentId");
            jsonWriter.value(attachmentId);
        }
        if (networkInterfaceAttachment.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = networkInterfaceAttachment.getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (networkInterfaceAttachment.getDeviceIndex() != null) {
            Integer deviceIndex = networkInterfaceAttachment.getDeviceIndex();
            jsonWriter.name("DeviceIndex");
            jsonWriter.value(deviceIndex);
        }
        if (networkInterfaceAttachment.getInstanceId() != null) {
            String instanceId = networkInterfaceAttachment.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (networkInterfaceAttachment.getInstanceOwnerId() != null) {
            String instanceOwnerId = networkInterfaceAttachment.getInstanceOwnerId();
            jsonWriter.name("InstanceOwnerId");
            jsonWriter.value(instanceOwnerId);
        }
        if (networkInterfaceAttachment.getStatus() != null) {
            String status = networkInterfaceAttachment.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static NetworkInterfaceAttachmentJsonMarshaller instance;

    public static NetworkInterfaceAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceAttachmentJsonMarshaller();
        return instance;
    }
}
