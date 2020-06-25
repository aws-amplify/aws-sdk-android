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
 * JSON unmarshaller for POJO ColumnStatisticsData
 */
class ColumnStatisticsDataJsonUnmarshaller implements
        Unmarshaller<ColumnStatisticsData, JsonUnmarshallerContext> {

    public ColumnStatisticsData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ColumnStatisticsData columnStatisticsData = new ColumnStatisticsData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Type")) {
                columnStatisticsData.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BooleanColumnStatisticsData")) {
                columnStatisticsData
                        .setBooleanColumnStatisticsData(BooleanColumnStatisticsDataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DateColumnStatisticsData")) {
                columnStatisticsData
                        .setDateColumnStatisticsData(DateColumnStatisticsDataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DecimalColumnStatisticsData")) {
                columnStatisticsData
                        .setDecimalColumnStatisticsData(DecimalColumnStatisticsDataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("DoubleColumnStatisticsData")) {
                columnStatisticsData
                        .setDoubleColumnStatisticsData(DoubleColumnStatisticsDataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("LongColumnStatisticsData")) {
                columnStatisticsData
                        .setLongColumnStatisticsData(LongColumnStatisticsDataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("StringColumnStatisticsData")) {
                columnStatisticsData
                        .setStringColumnStatisticsData(StringColumnStatisticsDataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("BinaryColumnStatisticsData")) {
                columnStatisticsData
                        .setBinaryColumnStatisticsData(BinaryColumnStatisticsDataJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return columnStatisticsData;
    }

    private static ColumnStatisticsDataJsonUnmarshaller instance;

    public static ColumnStatisticsDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ColumnStatisticsDataJsonUnmarshaller();
        return instance;
    }
}
