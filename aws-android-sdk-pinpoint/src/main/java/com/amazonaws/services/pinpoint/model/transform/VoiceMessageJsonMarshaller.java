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
 * JSON marshaller for POJO VoiceMessage
 */
class VoiceMessageJsonMarshaller {

    public void marshall(VoiceMessage voiceMessage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (voiceMessage.getBody() != null) {
            String body = voiceMessage.getBody();
            jsonWriter.name("Body");
            jsonWriter.value(body);
        }
        if (voiceMessage.getLanguageCode() != null) {
            String languageCode = voiceMessage.getLanguageCode();
            jsonWriter.name("LanguageCode");
            jsonWriter.value(languageCode);
        }
        if (voiceMessage.getOriginationNumber() != null) {
            String originationNumber = voiceMessage.getOriginationNumber();
            jsonWriter.name("OriginationNumber");
            jsonWriter.value(originationNumber);
        }
        if (voiceMessage.getSubstitutions() != null) {
            java.util.Map<String, java.util.List<String>> substitutions = voiceMessage
                    .getSubstitutions();
            jsonWriter.name("Substitutions");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, java.util.List<String>> substitutionsEntry : substitutions
                    .entrySet()) {
                java.util.List<String> substitutionsValue = substitutionsEntry.getValue();
                if (substitutionsValue != null) {
                    jsonWriter.name(substitutionsEntry.getKey());
                    jsonWriter.beginArray();
                    for (String substitutionsValueItem : substitutionsValue) {
                        if (substitutionsValueItem != null) {
                            jsonWriter.value(substitutionsValueItem);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endObject();
        }
        if (voiceMessage.getVoiceId() != null) {
            String voiceId = voiceMessage.getVoiceId();
            jsonWriter.name("VoiceId");
            jsonWriter.value(voiceId);
        }
        jsonWriter.endObject();
    }

    private static VoiceMessageJsonMarshaller instance;

    public static VoiceMessageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VoiceMessageJsonMarshaller();
        return instance;
    }
}
