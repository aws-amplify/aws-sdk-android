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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Action
 */
class ActionJsonMarshaller {

    public void marshall(Action action, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (action.getJobName() != null) {
            String jobName = action.getJobName();
            jsonWriter.name("JobName");
            jsonWriter.value(jobName);
        }
        if (action.getArguments() != null) {
            java.util.Map<String, String> arguments = action.getArguments();
            jsonWriter.name("Arguments");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> argumentsEntry : arguments.entrySet()) {
                String argumentsValue = argumentsEntry.getValue();
                if (argumentsValue != null) {
                    jsonWriter.name(argumentsEntry.getKey());
                    jsonWriter.value(argumentsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (action.getTimeout() != null) {
            Integer timeout = action.getTimeout();
            jsonWriter.name("Timeout");
            jsonWriter.value(timeout);
        }
        if (action.getSecurityConfiguration() != null) {
            String securityConfiguration = action.getSecurityConfiguration();
            jsonWriter.name("SecurityConfiguration");
            jsonWriter.value(securityConfiguration);
        }
        if (action.getNotificationProperty() != null) {
            NotificationProperty notificationProperty = action.getNotificationProperty();
            jsonWriter.name("NotificationProperty");
            NotificationPropertyJsonMarshaller.getInstance().marshall(notificationProperty,
                    jsonWriter);
        }
        if (action.getCrawlerName() != null) {
            String crawlerName = action.getCrawlerName();
            jsonWriter.name("CrawlerName");
            jsonWriter.value(crawlerName);
        }
        jsonWriter.endObject();
    }

    private static ActionJsonMarshaller instance;

    public static ActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionJsonMarshaller();
        return instance;
    }
}
