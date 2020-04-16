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
 * JSON marshaller for POJO FlowDefinitionSummary
 */
class FlowDefinitionSummaryJsonMarshaller {

    public void marshall(FlowDefinitionSummary flowDefinitionSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (flowDefinitionSummary.getFlowDefinitionName() != null) {
            String flowDefinitionName = flowDefinitionSummary.getFlowDefinitionName();
            jsonWriter.name("FlowDefinitionName");
            jsonWriter.value(flowDefinitionName);
        }
        if (flowDefinitionSummary.getFlowDefinitionArn() != null) {
            String flowDefinitionArn = flowDefinitionSummary.getFlowDefinitionArn();
            jsonWriter.name("FlowDefinitionArn");
            jsonWriter.value(flowDefinitionArn);
        }
        if (flowDefinitionSummary.getFlowDefinitionStatus() != null) {
            String flowDefinitionStatus = flowDefinitionSummary.getFlowDefinitionStatus();
            jsonWriter.name("FlowDefinitionStatus");
            jsonWriter.value(flowDefinitionStatus);
        }
        if (flowDefinitionSummary.getCreationTime() != null) {
            java.util.Date creationTime = flowDefinitionSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (flowDefinitionSummary.getFailureReason() != null) {
            String failureReason = flowDefinitionSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static FlowDefinitionSummaryJsonMarshaller instance;

    public static FlowDefinitionSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FlowDefinitionSummaryJsonMarshaller();
        return instance;
    }
}
