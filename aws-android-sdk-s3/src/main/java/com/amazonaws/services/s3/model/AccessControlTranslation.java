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

/**
 * <p>
 * A container for information about access control for replicas.
 * </p>
 */
public class AccessControlTranslation implements Serializable {
    /**
     * <p>
     * Specifies the replica ownership. For default and valid values, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT bucket replication</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Destination
     */
    private String owner;

    /**
     * <p>
     * Specifies the replica ownership. For default and valid values, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT bucket replication</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Destination
     *
     * @return <p>
     *         Specifies the replica ownership. For default and valid values,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *         >PUT bucket replication</a> in the <i>Amazon Simple Storage
     *         Service API Reference</i>.
     *         </p>
     * @see OwnerOverride
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * Specifies the replica ownership. For default and valid values, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT bucket replication</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Destination
     *
     * @param owner <p>
     *            Specifies the replica ownership. For default and valid values,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *            >PUT bucket replication</a> in the <i>Amazon Simple Storage
     *            Service API Reference</i>.
     *            </p>
     * @see OwnerOverride
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Specifies the replica ownership. For default and valid values, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT bucket replication</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Destination
     *
     * @param owner <p>
     *            Specifies the replica ownership. For default and valid values,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *            >PUT bucket replication</a> in the <i>Amazon Simple Storage
     *            Service API Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OwnerOverride
     */
    public AccessControlTranslation withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * Specifies the replica ownership. For default and valid values, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT bucket replication</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Destination
     *
     * @param owner <p>
     *            Specifies the replica ownership. For default and valid values,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *            >PUT bucket replication</a> in the <i>Amazon Simple Storage
     *            Service API Reference</i>.
     *            </p>
     * @see OwnerOverride
     */
    public void setOwner(OwnerOverride owner) {
        this.owner = owner.toString();
    }

    /**
     * <p>
     * Specifies the replica ownership. For default and valid values, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     * >PUT bucket replication</a> in the <i>Amazon Simple Storage Service API
     * Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Destination
     *
     * @param owner <p>
     *            Specifies the replica ownership. For default and valid values,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html"
     *            >PUT bucket replication</a> in the <i>Amazon Simple Storage
     *            Service API Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OwnerOverride
     */
    public AccessControlTranslation withOwner(OwnerOverride owner) {
        this.owner = owner.toString();
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
            sb.append("Owner: " + getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessControlTranslation == false)
            return false;
        AccessControlTranslation other = (AccessControlTranslation) obj;

        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }
}
