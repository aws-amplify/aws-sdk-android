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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MultiplexProgramPacketIdentifiersMap
 */
class MultiplexProgramPacketIdentifiersMapJsonUnmarshaller implements
        Unmarshaller<MultiplexProgramPacketIdentifiersMap, JsonUnmarshallerContext> {

    public MultiplexProgramPacketIdentifiersMap unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MultiplexProgramPacketIdentifiersMap multiplexProgramPacketIdentifiersMap = new MultiplexProgramPacketIdentifiersMap();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AudioPids")) {
                multiplexProgramPacketIdentifiersMap.setAudioPids(new ListUnmarshaller<Integer>(
                        IntegerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DvbSubPids")) {
                multiplexProgramPacketIdentifiersMap.setDvbSubPids(new ListUnmarshaller<Integer>(
                        IntegerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DvbTeletextPid")) {
                multiplexProgramPacketIdentifiersMap.setDvbTeletextPid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EtvPlatformPid")) {
                multiplexProgramPacketIdentifiersMap.setEtvPlatformPid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EtvSignalPid")) {
                multiplexProgramPacketIdentifiersMap.setEtvSignalPid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("KlvDataPids")) {
                multiplexProgramPacketIdentifiersMap.setKlvDataPids(new ListUnmarshaller<Integer>(
                        IntegerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("PcrPid")) {
                multiplexProgramPacketIdentifiersMap.setPcrPid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PmtPid")) {
                multiplexProgramPacketIdentifiersMap.setPmtPid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateMetadataPid")) {
                multiplexProgramPacketIdentifiersMap.setPrivateMetadataPid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scte27Pids")) {
                multiplexProgramPacketIdentifiersMap.setScte27Pids(new ListUnmarshaller<Integer>(
                        IntegerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Scte35Pid")) {
                multiplexProgramPacketIdentifiersMap.setScte35Pid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataPid")) {
                multiplexProgramPacketIdentifiersMap.setTimedMetadataPid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoPid")) {
                multiplexProgramPacketIdentifiersMap.setVideoPid(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return multiplexProgramPacketIdentifiersMap;
    }

    private static MultiplexProgramPacketIdentifiersMapJsonUnmarshaller instance;

    public static MultiplexProgramPacketIdentifiersMapJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexProgramPacketIdentifiersMapJsonUnmarshaller();
        return instance;
    }
}
