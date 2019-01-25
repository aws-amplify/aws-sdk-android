/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Capacity
 */
class CapacityJsonMarshaller {

    public void marshall(Capacity capacity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (capacity.getCapacityUnits() != null) {
            Double capacityUnits = capacity.getCapacityUnits();
            jsonWriter.name("CapacityUnits");
            jsonWriter.value(capacityUnits);
        }
        jsonWriter.endObject();
    }

    private static CapacityJsonMarshaller instance;

    public static CapacityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CapacityJsonMarshaller();
        return instance;
    }
}
