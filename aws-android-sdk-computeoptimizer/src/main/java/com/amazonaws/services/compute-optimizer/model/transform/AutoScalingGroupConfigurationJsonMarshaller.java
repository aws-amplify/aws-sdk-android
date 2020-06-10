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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoScalingGroupConfiguration
 */
class AutoScalingGroupConfigurationJsonMarshaller {

    public void marshall(AutoScalingGroupConfiguration autoScalingGroupConfiguration, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (autoScalingGroupConfiguration.getDesiredCapacity() != null) {
            Integer desiredCapacity = autoScalingGroupConfiguration.getDesiredCapacity();
            jsonWriter.name("desiredCapacity");
            jsonWriter.value(desiredCapacity);
        }
        if (autoScalingGroupConfiguration.getMinSize() != null) {
            Integer minSize = autoScalingGroupConfiguration.getMinSize();
            jsonWriter.name("minSize");
            jsonWriter.value(minSize);
        }
        if (autoScalingGroupConfiguration.getMaxSize() != null) {
            Integer maxSize = autoScalingGroupConfiguration.getMaxSize();
            jsonWriter.name("maxSize");
            jsonWriter.value(maxSize);
        }
        if (autoScalingGroupConfiguration.getInstanceType() != null) {
            String instanceType = autoScalingGroupConfiguration.getInstanceType();
            jsonWriter.name("instanceType");
            jsonWriter.value(instanceType);
        }
        jsonWriter.endObject();
    }

    private static AutoScalingGroupConfigurationJsonMarshaller instance;
    public static AutoScalingGroupConfigurationJsonMarshaller getInstance() {
        if (instance == null) instance = new AutoScalingGroupConfigurationJsonMarshaller();
        return instance;
    }
}
