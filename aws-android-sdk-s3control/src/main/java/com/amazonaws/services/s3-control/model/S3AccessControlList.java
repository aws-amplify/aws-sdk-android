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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p/>
 */
public class S3AccessControlList implements Serializable {
    /**
     * <p/>
     */
    private S3ObjectOwner owner;

    /**
     * <p/>
     */
    private java.util.List<S3Grant> grants;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public S3ObjectOwner getOwner() {
        return owner;
    }

    /**
     * <p/>
     *
     * @param owner <p/>
     */
    public void setOwner(S3ObjectOwner owner) {
        this.owner = owner;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param owner <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3AccessControlList withOwner(S3ObjectOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<S3Grant> getGrants() {
        return grants;
    }

    /**
     * <p/>
     *
     * @param grants <p/>
     */
    public void setGrants(java.util.Collection<S3Grant> grants) {
        if (grants == null) {
            this.grants = null;
            return;
        }

        this.grants = new java.util.ArrayList<S3Grant>(grants);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param grants <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3AccessControlList withGrants(S3Grant... grants) {
        if (getGrants() == null) {
            this.grants = new java.util.ArrayList<S3Grant>(grants.length);
        }
        for (S3Grant value : grants) {
            this.grants.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param grants <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3AccessControlList withGrants(java.util.Collection<S3Grant> grants) {
        setGrants(grants);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOwner() != null) sb.append("Owner: " + getOwner() + ",");
        if (getGrants() != null) sb.append("Grants: " + getGrants());
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
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3AccessControlList == false) return false;
        S3AccessControlList other = (S3AccessControlList)obj;

        if (other.getOwner() == null ^ this.getOwner() == null) return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) return false;
        if (other.getGrants() == null ^ this.getGrants() == null) return false;
        if (other.getGrants() != null && other.getGrants().equals(this.getGrants()) == false) return false;
        return true;
    }
}
