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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds one or more tags to a specified Amazon QLDB resource.
 * </p>
 * <p>
 * A resource can have up to 50 tags. If you try to create more than 50 tags for
 * a resource, your request fails and returns an error.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tags. For
     * example:
     * </p>
     * <p>
     * <code>arn:aws:qldb:us-east-1:123456789012:ledger/exampleLedger</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The key-value pairs to add as tags to the specified QLDB resource. Tag
     * keys are case sensitive. If you specify a key that already exists for the
     * resource, your request fails and returns an error. Tag values are case
     * sensitive and can be null.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tags. For
     * example:
     * </p>
     * <p>
     * <code>arn:aws:qldb:us-east-1:123456789012:ledger/exampleLedger</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) to which you want to add the tags.
     *         For example:
     *         </p>
     *         <p>
     *         <code>arn:aws:qldb:us-east-1:123456789012:ledger/exampleLedger</code>
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tags. For
     * example:
     * </p>
     * <p>
     * <code>arn:aws:qldb:us-east-1:123456789012:ledger/exampleLedger</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) to which you want to add the
     *            tags. For example:
     *            </p>
     *            <p>
     *            <code>arn:aws:qldb:us-east-1:123456789012:ledger/exampleLedger</code>
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tags. For
     * example:
     * </p>
     * <p>
     * <code>arn:aws:qldb:us-east-1:123456789012:ledger/exampleLedger</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) to which you want to add the
     *            tags. For example:
     *            </p>
     *            <p>
     *            <code>arn:aws:qldb:us-east-1:123456789012:ledger/exampleLedger</code>
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
     * The key-value pairs to add as tags to the specified QLDB resource. Tag
     * keys are case sensitive. If you specify a key that already exists for the
     * resource, your request fails and returns an error. Tag values are case
     * sensitive and can be null.
     * </p>
     *
     * @return <p>
     *         The key-value pairs to add as tags to the specified QLDB
     *         resource. Tag keys are case sensitive. If you specify a key that
     *         already exists for the resource, your request fails and returns
     *         an error. Tag values are case sensitive and can be null.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the specified QLDB resource. Tag
     * keys are case sensitive. If you specify a key that already exists for the
     * resource, your request fails and returns an error. Tag values are case
     * sensitive and can be null.
     * </p>
     *
     * @param tags <p>
     *            The key-value pairs to add as tags to the specified QLDB
     *            resource. Tag keys are case sensitive. If you specify a key
     *            that already exists for the resource, your request fails and
     *            returns an error. Tag values are case sensitive and can be
     *            null.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the specified QLDB resource. Tag
     * keys are case sensitive. If you specify a key that already exists for the
     * resource, your request fails and returns an error. Tag values are case
     * sensitive and can be null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value pairs to add as tags to the specified QLDB
     *            resource. Tag keys are case sensitive. If you specify a key
     *            that already exists for the resource, your request fails and
     *            returns an error. Tag values are case sensitive and can be
     *            null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value pairs to add as tags to the specified QLDB resource. Tag
     * keys are case sensitive. If you specify a key that already exists for the
     * resource, your request fails and returns an error. Tag values are case
     * sensitive and can be null.
     * </p>
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
