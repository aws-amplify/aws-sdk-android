/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DescribeFlywheelIterationResult implements Serializable {
    /**
     * <p>
     * The configuration properties of a flywheel iteration.
     * </p>
     */
    private FlywheelIterationProperties flywheelIterationProperties;

    /**
     * <p>
     * The configuration properties of a flywheel iteration.
     * </p>
     *
     * @return <p>
     *         The configuration properties of a flywheel iteration.
     *         </p>
     */
    public FlywheelIterationProperties getFlywheelIterationProperties() {
        return flywheelIterationProperties;
    }

    /**
     * <p>
     * The configuration properties of a flywheel iteration.
     * </p>
     *
     * @param flywheelIterationProperties <p>
     *            The configuration properties of a flywheel iteration.
     *            </p>
     */
    public void setFlywheelIterationProperties(
            FlywheelIterationProperties flywheelIterationProperties) {
        this.flywheelIterationProperties = flywheelIterationProperties;
    }

    /**
     * <p>
     * The configuration properties of a flywheel iteration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flywheelIterationProperties <p>
     *            The configuration properties of a flywheel iteration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlywheelIterationResult withFlywheelIterationProperties(
            FlywheelIterationProperties flywheelIterationProperties) {
        this.flywheelIterationProperties = flywheelIterationProperties;
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
        if (getFlywheelIterationProperties() != null)
            sb.append("FlywheelIterationProperties: " + getFlywheelIterationProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFlywheelIterationProperties() == null) ? 0
                        : getFlywheelIterationProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlywheelIterationResult == false)
            return false;
        DescribeFlywheelIterationResult other = (DescribeFlywheelIterationResult) obj;

        if (other.getFlywheelIterationProperties() == null
                ^ this.getFlywheelIterationProperties() == null)
            return false;
        if (other.getFlywheelIterationProperties() != null
                && other.getFlywheelIterationProperties().equals(
                        this.getFlywheelIterationProperties()) == false)
            return false;
        return true;
    }
}
