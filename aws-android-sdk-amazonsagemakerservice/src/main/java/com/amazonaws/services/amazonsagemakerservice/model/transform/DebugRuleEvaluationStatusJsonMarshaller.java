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
 * JSON marshaller for POJO DebugRuleEvaluationStatus
 */
class DebugRuleEvaluationStatusJsonMarshaller {

    public void marshall(DebugRuleEvaluationStatus debugRuleEvaluationStatus,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (debugRuleEvaluationStatus.getRuleConfigurationName() != null) {
            String ruleConfigurationName = debugRuleEvaluationStatus.getRuleConfigurationName();
            jsonWriter.name("RuleConfigurationName");
            jsonWriter.value(ruleConfigurationName);
        }
        if (debugRuleEvaluationStatus.getRuleEvaluationJobArn() != null) {
            String ruleEvaluationJobArn = debugRuleEvaluationStatus.getRuleEvaluationJobArn();
            jsonWriter.name("RuleEvaluationJobArn");
            jsonWriter.value(ruleEvaluationJobArn);
        }
        if (debugRuleEvaluationStatus.getRuleEvaluationStatus() != null) {
            String ruleEvaluationStatus = debugRuleEvaluationStatus.getRuleEvaluationStatus();
            jsonWriter.name("RuleEvaluationStatus");
            jsonWriter.value(ruleEvaluationStatus);
        }
        if (debugRuleEvaluationStatus.getStatusDetails() != null) {
            String statusDetails = debugRuleEvaluationStatus.getStatusDetails();
            jsonWriter.name("StatusDetails");
            jsonWriter.value(statusDetails);
        }
        if (debugRuleEvaluationStatus.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = debugRuleEvaluationStatus.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        jsonWriter.endObject();
    }

    private static DebugRuleEvaluationStatusJsonMarshaller instance;

    public static DebugRuleEvaluationStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DebugRuleEvaluationStatusJsonMarshaller();
        return instance;
    }
}
