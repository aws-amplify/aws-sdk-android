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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EmailTemplateRequest
 */
class EmailTemplateRequestJsonMarshaller {

    public void marshall(EmailTemplateRequest emailTemplateRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (emailTemplateRequest.getDefaultSubstitutions() != null) {
            String defaultSubstitutions = emailTemplateRequest.getDefaultSubstitutions();
            jsonWriter.name("DefaultSubstitutions");
            jsonWriter.value(defaultSubstitutions);
        }
        if (emailTemplateRequest.getHtmlPart() != null) {
            String htmlPart = emailTemplateRequest.getHtmlPart();
            jsonWriter.name("HtmlPart");
            jsonWriter.value(htmlPart);
        }
        if (emailTemplateRequest.getRecommenderId() != null) {
            String recommenderId = emailTemplateRequest.getRecommenderId();
            jsonWriter.name("RecommenderId");
            jsonWriter.value(recommenderId);
        }
        if (emailTemplateRequest.getSubject() != null) {
            String subject = emailTemplateRequest.getSubject();
            jsonWriter.name("Subject");
            jsonWriter.value(subject);
        }
        if (emailTemplateRequest.getTags() != null) {
            java.util.Map<String, String> tags = emailTemplateRequest.getTags();
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
        if (emailTemplateRequest.getTemplateDescription() != null) {
            String templateDescription = emailTemplateRequest.getTemplateDescription();
            jsonWriter.name("TemplateDescription");
            jsonWriter.value(templateDescription);
        }
        if (emailTemplateRequest.getTextPart() != null) {
            String textPart = emailTemplateRequest.getTextPart();
            jsonWriter.name("TextPart");
            jsonWriter.value(textPart);
        }
        jsonWriter.endObject();
    }

    private static EmailTemplateRequestJsonMarshaller instance;

    public static EmailTemplateRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EmailTemplateRequestJsonMarshaller();
        return instance;
    }
}
