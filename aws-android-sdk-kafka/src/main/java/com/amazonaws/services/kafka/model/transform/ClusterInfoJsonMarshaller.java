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
 * JSON marshaller for POJO ClusterInfo
 */
class ClusterInfoJsonMarshaller {

    public void marshall(ClusterInfo clusterInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (clusterInfo.getActiveOperationArn() != null) {
            String activeOperationArn = clusterInfo.getActiveOperationArn();
            jsonWriter.name("ActiveOperationArn");
            jsonWriter.value(activeOperationArn);
        }
        if (clusterInfo.getBrokerNodeGroupInfo() != null) {
            BrokerNodeGroupInfo brokerNodeGroupInfo = clusterInfo.getBrokerNodeGroupInfo();
            jsonWriter.name("BrokerNodeGroupInfo");
            BrokerNodeGroupInfoJsonMarshaller.getInstance().marshall(brokerNodeGroupInfo,
                    jsonWriter);
        }
        if (clusterInfo.getClientAuthentication() != null) {
            ClientAuthentication clientAuthentication = clusterInfo.getClientAuthentication();
            jsonWriter.name("ClientAuthentication");
            ClientAuthenticationJsonMarshaller.getInstance().marshall(clientAuthentication,
                    jsonWriter);
        }
        if (clusterInfo.getClusterArn() != null) {
            String clusterArn = clusterInfo.getClusterArn();
            jsonWriter.name("ClusterArn");
            jsonWriter.value(clusterArn);
        }
        if (clusterInfo.getClusterName() != null) {
            String clusterName = clusterInfo.getClusterName();
            jsonWriter.name("ClusterName");
            jsonWriter.value(clusterName);
        }
        if (clusterInfo.getCreationTime() != null) {
            java.util.Date creationTime = clusterInfo.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (clusterInfo.getCurrentBrokerSoftwareInfo() != null) {
            BrokerSoftwareInfo currentBrokerSoftwareInfo = clusterInfo
                    .getCurrentBrokerSoftwareInfo();
            jsonWriter.name("CurrentBrokerSoftwareInfo");
            BrokerSoftwareInfoJsonMarshaller.getInstance().marshall(currentBrokerSoftwareInfo,
                    jsonWriter);
        }
        if (clusterInfo.getCurrentVersion() != null) {
            String currentVersion = clusterInfo.getCurrentVersion();
            jsonWriter.name("CurrentVersion");
            jsonWriter.value(currentVersion);
        }
        if (clusterInfo.getEncryptionInfo() != null) {
            EncryptionInfo encryptionInfo = clusterInfo.getEncryptionInfo();
            jsonWriter.name("EncryptionInfo");
            EncryptionInfoJsonMarshaller.getInstance().marshall(encryptionInfo, jsonWriter);
        }
        if (clusterInfo.getEnhancedMonitoring() != null) {
            String enhancedMonitoring = clusterInfo.getEnhancedMonitoring();
            jsonWriter.name("EnhancedMonitoring");
            jsonWriter.value(enhancedMonitoring);
        }
        if (clusterInfo.getOpenMonitoring() != null) {
            OpenMonitoring openMonitoring = clusterInfo.getOpenMonitoring();
            jsonWriter.name("OpenMonitoring");
            OpenMonitoringJsonMarshaller.getInstance().marshall(openMonitoring, jsonWriter);
        }
        if (clusterInfo.getLoggingInfo() != null) {
            LoggingInfo loggingInfo = clusterInfo.getLoggingInfo();
            jsonWriter.name("LoggingInfo");
            LoggingInfoJsonMarshaller.getInstance().marshall(loggingInfo, jsonWriter);
        }
        if (clusterInfo.getNumberOfBrokerNodes() != null) {
            Integer numberOfBrokerNodes = clusterInfo.getNumberOfBrokerNodes();
            jsonWriter.name("NumberOfBrokerNodes");
            jsonWriter.value(numberOfBrokerNodes);
        }
        if (clusterInfo.getState() != null) {
            String state = clusterInfo.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (clusterInfo.getStateInfo() != null) {
            StateInfo stateInfo = clusterInfo.getStateInfo();
            jsonWriter.name("StateInfo");
            StateInfoJsonMarshaller.getInstance().marshall(stateInfo, jsonWriter);
        }
        if (clusterInfo.getTags() != null) {
            java.util.Map<String, String> tags = clusterInfo.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (clusterInfo.getZookeeperConnectString() != null) {
            String zookeeperConnectString = clusterInfo.getZookeeperConnectString();
            jsonWriter.name("ZookeeperConnectString");
            jsonWriter.value(zookeeperConnectString);
        }
        jsonWriter.endObject();
    }

    private static ClusterInfoJsonMarshaller instance;

    public static ClusterInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterInfoJsonMarshaller();
        return instance;
    }
}
