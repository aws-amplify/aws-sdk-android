/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO APNSChannelResponse
 */
class APNSChannelResponseJsonMarshaller {

    public void marshall(APNSChannelResponse aPNSChannelResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (aPNSChannelResponse.getApplicationId() != null) {
            String applicationId = aPNSChannelResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (aPNSChannelResponse.getCreationDate() != null) {
            String creationDate = aPNSChannelResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (aPNSChannelResponse.getId() != null) {
            String id = aPNSChannelResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (aPNSChannelResponse.getIsArchived() != null) {
            Boolean isArchived = aPNSChannelResponse.getIsArchived();
            jsonWriter.name("IsArchived");
            jsonWriter.value(isArchived);
        }
        if (aPNSChannelResponse.getLastModifiedBy() != null) {
            String lastModifiedBy = aPNSChannelResponse.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (aPNSChannelResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = aPNSChannelResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (aPNSChannelResponse.getPlatform() != null) {
            String platform = aPNSChannelResponse.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (aPNSChannelResponse.getVersion() != null) {
            Integer version = aPNSChannelResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        jsonWriter.endObject();
    }

    private static APNSChannelResponseJsonMarshaller instance;

    public static APNSChannelResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new APNSChannelResponseJsonMarshaller();
        return instance;
    }
}
