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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Workflow
 */
class WorkflowJsonMarshaller {

    public void marshall(Workflow workflow, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (workflow.getName() != null) {
            String name = workflow.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (workflow.getDescription() != null) {
            String description = workflow.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (workflow.getDefaultRunProperties() != null) {
            java.util.Map<String, String> defaultRunProperties = workflow.getDefaultRunProperties();
            jsonWriter.name("DefaultRunProperties");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> defaultRunPropertiesEntry : defaultRunProperties
                    .entrySet()) {
                String defaultRunPropertiesValue = defaultRunPropertiesEntry.getValue();
                if (defaultRunPropertiesValue != null) {
                    jsonWriter.name(defaultRunPropertiesEntry.getKey());
                    jsonWriter.value(defaultRunPropertiesValue);
                }
            }
            jsonWriter.endObject();
        }
        if (workflow.getCreatedOn() != null) {
            java.util.Date createdOn = workflow.getCreatedOn();
            jsonWriter.name("CreatedOn");
            jsonWriter.value(createdOn);
        }
        if (workflow.getLastModifiedOn() != null) {
            java.util.Date lastModifiedOn = workflow.getLastModifiedOn();
            jsonWriter.name("LastModifiedOn");
            jsonWriter.value(lastModifiedOn);
        }
        if (workflow.getLastRun() != null) {
            WorkflowRun lastRun = workflow.getLastRun();
            jsonWriter.name("LastRun");
            WorkflowRunJsonMarshaller.getInstance().marshall(lastRun, jsonWriter);
        }
        if (workflow.getGraph() != null) {
            WorkflowGraph graph = workflow.getGraph();
            jsonWriter.name("Graph");
            WorkflowGraphJsonMarshaller.getInstance().marshall(graph, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static WorkflowJsonMarshaller instance;

    public static WorkflowJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowJsonMarshaller();
        return instance;
    }
}
