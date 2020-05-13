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
 * Provides information about sensitive data that was detected by managed data
 * identifiers and produced a finding.
 * </p>
 */
public class DefaultDetection implements Serializable {
    /**
     * <p>
     * The total number of occurrences of the type of data that was detected.
     * </p>
     */
    private Long count;

    /**
     * <p>
     * The type of data that was detected. For example, AWS_CREDENTIALS,
     * PHONE_NUMBER, or ADDRESS.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The total number of occurrences of the type of data that was detected.
     * </p>
     *
     * @return <p>
     *         The total number of occurrences of the type of data that was
     *         detected.
     *         </p>
     */
    public Long getCount() {
        return count;
    }

    /**
     * <p>
     * The total number of occurrences of the type of data that was detected.
     * </p>
     *
     * @param count <p>
     *            The total number of occurrences of the type of data that was
     *            detected.
     *            </p>
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of the type of data that was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The total number of occurrences of the type of data that was
     *            detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultDetection withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The type of data that was detected. For example, AWS_CREDENTIALS,
     * PHONE_NUMBER, or ADDRESS.
     * </p>
     *
     * @return <p>
     *         The type of data that was detected. For example, AWS_CREDENTIALS,
     *         PHONE_NUMBER, or ADDRESS.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of data that was detected. For example, AWS_CREDENTIALS,
     * PHONE_NUMBER, or ADDRESS.
     * </p>
     *
     * @param type <p>
     *            The type of data that was detected. For example,
     *            AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data that was detected. For example, AWS_CREDENTIALS,
     * PHONE_NUMBER, or ADDRESS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of data that was detected. For example,
     *            AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DefaultDetection withType(String type) {
        this.type = type;
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
        if (getCount() != null)
            sb.append("count: " + getCount() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultDetection == false)
            return false;
        DefaultDetection other = (DefaultDetection) obj;

        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
