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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Bundle
 */
class BundleJsonMarshaller {

    public void marshall(Bundle bundle, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (bundle.getPrice() != null) {
            Float price = bundle.getPrice();
            jsonWriter.name("price");
            jsonWriter.value(price);
        }
        if (bundle.getCpuCount() != null) {
            Integer cpuCount = bundle.getCpuCount();
            jsonWriter.name("cpuCount");
            jsonWriter.value(cpuCount);
        }
        if (bundle.getDiskSizeInGb() != null) {
            Integer diskSizeInGb = bundle.getDiskSizeInGb();
            jsonWriter.name("diskSizeInGb");
            jsonWriter.value(diskSizeInGb);
        }
        if (bundle.getBundleId() != null) {
            String bundleId = bundle.getBundleId();
            jsonWriter.name("bundleId");
            jsonWriter.value(bundleId);
        }
        if (bundle.getInstanceType() != null) {
            String instanceType = bundle.getInstanceType();
            jsonWriter.name("instanceType");
            jsonWriter.value(instanceType);
        }
        if (bundle.getIsActive() != null) {
            Boolean isActive = bundle.getIsActive();
            jsonWriter.name("isActive");
            jsonWriter.value(isActive);
        }
        if (bundle.getName() != null) {
            String name = bundle.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (bundle.getPower() != null) {
            Integer power = bundle.getPower();
            jsonWriter.name("power");
            jsonWriter.value(power);
        }
        if (bundle.getRamSizeInGb() != null) {
            Float ramSizeInGb = bundle.getRamSizeInGb();
            jsonWriter.name("ramSizeInGb");
            jsonWriter.value(ramSizeInGb);
        }
        if (bundle.getTransferPerMonthInGb() != null) {
            Integer transferPerMonthInGb = bundle.getTransferPerMonthInGb();
            jsonWriter.name("transferPerMonthInGb");
            jsonWriter.value(transferPerMonthInGb);
        }
        if (bundle.getSupportedPlatforms() != null) {
            java.util.List<String> supportedPlatforms = bundle.getSupportedPlatforms();
            jsonWriter.name("supportedPlatforms");
            jsonWriter.beginArray();
            for (String supportedPlatformsItem : supportedPlatforms) {
                if (supportedPlatformsItem != null) {
                    jsonWriter.value(supportedPlatformsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BundleJsonMarshaller instance;

    public static BundleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BundleJsonMarshaller();
        return instance;
    }
}
