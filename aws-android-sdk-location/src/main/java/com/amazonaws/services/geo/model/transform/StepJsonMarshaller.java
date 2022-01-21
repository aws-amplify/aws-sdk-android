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
 * JSON marshaller for POJO Step
 */
class StepJsonMarshaller {

    public void marshall(Step step, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (step.getDistance() != null) {
            Double distance = step.getDistance();
            jsonWriter.name("Distance");
            jsonWriter.value(distance);
        }
        if (step.getDurationSeconds() != null) {
            Double durationSeconds = step.getDurationSeconds();
            jsonWriter.name("DurationSeconds");
            jsonWriter.value(durationSeconds);
        }
        if (step.getEndPosition() != null) {
            java.util.List<Double> endPosition = step.getEndPosition();
            jsonWriter.name("EndPosition");
            jsonWriter.beginArray();
            for (Double endPositionItem : endPosition) {
                if (endPositionItem != null) {
                    jsonWriter.value(endPositionItem);
                }
            }
            jsonWriter.endArray();
        }
        if (step.getGeometryOffset() != null) {
            Integer geometryOffset = step.getGeometryOffset();
            jsonWriter.name("GeometryOffset");
            jsonWriter.value(geometryOffset);
        }
        if (step.getStartPosition() != null) {
            java.util.List<Double> startPosition = step.getStartPosition();
            jsonWriter.name("StartPosition");
            jsonWriter.beginArray();
            for (Double startPositionItem : startPosition) {
                if (startPositionItem != null) {
                    jsonWriter.value(startPositionItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static StepJsonMarshaller instance;

    public static StepJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StepJsonMarshaller();
        return instance;
    }
}
