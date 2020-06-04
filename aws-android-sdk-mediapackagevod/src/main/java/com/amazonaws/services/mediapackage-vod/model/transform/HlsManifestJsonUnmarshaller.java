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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO HlsManifest
 */
class HlsManifestJsonUnmarshaller implements Unmarshaller<HlsManifest, JsonUnmarshallerContext> {

    public HlsManifest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HlsManifest hlsManifest = new HlsManifest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdMarkers")) {
                hlsManifest.setAdMarkers(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("IncludeIframeOnlyStream")) {
                hlsManifest.setIncludeIframeOnlyStream(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ManifestName")) {
                hlsManifest.setManifestName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ProgramDateTimeIntervalSeconds")) {
                hlsManifest.setProgramDateTimeIntervalSeconds(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RepeatExtXKey")) {
                hlsManifest.setRepeatExtXKey(BooleanJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StreamSelection")) {
                hlsManifest.setStreamSelection(StreamSelectionJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hlsManifest;
    }

    private static HlsManifestJsonUnmarshaller instance;
    public static HlsManifestJsonUnmarshaller getInstance() {
        if (instance == null) instance = new HlsManifestJsonUnmarshaller();
        return instance;
    }
}
