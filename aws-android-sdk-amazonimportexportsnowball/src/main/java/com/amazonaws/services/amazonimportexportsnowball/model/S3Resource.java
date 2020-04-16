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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

/**
 * <p>
 * Each <code>S3Resource</code> object represents an Amazon S3 bucket that your
 * transferred data will be exported from or imported into. For export jobs,
 * this object can have an optional <code>KeyRange</code> value. The length of
 * the range is defined at job creation, and has either an inclusive
 * <code>BeginMarker</code>, an inclusive <code>EndMarker</code>, or both.
 * Ranges are UTF-8 binary sorted.
 * </p>
 */
public class S3Resource implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String bucketArn;

    /**
     * <p>
     * For export jobs, you can provide an optional <code>KeyRange</code> within
     * a specific Amazon S3 bucket. The length of the range is defined at job
     * creation, and has either an inclusive <code>BeginMarker</code>, an
     * inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary
     * sorted.
     * </p>
     */
    private KeyRange keyRange;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     *         </p>
     */
    public String getBucketArn() {
        return bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param bucketArn <p>
     *            The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     *            </p>
     */
    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param bucketArn <p>
     *            The Amazon Resource Name (ARN) of an Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Resource withBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
        return this;
    }

    /**
     * <p>
     * For export jobs, you can provide an optional <code>KeyRange</code> within
     * a specific Amazon S3 bucket. The length of the range is defined at job
     * creation, and has either an inclusive <code>BeginMarker</code>, an
     * inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary
     * sorted.
     * </p>
     *
     * @return <p>
     *         For export jobs, you can provide an optional
     *         <code>KeyRange</code> within a specific Amazon S3 bucket. The
     *         length of the range is defined at job creation, and has either an
     *         inclusive <code>BeginMarker</code>, an inclusive
     *         <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
     *         </p>
     */
    public KeyRange getKeyRange() {
        return keyRange;
    }

    /**
     * <p>
     * For export jobs, you can provide an optional <code>KeyRange</code> within
     * a specific Amazon S3 bucket. The length of the range is defined at job
     * creation, and has either an inclusive <code>BeginMarker</code>, an
     * inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary
     * sorted.
     * </p>
     *
     * @param keyRange <p>
     *            For export jobs, you can provide an optional
     *            <code>KeyRange</code> within a specific Amazon S3 bucket. The
     *            length of the range is defined at job creation, and has either
     *            an inclusive <code>BeginMarker</code>, an inclusive
     *            <code>EndMarker</code>, or both. Ranges are UTF-8 binary
     *            sorted.
     *            </p>
     */
    public void setKeyRange(KeyRange keyRange) {
        this.keyRange = keyRange;
    }

    /**
     * <p>
     * For export jobs, you can provide an optional <code>KeyRange</code> within
     * a specific Amazon S3 bucket. The length of the range is defined at job
     * creation, and has either an inclusive <code>BeginMarker</code>, an
     * inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary
     * sorted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyRange <p>
     *            For export jobs, you can provide an optional
     *            <code>KeyRange</code> within a specific Amazon S3 bucket. The
     *            length of the range is defined at job creation, and has either
     *            an inclusive <code>BeginMarker</code>, an inclusive
     *            <code>EndMarker</code>, or both. Ranges are UTF-8 binary
     *            sorted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Resource withKeyRange(KeyRange keyRange) {
        this.keyRange = keyRange;
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
        if (getBucketArn() != null)
            sb.append("BucketArn: " + getBucketArn() + ",");
        if (getKeyRange() != null)
            sb.append("KeyRange: " + getKeyRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getKeyRange() == null) ? 0 : getKeyRange().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Resource == false)
            return false;
        S3Resource other = (S3Resource) obj;

        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null
                && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getKeyRange() == null ^ this.getKeyRange() == null)
            return false;
        if (other.getKeyRange() != null && other.getKeyRange().equals(this.getKeyRange()) == false)
            return false;
        return true;
    }
}
