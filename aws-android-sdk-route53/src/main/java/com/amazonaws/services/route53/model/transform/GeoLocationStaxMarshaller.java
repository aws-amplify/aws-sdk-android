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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO GeoLocation
 */
class GeoLocationStaxMarshaller {

    public void marshall(GeoLocation _geoLocation, Request<?> request, String _prefix) {
        String prefix;
        if (_geoLocation.getContinentCode() != null) {
            prefix = _prefix + "ContinentCode";
            String continentCode = _geoLocation.getContinentCode();
            request.addParameter(prefix, StringUtils.fromString(continentCode));
        }
        if (_geoLocation.getCountryCode() != null) {
            prefix = _prefix + "CountryCode";
            String countryCode = _geoLocation.getCountryCode();
            request.addParameter(prefix, StringUtils.fromString(countryCode));
        }
        if (_geoLocation.getSubdivisionCode() != null) {
            prefix = _prefix + "SubdivisionCode";
            String subdivisionCode = _geoLocation.getSubdivisionCode();
            request.addParameter(prefix, StringUtils.fromString(subdivisionCode));
        }
    }

    private static GeoLocationStaxMarshaller instance;

    public static GeoLocationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GeoLocationStaxMarshaller();
        return instance;
    }
}
