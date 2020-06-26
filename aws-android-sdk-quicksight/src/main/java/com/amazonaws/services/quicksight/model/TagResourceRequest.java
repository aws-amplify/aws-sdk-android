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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Assigns one or more tags (key-value pairs) to the specified QuickSight
 * resource.
 * </p>
 * <p>
 * Tags can help you organize and categorize your resources. You can also use
 * them to scope user permissions, by granting a user permission to access or
 * change only resources with certain tag values. You can use the
 * <code>TagResource</code> operation with a resource that already has tags. If
 * you specify a new tag key for the resource, this tag is appended to the list
 * of tags associated with the resource. If you specify a tag key that is
 * already associated with the resource, the new tag value that you specify
 * replaces the previous value for that tag.
 * </p>
 * <p>
 * You can associate as many as 50 tags with a resource. QuickSight supports
 * tagging on data set, data source, dashboard, and template.
 * </p>
 * <p>
 * Tagging for QuickSight works in a similar way to tagging for other AWS
 * services, except for the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can't use tags to track AWS costs for QuickSight. This restriction is
 * because QuickSight costs are based on users and SPICE capacity, which aren't
 * taggable resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.
 * </p>
 * </li>
 * </ul>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource that you want to
     *         tag.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource that you want
     *            to tag.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource that you want
     *            to tag.
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
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     *
     * @return <p>
     *         Contains a map of the key-value pairs for the resource tag or
     *         tags assigned to the resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the resource.
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
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(Tag... tags) {
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
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
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
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
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
