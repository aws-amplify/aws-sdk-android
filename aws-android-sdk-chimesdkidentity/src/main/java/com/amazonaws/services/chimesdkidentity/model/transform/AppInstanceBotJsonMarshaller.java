/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO AppInstanceBot
 */
class AppInstanceBotJsonMarshaller {

    public void marshall(AppInstanceBot appInstanceBot, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (appInstanceBot.getAppInstanceBotArn() != null) {
            String appInstanceBotArn = appInstanceBot.getAppInstanceBotArn();
            jsonWriter.name("AppInstanceBotArn");
            jsonWriter.value(appInstanceBotArn);
        }
        if (appInstanceBot.getName() != null) {
            String name = appInstanceBot.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (appInstanceBot.getConfiguration() != null) {
            Configuration configuration = appInstanceBot.getConfiguration();
            jsonWriter.name("Configuration");
            ConfigurationJsonMarshaller.getInstance().marshall(configuration, jsonWriter);
        }
        if (appInstanceBot.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = appInstanceBot.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (appInstanceBot.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = appInstanceBot.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        if (appInstanceBot.getMetadata() != null) {
            String metadata = appInstanceBot.getMetadata();
            jsonWriter.name("Metadata");
            jsonWriter.value(metadata);
        }
        jsonWriter.endObject();
    }

    private static AppInstanceBotJsonMarshaller instance;

    public static AppInstanceBotJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppInstanceBotJsonMarshaller();
        return instance;
    }
}
