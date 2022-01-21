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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Tags an Amazon Transcribe resource with the given list of tags.
 * </p>
 */
public class TagResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Transcribe resource you want
     * to tag. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * (for example,
     * <code>arn:aws:transcribe:us-east-1:account-id:transcription-job/your-job-name</code>
     * ). Valid values for <code>resource-type</code> are:
     * <code>transcription-job</code>, <code>medical-transcription-job</code>,
     * <code>vocabulary</code>, <code>medical-vocabulary</code>,
     * <code>vocabulary-filter</code>, and <code>language-model</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:transcribe:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-Z-]
     * {@literal *}/[0-9a-zA-Z._-]+<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The tags you are assigning to a given Amazon Transcribe resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Transcribe resource you want
     * to tag. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * (for example,
     * <code>arn:aws:transcribe:us-east-1:account-id:transcription-job/your-job-name</code>
     * ). Valid values for <code>resource-type</code> are:
     * <code>transcription-job</code>, <code>medical-transcription-job</code>,
     * <code>vocabulary</code>, <code>medical-vocabulary</code>,
     * <code>vocabulary-filter</code>, and <code>language-model</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:transcribe:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-Z-]
     * {@literal *}/[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon Transcribe resource
     *         you want to tag. ARNs have the format
     *         <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *         (for example,
     *         <code>arn:aws:transcribe:us-east-1:account-id:transcription-job/your-job-name</code>
     *         ). Valid values for <code>resource-type</code> are:
     *         <code>transcription-job</code>,
     *         <code>medical-transcription-job</code>, <code>vocabulary</code>,
     *         <code>medical-vocabulary</code>, <code>vocabulary-filter</code>,
     *         and <code>language-model</code>.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Transcribe resource you want
     * to tag. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * (for example,
     * <code>arn:aws:transcribe:us-east-1:account-id:transcription-job/your-job-name</code>
     * ). Valid values for <code>resource-type</code> are:
     * <code>transcription-job</code>, <code>medical-transcription-job</code>,
     * <code>vocabulary</code>, <code>medical-vocabulary</code>,
     * <code>vocabulary-filter</code>, and <code>language-model</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:transcribe:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-Z-]
     * {@literal *}/[0-9a-zA-Z._-]+<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Transcribe
     *            resource you want to tag. ARNs have the format
     *            <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *            (for example,
     *            <code>arn:aws:transcribe:us-east-1:account-id:transcription-job/your-job-name</code>
     *            ). Valid values for <code>resource-type</code> are:
     *            <code>transcription-job</code>,
     *            <code>medical-transcription-job</code>,
     *            <code>vocabulary</code>, <code>medical-vocabulary</code>,
     *            <code>vocabulary-filter</code>, and
     *            <code>language-model</code>.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Transcribe resource you want
     * to tag. ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * (for example,
     * <code>arn:aws:transcribe:us-east-1:account-id:transcription-job/your-job-name</code>
     * ). Valid values for <code>resource-type</code> are:
     * <code>transcription-job</code>, <code>medical-transcription-job</code>,
     * <code>vocabulary</code>, <code>medical-vocabulary</code>,
     * <code>vocabulary-filter</code>, and <code>language-model</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:transcribe:[a-zA-Z0-9-]*:[0-9]{12}:[a-zA-Z-]
     * {@literal *}/[0-9a-zA-Z._-]+<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the Amazon Transcribe
     *            resource you want to tag. ARNs have the format
     *            <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *            (for example,
     *            <code>arn:aws:transcribe:us-east-1:account-id:transcription-job/your-job-name</code>
     *            ). Valid values for <code>resource-type</code> are:
     *            <code>transcription-job</code>,
     *            <code>medical-transcription-job</code>,
     *            <code>vocabulary</code>, <code>medical-vocabulary</code>,
     *            <code>vocabulary-filter</code>, and
     *            <code>language-model</code>.
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
     * The tags you are assigning to a given Amazon Transcribe resource.
     * </p>
     *
     * @return <p>
     *         The tags you are assigning to a given Amazon Transcribe resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags you are assigning to a given Amazon Transcribe resource.
     * </p>
     *
     * @param tags <p>
     *            The tags you are assigning to a given Amazon Transcribe
     *            resource.
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
     * The tags you are assigning to a given Amazon Transcribe resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags you are assigning to a given Amazon Transcribe
     *            resource.
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
     * The tags you are assigning to a given Amazon Transcribe resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags you are assigning to a given Amazon Transcribe
     *            resource.
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
