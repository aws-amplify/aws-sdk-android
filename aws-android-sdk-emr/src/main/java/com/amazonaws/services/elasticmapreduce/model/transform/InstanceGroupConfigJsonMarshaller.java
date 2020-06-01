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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceGroupConfig
 */
class InstanceGroupConfigJsonMarshaller {

    public void marshall(InstanceGroupConfig instanceGroupConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceGroupConfig.getName() != null) {
            String name = instanceGroupConfig.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (instanceGroupConfig.getMarket() != null) {
            String market = instanceGroupConfig.getMarket();
            jsonWriter.name("Market");
            jsonWriter.value(market);
        }
        if (instanceGroupConfig.getInstanceRole() != null) {
            String instanceRole = instanceGroupConfig.getInstanceRole();
            jsonWriter.name("InstanceRole");
            jsonWriter.value(instanceRole);
        }
        if (instanceGroupConfig.getBidPrice() != null) {
            String bidPrice = instanceGroupConfig.getBidPrice();
            jsonWriter.name("BidPrice");
            jsonWriter.value(bidPrice);
        }
        if (instanceGroupConfig.getInstanceType() != null) {
            String instanceType = instanceGroupConfig.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instanceGroupConfig.getInstanceCount() != null) {
            Integer instanceCount = instanceGroupConfig.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (instanceGroupConfig.getConfigurations() != null) {
            java.util.List<Configuration> configurations = instanceGroupConfig.getConfigurations();
            jsonWriter.name("Configurations");
            jsonWriter.beginArray();
            for (Configuration configurationsItem : configurations) {
                if (configurationsItem != null) {
                    ConfigurationJsonMarshaller.getInstance().marshall(configurationsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceGroupConfig.getEbsConfiguration() != null) {
            EbsConfiguration ebsConfiguration = instanceGroupConfig.getEbsConfiguration();
            jsonWriter.name("EbsConfiguration");
            EbsConfigurationJsonMarshaller.getInstance().marshall(ebsConfiguration, jsonWriter);
        }
        if (instanceGroupConfig.getAutoScalingPolicy() != null) {
            AutoScalingPolicy autoScalingPolicy = instanceGroupConfig.getAutoScalingPolicy();
            jsonWriter.name("AutoScalingPolicy");
            AutoScalingPolicyJsonMarshaller.getInstance().marshall(autoScalingPolicy, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceGroupConfigJsonMarshaller instance;

    public static InstanceGroupConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupConfigJsonMarshaller();
        return instance;
    }
}
