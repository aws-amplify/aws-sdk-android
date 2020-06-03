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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InputTemplate
 */
class InputTemplateJsonMarshaller {

    public void marshall(InputTemplate inputTemplate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inputTemplate.getAudioSelectorGroups() != null) {
            java.util.Map<String, AudioSelectorGroup> audioSelectorGroups = inputTemplate
                    .getAudioSelectorGroups();
            jsonWriter.name("AudioSelectorGroups");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AudioSelectorGroup> audioSelectorGroupsEntry : audioSelectorGroups
                    .entrySet()) {
                AudioSelectorGroup audioSelectorGroupsValue = audioSelectorGroupsEntry.getValue();
                if (audioSelectorGroupsValue != null) {
                    jsonWriter.name(audioSelectorGroupsEntry.getKey());
                    AudioSelectorGroupJsonMarshaller.getInstance().marshall(
                            audioSelectorGroupsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (inputTemplate.getAudioSelectors() != null) {
            java.util.Map<String, AudioSelector> audioSelectors = inputTemplate.getAudioSelectors();
            jsonWriter.name("AudioSelectors");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, AudioSelector> audioSelectorsEntry : audioSelectors
                    .entrySet()) {
                AudioSelector audioSelectorsValue = audioSelectorsEntry.getValue();
                if (audioSelectorsValue != null) {
                    jsonWriter.name(audioSelectorsEntry.getKey());
                    AudioSelectorJsonMarshaller.getInstance().marshall(audioSelectorsValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (inputTemplate.getCaptionSelectors() != null) {
            java.util.Map<String, CaptionSelector> captionSelectors = inputTemplate
                    .getCaptionSelectors();
            jsonWriter.name("CaptionSelectors");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, CaptionSelector> captionSelectorsEntry : captionSelectors
                    .entrySet()) {
                CaptionSelector captionSelectorsValue = captionSelectorsEntry.getValue();
                if (captionSelectorsValue != null) {
                    jsonWriter.name(captionSelectorsEntry.getKey());
                    CaptionSelectorJsonMarshaller.getInstance().marshall(captionSelectorsValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (inputTemplate.getCrop() != null) {
            Rectangle crop = inputTemplate.getCrop();
            jsonWriter.name("Crop");
            RectangleJsonMarshaller.getInstance().marshall(crop, jsonWriter);
        }
        if (inputTemplate.getDeblockFilter() != null) {
            String deblockFilter = inputTemplate.getDeblockFilter();
            jsonWriter.name("DeblockFilter");
            jsonWriter.value(deblockFilter);
        }
        if (inputTemplate.getDenoiseFilter() != null) {
            String denoiseFilter = inputTemplate.getDenoiseFilter();
            jsonWriter.name("DenoiseFilter");
            jsonWriter.value(denoiseFilter);
        }
        if (inputTemplate.getFilterEnable() != null) {
            String filterEnable = inputTemplate.getFilterEnable();
            jsonWriter.name("FilterEnable");
            jsonWriter.value(filterEnable);
        }
        if (inputTemplate.getFilterStrength() != null) {
            Integer filterStrength = inputTemplate.getFilterStrength();
            jsonWriter.name("FilterStrength");
            jsonWriter.value(filterStrength);
        }
        if (inputTemplate.getImageInserter() != null) {
            ImageInserter imageInserter = inputTemplate.getImageInserter();
            jsonWriter.name("ImageInserter");
            ImageInserterJsonMarshaller.getInstance().marshall(imageInserter, jsonWriter);
        }
        if (inputTemplate.getInputClippings() != null) {
            java.util.List<InputClipping> inputClippings = inputTemplate.getInputClippings();
            jsonWriter.name("InputClippings");
            jsonWriter.beginArray();
            for (InputClipping inputClippingsItem : inputClippings) {
                if (inputClippingsItem != null) {
                    InputClippingJsonMarshaller.getInstance().marshall(inputClippingsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (inputTemplate.getPosition() != null) {
            Rectangle position = inputTemplate.getPosition();
            jsonWriter.name("Position");
            RectangleJsonMarshaller.getInstance().marshall(position, jsonWriter);
        }
        if (inputTemplate.getProgramNumber() != null) {
            Integer programNumber = inputTemplate.getProgramNumber();
            jsonWriter.name("ProgramNumber");
            jsonWriter.value(programNumber);
        }
        if (inputTemplate.getPsiControl() != null) {
            String psiControl = inputTemplate.getPsiControl();
            jsonWriter.name("PsiControl");
            jsonWriter.value(psiControl);
        }
        if (inputTemplate.getTimecodeSource() != null) {
            String timecodeSource = inputTemplate.getTimecodeSource();
            jsonWriter.name("TimecodeSource");
            jsonWriter.value(timecodeSource);
        }
        if (inputTemplate.getTimecodeStart() != null) {
            String timecodeStart = inputTemplate.getTimecodeStart();
            jsonWriter.name("TimecodeStart");
            jsonWriter.value(timecodeStart);
        }
        if (inputTemplate.getVideoSelector() != null) {
            VideoSelector videoSelector = inputTemplate.getVideoSelector();
            jsonWriter.name("VideoSelector");
            VideoSelectorJsonMarshaller.getInstance().marshall(videoSelector, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InputTemplateJsonMarshaller instance;

    public static InputTemplateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputTemplateJsonMarshaller();
        return instance;
    }
}
