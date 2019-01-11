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
 * JSON marshaller for POJO ProvisionedThroughputDescription
 */
class ProvisionedThroughputDescriptionJsonMarshaller {

    public void marshall(ProvisionedThroughputDescription provisionedThroughputDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (provisionedThroughputDescription.getLastIncreaseDateTime() != null) {
            java.util.Date lastIncreaseDateTime = provisionedThroughputDescription
                    .getLastIncreaseDateTime();
            jsonWriter.name("LastIncreaseDateTime");
            jsonWriter.value(lastIncreaseDateTime);
        }
        if (provisionedThroughputDescription.getLastDecreaseDateTime() != null) {
            java.util.Date lastDecreaseDateTime = provisionedThroughputDescription
                    .getLastDecreaseDateTime();
            jsonWriter.name("LastDecreaseDateTime");
            jsonWriter.value(lastDecreaseDateTime);
        }
        if (provisionedThroughputDescription.getNumberOfDecreasesToday() != null) {
            Long numberOfDecreasesToday = provisionedThroughputDescription
                    .getNumberOfDecreasesToday();
            jsonWriter.name("NumberOfDecreasesToday");
            jsonWriter.value(numberOfDecreasesToday);
        }
        if (provisionedThroughputDescription.getReadCapacityUnits() != null) {
            Long readCapacityUnits = provisionedThroughputDescription.getReadCapacityUnits();
            jsonWriter.name("ReadCapacityUnits");
            jsonWriter.value(readCapacityUnits);
        }
        if (provisionedThroughputDescription.getWriteCapacityUnits() != null) {
            Long writeCapacityUnits = provisionedThroughputDescription.getWriteCapacityUnits();
            jsonWriter.name("WriteCapacityUnits");
            jsonWriter.value(writeCapacityUnits);
        }
        jsonWriter.endObject();
    }

    private static ProvisionedThroughputDescriptionJsonMarshaller instance;

    public static ProvisionedThroughputDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedThroughputDescriptionJsonMarshaller();
        return instance;
    }
}
