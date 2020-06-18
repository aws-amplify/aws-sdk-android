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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttachmentDetails
 */
class AttachmentDetailsJsonMarshaller {

    public void marshall(AttachmentDetails attachmentDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attachmentDetails.getAttachmentId() != null) {
            String attachmentId = attachmentDetails.getAttachmentId();
            jsonWriter.name("attachmentId");
            jsonWriter.value(attachmentId);
        }
        if (attachmentDetails.getFileName() != null) {
            String fileName = attachmentDetails.getFileName();
            jsonWriter.name("fileName");
            jsonWriter.value(fileName);
        }
        jsonWriter.endObject();
    }

    private static AttachmentDetailsJsonMarshaller instance;

    public static AttachmentDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttachmentDetailsJsonMarshaller();
        return instance;
    }
}
