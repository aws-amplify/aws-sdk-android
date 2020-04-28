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
 * JSON marshaller for POJO AudioNormalizationSettings
 */
class AudioNormalizationSettingsJsonMarshaller {

    public void marshall(AudioNormalizationSettings audioNormalizationSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (audioNormalizationSettings.getAlgorithm() != null) {
            String algorithm = audioNormalizationSettings.getAlgorithm();
            jsonWriter.name("Algorithm");
            jsonWriter.value(algorithm);
        }
        if (audioNormalizationSettings.getAlgorithmControl() != null) {
            String algorithmControl = audioNormalizationSettings.getAlgorithmControl();
            jsonWriter.name("AlgorithmControl");
            jsonWriter.value(algorithmControl);
        }
        if (audioNormalizationSettings.getTargetLkfs() != null) {
            Double targetLkfs = audioNormalizationSettings.getTargetLkfs();
            jsonWriter.name("TargetLkfs");
            jsonWriter.value(targetLkfs);
        }
        jsonWriter.endObject();
    }

    private static AudioNormalizationSettingsJsonMarshaller instance;

    public static AudioNormalizationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AudioNormalizationSettingsJsonMarshaller();
        return instance;
    }
}
