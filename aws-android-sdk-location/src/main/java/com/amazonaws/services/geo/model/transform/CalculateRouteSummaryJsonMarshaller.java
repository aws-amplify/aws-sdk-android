/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CalculateRouteSummary
 */
class CalculateRouteSummaryJsonMarshaller {

    public void marshall(CalculateRouteSummary calculateRouteSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (calculateRouteSummary.getDataSource() != null) {
            String dataSource = calculateRouteSummary.getDataSource();
            jsonWriter.name("DataSource");
            jsonWriter.value(dataSource);
        }
        if (calculateRouteSummary.getDistance() != null) {
            Double distance = calculateRouteSummary.getDistance();
            jsonWriter.name("Distance");
            jsonWriter.value(distance);
        }
        if (calculateRouteSummary.getDistanceUnit() != null) {
            String distanceUnit = calculateRouteSummary.getDistanceUnit();
            jsonWriter.name("DistanceUnit");
            jsonWriter.value(distanceUnit);
        }
        if (calculateRouteSummary.getDurationSeconds() != null) {
            Double durationSeconds = calculateRouteSummary.getDurationSeconds();
            jsonWriter.name("DurationSeconds");
            jsonWriter.value(durationSeconds);
        }
        if (calculateRouteSummary.getRouteBBox() != null) {
            java.util.List<Double> routeBBox = calculateRouteSummary.getRouteBBox();
            jsonWriter.name("RouteBBox");
            jsonWriter.beginArray();
            for (Double routeBBoxItem : routeBBox) {
                if (routeBBoxItem != null) {
                    jsonWriter.value(routeBBoxItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CalculateRouteSummaryJsonMarshaller instance;

    public static CalculateRouteSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CalculateRouteSummaryJsonMarshaller();
        return instance;
    }
}
