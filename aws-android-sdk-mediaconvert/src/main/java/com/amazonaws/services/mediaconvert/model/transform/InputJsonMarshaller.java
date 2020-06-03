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
 * JSON marshaller for POJO Input
 */
class InputJsonMarshaller {

    public void marshall(Input input, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (input.getAudioSelectorGroups() != null) {
            java.util.Map<String, AudioSelectorGroup> audioSelectorGroups = input
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
        if (input.getAudioSelectors() != null) {
            java.util.Map<String, AudioSelector> audioSelectors = input.getAudioSelectors();
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
        if (input.getCaptionSelectors() != null) {
            java.util.Map<String, CaptionSelector> captionSelectors = input.getCaptionSelectors();
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
        if (input.getCrop() != null) {
            Rectangle crop = input.getCrop();
            jsonWriter.name("Crop");
            RectangleJsonMarshaller.getInstance().marshall(crop, jsonWriter);
        }
        if (input.getDeblockFilter() != null) {
            String deblockFilter = input.getDeblockFilter();
            jsonWriter.name("DeblockFilter");
            jsonWriter.value(deblockFilter);
        }
        if (input.getDecryptionSettings() != null) {
            InputDecryptionSettings decryptionSettings = input.getDecryptionSettings();
            jsonWriter.name("DecryptionSettings");
            InputDecryptionSettingsJsonMarshaller.getInstance().marshall(decryptionSettings,
                    jsonWriter);
        }
        if (input.getDenoiseFilter() != null) {
            String denoiseFilter = input.getDenoiseFilter();
            jsonWriter.name("DenoiseFilter");
            jsonWriter.value(denoiseFilter);
        }
        if (input.getFileInput() != null) {
            String fileInput = input.getFileInput();
            jsonWriter.name("FileInput");
            jsonWriter.value(fileInput);
        }
        if (input.getFilterEnable() != null) {
            String filterEnable = input.getFilterEnable();
            jsonWriter.name("FilterEnable");
            jsonWriter.value(filterEnable);
        }
        if (input.getFilterStrength() != null) {
            Integer filterStrength = input.getFilterStrength();
            jsonWriter.name("FilterStrength");
            jsonWriter.value(filterStrength);
        }
        if (input.getImageInserter() != null) {
            ImageInserter imageInserter = input.getImageInserter();
            jsonWriter.name("ImageInserter");
            ImageInserterJsonMarshaller.getInstance().marshall(imageInserter, jsonWriter);
        }
        if (input.getInputClippings() != null) {
            java.util.List<InputClipping> inputClippings = input.getInputClippings();
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
        if (input.getPosition() != null) {
            Rectangle position = input.getPosition();
            jsonWriter.name("Position");
            RectangleJsonMarshaller.getInstance().marshall(position, jsonWriter);
        }
        if (input.getProgramNumber() != null) {
            Integer programNumber = input.getProgramNumber();
            jsonWriter.name("ProgramNumber");
            jsonWriter.value(programNumber);
        }
        if (input.getPsiControl() != null) {
            String psiControl = input.getPsiControl();
            jsonWriter.name("PsiControl");
            jsonWriter.value(psiControl);
        }
        if (input.getSupplementalImps() != null) {
            java.util.List<String> supplementalImps = input.getSupplementalImps();
            jsonWriter.name("SupplementalImps");
            jsonWriter.beginArray();
            for (String supplementalImpsItem : supplementalImps) {
                if (supplementalImpsItem != null) {
                    jsonWriter.value(supplementalImpsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (input.getTimecodeSource() != null) {
            String timecodeSource = input.getTimecodeSource();
            jsonWriter.name("TimecodeSource");
            jsonWriter.value(timecodeSource);
        }
        if (input.getTimecodeStart() != null) {
            String timecodeStart = input.getTimecodeStart();
            jsonWriter.name("TimecodeStart");
            jsonWriter.value(timecodeStart);
        }
        if (input.getVideoSelector() != null) {
            VideoSelector videoSelector = input.getVideoSelector();
            jsonWriter.name("VideoSelector");
            VideoSelectorJsonMarshaller.getInstance().marshall(videoSelector, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InputJsonMarshaller instance;

    public static InputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputJsonMarshaller();
        return instance;
    }
}
