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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies geographic information about an endpoint.
 * </p>
 */
public class EndpointLocation implements Serializable {
    /**
     * <p>
     * The name of the city where the endpoint is located.
     * </p>
     */
    private String city;

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or
     * region where the endpoint is located. For example, US for the United
     * States.
     * </p>
     */
    private String country;

    /**
     * <p>
     * The latitude coordinate of the endpoint location, rounded to one decimal
     * place.
     * </p>
     */
    private Double latitude;

    /**
     * <p>
     * The longitude coordinate of the endpoint location, rounded to one decimal
     * place.
     * </p>
     */
    private Double longitude;

    /**
     * <p>
     * The postal or ZIP code for the area where the endpoint is located.
     * </p>
     */
    private String postalCode;

    /**
     * <p>
     * The name of the region where the endpoint is located. For locations in
     * the United States, this value is the name of a state.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The name of the city where the endpoint is located.
     * </p>
     *
     * @return <p>
     *         The name of the city where the endpoint is located.
     *         </p>
     */
    public String getCity() {
        return city;
    }

    /**
     * <p>
     * The name of the city where the endpoint is located.
     * </p>
     *
     * @param city <p>
     *            The name of the city where the endpoint is located.
     *            </p>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The name of the city where the endpoint is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param city <p>
     *            The name of the city where the endpoint is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or
     * region where the endpoint is located. For example, US for the United
     * States.
     * </p>
     *
     * @return <p>
     *         The two-character code, in ISO 3166-1 alpha-2 format, for the
     *         country or region where the endpoint is located. For example, US
     *         for the United States.
     *         </p>
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or
     * region where the endpoint is located. For example, US for the United
     * States.
     * </p>
     *
     * @param country <p>
     *            The two-character code, in ISO 3166-1 alpha-2 format, for the
     *            country or region where the endpoint is located. For example,
     *            US for the United States.
     *            </p>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or
     * region where the endpoint is located. For example, US for the United
     * States.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country <p>
     *            The two-character code, in ISO 3166-1 alpha-2 format, for the
     *            country or region where the endpoint is located. For example,
     *            US for the United States.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * The latitude coordinate of the endpoint location, rounded to one decimal
     * place.
     * </p>
     *
     * @return <p>
     *         The latitude coordinate of the endpoint location, rounded to one
     *         decimal place.
     *         </p>
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * <p>
     * The latitude coordinate of the endpoint location, rounded to one decimal
     * place.
     * </p>
     *
     * @param latitude <p>
     *            The latitude coordinate of the endpoint location, rounded to
     *            one decimal place.
     *            </p>
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * The latitude coordinate of the endpoint location, rounded to one decimal
     * place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latitude <p>
     *            The latitude coordinate of the endpoint location, rounded to
     *            one decimal place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * <p>
     * The longitude coordinate of the endpoint location, rounded to one decimal
     * place.
     * </p>
     *
     * @return <p>
     *         The longitude coordinate of the endpoint location, rounded to one
     *         decimal place.
     *         </p>
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * <p>
     * The longitude coordinate of the endpoint location, rounded to one decimal
     * place.
     * </p>
     *
     * @param longitude <p>
     *            The longitude coordinate of the endpoint location, rounded to
     *            one decimal place.
     *            </p>
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * The longitude coordinate of the endpoint location, rounded to one decimal
     * place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param longitude <p>
     *            The longitude coordinate of the endpoint location, rounded to
     *            one decimal place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * <p>
     * The postal or ZIP code for the area where the endpoint is located.
     * </p>
     *
     * @return <p>
     *         The postal or ZIP code for the area where the endpoint is
     *         located.
     *         </p>
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * <p>
     * The postal or ZIP code for the area where the endpoint is located.
     * </p>
     *
     * @param postalCode <p>
     *            The postal or ZIP code for the area where the endpoint is
     *            located.
     *            </p>
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal or ZIP code for the area where the endpoint is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param postalCode <p>
     *            The postal or ZIP code for the area where the endpoint is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointLocation withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * <p>
     * The name of the region where the endpoint is located. For locations in
     * the United States, this value is the name of a state.
     * </p>
     *
     * @return <p>
     *         The name of the region where the endpoint is located. For
     *         locations in the United States, this value is the name of a
     *         state.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The name of the region where the endpoint is located. For locations in
     * the United States, this value is the name of a state.
     * </p>
     *
     * @param region <p>
     *            The name of the region where the endpoint is located. For
     *            locations in the United States, this value is the name of a
     *            state.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the region where the endpoint is located. For locations in
     * the United States, this value is the name of a state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The name of the region where the endpoint is located. For
     *            locations in the United States, this value is the name of a
     *            state.
     *            </p>
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
