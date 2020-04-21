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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the remote IP address of the connection.
 * </p>
 */
public class RemoteIpDetails implements Serializable {
    /**
     * <p>
     * The city information of the remote IP address.
     * </p>
     */
    private City city;

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     */
    private Country country;

    /**
     * <p>
     * The location information of the remote IP address.
     * </p>
     */
    private GeoLocation geoLocation;

    /**
     * <p>
     * The IPv4 remote address of the connection.
     * </p>
     */
    private String ipAddressV4;

    /**
     * <p>
     * The ISP organization information of the remote IP address.
     * </p>
     */
    private Organization organization;

    /**
     * <p>
     * The city information of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The city information of the remote IP address.
     *         </p>
     */
    public City getCity() {
        return city;
    }

    /**
     * <p>
     * The city information of the remote IP address.
     * </p>
     *
     * @param city <p>
     *            The city information of the remote IP address.
     *            </p>
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * <p>
     * The city information of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param city <p>
     *            The city information of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoteIpDetails withCity(City city) {
        this.city = city;
        return this;
    }

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The country code of the remote IP address.
     *         </p>
     */
    public Country getCountry() {
        return country;
    }

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     *
     * @param country <p>
     *            The country code of the remote IP address.
     *            </p>
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * <p>
     * The country code of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country <p>
     *            The country code of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoteIpDetails withCountry(Country country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * The location information of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The location information of the remote IP address.
     *         </p>
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * <p>
     * The location information of the remote IP address.
     * </p>
     *
     * @param geoLocation <p>
     *            The location information of the remote IP address.
     *            </p>
     */
    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    /**
     * <p>
     * The location information of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoLocation <p>
     *            The location information of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoteIpDetails withGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    /**
     * <p>
     * The IPv4 remote address of the connection.
     * </p>
     *
     * @return <p>
     *         The IPv4 remote address of the connection.
     *         </p>
     */
    public String getIpAddressV4() {
        return ipAddressV4;
    }

    /**
     * <p>
     * The IPv4 remote address of the connection.
     * </p>
     *
     * @param ipAddressV4 <p>
     *            The IPv4 remote address of the connection.
     *            </p>
     */
    public void setIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
    }

    /**
     * <p>
     * The IPv4 remote address of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ipAddressV4 <p>
     *            The IPv4 remote address of the connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoteIpDetails withIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
        return this;
    }

    /**
     * <p>
     * The ISP organization information of the remote IP address.
     * </p>
     *
     * @return <p>
     *         The ISP organization information of the remote IP address.
     *         </p>
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * <p>
     * The ISP organization information of the remote IP address.
     * </p>
     *
     * @param organization <p>
     *            The ISP organization information of the remote IP address.
     *            </p>
     */
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * <p>
     * The ISP organization information of the remote IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organization <p>
     *            The ISP organization information of the remote IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoteIpDetails withOrganization(Organization organization) {
        this.organization = organization;
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
        if (getGeoLocation() != null)
            sb.append("GeoLocation: " + getGeoLocation() + ",");
        if (getIpAddressV4() != null)
            sb.append("IpAddressV4: " + getIpAddressV4() + ",");
        if (getOrganization() != null)
            sb.append("Organization: " + getOrganization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode
                + ((getGeoLocation() == null) ? 0 : getGeoLocation().hashCode());
        hashCode = prime * hashCode
                + ((getIpAddressV4() == null) ? 0 : getIpAddressV4().hashCode());
        hashCode = prime * hashCode
                + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoteIpDetails == false)
            return false;
        RemoteIpDetails other = (RemoteIpDetails) obj;

        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getGeoLocation() == null ^ this.getGeoLocation() == null)
            return false;
        if (other.getGeoLocation() != null
                && other.getGeoLocation().equals(this.getGeoLocation()) == false)
            return false;
        if (other.getIpAddressV4() == null ^ this.getIpAddressV4() == null)
            return false;
        if (other.getIpAddressV4() != null
                && other.getIpAddressV4().equals(this.getIpAddressV4()) == false)
            return false;
        if (other.getOrganization() == null ^ this.getOrganization() == null)
            return false;
        if (other.getOrganization() != null
                && other.getOrganization().equals(this.getOrganization()) == false)
            return false;
        return true;
    }
}
