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

package com.amazonaws.services.directconnect.model.transform;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Location
 */
class LocationJsonMarshaller {

    public void marshall(Location location, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (location.getLocationCode() != null) {
            String locationCode = location.getLocationCode();
            jsonWriter.name("locationCode");
            jsonWriter.value(locationCode);
        }
        if (location.getLocationName() != null) {
            String locationName = location.getLocationName();
            jsonWriter.name("locationName");
            jsonWriter.value(locationName);
        }
        if (location.getRegion() != null) {
            String region = location.getRegion();
            jsonWriter.name("region");
            jsonWriter.value(region);
        }
        if (location.getAvailablePortSpeeds() != null) {
            java.util.List<String> availablePortSpeeds = location.getAvailablePortSpeeds();
            jsonWriter.name("availablePortSpeeds");
            jsonWriter.beginArray();
            for (String availablePortSpeedsItem : availablePortSpeeds) {
                if (availablePortSpeedsItem != null) {
                    jsonWriter.value(availablePortSpeedsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (location.getAvailableProviders() != null) {
            java.util.List<String> availableProviders = location.getAvailableProviders();
            jsonWriter.name("availableProviders");
            jsonWriter.beginArray();
            for (String availableProvidersItem : availableProviders) {
                if (availableProvidersItem != null) {
                    jsonWriter.value(availableProvidersItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LocationJsonMarshaller instance;

    public static LocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LocationJsonMarshaller();
        return instance;
    }
}
