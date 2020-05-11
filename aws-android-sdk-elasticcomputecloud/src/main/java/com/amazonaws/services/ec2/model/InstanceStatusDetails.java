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
 * Describes the instance status.
 * </p>
 */
public class InstanceStatusDetails implements Serializable {
    /**
     * <p>
     * The time when a status check failed. For an instance that was launched
     * and impaired, this is the time when the instance was launched.
     * </p>
     */
    private java.util.Date impairedSince;

    /**
     * <p>
     * The type of instance status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     */
    private String name;

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data, initializing
     */
    private String status;

    /**
     * <p>
     * The time when a status check failed. For an instance that was launched
     * and impaired, this is the time when the instance was launched.
     * </p>
     *
     * @return <p>
     *         The time when a status check failed. For an instance that was
     *         launched and impaired, this is the time when the instance was
     *         launched.
     *         </p>
     */
    public java.util.Date getImpairedSince() {
        return impairedSince;
    }

    /**
     * <p>
     * The time when a status check failed. For an instance that was launched
     * and impaired, this is the time when the instance was launched.
     * </p>
     *
     * @param impairedSince <p>
     *            The time when a status check failed. For an instance that was
     *            launched and impaired, this is the time when the instance was
     *            launched.
     *            </p>
     */
    public void setImpairedSince(java.util.Date impairedSince) {
        this.impairedSince = impairedSince;
    }

    /**
     * <p>
     * The time when a status check failed. For an instance that was launched
     * and impaired, this is the time when the instance was launched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param impairedSince <p>
     *            The time when a status check failed. For an instance that was
     *            launched and impaired, this is the time when the instance was
     *            launched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceStatusDetails withImpairedSince(java.util.Date impairedSince) {
        this.impairedSince = impairedSince;
        return this;
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @return <p>
     *         The type of instance status.
     *         </p>
     * @see StatusName
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @param name <p>
     *            The type of instance status.
     *            </p>
     * @see StatusName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @param name <p>
     *            The type of instance status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusName
     */
    public InstanceStatusDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @param name <p>
     *            The type of instance status.
     *            </p>
     * @see StatusName
     */
    public void setName(StatusName name) {
        this.name = name.toString();
    }

    /**
     * <p>
     * The type of instance status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @param name <p>
     *            The type of instance status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusName
     */
    public InstanceStatusDetails withName(StatusName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data, initializing
     *
     * @return <p>
     *         The status.
     *         </p>
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data, initializing
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data, initializing
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public InstanceStatusDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data, initializing
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data, initializing
     *
     * @param status <p>
     *            The status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public InstanceStatusDetails withStatus(StatusType status) {
        this.status = status.toString();
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
        if (getImpairedSince() != null)
            sb.append("ImpairedSince: " + getImpairedSince() + ",");
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

        hashCode = prime * hashCode
                + ((getImpairedSince() == null) ? 0 : getImpairedSince().hashCode());
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

        if (obj instanceof InstanceStatusDetails == false)
            return false;
        InstanceStatusDetails other = (InstanceStatusDetails) obj;

        if (other.getImpairedSince() == null ^ this.getImpairedSince() == null)
            return false;
        if (other.getImpairedSince() != null
                && other.getImpairedSince().equals(this.getImpairedSince()) == false)
            return false;
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
