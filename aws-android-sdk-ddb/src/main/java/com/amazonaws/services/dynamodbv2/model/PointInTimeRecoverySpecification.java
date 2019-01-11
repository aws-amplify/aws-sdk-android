/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the settings used to enable point in time recovery.
 * </p>
 */
public class PointInTimeRecoverySpecification implements Serializable {
    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled
     * (false) on the table.
     * </p>
     */
    private Boolean pointInTimeRecoveryEnabled;

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @return <p>
     *         Indicates whether point in time recovery is enabled (true) or
     *         disabled (false) on the table.
     *         </p>
     */
    public Boolean isPointInTimeRecoveryEnabled() {
        return pointInTimeRecoveryEnabled;
    }

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @return <p>
     *         Indicates whether point in time recovery is enabled (true) or
     *         disabled (false) on the table.
     *         </p>
     */
    public Boolean getPointInTimeRecoveryEnabled() {
        return pointInTimeRecoveryEnabled;
    }

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled
     * (false) on the table.
     * </p>
     *
     * @param pointInTimeRecoveryEnabled <p>
     *            Indicates whether point in time recovery is enabled (true) or
     *            disabled (false) on the table.
     *            </p>
     */
    public void setPointInTimeRecoveryEnabled(Boolean pointInTimeRecoveryEnabled) {
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
    }

    /**
     * <p>
     * Indicates whether point in time recovery is enabled (true) or disabled
     * (false) on the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pointInTimeRecoveryEnabled <p>
     *            Indicates whether point in time recovery is enabled (true) or
     *            disabled (false) on the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PointInTimeRecoverySpecification withPointInTimeRecoveryEnabled(
            Boolean pointInTimeRecoveryEnabled) {
        this.pointInTimeRecoveryEnabled = pointInTimeRecoveryEnabled;
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
        if (getPointInTimeRecoveryEnabled() != null)
            sb.append("PointInTimeRecoveryEnabled: " + getPointInTimeRecoveryEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPointInTimeRecoveryEnabled() == null) ? 0 : getPointInTimeRecoveryEnabled()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PointInTimeRecoverySpecification == false)
            return false;
        PointInTimeRecoverySpecification other = (PointInTimeRecoverySpecification) obj;

        if (other.getPointInTimeRecoveryEnabled() == null
                ^ this.getPointInTimeRecoveryEnabled() == null)
            return false;
        if (other.getPointInTimeRecoveryEnabled() != null
                && other.getPointInTimeRecoveryEnabled().equals(
                        this.getPointInTimeRecoveryEnabled()) == false)
            return false;
        return true;
    }
}
