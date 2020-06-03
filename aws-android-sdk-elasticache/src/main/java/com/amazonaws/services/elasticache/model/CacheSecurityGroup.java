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
 * <code>AuthorizeCacheSecurityGroupIngress</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateCacheSecurityGroup</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RevokeCacheSecurityGroupIngress</code>
 * </p>
 * </li>
 * </ul>
 */
public class CacheSecurityGroup implements Serializable {
    /**
     * <p>
     * The AWS account ID of the cache security group owner.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     */
    private String cacheSecurityGroupName;

    /**
     * <p>
     * The description of the cache security group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache
     * security group.
     * </p>
     */
    private java.util.List<EC2SecurityGroup> eC2SecurityGroups;

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache security group.
     * </p>
     */
    private String aRN;

    /**
     * <p>
     * The AWS account ID of the cache security group owner.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the cache security group owner.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the cache security group owner.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account ID of the cache security group owner.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the cache security group owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account ID of the cache security group owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSecurityGroup withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     *
     * @return <p>
     *         The name of the cache security group.
     *         </p>
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     *
     * @param cacheSecurityGroupName <p>
     *            The name of the cache security group.
     *            </p>
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSecurityGroupName <p>
     *            The name of the cache security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSecurityGroup withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }

    /**
     * <p>
     * The description of the cache security group.
     * </p>
     *
     * @return <p>
     *         The description of the cache security group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the cache security group.
     * </p>
     *
     * @param description <p>
     *            The description of the cache security group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the cache security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the cache security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSecurityGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache
     * security group.
     * </p>
     *
     * @return <p>
     *         A list of Amazon EC2 security groups that are associated with
     *         this cache security group.
     *         </p>
     */
    public java.util.List<EC2SecurityGroup> getEC2SecurityGroups() {
        return eC2SecurityGroups;
    }

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache
     * security group.
     * </p>
     *
     * @param eC2SecurityGroups <p>
     *            A list of Amazon EC2 security groups that are associated with
     *            this cache security group.
     *            </p>
     */
    public void setEC2SecurityGroups(java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        if (eC2SecurityGroups == null) {
            this.eC2SecurityGroups = null;
            return;
        }

        this.eC2SecurityGroups = new java.util.ArrayList<EC2SecurityGroup>(eC2SecurityGroups);
    }

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache
     * security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroups <p>
     *            A list of Amazon EC2 security groups that are associated with
     *            this cache security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSecurityGroup withEC2SecurityGroups(EC2SecurityGroup... eC2SecurityGroups) {
        if (getEC2SecurityGroups() == null) {
            this.eC2SecurityGroups = new java.util.ArrayList<EC2SecurityGroup>(
                    eC2SecurityGroups.length);
        }
        for (EC2SecurityGroup value : eC2SecurityGroups) {
            this.eC2SecurityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon EC2 security groups that are associated with this cache
     * security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2SecurityGroups <p>
     *            A list of Amazon EC2 security groups that are associated with
     *            this cache security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSecurityGroup withEC2SecurityGroups(
            java.util.Collection<EC2SecurityGroup> eC2SecurityGroups) {
        setEC2SecurityGroups(eC2SecurityGroups);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache security group.
     * </p>
     *
     * @return <p>
     *         The ARN (Amazon Resource Name) of the cache security group.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache security group.
     * </p>
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) of the cache security group.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the cache security group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aRN <p>
     *            The ARN (Amazon Resource Name) of the cache security group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CacheSecurityGroup withARN(String aRN) {
        this.aRN = aRN;
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
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getCacheSecurityGroupName() != null)
            sb.append("CacheSecurityGroupName: " + getCacheSecurityGroupName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getEC2SecurityGroups() != null)
            sb.append("EC2SecurityGroups: " + getEC2SecurityGroups() + ",");
        if (getARN() != null)
            sb.append("ARN: " + getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getEC2SecurityGroups() == null) ? 0 : getEC2SecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheSecurityGroup == false)
            return false;
        CacheSecurityGroup other = (CacheSecurityGroup) obj;

        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null)
            return false;
        if (other.getCacheSecurityGroupName() != null
                && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEC2SecurityGroups() == null ^ this.getEC2SecurityGroups() == null)
            return false;
        if (other.getEC2SecurityGroups() != null
                && other.getEC2SecurityGroups().equals(this.getEC2SecurityGroups()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }
}
