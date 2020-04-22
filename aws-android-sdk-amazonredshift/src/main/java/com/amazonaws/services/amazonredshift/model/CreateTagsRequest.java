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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds tags to a cluster.
 * </p>
 * <p>
 * A resource can have up to 50 tags. If you try to create more than 50 tags for
 * a resource, you will receive an error and the attempt will fail.
 * </p>
 * <p>
 * If you specify a key that already exists for the resource, the value for that
 * key will be updated with the new value.
 * </p>
 */
public class CreateTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tag or tags.
     * For example, <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>
     * .
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>Key</code> and the
     * corresponding value is passed in with the parameter <code>Value</code>.
     * The <code>Key</code> and <code>Value</code> parameters are separated by a
     * comma (,). Separate multiple tags with a space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tag or tags.
     * For example, <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>
     * .
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) to which you want to add the tag
     *         or tags. For example,
     *         <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tag or tags.
     * For example, <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>
     * .
     * </p>
     *
     * @param resourceName <p>
     *            The Amazon Resource Name (ARN) to which you want to add the
     *            tag or tags. For example,
     *            <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tag or tags.
     * For example, <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceName <p>
     *            The Amazon Resource Name (ARN) to which you want to add the
     *            tag or tags. For example,
     *            <code>arn:aws:redshift:us-east-2:123456789:cluster:t1</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>Key</code> and the
     * corresponding value is passed in with the parameter <code>Value</code>.
     * The <code>Key</code> and <code>Value</code> parameters are separated by a
     * comma (,). Separate multiple tags with a space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     *
     * @return <p>
     *         One or more name/value pairs to add as tags to the specified
     *         resource. Each tag name is passed in with the parameter
     *         <code>Key</code> and the corresponding value is passed in with
     *         the parameter <code>Value</code>. The <code>Key</code> and
     *         <code>Value</code> parameters are separated by a comma (,).
     *         Separate multiple tags with a space. For example,
     *         <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     *         .
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>Key</code> and the
     * corresponding value is passed in with the parameter <code>Value</code>.
     * The <code>Key</code> and <code>Value</code> parameters are separated by a
     * comma (,). Separate multiple tags with a space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     *
     * @param tags <p>
     *            One or more name/value pairs to add as tags to the specified
     *            resource. Each tag name is passed in with the parameter
     *            <code>Key</code> and the corresponding value is passed in with
     *            the parameter <code>Value</code>. The <code>Key</code> and
     *            <code>Value</code> parameters are separated by a comma (,).
     *            Separate multiple tags with a space. For example,
     *            <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     *            .
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
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>Key</code> and the
     * corresponding value is passed in with the parameter <code>Value</code>.
     * The <code>Key</code> and <code>Value</code> parameters are separated by a
     * comma (,). Separate multiple tags with a space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more name/value pairs to add as tags to the specified
     *            resource. Each tag name is passed in with the parameter
     *            <code>Key</code> and the corresponding value is passed in with
     *            the parameter <code>Value</code>. The <code>Key</code> and
     *            <code>Value</code> parameters are separated by a comma (,).
     *            Separate multiple tags with a space. For example,
     *            <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withTags(Tag... tags) {
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
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>Key</code> and the
     * corresponding value is passed in with the parameter <code>Value</code>.
     * The <code>Key</code> and <code>Value</code> parameters are separated by a
     * comma (,). Separate multiple tags with a space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more name/value pairs to add as tags to the specified
     *            resource. Each tag name is passed in with the parameter
     *            <code>Key</code> and the corresponding value is passed in with
     *            the parameter <code>Value</code>. The <code>Key</code> and
     *            <code>Value</code> parameters are separated by a comma (,).
     *            Separate multiple tags with a space. For example,
     *            <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
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
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTagsRequest == false)
            return false;
        CreateTagsRequest other = (CreateTagsRequest) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
