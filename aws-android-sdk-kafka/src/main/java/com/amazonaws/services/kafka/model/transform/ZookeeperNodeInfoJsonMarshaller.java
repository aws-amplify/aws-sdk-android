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
 * JSON marshaller for POJO ZookeeperNodeInfo
 */
class ZookeeperNodeInfoJsonMarshaller {

    public void marshall(ZookeeperNodeInfo zookeeperNodeInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (zookeeperNodeInfo.getAttachedENIId() != null) {
            String attachedENIId = zookeeperNodeInfo.getAttachedENIId();
            jsonWriter.name("AttachedENIId");
            jsonWriter.value(attachedENIId);
        }
        if (zookeeperNodeInfo.getClientVpcIpAddress() != null) {
            String clientVpcIpAddress = zookeeperNodeInfo.getClientVpcIpAddress();
            jsonWriter.name("ClientVpcIpAddress");
            jsonWriter.value(clientVpcIpAddress);
        }
        if (zookeeperNodeInfo.getEndpoints() != null) {
            java.util.List<String> endpoints = zookeeperNodeInfo.getEndpoints();
            jsonWriter.name("Endpoints");
            jsonWriter.beginArray();
            for (String endpointsItem : endpoints) {
                if (endpointsItem != null) {
                    jsonWriter.value(endpointsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (zookeeperNodeInfo.getZookeeperId() != null) {
            Double zookeeperId = zookeeperNodeInfo.getZookeeperId();
            jsonWriter.name("ZookeeperId");
            jsonWriter.value(zookeeperId);
        }
        if (zookeeperNodeInfo.getZookeeperVersion() != null) {
            String zookeeperVersion = zookeeperNodeInfo.getZookeeperVersion();
            jsonWriter.name("ZookeeperVersion");
            jsonWriter.value(zookeeperVersion);
        }
        jsonWriter.endObject();
    }

    private static ZookeeperNodeInfoJsonMarshaller instance;

    public static ZookeeperNodeInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ZookeeperNodeInfoJsonMarshaller();
        return instance;
    }
}
