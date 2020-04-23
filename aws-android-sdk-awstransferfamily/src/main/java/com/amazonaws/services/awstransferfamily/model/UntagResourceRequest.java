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

package com.amazonaws.services.awstransferfamily.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Detaches a key-value pair from a resource, as identified by its Amazon
 * Resource Name (ARN). Resources are users, servers, roles, and other entities.
 * </p>
 * <p>
 * No response is returned from this call.
 * </p>
 */
public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The value of the resource that will have the tag removed. An Amazon
     * Resource Name (ARN) is an identifier for a specific AWS resource, such as
     * a server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String arn;

    /**
     * <p>
     * TagKeys are key-value pairs assigned to ARNs that can be used to group
     * and search for resources by type. This metadata can be attached to
     * resources for any purpose.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The value of the resource that will have the tag removed. An Amazon
     * Resource Name (ARN) is an identifier for a specific AWS resource, such as
     * a server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         The value of the resource that will have the tag removed. An
     *         Amazon Resource Name (ARN) is an identifier for a specific AWS
     *         resource, such as a server, user, or role.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The value of the resource that will have the tag removed. An Amazon
     * Resource Name (ARN) is an identifier for a specific AWS resource, such as
     * a server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            The value of the resource that will have the tag removed. An
     *            Amazon Resource Name (ARN) is an identifier for a specific AWS
     *            resource, such as a server, user, or role.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The value of the resource that will have the tag removed. An Amazon
     * Resource Name (ARN) is an identifier for a specific AWS resource, such as
     * a server, user, or role.
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
     *            The value of the resource that will have the tag removed. An
     *            Amazon Resource Name (ARN) is an identifier for a specific AWS
     *            resource, such as a server, user, or role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * TagKeys are key-value pairs assigned to ARNs that can be used to group
     * and search for resources by type. This metadata can be attached to
     * resources for any purpose.
     * </p>
     *
     * @return <p>
     *         TagKeys are key-value pairs assigned to ARNs that can be used to
     *         group and search for resources by type. This metadata can be
     *         attached to resources for any purpose.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * TagKeys are key-value pairs assigned to ARNs that can be used to group
     * and search for resources by type. This metadata can be attached to
     * resources for any purpose.
     * </p>
     *
     * @param tagKeys <p>
     *            TagKeys are key-value pairs assigned to ARNs that can be used
     *            to group and search for resources by type. This metadata can
     *            be attached to resources for any purpose.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * TagKeys are key-value pairs assigned to ARNs that can be used to group
     * and search for resources by type. This metadata can be attached to
     * resources for any purpose.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            TagKeys are key-value pairs assigned to ARNs that can be used
     *            to group and search for resources by type. This metadata can
     *            be attached to resources for any purpose.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * TagKeys are key-value pairs assigned to ARNs that can be used to group
     * and search for resources by type. This metadata can be attached to
     * resources for any purpose.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            TagKeys are key-value pairs assigned to ARNs that can be used
     *            to group and search for resources by type. This metadata can
     *            be attached to resources for any purpose.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
