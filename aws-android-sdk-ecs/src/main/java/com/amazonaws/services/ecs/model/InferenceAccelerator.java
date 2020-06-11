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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * Details on a Elastic Inference accelerator. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-eia.html"
 * >Working with Amazon Elastic Inference on Amazon ECS</a> in the <i>Amazon
 * Elastic Container Service Developer Guide</i>.
 * </p>
 */
public class InferenceAccelerator implements Serializable {
    /**
     * <p>
     * The Elastic Inference accelerator device name. The
     * <code>deviceName</code> must also be referenced in a container definition
     * as a <a>ResourceRequirement</a>.
     * </p>
     */
    private String deviceName;

    /**
     * <p>
     * The Elastic Inference accelerator type to use.
     * </p>
     */
    private String deviceType;

    /**
     * <p>
     * The Elastic Inference accelerator device name. The
     * <code>deviceName</code> must also be referenced in a container definition
     * as a <a>ResourceRequirement</a>.
     * </p>
     *
     * @return <p>
     *         The Elastic Inference accelerator device name. The
     *         <code>deviceName</code> must also be referenced in a container
     *         definition as a <a>ResourceRequirement</a>.
     *         </p>
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * <p>
     * The Elastic Inference accelerator device name. The
     * <code>deviceName</code> must also be referenced in a container definition
     * as a <a>ResourceRequirement</a>.
     * </p>
     *
     * @param deviceName <p>
     *            The Elastic Inference accelerator device name. The
     *            <code>deviceName</code> must also be referenced in a container
     *            definition as a <a>ResourceRequirement</a>.
     *            </p>
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The Elastic Inference accelerator device name. The
     * <code>deviceName</code> must also be referenced in a container definition
     * as a <a>ResourceRequirement</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceName <p>
     *            The Elastic Inference accelerator device name. The
     *            <code>deviceName</code> must also be referenced in a container
     *            definition as a <a>ResourceRequirement</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceAccelerator withDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * <p>
     * The Elastic Inference accelerator type to use.
     * </p>
     *
     * @return <p>
     *         The Elastic Inference accelerator type to use.
     *         </p>
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * <p>
     * The Elastic Inference accelerator type to use.
     * </p>
     *
     * @param deviceType <p>
     *            The Elastic Inference accelerator type to use.
     *            </p>
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * <p>
     * The Elastic Inference accelerator type to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceType <p>
     *            The Elastic Inference accelerator type to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InferenceAccelerator withDeviceType(String deviceType) {
        this.deviceType = deviceType;
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
        if (getDeviceName() != null)
            sb.append("deviceName: " + getDeviceName() + ",");
        if (getDeviceType() != null)
            sb.append("deviceType: " + getDeviceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceAccelerator == false)
            return false;
        InferenceAccelerator other = (InferenceAccelerator) obj;

        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDeviceType() == null ^ this.getDeviceType() == null)
            return false;
        if (other.getDeviceType() != null
                && other.getDeviceType().equals(this.getDeviceType()) == false)
            return false;
        return true;
    }
}
