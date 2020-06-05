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
 * JSON marshaller for POJO EmailMessageActivity
 */
class EmailMessageActivityJsonMarshaller {

    public void marshall(EmailMessageActivity emailMessageActivity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (emailMessageActivity.getMessageConfig() != null) {
            JourneyEmailMessage messageConfig = emailMessageActivity.getMessageConfig();
            jsonWriter.name("MessageConfig");
            JourneyEmailMessageJsonMarshaller.getInstance().marshall(messageConfig, jsonWriter);
        }
        if (emailMessageActivity.getNextActivity() != null) {
            String nextActivity = emailMessageActivity.getNextActivity();
            jsonWriter.name("NextActivity");
            jsonWriter.value(nextActivity);
        }
        if (emailMessageActivity.getTemplateName() != null) {
            String templateName = emailMessageActivity.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (emailMessageActivity.getTemplateVersion() != null) {
            String templateVersion = emailMessageActivity.getTemplateVersion();
            jsonWriter.name("TemplateVersion");
            jsonWriter.value(templateVersion);
        }
        jsonWriter.endObject();
    }

    private static EmailMessageActivityJsonMarshaller instance;

    public static EmailMessageActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmailMessageActivityJsonMarshaller();
        return instance;
    }
}
