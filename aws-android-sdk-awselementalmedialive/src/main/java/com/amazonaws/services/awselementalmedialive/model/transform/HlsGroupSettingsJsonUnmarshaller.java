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
            } else if (name.equals("BaseUrlContent")) {
                hlsGroupSettings.setBaseUrlContent(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BaseUrlContent1")) {
                hlsGroupSettings.setBaseUrlContent1(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BaseUrlManifest")) {
                hlsGroupSettings.setBaseUrlManifest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BaseUrlManifest1")) {
                hlsGroupSettings.setBaseUrlManifest1(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CaptionLanguageMappings")) {
                hlsGroupSettings
                        .setCaptionLanguageMappings(new ListUnmarshaller<CaptionLanguageMapping>(
                                CaptionLanguageMappingJsonUnmarshaller.getInstance()
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
            } else if (name.equals("ConstantIv")) {
                hlsGroupSettings.setConstantIv(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destination")) {
                hlsGroupSettings.setDestination(OutputLocationRefJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DirectoryStructure")) {
                hlsGroupSettings.setDirectoryStructure(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EncryptionType")) {
                hlsGroupSettings.setEncryptionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HlsCdnSettings")) {
                hlsGroupSettings.setHlsCdnSettings(HlsCdnSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HlsId3SegmentTagging")) {
                hlsGroupSettings.setHlsId3SegmentTagging(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IFrameOnlyPlaylists")) {
                hlsGroupSettings.setIFrameOnlyPlaylists(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IndexNSegments")) {
                hlsGroupSettings.setIndexNSegments(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputLossAction")) {
                hlsGroupSettings.setInputLossAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IvInManifest")) {
                hlsGroupSettings.setIvInManifest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IvSource")) {
                hlsGroupSettings.setIvSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeepSegments")) {
                hlsGroupSettings.setKeepSegments(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyFormat")) {
                hlsGroupSettings.setKeyFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyFormatVersions")) {
                hlsGroupSettings.setKeyFormatVersions(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KeyProviderSettings")) {
                hlsGroupSettings.setKeyProviderSettings(KeyProviderSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestCompression")) {
                hlsGroupSettings.setManifestCompression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestDurationFormat")) {
                hlsGroupSettings.setManifestDurationFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinSegmentLength")) {
                hlsGroupSettings.setMinSegmentLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mode")) {
                hlsGroupSettings.setMode(StringJsonUnmarshaller.getInstance()
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
            } else if (name.equals("RedundantManifest")) {
                hlsGroupSettings.setRedundantManifest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentLength")) {
                hlsGroupSettings.setSegmentLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationMode")) {
                hlsGroupSettings.setSegmentationMode(StringJsonUnmarshaller.getInstance()
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
            } else if (name.equals("TsFileMode")) {
                hlsGroupSettings.setTsFileMode(StringJsonUnmarshaller.getInstance()
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
