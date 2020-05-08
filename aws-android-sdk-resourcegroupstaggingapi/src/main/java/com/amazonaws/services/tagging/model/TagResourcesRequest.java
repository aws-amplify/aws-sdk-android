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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Applies one or more tags to the specified resources. Note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Not all resources can have tags. For a list of services that support tagging,
 * see <a href=
 * "http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html"
 * >this list</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * Each resource can have up to 50 tags. For other limits, see <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/aws_tagging.html#tag-conventions"
 * >Tag Naming and Usage Conventions</a> in the <i>AWS General Reference.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * You can only tag resources that are located in the specified Region for the
 * AWS account.
 * </p>
 * </li>
 * <li>
 * <p>
 * To add tags to a resource, you need the necessary permissions for the service
 * that the resource belongs to as well as permissions for adding tags. For more
 * information, see <a href=
 * "http://docs.aws.amazon.com/resourcegroupstagging/latest/APIReference/Welcome.html"
 * >this list</a>.
 * </p>
 * </li>
 * </ul>
 */
public class TagResourcesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     */
    private java.util.List<String> resourceARNList;

    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists
     * of a key and a value that you define.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     *
     * @return <p>
     *         A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies
     *         a resource. For more information, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in
     *         the <i>AWS General Reference</i>.
     *         </p>
     */
    public java.util.List<String> getResourceARNList() {
        return resourceARNList;
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     *
     * @param resourceARNList <p>
     *            A list of ARNs. An ARN (Amazon Resource Name) uniquely
     *            identifies a resource. For more information, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     */
    public void setResourceARNList(java.util.Collection<String> resourceARNList) {
        if (resourceARNList == null) {
            this.resourceARNList = null;
            return;
        }

        this.resourceARNList = new java.util.ArrayList<String>(resourceARNList);
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceARNList <p>
     *            A list of ARNs. An ARN (Amazon Resource Name) uniquely
     *            identifies a resource. For more information, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourcesRequest withResourceARNList(String... resourceARNList) {
        if (getResourceARNList() == null) {
            this.resourceARNList = new java.util.ArrayList<String>(resourceARNList.length);
        }
        for (String value : resourceARNList) {
            this.resourceARNList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs. An ARN (Amazon Resource Name) uniquely identifies a
     * resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a> in the
     * <i>AWS General Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceARNList <p>
     *            A list of ARNs. An ARN (Amazon Resource Name) uniquely
     *            identifies a resource. For more information, see <a href=
     *            "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>
     *            in the <i>AWS General Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourcesRequest withResourceARNList(java.util.Collection<String> resourceARNList) {
        setResourceARNList(resourceARNList);
        return this;
    }

    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists
     * of a key and a value that you define.
     * </p>
     *
     * @return <p>
     *         The tags that you want to add to the specified resources. A tag
     *         consists of a key and a value that you define.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists
     * of a key and a value that you define.
     * </p>
     *
     * @param tags <p>
     *            The tags that you want to add to the specified resources. A
     *            tag consists of a key and a value that you define.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists
     * of a key and a value that you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that you want to add to the specified resources. A
     *            tag consists of a key and a value that you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TagResourcesRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags that you want to add to the specified resources. A tag consists
     * of a key and a value that you define.
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
    public TagResourcesRequest addTagsEntry(String key, String value) {
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
    public TagResourcesRequest clearTagsEntries() {
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
        if (getResourceARNList() != null)
            sb.append("ResourceARNList: " + getResourceARNList() + ",");
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
                + ((getResourceARNList() == null) ? 0 : getResourceARNList().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagResourcesRequest == false)
            return false;
        TagResourcesRequest other = (TagResourcesRequest) obj;

        if (other.getResourceARNList() == null ^ this.getResourceARNList() == null)
            return false;
        if (other.getResourceARNList() != null
                && other.getResourceARNList().equals(this.getResourceARNList()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
