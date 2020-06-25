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
 * JSON unmarshaller for POJO BinaryColumnStatisticsData
 */
class BinaryColumnStatisticsDataJsonUnmarshaller implements
        Unmarshaller<BinaryColumnStatisticsData, JsonUnmarshallerContext> {

    public BinaryColumnStatisticsData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        BinaryColumnStatisticsData binaryColumnStatisticsData = new BinaryColumnStatisticsData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("MaximumLength")) {
                binaryColumnStatisticsData.setMaximumLength(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AverageLength")) {
                binaryColumnStatisticsData.setAverageLength(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberOfNulls")) {
                binaryColumnStatisticsData.setNumberOfNulls(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return binaryColumnStatisticsData;
    }

    private static BinaryColumnStatisticsDataJsonUnmarshaller instance;

    public static BinaryColumnStatisticsDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BinaryColumnStatisticsDataJsonUnmarshaller();
        return instance;
    }
}
