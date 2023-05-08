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

public class DescribeFlywheelResult implements Serializable {
    /**
     * <p>
     * The flywheel properties.
     * </p>
     */
    private FlywheelProperties flywheelProperties;

    /**
     * <p>
     * The flywheel properties.
     * </p>
     *
     * @return <p>
     *         The flywheel properties.
     *         </p>
     */
    public FlywheelProperties getFlywheelProperties() {
        return flywheelProperties;
    }

    /**
     * <p>
     * The flywheel properties.
     * </p>
     *
     * @param flywheelProperties <p>
     *            The flywheel properties.
     *            </p>
     */
    public void setFlywheelProperties(FlywheelProperties flywheelProperties) {
        this.flywheelProperties = flywheelProperties;
    }

    /**
     * <p>
     * The flywheel properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flywheelProperties <p>
     *            The flywheel properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlywheelResult withFlywheelProperties(FlywheelProperties flywheelProperties) {
        this.flywheelProperties = flywheelProperties;
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
        if (getFlywheelProperties() != null)
            sb.append("FlywheelProperties: " + getFlywheelProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlywheelProperties() == null) ? 0 : getFlywheelProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlywheelResult == false)
            return false;
        DescribeFlywheelResult other = (DescribeFlywheelResult) obj;

        if (other.getFlywheelProperties() == null ^ this.getFlywheelProperties() == null)
            return false;
        if (other.getFlywheelProperties() != null
                && other.getFlywheelProperties().equals(this.getFlywheelProperties()) == false)
            return false;
        return true;
    }
}
