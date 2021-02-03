/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Statistics
 */
class StatisticsJsonUnmarshaller implements Unmarshaller<Statistics, JsonUnmarshallerContext> {

    public Statistics unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Statistics statistics = new Statistics();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("count")) {
                statistics.setCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("average")) {
                statistics.setAverage(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sum")) {
                statistics.setSum(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("minimum")) {
                statistics.setMinimum(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("maximum")) {
                statistics.setMaximum(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sumOfSquares")) {
                statistics.setSumOfSquares(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("variance")) {
                statistics.setVariance(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("stdDeviation")) {
                statistics.setStdDeviation(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return statistics;
    }

    private static StatisticsJsonUnmarshaller instance;

    public static StatisticsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StatisticsJsonUnmarshaller();
        return instance;
    }
}
