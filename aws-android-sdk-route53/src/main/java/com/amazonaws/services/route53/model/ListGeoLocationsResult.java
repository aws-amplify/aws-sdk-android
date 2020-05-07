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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type containing the response information for the request.
 * </p>
 */
public class ListGeoLocationsResult implements Serializable {
    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element
     * for each location that Amazon Route 53 supports for geolocation.
     * </p>
     */
    private java.util.List<GeoLocationDetails> geoLocationDetailsList;

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after
     * the last location in this response. If so, the value of
     * <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     * another request and include the values of <code>NextContinentCode</code>,
     * <code>NextCountryCode</code>, and <code>NextSubdivisionCode</code> in the
     * <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextContinentCode</code> in the <code>startcontinentcode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     */
    private String nextContinentCode;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextCountryCode</code> in the <code>startcountrycode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String nextCountryCode;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     */
    private String nextSubdivisionCode;

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the request.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element
     * for each location that Amazon Route 53 supports for geolocation.
     * </p>
     *
     * @return <p>
     *         A complex type that contains one <code>GeoLocationDetails</code>
     *         element for each location that Amazon Route 53 supports for
     *         geolocation.
     *         </p>
     */
    public java.util.List<GeoLocationDetails> getGeoLocationDetailsList() {
        return geoLocationDetailsList;
    }

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element
     * for each location that Amazon Route 53 supports for geolocation.
     * </p>
     *
     * @param geoLocationDetailsList <p>
     *            A complex type that contains one
     *            <code>GeoLocationDetails</code> element for each location that
     *            Amazon Route 53 supports for geolocation.
     *            </p>
     */
    public void setGeoLocationDetailsList(
            java.util.Collection<GeoLocationDetails> geoLocationDetailsList) {
        if (geoLocationDetailsList == null) {
            this.geoLocationDetailsList = null;
            return;
        }

        this.geoLocationDetailsList = new java.util.ArrayList<GeoLocationDetails>(
                geoLocationDetailsList);
    }

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element
     * for each location that Amazon Route 53 supports for geolocation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoLocationDetailsList <p>
     *            A complex type that contains one
     *            <code>GeoLocationDetails</code> element for each location that
     *            Amazon Route 53 supports for geolocation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withGeoLocationDetailsList(
            GeoLocationDetails... geoLocationDetailsList) {
        if (getGeoLocationDetailsList() == null) {
            this.geoLocationDetailsList = new java.util.ArrayList<GeoLocationDetails>(
                    geoLocationDetailsList.length);
        }
        for (GeoLocationDetails value : geoLocationDetailsList) {
            this.geoLocationDetailsList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element
     * for each location that Amazon Route 53 supports for geolocation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param geoLocationDetailsList <p>
     *            A complex type that contains one
     *            <code>GeoLocationDetails</code> element for each location that
     *            Amazon Route 53 supports for geolocation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withGeoLocationDetailsList(
            java.util.Collection<GeoLocationDetails> geoLocationDetailsList) {
        setGeoLocationDetailsList(geoLocationDetailsList);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after
     * the last location in this response. If so, the value of
     * <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     * another request and include the values of <code>NextContinentCode</code>,
     * <code>NextCountryCode</code>, and <code>NextSubdivisionCode</code> in the
     * <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether more locations remain to be listed
     *         after the last location in this response. If so, the value of
     *         <code>IsTruncated</code> is <code>true</code>. To get more
     *         values, submit another request and include the values of
     *         <code>NextContinentCode</code>, <code>NextCountryCode</code>, and
     *         <code>NextSubdivisionCode</code> in the
     *         <code>startcontinentcode</code>, <code>startcountrycode</code>,
     *         and <code>startsubdivisioncode</code>, as applicable.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after
     * the last location in this response. If so, the value of
     * <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     * another request and include the values of <code>NextContinentCode</code>,
     * <code>NextCountryCode</code>, and <code>NextSubdivisionCode</code> in the
     * <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether more locations remain to be listed
     *         after the last location in this response. If so, the value of
     *         <code>IsTruncated</code> is <code>true</code>. To get more
     *         values, submit another request and include the values of
     *         <code>NextContinentCode</code>, <code>NextCountryCode</code>, and
     *         <code>NextSubdivisionCode</code> in the
     *         <code>startcontinentcode</code>, <code>startcountrycode</code>,
     *         and <code>startsubdivisioncode</code>, as applicable.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after
     * the last location in this response. If so, the value of
     * <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     * another request and include the values of <code>NextContinentCode</code>,
     * <code>NextCountryCode</code>, and <code>NextSubdivisionCode</code> in the
     * <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     *
     * @param isTruncated <p>
     *            A value that indicates whether more locations remain to be
     *            listed after the last location in this response. If so, the
     *            value of <code>IsTruncated</code> is <code>true</code>. To get
     *            more values, submit another request and include the values of
     *            <code>NextContinentCode</code>, <code>NextCountryCode</code>,
     *            and <code>NextSubdivisionCode</code> in the
     *            <code>startcontinentcode</code>, <code>startcountrycode</code>
     *            , and <code>startsubdivisioncode</code>, as applicable.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after
     * the last location in this response. If so, the value of
     * <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     * another request and include the values of <code>NextContinentCode</code>,
     * <code>NextCountryCode</code>, and <code>NextSubdivisionCode</code> in the
     * <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A value that indicates whether more locations remain to be
     *            listed after the last location in this response. If so, the
     *            value of <code>IsTruncated</code> is <code>true</code>. To get
     *            more values, submit another request and include the values of
     *            <code>NextContinentCode</code>, <code>NextCountryCode</code>,
     *            and <code>NextSubdivisionCode</code> in the
     *            <code>startcontinentcode</code>, <code>startcountrycode</code>
     *            , and <code>startsubdivisioncode</code>, as applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextContinentCode</code> in the <code>startcontinentcode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>, you can make a
     *         follow-up request to display more locations. Enter the value of
     *         <code>NextContinentCode</code> in the
     *         <code>startcontinentcode</code> parameter in another
     *         <code>ListGeoLocations</code> request.
     *         </p>
     */
    public String getNextContinentCode() {
        return nextContinentCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextContinentCode</code> in the <code>startcontinentcode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param nextContinentCode <p>
     *            If <code>IsTruncated</code> is <code>true</code>, you can make
     *            a follow-up request to display more locations. Enter the value
     *            of <code>NextContinentCode</code> in the
     *            <code>startcontinentcode</code> parameter in another
     *            <code>ListGeoLocations</code> request.
     *            </p>
     */
    public void setNextContinentCode(String nextContinentCode) {
        this.nextContinentCode = nextContinentCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextContinentCode</code> in the <code>startcontinentcode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param nextContinentCode <p>
     *            If <code>IsTruncated</code> is <code>true</code>, you can make
     *            a follow-up request to display more locations. Enter the value
     *            of <code>NextContinentCode</code> in the
     *            <code>startcontinentcode</code> parameter in another
     *            <code>ListGeoLocations</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withNextContinentCode(String nextContinentCode) {
        this.nextContinentCode = nextContinentCode;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextCountryCode</code> in the <code>startcountrycode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>, you can make a
     *         follow-up request to display more locations. Enter the value of
     *         <code>NextCountryCode</code> in the <code>startcountrycode</code>
     *         parameter in another <code>ListGeoLocations</code> request.
     *         </p>
     */
    public String getNextCountryCode() {
        return nextCountryCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextCountryCode</code> in the <code>startcountrycode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param nextCountryCode <p>
     *            If <code>IsTruncated</code> is <code>true</code>, you can make
     *            a follow-up request to display more locations. Enter the value
     *            of <code>NextCountryCode</code> in the
     *            <code>startcountrycode</code> parameter in another
     *            <code>ListGeoLocations</code> request.
     *            </p>
     */
    public void setNextCountryCode(String nextCountryCode) {
        this.nextCountryCode = nextCountryCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextCountryCode</code> in the <code>startcountrycode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param nextCountryCode <p>
     *            If <code>IsTruncated</code> is <code>true</code>, you can make
     *            a follow-up request to display more locations. Enter the value
     *            of <code>NextCountryCode</code> in the
     *            <code>startcountrycode</code> parameter in another
     *            <code>ListGeoLocations</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withNextCountryCode(String nextCountryCode) {
        this.nextCountryCode = nextCountryCode;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>, you can make a
     *         follow-up request to display more locations. Enter the value of
     *         <code>NextSubdivisionCode</code> in the
     *         <code>startsubdivisioncode</code> parameter in another
     *         <code>ListGeoLocations</code> request.
     *         </p>
     */
    public String getNextSubdivisionCode() {
        return nextSubdivisionCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param nextSubdivisionCode <p>
     *            If <code>IsTruncated</code> is <code>true</code>, you can make
     *            a follow-up request to display more locations. Enter the value
     *            of <code>NextSubdivisionCode</code> in the
     *            <code>startsubdivisioncode</code> parameter in another
     *            <code>ListGeoLocations</code> request.
     *            </p>
     */
    public void setNextSubdivisionCode(String nextSubdivisionCode) {
        this.nextSubdivisionCode = nextSubdivisionCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a
     * follow-up request to display more locations. Enter the value of
     * <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code>
     * parameter in another <code>ListGeoLocations</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param nextSubdivisionCode <p>
     *            If <code>IsTruncated</code> is <code>true</code>, you can make
     *            a follow-up request to display more locations. Enter the value
     *            of <code>NextSubdivisionCode</code> in the
     *            <code>startsubdivisioncode</code> parameter in another
     *            <code>ListGeoLocations</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withNextSubdivisionCode(String nextSubdivisionCode) {
        this.nextSubdivisionCode = nextSubdivisionCode;
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the request.
     * </p>
     *
     * @return <p>
     *         The value that you specified for <code>MaxItems</code> in the
     *         request.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the request.
     * </p>
     *
     * @param maxItems <p>
     *            The value that you specified for <code>MaxItems</code> in the
     *            request.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The value that you specified for <code>MaxItems</code> in the
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withMaxItems(String maxItems) {
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
        if (getGeoLocationDetailsList() != null)
            sb.append("GeoLocationDetailsList: " + getGeoLocationDetailsList() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextContinentCode() != null)
            sb.append("NextContinentCode: " + getNextContinentCode() + ",");
        if (getNextCountryCode() != null)
            sb.append("NextCountryCode: " + getNextCountryCode() + ",");
        if (getNextSubdivisionCode() != null)
            sb.append("NextSubdivisionCode: " + getNextSubdivisionCode() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGeoLocationDetailsList() == null) ? 0 : getGeoLocationDetailsList()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode
                + ((getNextContinentCode() == null) ? 0 : getNextContinentCode().hashCode());
        hashCode = prime * hashCode
                + ((getNextCountryCode() == null) ? 0 : getNextCountryCode().hashCode());
        hashCode = prime * hashCode
                + ((getNextSubdivisionCode() == null) ? 0 : getNextSubdivisionCode().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoLocationsResult == false)
            return false;
        ListGeoLocationsResult other = (ListGeoLocationsResult) obj;

        if (other.getGeoLocationDetailsList() == null ^ this.getGeoLocationDetailsList() == null)
            return false;
        if (other.getGeoLocationDetailsList() != null
                && other.getGeoLocationDetailsList().equals(this.getGeoLocationDetailsList()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextContinentCode() == null ^ this.getNextContinentCode() == null)
            return false;
        if (other.getNextContinentCode() != null
                && other.getNextContinentCode().equals(this.getNextContinentCode()) == false)
            return false;
        if (other.getNextCountryCode() == null ^ this.getNextCountryCode() == null)
            return false;
        if (other.getNextCountryCode() != null
                && other.getNextCountryCode().equals(this.getNextCountryCode()) == false)
            return false;
        if (other.getNextSubdivisionCode() == null ^ this.getNextSubdivisionCode() == null)
            return false;
        if (other.getNextSubdivisionCode() != null
                && other.getNextSubdivisionCode().equals(this.getNextSubdivisionCode()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
