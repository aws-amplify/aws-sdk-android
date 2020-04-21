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
 * Returns information about all of the operations that return an operation ID
 * and that have ever been performed on domains that were registered by the
 * current account.
 * </p>
 */
public class ListOperationsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An optional parameter that lets you get information about all the
     * operations that you submitted after a specified date and time. Specify
     * the date and time in Unix time format and Coordinated Universal time
     * (UTC).
     * </p>
     */
    private java.util.Date submittedSince;

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If
     * the number of operations that are not yet complete is greater than the
     * value that you specified for <code>MaxItems</code>, you can use
     * <code>Marker</code> to return additional operations. Get the value of
     * <code>NextPageMarker</code> from the previous response, and submit
     * another request that includes the value of <code>NextPageMarker</code> in
     * the <code>Marker</code> element.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String marker;

    /**
     * <p>
     * Number of domains to be returned.
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
     * An optional parameter that lets you get information about all the
     * operations that you submitted after a specified date and time. Specify
     * the date and time in Unix time format and Coordinated Universal time
     * (UTC).
     * </p>
     *
     * @return <p>
     *         An optional parameter that lets you get information about all the
     *         operations that you submitted after a specified date and time.
     *         Specify the date and time in Unix time format and Coordinated
     *         Universal time (UTC).
     *         </p>
     */
    public java.util.Date getSubmittedSince() {
        return submittedSince;
    }

    /**
     * <p>
     * An optional parameter that lets you get information about all the
     * operations that you submitted after a specified date and time. Specify
     * the date and time in Unix time format and Coordinated Universal time
     * (UTC).
     * </p>
     *
     * @param submittedSince <p>
     *            An optional parameter that lets you get information about all
     *            the operations that you submitted after a specified date and
     *            time. Specify the date and time in Unix time format and
     *            Coordinated Universal time (UTC).
     *            </p>
     */
    public void setSubmittedSince(java.util.Date submittedSince) {
        this.submittedSince = submittedSince;
    }

    /**
     * <p>
     * An optional parameter that lets you get information about all the
     * operations that you submitted after a specified date and time. Specify
     * the date and time in Unix time format and Coordinated Universal time
     * (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param submittedSince <p>
     *            An optional parameter that lets you get information about all
     *            the operations that you submitted after a specified date and
     *            time. Specify the date and time in Unix time format and
     *            Coordinated Universal time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOperationsRequest withSubmittedSince(java.util.Date submittedSince) {
        this.submittedSince = submittedSince;
        return this;
    }

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If
     * the number of operations that are not yet complete is greater than the
     * value that you specified for <code>MaxItems</code>, you can use
     * <code>Marker</code> to return additional operations. Get the value of
     * <code>NextPageMarker</code> from the previous response, and submit
     * another request that includes the value of <code>NextPageMarker</code> in
     * the <code>Marker</code> element.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         For an initial request for a list of operations, omit this
     *         element. If the number of operations that are not yet complete is
     *         greater than the value that you specified for
     *         <code>MaxItems</code>, you can use <code>Marker</code> to return
     *         additional operations. Get the value of
     *         <code>NextPageMarker</code> from the previous response, and
     *         submit another request that includes the value of
     *         <code>NextPageMarker</code> in the <code>Marker</code> element.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If
     * the number of operations that are not yet complete is greater than the
     * value that you specified for <code>MaxItems</code>, you can use
     * <code>Marker</code> to return additional operations. Get the value of
     * <code>NextPageMarker</code> from the previous response, and submit
     * another request that includes the value of <code>NextPageMarker</code> in
     * the <code>Marker</code> element.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param marker <p>
     *            For an initial request for a list of operations, omit this
     *            element. If the number of operations that are not yet complete
     *            is greater than the value that you specified for
     *            <code>MaxItems</code>, you can use <code>Marker</code> to
     *            return additional operations. Get the value of
     *            <code>NextPageMarker</code> from the previous response, and
     *            submit another request that includes the value of
     *            <code>NextPageMarker</code> in the <code>Marker</code>
     *            element.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For an initial request for a list of operations, omit this element. If
     * the number of operations that are not yet complete is greater than the
     * value that you specified for <code>MaxItems</code>, you can use
     * <code>Marker</code> to return additional operations. Get the value of
     * <code>NextPageMarker</code> from the previous response, and submit
     * another request that includes the value of <code>NextPageMarker</code> in
     * the <code>Marker</code> element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param marker <p>
     *            For an initial request for a list of operations, omit this
     *            element. If the number of operations that are not yet complete
     *            is greater than the value that you specified for
     *            <code>MaxItems</code>, you can use <code>Marker</code> to
     *            return additional operations. Get the value of
     *            <code>NextPageMarker</code> from the previous response, and
     *            submit another request that includes the value of
     *            <code>NextPageMarker</code> in the <code>Marker</code>
     *            element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOperationsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @return <p>
     *         Number of domains to be returned.
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
     * Number of domains to be returned.
     * </p>
     * <p>
     * Default: 20
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b> - 100<br/>
     *
     * @param maxItems <p>
     *            Number of domains to be returned.
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
     * Number of domains to be returned.
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
     *            Number of domains to be returned.
     *            </p>
     *            <p>
     *            Default: 20
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListOperationsRequest withMaxItems(Integer maxItems) {
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
        if (getSubmittedSince() != null)
            sb.append("SubmittedSince: " + getSubmittedSince() + ",");
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

        hashCode = prime * hashCode
                + ((getSubmittedSince() == null) ? 0 : getSubmittedSince().hashCode());
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

        if (obj instanceof ListOperationsRequest == false)
            return false;
        ListOperationsRequest other = (ListOperationsRequest) obj;

        if (other.getSubmittedSince() == null ^ this.getSubmittedSince() == null)
            return false;
        if (other.getSubmittedSince() != null
                && other.getSubmittedSince().equals(this.getSubmittedSince()) == false)
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
