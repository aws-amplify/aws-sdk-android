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
 * JSON unmarshaller for response PutPlaybackConfigurationResult
 */
public class PutPlaybackConfigurationResultJsonUnmarshaller implements
        Unmarshaller<PutPlaybackConfigurationResult, JsonUnmarshallerContext> {

    public PutPlaybackConfigurationResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        PutPlaybackConfigurationResult putPlaybackConfigurationResult = new PutPlaybackConfigurationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdDecisionServerUrl")) {
                putPlaybackConfigurationResult.setAdDecisionServerUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailSuppression")) {
                putPlaybackConfigurationResult.setAvailSuppression(AvailSuppressionJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CdnConfiguration")) {
                putPlaybackConfigurationResult.setCdnConfiguration(CdnConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DashConfiguration")) {
                putPlaybackConfigurationResult
                        .setDashConfiguration(DashConfigurationJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("HlsConfiguration")) {
                putPlaybackConfigurationResult.setHlsConfiguration(HlsConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LivePreRollConfiguration")) {
                putPlaybackConfigurationResult
                        .setLivePreRollConfiguration(LivePreRollConfigurationJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Name")) {
                putPlaybackConfigurationResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PersonalizationThresholdSeconds")) {
                putPlaybackConfigurationResult
                        .setPersonalizationThresholdSeconds(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("PlaybackConfigurationArn")) {
                putPlaybackConfigurationResult.setPlaybackConfigurationArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("PlaybackEndpointPrefix")) {
                putPlaybackConfigurationResult.setPlaybackEndpointPrefix(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SessionInitializationEndpointPrefix")) {
                putPlaybackConfigurationResult
                        .setSessionInitializationEndpointPrefix(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("SlateAdUrl")) {
                putPlaybackConfigurationResult.setSlateAdUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                putPlaybackConfigurationResult.setTags(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TranscodeProfileName")) {
                putPlaybackConfigurationResult.setTranscodeProfileName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoContentSourceUrl")) {
                putPlaybackConfigurationResult.setVideoContentSourceUrl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return putPlaybackConfigurationResult;
    }

    private static PutPlaybackConfigurationResultJsonUnmarshaller instance;

    public static PutPlaybackConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutPlaybackConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
