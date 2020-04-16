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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AudioNormalizationSettings
 */
class AudioNormalizationSettingsJsonUnmarshaller implements
        Unmarshaller<AudioNormalizationSettings, JsonUnmarshallerContext> {

    public AudioNormalizationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AudioNormalizationSettings audioNormalizationSettings = new AudioNormalizationSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Algorithm")) {
                audioNormalizationSettings.setAlgorithm(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AlgorithmControl")) {
                audioNormalizationSettings.setAlgorithmControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CorrectionGateLevel")) {
                audioNormalizationSettings.setCorrectionGateLevel(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LoudnessLogging")) {
                audioNormalizationSettings.setLoudnessLogging(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PeakCalculation")) {
                audioNormalizationSettings.setPeakCalculation(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TargetLkfs")) {
                audioNormalizationSettings.setTargetLkfs(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return audioNormalizationSettings;
    }

    private static AudioNormalizationSettingsJsonUnmarshaller instance;

    public static AudioNormalizationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AudioNormalizationSettingsJsonUnmarshaller();
        return instance;
    }
}
