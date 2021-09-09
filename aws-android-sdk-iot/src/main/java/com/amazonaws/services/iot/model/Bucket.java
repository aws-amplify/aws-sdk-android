/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * A count of documents that meets a specific aggregation criteria.
 * </p>
 */
public class Bucket implements Serializable {
    /**
     * <p>
     * The value counted for the particular bucket.
     * </p>
     */
    private String keyValue;

    /**
     * <p>
     * The number of documents that have the value counted for the particular
     * bucket.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The value counted for the particular bucket.
     * </p>
     *
     * @return <p>
     *         The value counted for the particular bucket.
     *         </p>
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * <p>
     * The value counted for the particular bucket.
     * </p>
     *
     * @param keyValue <p>
     *            The value counted for the particular bucket.
     *            </p>
     */
    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    /**
     * <p>
     * The value counted for the particular bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keyValue <p>
     *            The value counted for the particular bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bucket withKeyValue(String keyValue) {
        this.keyValue = keyValue;
        return this;
    }

    /**
     * <p>
     * The number of documents that have the value counted for the particular
     * bucket.
     * </p>
     *
     * @return <p>
     *         The number of documents that have the value counted for the
     *         particular bucket.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of documents that have the value counted for the particular
     * bucket.
     * </p>
     *
     * @param count <p>
     *            The number of documents that have the value counted for the
     *            particular bucket.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of documents that have the value counted for the particular
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of documents that have the value counted for the
     *            particular bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Bucket withCount(Integer count) {
        this.count = count;
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
        if (getKeyValue() != null)
            sb.append("keyValue: " + getKeyValue() + ",");
        if (getCount() != null)
            sb.append("count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bucket == false)
            return false;
        Bucket other = (Bucket) obj;

        if (other.getKeyValue() == null ^ this.getKeyValue() == null)
            return false;
        if (other.getKeyValue() != null && other.getKeyValue().equals(this.getKeyValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }
}
