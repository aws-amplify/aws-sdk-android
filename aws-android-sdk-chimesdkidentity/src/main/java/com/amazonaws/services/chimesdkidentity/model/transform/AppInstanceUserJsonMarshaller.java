/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AppInstanceUser
 */
class AppInstanceUserJsonMarshaller {

    public void marshall(AppInstanceUser appInstanceUser, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (appInstanceUser.getAppInstanceUserArn() != null) {
            String appInstanceUserArn = appInstanceUser.getAppInstanceUserArn();
            jsonWriter.name("AppInstanceUserArn");
            jsonWriter.value(appInstanceUserArn);
        }
        if (appInstanceUser.getName() != null) {
            String name = appInstanceUser.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (appInstanceUser.getMetadata() != null) {
            String metadata = appInstanceUser.getMetadata();
            jsonWriter.name("Metadata");
            jsonWriter.value(metadata);
        }
        if (appInstanceUser.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = appInstanceUser.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (appInstanceUser.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = appInstanceUser.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static AppInstanceUserJsonMarshaller instance;

    public static AppInstanceUserJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppInstanceUserJsonMarshaller();
        return instance;
    }
}
