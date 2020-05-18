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
 * Describes an IPv6 address pool.
 * </p>
 */
public class Ipv6Pool implements Serializable {
    /**
     * <p>
     * The ID of the address pool.
     * </p>
     */
    private String poolId;

    /**
     * <p>
     * The description for the address pool.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     */
    private java.util.List<PoolCidrBlock> poolCidrBlocks;

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     *
     * @return <p>
     *         The ID of the address pool.
     *         </p>
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     *
     * @param poolId <p>
     *            The ID of the address pool.
     *            </p>
     */
    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param poolId <p>
     *            The ID of the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6Pool withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * <p>
     * The description for the address pool.
     * </p>
     *
     * @return <p>
     *         The description for the address pool.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the address pool.
     * </p>
     *
     * @param description <p>
     *            The description for the address pool.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6Pool withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     *
     * @return <p>
     *         The CIDR blocks for the address pool.
     *         </p>
     */
    public java.util.List<PoolCidrBlock> getPoolCidrBlocks() {
        return poolCidrBlocks;
    }

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     *
     * @param poolCidrBlocks <p>
     *            The CIDR blocks for the address pool.
     *            </p>
     */
    public void setPoolCidrBlocks(java.util.Collection<PoolCidrBlock> poolCidrBlocks) {
        if (poolCidrBlocks == null) {
            this.poolCidrBlocks = null;
            return;
        }

        this.poolCidrBlocks = new java.util.ArrayList<PoolCidrBlock>(poolCidrBlocks);
    }

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param poolCidrBlocks <p>
     *            The CIDR blocks for the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6Pool withPoolCidrBlocks(PoolCidrBlock... poolCidrBlocks) {
        if (getPoolCidrBlocks() == null) {
            this.poolCidrBlocks = new java.util.ArrayList<PoolCidrBlock>(poolCidrBlocks.length);
        }
        for (PoolCidrBlock value : poolCidrBlocks) {
            this.poolCidrBlocks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The CIDR blocks for the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param poolCidrBlocks <p>
     *            The CIDR blocks for the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6Pool withPoolCidrBlocks(java.util.Collection<PoolCidrBlock> poolCidrBlocks) {
        setPoolCidrBlocks(poolCidrBlocks);
        return this;
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     *
     * @return <p>
     *         Any tags for the address pool.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     *
     * @param tags <p>
     *            Any tags for the address pool.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags for the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6Pool withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags for the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags for the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ipv6Pool withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPoolId() != null)
            sb.append("PoolId: " + getPoolId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPoolCidrBlocks() != null)
            sb.append("PoolCidrBlocks: " + getPoolCidrBlocks() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPoolCidrBlocks() == null) ? 0 : getPoolCidrBlocks().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ipv6Pool == false)
            return false;
        Ipv6Pool other = (Ipv6Pool) obj;

        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPoolCidrBlocks() == null ^ this.getPoolCidrBlocks() == null)
            return false;
        if (other.getPoolCidrBlocks() != null
                && other.getPoolCidrBlocks().equals(this.getPoolCidrBlocks()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
