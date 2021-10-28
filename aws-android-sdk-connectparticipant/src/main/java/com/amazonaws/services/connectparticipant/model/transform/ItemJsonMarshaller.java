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
 * JSON marshaller for POJO Item
 */
class ItemJsonMarshaller {

    public void marshall(Item item, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (item.getAbsoluteTime() != null) {
            String absoluteTime = item.getAbsoluteTime();
            jsonWriter.name("AbsoluteTime");
            jsonWriter.value(absoluteTime);
        }
        if (item.getContent() != null) {
            String content = item.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (item.getContentType() != null) {
            String contentType = item.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        if (item.getId() != null) {
            String id = item.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (item.getType() != null) {
            String type = item.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (item.getParticipantId() != null) {
            String participantId = item.getParticipantId();
            jsonWriter.name("ParticipantId");
            jsonWriter.value(participantId);
        }
        if (item.getDisplayName() != null) {
            String displayName = item.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (item.getParticipantRole() != null) {
            String participantRole = item.getParticipantRole();
            jsonWriter.name("ParticipantRole");
            jsonWriter.value(participantRole);
        }
        if (item.getAttachments() != null) {
            java.util.List<AttachmentItem> attachments = item.getAttachments();
            jsonWriter.name("Attachments");
            jsonWriter.beginArray();
            for (AttachmentItem attachmentsItem : attachments) {
                if (attachmentsItem != null) {
                    AttachmentItemJsonMarshaller.getInstance()
                            .marshall(attachmentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ItemJsonMarshaller instance;

    public static ItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ItemJsonMarshaller();
        return instance;
    }
}
