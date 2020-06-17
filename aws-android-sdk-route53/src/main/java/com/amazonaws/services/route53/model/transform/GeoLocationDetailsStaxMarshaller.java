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
 * StAX marshaller for POJO GeoLocationDetails
 */
class GeoLocationDetailsStaxMarshaller {

    public void marshall(GeoLocationDetails _geoLocationDetails, Request<?> request, String _prefix) {
        String prefix;
        if (_geoLocationDetails.getContinentCode() != null) {
            prefix = _prefix + "ContinentCode";
            String continentCode = _geoLocationDetails.getContinentCode();
            request.addParameter(prefix, StringUtils.fromString(continentCode));
        }
        if (_geoLocationDetails.getContinentName() != null) {
            prefix = _prefix + "ContinentName";
            String continentName = _geoLocationDetails.getContinentName();
            request.addParameter(prefix, StringUtils.fromString(continentName));
        }
        if (_geoLocationDetails.getCountryCode() != null) {
            prefix = _prefix + "CountryCode";
            String countryCode = _geoLocationDetails.getCountryCode();
            request.addParameter(prefix, StringUtils.fromString(countryCode));
        }
        if (_geoLocationDetails.getCountryName() != null) {
            prefix = _prefix + "CountryName";
            String countryName = _geoLocationDetails.getCountryName();
            request.addParameter(prefix, StringUtils.fromString(countryName));
        }
        if (_geoLocationDetails.getSubdivisionCode() != null) {
            prefix = _prefix + "SubdivisionCode";
            String subdivisionCode = _geoLocationDetails.getSubdivisionCode();
            request.addParameter(prefix, StringUtils.fromString(subdivisionCode));
        }
        if (_geoLocationDetails.getSubdivisionName() != null) {
            prefix = _prefix + "SubdivisionName";
            String subdivisionName = _geoLocationDetails.getSubdivisionName();
            request.addParameter(prefix, StringUtils.fromString(subdivisionName));
        }
    }

    private static GeoLocationDetailsStaxMarshaller instance;

    public static GeoLocationDetailsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new GeoLocationDetailsStaxMarshaller();
        return instance;
    }
}
