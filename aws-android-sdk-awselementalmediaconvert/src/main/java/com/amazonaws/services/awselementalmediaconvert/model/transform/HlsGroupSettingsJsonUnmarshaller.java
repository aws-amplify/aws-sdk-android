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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HlsGroupSettings
 */
class HlsGroupSettingsJsonUnmarshaller implements
        Unmarshaller<HlsGroupSettings, JsonUnmarshallerContext> {

    public HlsGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HlsGroupSettings hlsGroupSettings = new HlsGroupSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdMarkers")) {
                hlsGroupSettings.setAdMarkers(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AdditionalManifests")) {
                hlsGroupSettings
                        .setAdditionalManifests(new ListUnmarshaller<HlsAdditionalManifest>(
                                HlsAdditionalManifestJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BaseUrl")) {
                hlsGroupSettings.setBaseUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CaptionLanguageMappings")) {
                hlsGroupSettings
                        .setCaptionLanguageMappings(new ListUnmarshaller<HlsCaptionLanguageMapping>(
                                HlsCaptionLanguageMappingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CaptionLanguageSetting")) {
                hlsGroupSettings.setCaptionLanguageSetting(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientCache")) {
                hlsGroupSettings.setClientCache(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecSpecification")) {
                hlsGroupSettings.setCodecSpecification(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destination")) {
                hlsGroupSettings.setDestination(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationSettings")) {
                hlsGroupSettings.setDestinationSettings(DestinationSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DirectoryStructure")) {
                hlsGroupSettings.setDirectoryStructure(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encryption")) {
                hlsGroupSettings.setEncryption(HlsEncryptionSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestCompression")) {
                hlsGroupSettings.setManifestCompression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestDurationFormat")) {
                hlsGroupSettings.setManifestDurationFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinFinalSegmentLength")) {
                hlsGroupSettings.setMinFinalSegmentLength(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinSegmentLength")) {
                hlsGroupSettings.setMinSegmentLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputSelection")) {
                hlsGroupSettings.setOutputSelection(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramDateTime")) {
                hlsGroupSettings.setProgramDateTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramDateTimePeriod")) {
                hlsGroupSettings.setProgramDateTimePeriod(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentControl")) {
                hlsGroupSettings.setSegmentControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentLength")) {
                hlsGroupSettings.setSegmentLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentsPerSubdirectory")) {
                hlsGroupSettings.setSegmentsPerSubdirectory(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamInfResolution")) {
                hlsGroupSettings.setStreamInfResolution(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataId3Frame")) {
                hlsGroupSettings.setTimedMetadataId3Frame(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataId3Period")) {
                hlsGroupSettings.setTimedMetadataId3Period(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimestampDeltaMilliseconds")) {
                hlsGroupSettings.setTimestampDeltaMilliseconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hlsGroupSettings;
    }

    private static HlsGroupSettingsJsonUnmarshaller instance;

    public static HlsGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HlsGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
