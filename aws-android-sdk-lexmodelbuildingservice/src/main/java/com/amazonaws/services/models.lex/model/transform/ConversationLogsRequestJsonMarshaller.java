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

package com.amazonaws.services.models.lex.model.transform;

import com.amazonaws.services.models.lex.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConversationLogsRequest
 */
class ConversationLogsRequestJsonMarshaller {

    public void marshall(ConversationLogsRequest conversationLogsRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (conversationLogsRequest.getLogSettings() != null) {
            java.util.List<LogSettingsRequest> logSettings = conversationLogsRequest
                    .getLogSettings();
            jsonWriter.name("logSettings");
            jsonWriter.beginArray();
            for (LogSettingsRequest logSettingsItem : logSettings) {
                if (logSettingsItem != null) {
                    LogSettingsRequestJsonMarshaller.getInstance().marshall(logSettingsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (conversationLogsRequest.getIamRoleArn() != null) {
            String iamRoleArn = conversationLogsRequest.getIamRoleArn();
            jsonWriter.name("iamRoleArn");
            jsonWriter.value(iamRoleArn);
        }
        jsonWriter.endObject();
    }

    private static ConversationLogsRequestJsonMarshaller instance;

    public static ConversationLogsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConversationLogsRequestJsonMarshaller();
        return instance;
    }
}
