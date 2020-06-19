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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EncoderSettings
 */
class EncoderSettingsJsonMarshaller {

    public void marshall(EncoderSettings encoderSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (encoderSettings.getAudioDescriptions() != null) {
            java.util.List<AudioDescription> audioDescriptions = encoderSettings
                    .getAudioDescriptions();
            jsonWriter.name("AudioDescriptions");
            jsonWriter.beginArray();
            for (AudioDescription audioDescriptionsItem : audioDescriptions) {
                if (audioDescriptionsItem != null) {
                    AudioDescriptionJsonMarshaller.getInstance().marshall(audioDescriptionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (encoderSettings.getAvailBlanking() != null) {
            AvailBlanking availBlanking = encoderSettings.getAvailBlanking();
            jsonWriter.name("AvailBlanking");
            AvailBlankingJsonMarshaller.getInstance().marshall(availBlanking, jsonWriter);
        }
        if (encoderSettings.getAvailConfiguration() != null) {
            AvailConfiguration availConfiguration = encoderSettings.getAvailConfiguration();
            jsonWriter.name("AvailConfiguration");
            AvailConfigurationJsonMarshaller.getInstance().marshall(availConfiguration, jsonWriter);
        }
        if (encoderSettings.getBlackoutSlate() != null) {
            BlackoutSlate blackoutSlate = encoderSettings.getBlackoutSlate();
            jsonWriter.name("BlackoutSlate");
            BlackoutSlateJsonMarshaller.getInstance().marshall(blackoutSlate, jsonWriter);
        }
        if (encoderSettings.getCaptionDescriptions() != null) {
            java.util.List<CaptionDescription> captionDescriptions = encoderSettings
                    .getCaptionDescriptions();
            jsonWriter.name("CaptionDescriptions");
            jsonWriter.beginArray();
            for (CaptionDescription captionDescriptionsItem : captionDescriptions) {
                if (captionDescriptionsItem != null) {
                    CaptionDescriptionJsonMarshaller.getInstance().marshall(
                            captionDescriptionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (encoderSettings.getFeatureActivations() != null) {
            FeatureActivations featureActivations = encoderSettings.getFeatureActivations();
            jsonWriter.name("FeatureActivations");
            FeatureActivationsJsonMarshaller.getInstance().marshall(featureActivations, jsonWriter);
        }
        if (encoderSettings.getGlobalConfiguration() != null) {
            GlobalConfiguration globalConfiguration = encoderSettings.getGlobalConfiguration();
            jsonWriter.name("GlobalConfiguration");
            GlobalConfigurationJsonMarshaller.getInstance().marshall(globalConfiguration,
                    jsonWriter);
        }
        if (encoderSettings.getNielsenConfiguration() != null) {
            NielsenConfiguration nielsenConfiguration = encoderSettings.getNielsenConfiguration();
            jsonWriter.name("NielsenConfiguration");
            NielsenConfigurationJsonMarshaller.getInstance().marshall(nielsenConfiguration,
                    jsonWriter);
        }
        if (encoderSettings.getOutputGroups() != null) {
            java.util.List<OutputGroup> outputGroups = encoderSettings.getOutputGroups();
            jsonWriter.name("OutputGroups");
            jsonWriter.beginArray();
            for (OutputGroup outputGroupsItem : outputGroups) {
                if (outputGroupsItem != null) {
                    OutputGroupJsonMarshaller.getInstance().marshall(outputGroupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (encoderSettings.getTimecodeConfig() != null) {
            TimecodeConfig timecodeConfig = encoderSettings.getTimecodeConfig();
            jsonWriter.name("TimecodeConfig");
            TimecodeConfigJsonMarshaller.getInstance().marshall(timecodeConfig, jsonWriter);
        }
        if (encoderSettings.getVideoDescriptions() != null) {
            java.util.List<VideoDescription> videoDescriptions = encoderSettings
                    .getVideoDescriptions();
            jsonWriter.name("VideoDescriptions");
            jsonWriter.beginArray();
            for (VideoDescription videoDescriptionsItem : videoDescriptions) {
                if (videoDescriptionsItem != null) {
                    VideoDescriptionJsonMarshaller.getInstance().marshall(videoDescriptionsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EncoderSettingsJsonMarshaller instance;

    public static EncoderSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EncoderSettingsJsonMarshaller();
        return instance;
    }
}
