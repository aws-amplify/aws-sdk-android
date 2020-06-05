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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CanarySettings
 */
class CanarySettingsJsonUnmarshaller implements
        Unmarshaller<CanarySettings, JsonUnmarshallerContext> {

    public CanarySettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CanarySettings canarySettings = new CanarySettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("percentTraffic")) {
                canarySettings.setPercentTraffic(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deploymentId")) {
                canarySettings.setDeploymentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stageVariableOverrides")) {
                canarySettings.setStageVariableOverrides(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("useStageCache")) {
                canarySettings.setUseStageCache(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return canarySettings;
    }

    private static CanarySettingsJsonUnmarshaller instance;

    public static CanarySettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CanarySettingsJsonUnmarshaller();
        return instance;
    }
}
