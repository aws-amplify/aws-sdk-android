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

package com.amazonaws.services.dms.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds metadata tags to an AWS DMS resource, including replication instance,
 * endpoint, security group, and migration task. These tags can also be used
 * with cost allocation reporting to track cost associated with DMS resources,
 * or used in a Condition statement in an IAM policy for DMS.
 * </p>
 */
public class AddTagsToResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Identifies the AWS DMS resource to which tags should be added. The value
     * for this parameter is an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * For AWS DMS, you can tag a replication instance, an endpoint, or a
     * replication task.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * One or more tags to be assigned to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Identifies the AWS DMS resource to which tags should be added. The value
     * for this parameter is an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * For AWS DMS, you can tag a replication instance, an endpoint, or a
     * replication task.
     * </p>
     *
     * @return <p>
     *         Identifies the AWS DMS resource to which tags should be added.
     *         The value for this parameter is an Amazon Resource Name (ARN).
     *         </p>
     *         <p>
     *         For AWS DMS, you can tag a replication instance, an endpoint, or
     *         a replication task.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * Identifies the AWS DMS resource to which tags should be added. The value
     * for this parameter is an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * For AWS DMS, you can tag a replication instance, an endpoint, or a
     * replication task.
     * </p>
     *
     * @param resourceArn <p>
     *            Identifies the AWS DMS resource to which tags should be added.
     *            The value for this parameter is an Amazon Resource Name (ARN).
     *            </p>
     *            <p>
     *            For AWS DMS, you can tag a replication instance, an endpoint,
     *            or a replication task.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Identifies the AWS DMS resource to which tags should be added. The value
     * for this parameter is an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * For AWS DMS, you can tag a replication instance, an endpoint, or a
     * replication task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            Identifies the AWS DMS resource to which tags should be added.
     *            The value for this parameter is an Amazon Resource Name (ARN).
     *            </p>
     *            <p>
     *            For AWS DMS, you can tag a replication instance, an endpoint,
     *            or a replication task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * One or more tags to be assigned to the resource.
     * </p>
     *
     * @return <p>
     *         One or more tags to be assigned to the resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags to be assigned to the resource.
     * </p>
     *
     * @param tags <p>
     *            One or more tags to be assigned to the resource.
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
     * One or more tags to be assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags to be assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withTags(Tag... tags) {
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
     * One or more tags to be assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags to be assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof AddTagsToResourceRequest == false)
            return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest) obj;

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
