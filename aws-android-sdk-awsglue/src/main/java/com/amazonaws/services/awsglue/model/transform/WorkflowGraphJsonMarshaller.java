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
 * JSON marshaller for POJO WorkflowGraph
 */
class WorkflowGraphJsonMarshaller {

    public void marshall(WorkflowGraph workflowGraph, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (workflowGraph.getNodes() != null) {
            java.util.List<Node> nodes = workflowGraph.getNodes();
            jsonWriter.name("Nodes");
            jsonWriter.beginArray();
            for (Node nodesItem : nodes) {
                if (nodesItem != null) {
                    NodeJsonMarshaller.getInstance().marshall(nodesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (workflowGraph.getEdges() != null) {
            java.util.List<Edge> edges = workflowGraph.getEdges();
            jsonWriter.name("Edges");
            jsonWriter.beginArray();
            for (Edge edgesItem : edges) {
                if (edgesItem != null) {
                    EdgeJsonMarshaller.getInstance().marshall(edgesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static WorkflowGraphJsonMarshaller instance;

    public static WorkflowGraphJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowGraphJsonMarshaller();
        return instance;
    }
}
