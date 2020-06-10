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

package com.amazonaws.services.shield.model.transform;

import com.amazonaws.services.shield.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SummarizedCounter
 */
class SummarizedCounterJsonMarshaller {

    public void marshall(SummarizedCounter summarizedCounter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (summarizedCounter.getName() != null) {
            String name = summarizedCounter.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (summarizedCounter.getMax() != null) {
            Double max = summarizedCounter.getMax();
            jsonWriter.name("Max");
            jsonWriter.value(max);
        }
        if (summarizedCounter.getAverage() != null) {
            Double average = summarizedCounter.getAverage();
            jsonWriter.name("Average");
            jsonWriter.value(average);
        }
        if (summarizedCounter.getSum() != null) {
            Double sum = summarizedCounter.getSum();
            jsonWriter.name("Sum");
            jsonWriter.value(sum);
        }
        if (summarizedCounter.getN() != null) {
            Integer n = summarizedCounter.getN();
            jsonWriter.name("N");
            jsonWriter.value(n);
        }
        if (summarizedCounter.getUnit() != null) {
            String unit = summarizedCounter.getUnit();
            jsonWriter.name("Unit");
            jsonWriter.value(unit);
        }
        jsonWriter.endObject();
    }

    private static SummarizedCounterJsonMarshaller instance;

    public static SummarizedCounterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SummarizedCounterJsonMarshaller();
        return instance;
    }
}
