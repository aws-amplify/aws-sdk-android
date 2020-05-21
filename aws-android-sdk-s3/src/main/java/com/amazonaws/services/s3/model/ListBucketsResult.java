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

public class ListBucketsResult implements Serializable {
    /**
     * <p>
     * The list of buckets owned by the requestor.
     * </p>
     */
    private java.util.List<Bucket> buckets;

    /**
     * <p>
     * The owner of the buckets listed.
     * </p>
     */
    private Owner owner;

    /**
     * <p>
     * The list of buckets owned by the requestor.
     * </p>
     *
     * @return <p>
     *         The list of buckets owned by the requestor.
     *         </p>
     */
    public java.util.List<Bucket> getBuckets() {
        return buckets;
    }

    /**
     * <p>
     * The list of buckets owned by the requestor.
     * </p>
     *
     * @param buckets <p>
     *            The list of buckets owned by the requestor.
     *            </p>
     */
    public void setBuckets(java.util.Collection<Bucket> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new java.util.ArrayList<Bucket>(buckets);
    }

    /**
     * <p>
     * The list of buckets owned by the requestor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buckets <p>
     *            The list of buckets owned by the requestor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketsResult withBuckets(Bucket... buckets) {
        if (getBuckets() == null) {
            this.buckets = new java.util.ArrayList<Bucket>(buckets.length);
        }
        for (Bucket value : buckets) {
            this.buckets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of buckets owned by the requestor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buckets <p>
     *            The list of buckets owned by the requestor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketsResult withBuckets(java.util.Collection<Bucket> buckets) {
        setBuckets(buckets);
        return this;
    }

    /**
     * <p>
     * The owner of the buckets listed.
     * </p>
     *
     * @return <p>
     *         The owner of the buckets listed.
     *         </p>
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of the buckets listed.
     * </p>
     *
     * @param owner <p>
     *            The owner of the buckets listed.
     *            </p>
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the buckets listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            The owner of the buckets listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBucketsResult withOwner(Owner owner) {
        this.owner = owner;
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
        if (getBuckets() != null)
            sb.append("Buckets: " + getBuckets() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBucketsResult == false)
            return false;
        ListBucketsResult other = (ListBucketsResult) obj;

        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }
}
