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

package com.amazonaws.services.awsmediatailor.model.transform;

import com.amazonaws.services.awsmediatailor.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PlaybackConfiguration
 */
class PlaybackConfigurationJsonMarshaller {

    public void marshall(PlaybackConfiguration playbackConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (playbackConfiguration.getAdDecisionServerUrl() != null) {
            String adDecisionServerUrl = playbackConfiguration.getAdDecisionServerUrl();
            jsonWriter.name("AdDecisionServerUrl");
            jsonWriter.value(adDecisionServerUrl);
        }
        if (playbackConfiguration.getAvailSuppression() != null) {
            AvailSuppression availSuppression = playbackConfiguration.getAvailSuppression();
            jsonWriter.name("AvailSuppression");
            AvailSuppressionJsonMarshaller.getInstance().marshall(availSuppression, jsonWriter);
        }
        if (playbackConfiguration.getCdnConfiguration() != null) {
            CdnConfiguration cdnConfiguration = playbackConfiguration.getCdnConfiguration();
            jsonWriter.name("CdnConfiguration");
            CdnConfigurationJsonMarshaller.getInstance().marshall(cdnConfiguration, jsonWriter);
        }
        if (playbackConfiguration.getDashConfiguration() != null) {
            DashConfiguration dashConfiguration = playbackConfiguration.getDashConfiguration();
            jsonWriter.name("DashConfiguration");
            DashConfigurationJsonMarshaller.getInstance().marshall(dashConfiguration, jsonWriter);
        }
        if (playbackConfiguration.getHlsConfiguration() != null) {
            HlsConfiguration hlsConfiguration = playbackConfiguration.getHlsConfiguration();
            jsonWriter.name("HlsConfiguration");
            HlsConfigurationJsonMarshaller.getInstance().marshall(hlsConfiguration, jsonWriter);
        }
        if (playbackConfiguration.getName() != null) {
            String name = playbackConfiguration.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (playbackConfiguration.getPlaybackConfigurationArn() != null) {
            String playbackConfigurationArn = playbackConfiguration.getPlaybackConfigurationArn();
            jsonWriter.name("PlaybackConfigurationArn");
            jsonWriter.value(playbackConfigurationArn);
        }
        if (playbackConfiguration.getPlaybackEndpointPrefix() != null) {
            String playbackEndpointPrefix = playbackConfiguration.getPlaybackEndpointPrefix();
            jsonWriter.name("PlaybackEndpointPrefix");
            jsonWriter.value(playbackEndpointPrefix);
        }
        if (playbackConfiguration.getSessionInitializationEndpointPrefix() != null) {
            String sessionInitializationEndpointPrefix = playbackConfiguration
                    .getSessionInitializationEndpointPrefix();
            jsonWriter.name("SessionInitializationEndpointPrefix");
            jsonWriter.value(sessionInitializationEndpointPrefix);
        }
        if (playbackConfiguration.getSlateAdUrl() != null) {
            String slateAdUrl = playbackConfiguration.getSlateAdUrl();
            jsonWriter.name("SlateAdUrl");
            jsonWriter.value(slateAdUrl);
        }
        if (playbackConfiguration.getTags() != null) {
            java.util.Map<String, String> tags = playbackConfiguration.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (playbackConfiguration.getTranscodeProfileName() != null) {
            String transcodeProfileName = playbackConfiguration.getTranscodeProfileName();
            jsonWriter.name("TranscodeProfileName");
            jsonWriter.value(transcodeProfileName);
        }
        if (playbackConfiguration.getPersonalizationThresholdSeconds() != null) {
            Integer personalizationThresholdSeconds = playbackConfiguration
                    .getPersonalizationThresholdSeconds();
            jsonWriter.name("PersonalizationThresholdSeconds");
            jsonWriter.value(personalizationThresholdSeconds);
        }
        if (playbackConfiguration.getVideoContentSourceUrl() != null) {
            String videoContentSourceUrl = playbackConfiguration.getVideoContentSourceUrl();
            jsonWriter.name("VideoContentSourceUrl");
            jsonWriter.value(videoContentSourceUrl);
        }
        jsonWriter.endObject();
    }

    private static PlaybackConfigurationJsonMarshaller instance;

    public static PlaybackConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PlaybackConfigurationJsonMarshaller();
        return instance;
    }
}
