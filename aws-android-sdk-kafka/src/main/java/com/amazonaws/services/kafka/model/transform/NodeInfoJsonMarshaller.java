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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NodeInfo
 */
class NodeInfoJsonMarshaller {

    public void marshall(NodeInfo nodeInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (nodeInfo.getAddedToClusterTime() != null) {
            String addedToClusterTime = nodeInfo.getAddedToClusterTime();
            jsonWriter.name("AddedToClusterTime");
            jsonWriter.value(addedToClusterTime);
        }
        if (nodeInfo.getBrokerNodeInfo() != null) {
            BrokerNodeInfo brokerNodeInfo = nodeInfo.getBrokerNodeInfo();
            jsonWriter.name("BrokerNodeInfo");
            BrokerNodeInfoJsonMarshaller.getInstance().marshall(brokerNodeInfo, jsonWriter);
        }
        if (nodeInfo.getInstanceType() != null) {
            String instanceType = nodeInfo.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (nodeInfo.getNodeARN() != null) {
            String nodeARN = nodeInfo.getNodeARN();
            jsonWriter.name("NodeARN");
            jsonWriter.value(nodeARN);
        }
        if (nodeInfo.getNodeType() != null) {
            String nodeType = nodeInfo.getNodeType();
            jsonWriter.name("NodeType");
            jsonWriter.value(nodeType);
        }
        if (nodeInfo.getZookeeperNodeInfo() != null) {
            ZookeeperNodeInfo zookeeperNodeInfo = nodeInfo.getZookeeperNodeInfo();
            jsonWriter.name("ZookeeperNodeInfo");
            ZookeeperNodeInfoJsonMarshaller.getInstance().marshall(zookeeperNodeInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NodeInfoJsonMarshaller instance;

    public static NodeInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NodeInfoJsonMarshaller();
        return instance;
    }
}
