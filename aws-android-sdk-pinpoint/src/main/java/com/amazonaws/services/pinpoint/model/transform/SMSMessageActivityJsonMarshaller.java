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
 * JSON marshaller for POJO SMSMessageActivity
 */
class SMSMessageActivityJsonMarshaller {

    public void marshall(SMSMessageActivity sMSMessageActivity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sMSMessageActivity.getMessageConfig() != null) {
            JourneySMSMessage messageConfig = sMSMessageActivity.getMessageConfig();
            jsonWriter.name("MessageConfig");
            JourneySMSMessageJsonMarshaller.getInstance().marshall(messageConfig, jsonWriter);
        }
        if (sMSMessageActivity.getNextActivity() != null) {
            String nextActivity = sMSMessageActivity.getNextActivity();
            jsonWriter.name("NextActivity");
            jsonWriter.value(nextActivity);
        }
        if (sMSMessageActivity.getTemplateName() != null) {
            String templateName = sMSMessageActivity.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (sMSMessageActivity.getTemplateVersion() != null) {
            String templateVersion = sMSMessageActivity.getTemplateVersion();
            jsonWriter.name("TemplateVersion");
            jsonWriter.value(templateVersion);
        }
        jsonWriter.endObject();
    }

    private static SMSMessageActivityJsonMarshaller instance;

    public static SMSMessageActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SMSMessageActivityJsonMarshaller();
        return instance;
    }
}
