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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class S3 implements Serializable {
    /**
     * The new value for the bucket property for this object.
     */
    private String bucket;

    /**
     * The new value for the enabled property for this object.
     */
    private Boolean enabled;

    /**
     * The new value for the prefix property for this object.
     */
    private String prefix;

    /**
     * Returns the value of the bucket property for this object.
     *
     * @return The value of the bucket property for this object.
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * Sets the value of bucket
     *
     * @param bucket The new value for the bucket property for this object.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * Sets the value of the bucket property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket The new value for the bucket property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3 withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * Returns the value of the enabled property for this object.
     *
     * @return The value of the enabled property for this object.
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Returns the value of the enabled property for this object.
     *
     * @return The value of the enabled property for this object.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of enabled
     *
     * @param enabled The new value for the enabled property for this object.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets the value of the enabled property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled The new value for the enabled property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3 withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns the value of the prefix property for this object.
     *
     * @return The value of the prefix property for this object.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of prefix
     *
     * @param prefix The new value for the prefix property for this object.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets the value of the prefix property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix The new value for the prefix property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3 withPrefix(String prefix) {
        this.prefix = prefix;
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
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3 == false)
            return false;
        S3 other = (S3) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }
}
