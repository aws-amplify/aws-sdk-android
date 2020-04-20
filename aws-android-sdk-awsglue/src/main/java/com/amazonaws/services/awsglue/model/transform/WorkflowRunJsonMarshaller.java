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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO WorkflowRun
 */
class WorkflowRunJsonMarshaller {

    public void marshall(WorkflowRun workflowRun, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (workflowRun.getName() != null) {
            String name = workflowRun.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (workflowRun.getWorkflowRunId() != null) {
            String workflowRunId = workflowRun.getWorkflowRunId();
            jsonWriter.name("WorkflowRunId");
            jsonWriter.value(workflowRunId);
        }
        if (workflowRun.getWorkflowRunProperties() != null) {
            java.util.Map<String, String> workflowRunProperties = workflowRun
                    .getWorkflowRunProperties();
            jsonWriter.name("WorkflowRunProperties");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> workflowRunPropertiesEntry : workflowRunProperties
                    .entrySet()) {
                String workflowRunPropertiesValue = workflowRunPropertiesEntry.getValue();
                if (workflowRunPropertiesValue != null) {
                    jsonWriter.name(workflowRunPropertiesEntry.getKey());
                    jsonWriter.value(workflowRunPropertiesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (workflowRun.getStartedOn() != null) {
            java.util.Date startedOn = workflowRun.getStartedOn();
            jsonWriter.name("StartedOn");
            jsonWriter.value(startedOn);
        }
        if (workflowRun.getCompletedOn() != null) {
            java.util.Date completedOn = workflowRun.getCompletedOn();
            jsonWriter.name("CompletedOn");
            jsonWriter.value(completedOn);
        }
        if (workflowRun.getStatus() != null) {
            String status = workflowRun.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (workflowRun.getStatistics() != null) {
            WorkflowRunStatistics statistics = workflowRun.getStatistics();
            jsonWriter.name("Statistics");
            WorkflowRunStatisticsJsonMarshaller.getInstance().marshall(statistics, jsonWriter);
        }
        if (workflowRun.getGraph() != null) {
            WorkflowGraph graph = workflowRun.getGraph();
            jsonWriter.name("Graph");
            WorkflowGraphJsonMarshaller.getInstance().marshall(graph, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static WorkflowRunJsonMarshaller instance;

    public static WorkflowRunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowRunJsonMarshaller();
        return instance;
    }
}
