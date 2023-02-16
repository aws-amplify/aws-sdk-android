/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ChatParticipantRoleConfig
 */
class ChatParticipantRoleConfigJsonMarshaller {

    public void marshall(ChatParticipantRoleConfig chatParticipantRoleConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (chatParticipantRoleConfig.getParticipantTimerConfigList() != null) {
            java.util.List<ParticipantTimerConfiguration> participantTimerConfigList = chatParticipantRoleConfig
                    .getParticipantTimerConfigList();
            jsonWriter.name("ParticipantTimerConfigList");
            jsonWriter.beginArray();
            for (ParticipantTimerConfiguration participantTimerConfigListItem : participantTimerConfigList) {
                if (participantTimerConfigListItem != null) {
                    ParticipantTimerConfigurationJsonMarshaller.getInstance().marshall(
                            participantTimerConfigListItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ChatParticipantRoleConfigJsonMarshaller instance;

    public static ChatParticipantRoleConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ChatParticipantRoleConfigJsonMarshaller();
        return instance;
    }
}
