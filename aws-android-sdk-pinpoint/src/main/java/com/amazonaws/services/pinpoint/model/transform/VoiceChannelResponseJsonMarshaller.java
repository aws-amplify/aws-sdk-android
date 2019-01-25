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
 * JSON marshaller for POJO VoiceChannelResponse
 */
class VoiceChannelResponseJsonMarshaller {

    public void marshall(VoiceChannelResponse voiceChannelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (voiceChannelResponse.getApplicationId() != null) {
            String applicationId = voiceChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (voiceChannelResponse.getCreationDate() != null) {
            String creationDate = voiceChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (voiceChannelResponse.getEnabled() != null) {
            Boolean enabled = voiceChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (voiceChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = voiceChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (voiceChannelResponse.getId() != null) {
            String id = voiceChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (voiceChannelResponse.getIsArchived() != null) {
            Boolean isArchived = voiceChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (voiceChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = voiceChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (voiceChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = voiceChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (voiceChannelResponse.getPlatform() != null) {
            String platform = voiceChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (voiceChannelResponse.getVersion() != null) {
            Integer version = voiceChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static VoiceChannelResponseJsonMarshaller instance;

    public static VoiceChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VoiceChannelResponseJsonMarshaller();
        return instance;
    }
}
