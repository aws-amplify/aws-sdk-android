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
 * Provides information about the permissions settings of a bucket policy for an
 * S3 bucket.
 * </p>
 */
public class BucketPolicy implements Serializable {
    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * read access to the bucket.
     * </p>
     */
    private Boolean allowsPublicReadAccess;

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * write access to the bucket.
     * </p>
     */
    private Boolean allowsPublicWriteAccess;

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * read access to the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket policy allows the general public to
     *         have read access to the bucket.
     *         </p>
     */
    public Boolean isAllowsPublicReadAccess() {
        return allowsPublicReadAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * read access to the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket policy allows the general public to
     *         have read access to the bucket.
     *         </p>
     */
    public Boolean getAllowsPublicReadAccess() {
        return allowsPublicReadAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * read access to the bucket.
     * </p>
     *
     * @param allowsPublicReadAccess <p>
     *            Specifies whether the bucket policy allows the general public
     *            to have read access to the bucket.
     *            </p>
     */
    public void setAllowsPublicReadAccess(Boolean allowsPublicReadAccess) {
        this.allowsPublicReadAccess = allowsPublicReadAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * read access to the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowsPublicReadAccess <p>
     *            Specifies whether the bucket policy allows the general public
     *            to have read access to the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketPolicy withAllowsPublicReadAccess(Boolean allowsPublicReadAccess) {
        this.allowsPublicReadAccess = allowsPublicReadAccess;
        return this;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * write access to the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket policy allows the general public to
     *         have write access to the bucket.
     *         </p>
     */
    public Boolean isAllowsPublicWriteAccess() {
        return allowsPublicWriteAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * write access to the bucket.
     * </p>
     *
     * @return <p>
     *         Specifies whether the bucket policy allows the general public to
     *         have write access to the bucket.
     *         </p>
     */
    public Boolean getAllowsPublicWriteAccess() {
        return allowsPublicWriteAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * write access to the bucket.
     * </p>
     *
     * @param allowsPublicWriteAccess <p>
     *            Specifies whether the bucket policy allows the general public
     *            to have write access to the bucket.
     *            </p>
     */
    public void setAllowsPublicWriteAccess(Boolean allowsPublicWriteAccess) {
        this.allowsPublicWriteAccess = allowsPublicWriteAccess;
    }

    /**
     * <p>
     * Specifies whether the bucket policy allows the general public to have
     * write access to the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowsPublicWriteAccess <p>
     *            Specifies whether the bucket policy allows the general public
     *            to have write access to the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BucketPolicy withAllowsPublicWriteAccess(Boolean allowsPublicWriteAccess) {
        this.allowsPublicWriteAccess = allowsPublicWriteAccess;
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
        if (getAllowsPublicReadAccess() != null)
            sb.append("allowsPublicReadAccess: " + getAllowsPublicReadAccess() + ",");
        if (getAllowsPublicWriteAccess() != null)
            sb.append("allowsPublicWriteAccess: " + getAllowsPublicWriteAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAllowsPublicReadAccess() == null) ? 0 : getAllowsPublicReadAccess()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowsPublicWriteAccess() == null) ? 0 : getAllowsPublicWriteAccess()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketPolicy == false)
            return false;
        BucketPolicy other = (BucketPolicy) obj;

        if (other.getAllowsPublicReadAccess() == null ^ this.getAllowsPublicReadAccess() == null)
            return false;
        if (other.getAllowsPublicReadAccess() != null
                && other.getAllowsPublicReadAccess().equals(this.getAllowsPublicReadAccess()) == false)
            return false;
        if (other.getAllowsPublicWriteAccess() == null ^ this.getAllowsPublicWriteAccess() == null)
            return false;
        if (other.getAllowsPublicWriteAccess() != null
                && other.getAllowsPublicWriteAccess().equals(this.getAllowsPublicWriteAccess()) == false)
            return false;
        return true;
    }
}
