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
 * Specifies when noncurrent object versions expire. Upon expiration, Amazon S3
 * permanently deletes the noncurrent object versions. You set this lifecycle
 * configuration action on a bucket that has versioning enabled (or suspended)
 * to request that Amazon S3 delete noncurrent object versions at a specific
 * period in the object's lifetime.
 * </p>
 */
public class NoncurrentVersionExpiration implements Serializable {
    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can
     * perform the associated action. For information about the noncurrent days
     * calculations, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the
     * <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     */
    private Integer noncurrentDays;

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can
     * perform the associated action. For information about the noncurrent days
     * calculations, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the
     * <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the number of days an object is noncurrent before
     *         Amazon S3 can perform the associated action. For information
     *         about the noncurrent days calculations, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *         >How Amazon S3 Calculates When an Object Became Noncurrent</a> in
     *         the <i>Amazon Simple Storage Service Developer Guide</i>.
     *         </p>
     */
    public Integer getNoncurrentDays() {
        return noncurrentDays;
    }

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can
     * perform the associated action. For information about the noncurrent days
     * calculations, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the
     * <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param noncurrentDays <p>
     *            Specifies the number of days an object is noncurrent before
     *            Amazon S3 can perform the associated action. For information
     *            about the noncurrent days calculations, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *            >How Amazon S3 Calculates When an Object Became Noncurrent</a>
     *            in the <i>Amazon Simple Storage Service Developer Guide</i>.
     *            </p>
     */
    public void setNoncurrentDays(Integer noncurrentDays) {
        this.noncurrentDays = noncurrentDays;
    }

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can
     * perform the associated action. For information about the noncurrent days
     * calculations, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates When an Object Became Noncurrent</a> in the
     * <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noncurrentDays <p>
     *            Specifies the number of days an object is noncurrent before
     *            Amazon S3 can perform the associated action. For information
     *            about the noncurrent days calculations, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *            >How Amazon S3 Calculates When an Object Became Noncurrent</a>
     *            in the <i>Amazon Simple Storage Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoncurrentVersionExpiration withNoncurrentDays(Integer noncurrentDays) {
        this.noncurrentDays = noncurrentDays;
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
        if (getNoncurrentDays() != null)
            sb.append("NoncurrentDays: " + getNoncurrentDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNoncurrentDays() == null) ? 0 : getNoncurrentDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NoncurrentVersionExpiration == false)
            return false;
        NoncurrentVersionExpiration other = (NoncurrentVersionExpiration) obj;

        if (other.getNoncurrentDays() == null ^ this.getNoncurrentDays() == null)
            return false;
        if (other.getNoncurrentDays() != null
                && other.getNoncurrentDays().equals(this.getNoncurrentDays()) == false)
            return false;
        return true;
    }
}
