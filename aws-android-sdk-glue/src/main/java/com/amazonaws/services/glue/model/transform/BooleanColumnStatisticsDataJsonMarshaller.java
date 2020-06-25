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
 * JSON marshaller for POJO BooleanColumnStatisticsData
 */
class BooleanColumnStatisticsDataJsonMarshaller {

    public void marshall(BooleanColumnStatisticsData booleanColumnStatisticsData,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (booleanColumnStatisticsData.getNumberOfTrues() != null) {
            Long numberOfTrues = booleanColumnStatisticsData.getNumberOfTrues();
            jsonWriter.name("NumberOfTrues");
            jsonWriter.value(numberOfTrues);
        }
        if (booleanColumnStatisticsData.getNumberOfFalses() != null) {
            Long numberOfFalses = booleanColumnStatisticsData.getNumberOfFalses();
            jsonWriter.name("NumberOfFalses");
            jsonWriter.value(numberOfFalses);
        }
        if (booleanColumnStatisticsData.getNumberOfNulls() != null) {
            Long numberOfNulls = booleanColumnStatisticsData.getNumberOfNulls();
            jsonWriter.name("NumberOfNulls");
            jsonWriter.value(numberOfNulls);
        }
        jsonWriter.endObject();
    }

    private static BooleanColumnStatisticsDataJsonMarshaller instance;

    public static BooleanColumnStatisticsDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BooleanColumnStatisticsDataJsonMarshaller();
        return instance;
    }
}
