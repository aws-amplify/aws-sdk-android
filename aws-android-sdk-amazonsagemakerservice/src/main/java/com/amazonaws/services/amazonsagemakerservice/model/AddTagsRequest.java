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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or overwrites one or more tags for the specified Amazon SageMaker
 * resource. You can add tags to notebook instances, training jobs,
 * hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work
 * teams, endpoint configurations, and endpoints.
 * </p>
 * <p>
 * Each tag consists of a key and an optional value. Tag keys must be unique per
 * resource. For more information about tags, see For more information, see <a
 * href
 * ="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/"
 * >AWS Tagging Strategies</a>.
 * </p>
 * <note>
 * <p>
 * Tags that you add to a hyperparameter tuning job by calling this API are also
 * added to any training jobs that the hyperparameter tuning job launches after
 * you call this API, but not to training jobs that the hyperparameter tuning
 * job launched before you called this API. To make sure that the tags
 * associated with a hyperparameter tuning job are also added to all training
 * jobs that the hyperparameter tuning job launches, add the tags when you first
 * create the tuning job by specifying them in the <code>Tags</code> parameter
 * of <a>CreateHyperParameterTuningJob</a>
 * </p>
 * </note>
 */
public class AddTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only
     * the <code>key</code> parameter is required. If you don't specify a value,
     * Amazon SageMaker sets the value to an empty string.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the resource that you want to
     *         tag.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource that you want
     *            to tag.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the resource that you want
     *            to tag.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only
     * the <code>key</code> parameter is required. If you don't specify a value,
     * Amazon SageMaker sets the value to an empty string.
     * </p>
     *
     * @return <p>
     *         An array of <code>Tag</code> objects. Each tag is a key-value
     *         pair. Only the <code>key</code> parameter is required. If you
     *         don't specify a value, Amazon SageMaker sets the value to an
     *         empty string.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only
     * the <code>key</code> parameter is required. If you don't specify a value,
     * Amazon SageMaker sets the value to an empty string.
     * </p>
     *
     * @param tags <p>
     *            An array of <code>Tag</code> objects. Each tag is a key-value
     *            pair. Only the <code>key</code> parameter is required. If you
     *            don't specify a value, Amazon SageMaker sets the value to an
     *            empty string.
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
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only
     * the <code>key</code> parameter is required. If you don't specify a value,
     * Amazon SageMaker sets the value to an empty string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of <code>Tag</code> objects. Each tag is a key-value
     *            pair. Only the <code>key</code> parameter is required. If you
     *            don't specify a value, Amazon SageMaker sets the value to an
     *            empty string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withTags(Tag... tags) {
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
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only
     * the <code>key</code> parameter is required. If you don't specify a value,
     * Amazon SageMaker sets the value to an empty string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            An array of <code>Tag</code> objects. Each tag is a key-value
     *            pair. Only the <code>key</code> parameter is required. If you
     *            don't specify a value, Amazon SageMaker sets the value to an
     *            empty string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof AddTagsRequest == false)
            return false;
        AddTagsRequest other = (AddTagsRequest) obj;

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
