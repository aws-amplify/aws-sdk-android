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
 * JSON marshaller for POJO InstanceNetworkInterfaceAttachment
 */
class InstanceNetworkInterfaceAttachmentJsonMarshaller {

    public void marshall(InstanceNetworkInterfaceAttachment instanceNetworkInterfaceAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceNetworkInterfaceAttachment.getAttachTime() != null) {
            java.util.Date attachTime = instanceNetworkInterfaceAttachment.getAttachTime();
            jsonWriter.name("AttachTime");
            jsonWriter.value(attachTime);
        }
        if (instanceNetworkInterfaceAttachment.getAttachmentId() != null) {
            String attachmentId = instanceNetworkInterfaceAttachment.getAttachmentId();
            jsonWriter.name("AttachmentId");
            jsonWriter.value(attachmentId);
        }
        if (instanceNetworkInterfaceAttachment.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = instanceNetworkInterfaceAttachment
                    .getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (instanceNetworkInterfaceAttachment.getDeviceIndex() != null) {
            Integer deviceIndex = instanceNetworkInterfaceAttachment.getDeviceIndex();
            jsonWriter.name("DeviceIndex");
            jsonWriter.value(deviceIndex);
        }
        if (instanceNetworkInterfaceAttachment.getStatus() != null) {
            String status = instanceNetworkInterfaceAttachment.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static InstanceNetworkInterfaceAttachmentJsonMarshaller instance;

    public static InstanceNetworkInterfaceAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceNetworkInterfaceAttachmentJsonMarshaller();
        return instance;
    }
}
