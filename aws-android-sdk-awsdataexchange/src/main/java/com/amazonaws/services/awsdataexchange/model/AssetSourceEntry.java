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

package com.amazonaws.services.awsdataexchange.model;

import java.io.Serializable;

/**
 * <p>
 * The source of the assets.
 * </p>
 */
public class AssetSourceEntry implements Serializable {
    /**
     * <p>
     * The S3 bucket that's part of the source of the asset.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The name of the object in Amazon S3 for the asset.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The S3 bucket that's part of the source of the asset.
     * </p>
     *
     * @return <p>
     *         The S3 bucket that's part of the source of the asset.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The S3 bucket that's part of the source of the asset.
     * </p>
     *
     * @param bucket <p>
     *            The S3 bucket that's part of the source of the asset.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The S3 bucket that's part of the source of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The S3 bucket that's part of the source of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetSourceEntry withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The name of the object in Amazon S3 for the asset.
     * </p>
     *
     * @return <p>
     *         The name of the object in Amazon S3 for the asset.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The name of the object in Amazon S3 for the asset.
     * </p>
     *
     * @param key <p>
     *            The name of the object in Amazon S3 for the asset.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the object in Amazon S3 for the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The name of the object in Amazon S3 for the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetSourceEntry withKey(String key) {
        this.key = key;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetSourceEntry == false)
            return false;
        AssetSourceEntry other = (AssetSourceEntry) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }
}
