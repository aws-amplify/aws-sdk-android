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

package com.amazonaws.services.chime.model.transform;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VoiceConnectorGroup
 */
class VoiceConnectorGroupJsonMarshaller {

    public void marshall(VoiceConnectorGroup voiceConnectorGroup, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (voiceConnectorGroup.getVoiceConnectorGroupId() != null) {
            String voiceConnectorGroupId = voiceConnectorGroup.getVoiceConnectorGroupId();
            jsonWriter.name("VoiceConnectorGroupId");
            jsonWriter.value(voiceConnectorGroupId);
        }
        if (voiceConnectorGroup.getName() != null) {
            String name = voiceConnectorGroup.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (voiceConnectorGroup.getVoiceConnectorItems() != null) {
            java.util.List<VoiceConnectorItem> voiceConnectorItems = voiceConnectorGroup
                    .getVoiceConnectorItems();
            jsonWriter.name("VoiceConnectorItems");
            jsonWriter.beginArray();
            for (VoiceConnectorItem voiceConnectorItemsItem : voiceConnectorItems) {
                if (voiceConnectorItemsItem != null) {
                    VoiceConnectorItemJsonMarshaller.getInstance().marshall(
                            voiceConnectorItemsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (voiceConnectorGroup.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = voiceConnectorGroup.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (voiceConnectorGroup.getUpdatedTimestamp() != null) {
            java.util.Date updatedTimestamp = voiceConnectorGroup.getUpdatedTimestamp();
            jsonWriter.name("UpdatedTimestamp");
            jsonWriter.value(updatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static VoiceConnectorGroupJsonMarshaller instance;

    public static VoiceConnectorGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VoiceConnectorGroupJsonMarshaller();
        return instance;
    }
}
