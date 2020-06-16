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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List the distributions that are associated with a specified AWS WAF web ACL.
 * </p>
 */
public class ListDistributionsByWebACLId2019_03_26Request extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Use <code>Marker</code> and <code>MaxItems</code> to control pagination
     * of results. If you have more than <code>MaxItems</code> distributions
     * that satisfy the request, the response includes a <code>NextMarker</code>
     * element. To get the next page of results, submit another request. For the
     * value of <code>Marker</code>, specify the value of
     * <code>NextMarker</code> from the last response. (For the first request,
     * omit <code>Marker</code>.)
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The maximum number of distributions that you want CloudFront to return in
     * the response body. The maximum and default values are both 100.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The ID of the AWS WAF web ACL that you want to list the associated
     * distributions. If you specify "null" for the ID, the request returns a
     * list of the distributions that aren't associated with a web ACL.
     * </p>
     */
    private String webACLId;

    /**
     * <p>
     * Use <code>Marker</code> and <code>MaxItems</code> to control pagination
     * of results. If you have more than <code>MaxItems</code> distributions
     * that satisfy the request, the response includes a <code>NextMarker</code>
     * element. To get the next page of results, submit another request. For the
     * value of <code>Marker</code>, specify the value of
     * <code>NextMarker</code> from the last response. (For the first request,
     * omit <code>Marker</code>.)
     * </p>
     *
     * @return <p>
     *         Use <code>Marker</code> and <code>MaxItems</code> to control
     *         pagination of results. If you have more than
     *         <code>MaxItems</code> distributions that satisfy the request, the
     *         response includes a <code>NextMarker</code> element. To get the
     *         next page of results, submit another request. For the value of
     *         <code>Marker</code>, specify the value of <code>NextMarker</code>
     *         from the last response. (For the first request, omit
     *         <code>Marker</code>.)
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use <code>Marker</code> and <code>MaxItems</code> to control pagination
     * of results. If you have more than <code>MaxItems</code> distributions
     * that satisfy the request, the response includes a <code>NextMarker</code>
     * element. To get the next page of results, submit another request. For the
     * value of <code>Marker</code>, specify the value of
     * <code>NextMarker</code> from the last response. (For the first request,
     * omit <code>Marker</code>.)
     * </p>
     *
     * @param marker <p>
     *            Use <code>Marker</code> and <code>MaxItems</code> to control
     *            pagination of results. If you have more than
     *            <code>MaxItems</code> distributions that satisfy the request,
     *            the response includes a <code>NextMarker</code> element. To
     *            get the next page of results, submit another request. For the
     *            value of <code>Marker</code>, specify the value of
     *            <code>NextMarker</code> from the last response. (For the first
     *            request, omit <code>Marker</code>.)
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use <code>Marker</code> and <code>MaxItems</code> to control pagination
     * of results. If you have more than <code>MaxItems</code> distributions
     * that satisfy the request, the response includes a <code>NextMarker</code>
     * element. To get the next page of results, submit another request. For the
     * value of <code>Marker</code>, specify the value of
     * <code>NextMarker</code> from the last response. (For the first request,
     * omit <code>Marker</code>.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Use <code>Marker</code> and <code>MaxItems</code> to control
     *            pagination of results. If you have more than
     *            <code>MaxItems</code> distributions that satisfy the request,
     *            the response includes a <code>NextMarker</code> element. To
     *            get the next page of results, submit another request. For the
     *            value of <code>Marker</code>, specify the value of
     *            <code>NextMarker</code> from the last response. (For the first
     *            request, omit <code>Marker</code>.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDistributionsByWebACLId2019_03_26Request withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * The maximum number of distributions that you want CloudFront to return in
     * the response body. The maximum and default values are both 100.
     * </p>
     *
     * @return <p>
     *         The maximum number of distributions that you want CloudFront to
     *         return in the response body. The maximum and default values are
     *         both 100.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The maximum number of distributions that you want CloudFront to return in
     * the response body. The maximum and default values are both 100.
     * </p>
     *
     * @param maxItems <p>
     *            The maximum number of distributions that you want CloudFront
     *            to return in the response body. The maximum and default values
     *            are both 100.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of distributions that you want CloudFront to return in
     * the response body. The maximum and default values are both 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The maximum number of distributions that you want CloudFront
     *            to return in the response body. The maximum and default values
     *            are both 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDistributionsByWebACLId2019_03_26Request withMaxItems(String maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS WAF web ACL that you want to list the associated
     * distributions. If you specify "null" for the ID, the request returns a
     * list of the distributions that aren't associated with a web ACL.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS WAF web ACL that you want to list the
     *         associated distributions. If you specify "null" for the ID, the
     *         request returns a list of the distributions that aren't
     *         associated with a web ACL.
     *         </p>
     */
    public String getWebACLId() {
        return webACLId;
    }

    /**
     * <p>
     * The ID of the AWS WAF web ACL that you want to list the associated
     * distributions. If you specify "null" for the ID, the request returns a
     * list of the distributions that aren't associated with a web ACL.
     * </p>
     *
     * @param webACLId <p>
     *            The ID of the AWS WAF web ACL that you want to list the
     *            associated distributions. If you specify "null" for the ID,
     *            the request returns a list of the distributions that aren't
     *            associated with a web ACL.
     *            </p>
     */
    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The ID of the AWS WAF web ACL that you want to list the associated
     * distributions. If you specify "null" for the ID, the request returns a
     * list of the distributions that aren't associated with a web ACL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param webACLId <p>
     *            The ID of the AWS WAF web ACL that you want to list the
     *            associated distributions. If you specify "null" for the ID,
     *            the request returns a list of the distributions that aren't
     *            associated with a web ACL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDistributionsByWebACLId2019_03_26Request withWebACLId(String webACLId) {
        this.webACLId = webACLId;
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDistributionsByWebACLId2019_03_26Request == false)
            return false;
        ListDistributionsByWebACLId2019_03_26Request other = (ListDistributionsByWebACLId2019_03_26Request) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        return true;
    }
}
