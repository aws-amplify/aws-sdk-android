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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about whether a specified geographic location is supported
 * for Amazon Route 53 geolocation resource record sets.
 * </p>
 * <p>
 * Use the following syntax to determine whether a continent is supported for
 * geolocation:
 * </p>
 * <p>
 * <code>GET /2013-04-01/geolocation?continentcode=<i>two-letter abbreviation for a continent</i> </code>
 * </p>
 * <p>
 * Use the following syntax to determine whether a country is supported for
 * geolocation:
 * </p>
 * <p>
 * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i> </code>
 * </p>
 * <p>
 * Use the following syntax to determine whether a subdivision of a country is
 * supported for geolocation:
 * </p>
 * <p>
 * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i>&amp;subdivisioncode=<i>subdivision code</i> </code>
 * </p>
 */
public class GetGeoLocationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * For geolocation resource record sets, a two-letter abbreviation that
     * identifies a continent. Amazon Route 53 supports the following continent
     * codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AF</b>: Africa
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AN</b>: Antarctica
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AS</b>: Asia
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EU</b>: Europe
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OC</b>: Oceania
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NA</b>: North America
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SA</b>: South America
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     */
    private String continentCode;

    /**
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in
     * <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard
     * 3166-1 alpha-2</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String countryCode;

    /**
     * <p>
     * For <code>SubdivisionCode</code>, Amazon Route 53 supports only states of
     * the United States. For a list of state abbreviations, see <a
     * href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter
     * State and Possession Abbreviations</a> on the United States Postal
     * Service website.
     * </p>
     * <p>
     * If you specify <code>subdivisioncode</code>, you must also specify
     * <code>US</code> for <code>CountryCode</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     */
    private String subdivisionCode;

    /**
     * <p>
     * For geolocation resource record sets, a two-letter abbreviation that
     * identifies a continent. Amazon Route 53 supports the following continent
     * codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AF</b>: Africa
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AN</b>: Antarctica
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AS</b>: Asia
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EU</b>: Europe
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OC</b>: Oceania
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NA</b>: North America
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SA</b>: South America
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @return <p>
     *         For geolocation resource record sets, a two-letter abbreviation
     *         that identifies a continent. Amazon Route 53 supports the
     *         following continent codes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>AF</b>: Africa
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AN</b>: Antarctica
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AS</b>: Asia
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EU</b>: Europe
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>OC</b>: Oceania
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NA</b>: North America
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SA</b>: South America
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getContinentCode() {
        return continentCode;
    }

    /**
     * <p>
     * For geolocation resource record sets, a two-letter abbreviation that
     * identifies a continent. Amazon Route 53 supports the following continent
     * codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AF</b>: Africa
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AN</b>: Antarctica
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AS</b>: Asia
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EU</b>: Europe
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OC</b>: Oceania
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NA</b>: North America
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SA</b>: South America
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param continentCode <p>
     *            For geolocation resource record sets, a two-letter
     *            abbreviation that identifies a continent. Amazon Route 53
     *            supports the following continent codes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>AF</b>: Africa
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>AN</b>: Antarctica
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>AS</b>: Asia
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EU</b>: Europe
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>OC</b>: Oceania
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>NA</b>: North America
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SA</b>: South America
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * For geolocation resource record sets, a two-letter abbreviation that
     * identifies a continent. Amazon Route 53 supports the following continent
     * codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AF</b>: Africa
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AN</b>: Antarctica
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AS</b>: Asia
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EU</b>: Europe
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OC</b>: Oceania
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NA</b>: North America
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SA</b>: South America
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param continentCode <p>
     *            For geolocation resource record sets, a two-letter
     *            abbreviation that identifies a continent. Amazon Route 53
     *            supports the following continent codes:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>AF</b>: Africa
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>AN</b>: Antarctica
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>AS</b>: Asia
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>EU</b>: Europe
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>OC</b>: Oceania
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>NA</b>: North America
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>SA</b>: South America
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeoLocationRequest withContinentCode(String continentCode) {
        this.continentCode = continentCode;
        return this;
    }

    /**
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in
     * <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard
     * 3166-1 alpha-2</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return <p>
     *         Amazon Route 53 uses the two-letter country codes that are
     *         specified in <a
     *         href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *         standard 3166-1 alpha-2</a>.
     *         </p>
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in
     * <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard
     * 3166-1 alpha-2</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param countryCode <p>
     *            Amazon Route 53 uses the two-letter country codes that are
     *            specified in <a
     *            href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *            standard 3166-1 alpha-2</a>.
     *            </p>
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in
     * <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard
     * 3166-1 alpha-2</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param countryCode <p>
     *            Amazon Route 53 uses the two-letter country codes that are
     *            specified in <a
     *            href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *            standard 3166-1 alpha-2</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeoLocationRequest withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * <p>
     * For <code>SubdivisionCode</code>, Amazon Route 53 supports only states of
     * the United States. For a list of state abbreviations, see <a
     * href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter
     * State and Possession Abbreviations</a> on the United States Postal
     * Service website.
     * </p>
     * <p>
     * If you specify <code>subdivisioncode</code>, you must also specify
     * <code>US</code> for <code>CountryCode</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @return <p>
     *         For <code>SubdivisionCode</code>, Amazon Route 53 supports only
     *         states of the United States. For a list of state abbreviations,
     *         see <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix
     *         B: Two–Letter State and Possession Abbreviations</a> on the
     *         United States Postal Service website.
     *         </p>
     *         <p>
     *         If you specify <code>subdivisioncode</code>, you must also
     *         specify <code>US</code> for <code>CountryCode</code>.
     *         </p>
     */
    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    /**
     * <p>
     * For <code>SubdivisionCode</code>, Amazon Route 53 supports only states of
     * the United States. For a list of state abbreviations, see <a
     * href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter
     * State and Possession Abbreviations</a> on the United States Postal
     * Service website.
     * </p>
     * <p>
     * If you specify <code>subdivisioncode</code>, you must also specify
     * <code>US</code> for <code>CountryCode</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param subdivisionCode <p>
     *            For <code>SubdivisionCode</code>, Amazon Route 53 supports
     *            only states of the United States. For a list of state
     *            abbreviations, see <a
     *            href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B:
     *            Two–Letter State and Possession Abbreviations</a> on the
     *            United States Postal Service website.
     *            </p>
     *            <p>
     *            If you specify <code>subdivisioncode</code>, you must also
     *            specify <code>US</code> for <code>CountryCode</code>.
     *            </p>
     */
    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * For <code>SubdivisionCode</code>, Amazon Route 53 supports only states of
     * the United States. For a list of state abbreviations, see <a
     * href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter
     * State and Possession Abbreviations</a> on the United States Postal
     * Service website.
     * </p>
     * <p>
     * If you specify <code>subdivisioncode</code>, you must also specify
     * <code>US</code> for <code>CountryCode</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param subdivisionCode <p>
     *            For <code>SubdivisionCode</code>, Amazon Route 53 supports
     *            only states of the United States. For a list of state
     *            abbreviations, see <a
     *            href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B:
     *            Two–Letter State and Possession Abbreviations</a> on the
     *            United States Postal Service website.
     *            </p>
     *            <p>
     *            If you specify <code>subdivisioncode</code>, you must also
     *            specify <code>US</code> for <code>CountryCode</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetGeoLocationRequest withSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
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
        if (getContinentCode() != null)
            sb.append("ContinentCode: " + getContinentCode() + ",");
        if (getCountryCode() != null)
            sb.append("CountryCode: " + getCountryCode() + ",");
        if (getSubdivisionCode() != null)
            sb.append("SubdivisionCode: " + getSubdivisionCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContinentCode() == null) ? 0 : getContinentCode().hashCode());
        hashCode = prime * hashCode
                + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode
                + ((getSubdivisionCode() == null) ? 0 : getSubdivisionCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeoLocationRequest == false)
            return false;
        GetGeoLocationRequest other = (GetGeoLocationRequest) obj;

        if (other.getContinentCode() == null ^ this.getContinentCode() == null)
            return false;
        if (other.getContinentCode() != null
                && other.getContinentCode().equals(this.getContinentCode()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null
                && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getSubdivisionCode() == null ^ this.getSubdivisionCode() == null)
            return false;
        if (other.getSubdivisionCode() != null
                && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false)
            return false;
        return true;
    }
}
