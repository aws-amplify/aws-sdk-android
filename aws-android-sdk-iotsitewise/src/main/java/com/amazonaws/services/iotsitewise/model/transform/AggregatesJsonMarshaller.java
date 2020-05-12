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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Aggregates
 */
class AggregatesJsonMarshaller {

    public void marshall(Aggregates aggregates, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (aggregates.getAverage() != null) {
            Double average = aggregates.getAverage();
            jsonWriter.name("average");
            jsonWriter.value(average);
        }
        if (aggregates.getCount() != null) {
            Double count = aggregates.getCount();
            jsonWriter.name("count");
            jsonWriter.value(count);
        }
        if (aggregates.getMaximum() != null) {
            Double maximum = aggregates.getMaximum();
            jsonWriter.name("maximum");
            jsonWriter.value(maximum);
        }
        if (aggregates.getMinimum() != null) {
            Double minimum = aggregates.getMinimum();
            jsonWriter.name("minimum");
            jsonWriter.value(minimum);
        }
        if (aggregates.getSum() != null) {
            Double sum = aggregates.getSum();
            jsonWriter.name("sum");
            jsonWriter.value(sum);
        }
        jsonWriter.endObject();
    }

    private static AggregatesJsonMarshaller instance;

    public static AggregatesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AggregatesJsonMarshaller();
        return instance;
    }
}
