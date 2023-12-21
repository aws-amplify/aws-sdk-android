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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LogDeliveryConfigurationType
 */
class LogDeliveryConfigurationTypeJsonMarshaller {

    public void marshall(LogDeliveryConfigurationType logDeliveryConfigurationType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (logDeliveryConfigurationType.getUserPoolId() != null) {
            String userPoolId = logDeliveryConfigurationType.getUserPoolId();
            jsonWriter.name("UserPoolId");
            jsonWriter.value(userPoolId);
        }
        if (logDeliveryConfigurationType.getLogConfigurations() != null) {
            java.util.List<LogConfigurationType> logConfigurations = logDeliveryConfigurationType
                    .getLogConfigurations();
            jsonWriter.name("LogConfigurations");
            jsonWriter.beginArray();
            for (LogConfigurationType logConfigurationsItem : logConfigurations) {
                if (logConfigurationsItem != null) {
                    LogConfigurationTypeJsonMarshaller.getInstance().marshall(
                            logConfigurationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LogDeliveryConfigurationTypeJsonMarshaller instance;

    public static LogDeliveryConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LogDeliveryConfigurationTypeJsonMarshaller();
        return instance;
    }
}
