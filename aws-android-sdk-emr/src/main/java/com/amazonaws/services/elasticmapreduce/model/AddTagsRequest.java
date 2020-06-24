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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds tags to an Amazon EMR resource. Tags make it easier to associate
 * clusters in various ways, such as grouping clusters to track your Amazon EMR
 * resource allocation costs. For more information, see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-plan-tags.html"
 * >Tag Clusters</a>.
 * </p>
 */
public class AddTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon EMR resource identifier to which tags will be added. This
     * value must be a cluster identifier.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to EC2
     * instances. Tags are user-defined key/value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional
     * value string with a maximum of 256 characters.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon EMR resource identifier to which tags will be added. This
     * value must be a cluster identifier.
     * </p>
     *
     * @return <p>
     *         The Amazon EMR resource identifier to which tags will be added.
     *         This value must be a cluster identifier.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The Amazon EMR resource identifier to which tags will be added. This
     * value must be a cluster identifier.
     * </p>
     *
     * @param resourceId <p>
     *            The Amazon EMR resource identifier to which tags will be
     *            added. This value must be a cluster identifier.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The Amazon EMR resource identifier to which tags will be added. This
     * value must be a cluster identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The Amazon EMR resource identifier to which tags will be
     *            added. This value must be a cluster identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to EC2
     * instances. Tags are user-defined key/value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional
     * value string with a maximum of 256 characters.
     * </p>
     *
     * @return <p>
     *         A list of tags to associate with a cluster and propagate to EC2
     *         instances. Tags are user-defined key/value pairs that consist of
     *         a required key string with a maximum of 128 characters, and an
     *         optional value string with a maximum of 256 characters.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to EC2
     * instances. Tags are user-defined key/value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional
     * value string with a maximum of 256 characters.
     * </p>
     *
     * @param tags <p>
     *            A list of tags to associate with a cluster and propagate to
     *            EC2 instances. Tags are user-defined key/value pairs that
     *            consist of a required key string with a maximum of 128
     *            characters, and an optional value string with a maximum of 256
     *            characters.
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
     * A list of tags to associate with a cluster and propagate to EC2
     * instances. Tags are user-defined key/value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional
     * value string with a maximum of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with a cluster and propagate to
     *            EC2 instances. Tags are user-defined key/value pairs that
     *            consist of a required key string with a maximum of 128
     *            characters, and an optional value string with a maximum of 256
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withTags(Tag... tags) {
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
     * A list of tags to associate with a cluster and propagate to EC2
     * instances. Tags are user-defined key/value pairs that consist of a
     * required key string with a maximum of 128 characters, and an optional
     * value string with a maximum of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags to associate with a cluster and propagate to
     *            EC2 instances. Tags are user-defined key/value pairs that
     *            consist of a required key string with a maximum of 128
     *            characters, and an optional value string with a maximum of 256
     *            characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof AddTagsRequest == false)
            return false;
        AddTagsRequest other = (AddTagsRequest) obj;

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
