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
 * Describes an instance running on a Dedicated Host.
 * </p>
 */
public class HostInstance implements Serializable {
    /**
     * <p>
     * The ID of instance that is running on the Dedicated Host.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The instance type (for example, <code>m3.medium</code>) of the running
     * instance.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The ID of the AWS account that owns the instance.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The ID of instance that is running on the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The ID of instance that is running on the Dedicated Host.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of instance that is running on the Dedicated Host.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of instance that is running on the Dedicated Host.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of instance that is running on the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of instance that is running on the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The instance type (for example, <code>m3.medium</code>) of the running
     * instance.
     * </p>
     *
     * @return <p>
     *         The instance type (for example, <code>m3.medium</code>) of the
     *         running instance.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type (for example, <code>m3.medium</code>) of the running
     * instance.
     * </p>
     *
     * @param instanceType <p>
     *            The instance type (for example, <code>m3.medium</code>) of the
     *            running instance.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type (for example, <code>m3.medium</code>) of the running
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The instance type (for example, <code>m3.medium</code>) of the
     *            running instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostInstance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the instance.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the instance.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the instance.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostInstance withOwnerId(String ownerId) {
        this.ownerId = ownerId;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostInstance == false)
            return false;
        HostInstance other = (HostInstance) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }
}
