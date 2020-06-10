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
 * Describes an IPv4 address pool.
 * </p>
 */
public class PublicIpv4Pool implements Serializable {
    /**
     * <p>
     * The ID of the address pool.
     * </p>
     */
    private String poolId;

    /**
     * <p>
     * A description of the address pool.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The address ranges.
     * </p>
     */
    private java.util.List<PublicIpv4PoolRange> poolAddressRanges;

    /**
     * <p>
     * The total number of addresses.
     * </p>
     */
    private Integer totalAddressCount;

    /**
     * <p>
     * The total number of available addresses.
     * </p>
     */
    private Integer totalAvailableAddressCount;

    /**
     * <p>
     * The name of the location from which the address pool is advertised. A
     * network border group is a unique set of Availability Zones or Local Zones
     * from where AWS advertises public IP addresses.
     * </p>
     */
    private String networkBorderGroup;

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
    public PublicIpv4Pool withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * <p>
     * A description of the address pool.
     * </p>
     *
     * @return <p>
     *         A description of the address pool.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the address pool.
     * </p>
     *
     * @param description <p>
     *            A description of the address pool.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A description of the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicIpv4Pool withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The address ranges.
     * </p>
     *
     * @return <p>
     *         The address ranges.
     *         </p>
     */
    public java.util.List<PublicIpv4PoolRange> getPoolAddressRanges() {
        return poolAddressRanges;
    }

    /**
     * <p>
     * The address ranges.
     * </p>
     *
     * @param poolAddressRanges <p>
     *            The address ranges.
     *            </p>
     */
    public void setPoolAddressRanges(java.util.Collection<PublicIpv4PoolRange> poolAddressRanges) {
        if (poolAddressRanges == null) {
            this.poolAddressRanges = null;
            return;
        }

        this.poolAddressRanges = new java.util.ArrayList<PublicIpv4PoolRange>(poolAddressRanges);
    }

    /**
     * <p>
     * The address ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param poolAddressRanges <p>
     *            The address ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicIpv4Pool withPoolAddressRanges(PublicIpv4PoolRange... poolAddressRanges) {
        if (getPoolAddressRanges() == null) {
            this.poolAddressRanges = new java.util.ArrayList<PublicIpv4PoolRange>(
                    poolAddressRanges.length);
        }
        for (PublicIpv4PoolRange value : poolAddressRanges) {
            this.poolAddressRanges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The address ranges.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param poolAddressRanges <p>
     *            The address ranges.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicIpv4Pool withPoolAddressRanges(
            java.util.Collection<PublicIpv4PoolRange> poolAddressRanges) {
        setPoolAddressRanges(poolAddressRanges);
        return this;
    }

    /**
     * <p>
     * The total number of addresses.
     * </p>
     *
     * @return <p>
     *         The total number of addresses.
     *         </p>
     */
    public Integer getTotalAddressCount() {
        return totalAddressCount;
    }

    /**
     * <p>
     * The total number of addresses.
     * </p>
     *
     * @param totalAddressCount <p>
     *            The total number of addresses.
     *            </p>
     */
    public void setTotalAddressCount(Integer totalAddressCount) {
        this.totalAddressCount = totalAddressCount;
    }

    /**
     * <p>
     * The total number of addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalAddressCount <p>
     *            The total number of addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicIpv4Pool withTotalAddressCount(Integer totalAddressCount) {
        this.totalAddressCount = totalAddressCount;
        return this;
    }

    /**
     * <p>
     * The total number of available addresses.
     * </p>
     *
     * @return <p>
     *         The total number of available addresses.
     *         </p>
     */
    public Integer getTotalAvailableAddressCount() {
        return totalAvailableAddressCount;
    }

    /**
     * <p>
     * The total number of available addresses.
     * </p>
     *
     * @param totalAvailableAddressCount <p>
     *            The total number of available addresses.
     *            </p>
     */
    public void setTotalAvailableAddressCount(Integer totalAvailableAddressCount) {
        this.totalAvailableAddressCount = totalAvailableAddressCount;
    }

    /**
     * <p>
     * The total number of available addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalAvailableAddressCount <p>
     *            The total number of available addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicIpv4Pool withTotalAvailableAddressCount(Integer totalAvailableAddressCount) {
        this.totalAvailableAddressCount = totalAvailableAddressCount;
        return this;
    }

    /**
     * <p>
     * The name of the location from which the address pool is advertised. A
     * network border group is a unique set of Availability Zones or Local Zones
     * from where AWS advertises public IP addresses.
     * </p>
     *
     * @return <p>
     *         The name of the location from which the address pool is
     *         advertised. A network border group is a unique set of
     *         Availability Zones or Local Zones from where AWS advertises
     *         public IP addresses.
     *         </p>
     */
    public String getNetworkBorderGroup() {
        return networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the address pool is advertised. A
     * network border group is a unique set of Availability Zones or Local Zones
     * from where AWS advertises public IP addresses.
     * </p>
     *
     * @param networkBorderGroup <p>
     *            The name of the location from which the address pool is
     *            advertised. A network border group is a unique set of
     *            Availability Zones or Local Zones from where AWS advertises
     *            public IP addresses.
     *            </p>
     */
    public void setNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
    }

    /**
     * <p>
     * The name of the location from which the address pool is advertised. A
     * network border group is a unique set of Availability Zones or Local Zones
     * from where AWS advertises public IP addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param networkBorderGroup <p>
     *            The name of the location from which the address pool is
     *            advertised. A network border group is a unique set of
     *            Availability Zones or Local Zones from where AWS advertises
     *            public IP addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PublicIpv4Pool withNetworkBorderGroup(String networkBorderGroup) {
        this.networkBorderGroup = networkBorderGroup;
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
    public PublicIpv4Pool withTags(Tag... tags) {
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
    public PublicIpv4Pool withTags(java.util.Collection<Tag> tags) {
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
        if (getPoolAddressRanges() != null)
            sb.append("PoolAddressRanges: " + getPoolAddressRanges() + ",");
        if (getTotalAddressCount() != null)
            sb.append("TotalAddressCount: " + getTotalAddressCount() + ",");
        if (getTotalAvailableAddressCount() != null)
            sb.append("TotalAvailableAddressCount: " + getTotalAvailableAddressCount() + ",");
        if (getNetworkBorderGroup() != null)
            sb.append("NetworkBorderGroup: " + getNetworkBorderGroup() + ",");
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
                + ((getPoolAddressRanges() == null) ? 0 : getPoolAddressRanges().hashCode());
        hashCode = prime * hashCode
                + ((getTotalAddressCount() == null) ? 0 : getTotalAddressCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalAvailableAddressCount() == null) ? 0 : getTotalAvailableAddressCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNetworkBorderGroup() == null) ? 0 : getNetworkBorderGroup().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicIpv4Pool == false)
            return false;
        PublicIpv4Pool other = (PublicIpv4Pool) obj;

        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPoolAddressRanges() == null ^ this.getPoolAddressRanges() == null)
            return false;
        if (other.getPoolAddressRanges() != null
                && other.getPoolAddressRanges().equals(this.getPoolAddressRanges()) == false)
            return false;
        if (other.getTotalAddressCount() == null ^ this.getTotalAddressCount() == null)
            return false;
        if (other.getTotalAddressCount() != null
                && other.getTotalAddressCount().equals(this.getTotalAddressCount()) == false)
            return false;
        if (other.getTotalAvailableAddressCount() == null
                ^ this.getTotalAvailableAddressCount() == null)
            return false;
        if (other.getTotalAvailableAddressCount() != null
                && other.getTotalAvailableAddressCount().equals(
                        this.getTotalAvailableAddressCount()) == false)
            return false;
        if (other.getNetworkBorderGroup() == null ^ this.getNetworkBorderGroup() == null)
            return false;
        if (other.getNetworkBorderGroup() != null
                && other.getNetworkBorderGroup().equals(this.getNetworkBorderGroup()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
