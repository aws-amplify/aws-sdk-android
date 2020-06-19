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
 * JSON marshaller for POJO NetworkInterfaceAttachmentChanges
 */
class NetworkInterfaceAttachmentChangesJsonMarshaller {

    public void marshall(NetworkInterfaceAttachmentChanges networkInterfaceAttachmentChanges,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (networkInterfaceAttachmentChanges.getAttachmentId() != null) {
            String attachmentId = networkInterfaceAttachmentChanges.getAttachmentId();
            jsonWriter.name("AttachmentId");
            jsonWriter.value(attachmentId);
        }
        if (networkInterfaceAttachmentChanges.getDeleteOnTermination() != null) {
            Boolean deleteOnTermination = networkInterfaceAttachmentChanges
                    .getDeleteOnTermination();
            jsonWriter.name("DeleteOnTermination");
            jsonWriter.value(deleteOnTermination);
        }
        jsonWriter.endObject();
    }

    private static NetworkInterfaceAttachmentChangesJsonMarshaller instance;

    public static NetworkInterfaceAttachmentChangesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceAttachmentChangesJsonMarshaller();
        return instance;
    }
}
