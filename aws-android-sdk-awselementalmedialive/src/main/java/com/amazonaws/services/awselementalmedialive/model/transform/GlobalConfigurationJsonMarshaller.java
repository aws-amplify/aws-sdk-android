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
 * JSON marshaller for POJO GlobalConfiguration
 */
class GlobalConfigurationJsonMarshaller {

    public void marshall(GlobalConfiguration globalConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (globalConfiguration.getInitialAudioGain() != null) {
            Integer initialAudioGain = globalConfiguration.getInitialAudioGain();
            jsonWriter.name("InitialAudioGain");
            jsonWriter.value(initialAudioGain);
        }
        if (globalConfiguration.getInputEndAction() != null) {
            String inputEndAction = globalConfiguration.getInputEndAction();
            jsonWriter.name("InputEndAction");
            jsonWriter.value(inputEndAction);
        }
        if (globalConfiguration.getInputLossBehavior() != null) {
            InputLossBehavior inputLossBehavior = globalConfiguration.getInputLossBehavior();
            jsonWriter.name("InputLossBehavior");
            InputLossBehaviorJsonMarshaller.getInstance().marshall(inputLossBehavior, jsonWriter);
        }
        if (globalConfiguration.getOutputLockingMode() != null) {
            String outputLockingMode = globalConfiguration.getOutputLockingMode();
            jsonWriter.name("OutputLockingMode");
            jsonWriter.value(outputLockingMode);
        }
        if (globalConfiguration.getOutputTimingSource() != null) {
            String outputTimingSource = globalConfiguration.getOutputTimingSource();
            jsonWriter.name("OutputTimingSource");
            jsonWriter.value(outputTimingSource);
        }
        if (globalConfiguration.getSupportLowFramerateInputs() != null) {
            String supportLowFramerateInputs = globalConfiguration.getSupportLowFramerateInputs();
            jsonWriter.name("SupportLowFramerateInputs");
            jsonWriter.value(supportLowFramerateInputs);
        }
        jsonWriter.endObject();
    }

    private static GlobalConfigurationJsonMarshaller instance;

    public static GlobalConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GlobalConfigurationJsonMarshaller();
        return instance;
    }
}
