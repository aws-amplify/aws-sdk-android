/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with the License. A copy of the License is
 * located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.targeting.endpointProfile;

import java.util.MissingResourceException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.json.JSONObject;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.JSONSerializable;

/**
 * A Amazon Pinpoint endpoint profile location.
 */
public class EndpointProfileLocation implements JSONSerializable {

    private static final Log log = LogFactory.getLog(EndpointProfileLocation.class);

    private Double latitude = null;
    private Double longitude = null;
    private String postalCode = "";
    private String city = "";
    private String region = "";
    private String country = "";

    /**
     * Default constructor
     *
     * @param context the context
     */
    public EndpointProfileLocation(final PinpointContext context) {
        String localeCountry;
        try {
            localeCountry = context.getApplicationContext().getResources().getConfiguration().locale.getISO3Country();
        } catch (final MissingResourceException exception) {
            log.debug("Locale getISO3Country failed, falling back to getCountry.");
            localeCountry = context.getApplicationContext().getResources().getConfiguration().locale.getCountry();
        }
        country = localeCountry;
    }

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     */
    public void setLatitude(Double latitude) {
        if (latitude == null) {
            return;
        }
        this.latitude = latitude;
    }

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     */
    public void setLongitude(Double longitude) {
        if (longitude == null) {
            return;
        }
        this.longitude = longitude;
    }

    /**
     * Gets postal code.
     *
     * @return the postal code
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Sets postal code.
     *
     * @param postalCode the postal code
     */
    public void setPostalCode(String postalCode) {
        if (postalCode == null) {
            return;
        }
        this.postalCode = postalCode;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        if (city == null) {
            return;
        }
        this.city = city;
    }

    /**
     * Gets region.
     *
     * @return the region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Sets region.
     *
     * @param region the region
     */
    public void setRegion(String region) {
        if (region == null) {
            return;
        }
        this.region = region;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        if (country == null) {
            return;
        }
        this.country = country;
    }

    @Override
    public JSONObject toJSONObject() {
        final JSONBuilder builder = new JSONBuilder(null);
        builder.withAttribute("Latitude", getLatitude());
        builder.withAttribute("Longitude", getLongitude());
        builder.withAttribute("PostalCode", getPostalCode());
        builder.withAttribute("City", getCity());
        builder.withAttribute("Region", getRegion());
        builder.withAttribute("Country", getCountry());
        return builder.toJSONObject();
    }
}
