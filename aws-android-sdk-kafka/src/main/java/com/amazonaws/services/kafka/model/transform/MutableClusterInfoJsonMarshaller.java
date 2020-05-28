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
 * JSON marshaller for POJO MutableClusterInfo
 */
class MutableClusterInfoJsonMarshaller {

    public void marshall(MutableClusterInfo mutableClusterInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mutableClusterInfo.getBrokerEBSVolumeInfo() != null) {
            java.util.List<BrokerEBSVolumeInfo> brokerEBSVolumeInfo = mutableClusterInfo
                    .getBrokerEBSVolumeInfo();
            jsonWriter.name("BrokerEBSVolumeInfo");
            jsonWriter.beginArray();
            for (BrokerEBSVolumeInfo brokerEBSVolumeInfoItem : brokerEBSVolumeInfo) {
                if (brokerEBSVolumeInfoItem != null) {
                    BrokerEBSVolumeInfoJsonMarshaller.getInstance().marshall(
                            brokerEBSVolumeInfoItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (mutableClusterInfo.getConfigurationInfo() != null) {
            ConfigurationInfo configurationInfo = mutableClusterInfo.getConfigurationInfo();
            jsonWriter.name("ConfigurationInfo");
            ConfigurationInfoJsonMarshaller.getInstance().marshall(configurationInfo, jsonWriter);
        }
        if (mutableClusterInfo.getNumberOfBrokerNodes() != null) {
            Integer numberOfBrokerNodes = mutableClusterInfo.getNumberOfBrokerNodes();
            jsonWriter.name("NumberOfBrokerNodes");
            jsonWriter.value(numberOfBrokerNodes);
        }
        if (mutableClusterInfo.getEnhancedMonitoring() != null) {
            String enhancedMonitoring = mutableClusterInfo.getEnhancedMonitoring();
            jsonWriter.name("EnhancedMonitoring");
            jsonWriter.value(enhancedMonitoring);
        }
        if (mutableClusterInfo.getOpenMonitoring() != null) {
            OpenMonitoring openMonitoring = mutableClusterInfo.getOpenMonitoring();
            jsonWriter.name("OpenMonitoring");
            OpenMonitoringJsonMarshaller.getInstance().marshall(openMonitoring, jsonWriter);
        }
        if (mutableClusterInfo.getKafkaVersion() != null) {
            String kafkaVersion = mutableClusterInfo.getKafkaVersion();
            jsonWriter.name("KafkaVersion");
            jsonWriter.value(kafkaVersion);
        }
        if (mutableClusterInfo.getLoggingInfo() != null) {
            LoggingInfo loggingInfo = mutableClusterInfo.getLoggingInfo();
            jsonWriter.name("LoggingInfo");
            LoggingInfoJsonMarshaller.getInstance().marshall(loggingInfo, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MutableClusterInfoJsonMarshaller instance;

    public static MutableClusterInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MutableClusterInfoJsonMarshaller();
        return instance;
    }
}
