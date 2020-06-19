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
 * JSON marshaller for POJO HlsGroupSettings
 */
class HlsGroupSettingsJsonMarshaller {

    public void marshall(HlsGroupSettings hlsGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hlsGroupSettings.getAdMarkers() != null) {
            java.util.List<String> adMarkers = hlsGroupSettings.getAdMarkers();
            jsonWriter.name("AdMarkers");
            jsonWriter.beginArray();
            for (String adMarkersItem : adMarkers) {
                if (adMarkersItem != null) {
                    jsonWriter.value(adMarkersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (hlsGroupSettings.getBaseUrlContent() != null) {
            String baseUrlContent = hlsGroupSettings.getBaseUrlContent();
            jsonWriter.name("BaseUrlContent");
            jsonWriter.value(baseUrlContent);
        }
        if (hlsGroupSettings.getBaseUrlContent1() != null) {
            String baseUrlContent1 = hlsGroupSettings.getBaseUrlContent1();
            jsonWriter.name("BaseUrlContent1");
            jsonWriter.value(baseUrlContent1);
        }
        if (hlsGroupSettings.getBaseUrlManifest() != null) {
            String baseUrlManifest = hlsGroupSettings.getBaseUrlManifest();
            jsonWriter.name("BaseUrlManifest");
            jsonWriter.value(baseUrlManifest);
        }
        if (hlsGroupSettings.getBaseUrlManifest1() != null) {
            String baseUrlManifest1 = hlsGroupSettings.getBaseUrlManifest1();
            jsonWriter.name("BaseUrlManifest1");
            jsonWriter.value(baseUrlManifest1);
        }
        if (hlsGroupSettings.getCaptionLanguageMappings() != null) {
            java.util.List<CaptionLanguageMapping> captionLanguageMappings = hlsGroupSettings
                    .getCaptionLanguageMappings();
            jsonWriter.name("CaptionLanguageMappings");
            jsonWriter.beginArray();
            for (CaptionLanguageMapping captionLanguageMappingsItem : captionLanguageMappings) {
                if (captionLanguageMappingsItem != null) {
                    CaptionLanguageMappingJsonMarshaller.getInstance().marshall(
                            captionLanguageMappingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (hlsGroupSettings.getCaptionLanguageSetting() != null) {
            String captionLanguageSetting = hlsGroupSettings.getCaptionLanguageSetting();
            jsonWriter.name("CaptionLanguageSetting");
            jsonWriter.value(captionLanguageSetting);
        }
        if (hlsGroupSettings.getClientCache() != null) {
            String clientCache = hlsGroupSettings.getClientCache();
            jsonWriter.name("ClientCache");
            jsonWriter.value(clientCache);
        }
        if (hlsGroupSettings.getCodecSpecification() != null) {
            String codecSpecification = hlsGroupSettings.getCodecSpecification();
            jsonWriter.name("CodecSpecification");
            jsonWriter.value(codecSpecification);
        }
        if (hlsGroupSettings.getConstantIv() != null) {
            String constantIv = hlsGroupSettings.getConstantIv();
            jsonWriter.name("ConstantIv");
            jsonWriter.value(constantIv);
        }
        if (hlsGroupSettings.getDestination() != null) {
            OutputLocationRef destination = hlsGroupSettings.getDestination();
            jsonWriter.name("Destination");
            OutputLocationRefJsonMarshaller.getInstance().marshall(destination, jsonWriter);
        }
        if (hlsGroupSettings.getDirectoryStructure() != null) {
            String directoryStructure = hlsGroupSettings.getDirectoryStructure();
            jsonWriter.name("DirectoryStructure");
            jsonWriter.value(directoryStructure);
        }
        if (hlsGroupSettings.getEncryptionType() != null) {
            String encryptionType = hlsGroupSettings.getEncryptionType();
            jsonWriter.name("EncryptionType");
            jsonWriter.value(encryptionType);
        }
        if (hlsGroupSettings.getHlsCdnSettings() != null) {
            HlsCdnSettings hlsCdnSettings = hlsGroupSettings.getHlsCdnSettings();
            jsonWriter.name("HlsCdnSettings");
            HlsCdnSettingsJsonMarshaller.getInstance().marshall(hlsCdnSettings, jsonWriter);
        }
        if (hlsGroupSettings.getHlsId3SegmentTagging() != null) {
            String hlsId3SegmentTagging = hlsGroupSettings.getHlsId3SegmentTagging();
            jsonWriter.name("HlsId3SegmentTagging");
            jsonWriter.value(hlsId3SegmentTagging);
        }
        if (hlsGroupSettings.getIFrameOnlyPlaylists() != null) {
            String iFrameOnlyPlaylists = hlsGroupSettings.getIFrameOnlyPlaylists();
            jsonWriter.name("IFrameOnlyPlaylists");
            jsonWriter.value(iFrameOnlyPlaylists);
        }
        if (hlsGroupSettings.getIndexNSegments() != null) {
            Integer indexNSegments = hlsGroupSettings.getIndexNSegments();
            jsonWriter.name("IndexNSegments");
            jsonWriter.value(indexNSegments);
        }
        if (hlsGroupSettings.getInputLossAction() != null) {
            String inputLossAction = hlsGroupSettings.getInputLossAction();
            jsonWriter.name("InputLossAction");
            jsonWriter.value(inputLossAction);
        }
        if (hlsGroupSettings.getIvInManifest() != null) {
            String ivInManifest = hlsGroupSettings.getIvInManifest();
            jsonWriter.name("IvInManifest");
            jsonWriter.value(ivInManifest);
        }
        if (hlsGroupSettings.getIvSource() != null) {
            String ivSource = hlsGroupSettings.getIvSource();
            jsonWriter.name("IvSource");
            jsonWriter.value(ivSource);
        }
        if (hlsGroupSettings.getKeepSegments() != null) {
            Integer keepSegments = hlsGroupSettings.getKeepSegments();
            jsonWriter.name("KeepSegments");
            jsonWriter.value(keepSegments);
        }
        if (hlsGroupSettings.getKeyFormat() != null) {
            String keyFormat = hlsGroupSettings.getKeyFormat();
            jsonWriter.name("KeyFormat");
            jsonWriter.value(keyFormat);
        }
        if (hlsGroupSettings.getKeyFormatVersions() != null) {
            String keyFormatVersions = hlsGroupSettings.getKeyFormatVersions();
            jsonWriter.name("KeyFormatVersions");
            jsonWriter.value(keyFormatVersions);
        }
        if (hlsGroupSettings.getKeyProviderSettings() != null) {
            KeyProviderSettings keyProviderSettings = hlsGroupSettings.getKeyProviderSettings();
            jsonWriter.name("KeyProviderSettings");
            KeyProviderSettingsJsonMarshaller.getInstance().marshall(keyProviderSettings,
                    jsonWriter);
        }
        if (hlsGroupSettings.getManifestCompression() != null) {
            String manifestCompression = hlsGroupSettings.getManifestCompression();
            jsonWriter.name("ManifestCompression");
            jsonWriter.value(manifestCompression);
        }
        if (hlsGroupSettings.getManifestDurationFormat() != null) {
            String manifestDurationFormat = hlsGroupSettings.getManifestDurationFormat();
            jsonWriter.name("ManifestDurationFormat");
            jsonWriter.value(manifestDurationFormat);
        }
        if (hlsGroupSettings.getMinSegmentLength() != null) {
            Integer minSegmentLength = hlsGroupSettings.getMinSegmentLength();
            jsonWriter.name("MinSegmentLength");
            jsonWriter.value(minSegmentLength);
        }
        if (hlsGroupSettings.getMode() != null) {
            String mode = hlsGroupSettings.getMode();
            jsonWriter.name("Mode");
            jsonWriter.value(mode);
        }
        if (hlsGroupSettings.getOutputSelection() != null) {
            String outputSelection = hlsGroupSettings.getOutputSelection();
            jsonWriter.name("OutputSelection");
            jsonWriter.value(outputSelection);
        }
        if (hlsGroupSettings.getProgramDateTime() != null) {
            String programDateTime = hlsGroupSettings.getProgramDateTime();
            jsonWriter.name("ProgramDateTime");
            jsonWriter.value(programDateTime);
        }
        if (hlsGroupSettings.getProgramDateTimePeriod() != null) {
            Integer programDateTimePeriod = hlsGroupSettings.getProgramDateTimePeriod();
            jsonWriter.name("ProgramDateTimePeriod");
            jsonWriter.value(programDateTimePeriod);
        }
        if (hlsGroupSettings.getRedundantManifest() != null) {
            String redundantManifest = hlsGroupSettings.getRedundantManifest();
            jsonWriter.name("RedundantManifest");
            jsonWriter.value(redundantManifest);
        }
        if (hlsGroupSettings.getSegmentLength() != null) {
            Integer segmentLength = hlsGroupSettings.getSegmentLength();
            jsonWriter.name("SegmentLength");
            jsonWriter.value(segmentLength);
        }
        if (hlsGroupSettings.getSegmentationMode() != null) {
            String segmentationMode = hlsGroupSettings.getSegmentationMode();
            jsonWriter.name("SegmentationMode");
            jsonWriter.value(segmentationMode);
        }
        if (hlsGroupSettings.getSegmentsPerSubdirectory() != null) {
            Integer segmentsPerSubdirectory = hlsGroupSettings.getSegmentsPerSubdirectory();
            jsonWriter.name("SegmentsPerSubdirectory");
            jsonWriter.value(segmentsPerSubdirectory);
        }
        if (hlsGroupSettings.getStreamInfResolution() != null) {
            String streamInfResolution = hlsGroupSettings.getStreamInfResolution();
            jsonWriter.name("StreamInfResolution");
            jsonWriter.value(streamInfResolution);
        }
        if (hlsGroupSettings.getTimedMetadataId3Frame() != null) {
            String timedMetadataId3Frame = hlsGroupSettings.getTimedMetadataId3Frame();
            jsonWriter.name("TimedMetadataId3Frame");
            jsonWriter.value(timedMetadataId3Frame);
        }
        if (hlsGroupSettings.getTimedMetadataId3Period() != null) {
            Integer timedMetadataId3Period = hlsGroupSettings.getTimedMetadataId3Period();
            jsonWriter.name("TimedMetadataId3Period");
            jsonWriter.value(timedMetadataId3Period);
        }
        if (hlsGroupSettings.getTimestampDeltaMilliseconds() != null) {
            Integer timestampDeltaMilliseconds = hlsGroupSettings.getTimestampDeltaMilliseconds();
            jsonWriter.name("TimestampDeltaMilliseconds");
            jsonWriter.value(timestampDeltaMilliseconds);
        }
        if (hlsGroupSettings.getTsFileMode() != null) {
            String tsFileMode = hlsGroupSettings.getTsFileMode();
            jsonWriter.name("TsFileMode");
            jsonWriter.value(tsFileMode);
        }
        jsonWriter.endObject();
    }

    private static HlsGroupSettingsJsonMarshaller instance;

    public static HlsGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsGroupSettingsJsonMarshaller();
        return instance;
    }
}
