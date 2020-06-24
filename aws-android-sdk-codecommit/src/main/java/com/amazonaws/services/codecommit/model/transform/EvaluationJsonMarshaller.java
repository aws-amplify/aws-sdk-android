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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Evaluation
 */
class EvaluationJsonMarshaller {

    public void marshall(Evaluation evaluation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (evaluation.getApproved() != null) {
            Boolean approved = evaluation.getApproved();
            jsonWriter.name("approved");
            jsonWriter.value(approved);
        }
        if (evaluation.getOverridden() != null) {
            Boolean overridden = evaluation.getOverridden();
            jsonWriter.name("overridden");
            jsonWriter.value(overridden);
        }
        if (evaluation.getApprovalRulesSatisfied() != null) {
            java.util.List<String> approvalRulesSatisfied = evaluation.getApprovalRulesSatisfied();
            jsonWriter.name("approvalRulesSatisfied");
            jsonWriter.beginArray();
            for (String approvalRulesSatisfiedItem : approvalRulesSatisfied) {
                if (approvalRulesSatisfiedItem != null) {
                    jsonWriter.value(approvalRulesSatisfiedItem);
                }
            }
            jsonWriter.endArray();
        }
        if (evaluation.getApprovalRulesNotSatisfied() != null) {
            java.util.List<String> approvalRulesNotSatisfied = evaluation
                    .getApprovalRulesNotSatisfied();
            jsonWriter.name("approvalRulesNotSatisfied");
            jsonWriter.beginArray();
            for (String approvalRulesNotSatisfiedItem : approvalRulesNotSatisfied) {
                if (approvalRulesNotSatisfiedItem != null) {
                    jsonWriter.value(approvalRulesNotSatisfiedItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EvaluationJsonMarshaller instance;

    public static EvaluationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationJsonMarshaller();
        return instance;
    }
}
