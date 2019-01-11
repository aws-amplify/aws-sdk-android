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
 * JSON marshaller for POJO APNSSandboxChannelResponse
 */
class APNSSandboxChannelResponseJsonMarshaller {

    public void marshall(APNSSandboxChannelResponse aPNSSandboxChannelResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aPNSSandboxChannelResponse.getApplicationId() != null) {
            String applicationId = aPNSSandboxChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (aPNSSandboxChannelResponse.getCreationDate() != null) {
            String creationDate = aPNSSandboxChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (aPNSSandboxChannelResponse.getDefaultAuthenticationMethod() != null) {
            String defaultAuthenticationMethod = aPNSSandboxChannelResponse
                    .getDefaultAuthenticationMethod();
            jsonWriter.name("DefaultAuthenticationMethod");
            jsonWriter.value(defaultAuthenticationMethod);
        }
        if (aPNSSandboxChannelResponse.getEnabled() != null) {
            Boolean enabled = aPNSSandboxChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (aPNSSandboxChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = aPNSSandboxChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (aPNSSandboxChannelResponse.getHasTokenKey() != null) {
            Boolean hasTokenKey = aPNSSandboxChannelResponse.getHasTokenKey();
            jsonWriter.name("HasTokenKey");
            jsonWriter.value(hasTokenKey);
        }
        if (aPNSSandboxChannelResponse.getId() != null) {
            String id = aPNSSandboxChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (aPNSSandboxChannelResponse.getIsArchived() != null) {
            Boolean isArchived = aPNSSandboxChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (aPNSSandboxChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = aPNSSandboxChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (aPNSSandboxChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = aPNSSandboxChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (aPNSSandboxChannelResponse.getPlatform() != null) {
            String platform = aPNSSandboxChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (aPNSSandboxChannelResponse.getVersion() != null) {
            Integer version = aPNSSandboxChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static APNSSandboxChannelResponseJsonMarshaller instance;

    public static APNSSandboxChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSSandboxChannelResponseJsonMarshaller();
        return instance;
    }
}
