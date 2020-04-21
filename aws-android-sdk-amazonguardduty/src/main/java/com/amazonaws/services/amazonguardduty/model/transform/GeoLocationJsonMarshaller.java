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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GeoLocation
 */
class GeoLocationJsonMarshaller {

    public void marshall(GeoLocation geoLocation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (geoLocation.getLat() != null) {
            Double lat = geoLocation.getLat();
            jsonWriter.name("Lat");
            jsonWriter.value(lat);
        }
        if (geoLocation.getLon() != null) {
            Double lon = geoLocation.getLon();
            jsonWriter.name("Lon");
            jsonWriter.value(lon);
        }
        jsonWriter.endObject();
    }

    private static GeoLocationJsonMarshaller instance;

    public static GeoLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GeoLocationJsonMarshaller();
        return instance;
    }
}
