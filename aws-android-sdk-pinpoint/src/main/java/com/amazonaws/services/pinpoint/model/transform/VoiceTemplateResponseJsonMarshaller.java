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
 * JSON marshaller for POJO VoiceTemplateResponse
 */
class VoiceTemplateResponseJsonMarshaller {

    public void marshall(VoiceTemplateResponse voiceTemplateResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (voiceTemplateResponse.getArn() != null) {
            String arn = voiceTemplateResponse.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (voiceTemplateResponse.getBody() != null) {
            String body = voiceTemplateResponse.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (voiceTemplateResponse.getCreationDate() != null) {
            String creationDate = voiceTemplateResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (voiceTemplateResponse.getDefaultSubstitutions() != null) {
            String defaultSubstitutions = voiceTemplateResponse.getDefaultSubstitutions();
            jsonWriter.name("DefaultSubstitutions");
            jsonWriter.value(defaultSubstitutions);
        }
        if (voiceTemplateResponse.getLanguageCode() != null) {
            String languageCode = voiceTemplateResponse.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (voiceTemplateResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = voiceTemplateResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (voiceTemplateResponse.getTags() != null) {
            java.util.Map<String, String> tags = voiceTemplateResponse.getTags();
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
        if (voiceTemplateResponse.getTemplateDescription() != null) {
            String templateDescription = voiceTemplateResponse.getTemplateDescription();
            jsonWriter.name("TemplateDescription");
            jsonWriter.value(templateDescription);
        }
        if (voiceTemplateResponse.getTemplateName() != null) {
            String templateName = voiceTemplateResponse.getTemplateName();
            jsonWriter.name("TemplateName");
            jsonWriter.value(templateName);
        }
        if (voiceTemplateResponse.getTemplateType() != null) {
            String templateType = voiceTemplateResponse.getTemplateType();
            jsonWriter.name("TemplateType");
            jsonWriter.value(templateType);
        }
        if (voiceTemplateResponse.getVersion() != null) {
            String version = voiceTemplateResponse.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (voiceTemplateResponse.getVoiceId() != null) {
            String voiceId = voiceTemplateResponse.getVoiceId();
            jsonWriter.name("VoiceId");
            jsonWriter.value(voiceId);
        }
        jsonWriter.endObject();
    }

    private static VoiceTemplateResponseJsonMarshaller instance;

    public static VoiceTemplateResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VoiceTemplateResponseJsonMarshaller();
        return instance;
    }
}
