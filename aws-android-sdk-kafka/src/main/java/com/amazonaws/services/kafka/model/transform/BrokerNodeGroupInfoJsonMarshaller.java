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
 * JSON marshaller for POJO BrokerNodeGroupInfo
 */
class BrokerNodeGroupInfoJsonMarshaller {

    public void marshall(BrokerNodeGroupInfo brokerNodeGroupInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (brokerNodeGroupInfo.getBrokerAZDistribution() != null) {
            String brokerAZDistribution = brokerNodeGroupInfo.getBrokerAZDistribution();
            jsonWriter.name("BrokerAZDistribution");
            jsonWriter.value(brokerAZDistribution);
        }
        if (brokerNodeGroupInfo.getClientSubnets() != null) {
            java.util.List<String> clientSubnets = brokerNodeGroupInfo.getClientSubnets();
            jsonWriter.name("ClientSubnets");
            jsonWriter.beginArray();
            for (String clientSubnetsItem : clientSubnets) {
                if (clientSubnetsItem != null) {
                    jsonWriter.value(clientSubnetsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (brokerNodeGroupInfo.getInstanceType() != null) {
            String instanceType = brokerNodeGroupInfo.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (brokerNodeGroupInfo.getSecurityGroups() != null) {
            java.util.List<String> securityGroups = brokerNodeGroupInfo.getSecurityGroups();
            jsonWriter.name("SecurityGroups");
            jsonWriter.beginArray();
            for (String securityGroupsItem : securityGroups) {
                if (securityGroupsItem != null) {
                    jsonWriter.value(securityGroupsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (brokerNodeGroupInfo.getStorageInfo() != null) {
            StorageInfo storageInfo = brokerNodeGroupInfo.getStorageInfo();
            jsonWriter.name("StorageInfo");
            StorageInfoJsonMarshaller.getInstance().marshall(storageInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BrokerNodeGroupInfoJsonMarshaller instance;

    public static BrokerNodeGroupInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BrokerNodeGroupInfoJsonMarshaller();
        return instance;
    }
}
