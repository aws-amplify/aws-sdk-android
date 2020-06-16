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

/**
 * <p>
 * Lists the origin access identities for CloudFront.Send a <code>GET</code>
 * request to the
 * <code>/<i>CloudFront API version</i>/origin-access-identity/cloudfront</code>
 * resource. The response includes a
 * <code>CloudFrontOriginAccessIdentityList</code> element with zero or more
 * <code>CloudFrontOriginAccessIdentitySummary</code> child elements. By
 * default, your entire list of origin access identities is returned in one
 * single page. If the list is long, you can paginate it using the
 * <code>MaxItems</code> and <code>Marker</code> parameters.
 * </p>
 */
public class CloudFrontOriginAccessIdentityList implements Serializable {
    /**
     * <p>
     * Use this when paginating results to indicate where to begin in your list
     * of origin access identities. The results include identities in the list
     * that occur after the marker. To get the next page of results, set the
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the
     * current page's response (which is also the ID of the last identity on
     * that page).
     * </p>
     */
    private String marker;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, this element is present
     * and contains the value you can use for the <code>Marker</code> request
     * parameter to continue listing your origin access identities where they
     * left off.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * The maximum number of origin access identities you want in the response
     * body.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * A flag that indicates whether more origin access identities remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the <code>Marker</code> request parameter to
     * retrieve more items in the list.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * The number of CloudFront origin access identities that were created by
     * the current AWS account.
     * </p>
     */
    private Integer quantity;

    /**
     * <p>
     * A complex type that contains one
     * <code>CloudFrontOriginAccessIdentitySummary</code> element for each
     * origin access identity that was created by the current AWS account.
     * </p>
     */
    private java.util.List<CloudFrontOriginAccessIdentitySummary> items;

    /**
     * <p>
     * Use this when paginating results to indicate where to begin in your list
     * of origin access identities. The results include identities in the list
     * that occur after the marker. To get the next page of results, set the
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the
     * current page's response (which is also the ID of the last identity on
     * that page).
     * </p>
     *
     * @return <p>
     *         Use this when paginating results to indicate where to begin in
     *         your list of origin access identities. The results include
     *         identities in the list that occur after the marker. To get the
     *         next page of results, set the <code>Marker</code> to the value of
     *         the <code>NextMarker</code> from the current page's response
     *         (which is also the ID of the last identity on that page).
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Use this when paginating results to indicate where to begin in your list
     * of origin access identities. The results include identities in the list
     * that occur after the marker. To get the next page of results, set the
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the
     * current page's response (which is also the ID of the last identity on
     * that page).
     * </p>
     *
     * @param marker <p>
     *            Use this when paginating results to indicate where to begin in
     *            your list of origin access identities. The results include
     *            identities in the list that occur after the marker. To get the
     *            next page of results, set the <code>Marker</code> to the value
     *            of the <code>NextMarker</code> from the current page's
     *            response (which is also the ID of the last identity on that
     *            page).
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this when paginating results to indicate where to begin in your list
     * of origin access identities. The results include identities in the list
     * that occur after the marker. To get the next page of results, set the
     * <code>Marker</code> to the value of the <code>NextMarker</code> from the
     * current page's response (which is also the ID of the last identity on
     * that page).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Use this when paginating results to indicate where to begin in
     *            your list of origin access identities. The results include
     *            identities in the list that occur after the marker. To get the
     *            next page of results, set the <code>Marker</code> to the value
     *            of the <code>NextMarker</code> from the current page's
     *            response (which is also the ID of the last identity on that
     *            page).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, this element is present
     * and contains the value you can use for the <code>Marker</code> request
     * parameter to continue listing your origin access identities where they
     * left off.
     * </p>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value you can use for the
     *         <code>Marker</code> request parameter to continue listing your
     *         origin access identities where they left off.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, this element is present
     * and contains the value you can use for the <code>Marker</code> request
     * parameter to continue listing your origin access identities where they
     * left off.
     * </p>
     *
     * @param nextMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>, this element
     *            is present and contains the value you can use for the
     *            <code>Marker</code> request parameter to continue listing your
     *            origin access identities where they left off.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, this element is present
     * and contains the value you can use for the <code>Marker</code> request
     * parameter to continue listing your origin access identities where they
     * left off.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>, this element
     *            is present and contains the value you can use for the
     *            <code>Marker</code> request parameter to continue listing your
     *            origin access identities where they left off.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * The maximum number of origin access identities you want in the response
     * body.
     * </p>
     *
     * @return <p>
     *         The maximum number of origin access identities you want in the
     *         response body.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The maximum number of origin access identities you want in the response
     * body.
     * </p>
     *
     * @param maxItems <p>
     *            The maximum number of origin access identities you want in the
     *            response body.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of origin access identities you want in the response
     * body.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The maximum number of origin access identities you want in the
     *            response body.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether more origin access identities remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the <code>Marker</code> request parameter to
     * retrieve more items in the list.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether more origin access identities
     *         remain to be listed. If your results were truncated, you can make
     *         a follow-up pagination request using the <code>Marker</code>
     *         request parameter to retrieve more items in the list.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more origin access identities remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the <code>Marker</code> request parameter to
     * retrieve more items in the list.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether more origin access identities
     *         remain to be listed. If your results were truncated, you can make
     *         a follow-up pagination request using the <code>Marker</code>
     *         request parameter to retrieve more items in the list.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more origin access identities remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the <code>Marker</code> request parameter to
     * retrieve more items in the list.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether more origin access identities
     *            remain to be listed. If your results were truncated, you can
     *            make a follow-up pagination request using the
     *            <code>Marker</code> request parameter to retrieve more items
     *            in the list.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether more origin access identities remain to be
     * listed. If your results were truncated, you can make a follow-up
     * pagination request using the <code>Marker</code> request parameter to
     * retrieve more items in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether more origin access identities
     *            remain to be listed. If your results were truncated, you can
     *            make a follow-up pagination request using the
     *            <code>Marker</code> request parameter to retrieve more items
     *            in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * The number of CloudFront origin access identities that were created by
     * the current AWS account.
     * </p>
     *
     * @return <p>
     *         The number of CloudFront origin access identities that were
     *         created by the current AWS account.
     *         </p>
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * <p>
     * The number of CloudFront origin access identities that were created by
     * the current AWS account.
     * </p>
     *
     * @param quantity <p>
     *            The number of CloudFront origin access identities that were
     *            created by the current AWS account.
     *            </p>
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of CloudFront origin access identities that were created by
     * the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param quantity <p>
     *            The number of CloudFront origin access identities that were
     *            created by the current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * <p>
     * A complex type that contains one
     * <code>CloudFrontOriginAccessIdentitySummary</code> element for each
     * origin access identity that was created by the current AWS account.
     * </p>
     *
     * @return <p>
     *         A complex type that contains one
     *         <code>CloudFrontOriginAccessIdentitySummary</code> element for
     *         each origin access identity that was created by the current AWS
     *         account.
     *         </p>
     */
    public java.util.List<CloudFrontOriginAccessIdentitySummary> getItems() {
        return items;
    }

    /**
     * <p>
     * A complex type that contains one
     * <code>CloudFrontOriginAccessIdentitySummary</code> element for each
     * origin access identity that was created by the current AWS account.
     * </p>
     *
     * @param items <p>
     *            A complex type that contains one
     *            <code>CloudFrontOriginAccessIdentitySummary</code> element for
     *            each origin access identity that was created by the current
     *            AWS account.
     *            </p>
     */
    public void setItems(java.util.Collection<CloudFrontOriginAccessIdentitySummary> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<CloudFrontOriginAccessIdentitySummary>(items);
    }

    /**
     * <p>
     * A complex type that contains one
     * <code>CloudFrontOriginAccessIdentitySummary</code> element for each
     * origin access identity that was created by the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains one
     *            <code>CloudFrontOriginAccessIdentitySummary</code> element for
     *            each origin access identity that was created by the current
     *            AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withItems(
            CloudFrontOriginAccessIdentitySummary... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<CloudFrontOriginAccessIdentitySummary>(
                    items.length);
        }
        for (CloudFrontOriginAccessIdentitySummary value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one
     * <code>CloudFrontOriginAccessIdentitySummary</code> element for each
     * origin access identity that was created by the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains one
     *            <code>CloudFrontOriginAccessIdentitySummary</code> element for
     *            each origin access identity that was created by the current
     *            AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityList withItems(
            java.util.Collection<CloudFrontOriginAccessIdentitySummary> items) {
        setItems(items);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getQuantity() != null)
            sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFrontOriginAccessIdentityList == false)
            return false;
        CloudFrontOriginAccessIdentityList other = (CloudFrontOriginAccessIdentityList) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
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
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }
}
