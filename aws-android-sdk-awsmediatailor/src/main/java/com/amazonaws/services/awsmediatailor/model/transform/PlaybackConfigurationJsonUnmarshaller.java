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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PlaybackConfiguration
 */
class PlaybackConfigurationJsonUnmarshaller implements
        Unmarshaller<PlaybackConfiguration, JsonUnmarshallerContext> {

    public PlaybackConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PlaybackConfiguration playbackConfiguration = new PlaybackConfiguration();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdDecisionServerUrl")) {
                playbackConfiguration.setAdDecisionServerUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailSuppression")) {
                playbackConfiguration.setAvailSuppression(AvailSuppressionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CdnConfiguration")) {
                playbackConfiguration.setCdnConfiguration(CdnConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DashConfiguration")) {
                playbackConfiguration.setDashConfiguration(DashConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HlsConfiguration")) {
                playbackConfiguration.setHlsConfiguration(HlsConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                playbackConfiguration.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlaybackConfigurationArn")) {
                playbackConfiguration.setPlaybackConfigurationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlaybackEndpointPrefix")) {
                playbackConfiguration.setPlaybackEndpointPrefix(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SessionInitializationEndpointPrefix")) {
                playbackConfiguration.setSessionInitializationEndpointPrefix(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SlateAdUrl")) {
                playbackConfiguration.setSlateAdUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                playbackConfiguration.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TranscodeProfileName")) {
                playbackConfiguration.setTranscodeProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PersonalizationThresholdSeconds")) {
                playbackConfiguration.setPersonalizationThresholdSeconds(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoContentSourceUrl")) {
                playbackConfiguration.setVideoContentSourceUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return playbackConfiguration;
    }

    private static PlaybackConfigurationJsonUnmarshaller instance;

    public static PlaybackConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlaybackConfigurationJsonUnmarshaller();
        return instance;
    }
}
