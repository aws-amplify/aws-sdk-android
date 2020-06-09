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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches a key-value pair to a resource, as identified by its Amazon Resource
 * Name (ARN). Resources are users, servers, roles, and other entities.
 * </p>
 * <p>
 * There is no response returned from this call.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An Amazon Resource Name (ARN) for a specific AWS resource, such as a
     * server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String arn;

    /**
     * <p>
     * Key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type. You can attach this metadata to user accounts for any
     * purpose.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a specific AWS resource, such as a
     * server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) for a specific AWS resource, such
     *         as a server, user, or role.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a specific AWS resource, such as a
     * server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            An Amazon Resource Name (ARN) for a specific AWS resource,
     *            such as a server, user, or role.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a specific AWS resource, such as a
     * server, user, or role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            An Amazon Resource Name (ARN) for a specific AWS resource,
     *            such as a server, user, or role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type. You can attach this metadata to user accounts for any
     * purpose.
     * </p>
     *
     * @return <p>
     *         Key-value pairs assigned to ARNs that you can use to group and
     *         search for resources by type. You can attach this metadata to
     *         user accounts for any purpose.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type. You can attach this metadata to user accounts for any
     * purpose.
     * </p>
     *
     * @param tags <p>
     *            Key-value pairs assigned to ARNs that you can use to group and
     *            search for resources by type. You can attach this metadata to
     *            user accounts for any purpose.
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
     * Key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type. You can attach this metadata to user accounts for any
     * purpose.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs assigned to ARNs that you can use to group and
     *            search for resources by type. You can attach this metadata to
     *            user accounts for any purpose.
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
     * Key-value pairs assigned to ARNs that you can use to group and search for
     * resources by type. You can attach this metadata to user accounts for any
     * purpose.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs assigned to ARNs that you can use to group and
     *            search for resources by type. You can attach this metadata to
     *            user accounts for any purpose.
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
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

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
