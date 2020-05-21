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
 * Specifies the days since the initiation of an incomplete multipart upload
 * that Amazon S3 will wait before permanently removing all parts of the upload.
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
 * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy</a>
 * in the <i>Amazon Simple Storage Service Developer Guide</i>.
 * </p>
 */
public class AbortIncompleteMultipartUpload implements Serializable {
    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete
     * multipart upload.
     * </p>
     */
    private Integer daysAfterInitiation;

    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete
     * multipart upload.
     * </p>
     *
     * @return <p>
     *         Specifies the number of days after which Amazon S3 aborts an
     *         incomplete multipart upload.
     *         </p>
     */
    public Integer getDaysAfterInitiation() {
        return daysAfterInitiation;
    }

    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete
     * multipart upload.
     * </p>
     *
     * @param daysAfterInitiation <p>
     *            Specifies the number of days after which Amazon S3 aborts an
     *            incomplete multipart upload.
     *            </p>
     */
    public void setDaysAfterInitiation(Integer daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
    }

    /**
     * <p>
     * Specifies the number of days after which Amazon S3 aborts an incomplete
     * multipart upload.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param daysAfterInitiation <p>
     *            Specifies the number of days after which Amazon S3 aborts an
     *            incomplete multipart upload.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AbortIncompleteMultipartUpload withDaysAfterInitiation(Integer daysAfterInitiation) {
        this.daysAfterInitiation = daysAfterInitiation;
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
        if (getDaysAfterInitiation() != null)
            sb.append("DaysAfterInitiation: " + getDaysAfterInitiation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDaysAfterInitiation() == null) ? 0 : getDaysAfterInitiation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortIncompleteMultipartUpload == false)
            return false;
        AbortIncompleteMultipartUpload other = (AbortIncompleteMultipartUpload) obj;

        if (other.getDaysAfterInitiation() == null ^ this.getDaysAfterInitiation() == null)
            return false;
        if (other.getDaysAfterInitiation() != null
                && other.getDaysAfterInitiation().equals(this.getDaysAfterInitiation()) == false)
            return false;
        return true;
    }
}
