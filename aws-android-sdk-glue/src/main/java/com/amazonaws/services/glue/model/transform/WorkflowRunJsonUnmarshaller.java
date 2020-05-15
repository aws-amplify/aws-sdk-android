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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO WorkflowRun
 */
class WorkflowRunJsonUnmarshaller implements Unmarshaller<WorkflowRun, JsonUnmarshallerContext> {

    public WorkflowRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        WorkflowRun workflowRun = new WorkflowRun();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                workflowRun.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkflowRunId")) {
                workflowRun.setWorkflowRunId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkflowRunProperties")) {
                workflowRun.setWorkflowRunProperties(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("StartedOn")) {
                workflowRun.setStartedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedOn")) {
                workflowRun.setCompletedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                workflowRun.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Statistics")) {
                workflowRun.setStatistics(WorkflowRunStatisticsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Graph")) {
                workflowRun.setGraph(WorkflowGraphJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return workflowRun;
    }

    private static WorkflowRunJsonUnmarshaller instance;

    public static WorkflowRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowRunJsonUnmarshaller();
        return instance;
    }
}
