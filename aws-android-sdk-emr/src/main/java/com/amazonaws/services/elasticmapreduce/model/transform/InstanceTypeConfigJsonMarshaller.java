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
 * JSON marshaller for POJO InstanceTypeConfig
 */
class InstanceTypeConfigJsonMarshaller {

    public void marshall(InstanceTypeConfig instanceTypeConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceTypeConfig.getInstanceType() != null) {
            String instanceType = instanceTypeConfig.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instanceTypeConfig.getWeightedCapacity() != null) {
            Integer weightedCapacity = instanceTypeConfig.getWeightedCapacity();
            jsonWriter.name("WeightedCapacity");
            jsonWriter.value(weightedCapacity);
        }
        if (instanceTypeConfig.getBidPrice() != null) {
            String bidPrice = instanceTypeConfig.getBidPrice();
            jsonWriter.name("BidPrice");
            jsonWriter.value(bidPrice);
        }
        if (instanceTypeConfig.getBidPriceAsPercentageOfOnDemandPrice() != null) {
            Double bidPriceAsPercentageOfOnDemandPrice = instanceTypeConfig
                    .getBidPriceAsPercentageOfOnDemandPrice();
            jsonWriter.name("BidPriceAsPercentageOfOnDemandPrice");
            jsonWriter.value(bidPriceAsPercentageOfOnDemandPrice);
        }
        if (instanceTypeConfig.getEbsConfiguration() != null) {
            EbsConfiguration ebsConfiguration = instanceTypeConfig.getEbsConfiguration();
            jsonWriter.name("EbsConfiguration");
            EbsConfigurationJsonMarshaller.getInstance().marshall(ebsConfiguration, jsonWriter);
        }
        if (instanceTypeConfig.getConfigurations() != null) {
            java.util.List<Configuration> configurations = instanceTypeConfig.getConfigurations();
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
        jsonWriter.endObject();
    }

    private static InstanceTypeConfigJsonMarshaller instance;

    public static InstanceTypeConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTypeConfigJsonMarshaller();
        return instance;
    }
}
