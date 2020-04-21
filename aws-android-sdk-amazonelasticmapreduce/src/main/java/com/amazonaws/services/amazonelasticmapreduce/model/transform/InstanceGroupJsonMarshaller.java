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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceGroup
 */
class InstanceGroupJsonMarshaller {

    public void marshall(InstanceGroup instanceGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceGroup.getId() != null) {
            String id = instanceGroup.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (instanceGroup.getName() != null) {
            String name = instanceGroup.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (instanceGroup.getMarket() != null) {
            String market = instanceGroup.getMarket();
            jsonWriter.name("Market");
            jsonWriter.value(market);
        }
        if (instanceGroup.getInstanceGroupType() != null) {
            String instanceGroupType = instanceGroup.getInstanceGroupType();
            jsonWriter.name("InstanceGroupType");
            jsonWriter.value(instanceGroupType);
        }
        if (instanceGroup.getBidPrice() != null) {
            String bidPrice = instanceGroup.getBidPrice();
            jsonWriter.name("BidPrice");
            jsonWriter.value(bidPrice);
        }
        if (instanceGroup.getInstanceType() != null) {
            String instanceType = instanceGroup.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instanceGroup.getRequestedInstanceCount() != null) {
            Integer requestedInstanceCount = instanceGroup.getRequestedInstanceCount();
            jsonWriter.name("RequestedInstanceCount");
            jsonWriter.value(requestedInstanceCount);
        }
        if (instanceGroup.getRunningInstanceCount() != null) {
            Integer runningInstanceCount = instanceGroup.getRunningInstanceCount();
            jsonWriter.name("RunningInstanceCount");
            jsonWriter.value(runningInstanceCount);
        }
        if (instanceGroup.getStatus() != null) {
            InstanceGroupStatus status = instanceGroup.getStatus();
            jsonWriter.name("Status");
            InstanceGroupStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (instanceGroup.getConfigurations() != null) {
            java.util.List<Configuration> configurations = instanceGroup.getConfigurations();
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
        if (instanceGroup.getConfigurationsVersion() != null) {
            Long configurationsVersion = instanceGroup.getConfigurationsVersion();
            jsonWriter.name("ConfigurationsVersion");
            jsonWriter.value(configurationsVersion);
        }
        if (instanceGroup.getLastSuccessfullyAppliedConfigurations() != null) {
            java.util.List<Configuration> lastSuccessfullyAppliedConfigurations = instanceGroup
                    .getLastSuccessfullyAppliedConfigurations();
            jsonWriter.name("LastSuccessfullyAppliedConfigurations");
            jsonWriter.beginArray();
            for (Configuration lastSuccessfullyAppliedConfigurationsItem : lastSuccessfullyAppliedConfigurations) {
                if (lastSuccessfullyAppliedConfigurationsItem != null) {
                    ConfigurationJsonMarshaller.getInstance().marshall(
                            lastSuccessfullyAppliedConfigurationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceGroup.getLastSuccessfullyAppliedConfigurationsVersion() != null) {
            Long lastSuccessfullyAppliedConfigurationsVersion = instanceGroup
                    .getLastSuccessfullyAppliedConfigurationsVersion();
            jsonWriter.name("LastSuccessfullyAppliedConfigurationsVersion");
            jsonWriter.value(lastSuccessfullyAppliedConfigurationsVersion);
        }
        if (instanceGroup.getEbsBlockDevices() != null) {
            java.util.List<EbsBlockDevice> ebsBlockDevices = instanceGroup.getEbsBlockDevices();
            jsonWriter.name("EbsBlockDevices");
            jsonWriter.beginArray();
            for (EbsBlockDevice ebsBlockDevicesItem : ebsBlockDevices) {
                if (ebsBlockDevicesItem != null) {
                    EbsBlockDeviceJsonMarshaller.getInstance().marshall(ebsBlockDevicesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceGroup.getEbsOptimized() != null) {
            Boolean ebsOptimized = instanceGroup.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        if (instanceGroup.getShrinkPolicy() != null) {
            ShrinkPolicy shrinkPolicy = instanceGroup.getShrinkPolicy();
            jsonWriter.name("ShrinkPolicy");
            ShrinkPolicyJsonMarshaller.getInstance().marshall(shrinkPolicy, jsonWriter);
        }
        if (instanceGroup.getAutoScalingPolicy() != null) {
            AutoScalingPolicyDescription autoScalingPolicy = instanceGroup.getAutoScalingPolicy();
            jsonWriter.name("AutoScalingPolicy");
            AutoScalingPolicyDescriptionJsonMarshaller.getInstance().marshall(autoScalingPolicy,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceGroupJsonMarshaller instance;

    public static InstanceGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceGroupJsonMarshaller();
        return instance;
    }
}
