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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of one of the following operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateCacheSubnetGroup</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ModifyCacheSubnetGroup</code>
 * </p>
 * </li>
 * </ul>
 */
public class CacheSubnetGroup implements Serializable {
    /**
     * <p>
     * The name of the cache subnet group.
     * </p>
     */
    private String cacheSubnetGroupName;

    /**
     * <p>
     * The description of the cache subnet group.
     * </p>
     */
    private String cacheSubnetGroupDescription;

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet
     * group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     */
    private java.util.List<Subnet> subnets;

    /**
     * <p>
     * The name of the cache subnet group.
     * </p>
     *
     * @return <p>
     *         The name of the cache subnet group.
     *         </p>
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group.
     * </p>
     *
     * @param cacheSubnetGroupName <p>
     *            The name of the cache subnet group.
     *            </p>
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * The name of the cache subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroupName <p>
     *            The name of the cache subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSubnetGroup withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The description of the cache subnet group.
     * </p>
     *
     * @return <p>
     *         The description of the cache subnet group.
     *         </p>
     */
    public String getCacheSubnetGroupDescription() {
        return cacheSubnetGroupDescription;
    }

    /**
     * <p>
     * The description of the cache subnet group.
     * </p>
     *
     * @param cacheSubnetGroupDescription <p>
     *            The description of the cache subnet group.
     *            </p>
     */
    public void setCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
    }

    /**
     * <p>
     * The description of the cache subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroupDescription <p>
     *            The description of the cache subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSubnetGroup withCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
        return this;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet
     * group.
     * </p>
     *
     * @return <p>
     *         The Amazon Virtual Private Cloud identifier (VPC ID) of the cache
     *         subnet group.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet
     * group.
     * </p>
     *
     * @param vpcId <p>
     *            The Amazon Virtual Private Cloud identifier (VPC ID) of the
     *            cache subnet group.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The Amazon Virtual Private Cloud identifier (VPC ID) of the cache subnet
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The Amazon Virtual Private Cloud identifier (VPC ID) of the
     *            cache subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSubnetGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     *
     * @return <p>
     *         A list of subnets associated with the cache subnet group.
     *         </p>
     */
    public java.util.List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     *
     * @param subnets <p>
     *            A list of subnets associated with the cache subnet group.
     *            </p>
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        this.subnets = new java.util.ArrayList<Subnet>(subnets);
    }

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            A list of subnets associated with the cache subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSubnetGroup withSubnets(Subnet... subnets) {
        if (getSubnets() == null) {
            this.subnets = new java.util.ArrayList<Subnet>(subnets.length);
        }
        for (Subnet value : subnets) {
            this.subnets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnets associated with the cache subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnets <p>
     *            A list of subnets associated with the cache subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSubnetGroup withSubnets(java.util.Collection<Subnet> subnets) {
        setSubnets(subnets);
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
        if (getCacheSubnetGroupName() != null)
            sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getCacheSubnetGroupDescription() != null)
            sb.append("CacheSubnetGroupDescription: " + getCacheSubnetGroupDescription() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnets() != null)
            sb.append("Subnets: " + getSubnets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheSubnetGroupDescription() == null) ? 0
                        : getCacheSubnetGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheSubnetGroup == false)
            return false;
        CacheSubnetGroup other = (CacheSubnetGroup) obj;

        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null)
            return false;
        if (other.getCacheSubnetGroupName() != null
                && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false)
            return false;
        if (other.getCacheSubnetGroupDescription() == null
                ^ this.getCacheSubnetGroupDescription() == null)
            return false;
        if (other.getCacheSubnetGroupDescription() != null
                && other.getCacheSubnetGroupDescription().equals(
                        this.getCacheSubnetGroupDescription()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnets() == null ^ this.getSubnets() == null)
            return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false)
            return false;
        return true;
    }
}
