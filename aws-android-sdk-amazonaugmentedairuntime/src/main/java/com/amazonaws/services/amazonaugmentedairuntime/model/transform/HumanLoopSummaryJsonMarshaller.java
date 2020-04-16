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

package com.amazonaws.services.amazonaugmentedairuntime.model.transform;

import com.amazonaws.services.amazonaugmentedairuntime.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HumanLoopSummary
 */
class HumanLoopSummaryJsonMarshaller {

    public void marshall(HumanLoopSummary humanLoopSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (humanLoopSummary.getHumanLoopName() != null) {
            String humanLoopName = humanLoopSummary.getHumanLoopName();
            jsonWriter.name("HumanLoopName");
            jsonWriter.value(humanLoopName);
        }
        if (humanLoopSummary.getHumanLoopStatus() != null) {
            String humanLoopStatus = humanLoopSummary.getHumanLoopStatus();
            jsonWriter.name("HumanLoopStatus");
            jsonWriter.value(humanLoopStatus);
        }
        if (humanLoopSummary.getCreationTime() != null) {
            java.util.Date creationTime = humanLoopSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (humanLoopSummary.getFailureReason() != null) {
            String failureReason = humanLoopSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        if (humanLoopSummary.getFlowDefinitionArn() != null) {
            String flowDefinitionArn = humanLoopSummary.getFlowDefinitionArn();
            jsonWriter.name("FlowDefinitionArn");
            jsonWriter.value(flowDefinitionArn);
        }
        jsonWriter.endObject();
    }

    private static HumanLoopSummaryJsonMarshaller instance;

    public static HumanLoopSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HumanLoopSummaryJsonMarshaller();
        return instance;
    }
}
