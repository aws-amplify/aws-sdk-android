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
 * JSON marshaller for POJO VoiceConnector
 */
class VoiceConnectorJsonMarshaller {

    public void marshall(VoiceConnector voiceConnector, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (voiceConnector.getVoiceConnectorId() != null) {
            String voiceConnectorId = voiceConnector.getVoiceConnectorId();
            jsonWriter.name("VoiceConnectorId");
            jsonWriter.value(voiceConnectorId);
        }
        if (voiceConnector.getAwsRegion() != null) {
            String awsRegion = voiceConnector.getAwsRegion();
            jsonWriter.name("AwsRegion");
            jsonWriter.value(awsRegion);
        }
        if (voiceConnector.getName() != null) {
            String name = voiceConnector.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (voiceConnector.getOutboundHostName() != null) {
            String outboundHostName = voiceConnector.getOutboundHostName();
            jsonWriter.name("OutboundHostName");
            jsonWriter.value(outboundHostName);
        }
        if (voiceConnector.getRequireEncryption() != null) {
            Boolean requireEncryption = voiceConnector.getRequireEncryption();
            jsonWriter.name("RequireEncryption");
            jsonWriter.value(requireEncryption);
        }
        if (voiceConnector.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = voiceConnector.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (voiceConnector.getUpdatedTimestamp() != null) {
            java.util.Date updatedTimestamp = voiceConnector.getUpdatedTimestamp();
            jsonWriter.name("UpdatedTimestamp");
            jsonWriter.value(updatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static VoiceConnectorJsonMarshaller instance;

    public static VoiceConnectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VoiceConnectorJsonMarshaller();
        return instance;
    }
}
