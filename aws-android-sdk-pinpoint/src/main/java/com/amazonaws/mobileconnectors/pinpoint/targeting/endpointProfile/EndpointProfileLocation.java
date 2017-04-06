/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;
import org.json.JSONObject;

import java.util.Locale;

public class EndpointProfileLocation implements JSONSerializable {

    private Double latitude = null;
    private Double longitude = null;
    private String postalCode = "";
    private String city = "";
    private String region = "";
    private String country = Locale.getDefault().getCountry();

    public Double getLatitude() {
        return this.latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getPostalCode() {
        return this.postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return this.region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public JSONObject toJSONObject() {
        JSONBuilder builder = new JSONBuilder(null);
        builder.withAttribute("Latitude", getLatitude());
        builder.withAttribute("Longitude", getLongitude());
        builder.withAttribute("PostalCode", getPostalCode());
        builder.withAttribute("City", getCity());
        builder.withAttribute("Region", getRegion());
        builder.withAttribute("Country", getCountry());
        return builder.toJSONObject();
    }
}
