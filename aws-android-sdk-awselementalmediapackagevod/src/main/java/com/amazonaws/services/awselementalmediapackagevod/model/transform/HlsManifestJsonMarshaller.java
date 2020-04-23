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

package com.amazonaws.services.awselementalmediapackagevod.model.transform;

import com.amazonaws.services.awselementalmediapackagevod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HlsManifest
 */
class HlsManifestJsonMarshaller {

    public void marshall(HlsManifest hlsManifest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hlsManifest.getAdMarkers() != null) {
            String adMarkers = hlsManifest.getAdMarkers();
            jsonWriter.name("AdMarkers");
            jsonWriter.value(adMarkers);
        }
        if (hlsManifest.getIncludeIframeOnlyStream() != null) {
            Boolean includeIframeOnlyStream = hlsManifest.getIncludeIframeOnlyStream();
            jsonWriter.name("IncludeIframeOnlyStream");
            jsonWriter.value(includeIframeOnlyStream);
        }
        if (hlsManifest.getManifestName() != null) {
            String manifestName = hlsManifest.getManifestName();
            jsonWriter.name("ManifestName");
            jsonWriter.value(manifestName);
        }
        if (hlsManifest.getProgramDateTimeIntervalSeconds() != null) {
            Integer programDateTimeIntervalSeconds = hlsManifest
                    .getProgramDateTimeIntervalSeconds();
            jsonWriter.name("ProgramDateTimeIntervalSeconds");
            jsonWriter.value(programDateTimeIntervalSeconds);
        }
        if (hlsManifest.getRepeatExtXKey() != null) {
            Boolean repeatExtXKey = hlsManifest.getRepeatExtXKey();
            jsonWriter.name("RepeatExtXKey");
            jsonWriter.value(repeatExtXKey);
        }
        if (hlsManifest.getStreamSelection() != null) {
            StreamSelection streamSelection = hlsManifest.getStreamSelection();
            jsonWriter.name("StreamSelection");
            StreamSelectionJsonMarshaller.getInstance().marshall(streamSelection, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static HlsManifestJsonMarshaller instance;

    public static HlsManifestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HlsManifestJsonMarshaller();
        return instance;
    }
}
