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
 * JSON marshaller for POJO InstanceTypeSpecification
 */
class InstanceTypeSpecificationJsonMarshaller {

    public void marshall(InstanceTypeSpecification instanceTypeSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceTypeSpecification.getInstanceType() != null) {
            String instanceType = instanceTypeSpecification.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (instanceTypeSpecification.getWeightedCapacity() != null) {
            Integer weightedCapacity = instanceTypeSpecification.getWeightedCapacity();
            jsonWriter.name("WeightedCapacity");
            jsonWriter.value(weightedCapacity);
        }
        if (instanceTypeSpecification.getBidPrice() != null) {
            String bidPrice = instanceTypeSpecification.getBidPrice();
            jsonWriter.name("BidPrice");
            jsonWriter.value(bidPrice);
        }
        if (instanceTypeSpecification.getBidPriceAsPercentageOfOnDemandPrice() != null) {
            Double bidPriceAsPercentageOfOnDemandPrice = instanceTypeSpecification
                    .getBidPriceAsPercentageOfOnDemandPrice();
            jsonWriter.name("BidPriceAsPercentageOfOnDemandPrice");
            jsonWriter.value(bidPriceAsPercentageOfOnDemandPrice);
        }
        if (instanceTypeSpecification.getConfigurations() != null) {
            java.util.List<Configuration> configurations = instanceTypeSpecification
                    .getConfigurations();
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
        if (instanceTypeSpecification.getEbsBlockDevices() != null) {
            java.util.List<EbsBlockDevice> ebsBlockDevices = instanceTypeSpecification
                    .getEbsBlockDevices();
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
        if (instanceTypeSpecification.getEbsOptimized() != null) {
            Boolean ebsOptimized = instanceTypeSpecification.getEbsOptimized();
            jsonWriter.name("EbsOptimized");
            jsonWriter.value(ebsOptimized);
        }
        jsonWriter.endObject();
    }

    private static InstanceTypeSpecificationJsonMarshaller instance;

    public static InstanceTypeSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTypeSpecificationJsonMarshaller();
        return instance;
    }
}
