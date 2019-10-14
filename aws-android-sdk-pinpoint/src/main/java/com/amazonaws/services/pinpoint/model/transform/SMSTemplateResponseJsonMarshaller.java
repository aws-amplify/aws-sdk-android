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
 * JSON marshaller for POJO SMSTemplateResponse
 */
class SMSTemplateResponseJsonMarshaller {

    public void marshall(SMSTemplateResponse sMSTemplateResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sMSTemplateResponse.getArn() != null) {
            String arn = sMSTemplateResponse.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (sMSTemplateResponse.getBody() != null) {
            String body = sMSTemplateResponse.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (sMSTemplateResponse.getCreationDate() != null) {
            String creationDate = sMSTemplateResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (sMSTemplateResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = sMSTemplateResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (sMSTemplateResponse.getTags() != null) {
            java.util.Map<String, String> tags = sMSTemplateResponse.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (sMSTemplateResponse.getTemplateName() != null) {
            String templateName = sMSTemplateResponse.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (sMSTemplateResponse.getTemplateType() != null) {
            String templateType = sMSTemplateResponse.getTemplateType();
            jsonWriter.name("TemplateType");
            jsonWriter.value(templateType);
        }
        jsonWriter.endObject();
    }

    private static SMSTemplateResponseJsonMarshaller instance;

    public static SMSTemplateResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SMSTemplateResponseJsonMarshaller();
        return instance;
    }
}
