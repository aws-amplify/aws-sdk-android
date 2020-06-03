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
 * JSON marshaller for POJO DashIsoGroupSettings
 */
class DashIsoGroupSettingsJsonMarshaller {

    public void marshall(DashIsoGroupSettings dashIsoGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dashIsoGroupSettings.getAdditionalManifests() != null) {
            java.util.List<DashAdditionalManifest> additionalManifests = dashIsoGroupSettings
                    .getAdditionalManifests();
            jsonWriter.name("AdditionalManifests");
            jsonWriter.beginArray();
            for (DashAdditionalManifest additionalManifestsItem : additionalManifests) {
                if (additionalManifestsItem != null) {
                    DashAdditionalManifestJsonMarshaller.getInstance().marshall(
                            additionalManifestsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (dashIsoGroupSettings.getBaseUrl() != null) {
            String baseUrl = dashIsoGroupSettings.getBaseUrl();
            jsonWriter.name("BaseUrl");
            jsonWriter.value(baseUrl);
        }
        if (dashIsoGroupSettings.getDestination() != null) {
            String destination = dashIsoGroupSettings.getDestination();
            jsonWriter.name("Destination");
            jsonWriter.value(destination);
        }
        if (dashIsoGroupSettings.getDestinationSettings() != null) {
            DestinationSettings destinationSettings = dashIsoGroupSettings.getDestinationSettings();
            jsonWriter.name("DestinationSettings");
            DestinationSettingsJsonMarshaller.getInstance().marshall(destinationSettings,
                    jsonWriter);
        }
        if (dashIsoGroupSettings.getEncryption() != null) {
            DashIsoEncryptionSettings encryption = dashIsoGroupSettings.getEncryption();
            jsonWriter.name("Encryption");
            DashIsoEncryptionSettingsJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (dashIsoGroupSettings.getFragmentLength() != null) {
            Integer fragmentLength = dashIsoGroupSettings.getFragmentLength();
            jsonWriter.name("FragmentLength");
            jsonWriter.value(fragmentLength);
        }
        if (dashIsoGroupSettings.getHbbtvCompliance() != null) {
            String hbbtvCompliance = dashIsoGroupSettings.getHbbtvCompliance();
            jsonWriter.name("HbbtvCompliance");
            jsonWriter.value(hbbtvCompliance);
        }
        if (dashIsoGroupSettings.getMinBufferTime() != null) {
            Integer minBufferTime = dashIsoGroupSettings.getMinBufferTime();
            jsonWriter.name("MinBufferTime");
            jsonWriter.value(minBufferTime);
        }
        if (dashIsoGroupSettings.getMpdProfile() != null) {
            String mpdProfile = dashIsoGroupSettings.getMpdProfile();
            jsonWriter.name("MpdProfile");
            jsonWriter.value(mpdProfile);
        }
        if (dashIsoGroupSettings.getSegmentControl() != null) {
            String segmentControl = dashIsoGroupSettings.getSegmentControl();
            jsonWriter.name("SegmentControl");
            jsonWriter.value(segmentControl);
        }
        if (dashIsoGroupSettings.getSegmentLength() != null) {
            Integer segmentLength = dashIsoGroupSettings.getSegmentLength();
            jsonWriter.name("SegmentLength");
            jsonWriter.value(segmentLength);
        }
        if (dashIsoGroupSettings.getWriteSegmentTimelineInRepresentation() != null) {
            String writeSegmentTimelineInRepresentation = dashIsoGroupSettings
                    .getWriteSegmentTimelineInRepresentation();
            jsonWriter.name("WriteSegmentTimelineInRepresentation");
            jsonWriter.value(writeSegmentTimelineInRepresentation);
        }
        jsonWriter.endObject();
    }

    private static DashIsoGroupSettingsJsonMarshaller instance;

    public static DashIsoGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DashIsoGroupSettingsJsonMarshaller();
        return instance;
    }
}
