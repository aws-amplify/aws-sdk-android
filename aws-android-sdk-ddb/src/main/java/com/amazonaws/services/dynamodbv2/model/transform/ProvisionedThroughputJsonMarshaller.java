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
 * JSON marshaller for POJO ProvisionedThroughput
 */
class ProvisionedThroughputJsonMarshaller {

    public void marshall(ProvisionedThroughput provisionedThroughput, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (provisionedThroughput.getReadCapacityUnits() != null) {
            Long readCapacityUnits = provisionedThroughput.getReadCapacityUnits();
            jsonWriter.name("ReadCapacityUnits");
            jsonWriter.value(readCapacityUnits);
        }
        if (provisionedThroughput.getWriteCapacityUnits() != null) {
            Long writeCapacityUnits = provisionedThroughput.getWriteCapacityUnits();
            jsonWriter.name("WriteCapacityUnits");
            jsonWriter.value(writeCapacityUnits);
        }
        jsonWriter.endObject();
    }

    private static ProvisionedThroughputJsonMarshaller instance;

    public static ProvisionedThroughputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedThroughputJsonMarshaller();
        return instance;
    }
}
