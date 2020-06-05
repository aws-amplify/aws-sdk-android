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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ConditionalSplitActivity
 */
class ConditionalSplitActivityJsonMarshaller {

    public void marshall(ConditionalSplitActivity conditionalSplitActivity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (conditionalSplitActivity.getCondition() != null) {
            Condition condition = conditionalSplitActivity.getCondition();
            jsonWriter.name("Condition");
            ConditionJsonMarshaller.getInstance().marshall(condition, jsonWriter);
        }
        if (conditionalSplitActivity.getEvaluationWaitTime() != null) {
            WaitTime evaluationWaitTime = conditionalSplitActivity.getEvaluationWaitTime();
            jsonWriter.name("EvaluationWaitTime");
            WaitTimeJsonMarshaller.getInstance().marshall(evaluationWaitTime, jsonWriter);
        }
        if (conditionalSplitActivity.getFalseActivity() != null) {
            String falseActivity = conditionalSplitActivity.getFalseActivity();
            jsonWriter.name("FalseActivity");
            jsonWriter.value(falseActivity);
        }
        if (conditionalSplitActivity.getTrueActivity() != null) {
            String trueActivity = conditionalSplitActivity.getTrueActivity();
            jsonWriter.name("TrueActivity");
            jsonWriter.value(trueActivity);
        }
        jsonWriter.endObject();
    }

    private static ConditionalSplitActivityJsonMarshaller instance;

    public static ConditionalSplitActivityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConditionalSplitActivityJsonMarshaller();
        return instance;
    }
}
