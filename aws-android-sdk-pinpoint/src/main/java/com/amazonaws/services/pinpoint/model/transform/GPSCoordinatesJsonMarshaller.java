/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GPSCoordinates
 */
class GPSCoordinatesJsonMarshaller {

    public void marshall(GPSCoordinates gPSCoordinates, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (gPSCoordinates.getLatitude() != null) {
            Double latitude = gPSCoordinates.getLatitude();
            jsonWriter.name("Latitude");
            jsonWriter.value(latitude);
        }
        if (gPSCoordinates.getLongitude() != null) {
            Double longitude = gPSCoordinates.getLongitude();
            jsonWriter.name("Longitude");
            jsonWriter.value(longitude);
        }
        jsonWriter.endObject();
    }

    private static GPSCoordinatesJsonMarshaller instance;

    public static GPSCoordinatesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GPSCoordinatesJsonMarshaller();
        return instance;
    }
}
