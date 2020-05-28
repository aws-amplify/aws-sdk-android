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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NodeInfo
 */
class NodeInfoJsonUnmarshaller implements Unmarshaller<NodeInfo, JsonUnmarshallerContext> {

    public NodeInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NodeInfo nodeInfo = new NodeInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AddedToClusterTime")) {
                nodeInfo.setAddedToClusterTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BrokerNodeInfo")) {
                nodeInfo.setBrokerNodeInfo(BrokerNodeInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceType")) {
                nodeInfo.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NodeARN")) {
                nodeInfo.setNodeARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NodeType")) {
                nodeInfo.setNodeType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ZookeeperNodeInfo")) {
                nodeInfo.setZookeeperNodeInfo(ZookeeperNodeInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return nodeInfo;
    }

    private static NodeInfoJsonUnmarshaller instance;

    public static NodeInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NodeInfoJsonUnmarshaller();
        return instance;
    }
}
