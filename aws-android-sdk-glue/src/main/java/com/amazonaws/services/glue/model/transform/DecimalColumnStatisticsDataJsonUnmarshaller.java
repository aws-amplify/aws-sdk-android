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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DecimalColumnStatisticsData
 */
class DecimalColumnStatisticsDataJsonUnmarshaller implements
        Unmarshaller<DecimalColumnStatisticsData, JsonUnmarshallerContext> {

    public DecimalColumnStatisticsData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DecimalColumnStatisticsData decimalColumnStatisticsData = new DecimalColumnStatisticsData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MinimumValue")) {
                decimalColumnStatisticsData.setMinimumValue(DecimalNumberJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaximumValue")) {
                decimalColumnStatisticsData.setMaximumValue(DecimalNumberJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfNulls")) {
                decimalColumnStatisticsData.setNumberOfNulls(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfDistinctValues")) {
                decimalColumnStatisticsData.setNumberOfDistinctValues(LongJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return decimalColumnStatisticsData;
    }

    private static DecimalColumnStatisticsDataJsonUnmarshaller instance;

    public static DecimalColumnStatisticsDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DecimalColumnStatisticsDataJsonUnmarshaller();
        return instance;
    }
}
