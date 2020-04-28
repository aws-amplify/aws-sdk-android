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
public class ListTrafficPoliciesResult implements Serializable {
    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     * </p>
     */
    private java.util.List<TrafficPolicySummary> trafficPolicySummaries;

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another <code>ListTrafficPolicies</code>
     * request and specifying the value of <code>TrafficPolicyIdMarker</code> in
     * the <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * If the value of <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy
     * in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String trafficPolicyIdMarker;

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the <code>ListTrafficPolicies</code> request that produced the current
     * response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     * </p>
     *
     * @return <p>
     *         A list that contains one <code>TrafficPolicySummary</code>
     *         element for each traffic policy that was created by the current
     *         AWS account.
     *         </p>
     */
    public java.util.List<TrafficPolicySummary> getTrafficPolicySummaries() {
        return trafficPolicySummaries;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     * </p>
     *
     * @param trafficPolicySummaries <p>
     *            A list that contains one <code>TrafficPolicySummary</code>
     *            element for each traffic policy that was created by the
     *            current AWS account.
     *            </p>
     */
    public void setTrafficPolicySummaries(
            java.util.Collection<TrafficPolicySummary> trafficPolicySummaries) {
        if (trafficPolicySummaries == null) {
            this.trafficPolicySummaries = null;
            return;
        }

        this.trafficPolicySummaries = new java.util.ArrayList<TrafficPolicySummary>(
                trafficPolicySummaries);
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficPolicySummaries <p>
     *            A list that contains one <code>TrafficPolicySummary</code>
     *            element for each traffic policy that was created by the
     *            current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPoliciesResult withTrafficPolicySummaries(
            TrafficPolicySummary... trafficPolicySummaries) {
        if (getTrafficPolicySummaries() == null) {
            this.trafficPolicySummaries = new java.util.ArrayList<TrafficPolicySummary>(
                    trafficPolicySummaries.length);
        }
        for (TrafficPolicySummary value : trafficPolicySummaries) {
            this.trafficPolicySummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for
     * each traffic policy that was created by the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficPolicySummaries <p>
     *            A list that contains one <code>TrafficPolicySummary</code>
     *            element for each traffic policy that was created by the
     *            current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPoliciesResult withTrafficPolicySummaries(
            java.util.Collection<TrafficPolicySummary> trafficPolicySummaries) {
        setTrafficPolicySummaries(trafficPolicySummaries);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another <code>ListTrafficPolicies</code>
     * request and specifying the value of <code>TrafficPolicyIdMarker</code> in
     * the <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more traffic policies to
     *         be listed. If the response was truncated, you can get the next
     *         group of traffic policies by submitting another
     *         <code>ListTrafficPolicies</code> request and specifying the value
     *         of <code>TrafficPolicyIdMarker</code> in the
     *         <code>TrafficPolicyIdMarker</code> request parameter.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another <code>ListTrafficPolicies</code>
     * request and specifying the value of <code>TrafficPolicyIdMarker</code> in
     * the <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more traffic policies to
     *         be listed. If the response was truncated, you can get the next
     *         group of traffic policies by submitting another
     *         <code>ListTrafficPolicies</code> request and specifying the value
     *         of <code>TrafficPolicyIdMarker</code> in the
     *         <code>TrafficPolicyIdMarker</code> request parameter.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another <code>ListTrafficPolicies</code>
     * request and specifying the value of <code>TrafficPolicyIdMarker</code> in
     * the <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more traffic policies
     *            to be listed. If the response was truncated, you can get the
     *            next group of traffic policies by submitting another
     *            <code>ListTrafficPolicies</code> request and specifying the
     *            value of <code>TrafficPolicyIdMarker</code> in the
     *            <code>TrafficPolicyIdMarker</code> request parameter.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be
     * listed. If the response was truncated, you can get the next group of
     * traffic policies by submitting another <code>ListTrafficPolicies</code>
     * request and specifying the value of <code>TrafficPolicyIdMarker</code> in
     * the <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more traffic policies
     *            to be listed. If the response was truncated, you can get the
     *            next group of traffic policies by submitting another
     *            <code>ListTrafficPolicies</code> request and specifying the
     *            value of <code>TrafficPolicyIdMarker</code> in the
     *            <code>TrafficPolicyIdMarker</code> request parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPoliciesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy
     * in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         If the value of <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     *         policy in the next group of <code>MaxItems</code> traffic
     *         policies.
     *         </p>
     */
    public String getTrafficPolicyIdMarker() {
        return trafficPolicyIdMarker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy
     * in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyIdMarker <p>
     *            If the value of <code>IsTruncated</code> is <code>true</code>,
     *            <code>TrafficPolicyIdMarker</code> is the ID of the first
     *            traffic policy in the next group of <code>MaxItems</code>
     *            traffic policies.
     *            </p>
     */
    public void setTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy
     * in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyIdMarker <p>
     *            If the value of <code>IsTruncated</code> is <code>true</code>,
     *            <code>TrafficPolicyIdMarker</code> is the ID of the first
     *            traffic policy in the next group of <code>MaxItems</code>
     *            traffic policies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPoliciesResult withTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the <code>ListTrafficPolicies</code> request that produced the current
     * response.
     * </p>
     *
     * @return <p>
     *         The value that you specified for the <code>MaxItems</code>
     *         parameter in the <code>ListTrafficPolicies</code> request that
     *         produced the current response.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the <code>ListTrafficPolicies</code> request that produced the current
     * response.
     * </p>
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>MaxItems</code>
     *            parameter in the <code>ListTrafficPolicies</code> request that
     *            produced the current response.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the <code>ListTrafficPolicies</code> request that produced the current
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>MaxItems</code>
     *            parameter in the <code>ListTrafficPolicies</code> request that
     *            produced the current response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPoliciesResult withMaxItems(String maxItems) {
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
        if (getTrafficPolicySummaries() != null)
            sb.append("TrafficPolicySummaries: " + getTrafficPolicySummaries() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getTrafficPolicyIdMarker() != null)
            sb.append("TrafficPolicyIdMarker: " + getTrafficPolicyIdMarker() + ",");
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
                + ((getTrafficPolicySummaries() == null) ? 0 : getTrafficPolicySummaries()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyIdMarker() == null) ? 0 : getTrafficPolicyIdMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficPoliciesResult == false)
            return false;
        ListTrafficPoliciesResult other = (ListTrafficPoliciesResult) obj;

        if (other.getTrafficPolicySummaries() == null ^ this.getTrafficPolicySummaries() == null)
            return false;
        if (other.getTrafficPolicySummaries() != null
                && other.getTrafficPolicySummaries().equals(this.getTrafficPolicySummaries()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getTrafficPolicyIdMarker() == null ^ this.getTrafficPolicyIdMarker() == null)
            return false;
        if (other.getTrafficPolicyIdMarker() != null
                && other.getTrafficPolicyIdMarker().equals(this.getTrafficPolicyIdMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
