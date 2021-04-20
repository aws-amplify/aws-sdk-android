/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AudioMetadata
 */
class AudioMetadataJsonMarshaller {

    public void marshall(AudioMetadata audioMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (audioMetadata.getCodec() != null) {
            String codec = audioMetadata.getCodec();
            jsonWriter.name("Codec");
            jsonWriter.value(codec);
        }
        if (audioMetadata.getDurationMillis() != null) {
            Long durationMillis = audioMetadata.getDurationMillis();
            jsonWriter.name("DurationMillis");
            jsonWriter.value(durationMillis);
        }
        if (audioMetadata.getSampleRate() != null) {
            Long sampleRate = audioMetadata.getSampleRate();
            jsonWriter.name("SampleRate");
            jsonWriter.value(sampleRate);
        }
        if (audioMetadata.getNumberOfChannels() != null) {
            Long numberOfChannels = audioMetadata.getNumberOfChannels();
            jsonWriter.name("NumberOfChannels");
            jsonWriter.value(numberOfChannels);
        }
        jsonWriter.endObject();
    }

    private static AudioMetadataJsonMarshaller instance;

    public static AudioMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioMetadataJsonMarshaller();
        return instance;
    }
}
