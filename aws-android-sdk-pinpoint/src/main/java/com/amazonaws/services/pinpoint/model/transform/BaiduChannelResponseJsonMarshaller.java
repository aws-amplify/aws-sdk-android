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
 * JSON marshaller for POJO BaiduChannelResponse
 */
class BaiduChannelResponseJsonMarshaller {

    public void marshall(BaiduChannelResponse baiduChannelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (baiduChannelResponse.getApplicationId() != null) {
            String applicationId = baiduChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (baiduChannelResponse.getCreationDate() != null) {
            String creationDate = baiduChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (baiduChannelResponse.getCredential() != null) {
            String credential = baiduChannelResponse.getCredential();
            jsonWriter.name("Credential");
            jsonWriter.value(credential);
        }
        if (baiduChannelResponse.getEnabled() != null) {
            Boolean enabled = baiduChannelResponse.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (baiduChannelResponse.getHasCredential() != null) {
            Boolean hasCredential = baiduChannelResponse.getHasCredential();
            jsonWriter.name("HasCredential");
            jsonWriter.value(hasCredential);
        }
        if (baiduChannelResponse.getId() != null) {
            String id = baiduChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (baiduChannelResponse.getIsArchived() != null) {
            Boolean isArchived = baiduChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (baiduChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = baiduChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (baiduChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = baiduChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (baiduChannelResponse.getPlatform() != null) {
            String platform = baiduChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (baiduChannelResponse.getVersion() != null) {
            Integer version = baiduChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static BaiduChannelResponseJsonMarshaller instance;

    public static BaiduChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BaiduChannelResponseJsonMarshaller();
        return instance;
    }
}
