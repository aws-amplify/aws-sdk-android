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
 * JSON marshaller for POJO EmailChannelResponse
 */
class EmailChannelResponseJsonMarshaller {

    public void marshall(EmailChannelResponse emailChannelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (emailChannelResponse.getApplicationId() != null) {
            String applicationId = emailChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (emailChannelResponse.getConfigurationSet() != null) {
            String configurationSet = emailChannelResponse.getConfigurationSet();
            jsonWriter.name("ConfigurationSet");
            jsonWriter.value(configurationSet);
        }
        if (emailChannelResponse.getCreationDate() != null) {
            String creationDate = emailChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (emailChannelResponse.getEnabled() != null) {
            Boolean enabled = emailChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (emailChannelResponse.getFromAddress() != null) {
            String fromAddress = emailChannelResponse.getFromAddress();
            jsonWriter.name("FromAddress");
            jsonWriter.value(fromAddress);
        }
        if (emailChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = emailChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (emailChannelResponse.getId() != null) {
            String id = emailChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (emailChannelResponse.getIdentity() != null) {
            String identity = emailChannelResponse.getIdentity();
            jsonWriter.name("Identity");
            jsonWriter.value(identity);
        }
        if (emailChannelResponse.getIsArchived() != null) {
            Boolean isArchived = emailChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (emailChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = emailChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (emailChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = emailChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (emailChannelResponse.getMessagesPerSecond() != null) {
            Integer messagesPerSecond = emailChannelResponse.getMessagesPerSecond();
            jsonWriter.name("MessagesPerSecond");
            jsonWriter.value(messagesPerSecond);
        }
        if (emailChannelResponse.getPlatform() != null) {
            String platform = emailChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (emailChannelResponse.getRoleArn() != null) {
            String roleArn = emailChannelResponse.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (emailChannelResponse.getVersion() != null) {
            Integer version = emailChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static EmailChannelResponseJsonMarshaller instance;

    public static EmailChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmailChannelResponseJsonMarshaller();
        return instance;
    }
}
