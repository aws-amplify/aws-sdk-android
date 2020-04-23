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

package com.amazonaws.services.awselementalmediapackagevod.model;

import java.io.Serializable;

public class DescribePackagingGroupResult implements Serializable {
    /**
     * The ARN of the PackagingGroup.
     */
    private String arn;

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     */
    private String domainName;

    /**
     * The ID of the PackagingGroup.
     */
    private String id;

    /**
     * A collection of tags associated with a resource
     */
    private java.util.Map<String, String> tags;

    /**
     * The ARN of the PackagingGroup.
     *
     * @return The ARN of the PackagingGroup.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The ARN of the PackagingGroup.
     *
     * @param arn The ARN of the PackagingGroup.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the PackagingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The ARN of the PackagingGroup.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingGroupResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     *
     * @return The fully qualified domain name for Assets in the PackagingGroup.
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     *
     * @param domainName The fully qualified domain name for Assets in the
     *            PackagingGroup.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainName The fully qualified domain name for Assets in the
     *            PackagingGroup.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingGroupResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * The ID of the PackagingGroup.
     *
     * @return The ID of the PackagingGroup.
     */
    public String getId() {
        return id;
    }

    /**
     * The ID of the PackagingGroup.
     *
     * @param id The ID of the PackagingGroup.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the PackagingGroup.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The ID of the PackagingGroup.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingGroupResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A collection of tags associated with a resource
     *
     * @return A collection of tags associated with a resource
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of tags associated with a resource
     *
     * @param tags A collection of tags associated with a resource
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of tags associated with a resource
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags A collection of tags associated with a resource
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingGroupResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of tags associated with a resource
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackagingGroupResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribePackagingGroupResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackagingGroupResult == false)
            return false;
        DescribePackagingGroupResult other = (DescribePackagingGroupResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
