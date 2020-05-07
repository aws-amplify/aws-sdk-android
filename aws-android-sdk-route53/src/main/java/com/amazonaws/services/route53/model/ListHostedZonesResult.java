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

public class ListHostedZonesResult implements Serializable {
    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     */
    private java.util.List<HostedZone> hostedZones;

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZones</code>,
     * <code>Marker</code> is the value that you specified for the
     * <code>marker</code> parameter in the request that produced the current
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String marker;

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * the response was truncated, you can get more hosted zones by submitting
     * another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first hosted zone in the next
     * group of hosted zones. Submit another <code>ListHostedZones</code>
     * request, and specify the value of <code>NextMarker</code> from the
     * response in the <code>marker</code> parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHostedZones</code> that produced the current
     * response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains general information about the hosted
     *         zone.
     *         </p>
     */
    public java.util.List<HostedZone> getHostedZones() {
        return hostedZones;
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     *
     * @param hostedZones <p>
     *            A complex type that contains general information about the
     *            hosted zone.
     *            </p>
     */
    public void setHostedZones(java.util.Collection<HostedZone> hostedZones) {
        if (hostedZones == null) {
            this.hostedZones = null;
            return;
        }

        this.hostedZones = new java.util.ArrayList<HostedZone>(hostedZones);
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZones <p>
     *            A complex type that contains general information about the
     *            hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesResult withHostedZones(HostedZone... hostedZones) {
        if (getHostedZones() == null) {
            this.hostedZones = new java.util.ArrayList<HostedZone>(hostedZones.length);
        }
        for (HostedZone value : hostedZones) {
            this.hostedZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZones <p>
     *            A complex type that contains general information about the
     *            hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesResult withHostedZones(java.util.Collection<HostedZone> hostedZones) {
        setHostedZones(hostedZones);
        return this;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZones</code>,
     * <code>Marker</code> is the value that you specified for the
     * <code>marker</code> parameter in the request that produced the current
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         For the second and subsequent calls to
     *         <code>ListHostedZones</code>, <code>Marker</code> is the value
     *         that you specified for the <code>marker</code> parameter in the
     *         request that produced the current response.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZones</code>,
     * <code>Marker</code> is the value that you specified for the
     * <code>marker</code> parameter in the request that produced the current
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param marker <p>
     *            For the second and subsequent calls to
     *            <code>ListHostedZones</code>, <code>Marker</code> is the value
     *            that you specified for the <code>marker</code> parameter in
     *            the request that produced the current response.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZones</code>,
     * <code>Marker</code> is the value that you specified for the
     * <code>marker</code> parameter in the request that produced the current
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param marker <p>
     *            For the second and subsequent calls to
     *            <code>ListHostedZones</code>, <code>Marker</code> is the value
     *            that you specified for the <code>marker</code> parameter in
     *            the request that produced the current response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * the response was truncated, you can get more hosted zones by submitting
     * another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     *
     * @return <p>
     *         A flag indicating whether there are more hosted zones to be
     *         listed. If the response was truncated, you can get more hosted
     *         zones by submitting another <code>ListHostedZones</code> request
     *         and specifying the value of <code>NextMarker</code> in the
     *         <code>marker</code> parameter.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * the response was truncated, you can get more hosted zones by submitting
     * another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     *
     * @return <p>
     *         A flag indicating whether there are more hosted zones to be
     *         listed. If the response was truncated, you can get more hosted
     *         zones by submitting another <code>ListHostedZones</code> request
     *         and specifying the value of <code>NextMarker</code> in the
     *         <code>marker</code> parameter.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * the response was truncated, you can get more hosted zones by submitting
     * another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag indicating whether there are more hosted zones to be
     *            listed. If the response was truncated, you can get more hosted
     *            zones by submitting another <code>ListHostedZones</code>
     *            request and specifying the value of <code>NextMarker</code> in
     *            the <code>marker</code> parameter.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * the response was truncated, you can get more hosted zones by submitting
     * another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag indicating whether there are more hosted zones to be
     *            listed. If the response was truncated, you can get more hosted
     *            zones by submitting another <code>ListHostedZones</code>
     *            request and specifying the value of <code>NextMarker</code> in
     *            the <code>marker</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first hosted zone in the next
     * group of hosted zones. Submit another <code>ListHostedZones</code>
     * request, and specify the value of <code>NextMarker</code> from the
     * response in the <code>marker</code> parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>, the value of
     *         <code>NextMarker</code> identifies the first hosted zone in the
     *         next group of hosted zones. Submit another
     *         <code>ListHostedZones</code> request, and specify the value of
     *         <code>NextMarker</code> from the response in the
     *         <code>marker</code> parameter.
     *         </p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is
     *         <code>true</code>.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first hosted zone in the next
     * group of hosted zones. Submit another <code>ListHostedZones</code>
     * request, and specify the value of <code>NextMarker</code> from the
     * response in the <code>marker</code> parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param nextMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>, the value of
     *            <code>NextMarker</code> identifies the first hosted zone in
     *            the next group of hosted zones. Submit another
     *            <code>ListHostedZones</code> request, and specify the value of
     *            <code>NextMarker</code> from the response in the
     *            <code>marker</code> parameter.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            <code>true</code>.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first hosted zone in the next
     * group of hosted zones. Submit another <code>ListHostedZones</code>
     * request, and specify the value of <code>NextMarker</code> from the
     * response in the <code>marker</code> parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param nextMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>, the value of
     *            <code>NextMarker</code> identifies the first hosted zone in
     *            the next group of hosted zones. Submit another
     *            <code>ListHostedZones</code> request, and specify the value of
     *            <code>NextMarker</code> from the response in the
     *            <code>marker</code> parameter.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHostedZones</code> that produced the current
     * response.
     * </p>
     *
     * @return <p>
     *         The value that you specified for the <code>maxitems</code>
     *         parameter in the call to <code>ListHostedZones</code> that
     *         produced the current response.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHostedZones</code> that produced the current
     * response.
     * </p>
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>maxitems</code>
     *            parameter in the call to <code>ListHostedZones</code> that
     *            produced the current response.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHostedZones</code> that produced the current
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>maxitems</code>
     *            parameter in the call to <code>ListHostedZones</code> that
     *            produced the current response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesResult withMaxItems(String maxItems) {
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
        if (getHostedZones() != null)
            sb.append("HostedZones: " + getHostedZones() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
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
                + ((getHostedZones() == null) ? 0 : getHostedZones().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHostedZonesResult == false)
            return false;
        ListHostedZonesResult other = (ListHostedZonesResult) obj;

        if (other.getHostedZones() == null ^ this.getHostedZones() == null)
            return false;
        if (other.getHostedZones() != null
                && other.getHostedZones().equals(this.getHostedZones()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
