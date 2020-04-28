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
 * JSON marshaller for POJO InputSettings
 */
class InputSettingsJsonMarshaller {

    public void marshall(InputSettings inputSettings, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (inputSettings.getAudioSelectors() != null) {
            java.util.List<AudioSelector> audioSelectors = inputSettings.getAudioSelectors();
            jsonWriter.name("AudioSelectors");
            jsonWriter.beginArray();
            for (AudioSelector audioSelectorsItem : audioSelectors) {
                if (audioSelectorsItem != null) {
                    AudioSelectorJsonMarshaller.getInstance().marshall(audioSelectorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (inputSettings.getCaptionSelectors() != null) {
            java.util.List<CaptionSelector> captionSelectors = inputSettings.getCaptionSelectors();
            jsonWriter.name("CaptionSelectors");
            jsonWriter.beginArray();
            for (CaptionSelector captionSelectorsItem : captionSelectors) {
                if (captionSelectorsItem != null) {
                    CaptionSelectorJsonMarshaller.getInstance().marshall(captionSelectorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (inputSettings.getDeblockFilter() != null) {
            String deblockFilter = inputSettings.getDeblockFilter();
            jsonWriter.name("DeblockFilter");
            jsonWriter.value(deblockFilter);
        }
        if (inputSettings.getDenoiseFilter() != null) {
            String denoiseFilter = inputSettings.getDenoiseFilter();
            jsonWriter.name("DenoiseFilter");
            jsonWriter.value(denoiseFilter);
        }
        if (inputSettings.getFilterStrength() != null) {
            Integer filterStrength = inputSettings.getFilterStrength();
            jsonWriter.name("FilterStrength");
            jsonWriter.value(filterStrength);
        }
        if (inputSettings.getInputFilter() != null) {
            String inputFilter = inputSettings.getInputFilter();
            jsonWriter.name("InputFilter");
            jsonWriter.value(inputFilter);
        }
        if (inputSettings.getNetworkInputSettings() != null) {
            NetworkInputSettings networkInputSettings = inputSettings.getNetworkInputSettings();
            jsonWriter.name("NetworkInputSettings");
            NetworkInputSettingsJsonMarshaller.getInstance().marshall(networkInputSettings,
                    jsonWriter);
        }
        if (inputSettings.getSourceEndBehavior() != null) {
            String sourceEndBehavior = inputSettings.getSourceEndBehavior();
            jsonWriter.name("SourceEndBehavior");
            jsonWriter.value(sourceEndBehavior);
        }
        if (inputSettings.getVideoSelector() != null) {
            VideoSelector videoSelector = inputSettings.getVideoSelector();
            jsonWriter.name("VideoSelector");
            VideoSelectorJsonMarshaller.getInstance().marshall(videoSelector, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InputSettingsJsonMarshaller instance;

    public static InputSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InputSettingsJsonMarshaller();
        return instance;
    }
}
