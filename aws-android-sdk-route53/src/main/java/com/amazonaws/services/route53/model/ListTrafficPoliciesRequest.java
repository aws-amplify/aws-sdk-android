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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about the latest version for every traffic policy that is
 * associated with the current AWS account. Policies are listed in the order
 * that they were created in.
 * </p>
 */
public class ListTrafficPoliciesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Conditional) For your first request to <code>ListTrafficPolicies</code>,
     * don't include the <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * policies, submit another request to <code>ListTrafficPolicies</code>. For
     * the value of <code>TrafficPolicyIdMarker</code>, specify the value of
     * <code>TrafficPolicyIdMarker</code> that was returned in the previous
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String trafficPolicyIdMarker;

    /**
     * <p>
     * (Optional) The maximum number of traffic policies that you want Amazon
     * Route 53 to return in response to this request. If you have more than
     * <code>MaxItems</code> traffic policies, the value of
     * <code>IsTruncated</code> in the response is <code>true</code>, and the
     * value of <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy that Route 53 will return if you submit another request.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * (Conditional) For your first request to <code>ListTrafficPolicies</code>,
     * don't include the <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * policies, submit another request to <code>ListTrafficPolicies</code>. For
     * the value of <code>TrafficPolicyIdMarker</code>, specify the value of
     * <code>TrafficPolicyIdMarker</code> that was returned in the previous
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         (Conditional) For your first request to
     *         <code>ListTrafficPolicies</code>, don't include the
     *         <code>TrafficPolicyIdMarker</code> parameter.
     *         </p>
     *         <p>
     *         If you have more traffic policies than the value of
     *         <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns
     *         only the first <code>MaxItems</code> traffic policies. To get the
     *         next group of policies, submit another request to
     *         <code>ListTrafficPolicies</code>. For the value of
     *         <code>TrafficPolicyIdMarker</code>, specify the value of
     *         <code>TrafficPolicyIdMarker</code> that was returned in the
     *         previous response.
     *         </p>
     */
    public String getTrafficPolicyIdMarker() {
        return trafficPolicyIdMarker;
    }

    /**
     * <p>
     * (Conditional) For your first request to <code>ListTrafficPolicies</code>,
     * don't include the <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * policies, submit another request to <code>ListTrafficPolicies</code>. For
     * the value of <code>TrafficPolicyIdMarker</code>, specify the value of
     * <code>TrafficPolicyIdMarker</code> that was returned in the previous
     * response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyIdMarker <p>
     *            (Conditional) For your first request to
     *            <code>ListTrafficPolicies</code>, don't include the
     *            <code>TrafficPolicyIdMarker</code> parameter.
     *            </p>
     *            <p>
     *            If you have more traffic policies than the value of
     *            <code>MaxItems</code>, <code>ListTrafficPolicies</code>
     *            returns only the first <code>MaxItems</code> traffic policies.
     *            To get the next group of policies, submit another request to
     *            <code>ListTrafficPolicies</code>. For the value of
     *            <code>TrafficPolicyIdMarker</code>, specify the value of
     *            <code>TrafficPolicyIdMarker</code> that was returned in the
     *            previous response.
     *            </p>
     */
    public void setTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
    }

    /**
     * <p>
     * (Conditional) For your first request to <code>ListTrafficPolicies</code>,
     * don't include the <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * policies, submit another request to <code>ListTrafficPolicies</code>. For
     * the value of <code>TrafficPolicyIdMarker</code>, specify the value of
     * <code>TrafficPolicyIdMarker</code> that was returned in the previous
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param trafficPolicyIdMarker <p>
     *            (Conditional) For your first request to
     *            <code>ListTrafficPolicies</code>, don't include the
     *            <code>TrafficPolicyIdMarker</code> parameter.
     *            </p>
     *            <p>
     *            If you have more traffic policies than the value of
     *            <code>MaxItems</code>, <code>ListTrafficPolicies</code>
     *            returns only the first <code>MaxItems</code> traffic policies.
     *            To get the next group of policies, submit another request to
     *            <code>ListTrafficPolicies</code>. For the value of
     *            <code>TrafficPolicyIdMarker</code>, specify the value of
     *            <code>TrafficPolicyIdMarker</code> that was returned in the
     *            previous response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPoliciesRequest withTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of traffic policies that you want Amazon
     * Route 53 to return in response to this request. If you have more than
     * <code>MaxItems</code> traffic policies, the value of
     * <code>IsTruncated</code> in the response is <code>true</code>, and the
     * value of <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy that Route 53 will return if you submit another request.
     * </p>
     *
     * @return <p>
     *         (Optional) The maximum number of traffic policies that you want
     *         Amazon Route 53 to return in response to this request. If you
     *         have more than <code>MaxItems</code> traffic policies, the value
     *         of <code>IsTruncated</code> in the response is <code>true</code>,
     *         and the value of <code>TrafficPolicyIdMarker</code> is the ID of
     *         the first traffic policy that Route 53 will return if you submit
     *         another request.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of traffic policies that you want Amazon
     * Route 53 to return in response to this request. If you have more than
     * <code>MaxItems</code> traffic policies, the value of
     * <code>IsTruncated</code> in the response is <code>true</code>, and the
     * value of <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy that Route 53 will return if you submit another request.
     * </p>
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of traffic policies that you
     *            want Amazon Route 53 to return in response to this request. If
     *            you have more than <code>MaxItems</code> traffic policies, the
     *            value of <code>IsTruncated</code> in the response is
     *            <code>true</code>, and the value of
     *            <code>TrafficPolicyIdMarker</code> is the ID of the first
     *            traffic policy that Route 53 will return if you submit another
     *            request.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of traffic policies that you want Amazon
     * Route 53 to return in response to this request. If you have more than
     * <code>MaxItems</code> traffic policies, the value of
     * <code>IsTruncated</code> in the response is <code>true</code>, and the
     * value of <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy that Route 53 will return if you submit another request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            (Optional) The maximum number of traffic policies that you
     *            want Amazon Route 53 to return in response to this request. If
     *            you have more than <code>MaxItems</code> traffic policies, the
     *            value of <code>IsTruncated</code> in the response is
     *            <code>true</code>, and the value of
     *            <code>TrafficPolicyIdMarker</code> is the ID of the first
     *            traffic policy that Route 53 will return if you submit another
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPoliciesRequest withMaxItems(String maxItems) {
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

        if (obj instanceof ListTrafficPoliciesRequest == false)
            return false;
        ListTrafficPoliciesRequest other = (ListTrafficPoliciesRequest) obj;

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
