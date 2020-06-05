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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Update the list of tags applied to an AWS Elastic Beanstalk resource. Two
 * lists can be passed: <code>TagsToAdd</code> for tags to add or update, and
 * <code>TagsToRemove</code>.
 * </p>
 * <p>
 * Elastic Beanstalk supports tagging of all of its resources. For details about
 * resource tagging, see <a href=
 * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/applications-tagging-resources.html"
 * >Tagging Application Resources</a>.
 * </p>
 * <p>
 * If you create a custom IAM user policy to control permission to this
 * operation, specify one of the following two virtual actions (or both) instead
 * of the API operation name:
 * </p>
 * <dl>
 * <dt>elasticbeanstalk:AddTags</dt>
 * <dd>
 * <p>
 * Controls permission to call <code>UpdateTagsForResource</code> and pass a
 * list of tags to add in the <code>TagsToAdd</code> parameter.
 * </p>
 * </dd>
 * <dt>elasticbeanstalk:RemoveTags</dt>
 * <dd>
 * <p>
 * Controls permission to call <code>UpdateTagsForResource</code> and pass a
 * list of tag keys to remove in the <code>TagsToRemove</code> parameter.
 * </p>
 * </dd>
 * </dl>
 * <p>
 * For details about creating a custom user policy, see <a href=
 * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/AWSHowTo.iam.managed-policies.html#AWSHowTo.iam.policies"
 * >Creating a Custom User Policy</a>.
 * </p>
 */
public class UpdateTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce to be updated.
     * </p>
     * <p>
     * Must be the ARN of an Elastic Beanstalk resource.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * A list of tags to add or update. If a key of an existing tag is added,
     * the tag's value is updated.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     */
    private java.util.List<Tag> tagsToAdd;

    /**
     * <p>
     * A list of tag keys to remove. If a tag key doesn't exist, it is silently
     * ignored.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     */
    private java.util.List<String> tagsToRemove;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce to be updated.
     * </p>
     * <p>
     * Must be the ARN of an Elastic Beanstalk resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resouce to be updated.
     *         </p>
     *         <p>
     *         Must be the ARN of an Elastic Beanstalk resource.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce to be updated.
     * </p>
     * <p>
     * Must be the ARN of an Elastic Beanstalk resource.
     * </p>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resouce to be updated.
     *            </p>
     *            <p>
     *            Must be the ARN of an Elastic Beanstalk resource.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce to be updated.
     * </p>
     * <p>
     * Must be the ARN of an Elastic Beanstalk resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resouce to be updated.
     *            </p>
     *            <p>
     *            Must be the ARN of an Elastic Beanstalk resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTagsForResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * A list of tags to add or update. If a key of an existing tag is added,
     * the tag's value is updated.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     *
     * @return <p>
     *         A list of tags to add or update. If a key of an existing tag is
     *         added, the tag's value is updated.
     *         </p>
     *         <p>
     *         Specify at least one of these parameters: <code>TagsToAdd</code>,
     *         <code>TagsToRemove</code>.
     *         </p>
     */
    public java.util.List<Tag> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * <p>
     * A list of tags to add or update. If a key of an existing tag is added,
     * the tag's value is updated.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     *
     * @param tagsToAdd <p>
     *            A list of tags to add or update. If a key of an existing tag
     *            is added, the tag's value is updated.
     *            </p>
     *            <p>
     *            Specify at least one of these parameters:
     *            <code>TagsToAdd</code>, <code>TagsToRemove</code>.
     *            </p>
     */
    public void setTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        if (tagsToAdd == null) {
            this.tagsToAdd = null;
            return;
        }

        this.tagsToAdd = new java.util.ArrayList<Tag>(tagsToAdd);
    }

    /**
     * <p>
     * A list of tags to add or update. If a key of an existing tag is added,
     * the tag's value is updated.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToAdd <p>
     *            A list of tags to add or update. If a key of an existing tag
     *            is added, the tag's value is updated.
     *            </p>
     *            <p>
     *            Specify at least one of these parameters:
     *            <code>TagsToAdd</code>, <code>TagsToRemove</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTagsForResourceRequest withTagsToAdd(Tag... tagsToAdd) {
        if (getTagsToAdd() == null) {
            this.tagsToAdd = new java.util.ArrayList<Tag>(tagsToAdd.length);
        }
        for (Tag value : tagsToAdd) {
            this.tagsToAdd.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to add or update. If a key of an existing tag is added,
     * the tag's value is updated.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToAdd <p>
     *            A list of tags to add or update. If a key of an existing tag
     *            is added, the tag's value is updated.
     *            </p>
     *            <p>
     *            Specify at least one of these parameters:
     *            <code>TagsToAdd</code>, <code>TagsToRemove</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTagsForResourceRequest withTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        setTagsToAdd(tagsToAdd);
        return this;
    }

    /**
     * <p>
     * A list of tag keys to remove. If a tag key doesn't exist, it is silently
     * ignored.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     *
     * @return <p>
     *         A list of tag keys to remove. If a tag key doesn't exist, it is
     *         silently ignored.
     *         </p>
     *         <p>
     *         Specify at least one of these parameters: <code>TagsToAdd</code>,
     *         <code>TagsToRemove</code>.
     *         </p>
     */
    public java.util.List<String> getTagsToRemove() {
        return tagsToRemove;
    }

    /**
     * <p>
     * A list of tag keys to remove. If a tag key doesn't exist, it is silently
     * ignored.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     *
     * @param tagsToRemove <p>
     *            A list of tag keys to remove. If a tag key doesn't exist, it
     *            is silently ignored.
     *            </p>
     *            <p>
     *            Specify at least one of these parameters:
     *            <code>TagsToAdd</code>, <code>TagsToRemove</code>.
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
     * A list of tag keys to remove. If a tag key doesn't exist, it is silently
     * ignored.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToRemove <p>
     *            A list of tag keys to remove. If a tag key doesn't exist, it
     *            is silently ignored.
     *            </p>
     *            <p>
     *            Specify at least one of these parameters:
     *            <code>TagsToAdd</code>, <code>TagsToRemove</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTagsForResourceRequest withTagsToRemove(String... tagsToRemove) {
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
     * A list of tag keys to remove. If a tag key doesn't exist, it is silently
     * ignored.
     * </p>
     * <p>
     * Specify at least one of these parameters: <code>TagsToAdd</code>,
     * <code>TagsToRemove</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagsToRemove <p>
     *            A list of tag keys to remove. If a tag key doesn't exist, it
     *            is silently ignored.
     *            </p>
     *            <p>
     *            Specify at least one of these parameters:
     *            <code>TagsToAdd</code>, <code>TagsToRemove</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTagsForResourceRequest withTagsToRemove(java.util.Collection<String> tagsToRemove) {
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
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: " + getTagsToAdd() + ",");
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
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
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

        if (obj instanceof UpdateTagsForResourceRequest == false)
            return false;
        UpdateTagsForResourceRequest other = (UpdateTagsForResourceRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null
                && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
            return false;
        if (other.getTagsToRemove() == null ^ this.getTagsToRemove() == null)
            return false;
        if (other.getTagsToRemove() != null
                && other.getTagsToRemove().equals(this.getTagsToRemove()) == false)
            return false;
        return true;
    }
}
