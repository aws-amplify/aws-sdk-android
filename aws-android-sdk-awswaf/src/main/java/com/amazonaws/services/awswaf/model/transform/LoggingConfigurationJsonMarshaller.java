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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LoggingConfiguration
 */
class LoggingConfigurationJsonMarshaller {

    public void marshall(LoggingConfiguration loggingConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (loggingConfiguration.getResourceArn() != null) {
            String resourceArn = loggingConfiguration.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (loggingConfiguration.getLogDestinationConfigs() != null) {
            java.util.List<String> logDestinationConfigs = loggingConfiguration
                    .getLogDestinationConfigs();
            jsonWriter.name("LogDestinationConfigs");
            jsonWriter.beginArray();
            for (String logDestinationConfigsItem : logDestinationConfigs) {
                if (logDestinationConfigsItem != null) {
                    jsonWriter.value(logDestinationConfigsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (loggingConfiguration.getRedactedFields() != null) {
            java.util.List<FieldToMatch> redactedFields = loggingConfiguration.getRedactedFields();
            jsonWriter.name("RedactedFields");
            jsonWriter.beginArray();
            for (FieldToMatch redactedFieldsItem : redactedFields) {
                if (redactedFieldsItem != null) {
                    FieldToMatchJsonMarshaller.getInstance().marshall(redactedFieldsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LoggingConfigurationJsonMarshaller instance;

    public static LoggingConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoggingConfigurationJsonMarshaller();
        return instance;
    }
}
