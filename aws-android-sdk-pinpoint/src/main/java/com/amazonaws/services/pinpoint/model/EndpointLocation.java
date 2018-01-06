/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Endpoint location data
 */
public class EndpointLocation implements Serializable {
    /**
     * The city where the endpoint is located.
     */
    private String city;

    /**
     * Country according to ISO 3166-1 Alpha-2 codes. For example, US.
     */
    private String country;

    /**
     * The latitude of the endpoint location. Rounded to one decimal (Roughly
     * corresponding to a mile).
     */
    private Double latitude;

    /**
     * The longitude of the endpoint location. Rounded to one decimal (Roughly
     * corresponding to a mile).
     */
    private Double longitude;

    /**
     * The postal code or zip code of the endpoint.
     */
    private String postalCode;

    /**
     * The region of the endpoint location. For example, corresponds to a state
     * in US.
     */
    private String region;

    /**
     * The city where the endpoint is located.
     *
     * @return The city where the endpoint is located.
     */
    public String getCity() {
        return city;
    }

    /**
     * The city where the endpoint is located.
     *
     * @param city The city where the endpoint is located.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The city where the endpoint is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param city The city where the endpoint is located.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Country according to ISO 3166-1 Alpha-2 codes. For example, US.
     *
     * @return Country according to ISO 3166-1 Alpha-2 codes. For example, US.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Country according to ISO 3166-1 Alpha-2 codes. For example, US.
     *
     * @param country Country according to ISO 3166-1 Alpha-2 codes. For
     *            example, US.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Country according to ISO 3166-1 Alpha-2 codes. For example, US.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country Country according to ISO 3166-1 Alpha-2 codes. For
     *            example, US.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * The latitude of the endpoint location. Rounded to one decimal (Roughly
     * corresponding to a mile).
     *
     * @return The latitude of the endpoint location. Rounded to one decimal
     *         (Roughly corresponding to a mile).
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * The latitude of the endpoint location. Rounded to one decimal (Roughly
     * corresponding to a mile).
     *
     * @param latitude The latitude of the endpoint location. Rounded to one
     *            decimal (Roughly corresponding to a mile).
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * The latitude of the endpoint location. Rounded to one decimal (Roughly
     * corresponding to a mile).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latitude The latitude of the endpoint location. Rounded to one
     *            decimal (Roughly corresponding to a mile).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * The longitude of the endpoint location. Rounded to one decimal (Roughly
     * corresponding to a mile).
     *
     * @return The longitude of the endpoint location. Rounded to one decimal
     *         (Roughly corresponding to a mile).
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * The longitude of the endpoint location. Rounded to one decimal (Roughly
     * corresponding to a mile).
     *
     * @param longitude The longitude of the endpoint location. Rounded to one
     *            decimal (Roughly corresponding to a mile).
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * The longitude of the endpoint location. Rounded to one decimal (Roughly
     * corresponding to a mile).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param longitude The longitude of the endpoint location. Rounded to one
     *            decimal (Roughly corresponding to a mile).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * The postal code or zip code of the endpoint.
     *
     * @return The postal code or zip code of the endpoint.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * The postal code or zip code of the endpoint.
     *
     * @param postalCode The postal code or zip code of the endpoint.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * The postal code or zip code of the endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param postalCode The postal code or zip code of the endpoint.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The region of the endpoint location. For example, corresponds to a state
     * in US.
     *
     * @return The region of the endpoint location. For example, corresponds to
     *         a state in US.
     */
    public String getRegion() {
        return region;
    }

    /**
     * The region of the endpoint location. For example, corresponds to a state
     * in US.
     *
     * @param region The region of the endpoint location. For example,
     *            corresponds to a state in US.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * The region of the endpoint location. For example, corresponds to a state
     * in US.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region The region of the endpoint location. For example,
     *            corresponds to a state in US.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getLatitude() != null)
            sb.append("Latitude: " + getLatitude() + ",");
        if (getLongitude() != null)
            sb.append("Longitude: " + getLongitude() + ",");
        if (getPostalCode() != null)
            sb.append("PostalCode: " + getPostalCode() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        hashCode = prime * hashCode + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointLocation == false)
            return false;
        EndpointLocation other = (EndpointLocation) obj;

        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getLatitude() == null ^ this.getLatitude() == null)
            return false;
        if (other.getLatitude() != null && other.getLatitude().equals(this.getLatitude()) == false)
            return false;
        if (other.getLongitude() == null ^ this.getLongitude() == null)
            return false;
        if (other.getLongitude() != null
                && other.getLongitude().equals(this.getLongitude()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null
                && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }
}
