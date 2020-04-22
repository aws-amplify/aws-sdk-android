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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

public class DescribeDefaultClusterParametersResult implements Serializable {
    /**
     * <p>
     * Describes the default cluster parameters for a parameter group family.
     * </p>
     */
    private DefaultClusterParameters defaultClusterParameters;

    /**
     * <p>
     * Describes the default cluster parameters for a parameter group family.
     * </p>
     *
     * @return <p>
     *         Describes the default cluster parameters for a parameter group
     *         family.
     *         </p>
     */
    public DefaultClusterParameters getDefaultClusterParameters() {
        return defaultClusterParameters;
    }

    /**
     * <p>
     * Describes the default cluster parameters for a parameter group family.
     * </p>
     *
     * @param defaultClusterParameters <p>
     *            Describes the default cluster parameters for a parameter group
     *            family.
     *            </p>
     */
    public void setDefaultClusterParameters(DefaultClusterParameters defaultClusterParameters) {
        this.defaultClusterParameters = defaultClusterParameters;
    }

    /**
     * <p>
     * Describes the default cluster parameters for a parameter group family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultClusterParameters <p>
     *            Describes the default cluster parameters for a parameter group
     *            family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDefaultClusterParametersResult withDefaultClusterParameters(
            DefaultClusterParameters defaultClusterParameters) {
        this.defaultClusterParameters = defaultClusterParameters;
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
        if (getDefaultClusterParameters() != null)
            sb.append("DefaultClusterParameters: " + getDefaultClusterParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDefaultClusterParameters() == null) ? 0 : getDefaultClusterParameters()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDefaultClusterParametersResult == false)
            return false;
        DescribeDefaultClusterParametersResult other = (DescribeDefaultClusterParametersResult) obj;

        if (other.getDefaultClusterParameters() == null
                ^ this.getDefaultClusterParameters() == null)
            return false;
        if (other.getDefaultClusterParameters() != null
                && other.getDefaultClusterParameters().equals(this.getDefaultClusterParameters()) == false)
            return false;
        return true;
    }
}
