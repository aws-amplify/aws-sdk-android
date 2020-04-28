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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MultiplexProgram
 */
class MultiplexProgramJsonMarshaller {

    public void marshall(MultiplexProgram multiplexProgram, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (multiplexProgram.getChannelId() != null) {
            String channelId = multiplexProgram.getChannelId();
            jsonWriter.name("ChannelId");
            jsonWriter.value(channelId);
        }
        if (multiplexProgram.getMultiplexProgramSettings() != null) {
            MultiplexProgramSettings multiplexProgramSettings = multiplexProgram
                    .getMultiplexProgramSettings();
            jsonWriter.name("MultiplexProgramSettings");
            MultiplexProgramSettingsJsonMarshaller.getInstance().marshall(multiplexProgramSettings,
                    jsonWriter);
        }
        if (multiplexProgram.getPacketIdentifiersMap() != null) {
            MultiplexProgramPacketIdentifiersMap packetIdentifiersMap = multiplexProgram
                    .getPacketIdentifiersMap();
            jsonWriter.name("PacketIdentifiersMap");
            MultiplexProgramPacketIdentifiersMapJsonMarshaller.getInstance().marshall(
                    packetIdentifiersMap, jsonWriter);
        }
        if (multiplexProgram.getProgramName() != null) {
            String programName = multiplexProgram.getProgramName();
            jsonWriter.name("ProgramName");
            jsonWriter.value(programName);
        }
        jsonWriter.endObject();
    }

    private static MultiplexProgramJsonMarshaller instance;

    public static MultiplexProgramJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexProgramJsonMarshaller();
        return instance;
    }
}
