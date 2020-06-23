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

package com.amazonaws.services.api.mediatailor.model.transform;

import com.amazonaws.services.api.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetPlaybackConfigurationResult
 */
public class GetPlaybackConfigurationResultJsonUnmarshaller implements
        Unmarshaller<GetPlaybackConfigurationResult, JsonUnmarshallerContext> {

    public GetPlaybackConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetPlaybackConfigurationResult getPlaybackConfigurationResult = new GetPlaybackConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdDecisionServerUrl")) {
                getPlaybackConfigurationResult.setAdDecisionServerUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailSuppression")) {
                getPlaybackConfigurationResult.setAvailSuppression(AvailSuppressionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Bumper")) {
                getPlaybackConfigurationResult.setBumper(BumperJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CdnConfiguration")) {
                getPlaybackConfigurationResult.setCdnConfiguration(CdnConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DashConfiguration")) {
                getPlaybackConfigurationResult
                        .setDashConfiguration(DashConfigurationJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("HlsConfiguration")) {
                getPlaybackConfigurationResult.setHlsConfiguration(HlsConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LivePreRollConfiguration")) {
                getPlaybackConfigurationResult
                        .setLivePreRollConfiguration(LivePreRollConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Name")) {
                getPlaybackConfigurationResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PersonalizationThresholdSeconds")) {
                getPlaybackConfigurationResult
                        .setPersonalizationThresholdSeconds(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("PlaybackConfigurationArn")) {
                getPlaybackConfigurationResult.setPlaybackConfigurationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlaybackEndpointPrefix")) {
                getPlaybackConfigurationResult.setPlaybackEndpointPrefix(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SessionInitializationEndpointPrefix")) {
                getPlaybackConfigurationResult
                        .setSessionInitializationEndpointPrefix(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SlateAdUrl")) {
                getPlaybackConfigurationResult.setSlateAdUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                getPlaybackConfigurationResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TranscodeProfileName")) {
                getPlaybackConfigurationResult.setTranscodeProfileName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoContentSourceUrl")) {
                getPlaybackConfigurationResult.setVideoContentSourceUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getPlaybackConfigurationResult;
    }

    private static GetPlaybackConfigurationResultJsonUnmarshaller instance;

    public static GetPlaybackConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetPlaybackConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
