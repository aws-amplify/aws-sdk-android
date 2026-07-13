/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RealTimeContactAnalysisAttachment
 */
class RealTimeContactAnalysisAttachmentJsonMarshaller {

    public void marshall(RealTimeContactAnalysisAttachment realTimeContactAnalysisAttachment,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (realTimeContactAnalysisAttachment.getAttachmentName() != null) {
            String attachmentName = realTimeContactAnalysisAttachment.getAttachmentName();
            jsonWriter.name("AttachmentName");
            jsonWriter.value(attachmentName);
        }
        if (realTimeContactAnalysisAttachment.getContentType() != null) {
            String contentType = realTimeContactAnalysisAttachment.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (realTimeContactAnalysisAttachment.getAttachmentId() != null) {
            String attachmentId = realTimeContactAnalysisAttachment.getAttachmentId();
            jsonWriter.name("AttachmentId");
            jsonWriter.value(attachmentId);
        }
        if (realTimeContactAnalysisAttachment.getStatus() != null) {
            String status = realTimeContactAnalysisAttachment.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static RealTimeContactAnalysisAttachmentJsonMarshaller instance;

    public static RealTimeContactAnalysisAttachmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealTimeContactAnalysisAttachmentJsonMarshaller();
        return instance;
    }
}
