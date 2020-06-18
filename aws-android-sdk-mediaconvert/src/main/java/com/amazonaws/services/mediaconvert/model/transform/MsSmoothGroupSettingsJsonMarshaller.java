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
 * JSON marshaller for POJO MsSmoothGroupSettings
 */
class MsSmoothGroupSettingsJsonMarshaller {

    public void marshall(MsSmoothGroupSettings msSmoothGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (msSmoothGroupSettings.getAdditionalManifests() != null) {
            java.util.List<MsSmoothAdditionalManifest> additionalManifests = msSmoothGroupSettings
                    .getAdditionalManifests();
            jsonWriter.name("AdditionalManifests");
            jsonWriter.beginArray();
            for (MsSmoothAdditionalManifest additionalManifestsItem : additionalManifests) {
                if (additionalManifestsItem != null) {
                    MsSmoothAdditionalManifestJsonMarshaller.getInstance().marshall(
                            additionalManifestsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (msSmoothGroupSettings.getAudioDeduplication() != null) {
            String audioDeduplication = msSmoothGroupSettings.getAudioDeduplication();
            jsonWriter.name("AudioDeduplication");
            jsonWriter.value(audioDeduplication);
        }
        if (msSmoothGroupSettings.getDestination() != null) {
            String destination = msSmoothGroupSettings.getDestination();
            jsonWriter.name("Destination");
            jsonWriter.value(destination);
        }
        if (msSmoothGroupSettings.getDestinationSettings() != null) {
            DestinationSettings destinationSettings = msSmoothGroupSettings
                    .getDestinationSettings();
            jsonWriter.name("DestinationSettings");
            DestinationSettingsJsonMarshaller.getInstance().marshall(destinationSettings,
                    jsonWriter);
        }
        if (msSmoothGroupSettings.getEncryption() != null) {
            MsSmoothEncryptionSettings encryption = msSmoothGroupSettings.getEncryption();
            jsonWriter.name("Encryption");
            MsSmoothEncryptionSettingsJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (msSmoothGroupSettings.getFragmentLength() != null) {
            Integer fragmentLength = msSmoothGroupSettings.getFragmentLength();
            jsonWriter.name("FragmentLength");
            jsonWriter.value(fragmentLength);
        }
        if (msSmoothGroupSettings.getManifestEncoding() != null) {
            String manifestEncoding = msSmoothGroupSettings.getManifestEncoding();
            jsonWriter.name("ManifestEncoding");
            jsonWriter.value(manifestEncoding);
        }
        jsonWriter.endObject();
    }

    private static MsSmoothGroupSettingsJsonMarshaller instance;

    public static MsSmoothGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MsSmoothGroupSettingsJsonMarshaller();
        return instance;
    }
}
