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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PushMessageActivity
 */
class PushMessageActivityJsonMarshaller {

    public void marshall(PushMessageActivity pushMessageActivity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (pushMessageActivity.getMessageConfig() != null) {
            JourneyPushMessage messageConfig = pushMessageActivity.getMessageConfig();
            jsonWriter.name("MessageConfig");
            JourneyPushMessageJsonMarshaller.getInstance().marshall(messageConfig, jsonWriter);
        }
        if (pushMessageActivity.getNextActivity() != null) {
            String nextActivity = pushMessageActivity.getNextActivity();
            jsonWriter.name("NextActivity");
            jsonWriter.value(nextActivity);
        }
        if (pushMessageActivity.getTemplateName() != null) {
            String templateName = pushMessageActivity.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (pushMessageActivity.getTemplateVersion() != null) {
            String templateVersion = pushMessageActivity.getTemplateVersion();
            jsonWriter.name("TemplateVersion");
            jsonWriter.value(templateVersion);
        }
        jsonWriter.endObject();
    }

    private static PushMessageActivityJsonMarshaller instance;

    public static PushMessageActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PushMessageActivityJsonMarshaller();
        return instance;
    }
}
