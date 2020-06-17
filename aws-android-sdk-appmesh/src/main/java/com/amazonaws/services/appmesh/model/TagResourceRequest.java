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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates the specified tags to a resource with the specified
 * <code>resourceArn</code>. If existing tags on a resource aren't specified in
 * the request parameters, they aren't changed. When a resource is deleted, the
 * tags associated with that resource are also deleted.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to add tags to.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The tags to add to the resource. A tag is an array of key-value pairs.
     * Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     */
    private java.util.List<TagRef> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to add tags to.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource to add tags to.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to add tags to.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource to add tags to.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to add tags to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource to add tags to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The tags to add to the resource. A tag is an array of key-value pairs.
     * Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     *
     * @return <p>
     *         The tags to add to the resource. A tag is an array of key-value
     *         pairs. Tag keys can have a maximum character length of 128
     *         characters, and tag values can have a maximum length of 256
     *         characters.
     *         </p>
     */
    public java.util.List<TagRef> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the resource. A tag is an array of key-value pairs.
     * Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     *
     * @param tags <p>
     *            The tags to add to the resource. A tag is an array of
     *            key-value pairs. Tag keys can have a maximum character length
     *            of 128 characters, and tag values can have a maximum length of
     *            256 characters.
     *            </p>
     */
    public void setTags(java.util.Collection<TagRef> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagRef>(tags);
    }

    /**
     * <p>
     * The tags to add to the resource. A tag is an array of key-value pairs.
     * Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to add to the resource. A tag is an array of
     *            key-value pairs. Tag keys can have a maximum character length
     *            of 128 characters, and tag values can have a maximum length of
     *            256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(TagRef... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<TagRef>(tags.length);
        }
        for (TagRef value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to the resource. A tag is an array of key-value pairs.
     * Tag keys can have a maximum character length of 128 characters, and tag
     * values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to add to the resource. A tag is an array of
     *            key-value pairs. Tag keys can have a maximum character length
     *            of 128 characters, and tag values can have a maximum length of
     *            256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(java.util.Collection<TagRef> tags) {
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
        if (getResourceArn() != null)
            sb.append("resourceArn: " + getResourceArn() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
