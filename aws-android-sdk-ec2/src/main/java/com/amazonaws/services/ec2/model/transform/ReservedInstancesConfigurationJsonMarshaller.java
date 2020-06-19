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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ReservedInstancesConfiguration
 */
class ReservedInstancesConfigurationJsonMarshaller {

    public void marshall(ReservedInstancesConfiguration reservedInstancesConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservedInstancesConfiguration.getAvailabilityZone() != null) {
            String availabilityZone = reservedInstancesConfiguration.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (reservedInstancesConfiguration.getInstanceCount() != null) {
            Integer instanceCount = reservedInstancesConfiguration.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (reservedInstancesConfiguration.getInstanceType() != null) {
            String instanceType = reservedInstancesConfiguration.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (reservedInstancesConfiguration.getPlatform() != null) {
            String platform = reservedInstancesConfiguration.getPlatform();
            jsonWriter.name("Platform");
            jsonWriter.value(platform);
        }
        if (reservedInstancesConfiguration.getScope() != null) {
            String scope = reservedInstancesConfiguration.getScope();
            jsonWriter.name("Scope");
            jsonWriter.value(scope);
        }
        jsonWriter.endObject();
    }

    private static ReservedInstancesConfigurationJsonMarshaller instance;

    public static ReservedInstancesConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesConfigurationJsonMarshaller();
        return instance;
    }
}
