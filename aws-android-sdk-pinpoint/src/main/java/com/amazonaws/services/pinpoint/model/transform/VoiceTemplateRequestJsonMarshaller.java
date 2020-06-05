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
 * JSON marshaller for POJO VoiceTemplateRequest
 */
class VoiceTemplateRequestJsonMarshaller {

    public void marshall(VoiceTemplateRequest voiceTemplateRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (voiceTemplateRequest.getBody() != null) {
            String body = voiceTemplateRequest.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (voiceTemplateRequest.getDefaultSubstitutions() != null) {
            String defaultSubstitutions = voiceTemplateRequest.getDefaultSubstitutions();
            jsonWriter.name("DefaultSubstitutions");
            jsonWriter.value(defaultSubstitutions);
        }
        if (voiceTemplateRequest.getLanguageCode() != null) {
            String languageCode = voiceTemplateRequest.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (voiceTemplateRequest.getTags() != null) {
            java.util.Map<String, String> tags = voiceTemplateRequest.getTags();
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
        if (voiceTemplateRequest.getTemplateDescription() != null) {
            String templateDescription = voiceTemplateRequest.getTemplateDescription();
            jsonWriter.name("TemplateDescription");
            jsonWriter.value(templateDescription);
        }
        if (voiceTemplateRequest.getVoiceId() != null) {
            String voiceId = voiceTemplateRequest.getVoiceId();
            jsonWriter.name("VoiceId");
            jsonWriter.value(voiceId);
        }
        jsonWriter.endObject();
    }

    private static VoiceTemplateRequestJsonMarshaller instance;

    public static VoiceTemplateRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VoiceTemplateRequestJsonMarshaller();
        return instance;
    }
}
