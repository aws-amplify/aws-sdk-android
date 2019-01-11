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
 * JSON marshaller for POJO GCMChannelResponse
 */
class GCMChannelResponseJsonMarshaller {

    public void marshall(GCMChannelResponse gCMChannelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (gCMChannelResponse.getApplicationId() != null) {
            String applicationId = gCMChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (gCMChannelResponse.getCreationDate() != null) {
            String creationDate = gCMChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (gCMChannelResponse.getCredential() != null) {
            String credential = gCMChannelResponse.getCredential();
            jsonWriter.name("Credential");
            jsonWriter.value(credential);
        }
        if (gCMChannelResponse.getEnabled() != null) {
            Boolean enabled = gCMChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (gCMChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = gCMChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (gCMChannelResponse.getId() != null) {
            String id = gCMChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (gCMChannelResponse.getIsArchived() != null) {
            Boolean isArchived = gCMChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (gCMChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = gCMChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (gCMChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = gCMChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (gCMChannelResponse.getPlatform() != null) {
            String platform = gCMChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (gCMChannelResponse.getVersion() != null) {
            Integer version = gCMChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static GCMChannelResponseJsonMarshaller instance;

    public static GCMChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GCMChannelResponseJsonMarshaller();
        return instance;
    }
}
