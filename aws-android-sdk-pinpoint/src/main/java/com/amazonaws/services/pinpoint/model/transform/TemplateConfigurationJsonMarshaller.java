/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO TemplateConfiguration
 */
class TemplateConfigurationJsonMarshaller {

    public void marshall(TemplateConfiguration templateConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (templateConfiguration.getEmailTemplate() != null) {
            Template emailTemplate = templateConfiguration.getEmailTemplate();
            jsonWriter.name("EmailTemplate");
            TemplateJsonMarshaller.getInstance().marshall(emailTemplate, jsonWriter);
        }
        if (templateConfiguration.getPushTemplate() != null) {
            Template pushTemplate = templateConfiguration.getPushTemplate();
            jsonWriter.name("PushTemplate");
            TemplateJsonMarshaller.getInstance().marshall(pushTemplate, jsonWriter);
        }
        if (templateConfiguration.getSMSTemplate() != null) {
            Template sMSTemplate = templateConfiguration.getSMSTemplate();
            jsonWriter.name("SMSTemplate");
            TemplateJsonMarshaller.getInstance().marshall(sMSTemplate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TemplateConfigurationJsonMarshaller instance;

    public static TemplateConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateConfigurationJsonMarshaller();
        return instance;
    }
}
