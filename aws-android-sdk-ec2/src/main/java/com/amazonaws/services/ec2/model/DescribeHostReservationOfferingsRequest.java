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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the Dedicated Host reservations that are available to purchase.
 * </p>
 * <p>
 * The results describe all of the Dedicated Host reservation offerings,
 * including offerings that might not match the instance family and Region of
 * your Dedicated Hosts. When purchasing an offering, ensure that the instance
 * family and Region of the offering matches that of the Dedicated Hosts with
 * which it is to be associated. For more information about supported instance
 * types, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-overview.html"
 * >Dedicated Hosts Overview</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class DescribeHostReservationOfferingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for
     * example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filter;

    /**
     * <p>
     * This is the maximum duration of the reservation to purchase, specified in
     * seconds. Reservations are available in one-year and three-year terms. The
     * number of seconds specified must be the number of seconds in a year
     * (365x24x60x60) times one of the supported durations (1 or 3). For
     * example, specify 94608000 for three years.
     * </p>
     */
    private Integer maxDuration;

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 500<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * This is the minimum duration of the reservation you'd like to purchase,
     * specified in seconds. Reservations are available in one-year and
     * three-year terms. The number of seconds specified must be the number of
     * seconds in a year (365x24x60x60) times one of the supported durations (1
     * or 3). For example, specify 31536000 for one year.
     * </p>
     */
    private Integer minDuration;

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the reservation offering.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for
     * example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The filters.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>instance-family</code> - The instance family of the
     *         offering (for example, <code>m4</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>payment-option</code> - The payment option (
     *         <code>NoUpfront</code> | <code>PartialUpfront</code> |
     *         <code>AllUpfront</code>).
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<Filter> getFilter() {
        return filter;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for
     * example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     *
     * @param filter <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-family</code> - The instance family of the
     *            offering (for example, <code>m4</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>payment-option</code> - The payment option (
     *            <code>NoUpfront</code> | <code>PartialUpfront</code> |
     *            <code>AllUpfront</code>).
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new java.util.ArrayList<Filter>(filter);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for
     * example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-family</code> - The instance family of the
     *            offering (for example, <code>m4</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>payment-option</code> - The payment option (
     *            <code>NoUpfront</code> | <code>PartialUpfront</code> |
     *            <code>AllUpfront</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsRequest withFilter(Filter... filter) {
        if (getFilter() == null) {
            this.filter = new java.util.ArrayList<Filter>(filter.length);
        }
        for (Filter value : filter) {
            this.filter.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>instance-family</code> - The instance family of the offering (for
     * example, <code>m4</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>payment-option</code> - The payment option (<code>NoUpfront</code>
     * | <code>PartialUpfront</code> | <code>AllUpfront</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The filters.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>instance-family</code> - The instance family of the
     *            offering (for example, <code>m4</code>).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>payment-option</code> - The payment option (
     *            <code>NoUpfront</code> | <code>PartialUpfront</code> |
     *            <code>AllUpfront</code>).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsRequest withFilter(java.util.Collection<Filter> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * This is the maximum duration of the reservation to purchase, specified in
     * seconds. Reservations are available in one-year and three-year terms. The
     * number of seconds specified must be the number of seconds in a year
     * (365x24x60x60) times one of the supported durations (1 or 3). For
     * example, specify 94608000 for three years.
     * </p>
     *
     * @return <p>
     *         This is the maximum duration of the reservation to purchase,
     *         specified in seconds. Reservations are available in one-year and
     *         three-year terms. The number of seconds specified must be the
     *         number of seconds in a year (365x24x60x60) times one of the
     *         supported durations (1 or 3). For example, specify 94608000 for
     *         three years.
     *         </p>
     */
    public Integer getMaxDuration() {
        return maxDuration;
    }

    /**
     * <p>
     * This is the maximum duration of the reservation to purchase, specified in
     * seconds. Reservations are available in one-year and three-year terms. The
     * number of seconds specified must be the number of seconds in a year
     * (365x24x60x60) times one of the supported durations (1 or 3). For
     * example, specify 94608000 for three years.
     * </p>
     *
     * @param maxDuration <p>
     *            This is the maximum duration of the reservation to purchase,
     *            specified in seconds. Reservations are available in one-year
     *            and three-year terms. The number of seconds specified must be
     *            the number of seconds in a year (365x24x60x60) times one of
     *            the supported durations (1 or 3). For example, specify
     *            94608000 for three years.
     *            </p>
     */
    public void setMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
    }

    /**
     * <p>
     * This is the maximum duration of the reservation to purchase, specified in
     * seconds. Reservations are available in one-year and three-year terms. The
     * number of seconds specified must be the number of seconds in a year
     * (365x24x60x60) times one of the supported durations (1 or 3). For
     * example, specify 94608000 for three years.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxDuration <p>
     *            This is the maximum duration of the reservation to purchase,
     *            specified in seconds. Reservations are available in one-year
     *            and three-year terms. The number of seconds specified must be
     *            the number of seconds in a year (365x24x60x60) times one of
     *            the supported durations (1 or 3). For example, specify
     *            94608000 for three years.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsRequest withMaxDuration(Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 500<br/>
     *
     * @return <p>
     *         The maximum number of results to return for the request in a
     *         single page. The remaining results can be seen by sending another
     *         request with the returned <code>nextToken</code> value. This
     *         value can be between 5 and 500. If <code>maxResults</code> is
     *         given a larger value than 500, you receive an error.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the returned <code>nextToken</code>
     *            value. This value can be between 5 and 500. If
     *            <code>maxResults</code> is given a larger value than 500, you
     *            receive an error.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>nextToken</code> value. This value can be between 5 and
     * 500. If <code>maxResults</code> is given a larger value than 500, you
     * receive an error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 500<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return for the request in a
     *            single page. The remaining results can be seen by sending
     *            another request with the returned <code>nextToken</code>
     *            value. This value can be between 5 and 500. If
     *            <code>maxResults</code> is given a larger value than 500, you
     *            receive an error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * This is the minimum duration of the reservation you'd like to purchase,
     * specified in seconds. Reservations are available in one-year and
     * three-year terms. The number of seconds specified must be the number of
     * seconds in a year (365x24x60x60) times one of the supported durations (1
     * or 3). For example, specify 31536000 for one year.
     * </p>
     *
     * @return <p>
     *         This is the minimum duration of the reservation you'd like to
     *         purchase, specified in seconds. Reservations are available in
     *         one-year and three-year terms. The number of seconds specified
     *         must be the number of seconds in a year (365x24x60x60) times one
     *         of the supported durations (1 or 3). For example, specify
     *         31536000 for one year.
     *         </p>
     */
    public Integer getMinDuration() {
        return minDuration;
    }

    /**
     * <p>
     * This is the minimum duration of the reservation you'd like to purchase,
     * specified in seconds. Reservations are available in one-year and
     * three-year terms. The number of seconds specified must be the number of
     * seconds in a year (365x24x60x60) times one of the supported durations (1
     * or 3). For example, specify 31536000 for one year.
     * </p>
     *
     * @param minDuration <p>
     *            This is the minimum duration of the reservation you'd like to
     *            purchase, specified in seconds. Reservations are available in
     *            one-year and three-year terms. The number of seconds specified
     *            must be the number of seconds in a year (365x24x60x60) times
     *            one of the supported durations (1 or 3). For example, specify
     *            31536000 for one year.
     *            </p>
     */
    public void setMinDuration(Integer minDuration) {
        this.minDuration = minDuration;
    }

    /**
     * <p>
     * This is the minimum duration of the reservation you'd like to purchase,
     * specified in seconds. Reservations are available in one-year and
     * three-year terms. The number of seconds specified must be the number of
     * seconds in a year (365x24x60x60) times one of the supported durations (1
     * or 3). For example, specify 31536000 for one year.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minDuration <p>
     *            This is the minimum duration of the reservation you'd like to
     *            purchase, specified in seconds. Reservations are available in
     *            one-year and three-year terms. The number of seconds specified
     *            must be the number of seconds in a year (365x24x60x60) times
     *            one of the supported durations (1 or 3). For example, specify
     *            31536000 for one year.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsRequest withMinDuration(Integer minDuration) {
        this.minDuration = minDuration;
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The ID of the reservation offering.
     * </p>
     *
     * @return <p>
     *         The ID of the reservation offering.
     *         </p>
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * <p>
     * The ID of the reservation offering.
     * </p>
     *
     * @param offeringId <p>
     *            The ID of the reservation offering.
     *            </p>
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the reservation offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringId <p>
     *            The ID of the reservation offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHostReservationOfferingsRequest withOfferingId(String offeringId) {
        this.offeringId = offeringId;
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getMaxDuration() != null)
            sb.append("MaxDuration: " + getMaxDuration() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getMinDuration() != null)
            sb.append("MinDuration: " + getMinDuration() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getMaxDuration() == null) ? 0 : getMaxDuration().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getMinDuration() == null) ? 0 : getMinDuration().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHostReservationOfferingsRequest == false)
            return false;
        DescribeHostReservationOfferingsRequest other = (DescribeHostReservationOfferingsRequest) obj;

        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxDuration() == null ^ this.getMaxDuration() == null)
            return false;
        if (other.getMaxDuration() != null
                && other.getMaxDuration().equals(this.getMaxDuration()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMinDuration() == null ^ this.getMinDuration() == null)
            return false;
        if (other.getMinDuration() != null
                && other.getMinDuration().equals(this.getMinDuration()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        return true;
    }
}
