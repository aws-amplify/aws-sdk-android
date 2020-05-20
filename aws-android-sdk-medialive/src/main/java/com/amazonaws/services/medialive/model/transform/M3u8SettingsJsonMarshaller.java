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
            String audioPids = m3u8Settings.getAudioPids();
            jsonWriter.name("AudioPids");
            jsonWriter.value(audioPids);
        }
        if (m3u8Settings.getEcmPid() != null) {
            String ecmPid = m3u8Settings.getEcmPid();
            jsonWriter.name("EcmPid");
            jsonWriter.value(ecmPid);
        }
        if (m3u8Settings.getNielsenId3Behavior() != null) {
            String nielsenId3Behavior = m3u8Settings.getNielsenId3Behavior();
            jsonWriter.name("NielsenId3Behavior");
            jsonWriter.value(nielsenId3Behavior);
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
        if (m3u8Settings.getPcrPeriod() != null) {
            Integer pcrPeriod = m3u8Settings.getPcrPeriod();
            jsonWriter.name("PcrPeriod");
            jsonWriter.value(pcrPeriod);
        }
        if (m3u8Settings.getPcrPid() != null) {
            String pcrPid = m3u8Settings.getPcrPid();
            jsonWriter.name("PcrPid");
            jsonWriter.value(pcrPid);
        }
        if (m3u8Settings.getPmtInterval() != null) {
            Integer pmtInterval = m3u8Settings.getPmtInterval();
            jsonWriter.name("PmtInterval");
            jsonWriter.value(pmtInterval);
        }
        if (m3u8Settings.getPmtPid() != null) {
            String pmtPid = m3u8Settings.getPmtPid();
            jsonWriter.name("PmtPid");
            jsonWriter.value(pmtPid);
        }
        if (m3u8Settings.getProgramNum() != null) {
            Integer programNum = m3u8Settings.getProgramNum();
            jsonWriter.name("ProgramNum");
            jsonWriter.value(programNum);
        }
        if (m3u8Settings.getScte35Behavior() != null) {
            String scte35Behavior = m3u8Settings.getScte35Behavior();
            jsonWriter.name("Scte35Behavior");
            jsonWriter.value(scte35Behavior);
        }
        if (m3u8Settings.getScte35Pid() != null) {
            String scte35Pid = m3u8Settings.getScte35Pid();
            jsonWriter.name("Scte35Pid");
            jsonWriter.value(scte35Pid);
        }
        if (m3u8Settings.getTimedMetadataBehavior() != null) {
            String timedMetadataBehavior = m3u8Settings.getTimedMetadataBehavior();
            jsonWriter.name("TimedMetadataBehavior");
            jsonWriter.value(timedMetadataBehavior);
        }
        if (m3u8Settings.getTimedMetadataPid() != null) {
            String timedMetadataPid = m3u8Settings.getTimedMetadataPid();
            jsonWriter.name("TimedMetadataPid");
            jsonWriter.value(timedMetadataPid);
        }
        if (m3u8Settings.getTransportStreamId() != null) {
            Integer transportStreamId = m3u8Settings.getTransportStreamId();
            jsonWriter.name("TransportStreamId");
            jsonWriter.value(transportStreamId);
        }
        if (m3u8Settings.getVideoPid() != null) {
            String videoPid = m3u8Settings.getVideoPid();
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
