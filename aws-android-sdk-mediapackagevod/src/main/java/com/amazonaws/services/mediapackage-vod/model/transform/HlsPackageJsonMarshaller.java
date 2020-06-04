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
package com.amazonaws.services.mediapackage-vod.model.transform;

import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HlsPackage
 */
class HlsPackageJsonMarshaller {

    public void marshall(HlsPackage hlsPackage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hlsPackage.getEncryption() != null) {
            HlsEncryption encryption = hlsPackage.getEncryption();
            jsonWriter.name("Encryption");
            HlsEncryptionJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (hlsPackage.getHlsManifests() != null) {
            java.util.List<HlsManifest> hlsManifests = hlsPackage.getHlsManifests();
            jsonWriter.name("HlsManifests");
            jsonWriter.beginArray();
            for (HlsManifest hlsManifestsItem : hlsManifests) {
                if (hlsManifestsItem != null) {
            HlsManifestJsonMarshaller.getInstance().marshall(hlsManifestsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (hlsPackage.getSegmentDurationSeconds() != null) {
            Integer segmentDurationSeconds = hlsPackage.getSegmentDurationSeconds();
            jsonWriter.name("SegmentDurationSeconds");
            jsonWriter.value(segmentDurationSeconds);
        }
        if (hlsPackage.getUseAudioRenditionGroup() != null) {
            Boolean useAudioRenditionGroup = hlsPackage.getUseAudioRenditionGroup();
            jsonWriter.name("UseAudioRenditionGroup");
            jsonWriter.value(useAudioRenditionGroup);
        }
        jsonWriter.endObject();
    }

    private static HlsPackageJsonMarshaller instance;
    public static HlsPackageJsonMarshaller getInstance() {
        if (instance == null) instance = new HlsPackageJsonMarshaller();
        return instance;
    }
}
