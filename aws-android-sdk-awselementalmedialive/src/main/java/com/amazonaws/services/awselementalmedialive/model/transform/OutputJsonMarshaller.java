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
 * JSON marshaller for POJO Output
 */
class OutputJsonMarshaller {

    public void marshall(Output output, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (output.getAudioDescriptionNames() != null) {
            java.util.List<String> audioDescriptionNames = output.getAudioDescriptionNames();
            jsonWriter.name("AudioDescriptionNames");
            jsonWriter.beginArray();
            for (String audioDescriptionNamesItem : audioDescriptionNames) {
                if (audioDescriptionNamesItem != null) {
                    jsonWriter.value(audioDescriptionNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (output.getCaptionDescriptionNames() != null) {
            java.util.List<String> captionDescriptionNames = output.getCaptionDescriptionNames();
            jsonWriter.name("CaptionDescriptionNames");
            jsonWriter.beginArray();
            for (String captionDescriptionNamesItem : captionDescriptionNames) {
                if (captionDescriptionNamesItem != null) {
                    jsonWriter.value(captionDescriptionNamesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (output.getOutputName() != null) {
            String outputName = output.getOutputName();
            jsonWriter.name("OutputName");
            jsonWriter.value(outputName);
        }
        if (output.getOutputSettings() != null) {
            OutputSettings outputSettings = output.getOutputSettings();
            jsonWriter.name("OutputSettings");
            OutputSettingsJsonMarshaller.getInstance().marshall(outputSettings, jsonWriter);
        }
        if (output.getVideoDescriptionName() != null) {
            String videoDescriptionName = output.getVideoDescriptionName();
            jsonWriter.name("VideoDescriptionName");
            jsonWriter.value(videoDescriptionName);
        }
        jsonWriter.endObject();
    }

    private static OutputJsonMarshaller instance;

    public static OutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputJsonMarshaller();
        return instance;
    }
}
