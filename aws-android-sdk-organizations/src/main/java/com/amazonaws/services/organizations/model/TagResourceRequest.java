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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds one or more tags to the specified resource.
 * </p>
 * <p>
 * Currently, you can tag and untag accounts in AWS Organizations.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the resource to add a tag to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String resourceId;

    /**
     * <p>
     * The tag to add to the specified resource. Specifying the tag key is
     * required. You can set the value of a tag to an empty string, but you
     * can't set the value of a tag to null.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the resource to add a tag to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The ID of the resource to add a tag to.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource to add a tag to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param resourceId <p>
     *            The ID of the resource to add a tag to.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource to add a tag to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param resourceId <p>
     *            The ID of the resource to add a tag to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * The tag to add to the specified resource. Specifying the tag key is
     * required. You can set the value of a tag to an empty string, but you
     * can't set the value of a tag to null.
     * </p>
     *
     * @return <p>
     *         The tag to add to the specified resource. Specifying the tag key
     *         is required. You can set the value of a tag to an empty string,
     *         but you can't set the value of a tag to null.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag to add to the specified resource. Specifying the tag key is
     * required. You can set the value of a tag to an empty string, but you
     * can't set the value of a tag to null.
     * </p>
     *
     * @param tags <p>
     *            The tag to add to the specified resource. Specifying the tag
     *            key is required. You can set the value of a tag to an empty
     *            string, but you can't set the value of a tag to null.
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
     * The tag to add to the specified resource. Specifying the tag key is
     * required. You can set the value of a tag to an empty string, but you
     * can't set the value of a tag to null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag to add to the specified resource. Specifying the tag
     *            key is required. You can set the value of a tag to an empty
     *            string, but you can't set the value of a tag to null.
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
     * The tag to add to the specified resource. Specifying the tag key is
     * required. You can set the value of a tag to an empty string, but you
     * can't set the value of a tag to null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag to add to the specified resource. Specifying the tag
     *            key is required. You can set the value of a tag to an empty
     *            string, but you can't set the value of a tag to null.
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
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

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
