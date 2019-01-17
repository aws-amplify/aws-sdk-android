/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SMSChannelResponse
 */
class SMSChannelResponseJsonMarshaller {

    public void marshall(SMSChannelResponse sMSChannelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sMSChannelResponse.getApplicationId() != null) {
            String applicationId = sMSChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (sMSChannelResponse.getCreationDate() != null) {
            String creationDate = sMSChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (sMSChannelResponse.getEnabled() != null) {
            Boolean enabled = sMSChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (sMSChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = sMSChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (sMSChannelResponse.getId() != null) {
            String id = sMSChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (sMSChannelResponse.getIsArchived() != null) {
            Boolean isArchived = sMSChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (sMSChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = sMSChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (sMSChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = sMSChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (sMSChannelResponse.getPlatform() != null) {
            String platform = sMSChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (sMSChannelResponse.getPromotionalMessagesPerSecond() != null) {
            Integer promotionalMessagesPerSecond = sMSChannelResponse
                    .getPromotionalMessagesPerSecond();
            jsonWriter.name("PromotionalMessagesPerSecond");
            jsonWriter.value(promotionalMessagesPerSecond);
        }
        if (sMSChannelResponse.getSenderId() != null) {
            String senderId = sMSChannelResponse.getSenderId();
            jsonWriter.name("SenderId");
            jsonWriter.value(senderId);
        }
        if (sMSChannelResponse.getShortCode() != null) {
            String shortCode = sMSChannelResponse.getShortCode();
            jsonWriter.name("ShortCode");
            jsonWriter.value(shortCode);
        }
        if (sMSChannelResponse.getTransactionalMessagesPerSecond() != null) {
            Integer transactionalMessagesPerSecond = sMSChannelResponse
                    .getTransactionalMessagesPerSecond();
            jsonWriter.name("TransactionalMessagesPerSecond");
            jsonWriter.value(transactionalMessagesPerSecond);
        }
        if (sMSChannelResponse.getVersion() != null) {
            Integer version = sMSChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static SMSChannelResponseJsonMarshaller instance;

    public static SMSChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SMSChannelResponseJsonMarshaller();
        return instance;
    }
}
