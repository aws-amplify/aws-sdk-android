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
 * JSON marshaller for POJO ChannelResponse
 */
class ChannelResponseJsonMarshaller {

    public void marshall(ChannelResponse channelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (channelResponse.getApplicationId() != null) {
            String applicationId = channelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (channelResponse.getCreationDate() != null) {
            String creationDate = channelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (channelResponse.getEnabled() != null) {
            Boolean enabled = channelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (channelResponse.getHasCredential() != null) {
            Boolean hasCredential = channelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (channelResponse.getId() != null) {
            String id = channelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (channelResponse.getIsArchived() != null) {
            Boolean isArchived = channelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (channelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = channelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (channelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = channelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (channelResponse.getVersion() != null) {
            Integer version = channelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static ChannelResponseJsonMarshaller instance;

    public static ChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChannelResponseJsonMarshaller();
        return instance;
    }
}
