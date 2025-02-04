/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Lists all tags associated with the specified transcription job, vocabulary,
 * model, or resource.
 * </p>
 * <p>
 * To learn more about using tags with Amazon Transcribe, refer to <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging
 * resources</a>.
 * </p>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Returns a list of all tags associated with the specified Amazon Resource
     * Name (ARN). ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * .
     * </p>
     * <p>
     * For example,
     * <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>
     * .
     * </p>
     * <p>
     * Valid values for <code>resource-type</code> are:
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
     * Returns a list of all tags associated with the specified Amazon Resource
     * Name (ARN). ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * .
     * </p>
     * <p>
     * For example,
     * <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>
     * .
     * </p>
     * <p>
     * Valid values for <code>resource-type</code> are:
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
     *         Returns a list of all tags associated with the specified Amazon
     *         Resource Name (ARN). ARNs have the format
     *         <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *         .
     *         </p>
     *         <p>
     *         For example,
     *         <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>
     *         .
     *         </p>
     *         <p>
     *         Valid values for <code>resource-type</code> are:
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
     * Returns a list of all tags associated with the specified Amazon Resource
     * Name (ARN). ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * .
     * </p>
     * <p>
     * For example,
     * <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>
     * .
     * </p>
     * <p>
     * Valid values for <code>resource-type</code> are:
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
     *            Returns a list of all tags associated with the specified
     *            Amazon Resource Name (ARN). ARNs have the format
     *            <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *            .
     *            </p>
     *            <p>
     *            For example,
     *            <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>
     *            .
     *            </p>
     *            <p>
     *            Valid values for <code>resource-type</code> are:
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
     * Returns a list of all tags associated with the specified Amazon Resource
     * Name (ARN). ARNs have the format
     * <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     * .
     * </p>
     * <p>
     * For example,
     * <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>
     * .
     * </p>
     * <p>
     * Valid values for <code>resource-type</code> are:
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
     *            Returns a list of all tags associated with the specified
     *            Amazon Resource Name (ARN). ARNs have the format
     *            <code>arn:partition:service:region:account-id:resource-type/resource-id</code>
     *            .
     *            </p>
     *            <p>
     *            For example,
     *            <code>arn:aws:transcribe:us-west-2:111122223333:transcription-job/transcription-job-name</code>
     *            .
     *            </p>
     *            <p>
     *            Valid values for <code>resource-type</code> are:
     *            <code>transcription-job</code>,
     *            <code>medical-transcription-job</code>,
     *            <code>vocabulary</code>, <code>medical-vocabulary</code>,
     *            <code>vocabulary-filter</code>, and
     *            <code>language-model</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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
            sb.append("ResourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
