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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsEc2NetworkInterfaceAttachment
 */
class AwsEc2NetworkInterfaceAttachmentJsonMarshaller {

    public void marshall(AwsEc2NetworkInterfaceAttachment awsEc2NetworkInterfaceAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsEc2NetworkInterfaceAttachment.getAttachTime() != null) {
            String attachTime = awsEc2NetworkInterfaceAttachment.getAttachTime();
            jsonWriter.name("AttachTime");
            jsonWriter.value(attachTime);
        }
        if (awsEc2NetworkInterfaceAttachment.getAttachmentId() != null) {
            String attachmentId = awsEc2NetworkInterfaceAttachment.getAttachmentId();
            jsonWriter.name("AttachmentId");
            jsonWriter.value(attachmentId);
        }
        if (awsEc2NetworkInterfaceAttachment.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = awsEc2NetworkInterfaceAttachment.getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        if (awsEc2NetworkInterfaceAttachment.getDeviceIndex() != null) {
            Integer deviceIndex = awsEc2NetworkInterfaceAttachment.getDeviceIndex();
            jsonWriter.name("DeviceIndex");
            jsonWriter.value(deviceIndex);
        }
        if (awsEc2NetworkInterfaceAttachment.getInstanceId() != null) {
            String instanceId = awsEc2NetworkInterfaceAttachment.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (awsEc2NetworkInterfaceAttachment.getInstanceOwnerId() != null) {
            String instanceOwnerId = awsEc2NetworkInterfaceAttachment.getInstanceOwnerId();
            jsonWriter.name("InstanceOwnerId");
            jsonWriter.value(instanceOwnerId);
        }
        if (awsEc2NetworkInterfaceAttachment.getStatus() != null) {
            String status = awsEc2NetworkInterfaceAttachment.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static AwsEc2NetworkInterfaceAttachmentJsonMarshaller instance;

    public static AwsEc2NetworkInterfaceAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2NetworkInterfaceAttachmentJsonMarshaller();
        return instance;
    }
}
