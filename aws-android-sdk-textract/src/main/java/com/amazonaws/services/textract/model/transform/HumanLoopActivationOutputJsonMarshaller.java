/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HumanLoopActivationOutput
 */
class HumanLoopActivationOutputJsonMarshaller {

    public void marshall(HumanLoopActivationOutput humanLoopActivationOutput,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (humanLoopActivationOutput.getHumanLoopArn() != null) {
            String humanLoopArn = humanLoopActivationOutput.getHumanLoopArn();
            jsonWriter.name("HumanLoopArn");
            jsonWriter.value(humanLoopArn);
        }
        if (humanLoopActivationOutput.getHumanLoopActivationReasons() != null) {
            java.util.List<String> humanLoopActivationReasons = humanLoopActivationOutput
                    .getHumanLoopActivationReasons();
            jsonWriter.name("HumanLoopActivationReasons");
            jsonWriter.beginArray();
            for (String humanLoopActivationReasonsItem : humanLoopActivationReasons) {
                if (humanLoopActivationReasonsItem != null) {
                    jsonWriter.value(humanLoopActivationReasonsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (humanLoopActivationOutput.getHumanLoopActivationConditionsEvaluationResults() != null) {
            String humanLoopActivationConditionsEvaluationResults = humanLoopActivationOutput
                    .getHumanLoopActivationConditionsEvaluationResults();
            jsonWriter.name("HumanLoopActivationConditionsEvaluationResults");
            jsonWriter.value(humanLoopActivationConditionsEvaluationResults);
        }
        jsonWriter.endObject();
    }

    private static HumanLoopActivationOutputJsonMarshaller instance;

    public static HumanLoopActivationOutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HumanLoopActivationOutputJsonMarshaller();
        return instance;
    }
}
