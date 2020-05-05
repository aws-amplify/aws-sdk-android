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
 * JSON marshaller for POJO Communication
 */
class CommunicationJsonMarshaller {

    public void marshall(Communication communication, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (communication.getCaseId() != null) {
            String caseId = communication.getCaseId();
            jsonWriter.name("caseId");
            jsonWriter.value(caseId);
        }
        if (communication.getBody() != null) {
            String body = communication.getBody();
            jsonWriter.name("body");
            jsonWriter.value(body);
        }
        if (communication.getSubmittedBy() != null) {
            String submittedBy = communication.getSubmittedBy();
            jsonWriter.name("submittedBy");
            jsonWriter.value(submittedBy);
        }
        if (communication.getTimeCreated() != null) {
            String timeCreated = communication.getTimeCreated();
            jsonWriter.name("timeCreated");
            jsonWriter.value(timeCreated);
        }
        if (communication.getAttachmentSet() != null) {
            java.util.List<AttachmentDetails> attachmentSet = communication.getAttachmentSet();
            jsonWriter.name("attachmentSet");
            jsonWriter.beginArray();
            for (AttachmentDetails attachmentSetItem : attachmentSet) {
                if (attachmentSetItem != null) {
                    AttachmentDetailsJsonMarshaller.getInstance().marshall(attachmentSetItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CommunicationJsonMarshaller instance;

    public static CommunicationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CommunicationJsonMarshaller();
        return instance;
    }
}
