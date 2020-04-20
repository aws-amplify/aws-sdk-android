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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ForecastResult
 */
class ForecastResultJsonMarshaller {

    public void marshall(ForecastResult forecastResult, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (forecastResult.getTimePeriod() != null) {
            DateInterval timePeriod = forecastResult.getTimePeriod();
            jsonWriter.name("TimePeriod");
            DateIntervalJsonMarshaller.getInstance().marshall(timePeriod, jsonWriter);
        }
        if (forecastResult.getMeanValue() != null) {
            String meanValue = forecastResult.getMeanValue();
            jsonWriter.name("MeanValue");
            jsonWriter.value(meanValue);
        }
        if (forecastResult.getPredictionIntervalLowerBound() != null) {
            String predictionIntervalLowerBound = forecastResult.getPredictionIntervalLowerBound();
            jsonWriter.name("PredictionIntervalLowerBound");
            jsonWriter.value(predictionIntervalLowerBound);
        }
        if (forecastResult.getPredictionIntervalUpperBound() != null) {
            String predictionIntervalUpperBound = forecastResult.getPredictionIntervalUpperBound();
            jsonWriter.name("PredictionIntervalUpperBound");
            jsonWriter.value(predictionIntervalUpperBound);
        }
        jsonWriter.endObject();
    }

    private static ForecastResultJsonMarshaller instance;

    public static ForecastResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ForecastResultJsonMarshaller();
        return instance;
    }
}
