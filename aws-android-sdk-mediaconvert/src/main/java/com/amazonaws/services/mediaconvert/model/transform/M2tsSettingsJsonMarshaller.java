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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO M2tsSettings
 */
class M2tsSettingsJsonMarshaller {

    public void marshall(M2tsSettings m2tsSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
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
            java.util.List<Integer> audioPids = m2tsSettings.getAudioPids();
            jsonWriter.name("AudioPids");
            jsonWriter.beginArray();
            for (Integer audioPidsItem : audioPids) {
                if (audioPidsItem != null) {
                    jsonWriter.value(audioPidsItem);
                }
            }
            jsonWriter.endArray();
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
            java.util.List<Integer> dvbSubPids = m2tsSettings.getDvbSubPids();
            jsonWriter.name("DvbSubPids");
            jsonWriter.beginArray();
            for (Integer dvbSubPidsItem : dvbSubPids) {
                if (dvbSubPidsItem != null) {
                    jsonWriter.value(dvbSubPidsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (m2tsSettings.getDvbTdtSettings() != null) {
            DvbTdtSettings dvbTdtSettings = m2tsSettings.getDvbTdtSettings();
            jsonWriter.name("DvbTdtSettings");
            DvbTdtSettingsJsonMarshaller.getInstance().marshall(dvbTdtSettings, jsonWriter);
        }
        if (m2tsSettings.getDvbTeletextPid() != null) {
            Integer dvbTeletextPid = m2tsSettings.getDvbTeletextPid();
            jsonWriter.name("DvbTeletextPid");
            jsonWriter.value(dvbTeletextPid);
        }
        if (m2tsSettings.getEbpAudioInterval() != null) {
            String ebpAudioInterval = m2tsSettings.getEbpAudioInterval();
            jsonWriter.name("EbpAudioInterval");
            jsonWriter.value(ebpAudioInterval);
        }
        if (m2tsSettings.getEbpPlacement() != null) {
            String ebpPlacement = m2tsSettings.getEbpPlacement();
            jsonWriter.name("EbpPlacement");
            jsonWriter.value(ebpPlacement);
        }
        if (m2tsSettings.getEsRateInPes() != null) {
            String esRateInPes = m2tsSettings.getEsRateInPes();
            jsonWriter.name("EsRateInPes");
            jsonWriter.value(esRateInPes);
        }
        if (m2tsSettings.getForceTsVideoEbpOrder() != null) {
            String forceTsVideoEbpOrder = m2tsSettings.getForceTsVideoEbpOrder();
            jsonWriter.name("ForceTsVideoEbpOrder");
            jsonWriter.value(forceTsVideoEbpOrder);
        }
        if (m2tsSettings.getFragmentTime() != null) {
            Double fragmentTime = m2tsSettings.getFragmentTime();
            jsonWriter.name("FragmentTime");
            jsonWriter.value(fragmentTime);
        }
        if (m2tsSettings.getMaxPcrInterval() != null) {
            Integer maxPcrInterval = m2tsSettings.getMaxPcrInterval();
            jsonWriter.name("MaxPcrInterval");
            jsonWriter.value(maxPcrInterval);
        }
        if (m2tsSettings.getMinEbpInterval() != null) {
            Integer minEbpInterval = m2tsSettings.getMinEbpInterval();
            jsonWriter.name("MinEbpInterval");
            jsonWriter.value(minEbpInterval);
        }
        if (m2tsSettings.getNielsenId3() != null) {
            String nielsenId3 = m2tsSettings.getNielsenId3();
            jsonWriter.name("NielsenId3");
            jsonWriter.value(nielsenId3);
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
        if (m2tsSettings.getPcrPid() != null) {
            Integer pcrPid = m2tsSettings.getPcrPid();
            jsonWriter.name("PcrPid");
            jsonWriter.value(pcrPid);
        }
        if (m2tsSettings.getPmtInterval() != null) {
            Integer pmtInterval = m2tsSettings.getPmtInterval();
            jsonWriter.name("PmtInterval");
            jsonWriter.value(pmtInterval);
        }
        if (m2tsSettings.getPmtPid() != null) {
            Integer pmtPid = m2tsSettings.getPmtPid();
            jsonWriter.name("PmtPid");
            jsonWriter.value(pmtPid);
        }
        if (m2tsSettings.getPrivateMetadataPid() != null) {
            Integer privateMetadataPid = m2tsSettings.getPrivateMetadataPid();
            jsonWriter.name("PrivateMetadataPid");
            jsonWriter.value(privateMetadataPid);
        }
        if (m2tsSettings.getProgramNumber() != null) {
            Integer programNumber = m2tsSettings.getProgramNumber();
            jsonWriter.name("ProgramNumber");
            jsonWriter.value(programNumber);
        }
        if (m2tsSettings.getRateMode() != null) {
            String rateMode = m2tsSettings.getRateMode();
            jsonWriter.name("RateMode");
            jsonWriter.value(rateMode);
        }
        if (m2tsSettings.getScte35Esam() != null) {
            M2tsScte35Esam scte35Esam = m2tsSettings.getScte35Esam();
            jsonWriter.name("Scte35Esam");
            M2tsScte35EsamJsonMarshaller.getInstance().marshall(scte35Esam, jsonWriter);
        }
        if (m2tsSettings.getScte35Pid() != null) {
            Integer scte35Pid = m2tsSettings.getScte35Pid();
            jsonWriter.name("Scte35Pid");
            jsonWriter.value(scte35Pid);
        }
        if (m2tsSettings.getScte35Source() != null) {
            String scte35Source = m2tsSettings.getScte35Source();
            jsonWriter.name("Scte35Source");
            jsonWriter.value(scte35Source);
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
        if (m2tsSettings.getTimedMetadataPid() != null) {
            Integer timedMetadataPid = m2tsSettings.getTimedMetadataPid();
            jsonWriter.name("TimedMetadataPid");
            jsonWriter.value(timedMetadataPid);
        }
        if (m2tsSettings.getTransportStreamId() != null) {
            Integer transportStreamId = m2tsSettings.getTransportStreamId();
            jsonWriter.name("TransportStreamId");
            jsonWriter.value(transportStreamId);
        }
        if (m2tsSettings.getVideoPid() != null) {
            Integer videoPid = m2tsSettings.getVideoPid();
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
