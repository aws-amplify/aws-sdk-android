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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns all the domain-related billing records for the current AWS account
 * for a specified period
 * </p>
 */
public class ViewBillingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The beginning date and time for the time period for which you want a list
     * of billing records. Specify the date and time in Unix time format and
     * Coordinated Universal time (UTC).
     * </p>
     */
    private java.util.Date start;

    /**
     * <p>
     * The end date and time for the time period for which you want a list of
     * billing records. Specify the date and time in Unix time format and
     * Coordinated Universal time (UTC).
     * </p>
     */
    private java.util.Date end;

    /**
     * <p>
     * For an initial request for a list of billing records, omit this element.
     * If the number of billing records that are associated with the current AWS
     * account during the specified period is greater than the value that you
     * specified for <code>MaxItems</code>, you can use <code>Marker</code> to
     * return additional billing records. Get the value of
     * <code>NextPageMarker</code> from the previous response, and submit
     * another request that includes the value of <code>NextPageMarker</code> in
     * the <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value of
     * <code>NextPageMarker</code> that was returned in the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String marker;

    /**
     * <p>
     * The number of billing records to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     */
    private Integer maxItems;

    /**
     * <p>
     * The beginning date and time for the time period for which you want a list
     * of billing records. Specify the date and time in Unix time format and
     * Coordinated Universal time (UTC).
     * </p>
     *
     * @return <p>
     *         The beginning date and time for the time period for which you
     *         want a list of billing records. Specify the date and time in Unix
     *         time format and Coordinated Universal time (UTC).
     *         </p>
     */
    public java.util.Date getStart() {
        return start;
    }

    /**
     * <p>
     * The beginning date and time for the time period for which you want a list
     * of billing records. Specify the date and time in Unix time format and
     * Coordinated Universal time (UTC).
     * </p>
     *
     * @param start <p>
     *            The beginning date and time for the time period for which you
     *            want a list of billing records. Specify the date and time in
     *            Unix time format and Coordinated Universal time (UTC).
     *            </p>
     */
    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The beginning date and time for the time period for which you want a list
     * of billing records. Specify the date and time in Unix time format and
     * Coordinated Universal time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start <p>
     *            The beginning date and time for the time period for which you
     *            want a list of billing records. Specify the date and time in
     *            Unix time format and Coordinated Universal time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewBillingRequest withStart(java.util.Date start) {
        this.start = start;
        return this;
    }

    /**
     * <p>
     * The end date and time for the time period for which you want a list of
     * billing records. Specify the date and time in Unix time format and
     * Coordinated Universal time (UTC).
     * </p>
     *
     * @return <p>
     *         The end date and time for the time period for which you want a
     *         list of billing records. Specify the date and time in Unix time
     *         format and Coordinated Universal time (UTC).
     *         </p>
     */
    public java.util.Date getEnd() {
        return end;
    }

    /**
     * <p>
     * The end date and time for the time period for which you want a list of
     * billing records. Specify the date and time in Unix time format and
     * Coordinated Universal time (UTC).
     * </p>
     *
     * @param end <p>
     *            The end date and time for the time period for which you want a
     *            list of billing records. Specify the date and time in Unix
     *            time format and Coordinated Universal time (UTC).
     *            </p>
     */
    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The end date and time for the time period for which you want a list of
     * billing records. Specify the date and time in Unix time format and
     * Coordinated Universal time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end <p>
     *            The end date and time for the time period for which you want a
     *            list of billing records. Specify the date and time in Unix
     *            time format and Coordinated Universal time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewBillingRequest withEnd(java.util.Date end) {
        this.end = end;
        return this;
    }

    /**
     * <p>
     * For an initial request for a list of billing records, omit this element.
     * If the number of billing records that are associated with the current AWS
     * account during the specified period is greater than the value that you
     * specified for <code>MaxItems</code>, you can use <code>Marker</code> to
     * return additional billing records. Get the value of
     * <code>NextPageMarker</code> from the previous response, and submit
     * another request that includes the value of <code>NextPageMarker</code> in
     * the <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value of
     * <code>NextPageMarker</code> that was returned in the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         For an initial request for a list of billing records, omit this
     *         element. If the number of billing records that are associated
     *         with the current AWS account during the specified period is
     *         greater than the value that you specified for
     *         <code>MaxItems</code>, you can use <code>Marker</code> to return
     *         additional billing records. Get the value of
     *         <code>NextPageMarker</code> from the previous response, and
     *         submit another request that includes the value of
     *         <code>NextPageMarker</code> in the <code>Marker</code> element.
     *         </p>
     *         <p>
     *         Constraints: The marker must match the value of
     *         <code>NextPageMarker</code> that was returned in the previous
     *         response.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * For an initial request for a list of billing records, omit this element.
     * If the number of billing records that are associated with the current AWS
     * account during the specified period is greater than the value that you
     * specified for <code>MaxItems</code>, you can use <code>Marker</code> to
     * return additional billing records. Get the value of
     * <code>NextPageMarker</code> from the previous response, and submit
     * another request that includes the value of <code>NextPageMarker</code> in
     * the <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value of
     * <code>NextPageMarker</code> that was returned in the previous response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param marker <p>
     *            For an initial request for a list of billing records, omit
     *            this element. If the number of billing records that are
     *            associated with the current AWS account during the specified
     *            period is greater than the value that you specified for
     *            <code>MaxItems</code>, you can use <code>Marker</code> to
     *            return additional billing records. Get the value of
     *            <code>NextPageMarker</code> from the previous response, and
     *            submit another request that includes the value of
     *            <code>NextPageMarker</code> in the <code>Marker</code>
     *            element.
     *            </p>
     *            <p>
     *            Constraints: The marker must match the value of
     *            <code>NextPageMarker</code> that was returned in the previous
     *            response.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For an initial request for a list of billing records, omit this element.
     * If the number of billing records that are associated with the current AWS
     * account during the specified period is greater than the value that you
     * specified for <code>MaxItems</code>, you can use <code>Marker</code> to
     * return additional billing records. Get the value of
     * <code>NextPageMarker</code> from the previous response, and submit
     * another request that includes the value of <code>NextPageMarker</code> in
     * the <code>Marker</code> element.
     * </p>
     * <p>
     * Constraints: The marker must match the value of
     * <code>NextPageMarker</code> that was returned in the previous response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param marker <p>
     *            For an initial request for a list of billing records, omit
     *            this element. If the number of billing records that are
     *            associated with the current AWS account during the specified
     *            period is greater than the value that you specified for
     *            <code>MaxItems</code>, you can use <code>Marker</code> to
     *            return additional billing records. Get the value of
     *            <code>NextPageMarker</code> from the previous response, and
     *            submit another request that includes the value of
     *            <code>NextPageMarker</code> in the <code>Marker</code>
     *            element.
     *            </p>
     *            <p>
     *            Constraints: The marker must match the value of
     *            <code>NextPageMarker</code> that was returned in the previous
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewBillingRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The number of billing records to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         The number of billing records to be returned.
     *         </p>
     *         <p>
     *         Default: 20
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The number of billing records to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxItems <p>
     *            The number of billing records to be returned.
     *            </p>
     *            <p>
     *            Default: 20
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The number of billing records to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxItems <p>
     *            The number of billing records to be returned.
     *            </p>
     *            <p>
     *            Default: 20
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewBillingRequest withMaxItems(Integer maxItems) {
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
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewBillingRequest == false)
            return false;
        ViewBillingRequest other = (ViewBillingRequest) obj;

        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
