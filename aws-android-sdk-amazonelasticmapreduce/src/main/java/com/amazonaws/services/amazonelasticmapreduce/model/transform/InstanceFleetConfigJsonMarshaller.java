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
 * JSON marshaller for POJO InstanceFleetConfig
 */
class InstanceFleetConfigJsonMarshaller {

    public void marshall(InstanceFleetConfig instanceFleetConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceFleetConfig.getName() != null) {
            String name = instanceFleetConfig.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (instanceFleetConfig.getInstanceFleetType() != null) {
            String instanceFleetType = instanceFleetConfig.getInstanceFleetType();
            jsonWriter.name("InstanceFleetType");
            jsonWriter.value(instanceFleetType);
        }
        if (instanceFleetConfig.getTargetOnDemandCapacity() != null) {
            Integer targetOnDemandCapacity = instanceFleetConfig.getTargetOnDemandCapacity();
            jsonWriter.name("TargetOnDemandCapacity");
            jsonWriter.value(targetOnDemandCapacity);
        }
        if (instanceFleetConfig.getTargetSpotCapacity() != null) {
            Integer targetSpotCapacity = instanceFleetConfig.getTargetSpotCapacity();
            jsonWriter.name("TargetSpotCapacity");
            jsonWriter.value(targetSpotCapacity);
        }
        if (instanceFleetConfig.getInstanceTypeConfigs() != null) {
            java.util.List<InstanceTypeConfig> instanceTypeConfigs = instanceFleetConfig
                    .getInstanceTypeConfigs();
            jsonWriter.name("InstanceTypeConfigs");
            jsonWriter.beginArray();
            for (InstanceTypeConfig instanceTypeConfigsItem : instanceTypeConfigs) {
                if (instanceTypeConfigsItem != null) {
                    InstanceTypeConfigJsonMarshaller.getInstance().marshall(
                            instanceTypeConfigsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceFleetConfig.getLaunchSpecifications() != null) {
            InstanceFleetProvisioningSpecifications launchSpecifications = instanceFleetConfig
                    .getLaunchSpecifications();
            jsonWriter.name("LaunchSpecifications");
            InstanceFleetProvisioningSpecificationsJsonMarshaller.getInstance().marshall(
                    launchSpecifications, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceFleetConfigJsonMarshaller instance;

    public static InstanceFleetConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceFleetConfigJsonMarshaller();
        return instance;
    }
}
