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
 * Describes a volume status.
 * </p>
 */
public class VolumeStatusDetails implements Serializable {
    /**
     * <p>
     * The name of the volume status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>io-enabled, io-performance
     */
    private String name;

    /**
     * <p>
     * The intended status of the volume status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>io-enabled, io-performance
     *
     * @return <p>
     *         The name of the volume status.
     *         </p>
     * @see VolumeStatusName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>io-enabled, io-performance
     *
     * @param name <p>
     *            The name of the volume status.
     *            </p>
     * @see VolumeStatusName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>io-enabled, io-performance
     *
     * @param name <p>
     *            The name of the volume status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeStatusName
     */
    public VolumeStatusDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>io-enabled, io-performance
     *
     * @param name <p>
     *            The name of the volume status.
     *            </p>
     * @see VolumeStatusName
     */
    public void setName(VolumeStatusName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The name of the volume status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>io-enabled, io-performance
     *
     * @param name <p>
     *            The name of the volume status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VolumeStatusName
     */
    public VolumeStatusDetails withName(VolumeStatusName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The intended status of the volume status.
     * </p>
     *
     * @return <p>
     *         The intended status of the volume status.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The intended status of the volume status.
     * </p>
     *
     * @param status <p>
     *            The intended status of the volume status.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The intended status of the volume status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The intended status of the volume status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VolumeStatusDetails withStatus(String status) {
        this.status = status;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeStatusDetails == false)
            return false;
        VolumeStatusDetails other = (VolumeStatusDetails) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
