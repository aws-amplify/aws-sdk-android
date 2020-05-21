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

public class GetBucketAclResult implements Serializable {
    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     */
    private Owner owner;

    /**
     * <p>
     * A list of grants.
     * </p>
     */
    private java.util.List<Grant> grants;

    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     *
     * @return <p>
     *         Container for the bucket owner's display name and ID.
     *         </p>
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     *
     * @param owner <p>
     *            Container for the bucket owner's display name and ID.
     *            </p>
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Container for the bucket owner's display name and ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            Container for the bucket owner's display name and ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketAclResult withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     *
     * @return <p>
     *         A list of grants.
     *         </p>
     */
    public java.util.List<Grant> getGrants() {
        return grants;
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     *
     * @param grants <p>
     *            A list of grants.
     *            </p>
     */
    public void setGrants(java.util.Collection<Grant> grants) {
        if (grants == null) {
            this.grants = null;
            return;
        }

        this.grants = new java.util.ArrayList<Grant>(grants);
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grants <p>
     *            A list of grants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketAclResult withGrants(Grant... grants) {
        if (getGrants() == null) {
            this.grants = new java.util.ArrayList<Grant>(grants.length);
        }
        for (Grant value : grants) {
            this.grants.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of grants.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param grants <p>
     *            A list of grants.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketAclResult withGrants(java.util.Collection<Grant> grants) {
        setGrants(grants);
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
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getGrants() != null)
            sb.append("Grants: " + getGrants());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getGrants() == null) ? 0 : getGrants().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketAclResult == false)
            return false;
        GetBucketAclResult other = (GetBucketAclResult) obj;

        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getGrants() == null ^ this.getGrants() == null)
            return false;
        if (other.getGrants() != null && other.getGrants().equals(this.getGrants()) == false)
            return false;
        return true;
    }
}
