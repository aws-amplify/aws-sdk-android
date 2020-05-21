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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class ListBucketInventoryConfigurationsResult implements Serializable {
    /**
     * <p>
     * If sent in the request, the marker that is used as a starting point for
     * this inventory configuration list response.
     * </p>
     */
    private String continuationToken;

    /**
     * <p>
     * The list of inventory configurations for a bucket.
     * </p>
     */
    private java.util.List<InventoryConfiguration> inventoryConfigurationList;

    /**
     * <p>
     * Tells whether the returned list of inventory configurations is complete.
     * A value of true indicates that the list is not complete and the
     * NextContinuationToken is provided for a subsequent request.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * The marker used to continue this inventory configuration listing. Use the
     * <code>NextContinuationToken</code> from this response to continue the
     * listing in a subsequent request. The continuation token is an opaque
     * value that Amazon S3 understands.
     * </p>
     */
    private String nextContinuationToken;

    /**
     * <p>
     * If sent in the request, the marker that is used as a starting point for
     * this inventory configuration list response.
     * </p>
     *
     * @return <p>
     *         If sent in the request, the marker that is used as a starting
     *         point for this inventory configuration list response.
     *         </p>
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * If sent in the request, the marker that is used as a starting point for
     * this inventory configuration list response.
     * </p>
     *
     * @param continuationToken <p>
     *            If sent in the request, the marker that is used as a starting
     *            point for this inventory configuration list response.
     *            </p>
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * If sent in the request, the marker that is used as a starting point for
     * this inventory configuration list response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuationToken <p>
     *            If sent in the request, the marker that is used as a starting
     *            point for this inventory configuration list response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketInventoryConfigurationsResult withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * <p>
     * The list of inventory configurations for a bucket.
     * </p>
     *
     * @return <p>
     *         The list of inventory configurations for a bucket.
     *         </p>
     */
    public java.util.List<InventoryConfiguration> getInventoryConfigurationList() {
        return inventoryConfigurationList;
    }

    /**
     * <p>
     * The list of inventory configurations for a bucket.
     * </p>
     *
     * @param inventoryConfigurationList <p>
     *            The list of inventory configurations for a bucket.
     *            </p>
     */
    public void setInventoryConfigurationList(
            java.util.Collection<InventoryConfiguration> inventoryConfigurationList) {
        if (inventoryConfigurationList == null) {
            this.inventoryConfigurationList = null;
            return;
        }

        this.inventoryConfigurationList = new java.util.ArrayList<InventoryConfiguration>(
                inventoryConfigurationList);
    }

    /**
     * <p>
     * The list of inventory configurations for a bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inventoryConfigurationList <p>
     *            The list of inventory configurations for a bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketInventoryConfigurationsResult withInventoryConfigurationList(
            InventoryConfiguration... inventoryConfigurationList) {
        if (getInventoryConfigurationList() == null) {
            this.inventoryConfigurationList = new java.util.ArrayList<InventoryConfiguration>(
                    inventoryConfigurationList.length);
        }
        for (InventoryConfiguration value : inventoryConfigurationList) {
            this.inventoryConfigurationList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of inventory configurations for a bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inventoryConfigurationList <p>
     *            The list of inventory configurations for a bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketInventoryConfigurationsResult withInventoryConfigurationList(
            java.util.Collection<InventoryConfiguration> inventoryConfigurationList) {
        setInventoryConfigurationList(inventoryConfigurationList);
        return this;
    }

    /**
     * <p>
     * Tells whether the returned list of inventory configurations is complete.
     * A value of true indicates that the list is not complete and the
     * NextContinuationToken is provided for a subsequent request.
     * </p>
     *
     * @return <p>
     *         Tells whether the returned list of inventory configurations is
     *         complete. A value of true indicates that the list is not complete
     *         and the NextContinuationToken is provided for a subsequent
     *         request.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Tells whether the returned list of inventory configurations is complete.
     * A value of true indicates that the list is not complete and the
     * NextContinuationToken is provided for a subsequent request.
     * </p>
     *
     * @return <p>
     *         Tells whether the returned list of inventory configurations is
     *         complete. A value of true indicates that the list is not complete
     *         and the NextContinuationToken is provided for a subsequent
     *         request.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Tells whether the returned list of inventory configurations is complete.
     * A value of true indicates that the list is not complete and the
     * NextContinuationToken is provided for a subsequent request.
     * </p>
     *
     * @param isTruncated <p>
     *            Tells whether the returned list of inventory configurations is
     *            complete. A value of true indicates that the list is not
     *            complete and the NextContinuationToken is provided for a
     *            subsequent request.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * Tells whether the returned list of inventory configurations is complete.
     * A value of true indicates that the list is not complete and the
     * NextContinuationToken is provided for a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            Tells whether the returned list of inventory configurations is
     *            complete. A value of true indicates that the list is not
     *            complete and the NextContinuationToken is provided for a
     *            subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketInventoryConfigurationsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * The marker used to continue this inventory configuration listing. Use the
     * <code>NextContinuationToken</code> from this response to continue the
     * listing in a subsequent request. The continuation token is an opaque
     * value that Amazon S3 understands.
     * </p>
     *
     * @return <p>
     *         The marker used to continue this inventory configuration listing.
     *         Use the <code>NextContinuationToken</code> from this response to
     *         continue the listing in a subsequent request. The continuation
     *         token is an opaque value that Amazon S3 understands.
     *         </p>
     */
    public String getNextContinuationToken() {
        return nextContinuationToken;
    }

    /**
     * <p>
     * The marker used to continue this inventory configuration listing. Use the
     * <code>NextContinuationToken</code> from this response to continue the
     * listing in a subsequent request. The continuation token is an opaque
     * value that Amazon S3 understands.
     * </p>
     *
     * @param nextContinuationToken <p>
     *            The marker used to continue this inventory configuration
     *            listing. Use the <code>NextContinuationToken</code> from this
     *            response to continue the listing in a subsequent request. The
     *            continuation token is an opaque value that Amazon S3
     *            understands.
     *            </p>
     */
    public void setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
    }

    /**
     * <p>
     * The marker used to continue this inventory configuration listing. Use the
     * <code>NextContinuationToken</code> from this response to continue the
     * listing in a subsequent request. The continuation token is an opaque
     * value that Amazon S3 understands.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextContinuationToken <p>
     *            The marker used to continue this inventory configuration
     *            listing. Use the <code>NextContinuationToken</code> from this
     *            response to continue the listing in a subsequent request. The
     *            continuation token is an opaque value that Amazon S3
     *            understands.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketInventoryConfigurationsResult withNextContinuationToken(
            String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
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
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: " + getContinuationToken() + ",");
        if (getInventoryConfigurationList() != null)
            sb.append("InventoryConfigurationList: " + getInventoryConfigurationList() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextContinuationToken() != null)
            sb.append("NextContinuationToken: " + getNextContinuationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getInventoryConfigurationList() == null) ? 0 : getInventoryConfigurationList()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextContinuationToken() == null) ? 0 : getNextContinuationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBucketInventoryConfigurationsResult == false)
            return false;
        ListBucketInventoryConfigurationsResult other = (ListBucketInventoryConfigurationsResult) obj;

        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null
                && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        if (other.getInventoryConfigurationList() == null
                ^ this.getInventoryConfigurationList() == null)
            return false;
        if (other.getInventoryConfigurationList() != null
                && other.getInventoryConfigurationList().equals(
                        this.getInventoryConfigurationList()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextContinuationToken() == null ^ this.getNextContinuationToken() == null)
            return false;
        if (other.getNextContinuationToken() != null
                && other.getNextContinuationToken().equals(this.getNextContinuationToken()) == false)
            return false;
        return true;
    }
}
