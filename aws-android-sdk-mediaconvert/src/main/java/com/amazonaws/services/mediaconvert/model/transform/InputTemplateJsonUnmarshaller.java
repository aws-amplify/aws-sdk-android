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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InputTemplate
 */
class InputTemplateJsonUnmarshaller implements Unmarshaller<InputTemplate, JsonUnmarshallerContext> {

    public InputTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InputTemplate inputTemplate = new InputTemplate();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AudioSelectorGroups")) {
                inputTemplate.setAudioSelectorGroups(new MapUnmarshaller<AudioSelectorGroup>(
                        AudioSelectorGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AudioSelectors")) {
                inputTemplate.setAudioSelectors(new MapUnmarshaller<AudioSelector>(
                        AudioSelectorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CaptionSelectors")) {
                inputTemplate.setCaptionSelectors(new MapUnmarshaller<CaptionSelector>(
                        CaptionSelectorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Crop")) {
                inputTemplate.setCrop(RectangleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeblockFilter")) {
                inputTemplate.setDeblockFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DenoiseFilter")) {
                inputTemplate.setDenoiseFilter(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterEnable")) {
                inputTemplate.setFilterEnable(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilterStrength")) {
                inputTemplate.setFilterStrength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImageInserter")) {
                inputTemplate.setImageInserter(ImageInserterJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputClippings")) {
                inputTemplate.setInputClippings(new ListUnmarshaller<InputClipping>(
                        InputClippingJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Position")) {
                inputTemplate.setPosition(RectangleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramNumber")) {
                inputTemplate.setProgramNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PsiControl")) {
                inputTemplate.setPsiControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimecodeSource")) {
                inputTemplate.setTimecodeSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimecodeStart")) {
                inputTemplate.setTimecodeStart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoSelector")) {
                inputTemplate.setVideoSelector(VideoSelectorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return inputTemplate;
    }

    private static InputTemplateJsonUnmarshaller instance;

    public static InputTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputTemplateJsonUnmarshaller();
        return instance;
    }
}
