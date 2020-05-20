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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InputSettings
 */
class InputSettingsJsonUnmarshaller implements Unmarshaller<InputSettings, JsonUnmarshallerContext> {

    public InputSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InputSettings inputSettings = new InputSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AudioSelectors")) {
                inputSettings.setAudioSelectors(new ListUnmarshaller<AudioSelector>(
                        AudioSelectorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CaptionSelectors")) {
                inputSettings.setCaptionSelectors(new ListUnmarshaller<CaptionSelector>(
                        CaptionSelectorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DeblockFilter")) {
                inputSettings.setDeblockFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DenoiseFilter")) {
                inputSettings.setDenoiseFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterStrength")) {
                inputSettings.setFilterStrength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputFilter")) {
                inputSettings.setInputFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NetworkInputSettings")) {
                inputSettings.setNetworkInputSettings(NetworkInputSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Smpte2038DataPreference")) {
                inputSettings.setSmpte2038DataPreference(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SourceEndBehavior")) {
                inputSettings.setSourceEndBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoSelector")) {
                inputSettings.setVideoSelector(VideoSelectorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return inputSettings;
    }

    private static InputSettingsJsonUnmarshaller instance;

    public static InputSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputSettingsJsonUnmarshaller();
        return instance;
    }
}
