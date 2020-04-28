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
 * Retrieves a list of supported geographic locations.
 * </p>
 * <p>
 * Countries are listed first, and continents are listed last. If Amazon Route
 * 53 supports subdivisions for a country (for example, states or provinces),
 * the subdivisions for that country are listed in alphabetical order
 * immediately after the corresponding country.
 * </p>
 * <p>
 * For a list of supported geolocation codes, see the <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_GeoLocation.html"
 * >GeoLocation</a> data type.
 * </p>
 */
public class ListGeoLocationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The code for the continent with which you want to start listing locations
     * that Amazon Route 53 supports for geolocation. If Route 53 has already
     * returned a page or more of results, if <code>IsTruncated</code> is true,
     * and if <code>NextContinentCode</code> from the previous response has a
     * value, enter that value in <code>startcontinentcode</code> to return the
     * next page of results.
     * </p>
     * <p>
     * Include <code>startcontinentcode</code> only if you want to list
     * continents. Don't include <code>startcontinentcode</code> when you're
     * listing countries or countries with their subdivisions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     */
    private String startContinentCode;

    /**
     * <p>
     * The code for the country with which you want to start listing locations
     * that Amazon Route 53 supports for geolocation. If Route 53 has already
     * returned a page or more of results, if <code>IsTruncated</code> is
     * <code>true</code>, and if <code>NextCountryCode</code> from the previous
     * response has a value, enter that value in <code>startcountrycode</code>
     * to return the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String startCountryCode;

    /**
     * <p>
     * The code for the state of the United States with which you want to start
     * listing locations that Amazon Route 53 supports for geolocation. If Route
     * 53 has already returned a page or more of results, if
     * <code>IsTruncated</code> is <code>true</code>, and if
     * <code>NextSubdivisionCode</code> from the previous response has a value,
     * enter that value in <code>startsubdivisioncode</code> to return the next
     * page of results.
     * </p>
     * <p>
     * To list subdivisions (U.S. states), you must include both
     * <code>startcountrycode</code> and <code>startsubdivisioncode</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     */
    private String startSubdivisionCode;

    /**
     * <p>
     * (Optional) The maximum number of geolocations to be included in the
     * response body for this request. If more than <code>maxitems</code>
     * geolocations remain to be listed, then the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The code for the continent with which you want to start listing locations
     * that Amazon Route 53 supports for geolocation. If Route 53 has already
     * returned a page or more of results, if <code>IsTruncated</code> is true,
     * and if <code>NextContinentCode</code> from the previous response has a
     * value, enter that value in <code>startcontinentcode</code> to return the
     * next page of results.
     * </p>
     * <p>
     * Include <code>startcontinentcode</code> only if you want to list
     * continents. Don't include <code>startcontinentcode</code> when you're
     * listing countries or countries with their subdivisions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @return <p>
     *         The code for the continent with which you want to start listing
     *         locations that Amazon Route 53 supports for geolocation. If Route
     *         53 has already returned a page or more of results, if
     *         <code>IsTruncated</code> is true, and if
     *         <code>NextContinentCode</code> from the previous response has a
     *         value, enter that value in <code>startcontinentcode</code> to
     *         return the next page of results.
     *         </p>
     *         <p>
     *         Include <code>startcontinentcode</code> only if you want to list
     *         continents. Don't include <code>startcontinentcode</code> when
     *         you're listing countries or countries with their subdivisions.
     *         </p>
     */
    public String getStartContinentCode() {
        return startContinentCode;
    }

    /**
     * <p>
     * The code for the continent with which you want to start listing locations
     * that Amazon Route 53 supports for geolocation. If Route 53 has already
     * returned a page or more of results, if <code>IsTruncated</code> is true,
     * and if <code>NextContinentCode</code> from the previous response has a
     * value, enter that value in <code>startcontinentcode</code> to return the
     * next page of results.
     * </p>
     * <p>
     * Include <code>startcontinentcode</code> only if you want to list
     * continents. Don't include <code>startcontinentcode</code> when you're
     * listing countries or countries with their subdivisions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param startContinentCode <p>
     *            The code for the continent with which you want to start
     *            listing locations that Amazon Route 53 supports for
     *            geolocation. If Route 53 has already returned a page or more
     *            of results, if <code>IsTruncated</code> is true, and if
     *            <code>NextContinentCode</code> from the previous response has
     *            a value, enter that value in <code>startcontinentcode</code>
     *            to return the next page of results.
     *            </p>
     *            <p>
     *            Include <code>startcontinentcode</code> only if you want to
     *            list continents. Don't include <code>startcontinentcode</code>
     *            when you're listing countries or countries with their
     *            subdivisions.
     *            </p>
     */
    public void setStartContinentCode(String startContinentCode) {
        this.startContinentCode = startContinentCode;
    }

    /**
     * <p>
     * The code for the continent with which you want to start listing locations
     * that Amazon Route 53 supports for geolocation. If Route 53 has already
     * returned a page or more of results, if <code>IsTruncated</code> is true,
     * and if <code>NextContinentCode</code> from the previous response has a
     * value, enter that value in <code>startcontinentcode</code> to return the
     * next page of results.
     * </p>
     * <p>
     * Include <code>startcontinentcode</code> only if you want to list
     * continents. Don't include <code>startcontinentcode</code> when you're
     * listing countries or countries with their subdivisions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param startContinentCode <p>
     *            The code for the continent with which you want to start
     *            listing locations that Amazon Route 53 supports for
     *            geolocation. If Route 53 has already returned a page or more
     *            of results, if <code>IsTruncated</code> is true, and if
     *            <code>NextContinentCode</code> from the previous response has
     *            a value, enter that value in <code>startcontinentcode</code>
     *            to return the next page of results.
     *            </p>
     *            <p>
     *            Include <code>startcontinentcode</code> only if you want to
     *            list continents. Don't include <code>startcontinentcode</code>
     *            when you're listing countries or countries with their
     *            subdivisions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsRequest withStartContinentCode(String startContinentCode) {
        this.startContinentCode = startContinentCode;
        return this;
    }

    /**
     * <p>
     * The code for the country with which you want to start listing locations
     * that Amazon Route 53 supports for geolocation. If Route 53 has already
     * returned a page or more of results, if <code>IsTruncated</code> is
     * <code>true</code>, and if <code>NextCountryCode</code> from the previous
     * response has a value, enter that value in <code>startcountrycode</code>
     * to return the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return <p>
     *         The code for the country with which you want to start listing
     *         locations that Amazon Route 53 supports for geolocation. If Route
     *         53 has already returned a page or more of results, if
     *         <code>IsTruncated</code> is <code>true</code>, and if
     *         <code>NextCountryCode</code> from the previous response has a
     *         value, enter that value in <code>startcountrycode</code> to
     *         return the next page of results.
     *         </p>
     */
    public String getStartCountryCode() {
        return startCountryCode;
    }

    /**
     * <p>
     * The code for the country with which you want to start listing locations
     * that Amazon Route 53 supports for geolocation. If Route 53 has already
     * returned a page or more of results, if <code>IsTruncated</code> is
     * <code>true</code>, and if <code>NextCountryCode</code> from the previous
     * response has a value, enter that value in <code>startcountrycode</code>
     * to return the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param startCountryCode <p>
     *            The code for the country with which you want to start listing
     *            locations that Amazon Route 53 supports for geolocation. If
     *            Route 53 has already returned a page or more of results, if
     *            <code>IsTruncated</code> is <code>true</code>, and if
     *            <code>NextCountryCode</code> from the previous response has a
     *            value, enter that value in <code>startcountrycode</code> to
     *            return the next page of results.
     *            </p>
     */
    public void setStartCountryCode(String startCountryCode) {
        this.startCountryCode = startCountryCode;
    }

    /**
     * <p>
     * The code for the country with which you want to start listing locations
     * that Amazon Route 53 supports for geolocation. If Route 53 has already
     * returned a page or more of results, if <code>IsTruncated</code> is
     * <code>true</code>, and if <code>NextCountryCode</code> from the previous
     * response has a value, enter that value in <code>startcountrycode</code>
     * to return the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param startCountryCode <p>
     *            The code for the country with which you want to start listing
     *            locations that Amazon Route 53 supports for geolocation. If
     *            Route 53 has already returned a page or more of results, if
     *            <code>IsTruncated</code> is <code>true</code>, and if
     *            <code>NextCountryCode</code> from the previous response has a
     *            value, enter that value in <code>startcountrycode</code> to
     *            return the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsRequest withStartCountryCode(String startCountryCode) {
        this.startCountryCode = startCountryCode;
        return this;
    }

    /**
     * <p>
     * The code for the state of the United States with which you want to start
     * listing locations that Amazon Route 53 supports for geolocation. If Route
     * 53 has already returned a page or more of results, if
     * <code>IsTruncated</code> is <code>true</code>, and if
     * <code>NextSubdivisionCode</code> from the previous response has a value,
     * enter that value in <code>startsubdivisioncode</code> to return the next
     * page of results.
     * </p>
     * <p>
     * To list subdivisions (U.S. states), you must include both
     * <code>startcountrycode</code> and <code>startsubdivisioncode</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @return <p>
     *         The code for the state of the United States with which you want
     *         to start listing locations that Amazon Route 53 supports for
     *         geolocation. If Route 53 has already returned a page or more of
     *         results, if <code>IsTruncated</code> is <code>true</code>, and if
     *         <code>NextSubdivisionCode</code> from the previous response has a
     *         value, enter that value in <code>startsubdivisioncode</code> to
     *         return the next page of results.
     *         </p>
     *         <p>
     *         To list subdivisions (U.S. states), you must include both
     *         <code>startcountrycode</code> and
     *         <code>startsubdivisioncode</code>.
     *         </p>
     */
    public String getStartSubdivisionCode() {
        return startSubdivisionCode;
    }

    /**
     * <p>
     * The code for the state of the United States with which you want to start
     * listing locations that Amazon Route 53 supports for geolocation. If Route
     * 53 has already returned a page or more of results, if
     * <code>IsTruncated</code> is <code>true</code>, and if
     * <code>NextSubdivisionCode</code> from the previous response has a value,
     * enter that value in <code>startsubdivisioncode</code> to return the next
     * page of results.
     * </p>
     * <p>
     * To list subdivisions (U.S. states), you must include both
     * <code>startcountrycode</code> and <code>startsubdivisioncode</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param startSubdivisionCode <p>
     *            The code for the state of the United States with which you
     *            want to start listing locations that Amazon Route 53 supports
     *            for geolocation. If Route 53 has already returned a page or
     *            more of results, if <code>IsTruncated</code> is
     *            <code>true</code>, and if <code>NextSubdivisionCode</code>
     *            from the previous response has a value, enter that value in
     *            <code>startsubdivisioncode</code> to return the next page of
     *            results.
     *            </p>
     *            <p>
     *            To list subdivisions (U.S. states), you must include both
     *            <code>startcountrycode</code> and
     *            <code>startsubdivisioncode</code>.
     *            </p>
     */
    public void setStartSubdivisionCode(String startSubdivisionCode) {
        this.startSubdivisionCode = startSubdivisionCode;
    }

    /**
     * <p>
     * The code for the state of the United States with which you want to start
     * listing locations that Amazon Route 53 supports for geolocation. If Route
     * 53 has already returned a page or more of results, if
     * <code>IsTruncated</code> is <code>true</code>, and if
     * <code>NextSubdivisionCode</code> from the previous response has a value,
     * enter that value in <code>startsubdivisioncode</code> to return the next
     * page of results.
     * </p>
     * <p>
     * To list subdivisions (U.S. states), you must include both
     * <code>startcountrycode</code> and <code>startsubdivisioncode</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param startSubdivisionCode <p>
     *            The code for the state of the United States with which you
     *            want to start listing locations that Amazon Route 53 supports
     *            for geolocation. If Route 53 has already returned a page or
     *            more of results, if <code>IsTruncated</code> is
     *            <code>true</code>, and if <code>NextSubdivisionCode</code>
     *            from the previous response has a value, enter that value in
     *            <code>startsubdivisioncode</code> to return the next page of
     *            results.
     *            </p>
     *            <p>
     *            To list subdivisions (U.S. states), you must include both
     *            <code>startcountrycode</code> and
     *            <code>startsubdivisioncode</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsRequest withStartSubdivisionCode(String startSubdivisionCode) {
        this.startSubdivisionCode = startSubdivisionCode;
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of geolocations to be included in the
     * response body for this request. If more than <code>maxitems</code>
     * geolocations remain to be listed, then the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         (Optional) The maximum number of geolocations to be included in
     *         the response body for this request. If more than
     *         <code>maxitems</code> geolocations remain to be listed, then the
     *         value of the <code>IsTruncated</code> element in the response is
     *         <code>true</code>.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of geolocations to be included in the
     * response body for this request. If more than <code>maxitems</code>
     * geolocations remain to be listed, then the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>.
     * </p>
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of geolocations to be included
     *            in the response body for this request. If more than
     *            <code>maxitems</code> geolocations remain to be listed, then
     *            the value of the <code>IsTruncated</code> element in the
     *            response is <code>true</code>.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of geolocations to be included in the
     * response body for this request. If more than <code>maxitems</code>
     * geolocations remain to be listed, then the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of geolocations to be included
     *            in the response body for this request. If more than
     *            <code>maxitems</code> geolocations remain to be listed, then
     *            the value of the <code>IsTruncated</code> element in the
     *            response is <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsRequest withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getStartContinentCode() != null)
            sb.append("StartContinentCode: " + getStartContinentCode() + ",");
        if (getStartCountryCode() != null)
            sb.append("StartCountryCode: " + getStartCountryCode() + ",");
        if (getStartSubdivisionCode() != null)
            sb.append("StartSubdivisionCode: " + getStartSubdivisionCode() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStartContinentCode() == null) ? 0 : getStartContinentCode().hashCode());
        hashCode = prime * hashCode
                + ((getStartCountryCode() == null) ? 0 : getStartCountryCode().hashCode());
        hashCode = prime * hashCode
                + ((getStartSubdivisionCode() == null) ? 0 : getStartSubdivisionCode().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoLocationsRequest == false)
            return false;
        ListGeoLocationsRequest other = (ListGeoLocationsRequest) obj;

        if (other.getStartContinentCode() == null ^ this.getStartContinentCode() == null)
            return false;
        if (other.getStartContinentCode() != null
                && other.getStartContinentCode().equals(this.getStartContinentCode()) == false)
            return false;
        if (other.getStartCountryCode() == null ^ this.getStartCountryCode() == null)
            return false;
        if (other.getStartCountryCode() != null
                && other.getStartCountryCode().equals(this.getStartCountryCode()) == false)
            return false;
        if (other.getStartSubdivisionCode() == null ^ this.getStartSubdivisionCode() == null)
            return false;
        if (other.getStartSubdivisionCode() != null
                && other.getStartSubdivisionCode().equals(this.getStartSubdivisionCode()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
