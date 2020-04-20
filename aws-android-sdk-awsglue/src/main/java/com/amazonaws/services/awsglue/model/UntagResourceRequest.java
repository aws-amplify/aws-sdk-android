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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes tags from a resource.
 * </p>
 */
public class UntagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which to remove the
     * tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     * <b>Pattern: </b>arn:aws:glue:.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     */
    private java.util.List<String> tagsToRemove;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which to remove the
     * tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     * <b>Pattern: </b>arn:aws:glue:.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource from which to
     *         remove the tags.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which to remove the
     * tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     * <b>Pattern: </b>arn:aws:glue:.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource from which to
     *            remove the tags.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource from which to remove the
     * tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10240<br/>
     * <b>Pattern: </b>arn:aws:glue:.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource from which to
     *            remove the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     *
     * @return <p>
     *         Tags to remove from this resource.
     *         </p>
     */
    public java.util.List<String> getTagsToRemove() {
        return tagsToRemove;
    }

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     *
     * @param tagsToRemove <p>
     *            Tags to remove from this resource.
     *            </p>
     */
    public void setTagsToRemove(java.util.Collection<String> tagsToRemove) {
        if (tagsToRemove == null) {
            this.tagsToRemove = null;
            return;
        }

        this.tagsToRemove = new java.util.ArrayList<String>(tagsToRemove);
    }

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToRemove <p>
     *            Tags to remove from this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagsToRemove(String... tagsToRemove) {
        if (getTagsToRemove() == null) {
            this.tagsToRemove = new java.util.ArrayList<String>(tagsToRemove.length);
        }
        for (String value : tagsToRemove) {
            this.tagsToRemove.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToRemove <p>
     *            Tags to remove from this resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UntagResourceRequest withTagsToRemove(java.util.Collection<String> tagsToRemove) {
        setTagsToRemove(tagsToRemove);
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
        if (getTagsToRemove() != null)
            sb.append("TagsToRemove: " + getTagsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getTagsToRemove() == null) ? 0 : getTagsToRemove().hashCode());
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

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagsToRemove() == null ^ this.getTagsToRemove() == null)
            return false;
        if (other.getTagsToRemove() != null
                && other.getTagsToRemove().equals(this.getTagsToRemove()) == false)
            return false;
        return true;
    }
}
