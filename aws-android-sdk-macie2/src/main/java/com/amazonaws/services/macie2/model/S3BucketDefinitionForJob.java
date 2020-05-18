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
 * Specifies which S3 buckets contain the objects that a classification job
 * analyzes.
 * </p>
 */
public class S3BucketDefinitionForJob implements Serializable {
    /**
     * <p>
     * The unique identifier for the AWS account that owns one or more of the
     * buckets. If specified, the job analyzes objects in all the buckets that
     * are owned by the account and meet other conditions specified for the job.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     */
    private java.util.List<String> buckets;

    /**
     * <p>
     * The unique identifier for the AWS account that owns one or more of the
     * buckets. If specified, the job analyzes objects in all the buckets that
     * are owned by the account and meet other conditions specified for the job.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the AWS account that owns one or more
     *         of the buckets. If specified, the job analyzes objects in all the
     *         buckets that are owned by the account and meet other conditions
     *         specified for the job.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The unique identifier for the AWS account that owns one or more of the
     * buckets. If specified, the job analyzes objects in all the buckets that
     * are owned by the account and meet other conditions specified for the job.
     * </p>
     *
     * @param accountId <p>
     *            The unique identifier for the AWS account that owns one or
     *            more of the buckets. If specified, the job analyzes objects in
     *            all the buckets that are owned by the account and meet other
     *            conditions specified for the job.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the AWS account that owns one or more of the
     * buckets. If specified, the job analyzes objects in all the buckets that
     * are owned by the account and meet other conditions specified for the job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The unique identifier for the AWS account that owns one or
     *            more of the buckets. If specified, the job analyzes objects in
     *            all the buckets that are owned by the account and meet other
     *            conditions specified for the job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3BucketDefinitionForJob withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     *
     * @return <p>
     *         An array that lists the names of the buckets.
     *         </p>
     */
    public java.util.List<String> getBuckets() {
        return buckets;
    }

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     *
     * @param buckets <p>
     *            An array that lists the names of the buckets.
     *            </p>
     */
    public void setBuckets(java.util.Collection<String> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }

        this.buckets = new java.util.ArrayList<String>(buckets);
    }

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buckets <p>
     *            An array that lists the names of the buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3BucketDefinitionForJob withBuckets(String... buckets) {
        if (getBuckets() == null) {
            this.buckets = new java.util.ArrayList<String>(buckets.length);
        }
        for (String value : buckets) {
            this.buckets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists the names of the buckets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param buckets <p>
     *            An array that lists the names of the buckets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3BucketDefinitionForJob withBuckets(java.util.Collection<String> buckets) {
        setBuckets(buckets);
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
        if (getAccountId() != null)
            sb.append("accountId: " + getAccountId() + ",");
        if (getBuckets() != null)
            sb.append("buckets: " + getBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketDefinitionForJob == false)
            return false;
        S3BucketDefinitionForJob other = (S3BucketDefinitionForJob) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBuckets() == null ^ this.getBuckets() == null)
            return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false)
            return false;
        return true;
    }
}
