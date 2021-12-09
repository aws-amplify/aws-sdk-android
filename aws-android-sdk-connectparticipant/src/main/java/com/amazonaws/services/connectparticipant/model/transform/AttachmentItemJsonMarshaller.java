/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttachmentItem
 */
class AttachmentItemJsonMarshaller {

    public void marshall(AttachmentItem attachmentItem, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attachmentItem.getContentType() != null) {
            String contentType = attachmentItem.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (attachmentItem.getAttachmentId() != null) {
            String attachmentId = attachmentItem.getAttachmentId();
            jsonWriter.name("AttachmentId");
            jsonWriter.value(attachmentId);
        }
        if (attachmentItem.getAttachmentName() != null) {
            String attachmentName = attachmentItem.getAttachmentName();
            jsonWriter.name("AttachmentName");
            jsonWriter.value(attachmentName);
        }
        if (attachmentItem.getStatus() != null) {
            String status = attachmentItem.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static AttachmentItemJsonMarshaller instance;

    public static AttachmentItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttachmentItemJsonMarshaller();
        return instance;
    }
}
