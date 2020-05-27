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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RemoteIpDetails
 */
class RemoteIpDetailsJsonMarshaller {

    public void marshall(RemoteIpDetails remoteIpDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (remoteIpDetails.getCity() != null) {
            City city = remoteIpDetails.getCity();
            jsonWriter.name("City");
            CityJsonMarshaller.getInstance().marshall(city, jsonWriter);
        }
        if (remoteIpDetails.getCountry() != null) {
            Country country = remoteIpDetails.getCountry();
            jsonWriter.name("Country");
            CountryJsonMarshaller.getInstance().marshall(country, jsonWriter);
        }
        if (remoteIpDetails.getGeoLocation() != null) {
            GeoLocation geoLocation = remoteIpDetails.getGeoLocation();
            jsonWriter.name("GeoLocation");
            GeoLocationJsonMarshaller.getInstance().marshall(geoLocation, jsonWriter);
        }
        if (remoteIpDetails.getIpAddressV4() != null) {
            String ipAddressV4 = remoteIpDetails.getIpAddressV4();
            jsonWriter.name("IpAddressV4");
            jsonWriter.value(ipAddressV4);
        }
        if (remoteIpDetails.getOrganization() != null) {
            Organization organization = remoteIpDetails.getOrganization();
            jsonWriter.name("Organization");
            OrganizationJsonMarshaller.getInstance().marshall(organization, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RemoteIpDetailsJsonMarshaller instance;

    public static RemoteIpDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RemoteIpDetailsJsonMarshaller();
        return instance;
    }
}
