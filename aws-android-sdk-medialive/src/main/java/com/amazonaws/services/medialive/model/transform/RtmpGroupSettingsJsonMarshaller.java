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
 * JSON marshaller for POJO RtmpGroupSettings
 */
class RtmpGroupSettingsJsonMarshaller {

    public void marshall(RtmpGroupSettings rtmpGroupSettings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (rtmpGroupSettings.getAuthenticationScheme() != null) {
            String authenticationScheme = rtmpGroupSettings.getAuthenticationScheme();
            jsonWriter.name("AuthenticationScheme");
            jsonWriter.value(authenticationScheme);
        }
        if (rtmpGroupSettings.getCacheFullBehavior() != null) {
            String cacheFullBehavior = rtmpGroupSettings.getCacheFullBehavior();
            jsonWriter.name("CacheFullBehavior");
            jsonWriter.value(cacheFullBehavior);
        }
        if (rtmpGroupSettings.getCacheLength() != null) {
            Integer cacheLength = rtmpGroupSettings.getCacheLength();
            jsonWriter.name("CacheLength");
            jsonWriter.value(cacheLength);
        }
        if (rtmpGroupSettings.getCaptionData() != null) {
            String captionData = rtmpGroupSettings.getCaptionData();
            jsonWriter.name("CaptionData");
            jsonWriter.value(captionData);
        }
        if (rtmpGroupSettings.getInputLossAction() != null) {
            String inputLossAction = rtmpGroupSettings.getInputLossAction();
            jsonWriter.name("InputLossAction");
            jsonWriter.value(inputLossAction);
        }
        if (rtmpGroupSettings.getRestartDelay() != null) {
            Integer restartDelay = rtmpGroupSettings.getRestartDelay();
            jsonWriter.name("RestartDelay");
            jsonWriter.value(restartDelay);
        }
        jsonWriter.endObject();
    }

    private static RtmpGroupSettingsJsonMarshaller instance;

    public static RtmpGroupSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RtmpGroupSettingsJsonMarshaller();
        return instance;
    }
}
