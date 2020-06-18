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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Add tags to a MediaConvert queue, preset, or job template. For information
 * about tagging, see the User Guide at
 * https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The Amazon Resource Name (ARN) of the resource that you want to tag. To
     * get the ARN, send a GET request with the resource name.
     */
    private String arn;

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     */
    private java.util.Map<String, String> tags;

    /**
     * The Amazon Resource Name (ARN) of the resource that you want to tag. To
     * get the ARN, send a GET request with the resource name.
     *
     * @return The Amazon Resource Name (ARN) of the resource that you want to
     *         tag. To get the ARN, send a GET request with the resource name.
     */
    public String getArn() {
        return arn;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource that you want to tag. To
     * get the ARN, send a GET request with the resource name.
     *
     * @param arn The Amazon Resource Name (ARN) of the resource that you want
     *            to tag. To get the ARN, send a GET request with the resource
     *            name.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource that you want to tag. To
     * get the ARN, send a GET request with the resource name.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn The Amazon Resource Name (ARN) of the resource that you want
     *            to tag. To get the ARN, send a GET request with the resource
     *            name.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     *
     * @return The tags that you want to add to the resource. You can tag
     *         resources with a key-value pair or with only a key.
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     *
     * @param tags The tags that you want to add to the resource. You can tag
     *            resources with a key-value pair or with only a key.
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags The tags that you want to add to the resource. You can tag
     *            resources with a key-value pair or with only a key.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * The tags that you want to add to the resource. You can tag resources with
     * a key-value pair or with only a key.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public TagResourceRequest clearTagsEntries() {
        this.tags = null;
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
