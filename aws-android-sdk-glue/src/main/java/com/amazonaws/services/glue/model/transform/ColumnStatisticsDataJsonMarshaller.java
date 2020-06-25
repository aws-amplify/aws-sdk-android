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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ColumnStatisticsData
 */
class ColumnStatisticsDataJsonMarshaller {

    public void marshall(ColumnStatisticsData columnStatisticsData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (columnStatisticsData.getType() != null) {
            String type = columnStatisticsData.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (columnStatisticsData.getBooleanColumnStatisticsData() != null) {
            BooleanColumnStatisticsData booleanColumnStatisticsData = columnStatisticsData
                    .getBooleanColumnStatisticsData();
            jsonWriter.name("BooleanColumnStatisticsData");
            BooleanColumnStatisticsDataJsonMarshaller.getInstance().marshall(
                    booleanColumnStatisticsData, jsonWriter);
        }
        if (columnStatisticsData.getDateColumnStatisticsData() != null) {
            DateColumnStatisticsData dateColumnStatisticsData = columnStatisticsData
                    .getDateColumnStatisticsData();
            jsonWriter.name("DateColumnStatisticsData");
            DateColumnStatisticsDataJsonMarshaller.getInstance().marshall(dateColumnStatisticsData,
                    jsonWriter);
        }
        if (columnStatisticsData.getDecimalColumnStatisticsData() != null) {
            DecimalColumnStatisticsData decimalColumnStatisticsData = columnStatisticsData
                    .getDecimalColumnStatisticsData();
            jsonWriter.name("DecimalColumnStatisticsData");
            DecimalColumnStatisticsDataJsonMarshaller.getInstance().marshall(
                    decimalColumnStatisticsData, jsonWriter);
        }
        if (columnStatisticsData.getDoubleColumnStatisticsData() != null) {
            DoubleColumnStatisticsData doubleColumnStatisticsData = columnStatisticsData
                    .getDoubleColumnStatisticsData();
            jsonWriter.name("DoubleColumnStatisticsData");
            DoubleColumnStatisticsDataJsonMarshaller.getInstance().marshall(
                    doubleColumnStatisticsData, jsonWriter);
        }
        if (columnStatisticsData.getLongColumnStatisticsData() != null) {
            LongColumnStatisticsData longColumnStatisticsData = columnStatisticsData
                    .getLongColumnStatisticsData();
            jsonWriter.name("LongColumnStatisticsData");
            LongColumnStatisticsDataJsonMarshaller.getInstance().marshall(longColumnStatisticsData,
                    jsonWriter);
        }
        if (columnStatisticsData.getStringColumnStatisticsData() != null) {
            StringColumnStatisticsData stringColumnStatisticsData = columnStatisticsData
                    .getStringColumnStatisticsData();
            jsonWriter.name("StringColumnStatisticsData");
            StringColumnStatisticsDataJsonMarshaller.getInstance().marshall(
                    stringColumnStatisticsData, jsonWriter);
        }
        if (columnStatisticsData.getBinaryColumnStatisticsData() != null) {
            BinaryColumnStatisticsData binaryColumnStatisticsData = columnStatisticsData
                    .getBinaryColumnStatisticsData();
            jsonWriter.name("BinaryColumnStatisticsData");
            BinaryColumnStatisticsDataJsonMarshaller.getInstance().marshall(
                    binaryColumnStatisticsData, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ColumnStatisticsDataJsonMarshaller instance;

    public static ColumnStatisticsDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ColumnStatisticsDataJsonMarshaller();
        return instance;
    }
}
