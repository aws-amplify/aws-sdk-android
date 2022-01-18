/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Assigns one or more tags (key-value pairs) to the specified Amazon Location
 * Service resource.
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.&lt;/p&gt; &lt;p&gt;You can use the &lt;code&gt;TagResource&lt;/code&gt; operation with an Amazon Location Service resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the tags already associated with the resource. If you specify a tag key that's already associated with the resource, the new tag value that you specify replaces the previous value for that tag. &lt;/p&gt; &lt;p&gt;You can associate up to 50 tags with a resource.&lt;/p&gt; </code>
 * </pre>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource whose tags you want to
     * update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:resourcetype/ExampleResource</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * Applies one or more tags to specific resource. A tag is a key-value pair
     * that helps you manage, identify, search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource whose tags you want to
     * update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:resourcetype/ExampleResource</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource whose tags you
     *         want to update.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example:
     *         <code>arn:aws:geo:region:account-id:resourcetype/ExampleResource</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource whose tags you want to
     * update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:resourcetype/ExampleResource</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource whose tags you
     *            want to update.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:resourcetype/ExampleResource</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource whose tags you want to
     * update.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example:
     * <code>arn:aws:geo:region:account-id:resourcetype/ExampleResource</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern:
     * </b>^arn(:[a-z0-9]+([.-][a-z0-9]+)*){2}(:([a-z0-9]+([.-][a-z0-
     * 9]+)*)?){2}:([^/].*)?$<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource whose tags you
     *            want to update.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Format example:
     *            <code>arn:aws:geo:region:account-id:resourcetype/ExampleResource</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to specific resource. A tag is a key-value pair
     * that helps you manage, identify, search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Applies one or more tags to specific resource. A tag is a
     *         key-value pair that helps you manage, identify, search, and
     *         filter your resources.
     *         </p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     *         <p>
     *         Restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum 50 tags per resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each tag key must be unique and must have exactly one associated
     *         value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *         following characters: + - = . _ : / @
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot use "aws:" as a prefix for a key.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to specific resource. A tag is a key-value pair
     * that helps you manage, identify, search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     *
     * @param tags <p>
     *            Applies one or more tags to specific resource. A tag is a
     *            key-value pair that helps you manage, identify, search, and
     *            filter your resources.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     *            <p>
     *            Restrictions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum 50 tags per resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each tag key must be unique and must have exactly one
     *            associated value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length: 128 Unicode characters in UTF-8.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length: 256 Unicode characters in UTF-8.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *            following characters: + - = . _ : / @
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot use "aws:" as a prefix for a key.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Applies one or more tags to specific resource. A tag is a key-value pair
     * that helps you manage, identify, search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Applies one or more tags to specific resource. A tag is a
     *            key-value pair that helps you manage, identify, search, and
     *            filter your resources.
     *            </p>
     *            <p>
     *            Format: <code>"key" : "value"</code>
     *            </p>
     *            <p>
     *            Restrictions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Maximum 50 tags per resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Each tag key must be unique and must have exactly one
     *            associated value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum key length: 128 Unicode characters in UTF-8.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Maximum value length: 256 Unicode characters in UTF-8.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can use alphanumeric characters (A–Z, a–z, 0–9), and the
     *            following characters: + - = . _ : / @
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Cannot use "aws:" as a prefix for a key.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourceRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to specific resource. A tag is a key-value pair
     * that helps you manage, identify, search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following
     * characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
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
