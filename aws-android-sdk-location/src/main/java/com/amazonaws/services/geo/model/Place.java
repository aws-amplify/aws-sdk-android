/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details about addresses or points of interest that match the search
 * criteria.
 * </p>
 */
public class Place implements Serializable {
    /**
     * <p>
     * The numerical portion of an address, such as a building number.
     * </p>
     */
    private String addressNumber;

    /**
     * <p>
     * A country/region specified using <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country/region code. For example, <code>CAN</code>.
     * </p>
     */
    private String country;

    /**
     * <p>
     * Places uses a point geometry to specify a location or a Place.
     * </p>
     */
    private PlaceGeometry geometry;

    /**
     * <p>
     * <code>True</code> if the result is interpolated from other known places.
     * </p>
     * <p>
     * <code>False</code> if the Place is a known place.
     * </p>
     * <p>
     * Not returned when the partner does not provide the information.
     * </p>
     * <p>
     * For example, returns <code>False</code> for an address location that is
     * found in the partner data, but returns <code>True</code> if an address
     * does not exist in the partner data and its location is calculated by
     * interpolating between other known addresses.
     * </p>
     */
    private Boolean interpolated;

    /**
     * <p>
     * The full name and address of the point of interest such as a city,
     * region, or country. For example,
     * <code>123 Any Street, Any Town, USA</code>.
     * </p>
     */
    private String label;

    /**
     * <p>
     * A name for a local area, such as a city or town name. For example,
     * <code>Toronto</code>.
     * </p>
     */
    private String municipality;

    /**
     * <p>
     * The name of a community district. For example, <code>Downtown</code>.
     * </p>
     */
    private String neighborhood;

    /**
     * <p>
     * A group of numbers and letters in a country-specific format, which
     * accompanies the address for the purpose of identifying a location.
     * </p>
     */
    private String postalCode;

    /**
     * <p>
     * A name for an area or geographical division, such as a province or state
     * name. For example, <code>British Columbia</code>.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The name for a street or a road to identify a location. For example,
     * <code>Main Street</code>.
     * </p>
     */
    private String street;

    /**
     * <p>
     * A country, or an area that's part of a larger region. For example,
     * <code>Metro Vancouver</code>.
     * </p>
     */
    private String subRegion;

    /**
     * <p>
     * The time zone in which the <code>Place</code> is located. Returned only
     * when using Here as the selected partner.
     * </p>
     */
    private TimeZone timeZone;

    /**
     * <p>
     * The numerical portion of an address, such as a building number.
     * </p>
     *
     * @return <p>
     *         The numerical portion of an address, such as a building number.
     *         </p>
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * <p>
     * The numerical portion of an address, such as a building number.
     * </p>
     *
     * @param addressNumber <p>
     *            The numerical portion of an address, such as a building
     *            number.
     *            </p>
     */
    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    /**
     * <p>
     * The numerical portion of an address, such as a building number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addressNumber <p>
     *            The numerical portion of an address, such as a building
     *            number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
        return this;
    }

    /**
     * <p>
     * A country/region specified using <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country/region code. For example, <code>CAN</code>.
     * </p>
     *
     * @return <p>
     *         A country/region specified using <a
     *         href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *         3166</a> 3-digit country/region code. For example,
     *         <code>CAN</code>.
     *         </p>
     */
    public String getCountry() {
        return country;
    }

    /**
     * <p>
     * A country/region specified using <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country/region code. For example, <code>CAN</code>.
     * </p>
     *
     * @param country <p>
     *            A country/region specified using <a
     *            href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *            3166</a> 3-digit country/region code. For example,
     *            <code>CAN</code>.
     *            </p>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * A country/region specified using <a
     * href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     * 3-digit country/region code. For example, <code>CAN</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param country <p>
     *            A country/region specified using <a
     *            href="https://www.iso.org/iso-3166-country-codes.html">ISO
     *            3166</a> 3-digit country/region code. For example,
     *            <code>CAN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * <p>
     * Places uses a point geometry to specify a location or a Place.
     * </p>
     *
     * @return <p>
     *         Places uses a point geometry to specify a location or a Place.
     *         </p>
     */
    public PlaceGeometry getGeometry() {
        return geometry;
    }

    /**
     * <p>
     * Places uses a point geometry to specify a location or a Place.
     * </p>
     *
     * @param geometry <p>
     *            Places uses a point geometry to specify a location or a Place.
     *            </p>
     */
    public void setGeometry(PlaceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Places uses a point geometry to specify a location or a Place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geometry <p>
     *            Places uses a point geometry to specify a location or a Place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withGeometry(PlaceGeometry geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if the result is interpolated from other known places.
     * </p>
     * <p>
     * <code>False</code> if the Place is a known place.
     * </p>
     * <p>
     * Not returned when the partner does not provide the information.
     * </p>
     * <p>
     * For example, returns <code>False</code> for an address location that is
     * found in the partner data, but returns <code>True</code> if an address
     * does not exist in the partner data and its location is calculated by
     * interpolating between other known addresses.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the result is interpolated from other known
     *         places.
     *         </p>
     *         <p>
     *         <code>False</code> if the Place is a known place.
     *         </p>
     *         <p>
     *         Not returned when the partner does not provide the information.
     *         </p>
     *         <p>
     *         For example, returns <code>False</code> for an address location
     *         that is found in the partner data, but returns <code>True</code>
     *         if an address does not exist in the partner data and its location
     *         is calculated by interpolating between other known addresses.
     *         </p>
     */
    public Boolean isInterpolated() {
        return interpolated;
    }

    /**
     * <p>
     * <code>True</code> if the result is interpolated from other known places.
     * </p>
     * <p>
     * <code>False</code> if the Place is a known place.
     * </p>
     * <p>
     * Not returned when the partner does not provide the information.
     * </p>
     * <p>
     * For example, returns <code>False</code> for an address location that is
     * found in the partner data, but returns <code>True</code> if an address
     * does not exist in the partner data and its location is calculated by
     * interpolating between other known addresses.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the result is interpolated from other known
     *         places.
     *         </p>
     *         <p>
     *         <code>False</code> if the Place is a known place.
     *         </p>
     *         <p>
     *         Not returned when the partner does not provide the information.
     *         </p>
     *         <p>
     *         For example, returns <code>False</code> for an address location
     *         that is found in the partner data, but returns <code>True</code>
     *         if an address does not exist in the partner data and its location
     *         is calculated by interpolating between other known addresses.
     *         </p>
     */
    public Boolean getInterpolated() {
        return interpolated;
    }

    /**
     * <p>
     * <code>True</code> if the result is interpolated from other known places.
     * </p>
     * <p>
     * <code>False</code> if the Place is a known place.
     * </p>
     * <p>
     * Not returned when the partner does not provide the information.
     * </p>
     * <p>
     * For example, returns <code>False</code> for an address location that is
     * found in the partner data, but returns <code>True</code> if an address
     * does not exist in the partner data and its location is calculated by
     * interpolating between other known addresses.
     * </p>
     *
     * @param interpolated <p>
     *            <code>True</code> if the result is interpolated from other
     *            known places.
     *            </p>
     *            <p>
     *            <code>False</code> if the Place is a known place.
     *            </p>
     *            <p>
     *            Not returned when the partner does not provide the
     *            information.
     *            </p>
     *            <p>
     *            For example, returns <code>False</code> for an address
     *            location that is found in the partner data, but returns
     *            <code>True</code> if an address does not exist in the partner
     *            data and its location is calculated by interpolating between
     *            other known addresses.
     *            </p>
     */
    public void setInterpolated(Boolean interpolated) {
        this.interpolated = interpolated;
    }

    /**
     * <p>
     * <code>True</code> if the result is interpolated from other known places.
     * </p>
     * <p>
     * <code>False</code> if the Place is a known place.
     * </p>
     * <p>
     * Not returned when the partner does not provide the information.
     * </p>
     * <p>
     * For example, returns <code>False</code> for an address location that is
     * found in the partner data, but returns <code>True</code> if an address
     * does not exist in the partner data and its location is calculated by
     * interpolating between other known addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param interpolated <p>
     *            <code>True</code> if the result is interpolated from other
     *            known places.
     *            </p>
     *            <p>
     *            <code>False</code> if the Place is a known place.
     *            </p>
     *            <p>
     *            Not returned when the partner does not provide the
     *            information.
     *            </p>
     *            <p>
     *            For example, returns <code>False</code> for an address
     *            location that is found in the partner data, but returns
     *            <code>True</code> if an address does not exist in the partner
     *            data and its location is calculated by interpolating between
     *            other known addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withInterpolated(Boolean interpolated) {
        this.interpolated = interpolated;
        return this;
    }

    /**
     * <p>
     * The full name and address of the point of interest such as a city,
     * region, or country. For example,
     * <code>123 Any Street, Any Town, USA</code>.
     * </p>
     *
     * @return <p>
     *         The full name and address of the point of interest such as a
     *         city, region, or country. For example,
     *         <code>123 Any Street, Any Town, USA</code>.
     *         </p>
     */
    public String getLabel() {
        return label;
    }

    /**
     * <p>
     * The full name and address of the point of interest such as a city,
     * region, or country. For example,
     * <code>123 Any Street, Any Town, USA</code>.
     * </p>
     *
     * @param label <p>
     *            The full name and address of the point of interest such as a
     *            city, region, or country. For example,
     *            <code>123 Any Street, Any Town, USA</code>.
     *            </p>
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The full name and address of the point of interest such as a city,
     * region, or country. For example,
     * <code>123 Any Street, Any Town, USA</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param label <p>
     *            The full name and address of the point of interest such as a
     *            city, region, or country. For example,
     *            <code>123 Any Street, Any Town, USA</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * <p>
     * A name for a local area, such as a city or town name. For example,
     * <code>Toronto</code>.
     * </p>
     *
     * @return <p>
     *         A name for a local area, such as a city or town name. For
     *         example, <code>Toronto</code>.
     *         </p>
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * <p>
     * A name for a local area, such as a city or town name. For example,
     * <code>Toronto</code>.
     * </p>
     *
     * @param municipality <p>
     *            A name for a local area, such as a city or town name. For
     *            example, <code>Toronto</code>.
     *            </p>
     */
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    /**
     * <p>
     * A name for a local area, such as a city or town name. For example,
     * <code>Toronto</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param municipality <p>
     *            A name for a local area, such as a city or town name. For
     *            example, <code>Toronto</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withMunicipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    /**
     * <p>
     * The name of a community district. For example, <code>Downtown</code>.
     * </p>
     *
     * @return <p>
     *         The name of a community district. For example,
     *         <code>Downtown</code>.
     *         </p>
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * <p>
     * The name of a community district. For example, <code>Downtown</code>.
     * </p>
     *
     * @param neighborhood <p>
     *            The name of a community district. For example,
     *            <code>Downtown</code>.
     *            </p>
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * <p>
     * The name of a community district. For example, <code>Downtown</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param neighborhood <p>
     *            The name of a community district. For example,
     *            <code>Downtown</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    /**
     * <p>
     * A group of numbers and letters in a country-specific format, which
     * accompanies the address for the purpose of identifying a location.
     * </p>
     *
     * @return <p>
     *         A group of numbers and letters in a country-specific format,
     *         which accompanies the address for the purpose of identifying a
     *         location.
     *         </p>
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * <p>
     * A group of numbers and letters in a country-specific format, which
     * accompanies the address for the purpose of identifying a location.
     * </p>
     *
     * @param postalCode <p>
     *            A group of numbers and letters in a country-specific format,
     *            which accompanies the address for the purpose of identifying a
     *            location.
     *            </p>
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * A group of numbers and letters in a country-specific format, which
     * accompanies the address for the purpose of identifying a location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param postalCode <p>
     *            A group of numbers and letters in a country-specific format,
     *            which accompanies the address for the purpose of identifying a
     *            location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * <p>
     * A name for an area or geographical division, such as a province or state
     * name. For example, <code>British Columbia</code>.
     * </p>
     *
     * @return <p>
     *         A name for an area or geographical division, such as a province
     *         or state name. For example, <code>British Columbia</code>.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * A name for an area or geographical division, such as a province or state
     * name. For example, <code>British Columbia</code>.
     * </p>
     *
     * @param region <p>
     *            A name for an area or geographical division, such as a
     *            province or state name. For example,
     *            <code>British Columbia</code>.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * A name for an area or geographical division, such as a province or state
     * name. For example, <code>British Columbia</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            A name for an area or geographical division, such as a
     *            province or state name. For example,
     *            <code>British Columbia</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The name for a street or a road to identify a location. For example,
     * <code>Main Street</code>.
     * </p>
     *
     * @return <p>
     *         The name for a street or a road to identify a location. For
     *         example, <code>Main Street</code>.
     *         </p>
     */
    public String getStreet() {
        return street;
    }

    /**
     * <p>
     * The name for a street or a road to identify a location. For example,
     * <code>Main Street</code>.
     * </p>
     *
     * @param street <p>
     *            The name for a street or a road to identify a location. For
     *            example, <code>Main Street</code>.
     *            </p>
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * <p>
     * The name for a street or a road to identify a location. For example,
     * <code>Main Street</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param street <p>
     *            The name for a street or a road to identify a location. For
     *            example, <code>Main Street</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * <p>
     * A country, or an area that's part of a larger region. For example,
     * <code>Metro Vancouver</code>.
     * </p>
     *
     * @return <p>
     *         A country, or an area that's part of a larger region. For
     *         example, <code>Metro Vancouver</code>.
     *         </p>
     */
    public String getSubRegion() {
        return subRegion;
    }

    /**
     * <p>
     * A country, or an area that's part of a larger region. For example,
     * <code>Metro Vancouver</code>.
     * </p>
     *
     * @param subRegion <p>
     *            A country, or an area that's part of a larger region. For
     *            example, <code>Metro Vancouver</code>.
     *            </p>
     */
    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    /**
     * <p>
     * A country, or an area that's part of a larger region. For example,
     * <code>Metro Vancouver</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subRegion <p>
     *            A country, or an area that's part of a larger region. For
     *            example, <code>Metro Vancouver</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withSubRegion(String subRegion) {
        this.subRegion = subRegion;
        return this;
    }

    /**
     * <p>
     * The time zone in which the <code>Place</code> is located. Returned only
     * when using Here as the selected partner.
     * </p>
     *
     * @return <p>
     *         The time zone in which the <code>Place</code> is located.
     *         Returned only when using Here as the selected partner.
     *         </p>
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * <p>
     * The time zone in which the <code>Place</code> is located. Returned only
     * when using Here as the selected partner.
     * </p>
     *
     * @param timeZone <p>
     *            The time zone in which the <code>Place</code> is located.
     *            Returned only when using Here as the selected partner.
     *            </p>
     */
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * The time zone in which the <code>Place</code> is located. Returned only
     * when using Here as the selected partner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeZone <p>
     *            The time zone in which the <code>Place</code> is located.
     *            Returned only when using Here as the selected partner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Place withTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
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
        if (getAddressNumber() != null)
            sb.append("AddressNumber: " + getAddressNumber() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getGeometry() != null)
            sb.append("Geometry: " + getGeometry() + ",");
        if (getInterpolated() != null)
            sb.append("Interpolated: " + getInterpolated() + ",");
        if (getLabel() != null)
            sb.append("Label: " + getLabel() + ",");
        if (getMunicipality() != null)
            sb.append("Municipality: " + getMunicipality() + ",");
        if (getNeighborhood() != null)
            sb.append("Neighborhood: " + getNeighborhood() + ",");
        if (getPostalCode() != null)
            sb.append("PostalCode: " + getPostalCode() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getStreet() != null)
            sb.append("Street: " + getStreet() + ",");
        if (getSubRegion() != null)
            sb.append("SubRegion: " + getSubRegion() + ",");
        if (getTimeZone() != null)
            sb.append("TimeZone: " + getTimeZone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAddressNumber() == null) ? 0 : getAddressNumber().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode
                + ((getInterpolated() == null) ? 0 : getInterpolated().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode
                + ((getMunicipality() == null) ? 0 : getMunicipality().hashCode());
        hashCode = prime * hashCode
                + ((getNeighborhood() == null) ? 0 : getNeighborhood().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStreet() == null) ? 0 : getStreet().hashCode());
        hashCode = prime * hashCode + ((getSubRegion() == null) ? 0 : getSubRegion().hashCode());
        hashCode = prime * hashCode + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Place == false)
            return false;
        Place other = (Place) obj;

        if (other.getAddressNumber() == null ^ this.getAddressNumber() == null)
            return false;
        if (other.getAddressNumber() != null
                && other.getAddressNumber().equals(this.getAddressNumber()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getInterpolated() == null ^ this.getInterpolated() == null)
            return false;
        if (other.getInterpolated() != null
                && other.getInterpolated().equals(this.getInterpolated()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getMunicipality() == null ^ this.getMunicipality() == null)
            return false;
        if (other.getMunicipality() != null
                && other.getMunicipality().equals(this.getMunicipality()) == false)
            return false;
        if (other.getNeighborhood() == null ^ this.getNeighborhood() == null)
            return false;
        if (other.getNeighborhood() != null
                && other.getNeighborhood().equals(this.getNeighborhood()) == false)
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
        if (other.getStreet() == null ^ this.getStreet() == null)
            return false;
        if (other.getStreet() != null && other.getStreet().equals(this.getStreet()) == false)
            return false;
        if (other.getSubRegion() == null ^ this.getSubRegion() == null)
            return false;
        if (other.getSubRegion() != null
                && other.getSubRegion().equals(this.getSubRegion()) == false)
            return false;
        if (other.getTimeZone() == null ^ this.getTimeZone() == null)
            return false;
        if (other.getTimeZone() != null && other.getTimeZone().equals(this.getTimeZone()) == false)
            return false;
        return true;
    }
}
