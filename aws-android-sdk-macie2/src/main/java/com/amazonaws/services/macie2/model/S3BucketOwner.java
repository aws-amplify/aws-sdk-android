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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the user who owns an S3 bucket.
 * </p>
 */
public class S3BucketOwner implements Serializable {
    /**
     * <p>
     * The display name of the user who owns the bucket.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The AWS account ID for the user who owns the bucket.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The display name of the user who owns the bucket.
     * </p>
     *
     * @return <p>
     *         The display name of the user who owns the bucket.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The display name of the user who owns the bucket.
     * </p>
     *
     * @param displayName <p>
     *            The display name of the user who owns the bucket.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the user who owns the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param displayName <p>
     *            The display name of the user who owns the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3BucketOwner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The AWS account ID for the user who owns the bucket.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the user who owns the bucket.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The AWS account ID for the user who owns the bucket.
     * </p>
     *
     * @param id <p>
     *            The AWS account ID for the user who owns the bucket.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The AWS account ID for the user who owns the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The AWS account ID for the user who owns the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3BucketOwner withId(String id) {
        this.id = id;
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
        if (getDisplayName() != null)
            sb.append("displayName: " + getDisplayName() + ",");
        if (getId() != null)
            sb.append("id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketOwner == false)
            return false;
        S3BucketOwner other = (S3BucketOwner) obj;

        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }
}
