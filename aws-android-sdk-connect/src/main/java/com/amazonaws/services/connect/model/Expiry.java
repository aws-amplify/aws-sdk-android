/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * An object to specify the expiration of a routing step.
 * </p>
 */
public class Expiry implements Serializable {
    /**
     * <p>
     * The number of seconds to wait before expiring the routing step.
     * </p>
     */
    private Integer durationInSeconds;

    /**
     * <p>
     * The timestamp indicating when the routing step expires.
     * </p>
     */
    private java.util.Date expiryTimestamp;

    /**
     * <p>
     * The number of seconds to wait before expiring the routing step.
     * </p>
     *
     * @return <p>
     *         The number of seconds to wait before expiring the routing step.
     *         </p>
     */
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before expiring the routing step.
     * </p>
     *
     * @param durationInSeconds <p>
     *            The number of seconds to wait before expiring the routing
     *            step.
     *            </p>
     */
    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    /**
     * <p>
     * The number of seconds to wait before expiring the routing step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param durationInSeconds <p>
     *            The number of seconds to wait before expiring the routing
     *            step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expiry withDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
        return this;
    }

    /**
     * <p>
     * The timestamp indicating when the routing step expires.
     * </p>
     *
     * @return <p>
     *         The timestamp indicating when the routing step expires.
     *         </p>
     */
    public java.util.Date getExpiryTimestamp() {
        return expiryTimestamp;
    }

    /**
     * <p>
     * The timestamp indicating when the routing step expires.
     * </p>
     *
     * @param expiryTimestamp <p>
     *            The timestamp indicating when the routing step expires.
     *            </p>
     */
    public void setExpiryTimestamp(java.util.Date expiryTimestamp) {
        this.expiryTimestamp = expiryTimestamp;
    }

    /**
     * <p>
     * The timestamp indicating when the routing step expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiryTimestamp <p>
     *            The timestamp indicating when the routing step expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expiry withExpiryTimestamp(java.util.Date expiryTimestamp) {
        this.expiryTimestamp = expiryTimestamp;
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
        if (getDurationInSeconds() != null)
            sb.append("DurationInSeconds: " + getDurationInSeconds() + ",");
        if (getExpiryTimestamp() != null)
            sb.append("ExpiryTimestamp: " + getExpiryTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDurationInSeconds() == null) ? 0 : getDurationInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getExpiryTimestamp() == null) ? 0 : getExpiryTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Expiry == false)
            return false;
        Expiry other = (Expiry) obj;

        if (other.getDurationInSeconds() == null ^ this.getDurationInSeconds() == null)
            return false;
        if (other.getDurationInSeconds() != null
                && other.getDurationInSeconds().equals(this.getDurationInSeconds()) == false)
            return false;
        if (other.getExpiryTimestamp() == null ^ this.getExpiryTimestamp() == null)
            return false;
        if (other.getExpiryTimestamp() != null
                && other.getExpiryTimestamp().equals(this.getExpiryTimestamp()) == false)
            return false;
        return true;
    }
}
