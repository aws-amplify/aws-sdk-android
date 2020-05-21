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
 * Describes a customer-owned address pool.
 * </p>
 */
public class CoipPool implements Serializable {
    /**
     * <p>
     * The ID of the address pool.
     * </p>
     */
    private String poolId;

    /**
     * <p>
     * The address ranges of the address pool.
     * </p>
     */
    private java.util.List<String> poolCidrs;

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;

    /**
     * <p>
     * The tags.
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
    public CoipPool withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * <p>
     * The address ranges of the address pool.
     * </p>
     *
     * @return <p>
     *         The address ranges of the address pool.
     *         </p>
     */
    public java.util.List<String> getPoolCidrs() {
        return poolCidrs;
    }

    /**
     * <p>
     * The address ranges of the address pool.
     * </p>
     *
     * @param poolCidrs <p>
     *            The address ranges of the address pool.
     *            </p>
     */
    public void setPoolCidrs(java.util.Collection<String> poolCidrs) {
        if (poolCidrs == null) {
            this.poolCidrs = null;
            return;
        }

        this.poolCidrs = new java.util.ArrayList<String>(poolCidrs);
    }

    /**
     * <p>
     * The address ranges of the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param poolCidrs <p>
     *            The address ranges of the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipPool withPoolCidrs(String... poolCidrs) {
        if (getPoolCidrs() == null) {
            this.poolCidrs = new java.util.ArrayList<String>(poolCidrs.length);
        }
        for (String value : poolCidrs) {
            this.poolCidrs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The address ranges of the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param poolCidrs <p>
     *            The address ranges of the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipPool withPoolCidrs(java.util.Collection<String> poolCidrs) {
        setPoolCidrs(poolCidrs);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     *
     * @return <p>
     *         The ID of the local gateway route table.
     *         </p>
     */
    public String getLocalGatewayRouteTableId() {
        return localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     *
     * @param localGatewayRouteTableId <p>
     *            The ID of the local gateway route table.
     *            </p>
     */
    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayRouteTableId <p>
     *            The ID of the local gateway route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipPool withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     *
     * @return <p>
     *         The tags.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     *
     * @param tags <p>
     *            The tags.
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
     * The tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipPool withTags(Tag... tags) {
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
     * The tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CoipPool withTags(java.util.Collection<Tag> tags) {
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
        if (getPoolCidrs() != null)
            sb.append("PoolCidrs: " + getPoolCidrs() + ",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: " + getLocalGatewayRouteTableId() + ",");
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
        hashCode = prime * hashCode + ((getPoolCidrs() == null) ? 0 : getPoolCidrs().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId()
                        .hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoipPool == false)
            return false;
        CoipPool other = (CoipPool) obj;

        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getPoolCidrs() == null ^ this.getPoolCidrs() == null)
            return false;
        if (other.getPoolCidrs() != null
                && other.getPoolCidrs().equals(this.getPoolCidrs()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null
                ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null
                && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
