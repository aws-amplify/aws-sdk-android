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
 * JSON marshaller for POJO CmafGroupSettings
 */
class CmafGroupSettingsJsonMarshaller {

    public void marshall(CmafGroupSettings cmafGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cmafGroupSettings.getAdditionalManifests() != null) {
            java.util.List<CmafAdditionalManifest> additionalManifests = cmafGroupSettings
                    .getAdditionalManifests();
            jsonWriter.name("AdditionalManifests");
            jsonWriter.beginArray();
            for (CmafAdditionalManifest additionalManifestsItem : additionalManifests) {
                if (additionalManifestsItem != null) {
                    CmafAdditionalManifestJsonMarshaller.getInstance().marshall(
                            additionalManifestsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (cmafGroupSettings.getBaseUrl() != null) {
            String baseUrl = cmafGroupSettings.getBaseUrl();
            jsonWriter.name("BaseUrl");
            jsonWriter.value(baseUrl);
        }
        if (cmafGroupSettings.getClientCache() != null) {
            String clientCache = cmafGroupSettings.getClientCache();
            jsonWriter.name("ClientCache");
            jsonWriter.value(clientCache);
        }
        if (cmafGroupSettings.getCodecSpecification() != null) {
            String codecSpecification = cmafGroupSettings.getCodecSpecification();
            jsonWriter.name("CodecSpecification");
            jsonWriter.value(codecSpecification);
        }
        if (cmafGroupSettings.getDestination() != null) {
            String destination = cmafGroupSettings.getDestination();
            jsonWriter.name("Destination");
            jsonWriter.value(destination);
        }
        if (cmafGroupSettings.getDestinationSettings() != null) {
            DestinationSettings destinationSettings = cmafGroupSettings.getDestinationSettings();
            jsonWriter.name("DestinationSettings");
            DestinationSettingsJsonMarshaller.getInstance().marshall(destinationSettings,
                    jsonWriter);
        }
        if (cmafGroupSettings.getEncryption() != null) {
            CmafEncryptionSettings encryption = cmafGroupSettings.getEncryption();
            jsonWriter.name("Encryption");
            CmafEncryptionSettingsJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (cmafGroupSettings.getFragmentLength() != null) {
            Integer fragmentLength = cmafGroupSettings.getFragmentLength();
            jsonWriter.name("FragmentLength");
            jsonWriter.value(fragmentLength);
        }
        if (cmafGroupSettings.getManifestCompression() != null) {
            String manifestCompression = cmafGroupSettings.getManifestCompression();
            jsonWriter.name("ManifestCompression");
            jsonWriter.value(manifestCompression);
        }
        if (cmafGroupSettings.getManifestDurationFormat() != null) {
            String manifestDurationFormat = cmafGroupSettings.getManifestDurationFormat();
            jsonWriter.name("ManifestDurationFormat");
            jsonWriter.value(manifestDurationFormat);
        }
        if (cmafGroupSettings.getMinBufferTime() != null) {
            Integer minBufferTime = cmafGroupSettings.getMinBufferTime();
            jsonWriter.name("MinBufferTime");
            jsonWriter.value(minBufferTime);
        }
        if (cmafGroupSettings.getMinFinalSegmentLength() != null) {
            Double minFinalSegmentLength = cmafGroupSettings.getMinFinalSegmentLength();
            jsonWriter.name("MinFinalSegmentLength");
            jsonWriter.value(minFinalSegmentLength);
        }
        if (cmafGroupSettings.getMpdProfile() != null) {
            String mpdProfile = cmafGroupSettings.getMpdProfile();
            jsonWriter.name("MpdProfile");
            jsonWriter.value(mpdProfile);
        }
        if (cmafGroupSettings.getSegmentControl() != null) {
            String segmentControl = cmafGroupSettings.getSegmentControl();
            jsonWriter.name("SegmentControl");
            jsonWriter.value(segmentControl);
        }
        if (cmafGroupSettings.getSegmentLength() != null) {
            Integer segmentLength = cmafGroupSettings.getSegmentLength();
            jsonWriter.name("SegmentLength");
            jsonWriter.value(segmentLength);
        }
        if (cmafGroupSettings.getStreamInfResolution() != null) {
            String streamInfResolution = cmafGroupSettings.getStreamInfResolution();
            jsonWriter.name("StreamInfResolution");
            jsonWriter.value(streamInfResolution);
        }
        if (cmafGroupSettings.getWriteDashManifest() != null) {
            String writeDashManifest = cmafGroupSettings.getWriteDashManifest();
            jsonWriter.name("WriteDashManifest");
            jsonWriter.value(writeDashManifest);
        }
        if (cmafGroupSettings.getWriteHlsManifest() != null) {
            String writeHlsManifest = cmafGroupSettings.getWriteHlsManifest();
            jsonWriter.name("WriteHlsManifest");
            jsonWriter.value(writeHlsManifest);
        }
        if (cmafGroupSettings.getWriteSegmentTimelineInRepresentation() != null) {
            String writeSegmentTimelineInRepresentation = cmafGroupSettings
                    .getWriteSegmentTimelineInRepresentation();
            jsonWriter.name("WriteSegmentTimelineInRepresentation");
            jsonWriter.value(writeSegmentTimelineInRepresentation);
        }
        jsonWriter.endObject();
    }

    private static CmafGroupSettingsJsonMarshaller instance;

    public static CmafGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CmafGroupSettingsJsonMarshaller();
        return instance;
    }
}
