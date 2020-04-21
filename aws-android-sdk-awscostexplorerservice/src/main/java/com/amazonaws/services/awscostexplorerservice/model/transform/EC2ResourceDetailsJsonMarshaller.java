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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EC2ResourceDetails
 */
class EC2ResourceDetailsJsonMarshaller {

    public void marshall(EC2ResourceDetails eC2ResourceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eC2ResourceDetails.getHourlyOnDemandRate() != null) {
            String hourlyOnDemandRate = eC2ResourceDetails.getHourlyOnDemandRate();
            jsonWriter.name("HourlyOnDemandRate");
            jsonWriter.value(hourlyOnDemandRate);
        }
        if (eC2ResourceDetails.getInstanceType() != null) {
            String instanceType = eC2ResourceDetails.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (eC2ResourceDetails.getPlatform() != null) {
            String platform = eC2ResourceDetails.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (eC2ResourceDetails.getRegion() != null) {
            String region = eC2ResourceDetails.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        if (eC2ResourceDetails.getSku() != null) {
            String sku = eC2ResourceDetails.getSku();
            jsonWriter.name("Sku");
            jsonWriter.value(sku);
        }
        if (eC2ResourceDetails.getMemory() != null) {
            String memory = eC2ResourceDetails.getMemory();
            jsonWriter.name("Memory");
            jsonWriter.value(memory);
        }
        if (eC2ResourceDetails.getNetworkPerformance() != null) {
            String networkPerformance = eC2ResourceDetails.getNetworkPerformance();
            jsonWriter.name("NetworkPerformance");
            jsonWriter.value(networkPerformance);
        }
        if (eC2ResourceDetails.getStorage() != null) {
            String storage = eC2ResourceDetails.getStorage();
            jsonWriter.name("Storage");
            jsonWriter.value(storage);
        }
        if (eC2ResourceDetails.getVcpu() != null) {
            String vcpu = eC2ResourceDetails.getVcpu();
            jsonWriter.name("Vcpu");
            jsonWriter.value(vcpu);
        }
        jsonWriter.endObject();
    }

    private static EC2ResourceDetailsJsonMarshaller instance;

    public static EC2ResourceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EC2ResourceDetailsJsonMarshaller();
        return instance;
    }
}
