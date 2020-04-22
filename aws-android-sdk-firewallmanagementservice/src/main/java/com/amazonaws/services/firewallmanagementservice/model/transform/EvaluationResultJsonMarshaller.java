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

package com.amazonaws.services.firewallmanagementservice.model.transform;

import com.amazonaws.services.firewallmanagementservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EvaluationResult
 */
class EvaluationResultJsonMarshaller {

    public void marshall(EvaluationResult evaluationResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (evaluationResult.getComplianceStatus() != null) {
            String complianceStatus = evaluationResult.getComplianceStatus();
            jsonWriter.name("ComplianceStatus");
            jsonWriter.value(complianceStatus);
        }
        if (evaluationResult.getViolatorCount() != null) {
            Long violatorCount = evaluationResult.getViolatorCount();
            jsonWriter.name("ViolatorCount");
            jsonWriter.value(violatorCount);
        }
        if (evaluationResult.getEvaluationLimitExceeded() != null) {
            Boolean evaluationLimitExceeded = evaluationResult.getEvaluationLimitExceeded();
            jsonWriter.name("EvaluationLimitExceeded");
            jsonWriter.value(evaluationLimitExceeded);
        }
        jsonWriter.endObject();
    }

    private static EvaluationResultJsonMarshaller instance;

    public static EvaluationResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationResultJsonMarshaller();
        return instance;
    }
}
