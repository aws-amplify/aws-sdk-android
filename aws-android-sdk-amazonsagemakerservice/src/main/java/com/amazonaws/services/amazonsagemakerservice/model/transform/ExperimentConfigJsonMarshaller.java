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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExperimentConfig
 */
class ExperimentConfigJsonMarshaller {

    public void marshall(ExperimentConfig experimentConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (experimentConfig.getExperimentName() != null) {
            String experimentName = experimentConfig.getExperimentName();
            jsonWriter.name("ExperimentName");
            jsonWriter.value(experimentName);
        }
        if (experimentConfig.getTrialName() != null) {
            String trialName = experimentConfig.getTrialName();
            jsonWriter.name("TrialName");
            jsonWriter.value(trialName);
        }
        if (experimentConfig.getTrialComponentDisplayName() != null) {
            String trialComponentDisplayName = experimentConfig.getTrialComponentDisplayName();
            jsonWriter.name("TrialComponentDisplayName");
            jsonWriter.value(trialComponentDisplayName);
        }
        jsonWriter.endObject();
    }

    private static ExperimentConfigJsonMarshaller instance;

    public static ExperimentConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExperimentConfigJsonMarshaller();
        return instance;
    }
}
