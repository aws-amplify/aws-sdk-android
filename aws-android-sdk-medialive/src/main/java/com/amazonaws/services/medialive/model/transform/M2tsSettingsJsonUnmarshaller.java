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
 * JSON unmarshaller for POJO M2tsSettings
 */
class M2tsSettingsJsonUnmarshaller implements Unmarshaller<M2tsSettings, JsonUnmarshallerContext> {

    public M2tsSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        M2tsSettings m2tsSettings = new M2tsSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AbsentInputAudioBehavior")) {
                m2tsSettings.setAbsentInputAudioBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arib")) {
                m2tsSettings.setArib(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AribCaptionsPid")) {
                m2tsSettings.setAribCaptionsPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AribCaptionsPidControl")) {
                m2tsSettings.setAribCaptionsPidControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AudioBufferModel")) {
                m2tsSettings.setAudioBufferModel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AudioFramesPerPes")) {
                m2tsSettings.setAudioFramesPerPes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AudioPids")) {
                m2tsSettings.setAudioPids(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AudioStreamType")) {
                m2tsSettings.setAudioStreamType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bitrate")) {
                m2tsSettings.setBitrate(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BufferModel")) {
                m2tsSettings.setBufferModel(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CcDescriptor")) {
                m2tsSettings.setCcDescriptor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DvbNitSettings")) {
                m2tsSettings.setDvbNitSettings(DvbNitSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DvbSdtSettings")) {
                m2tsSettings.setDvbSdtSettings(DvbSdtSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DvbSubPids")) {
                m2tsSettings.setDvbSubPids(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DvbTdtSettings")) {
                m2tsSettings.setDvbTdtSettings(DvbTdtSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DvbTeletextPid")) {
                m2tsSettings.setDvbTeletextPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ebif")) {
                m2tsSettings.setEbif(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbpAudioInterval")) {
                m2tsSettings.setEbpAudioInterval(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbpLookaheadMs")) {
                m2tsSettings.setEbpLookaheadMs(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EbpPlacement")) {
                m2tsSettings.setEbpPlacement(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EcmPid")) {
                m2tsSettings.setEcmPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EsRateInPes")) {
                m2tsSettings.setEsRateInPes(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EtvPlatformPid")) {
                m2tsSettings.setEtvPlatformPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EtvSignalPid")) {
                m2tsSettings.setEtvSignalPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FragmentTime")) {
                m2tsSettings.setFragmentTime(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Klv")) {
                m2tsSettings.setKlv(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KlvDataPids")) {
                m2tsSettings.setKlvDataPids(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NielsenId3Behavior")) {
                m2tsSettings.setNielsenId3Behavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NullPacketBitrate")) {
                m2tsSettings.setNullPacketBitrate(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PatInterval")) {
                m2tsSettings.setPatInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PcrControl")) {
                m2tsSettings.setPcrControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PcrPeriod")) {
                m2tsSettings.setPcrPeriod(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PcrPid")) {
                m2tsSettings.setPcrPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PmtInterval")) {
                m2tsSettings.setPmtInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PmtPid")) {
                m2tsSettings.setPmtPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramNum")) {
                m2tsSettings.setProgramNum(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RateMode")) {
                m2tsSettings.setRateMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scte27Pids")) {
                m2tsSettings.setScte27Pids(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scte35Control")) {
                m2tsSettings.setScte35Control(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scte35Pid")) {
                m2tsSettings.setScte35Pid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationMarkers")) {
                m2tsSettings.setSegmentationMarkers(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationStyle")) {
                m2tsSettings.setSegmentationStyle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationTime")) {
                m2tsSettings.setSegmentationTime(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataBehavior")) {
                m2tsSettings.setTimedMetadataBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataPid")) {
                m2tsSettings.setTimedMetadataPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransportStreamId")) {
                m2tsSettings.setTransportStreamId(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoPid")) {
                m2tsSettings.setVideoPid(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return m2tsSettings;
    }

    private static M2tsSettingsJsonUnmarshaller instance;

    public static M2tsSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new M2tsSettingsJsonUnmarshaller();
        return instance;
    }
}
