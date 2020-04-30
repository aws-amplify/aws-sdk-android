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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Input
 */
class InputJsonUnmarshaller implements Unmarshaller<Input, JsonUnmarshallerContext> {

    public Input unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Input input = new Input();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AudioSelectorGroups")) {
                input.setAudioSelectorGroups(new MapUnmarshaller<AudioSelectorGroup>(
                        AudioSelectorGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AudioSelectors")) {
                input.setAudioSelectors(new MapUnmarshaller<AudioSelector>(
                        AudioSelectorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CaptionSelectors")) {
                input.setCaptionSelectors(new MapUnmarshaller<CaptionSelector>(
                        CaptionSelectorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Crop")) {
                input.setCrop(RectangleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeblockFilter")) {
                input.setDeblockFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DecryptionSettings")) {
                input.setDecryptionSettings(InputDecryptionSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DenoiseFilter")) {
                input.setDenoiseFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FileInput")) {
                input.setFileInput(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterEnable")) {
                input.setFilterEnable(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterStrength")) {
                input.setFilterStrength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageInserter")) {
                input.setImageInserter(ImageInserterJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputClippings")) {
                input.setInputClippings(new ListUnmarshaller<InputClipping>(
                        InputClippingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Position")) {
                input.setPosition(RectangleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramNumber")) {
                input.setProgramNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PsiControl")) {
                input.setPsiControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SupplementalImps")) {
                input.setSupplementalImps(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TimecodeSource")) {
                input.setTimecodeSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimecodeStart")) {
                input.setTimecodeStart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoSelector")) {
                input.setVideoSelector(VideoSelectorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return input;
    }

    private static InputJsonUnmarshaller instance;

    public static InputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputJsonUnmarshaller();
        return instance;
    }
}
