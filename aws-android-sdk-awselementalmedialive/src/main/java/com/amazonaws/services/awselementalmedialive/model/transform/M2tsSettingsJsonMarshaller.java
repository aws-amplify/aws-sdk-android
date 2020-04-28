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
 * JSON marshaller for POJO M2tsSettings
 */
class M2tsSettingsJsonMarshaller {

    public void marshall(M2tsSettings m2tsSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (m2tsSettings.getAbsentInputAudioBehavior() != null) {
            String absentInputAudioBehavior = m2tsSettings.getAbsentInputAudioBehavior();
            jsonWriter.name("AbsentInputAudioBehavior");
            jsonWriter.value(absentInputAudioBehavior);
        }
        if (m2tsSettings.getArib() != null) {
            String arib = m2tsSettings.getArib();
            jsonWriter.name("Arib");
            jsonWriter.value(arib);
        }
        if (m2tsSettings.getAribCaptionsPid() != null) {
            String aribCaptionsPid = m2tsSettings.getAribCaptionsPid();
            jsonWriter.name("AribCaptionsPid");
            jsonWriter.value(aribCaptionsPid);
        }
        if (m2tsSettings.getAribCaptionsPidControl() != null) {
            String aribCaptionsPidControl = m2tsSettings.getAribCaptionsPidControl();
            jsonWriter.name("AribCaptionsPidControl");
            jsonWriter.value(aribCaptionsPidControl);
        }
        if (m2tsSettings.getAudioBufferModel() != null) {
            String audioBufferModel = m2tsSettings.getAudioBufferModel();
            jsonWriter.name("AudioBufferModel");
            jsonWriter.value(audioBufferModel);
        }
        if (m2tsSettings.getAudioFramesPerPes() != null) {
            Integer audioFramesPerPes = m2tsSettings.getAudioFramesPerPes();
            jsonWriter.name("AudioFramesPerPes");
            jsonWriter.value(audioFramesPerPes);
        }
        if (m2tsSettings.getAudioPids() != null) {
            String audioPids = m2tsSettings.getAudioPids();
            jsonWriter.name("AudioPids");
            jsonWriter.value(audioPids);
        }
        if (m2tsSettings.getAudioStreamType() != null) {
            String audioStreamType = m2tsSettings.getAudioStreamType();
            jsonWriter.name("AudioStreamType");
            jsonWriter.value(audioStreamType);
        }
        if (m2tsSettings.getBitrate() != null) {
            Integer bitrate = m2tsSettings.getBitrate();
            jsonWriter.name("Bitrate");
            jsonWriter.value(bitrate);
        }
        if (m2tsSettings.getBufferModel() != null) {
            String bufferModel = m2tsSettings.getBufferModel();
            jsonWriter.name("BufferModel");
            jsonWriter.value(bufferModel);
        }
        if (m2tsSettings.getCcDescriptor() != null) {
            String ccDescriptor = m2tsSettings.getCcDescriptor();
            jsonWriter.name("CcDescriptor");
            jsonWriter.value(ccDescriptor);
        }
        if (m2tsSettings.getDvbNitSettings() != null) {
            DvbNitSettings dvbNitSettings = m2tsSettings.getDvbNitSettings();
            jsonWriter.name("DvbNitSettings");
            DvbNitSettingsJsonMarshaller.getInstance().marshall(dvbNitSettings, jsonWriter);
        }
        if (m2tsSettings.getDvbSdtSettings() != null) {
            DvbSdtSettings dvbSdtSettings = m2tsSettings.getDvbSdtSettings();
            jsonWriter.name("DvbSdtSettings");
            DvbSdtSettingsJsonMarshaller.getInstance().marshall(dvbSdtSettings, jsonWriter);
        }
        if (m2tsSettings.getDvbSubPids() != null) {
            String dvbSubPids = m2tsSettings.getDvbSubPids();
            jsonWriter.name("DvbSubPids");
            jsonWriter.value(dvbSubPids);
        }
        if (m2tsSettings.getDvbTdtSettings() != null) {
            DvbTdtSettings dvbTdtSettings = m2tsSettings.getDvbTdtSettings();
            jsonWriter.name("DvbTdtSettings");
            DvbTdtSettingsJsonMarshaller.getInstance().marshall(dvbTdtSettings, jsonWriter);
        }
        if (m2tsSettings.getDvbTeletextPid() != null) {
            String dvbTeletextPid = m2tsSettings.getDvbTeletextPid();
            jsonWriter.name("DvbTeletextPid");
            jsonWriter.value(dvbTeletextPid);
        }
        if (m2tsSettings.getEbif() != null) {
            String ebif = m2tsSettings.getEbif();
            jsonWriter.name("Ebif");
            jsonWriter.value(ebif);
        }
        if (m2tsSettings.getEbpAudioInterval() != null) {
            String ebpAudioInterval = m2tsSettings.getEbpAudioInterval();
            jsonWriter.name("EbpAudioInterval");
            jsonWriter.value(ebpAudioInterval);
        }
        if (m2tsSettings.getEbpLookaheadMs() != null) {
            Integer ebpLookaheadMs = m2tsSettings.getEbpLookaheadMs();
            jsonWriter.name("EbpLookaheadMs");
            jsonWriter.value(ebpLookaheadMs);
        }
        if (m2tsSettings.getEbpPlacement() != null) {
            String ebpPlacement = m2tsSettings.getEbpPlacement();
            jsonWriter.name("EbpPlacement");
            jsonWriter.value(ebpPlacement);
        }
        if (m2tsSettings.getEcmPid() != null) {
            String ecmPid = m2tsSettings.getEcmPid();
            jsonWriter.name("EcmPid");
            jsonWriter.value(ecmPid);
        }
        if (m2tsSettings.getEsRateInPes() != null) {
            String esRateInPes = m2tsSettings.getEsRateInPes();
            jsonWriter.name("EsRateInPes");
            jsonWriter.value(esRateInPes);
        }
        if (m2tsSettings.getEtvPlatformPid() != null) {
            String etvPlatformPid = m2tsSettings.getEtvPlatformPid();
            jsonWriter.name("EtvPlatformPid");
            jsonWriter.value(etvPlatformPid);
        }
        if (m2tsSettings.getEtvSignalPid() != null) {
            String etvSignalPid = m2tsSettings.getEtvSignalPid();
            jsonWriter.name("EtvSignalPid");
            jsonWriter.value(etvSignalPid);
        }
        if (m2tsSettings.getFragmentTime() != null) {
            Double fragmentTime = m2tsSettings.getFragmentTime();
            jsonWriter.name("FragmentTime");
            jsonWriter.value(fragmentTime);
        }
        if (m2tsSettings.getKlv() != null) {
            String klv = m2tsSettings.getKlv();
            jsonWriter.name("Klv");
            jsonWriter.value(klv);
        }
        if (m2tsSettings.getKlvDataPids() != null) {
            String klvDataPids = m2tsSettings.getKlvDataPids();
            jsonWriter.name("KlvDataPids");
            jsonWriter.value(klvDataPids);
        }
        if (m2tsSettings.getNielsenId3Behavior() != null) {
            String nielsenId3Behavior = m2tsSettings.getNielsenId3Behavior();
            jsonWriter.name("NielsenId3Behavior");
            jsonWriter.value(nielsenId3Behavior);
        }
        if (m2tsSettings.getNullPacketBitrate() != null) {
            Double nullPacketBitrate = m2tsSettings.getNullPacketBitrate();
            jsonWriter.name("NullPacketBitrate");
            jsonWriter.value(nullPacketBitrate);
        }
        if (m2tsSettings.getPatInterval() != null) {
            Integer patInterval = m2tsSettings.getPatInterval();
            jsonWriter.name("PatInterval");
            jsonWriter.value(patInterval);
        }
        if (m2tsSettings.getPcrControl() != null) {
            String pcrControl = m2tsSettings.getPcrControl();
            jsonWriter.name("PcrControl");
            jsonWriter.value(pcrControl);
        }
        if (m2tsSettings.getPcrPeriod() != null) {
            Integer pcrPeriod = m2tsSettings.getPcrPeriod();
            jsonWriter.name("PcrPeriod");
            jsonWriter.value(pcrPeriod);
        }
        if (m2tsSettings.getPcrPid() != null) {
            String pcrPid = m2tsSettings.getPcrPid();
            jsonWriter.name("PcrPid");
            jsonWriter.value(pcrPid);
        }
        if (m2tsSettings.getPmtInterval() != null) {
            Integer pmtInterval = m2tsSettings.getPmtInterval();
            jsonWriter.name("PmtInterval");
            jsonWriter.value(pmtInterval);
        }
        if (m2tsSettings.getPmtPid() != null) {
            String pmtPid = m2tsSettings.getPmtPid();
            jsonWriter.name("PmtPid");
            jsonWriter.value(pmtPid);
        }
        if (m2tsSettings.getProgramNum() != null) {
            Integer programNum = m2tsSettings.getProgramNum();
            jsonWriter.name("ProgramNum");
            jsonWriter.value(programNum);
        }
        if (m2tsSettings.getRateMode() != null) {
            String rateMode = m2tsSettings.getRateMode();
            jsonWriter.name("RateMode");
            jsonWriter.value(rateMode);
        }
        if (m2tsSettings.getScte27Pids() != null) {
            String scte27Pids = m2tsSettings.getScte27Pids();
            jsonWriter.name("Scte27Pids");
            jsonWriter.value(scte27Pids);
        }
        if (m2tsSettings.getScte35Control() != null) {
            String scte35Control = m2tsSettings.getScte35Control();
            jsonWriter.name("Scte35Control");
            jsonWriter.value(scte35Control);
        }
        if (m2tsSettings.getScte35Pid() != null) {
            String scte35Pid = m2tsSettings.getScte35Pid();
            jsonWriter.name("Scte35Pid");
            jsonWriter.value(scte35Pid);
        }
        if (m2tsSettings.getSegmentationMarkers() != null) {
            String segmentationMarkers = m2tsSettings.getSegmentationMarkers();
            jsonWriter.name("SegmentationMarkers");
            jsonWriter.value(segmentationMarkers);
        }
        if (m2tsSettings.getSegmentationStyle() != null) {
            String segmentationStyle = m2tsSettings.getSegmentationStyle();
            jsonWriter.name("SegmentationStyle");
            jsonWriter.value(segmentationStyle);
        }
        if (m2tsSettings.getSegmentationTime() != null) {
            Double segmentationTime = m2tsSettings.getSegmentationTime();
            jsonWriter.name("SegmentationTime");
            jsonWriter.value(segmentationTime);
        }
        if (m2tsSettings.getTimedMetadataBehavior() != null) {
            String timedMetadataBehavior = m2tsSettings.getTimedMetadataBehavior();
            jsonWriter.name("TimedMetadataBehavior");
            jsonWriter.value(timedMetadataBehavior);
        }
        if (m2tsSettings.getTimedMetadataPid() != null) {
            String timedMetadataPid = m2tsSettings.getTimedMetadataPid();
            jsonWriter.name("TimedMetadataPid");
            jsonWriter.value(timedMetadataPid);
        }
        if (m2tsSettings.getTransportStreamId() != null) {
            Integer transportStreamId = m2tsSettings.getTransportStreamId();
            jsonWriter.name("TransportStreamId");
            jsonWriter.value(transportStreamId);
        }
        if (m2tsSettings.getVideoPid() != null) {
            String videoPid = m2tsSettings.getVideoPid();
            jsonWriter.name("VideoPid");
            jsonWriter.value(videoPid);
        }
        jsonWriter.endObject();
    }

    private static M2tsSettingsJsonMarshaller instance;

    public static M2tsSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new M2tsSettingsJsonMarshaller();
        return instance;
    }
}
