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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates a new MediaPackage VOD PackagingGroup resource.
 */
public class CreatePackagingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * CDN Authorization credentials
     */
    private Authorization authorization;

    /**
     * The ID of the PackagingGroup.
     */
    private String id;

    /**
     * A collection of tags associated with a resource
     */
    private java.util.Map<String, String> tags;

    /**
     * CDN Authorization credentials
     *
     * @return CDN Authorization credentials
     */
    public Authorization getAuthorization() {
        return authorization;
    }

    /**
     * CDN Authorization credentials
     *
     * @param authorization CDN Authorization credentials
     */
    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    /**
     * CDN Authorization credentials
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param authorization CDN Authorization credentials
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreatePackagingGroupRequest withAuthorization(Authorization authorization) {
        this.authorization = authorization;
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
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The ID of the PackagingGroup.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreatePackagingGroupRequest withId(String id) {
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
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A collection of tags associated with a resource
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreatePackagingGroupRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of tags associated with a resource
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public CreatePackagingGroupRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public CreatePackagingGroupRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAuthorization() != null) sb.append("Authorization: " + getAuthorization() + ",");
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorization() == null) ? 0 : getAuthorization().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePackagingGroupRequest == false) return false;
        CreatePackagingGroupRequest other = (CreatePackagingGroupRequest)obj;

        if (other.getAuthorization() == null ^ this.getAuthorization() == null) return false;
        if (other.getAuthorization() != null && other.getAuthorization().equals(this.getAuthorization()) == false) return false;
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false;
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false;
        return true;
    }
}
