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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the Inference accelerators for the instance type.
 * </p>
 */
public class InferenceAcceleratorInfo implements Serializable {
    /**
     * <p>
     * Describes the Inference accelerators for the instance type.
     * </p>
     */
    private java.util.List<InferenceDeviceInfo> accelerators;

    /**
     * <p>
     * Describes the Inference accelerators for the instance type.
     * </p>
     *
     * @return <p>
     *         Describes the Inference accelerators for the instance type.
     *         </p>
     */
    public java.util.List<InferenceDeviceInfo> getAccelerators() {
        return accelerators;
    }

    /**
     * <p>
     * Describes the Inference accelerators for the instance type.
     * </p>
     *
     * @param accelerators <p>
     *            Describes the Inference accelerators for the instance type.
     *            </p>
     */
    public void setAccelerators(java.util.Collection<InferenceDeviceInfo> accelerators) {
        if (accelerators == null) {
            this.accelerators = null;
            return;
        }

        this.accelerators = new java.util.ArrayList<InferenceDeviceInfo>(accelerators);
    }

    /**
     * <p>
     * Describes the Inference accelerators for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accelerators <p>
     *            Describes the Inference accelerators for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceAcceleratorInfo withAccelerators(InferenceDeviceInfo... accelerators) {
        if (getAccelerators() == null) {
            this.accelerators = new java.util.ArrayList<InferenceDeviceInfo>(accelerators.length);
        }
        for (InferenceDeviceInfo value : accelerators) {
            this.accelerators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the Inference accelerators for the instance type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accelerators <p>
     *            Describes the Inference accelerators for the instance type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceAcceleratorInfo withAccelerators(
            java.util.Collection<InferenceDeviceInfo> accelerators) {
        setAccelerators(accelerators);
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
        if (getAccelerators() != null)
            sb.append("Accelerators: " + getAccelerators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccelerators() == null) ? 0 : getAccelerators().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceAcceleratorInfo == false)
            return false;
        InferenceAcceleratorInfo other = (InferenceAcceleratorInfo) obj;

        if (other.getAccelerators() == null ^ this.getAccelerators() == null)
            return false;
        if (other.getAccelerators() != null
                && other.getAccelerators().equals(this.getAccelerators()) == false)
            return false;
        return true;
    }
}
