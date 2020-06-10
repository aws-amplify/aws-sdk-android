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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IpGeoLocation
 */
class IpGeoLocationJsonMarshaller {

    public void marshall(IpGeoLocation ipGeoLocation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ipGeoLocation.getLat() != null) {
            Double lat = ipGeoLocation.getLat();
            jsonWriter.name("lat");
            jsonWriter.value(lat);
        }
        if (ipGeoLocation.getLon() != null) {
            Double lon = ipGeoLocation.getLon();
            jsonWriter.name("lon");
            jsonWriter.value(lon);
        }
        jsonWriter.endObject();
    }

    private static IpGeoLocationJsonMarshaller instance;

    public static IpGeoLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IpGeoLocationJsonMarshaller();
        return instance;
    }
}
