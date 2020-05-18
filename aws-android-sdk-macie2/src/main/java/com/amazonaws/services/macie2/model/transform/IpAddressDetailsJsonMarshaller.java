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
 * JSON marshaller for POJO IpAddressDetails
 */
class IpAddressDetailsJsonMarshaller {

    public void marshall(IpAddressDetails ipAddressDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ipAddressDetails.getIpAddressV4() != null) {
            String ipAddressV4 = ipAddressDetails.getIpAddressV4();
            jsonWriter.name("ipAddressV4");
            jsonWriter.value(ipAddressV4);
        }
        if (ipAddressDetails.getIpCity() != null) {
            IpCity ipCity = ipAddressDetails.getIpCity();
            jsonWriter.name("ipCity");
            IpCityJsonMarshaller.getInstance().marshall(ipCity, jsonWriter);
        }
        if (ipAddressDetails.getIpCountry() != null) {
            IpCountry ipCountry = ipAddressDetails.getIpCountry();
            jsonWriter.name("ipCountry");
            IpCountryJsonMarshaller.getInstance().marshall(ipCountry, jsonWriter);
        }
        if (ipAddressDetails.getIpGeoLocation() != null) {
            IpGeoLocation ipGeoLocation = ipAddressDetails.getIpGeoLocation();
            jsonWriter.name("ipGeoLocation");
            IpGeoLocationJsonMarshaller.getInstance().marshall(ipGeoLocation, jsonWriter);
        }
        if (ipAddressDetails.getIpOwner() != null) {
            IpOwner ipOwner = ipAddressDetails.getIpOwner();
            jsonWriter.name("ipOwner");
            IpOwnerJsonMarshaller.getInstance().marshall(ipOwner, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static IpAddressDetailsJsonMarshaller instance;

    public static IpAddressDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IpAddressDetailsJsonMarshaller();
        return instance;
    }
}
