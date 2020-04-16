/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AppDetails
 */
class AppDetailsJsonMarshaller {

    public void marshall(AppDetails appDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (appDetails.getDomainId() != null) {
            String domainId = appDetails.getDomainId();
            jsonWriter.name("DomainId");
            jsonWriter.value(domainId);
        }
        if (appDetails.getUserProfileName() != null) {
            String userProfileName = appDetails.getUserProfileName();
            jsonWriter.name("UserProfileName");
            jsonWriter.value(userProfileName);
        }
        if (appDetails.getAppType() != null) {
            String appType = appDetails.getAppType();
            jsonWriter.name("AppType");
            jsonWriter.value(appType);
        }
        if (appDetails.getAppName() != null) {
            String appName = appDetails.getAppName();
            jsonWriter.name("AppName");
            jsonWriter.value(appName);
        }
        if (appDetails.getStatus() != null) {
            String status = appDetails.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (appDetails.getCreationTime() != null) {
            java.util.Date creationTime = appDetails.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static AppDetailsJsonMarshaller instance;

    public static AppDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppDetailsJsonMarshaller();
        return instance;
    }
}
