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
 * JSON marshaller for POJO HlsSettings
 */
class HlsSettingsJsonMarshaller {

    public void marshall(HlsSettings hlsSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hlsSettings.getAudioGroupId() != null) {
            String audioGroupId = hlsSettings.getAudioGroupId();
            jsonWriter.name("AudioGroupId");
            jsonWriter.value(audioGroupId);
        }
        if (hlsSettings.getAudioOnlyContainer() != null) {
            String audioOnlyContainer = hlsSettings.getAudioOnlyContainer();
            jsonWriter.name("AudioOnlyContainer");
            jsonWriter.value(audioOnlyContainer);
        }
        if (hlsSettings.getAudioRenditionSets() != null) {
            String audioRenditionSets = hlsSettings.getAudioRenditionSets();
            jsonWriter.name("AudioRenditionSets");
            jsonWriter.value(audioRenditionSets);
        }
        if (hlsSettings.getAudioTrackType() != null) {
            String audioTrackType = hlsSettings.getAudioTrackType();
            jsonWriter.name("AudioTrackType");
            jsonWriter.value(audioTrackType);
        }
        if (hlsSettings.getIFrameOnlyManifest() != null) {
            String iFrameOnlyManifest = hlsSettings.getIFrameOnlyManifest();
            jsonWriter.name("IFrameOnlyManifest");
            jsonWriter.value(iFrameOnlyManifest);
        }
        if (hlsSettings.getSegmentModifier() != null) {
            String segmentModifier = hlsSettings.getSegmentModifier();
            jsonWriter.name("SegmentModifier");
            jsonWriter.value(segmentModifier);
        }
        jsonWriter.endObject();
    }

    private static HlsSettingsJsonMarshaller instance;

    public static HlsSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsSettingsJsonMarshaller();
        return instance;
    }
}
