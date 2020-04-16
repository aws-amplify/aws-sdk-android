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
        if (hlsGroupSettings.getAdditionalManifests() != null) {
            java.util.List<HlsAdditionalManifest> additionalManifests = hlsGroupSettings
                    .getAdditionalManifests();
            jsonWriter.name("AdditionalManifests");
            jsonWriter.beginArray();
            for (HlsAdditionalManifest additionalManifestsItem : additionalManifests) {
                if (additionalManifestsItem != null) {
                    HlsAdditionalManifestJsonMarshaller.getInstance().marshall(
                            additionalManifestsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (hlsGroupSettings.getBaseUrl() != null) {
            String baseUrl = hlsGroupSettings.getBaseUrl();
            jsonWriter.name("BaseUrl");
            jsonWriter.value(baseUrl);
        }
        if (hlsGroupSettings.getCaptionLanguageMappings() != null) {
            java.util.List<HlsCaptionLanguageMapping> captionLanguageMappings = hlsGroupSettings
                    .getCaptionLanguageMappings();
            jsonWriter.name("CaptionLanguageMappings");
            jsonWriter.beginArray();
            for (HlsCaptionLanguageMapping captionLanguageMappingsItem : captionLanguageMappings) {
                if (captionLanguageMappingsItem != null) {
                    HlsCaptionLanguageMappingJsonMarshaller.getInstance().marshall(
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
        if (hlsGroupSettings.getDestination() != null) {
            String destination = hlsGroupSettings.getDestination();
            jsonWriter.name("Destination");
            jsonWriter.value(destination);
        }
        if (hlsGroupSettings.getDestinationSettings() != null) {
            DestinationSettings destinationSettings = hlsGroupSettings.getDestinationSettings();
            jsonWriter.name("DestinationSettings");
            DestinationSettingsJsonMarshaller.getInstance().marshall(destinationSettings,
                    jsonWriter);
        }
        if (hlsGroupSettings.getDirectoryStructure() != null) {
            String directoryStructure = hlsGroupSettings.getDirectoryStructure();
            jsonWriter.name("DirectoryStructure");
            jsonWriter.value(directoryStructure);
        }
        if (hlsGroupSettings.getEncryption() != null) {
            HlsEncryptionSettings encryption = hlsGroupSettings.getEncryption();
            jsonWriter.name("Encryption");
            HlsEncryptionSettingsJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
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
        if (hlsGroupSettings.getMinFinalSegmentLength() != null) {
            Double minFinalSegmentLength = hlsGroupSettings.getMinFinalSegmentLength();
            jsonWriter.name("MinFinalSegmentLength");
            jsonWriter.value(minFinalSegmentLength);
        }
        if (hlsGroupSettings.getMinSegmentLength() != null) {
            Integer minSegmentLength = hlsGroupSettings.getMinSegmentLength();
            jsonWriter.name("MinSegmentLength");
            jsonWriter.value(minSegmentLength);
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
        if (hlsGroupSettings.getSegmentControl() != null) {
            String segmentControl = hlsGroupSettings.getSegmentControl();
            jsonWriter.name("SegmentControl");
            jsonWriter.value(segmentControl);
        }
        if (hlsGroupSettings.getSegmentLength() != null) {
            Integer segmentLength = hlsGroupSettings.getSegmentLength();
            jsonWriter.name("SegmentLength");
            jsonWriter.value(segmentLength);
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
        jsonWriter.endObject();
    }

    private static HlsGroupSettingsJsonMarshaller instance;

    public static HlsGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsGroupSettingsJsonMarshaller();
        return instance;
    }
}
