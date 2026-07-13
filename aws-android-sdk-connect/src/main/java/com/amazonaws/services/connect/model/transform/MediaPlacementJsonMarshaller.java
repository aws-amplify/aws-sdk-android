/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MediaPlacement
 */
class MediaPlacementJsonMarshaller {

    public void marshall(MediaPlacement mediaPlacement, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mediaPlacement.getAudioHostUrl() != null) {
            String audioHostUrl = mediaPlacement.getAudioHostUrl();
            jsonWriter.name("AudioHostUrl");
            jsonWriter.value(audioHostUrl);
        }
        if (mediaPlacement.getAudioFallbackUrl() != null) {
            String audioFallbackUrl = mediaPlacement.getAudioFallbackUrl();
            jsonWriter.name("AudioFallbackUrl");
            jsonWriter.value(audioFallbackUrl);
        }
        if (mediaPlacement.getSignalingUrl() != null) {
            String signalingUrl = mediaPlacement.getSignalingUrl();
            jsonWriter.name("SignalingUrl");
            jsonWriter.value(signalingUrl);
        }
        if (mediaPlacement.getTurnControlUrl() != null) {
            String turnControlUrl = mediaPlacement.getTurnControlUrl();
            jsonWriter.name("TurnControlUrl");
            jsonWriter.value(turnControlUrl);
        }
        if (mediaPlacement.getEventIngestionUrl() != null) {
            String eventIngestionUrl = mediaPlacement.getEventIngestionUrl();
            jsonWriter.name("EventIngestionUrl");
            jsonWriter.value(eventIngestionUrl);
        }
        jsonWriter.endObject();
    }

    private static MediaPlacementJsonMarshaller instance;

    public static MediaPlacementJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MediaPlacementJsonMarshaller();
        return instance;
    }
}
