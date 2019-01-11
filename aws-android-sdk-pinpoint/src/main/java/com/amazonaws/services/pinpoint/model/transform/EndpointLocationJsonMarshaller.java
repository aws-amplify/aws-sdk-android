/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO EndpointLocation
 */
class EndpointLocationJsonMarshaller {

    public void marshall(EndpointLocation endpointLocation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointLocation.getCity() != null) {
            String city = endpointLocation.getCity();
            jsonWriter.name("City");
            jsonWriter.value(city);
        }
        if (endpointLocation.getCountry() != null) {
            String country = endpointLocation.getCountry();
            jsonWriter.name("Country");
            jsonWriter.value(country);
        }
        if (endpointLocation.getLatitude() != null) {
            Double latitude = endpointLocation.getLatitude();
            jsonWriter.name("Latitude");
            jsonWriter.value(latitude);
        }
        if (endpointLocation.getLongitude() != null) {
            Double longitude = endpointLocation.getLongitude();
            jsonWriter.name("Longitude");
            jsonWriter.value(longitude);
        }
        if (endpointLocation.getPostalCode() != null) {
            String postalCode = endpointLocation.getPostalCode();
            jsonWriter.name("PostalCode");
            jsonWriter.value(postalCode);
        }
        if (endpointLocation.getRegion() != null) {
            String region = endpointLocation.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        jsonWriter.endObject();
    }

    private static EndpointLocationJsonMarshaller instance;

    public static EndpointLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointLocationJsonMarshaller();
        return instance;
    }
}
