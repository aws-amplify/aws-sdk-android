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
 * JSON marshaller for POJO AvailableCapacity
 */
class AvailableCapacityJsonMarshaller {

    public void marshall(AvailableCapacity availableCapacity, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (availableCapacity.getAvailableInstanceCapacity() != null) {
            java.util.List<InstanceCapacity> availableInstanceCapacity = availableCapacity
                    .getAvailableInstanceCapacity();
            jsonWriter.name("AvailableInstanceCapacity");
            jsonWriter.beginArray();
            for (InstanceCapacity availableInstanceCapacityItem : availableInstanceCapacity) {
                if (availableInstanceCapacityItem != null) {
                    InstanceCapacityJsonMarshaller.getInstance().marshall(
                            availableInstanceCapacityItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (availableCapacity.getAvailableVCpus() != null) {
            Integer availableVCpus = availableCapacity.getAvailableVCpus();
            jsonWriter.name("AvailableVCpus");
            jsonWriter.value(availableVCpus);
        }
        jsonWriter.endObject();
    }

    private static AvailableCapacityJsonMarshaller instance;

    public static AvailableCapacityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AvailableCapacityJsonMarshaller();
        return instance;
    }
}
