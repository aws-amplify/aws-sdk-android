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

/**
 * <p>
 * A complex type that contains the response information for the request.
 * </p>
 */
public class ListTrafficPolicyVersionsResult implements Serializable {
    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     * </p>
     */
    private java.util.List<TrafficPolicy> trafficPolicies;

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another
     * <code>ListTrafficPolicyVersions</code> request and specifying the value
     * of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     * policy that Amazon Route 53 will return if you submit another request.
     * Call <code>ListTrafficPolicyVersions</code> again and specify the value
     * of <code>TrafficPolicyVersionMarker</code> in the
     * <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4<br/>
     */
    private String trafficPolicyVersionMarker;

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the <code>ListTrafficPolicyVersions</code> request that produced the
     * current response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     * </p>
     *
     * @return <p>
     *         A list that contains one <code>TrafficPolicy</code> element for
     *         each traffic policy version that is associated with the specified
     *         traffic policy.
     *         </p>
     */
    public java.util.List<TrafficPolicy> getTrafficPolicies() {
        return trafficPolicies;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     * </p>
     *
     * @param trafficPolicies <p>
     *            A list that contains one <code>TrafficPolicy</code> element
     *            for each traffic policy version that is associated with the
     *            specified traffic policy.
     *            </p>
     */
    public void setTrafficPolicies(java.util.Collection<TrafficPolicy> trafficPolicies) {
        if (trafficPolicies == null) {
            this.trafficPolicies = null;
            return;
        }

        this.trafficPolicies = new java.util.ArrayList<TrafficPolicy>(trafficPolicies);
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficPolicies <p>
     *            A list that contains one <code>TrafficPolicy</code> element
     *            for each traffic policy version that is associated with the
     *            specified traffic policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyVersionsResult withTrafficPolicies(TrafficPolicy... trafficPolicies) {
        if (getTrafficPolicies() == null) {
            this.trafficPolicies = new java.util.ArrayList<TrafficPolicy>(trafficPolicies.length);
        }
        for (TrafficPolicy value : trafficPolicies) {
            this.trafficPolicies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each
     * traffic policy version that is associated with the specified traffic
     * policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficPolicies <p>
     *            A list that contains one <code>TrafficPolicy</code> element
     *            for each traffic policy version that is associated with the
     *            specified traffic policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyVersionsResult withTrafficPolicies(
            java.util.Collection<TrafficPolicy> trafficPolicies) {
        setTrafficPolicies(trafficPolicies);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another
     * <code>ListTrafficPolicyVersions</code> request and specifying the value
     * of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more traffic policies to
     *         be listed. If the response was truncated, you can get the next
     *         group of traffic policies by submitting another
     *         <code>ListTrafficPolicyVersions</code> request and specifying the
     *         value of <code>NextMarker</code> in the <code>marker</code>
     *         parameter.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another
     * <code>ListTrafficPolicyVersions</code> request and specifying the value
     * of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more traffic policies to
     *         be listed. If the response was truncated, you can get the next
     *         group of traffic policies by submitting another
     *         <code>ListTrafficPolicyVersions</code> request and specifying the
     *         value of <code>NextMarker</code> in the <code>marker</code>
     *         parameter.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another
     * <code>ListTrafficPolicyVersions</code> request and specifying the value
     * of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more traffic policies
     *            to be listed. If the response was truncated, you can get the
     *            next group of traffic policies by submitting another
     *            <code>ListTrafficPolicyVersions</code> request and specifying
     *            the value of <code>NextMarker</code> in the
     *            <code>marker</code> parameter.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another
     * <code>ListTrafficPolicyVersions</code> request and specifying the value
     * of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more traffic policies
     *            to be listed. If the response was truncated, you can get the
     *            next group of traffic policies by submitting another
     *            <code>ListTrafficPolicyVersions</code> request and specifying
     *            the value of <code>NextMarker</code> in the
     *            <code>marker</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyVersionsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     * policy that Amazon Route 53 will return if you submit another request.
     * Call <code>ListTrafficPolicyVersions</code> again and specify the value
     * of <code>TrafficPolicyVersionMarker</code> in the
     * <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>, the value of
     *         <code>TrafficPolicyVersionMarker</code> identifies the first
     *         traffic policy that Amazon Route 53 will return if you submit
     *         another request. Call <code>ListTrafficPolicyVersions</code>
     *         again and specify the value of
     *         <code>TrafficPolicyVersionMarker</code> in the
     *         <code>TrafficPolicyVersionMarker</code> request parameter.
     *         </p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is
     *         <code>true</code>.
     *         </p>
     */
    public String getTrafficPolicyVersionMarker() {
        return trafficPolicyVersionMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     * policy that Amazon Route 53 will return if you submit another request.
     * Call <code>ListTrafficPolicyVersions</code> again and specify the value
     * of <code>TrafficPolicyVersionMarker</code> in the
     * <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is
     * <code>true</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4<br/>
     *
     * @param trafficPolicyVersionMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>, the value of
     *            <code>TrafficPolicyVersionMarker</code> identifies the first
     *            traffic policy that Amazon Route 53 will return if you submit
     *            another request. Call <code>ListTrafficPolicyVersions</code>
     *            again and specify the value of
     *            <code>TrafficPolicyVersionMarker</code> in the
     *            <code>TrafficPolicyVersionMarker</code> request parameter.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            <code>true</code>.
     *            </p>
     */
    public void setTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        this.trafficPolicyVersionMarker = trafficPolicyVersionMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>TrafficPolicyVersionMarker</code> identifies the first traffic
     * policy that Amazon Route 53 will return if you submit another request.
     * Call <code>ListTrafficPolicyVersions</code> again and specify the value
     * of <code>TrafficPolicyVersionMarker</code> in the
     * <code>TrafficPolicyVersionMarker</code> request parameter.
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
     * <b>Length: </b> - 4<br/>
     *
     * @param trafficPolicyVersionMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>, the value of
     *            <code>TrafficPolicyVersionMarker</code> identifies the first
     *            traffic policy that Amazon Route 53 will return if you submit
     *            another request. Call <code>ListTrafficPolicyVersions</code>
     *            again and specify the value of
     *            <code>TrafficPolicyVersionMarker</code> in the
     *            <code>TrafficPolicyVersionMarker</code> request parameter.
     *            </p>
     *            <p>
     *            This element is present only if <code>IsTruncated</code> is
     *            <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyVersionsResult withTrafficPolicyVersionMarker(
            String trafficPolicyVersionMarker) {
        this.trafficPolicyVersionMarker = trafficPolicyVersionMarker;
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the <code>ListTrafficPolicyVersions</code> request that produced the
     * current response.
     * </p>
     *
     * @return <p>
     *         The value that you specified for the <code>maxitems</code>
     *         parameter in the <code>ListTrafficPolicyVersions</code> request
     *         that produced the current response.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the <code>ListTrafficPolicyVersions</code> request that produced the
     * current response.
     * </p>
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>maxitems</code>
     *            parameter in the <code>ListTrafficPolicyVersions</code>
     *            request that produced the current response.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the <code>ListTrafficPolicyVersions</code> request that produced the
     * current response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>maxitems</code>
     *            parameter in the <code>ListTrafficPolicyVersions</code>
     *            request that produced the current response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyVersionsResult withMaxItems(String maxItems) {
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
        if (getTrafficPolicies() != null)
            sb.append("TrafficPolicies: " + getTrafficPolicies() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getTrafficPolicyVersionMarker() != null)
            sb.append("TrafficPolicyVersionMarker: " + getTrafficPolicyVersionMarker() + ",");
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
                + ((getTrafficPolicies() == null) ? 0 : getTrafficPolicies().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyVersionMarker() == null) ? 0 : getTrafficPolicyVersionMarker()
                        .hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficPolicyVersionsResult == false)
            return false;
        ListTrafficPolicyVersionsResult other = (ListTrafficPolicyVersionsResult) obj;

        if (other.getTrafficPolicies() == null ^ this.getTrafficPolicies() == null)
            return false;
        if (other.getTrafficPolicies() != null
                && other.getTrafficPolicies().equals(this.getTrafficPolicies()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getTrafficPolicyVersionMarker() == null
                ^ this.getTrafficPolicyVersionMarker() == null)
            return false;
        if (other.getTrafficPolicyVersionMarker() != null
                && other.getTrafficPolicyVersionMarker().equals(
                        this.getTrafficPolicyVersionMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
