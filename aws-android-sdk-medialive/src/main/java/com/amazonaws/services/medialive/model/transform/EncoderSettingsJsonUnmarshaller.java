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
 * JSON unmarshaller for POJO EncoderSettings
 */
class EncoderSettingsJsonUnmarshaller implements
        Unmarshaller<EncoderSettings, JsonUnmarshallerContext> {

    public EncoderSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EncoderSettings encoderSettings = new EncoderSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AudioDescriptions")) {
                encoderSettings.setAudioDescriptions(new ListUnmarshaller<AudioDescription>(
                        AudioDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AvailBlanking")) {
                encoderSettings.setAvailBlanking(AvailBlankingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailConfiguration")) {
                encoderSettings.setAvailConfiguration(AvailConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("BlackoutSlate")) {
                encoderSettings.setBlackoutSlate(BlackoutSlateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CaptionDescriptions")) {
                encoderSettings.setCaptionDescriptions(new ListUnmarshaller<CaptionDescription>(
                        CaptionDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FeatureActivations")) {
                encoderSettings.setFeatureActivations(FeatureActivationsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("GlobalConfiguration")) {
                encoderSettings.setGlobalConfiguration(GlobalConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NielsenConfiguration")) {
                encoderSettings.setNielsenConfiguration(NielsenConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputGroups")) {
                encoderSettings.setOutputGroups(new ListUnmarshaller<OutputGroup>(
                        OutputGroupJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TimecodeConfig")) {
                encoderSettings.setTimecodeConfig(TimecodeConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoDescriptions")) {
                encoderSettings.setVideoDescriptions(new ListUnmarshaller<VideoDescription>(
                        VideoDescriptionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return encoderSettings;
    }

    private static EncoderSettingsJsonUnmarshaller instance;

    public static EncoderSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EncoderSettingsJsonUnmarshaller();
        return instance;
    }
}
