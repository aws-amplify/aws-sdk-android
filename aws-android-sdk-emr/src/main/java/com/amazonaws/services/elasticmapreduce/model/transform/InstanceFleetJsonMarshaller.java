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
 * JSON marshaller for POJO InstanceFleet
 */
class InstanceFleetJsonMarshaller {

    public void marshall(InstanceFleet instanceFleet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceFleet.getId() != null) {
            String id = instanceFleet.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (instanceFleet.getName() != null) {
            String name = instanceFleet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (instanceFleet.getStatus() != null) {
            InstanceFleetStatus status = instanceFleet.getStatus();
            jsonWriter.name("Status");
            InstanceFleetStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (instanceFleet.getInstanceFleetType() != null) {
            String instanceFleetType = instanceFleet.getInstanceFleetType();
            jsonWriter.name("InstanceFleetType");
            jsonWriter.value(instanceFleetType);
        }
        if (instanceFleet.getTargetOnDemandCapacity() != null) {
            Integer targetOnDemandCapacity = instanceFleet.getTargetOnDemandCapacity();
            jsonWriter.name("TargetOnDemandCapacity");
            jsonWriter.value(targetOnDemandCapacity);
        }
        if (instanceFleet.getTargetSpotCapacity() != null) {
            Integer targetSpotCapacity = instanceFleet.getTargetSpotCapacity();
            jsonWriter.name("TargetSpotCapacity");
            jsonWriter.value(targetSpotCapacity);
        }
        if (instanceFleet.getProvisionedOnDemandCapacity() != null) {
            Integer provisionedOnDemandCapacity = instanceFleet.getProvisionedOnDemandCapacity();
            jsonWriter.name("ProvisionedOnDemandCapacity");
            jsonWriter.value(provisionedOnDemandCapacity);
        }
        if (instanceFleet.getProvisionedSpotCapacity() != null) {
            Integer provisionedSpotCapacity = instanceFleet.getProvisionedSpotCapacity();
            jsonWriter.name("ProvisionedSpotCapacity");
            jsonWriter.value(provisionedSpotCapacity);
        }
        if (instanceFleet.getInstanceTypeSpecifications() != null) {
            java.util.List<InstanceTypeSpecification> instanceTypeSpecifications = instanceFleet
                    .getInstanceTypeSpecifications();
            jsonWriter.name("InstanceTypeSpecifications");
            jsonWriter.beginArray();
            for (InstanceTypeSpecification instanceTypeSpecificationsItem : instanceTypeSpecifications) {
                if (instanceTypeSpecificationsItem != null) {
                    InstanceTypeSpecificationJsonMarshaller.getInstance().marshall(
                            instanceTypeSpecificationsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (instanceFleet.getLaunchSpecifications() != null) {
            InstanceFleetProvisioningSpecifications launchSpecifications = instanceFleet
                    .getLaunchSpecifications();
            jsonWriter.name("LaunchSpecifications");
            InstanceFleetProvisioningSpecificationsJsonMarshaller.getInstance().marshall(
                    launchSpecifications, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static InstanceFleetJsonMarshaller instance;

    public static InstanceFleetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceFleetJsonMarshaller();
        return instance;
    }
}
