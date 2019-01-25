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
 * JSON marshaller for POJO APNSVoipChannelResponse
 */
class APNSVoipChannelResponseJsonMarshaller {

    public void marshall(APNSVoipChannelResponse aPNSVoipChannelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (aPNSVoipChannelResponse.getApplicationId() != null) {
            String applicationId = aPNSVoipChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (aPNSVoipChannelResponse.getCreationDate() != null) {
            String creationDate = aPNSVoipChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (aPNSVoipChannelResponse.getDefaultAuthenticationMethod() != null) {
            String defaultAuthenticationMethod = aPNSVoipChannelResponse
                    .getDefaultAuthenticationMethod();
            jsonWriter.name("DefaultAuthenticationMethod");
            jsonWriter.value(defaultAuthenticationMethod);
        }
        if (aPNSVoipChannelResponse.getEnabled() != null) {
            Boolean enabled = aPNSVoipChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (aPNSVoipChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = aPNSVoipChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (aPNSVoipChannelResponse.getHasTokenKey() != null) {
            Boolean hasTokenKey = aPNSVoipChannelResponse.getHasTokenKey();
            jsonWriter.name("HasTokenKey");
            jsonWriter.value(hasTokenKey);
        }
        if (aPNSVoipChannelResponse.getId() != null) {
            String id = aPNSVoipChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (aPNSVoipChannelResponse.getIsArchived() != null) {
            Boolean isArchived = aPNSVoipChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (aPNSVoipChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = aPNSVoipChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (aPNSVoipChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = aPNSVoipChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (aPNSVoipChannelResponse.getPlatform() != null) {
            String platform = aPNSVoipChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (aPNSVoipChannelResponse.getVersion() != null) {
            Integer version = aPNSVoipChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static APNSVoipChannelResponseJsonMarshaller instance;

    public static APNSVoipChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSVoipChannelResponseJsonMarshaller();
        return instance;
    }
}
