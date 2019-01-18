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
 * JSON marshaller for POJO APNSVoipSandboxChannelResponse
 */
class APNSVoipSandboxChannelResponseJsonMarshaller {

    public void marshall(APNSVoipSandboxChannelResponse aPNSVoipSandboxChannelResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aPNSVoipSandboxChannelResponse.getApplicationId() != null) {
            String applicationId = aPNSVoipSandboxChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (aPNSVoipSandboxChannelResponse.getCreationDate() != null) {
            String creationDate = aPNSVoipSandboxChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (aPNSVoipSandboxChannelResponse.getDefaultAuthenticationMethod() != null) {
            String defaultAuthenticationMethod = aPNSVoipSandboxChannelResponse
                    .getDefaultAuthenticationMethod();
            jsonWriter.name("DefaultAuthenticationMethod");
            jsonWriter.value(defaultAuthenticationMethod);
        }
        if (aPNSVoipSandboxChannelResponse.getEnabled() != null) {
            Boolean enabled = aPNSVoipSandboxChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (aPNSVoipSandboxChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = aPNSVoipSandboxChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (aPNSVoipSandboxChannelResponse.getHasTokenKey() != null) {
            Boolean hasTokenKey = aPNSVoipSandboxChannelResponse.getHasTokenKey();
            jsonWriter.name("HasTokenKey");
            jsonWriter.value(hasTokenKey);
        }
        if (aPNSVoipSandboxChannelResponse.getId() != null) {
            String id = aPNSVoipSandboxChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (aPNSVoipSandboxChannelResponse.getIsArchived() != null) {
            Boolean isArchived = aPNSVoipSandboxChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (aPNSVoipSandboxChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = aPNSVoipSandboxChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (aPNSVoipSandboxChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = aPNSVoipSandboxChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (aPNSVoipSandboxChannelResponse.getPlatform() != null) {
            String platform = aPNSVoipSandboxChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (aPNSVoipSandboxChannelResponse.getVersion() != null) {
            Integer version = aPNSVoipSandboxChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static APNSVoipSandboxChannelResponseJsonMarshaller instance;

    public static APNSVoipSandboxChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipSandboxChannelResponseJsonMarshaller();
        return instance;
    }
}
