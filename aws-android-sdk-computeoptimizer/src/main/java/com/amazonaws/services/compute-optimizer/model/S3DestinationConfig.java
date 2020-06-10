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
package com.amazonaws.services.compute-optimizer.model;

import java.io.Serializable;


/**
 * <p>Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and key prefix for a recommendations export job.</p> <p>You must create the destination Amazon S3 bucket for your recommendations export before you create the export job. Compute Optimizer does not create the S3 bucket for you. After you create the S3 bucket, ensure that it has the required permission policy to allow Compute Optimizer to write the export file to it. If you plan to specify an object prefix when you create the export job, you must include the object prefix in the policy that you add to the S3 bucket. For more information, see <a href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/create-s3-bucket-policy-for-compute-optimizer.html">Amazon S3 Bucket Policy for Compute Optimizer</a> in the <i>Compute Optimizer user guide</i>.</p>
 */
public class S3DestinationConfig implements Serializable {
    /**
     * <p>The name of the Amazon S3 bucket to use as the destination for an export job.</p>
     */
    private String bucket;

    /**
     * <p>The Amazon S3 bucket prefix for an export job.</p>
     */
    private String keyPrefix;

    /**
     * <p>The name of the Amazon S3 bucket to use as the destination for an export job.</p>
     *
     * @return <p>The name of the Amazon S3 bucket to use as the destination for an export job.</p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>The name of the Amazon S3 bucket to use as the destination for an export job.</p>
     *
     * @param bucket <p>The name of the Amazon S3 bucket to use as the destination for an export job.</p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>The name of the Amazon S3 bucket to use as the destination for an export job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket <p>The name of the Amazon S3 bucket to use as the destination for an export job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3DestinationConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>The Amazon S3 bucket prefix for an export job.</p>
     *
     * @return <p>The Amazon S3 bucket prefix for an export job.</p>
     */
    public String getKeyPrefix() {
        return keyPrefix;
    }

    /**
     * <p>The Amazon S3 bucket prefix for an export job.</p>
     *
     * @param keyPrefix <p>The Amazon S3 bucket prefix for an export job.</p>
     */
    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * <p>The Amazon S3 bucket prefix for an export job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyPrefix <p>The Amazon S3 bucket prefix for an export job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3DestinationConfig withKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
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
        if (getBucket() != null) sb.append("bucket: " + getBucket() + ",");
        if (getKeyPrefix() != null) sb.append("keyPrefix: " + getKeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefix() == null) ? 0 : getKeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3DestinationConfig == false) return false;
        S3DestinationConfig other = (S3DestinationConfig)obj;

        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false;
        if (other.getKeyPrefix() == null ^ this.getKeyPrefix() == null) return false;
        if (other.getKeyPrefix() != null && other.getKeyPrefix().equals(this.getKeyPrefix()) == false) return false;
        return true;
    }
}
