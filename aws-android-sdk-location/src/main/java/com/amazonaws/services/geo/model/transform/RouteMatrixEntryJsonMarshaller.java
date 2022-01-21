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
 * JSON marshaller for POJO RouteMatrixEntry
 */
class RouteMatrixEntryJsonMarshaller {

    public void marshall(RouteMatrixEntry routeMatrixEntry, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (routeMatrixEntry.getDistance() != null) {
            Double distance = routeMatrixEntry.getDistance();
            jsonWriter.name("Distance");
            jsonWriter.value(distance);
        }
        if (routeMatrixEntry.getDurationSeconds() != null) {
            Double durationSeconds = routeMatrixEntry.getDurationSeconds();
            jsonWriter.name("DurationSeconds");
            jsonWriter.value(durationSeconds);
        }
        if (routeMatrixEntry.getError() != null) {
            RouteMatrixEntryError error = routeMatrixEntry.getError();
            jsonWriter.name("Error");
            RouteMatrixEntryErrorJsonMarshaller.getInstance().marshall(error, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RouteMatrixEntryJsonMarshaller instance;

    public static RouteMatrixEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RouteMatrixEntryJsonMarshaller();
        return instance;
    }
}
