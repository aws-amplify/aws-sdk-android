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

package com.amazonaws.services.amazontranscribestreamingservice.model.transform;

import com.amazonaws.services.amazontranscribestreamingservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AudioStream
 */
class AudioStreamJsonMarshaller {

    public void marshall(AudioStream audioStream, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (audioStream.getAudioEvent() != null) {
            AudioEvent audioEvent = audioStream.getAudioEvent();
            jsonWriter.name("AudioEvent");
            AudioEventJsonMarshaller.getInstance().marshall(audioEvent, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AudioStreamJsonMarshaller instance;

    public static AudioStreamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioStreamJsonMarshaller();
        return instance;
    }
}
