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
 * JSON marshaller for POJO BrokerNodeInfo
 */
class BrokerNodeInfoJsonMarshaller {

    public void marshall(BrokerNodeInfo brokerNodeInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (brokerNodeInfo.getAttachedENIId() != null) {
            String attachedENIId = brokerNodeInfo.getAttachedENIId();
            jsonWriter.name("AttachedENIId");
            jsonWriter.value(attachedENIId);
        }
        if (brokerNodeInfo.getBrokerId() != null) {
            Double brokerId = brokerNodeInfo.getBrokerId();
            jsonWriter.name("BrokerId");
            jsonWriter.value(brokerId);
        }
        if (brokerNodeInfo.getClientSubnet() != null) {
            String clientSubnet = brokerNodeInfo.getClientSubnet();
            jsonWriter.name("ClientSubnet");
            jsonWriter.value(clientSubnet);
        }
        if (brokerNodeInfo.getClientVpcIpAddress() != null) {
            String clientVpcIpAddress = brokerNodeInfo.getClientVpcIpAddress();
            jsonWriter.name("ClientVpcIpAddress");
            jsonWriter.value(clientVpcIpAddress);
        }
        if (brokerNodeInfo.getCurrentBrokerSoftwareInfo() != null) {
            BrokerSoftwareInfo currentBrokerSoftwareInfo = brokerNodeInfo
                    .getCurrentBrokerSoftwareInfo();
            jsonWriter.name("CurrentBrokerSoftwareInfo");
            BrokerSoftwareInfoJsonMarshaller.getInstance().marshall(currentBrokerSoftwareInfo,
                    jsonWriter);
        }
        if (brokerNodeInfo.getEndpoints() != null) {
            java.util.List<String> endpoints = brokerNodeInfo.getEndpoints();
            jsonWriter.name("Endpoints");
            jsonWriter.beginArray();
            for (String endpointsItem : endpoints) {
                if (endpointsItem != null) {
                    jsonWriter.value(endpointsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BrokerNodeInfoJsonMarshaller instance;

    public static BrokerNodeInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BrokerNodeInfoJsonMarshaller();
        return instance;
    }
}
