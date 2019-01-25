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
 * JSON marshaller for POJO ADMChannelResponse
 */
class ADMChannelResponseJsonMarshaller {

    public void marshall(ADMChannelResponse aDMChannelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (aDMChannelResponse.getApplicationId() != null) {
            String applicationId = aDMChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (aDMChannelResponse.getCreationDate() != null) {
            String creationDate = aDMChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (aDMChannelResponse.getEnabled() != null) {
            Boolean enabled = aDMChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (aDMChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = aDMChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (aDMChannelResponse.getId() != null) {
            String id = aDMChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (aDMChannelResponse.getIsArchived() != null) {
            Boolean isArchived = aDMChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (aDMChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = aDMChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (aDMChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = aDMChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (aDMChannelResponse.getPlatform() != null) {
            String platform = aDMChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (aDMChannelResponse.getVersion() != null) {
            Integer version = aDMChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static ADMChannelResponseJsonMarshaller instance;

    public static ADMChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ADMChannelResponseJsonMarshaller();
        return instance;
    }
}
