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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AudioChannelMapping
 */
class AudioChannelMappingJsonMarshaller {

    public void marshall(AudioChannelMapping audioChannelMapping, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (audioChannelMapping.getInputChannelLevels() != null) {
            java.util.List<InputChannelLevel> inputChannelLevels = audioChannelMapping
                    .getInputChannelLevels();
            jsonWriter.name("InputChannelLevels");
            jsonWriter.beginArray();
            for (InputChannelLevel inputChannelLevelsItem : inputChannelLevels) {
                if (inputChannelLevelsItem != null) {
                    InputChannelLevelJsonMarshaller.getInstance().marshall(inputChannelLevelsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (audioChannelMapping.getOutputChannel() != null) {
            Integer outputChannel = audioChannelMapping.getOutputChannel();
            jsonWriter.name("OutputChannel");
            jsonWriter.value(outputChannel);
        }
        jsonWriter.endObject();
    }

    private static AudioChannelMappingJsonMarshaller instance;

    public static AudioChannelMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioChannelMappingJsonMarshaller();
        return instance;
    }
}
