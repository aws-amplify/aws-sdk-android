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
 * JSON marshaller for POJO EmailTemplateResponse
 */
class EmailTemplateResponseJsonMarshaller {

    public void marshall(EmailTemplateResponse emailTemplateResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (emailTemplateResponse.getArn() != null) {
            String arn = emailTemplateResponse.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (emailTemplateResponse.getCreationDate() != null) {
            String creationDate = emailTemplateResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (emailTemplateResponse.getHtmlPart() != null) {
            String htmlPart = emailTemplateResponse.getHtmlPart();
            jsonWriter.name("HtmlPart");
            jsonWriter.value(htmlPart);
        }
        if (emailTemplateResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = emailTemplateResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (emailTemplateResponse.getSubject() != null) {
            String subject = emailTemplateResponse.getSubject();
            jsonWriter.name("Subject");
            jsonWriter.value(subject);
        }
        if (emailTemplateResponse.getTags() != null) {
            java.util.Map<String, String> tags = emailTemplateResponse.getTags();
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
        if (emailTemplateResponse.getTemplateName() != null) {
            String templateName = emailTemplateResponse.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (emailTemplateResponse.getTemplateType() != null) {
            String templateType = emailTemplateResponse.getTemplateType();
            jsonWriter.name("TemplateType");
            jsonWriter.value(templateType);
        }
        if (emailTemplateResponse.getTextPart() != null) {
            String textPart = emailTemplateResponse.getTextPart();
            jsonWriter.name("TextPart");
            jsonWriter.value(textPart);
        }
        jsonWriter.endObject();
    }

    private static EmailTemplateResponseJsonMarshaller instance;

    public static EmailTemplateResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmailTemplateResponseJsonMarshaller();
        return instance;
    }
}
