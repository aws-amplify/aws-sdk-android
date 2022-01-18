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
 * JSON marshaller for POJO Leg
 */
class LegJsonMarshaller {

    public void marshall(Leg leg, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (leg.getDistance() != null) {
            Double distance = leg.getDistance();
            jsonWriter.name("Distance");
            jsonWriter.value(distance);
        }
        if (leg.getDurationSeconds() != null) {
            Double durationSeconds = leg.getDurationSeconds();
            jsonWriter.name("DurationSeconds");
            jsonWriter.value(durationSeconds);
        }
        if (leg.getEndPosition() != null) {
            java.util.List<Double> endPosition = leg.getEndPosition();
            jsonWriter.name("EndPosition");
            jsonWriter.beginArray();
            for (Double endPositionItem : endPosition) {
                if (endPositionItem != null) {
                    jsonWriter.value(endPositionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (leg.getGeometry() != null) {
            LegGeometry geometry = leg.getGeometry();
            jsonWriter.name("Geometry");
            LegGeometryJsonMarshaller.getInstance().marshall(geometry, jsonWriter);
        }
        if (leg.getStartPosition() != null) {
            java.util.List<Double> startPosition = leg.getStartPosition();
            jsonWriter.name("StartPosition");
            jsonWriter.beginArray();
            for (Double startPositionItem : startPosition) {
                if (startPositionItem != null) {
                    jsonWriter.value(startPositionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (leg.getSteps() != null) {
            java.util.List<Step> steps = leg.getSteps();
            jsonWriter.name("Steps");
            jsonWriter.beginArray();
            for (Step stepsItem : steps) {
                if (stepsItem != null) {
                    StepJsonMarshaller.getInstance().marshall(stepsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LegJsonMarshaller instance;

    public static LegJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LegJsonMarshaller();
        return instance;
    }
}
