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
 * <p>Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys of a recommendations export file, and its associated metadata file.</p>
 */
public class S3Destination implements Serializable {
    /**
     * <p>The name of the Amazon S3 bucket used as the destination of an export file.</p>
     */
    private String bucket;

    /**
     * <p>The Amazon S3 bucket key of an export file.</p> <p>The key uniquely identifies the object, or export file, in the S3 bucket.</p>
     */
    private String key;

    /**
     * <p>The Amazon S3 bucket key of a metadata file.</p> <p>The key uniquely identifies the object, or metadata file, in the S3 bucket.</p>
     */
    private String metadataKey;

    /**
     * <p>The name of the Amazon S3 bucket used as the destination of an export file.</p>
     *
     * @return <p>The name of the Amazon S3 bucket used as the destination of an export file.</p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>The name of the Amazon S3 bucket used as the destination of an export file.</p>
     *
     * @param bucket <p>The name of the Amazon S3 bucket used as the destination of an export file.</p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>The name of the Amazon S3 bucket used as the destination of an export file.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket <p>The name of the Amazon S3 bucket used as the destination of an export file.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3Destination withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>The Amazon S3 bucket key of an export file.</p> <p>The key uniquely identifies the object, or export file, in the S3 bucket.</p>
     *
     * @return <p>The Amazon S3 bucket key of an export file.</p> <p>The key uniquely identifies the object, or export file, in the S3 bucket.</p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>The Amazon S3 bucket key of an export file.</p> <p>The key uniquely identifies the object, or export file, in the S3 bucket.</p>
     *
     * @param key <p>The Amazon S3 bucket key of an export file.</p> <p>The key uniquely identifies the object, or export file, in the S3 bucket.</p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>The Amazon S3 bucket key of an export file.</p> <p>The key uniquely identifies the object, or export file, in the S3 bucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key <p>The Amazon S3 bucket key of an export file.</p> <p>The key uniquely identifies the object, or export file, in the S3 bucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3Destination withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>The Amazon S3 bucket key of a metadata file.</p> <p>The key uniquely identifies the object, or metadata file, in the S3 bucket.</p>
     *
     * @return <p>The Amazon S3 bucket key of a metadata file.</p> <p>The key uniquely identifies the object, or metadata file, in the S3 bucket.</p>
     */
    public String getMetadataKey() {
        return metadataKey;
    }

    /**
     * <p>The Amazon S3 bucket key of a metadata file.</p> <p>The key uniquely identifies the object, or metadata file, in the S3 bucket.</p>
     *
     * @param metadataKey <p>The Amazon S3 bucket key of a metadata file.</p> <p>The key uniquely identifies the object, or metadata file, in the S3 bucket.</p>
     */
    public void setMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
    }

    /**
     * <p>The Amazon S3 bucket key of a metadata file.</p> <p>The key uniquely identifies the object, or metadata file, in the S3 bucket.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metadataKey <p>The Amazon S3 bucket key of a metadata file.</p> <p>The key uniquely identifies the object, or metadata file, in the S3 bucket.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3Destination withMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
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
        if (getKey() != null) sb.append("key: " + getKey() + ",");
        if (getMetadataKey() != null) sb.append("metadataKey: " + getMetadataKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getMetadataKey() == null) ? 0 : getMetadataKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3Destination == false) return false;
        S3Destination other = (S3Destination)obj;

        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false;
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false;
        if (other.getMetadataKey() == null ^ this.getMetadataKey() == null) return false;
        if (other.getMetadataKey() != null && other.getMetadataKey().equals(this.getMetadataKey()) == false) return false;
        return true;
    }
}
