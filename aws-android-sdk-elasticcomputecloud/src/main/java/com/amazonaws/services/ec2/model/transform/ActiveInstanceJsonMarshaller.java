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
 * JSON marshaller for POJO ActiveInstance
 */
class ActiveInstanceJsonMarshaller {

    public void marshall(ActiveInstance activeInstance, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (activeInstance.getInstanceId() != null) {
            String instanceId = activeInstance.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (activeInstance.getInstanceType() != null) {
            String instanceType = activeInstance.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (activeInstance.getSpotInstanceRequestId() != null) {
            String spotInstanceRequestId = activeInstance.getSpotInstanceRequestId();
            jsonWriter.name("SpotInstanceRequestId");
            jsonWriter.value(spotInstanceRequestId);
        }
        if (activeInstance.getInstanceHealth() != null) {
            String instanceHealth = activeInstance.getInstanceHealth();
            jsonWriter.name("InstanceHealth");
            jsonWriter.value(instanceHealth);
        }
        jsonWriter.endObject();
    }

    private static ActiveInstanceJsonMarshaller instance;

    public static ActiveInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActiveInstanceJsonMarshaller();
        return instance;
    }
}
