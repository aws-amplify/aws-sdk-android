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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new cache subnet group.
 * </p>
 * <p>
 * Use this parameter only when you are creating a cluster in an Amazon Virtual
 * Private Cloud (Amazon VPC).
 * </p>
 */
public class CreateCacheSubnetGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A name for the cache subnet group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or
     * hyphens.
     * </p>
     * <p>
     * Example: <code>mysubnetgroup</code>
     * </p>
     */
    private String cacheSubnetGroupName;

    /**
     * <p>
     * A description for the cache subnet group.
     * </p>
     */
    private String cacheSubnetGroupDescription;

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * A name for the cache subnet group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or
     * hyphens.
     * </p>
     * <p>
     * Example: <code>mysubnetgroup</code>
     * </p>
     *
     * @return <p>
     *         A name for the cache subnet group. This value is stored as a
     *         lowercase string.
     *         </p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric
     *         characters or hyphens.
     *         </p>
     *         <p>
     *         Example: <code>mysubnetgroup</code>
     *         </p>
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }

    /**
     * <p>
     * A name for the cache subnet group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or
     * hyphens.
     * </p>
     * <p>
     * Example: <code>mysubnetgroup</code>
     * </p>
     *
     * @param cacheSubnetGroupName <p>
     *            A name for the cache subnet group. This value is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters or hyphens.
     *            </p>
     *            <p>
     *            Example: <code>mysubnetgroup</code>
     *            </p>
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    /**
     * <p>
     * A name for the cache subnet group. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters or
     * hyphens.
     * </p>
     * <p>
     * Example: <code>mysubnetgroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroupName <p>
     *            A name for the cache subnet group. This value is stored as a
     *            lowercase string.
     *            </p>
     *            <p>
     *            Constraints: Must contain no more than 255 alphanumeric
     *            characters or hyphens.
     *            </p>
     *            <p>
     *            Example: <code>mysubnetgroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCacheSubnetGroupRequest withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * A description for the cache subnet group.
     * </p>
     *
     * @return <p>
     *         A description for the cache subnet group.
     *         </p>
     */
    public String getCacheSubnetGroupDescription() {
        return cacheSubnetGroupDescription;
    }

    /**
     * <p>
     * A description for the cache subnet group.
     * </p>
     *
     * @param cacheSubnetGroupDescription <p>
     *            A description for the cache subnet group.
     *            </p>
     */
    public void setCacheSubnetGroupDescription(String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
    }

    /**
     * <p>
     * A description for the cache subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheSubnetGroupDescription <p>
     *            A description for the cache subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCacheSubnetGroupRequest withCacheSubnetGroupDescription(
            String cacheSubnetGroupDescription) {
        this.cacheSubnetGroupDescription = cacheSubnetGroupDescription;
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     *
     * @return <p>
     *         A list of VPC subnet IDs for the cache subnet group.
     *         </p>
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     *
     * @param subnetIds <p>
     *            A list of VPC subnet IDs for the cache subnet group.
     *            </p>
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of VPC subnet IDs for the cache subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCacheSubnetGroupRequest withSubnetIds(String... subnetIds) {
        if (getSubnetIds() == null) {
            this.subnetIds = new java.util.ArrayList<String>(subnetIds.length);
        }
        for (String value : subnetIds) {
            this.subnetIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs for the cache subnet group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetIds <p>
     *            A list of VPC subnet IDs for the cache subnet group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCacheSubnetGroupRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds());
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
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCacheSubnetGroupRequest == false)
            return false;
        CreateCacheSubnetGroupRequest other = (CreateCacheSubnetGroupRequest) obj;

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
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null
                && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }
}
