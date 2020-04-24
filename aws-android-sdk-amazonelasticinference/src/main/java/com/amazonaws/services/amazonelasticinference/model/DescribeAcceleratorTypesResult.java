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

package com.amazonaws.services.amazonelasticinference.model;

import java.io.Serializable;

public class DescribeAcceleratorTypesResult implements Serializable {
    /**
     * <p>
     * The available accelerator types.
     * </p>
     */
    private java.util.List<AcceleratorType> acceleratorTypes;

    /**
     * <p>
     * The available accelerator types.
     * </p>
     *
     * @return <p>
     *         The available accelerator types.
     *         </p>
     */
    public java.util.List<AcceleratorType> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * The available accelerator types.
     * </p>
     *
     * @param acceleratorTypes <p>
     *            The available accelerator types.
     *            </p>
     */
    public void setAcceleratorTypes(java.util.Collection<AcceleratorType> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new java.util.ArrayList<AcceleratorType>(acceleratorTypes);
    }

    /**
     * <p>
     * The available accelerator types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            The available accelerator types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorTypesResult withAcceleratorTypes(AcceleratorType... acceleratorTypes) {
        if (getAcceleratorTypes() == null) {
            this.acceleratorTypes = new java.util.ArrayList<AcceleratorType>(
                    acceleratorTypes.length);
        }
        for (AcceleratorType value : acceleratorTypes) {
            this.acceleratorTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The available accelerator types.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            The available accelerator types.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorTypesResult withAcceleratorTypes(
            java.util.Collection<AcceleratorType> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
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
        if (getAcceleratorTypes() != null)
            sb.append("acceleratorTypes: " + getAcceleratorTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAcceleratorTypesResult == false)
            return false;
        DescribeAcceleratorTypesResult other = (DescribeAcceleratorTypesResult) obj;

        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null
                && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        return true;
    }
}
