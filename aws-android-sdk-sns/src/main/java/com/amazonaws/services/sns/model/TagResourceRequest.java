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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Add tags to the specified Amazon SNS topic. For an overview, see <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-tags.html">Amazon SNS
 * Tags</a> in the <i>Amazon SNS Developer Guide</i>.
 * </p>
 * <p>
 * When you use topic tags, keep the following guidelines in mind:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Adding more than 50 tags to a topic isn't recommended.
 * </p>
 * </li>
 * <li>
 * <p>
 * Tags don't have any semantic meaning. Amazon SNS interprets tags as character
 * strings.
 * </p>
 * </li>
 * <li>
 * <p>
 * Tags are case-sensitive.
 * </p>
 * </li>
 * <li>
 * <p>
 * A new tag with a key identical to that of an existing tag overwrites the
 * existing tag.
 * </p>
 * </li>
 * <li>
 * <p>
 * Tagging actions are limited to 10 TPS per Amazon Web Services account, per
 * Amazon Web Services Region. If your application requires a higher throughput,
 * file a <a href=
 * "https://console.aws.amazon.com/support/home#/case/create?issueType=technical"
 * >technical support request</a>.
 * </p>
 * </li>
 * </ul>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the topic to which to add tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The tags to be added to the specified topic. A tag consists of a required
     * key and an optional value.
     * </p>
     */
    private java.util.List<Tag> tags = new java.util.ArrayList<Tag>();

    /**
     * <p>
     * The ARN of the topic to which to add tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @return <p>
     *         The ARN of the topic to which to add tags.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the topic to which to add tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the topic to which to add tags.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the topic to which to add tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the topic to which to add tags.
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
     * The tags to be added to the specified topic. A tag consists of a required
     * key and an optional value.
     * </p>
     *
     * @return <p>
     *         The tags to be added to the specified topic. A tag consists of a
     *         required key and an optional value.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to the specified topic. A tag consists of a required
     * key and an optional value.
     * </p>
     *
     * @param tags <p>
     *            The tags to be added to the specified topic. A tag consists of
     *            a required key and an optional value.
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
     * The tags to be added to the specified topic. A tag consists of a required
     * key and an optional value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be added to the specified topic. A tag consists of
     *            a required key and an optional value.
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
     * The tags to be added to the specified topic. A tag consists of a required
     * key and an optional value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be added to the specified topic. A tag consists of
     *            a required key and an optional value.
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
