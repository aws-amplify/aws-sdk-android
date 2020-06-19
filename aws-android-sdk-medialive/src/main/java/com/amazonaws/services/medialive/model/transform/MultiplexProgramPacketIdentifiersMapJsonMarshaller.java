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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MultiplexProgramPacketIdentifiersMap
 */
class MultiplexProgramPacketIdentifiersMapJsonMarshaller {

    public void marshall(MultiplexProgramPacketIdentifiersMap multiplexProgramPacketIdentifiersMap,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (multiplexProgramPacketIdentifiersMap.getAudioPids() != null) {
            java.util.List<Integer> audioPids = multiplexProgramPacketIdentifiersMap.getAudioPids();
            jsonWriter.name("AudioPids");
            jsonWriter.beginArray();
            for (Integer audioPidsItem : audioPids) {
                if (audioPidsItem != null) {
                    jsonWriter.value(audioPidsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (multiplexProgramPacketIdentifiersMap.getDvbSubPids() != null) {
            java.util.List<Integer> dvbSubPids = multiplexProgramPacketIdentifiersMap
                    .getDvbSubPids();
            jsonWriter.name("DvbSubPids");
            jsonWriter.beginArray();
            for (Integer dvbSubPidsItem : dvbSubPids) {
                if (dvbSubPidsItem != null) {
                    jsonWriter.value(dvbSubPidsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (multiplexProgramPacketIdentifiersMap.getDvbTeletextPid() != null) {
            Integer dvbTeletextPid = multiplexProgramPacketIdentifiersMap.getDvbTeletextPid();
            jsonWriter.name("DvbTeletextPid");
            jsonWriter.value(dvbTeletextPid);
        }
        if (multiplexProgramPacketIdentifiersMap.getEtvPlatformPid() != null) {
            Integer etvPlatformPid = multiplexProgramPacketIdentifiersMap.getEtvPlatformPid();
            jsonWriter.name("EtvPlatformPid");
            jsonWriter.value(etvPlatformPid);
        }
        if (multiplexProgramPacketIdentifiersMap.getEtvSignalPid() != null) {
            Integer etvSignalPid = multiplexProgramPacketIdentifiersMap.getEtvSignalPid();
            jsonWriter.name("EtvSignalPid");
            jsonWriter.value(etvSignalPid);
        }
        if (multiplexProgramPacketIdentifiersMap.getKlvDataPids() != null) {
            java.util.List<Integer> klvDataPids = multiplexProgramPacketIdentifiersMap
                    .getKlvDataPids();
            jsonWriter.name("KlvDataPids");
            jsonWriter.beginArray();
            for (Integer klvDataPidsItem : klvDataPids) {
                if (klvDataPidsItem != null) {
                    jsonWriter.value(klvDataPidsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (multiplexProgramPacketIdentifiersMap.getPcrPid() != null) {
            Integer pcrPid = multiplexProgramPacketIdentifiersMap.getPcrPid();
            jsonWriter.name("PcrPid");
            jsonWriter.value(pcrPid);
        }
        if (multiplexProgramPacketIdentifiersMap.getPmtPid() != null) {
            Integer pmtPid = multiplexProgramPacketIdentifiersMap.getPmtPid();
            jsonWriter.name("PmtPid");
            jsonWriter.value(pmtPid);
        }
        if (multiplexProgramPacketIdentifiersMap.getPrivateMetadataPid() != null) {
            Integer privateMetadataPid = multiplexProgramPacketIdentifiersMap
                    .getPrivateMetadataPid();
            jsonWriter.name("PrivateMetadataPid");
            jsonWriter.value(privateMetadataPid);
        }
        if (multiplexProgramPacketIdentifiersMap.getScte27Pids() != null) {
            java.util.List<Integer> scte27Pids = multiplexProgramPacketIdentifiersMap
                    .getScte27Pids();
            jsonWriter.name("Scte27Pids");
            jsonWriter.beginArray();
            for (Integer scte27PidsItem : scte27Pids) {
                if (scte27PidsItem != null) {
                    jsonWriter.value(scte27PidsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (multiplexProgramPacketIdentifiersMap.getScte35Pid() != null) {
            Integer scte35Pid = multiplexProgramPacketIdentifiersMap.getScte35Pid();
            jsonWriter.name("Scte35Pid");
            jsonWriter.value(scte35Pid);
        }
        if (multiplexProgramPacketIdentifiersMap.getTimedMetadataPid() != null) {
            Integer timedMetadataPid = multiplexProgramPacketIdentifiersMap.getTimedMetadataPid();
            jsonWriter.name("TimedMetadataPid");
            jsonWriter.value(timedMetadataPid);
        }
        if (multiplexProgramPacketIdentifiersMap.getVideoPid() != null) {
            Integer videoPid = multiplexProgramPacketIdentifiersMap.getVideoPid();
            jsonWriter.name("VideoPid");
            jsonWriter.value(videoPid);
        }
        jsonWriter.endObject();
    }

    private static MultiplexProgramPacketIdentifiersMapJsonMarshaller instance;

    public static MultiplexProgramPacketIdentifiersMapJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexProgramPacketIdentifiersMapJsonMarshaller();
        return instance;
    }
}
