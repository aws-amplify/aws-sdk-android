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

/**
 * <p>
 * The ViewBilling response includes the following elements.
 * </p>
 */
public class ViewBillingResult implements Serializable {
    /**
     * <p>
     * If there are more billing records than you specified for
     * <code>MaxItems</code> in the request, submit another request and include
     * the value of <code>NextPageMarker</code> in the value of
     * <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private String nextPageMarker;

    /**
     * <p>
     * A summary of billing records.
     * </p>
     */
    private java.util.List<BillingRecord> billingRecords;

    /**
     * <p>
     * If there are more billing records than you specified for
     * <code>MaxItems</code> in the request, submit another request and include
     * the value of <code>NextPageMarker</code> in the value of
     * <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         If there are more billing records than you specified for
     *         <code>MaxItems</code> in the request, submit another request and
     *         include the value of <code>NextPageMarker</code> in the value of
     *         <code>Marker</code>.
     *         </p>
     */
    public String getNextPageMarker() {
        return nextPageMarker;
    }

    /**
     * <p>
     * If there are more billing records than you specified for
     * <code>MaxItems</code> in the request, submit another request and include
     * the value of <code>NextPageMarker</code> in the value of
     * <code>Marker</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextPageMarker <p>
     *            If there are more billing records than you specified for
     *            <code>MaxItems</code> in the request, submit another request
     *            and include the value of <code>NextPageMarker</code> in the
     *            value of <code>Marker</code>.
     *            </p>
     */
    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }

    /**
     * <p>
     * If there are more billing records than you specified for
     * <code>MaxItems</code> in the request, submit another request and include
     * the value of <code>NextPageMarker</code> in the value of
     * <code>Marker</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param nextPageMarker <p>
     *            If there are more billing records than you specified for
     *            <code>MaxItems</code> in the request, submit another request
     *            and include the value of <code>NextPageMarker</code> in the
     *            value of <code>Marker</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewBillingResult withNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
        return this;
    }

    /**
     * <p>
     * A summary of billing records.
     * </p>
     *
     * @return <p>
     *         A summary of billing records.
     *         </p>
     */
    public java.util.List<BillingRecord> getBillingRecords() {
        return billingRecords;
    }

    /**
     * <p>
     * A summary of billing records.
     * </p>
     *
     * @param billingRecords <p>
     *            A summary of billing records.
     *            </p>
     */
    public void setBillingRecords(java.util.Collection<BillingRecord> billingRecords) {
        if (billingRecords == null) {
            this.billingRecords = null;
            return;
        }

        this.billingRecords = new java.util.ArrayList<BillingRecord>(billingRecords);
    }

    /**
     * <p>
     * A summary of billing records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param billingRecords <p>
     *            A summary of billing records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewBillingResult withBillingRecords(BillingRecord... billingRecords) {
        if (getBillingRecords() == null) {
            this.billingRecords = new java.util.ArrayList<BillingRecord>(billingRecords.length);
        }
        for (BillingRecord value : billingRecords) {
            this.billingRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A summary of billing records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param billingRecords <p>
     *            A summary of billing records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ViewBillingResult withBillingRecords(java.util.Collection<BillingRecord> billingRecords) {
        setBillingRecords(billingRecords);
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
        if (getNextPageMarker() != null)
            sb.append("NextPageMarker: " + getNextPageMarker() + ",");
        if (getBillingRecords() != null)
            sb.append("BillingRecords: " + getBillingRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextPageMarker() == null) ? 0 : getNextPageMarker().hashCode());
        hashCode = prime * hashCode
                + ((getBillingRecords() == null) ? 0 : getBillingRecords().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewBillingResult == false)
            return false;
        ViewBillingResult other = (ViewBillingResult) obj;

        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null)
            return false;
        if (other.getNextPageMarker() != null
                && other.getNextPageMarker().equals(this.getNextPageMarker()) == false)
            return false;
        if (other.getBillingRecords() == null ^ this.getBillingRecords() == null)
            return false;
        if (other.getBillingRecords() != null
                && other.getBillingRecords().equals(this.getBillingRecords()) == false)
            return false;
        return true;
    }
}
