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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified set of tags from the specified set of resources.
 * </p>
 * <p>
 * To list the current tags, use <a>DescribeTags</a>. For more information about
 * tags, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
 * >Tagging Your Resources</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class DeleteTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this
     * request into smaller batches.
     * </p>
     */
    private java.util.List<String> resources;

    /**
     * <p>
     * The tags to delete. Specify a tag key and an optional tag value to delete
     * specific tags. If you specify a tag key without a tag value, we delete
     * any tag with this key regardless of its value. If you specify a tag key
     * with an empty string as the tag value, we delete the tag only if its
     * value is an empty string.
     * </p>
     * <p>
     * If you omit this parameter, we delete all user-defined tags for the
     * specified resources. We do not delete AWS-generated tags (tags that have
     * the <code>aws:</code> prefix).
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTagsRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this
     * request into smaller batches.
     * </p>
     *
     * @return <p>
     *         The IDs of the resources, separated by spaces.
     *         </p>
     *         <p>
     *         Constraints: Up to 1000 resource IDs. We recommend breaking up
     *         this request into smaller batches.
     *         </p>
     */
    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this
     * request into smaller batches.
     * </p>
     *
     * @param resources <p>
     *            The IDs of the resources, separated by spaces.
     *            </p>
     *            <p>
     *            Constraints: Up to 1000 resource IDs. We recommend breaking up
     *            this request into smaller batches.
     *            </p>
     */
    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this
     * request into smaller batches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The IDs of the resources, separated by spaces.
     *            </p>
     *            <p>
     *            Constraints: Up to 1000 resource IDs. We recommend breaking up
     *            this request into smaller batches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTagsRequest withResources(String... resources) {
        if (getResources() == null) {
            this.resources = new java.util.ArrayList<String>(resources.length);
        }
        for (String value : resources) {
            this.resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the resources, separated by spaces.
     * </p>
     * <p>
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this
     * request into smaller batches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The IDs of the resources, separated by spaces.
     *            </p>
     *            <p>
     *            Constraints: Up to 1000 resource IDs. We recommend breaking up
     *            this request into smaller batches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTagsRequest withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The tags to delete. Specify a tag key and an optional tag value to delete
     * specific tags. If you specify a tag key without a tag value, we delete
     * any tag with this key regardless of its value. If you specify a tag key
     * with an empty string as the tag value, we delete the tag only if its
     * value is an empty string.
     * </p>
     * <p>
     * If you omit this parameter, we delete all user-defined tags for the
     * specified resources. We do not delete AWS-generated tags (tags that have
     * the <code>aws:</code> prefix).
     * </p>
     *
     * @return <p>
     *         The tags to delete. Specify a tag key and an optional tag value
     *         to delete specific tags. If you specify a tag key without a tag
     *         value, we delete any tag with this key regardless of its value.
     *         If you specify a tag key with an empty string as the tag value,
     *         we delete the tag only if its value is an empty string.
     *         </p>
     *         <p>
     *         If you omit this parameter, we delete all user-defined tags for
     *         the specified resources. We do not delete AWS-generated tags
     *         (tags that have the <code>aws:</code> prefix).
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to delete. Specify a tag key and an optional tag value to delete
     * specific tags. If you specify a tag key without a tag value, we delete
     * any tag with this key regardless of its value. If you specify a tag key
     * with an empty string as the tag value, we delete the tag only if its
     * value is an empty string.
     * </p>
     * <p>
     * If you omit this parameter, we delete all user-defined tags for the
     * specified resources. We do not delete AWS-generated tags (tags that have
     * the <code>aws:</code> prefix).
     * </p>
     *
     * @param tags <p>
     *            The tags to delete. Specify a tag key and an optional tag
     *            value to delete specific tags. If you specify a tag key
     *            without a tag value, we delete any tag with this key
     *            regardless of its value. If you specify a tag key with an
     *            empty string as the tag value, we delete the tag only if its
     *            value is an empty string.
     *            </p>
     *            <p>
     *            If you omit this parameter, we delete all user-defined tags
     *            for the specified resources. We do not delete AWS-generated
     *            tags (tags that have the <code>aws:</code> prefix).
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
     * The tags to delete. Specify a tag key and an optional tag value to delete
     * specific tags. If you specify a tag key without a tag value, we delete
     * any tag with this key regardless of its value. If you specify a tag key
     * with an empty string as the tag value, we delete the tag only if its
     * value is an empty string.
     * </p>
     * <p>
     * If you omit this parameter, we delete all user-defined tags for the
     * specified resources. We do not delete AWS-generated tags (tags that have
     * the <code>aws:</code> prefix).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to delete. Specify a tag key and an optional tag
     *            value to delete specific tags. If you specify a tag key
     *            without a tag value, we delete any tag with this key
     *            regardless of its value. If you specify a tag key with an
     *            empty string as the tag value, we delete the tag only if its
     *            value is an empty string.
     *            </p>
     *            <p>
     *            If you omit this parameter, we delete all user-defined tags
     *            for the specified resources. We do not delete AWS-generated
     *            tags (tags that have the <code>aws:</code> prefix).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTagsRequest withTags(Tag... tags) {
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
     * The tags to delete. Specify a tag key and an optional tag value to delete
     * specific tags. If you specify a tag key without a tag value, we delete
     * any tag with this key regardless of its value. If you specify a tag key
     * with an empty string as the tag value, we delete the tag only if its
     * value is an empty string.
     * </p>
     * <p>
     * If you omit this parameter, we delete all user-defined tags for the
     * specified resources. We do not delete AWS-generated tags (tags that have
     * the <code>aws:</code> prefix).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to delete. Specify a tag key and an optional tag
     *            value to delete specific tags. If you specify a tag key
     *            without a tag value, we delete any tag with this key
     *            regardless of its value. If you specify a tag key with an
     *            empty string as the tag value, we delete the tag only if its
     *            value is an empty string.
     *            </p>
     *            <p>
     *            If you omit this parameter, we delete all user-defined tags
     *            for the specified resources. We do not delete AWS-generated
     *            tags (tags that have the <code>aws:</code> prefix).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTagsRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTagsRequest == false)
            return false;
        DeleteTagsRequest other = (DeleteTagsRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
