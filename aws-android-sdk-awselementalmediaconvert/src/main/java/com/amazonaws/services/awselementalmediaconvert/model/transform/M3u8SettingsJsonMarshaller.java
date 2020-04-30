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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO M3u8Settings
 */
class M3u8SettingsJsonMarshaller {

    public void marshall(M3u8Settings m3u8Settings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (m3u8Settings.getAudioFramesPerPes() != null) {
            Integer audioFramesPerPes = m3u8Settings.getAudioFramesPerPes();
            jsonWriter.name("AudioFramesPerPes");
            jsonWriter.value(audioFramesPerPes);
        }
        if (m3u8Settings.getAudioPids() != null) {
            java.util.List<Integer> audioPids = m3u8Settings.getAudioPids();
            jsonWriter.name("AudioPids");
            jsonWriter.beginArray();
            for (Integer audioPidsItem : audioPids) {
                if (audioPidsItem != null) {
                    jsonWriter.value(audioPidsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (m3u8Settings.getNielsenId3() != null) {
            String nielsenId3 = m3u8Settings.getNielsenId3();
            jsonWriter.name("NielsenId3");
            jsonWriter.value(nielsenId3);
        }
        if (m3u8Settings.getPatInterval() != null) {
            Integer patInterval = m3u8Settings.getPatInterval();
            jsonWriter.name("PatInterval");
            jsonWriter.value(patInterval);
        }
        if (m3u8Settings.getPcrControl() != null) {
            String pcrControl = m3u8Settings.getPcrControl();
            jsonWriter.name("PcrControl");
            jsonWriter.value(pcrControl);
        }
        if (m3u8Settings.getPcrPid() != null) {
            Integer pcrPid = m3u8Settings.getPcrPid();
            jsonWriter.name("PcrPid");
            jsonWriter.value(pcrPid);
        }
        if (m3u8Settings.getPmtInterval() != null) {
            Integer pmtInterval = m3u8Settings.getPmtInterval();
            jsonWriter.name("PmtInterval");
            jsonWriter.value(pmtInterval);
        }
        if (m3u8Settings.getPmtPid() != null) {
            Integer pmtPid = m3u8Settings.getPmtPid();
            jsonWriter.name("PmtPid");
            jsonWriter.value(pmtPid);
        }
        if (m3u8Settings.getPrivateMetadataPid() != null) {
            Integer privateMetadataPid = m3u8Settings.getPrivateMetadataPid();
            jsonWriter.name("PrivateMetadataPid");
            jsonWriter.value(privateMetadataPid);
        }
        if (m3u8Settings.getProgramNumber() != null) {
            Integer programNumber = m3u8Settings.getProgramNumber();
            jsonWriter.name("ProgramNumber");
            jsonWriter.value(programNumber);
        }
        if (m3u8Settings.getScte35Pid() != null) {
            Integer scte35Pid = m3u8Settings.getScte35Pid();
            jsonWriter.name("Scte35Pid");
            jsonWriter.value(scte35Pid);
        }
        if (m3u8Settings.getScte35Source() != null) {
            String scte35Source = m3u8Settings.getScte35Source();
            jsonWriter.name("Scte35Source");
            jsonWriter.value(scte35Source);
        }
        if (m3u8Settings.getTimedMetadata() != null) {
            String timedMetadata = m3u8Settings.getTimedMetadata();
            jsonWriter.name("TimedMetadata");
            jsonWriter.value(timedMetadata);
        }
        if (m3u8Settings.getTimedMetadataPid() != null) {
            Integer timedMetadataPid = m3u8Settings.getTimedMetadataPid();
            jsonWriter.name("TimedMetadataPid");
            jsonWriter.value(timedMetadataPid);
        }
        if (m3u8Settings.getTransportStreamId() != null) {
            Integer transportStreamId = m3u8Settings.getTransportStreamId();
            jsonWriter.name("TransportStreamId");
            jsonWriter.value(transportStreamId);
        }
        if (m3u8Settings.getVideoPid() != null) {
            Integer videoPid = m3u8Settings.getVideoPid();
            jsonWriter.name("VideoPid");
            jsonWriter.value(videoPid);
        }
        jsonWriter.endObject();
    }

    private static M3u8SettingsJsonMarshaller instance;

    public static M3u8SettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new M3u8SettingsJsonMarshaller();
        return instance;
    }
}
