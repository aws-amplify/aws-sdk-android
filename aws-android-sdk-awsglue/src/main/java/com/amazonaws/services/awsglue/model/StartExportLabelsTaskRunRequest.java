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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Begins an asynchronous task to export all labeled data for a particular
 * transform. This task is the only label-related API call that is not part of
 * the typical active learning workflow. You typically use
 * <code>StartExportLabelsTaskRun</code> when you want to work with all of your
 * existing labels at the same time, such as when you want to remove or change
 * labels that were previously submitted as truth. This API operation accepts
 * the <code>TransformId</code> whose labels you want to export and an Amazon
 * Simple Storage Service (Amazon S3) path to export the labels to. The
 * operation returns a <code>TaskRunId</code>. You can check on the status of
 * your task run by calling the <code>GetMLTaskRun</code> API.
 * </p>
 */
public class StartExportLabelsTaskRunRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String transformId;

    /**
     * <p>
     * The Amazon S3 path where you export the labels.
     * </p>
     */
    private String outputS3Path;

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique identifier of the machine learning transform.
     *         </p>
     */
    public String getTransformId() {
        return transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier of the machine learning transform.
     *            </p>
     */
    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    /**
     * <p>
     * The unique identifier of the machine learning transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param transformId <p>
     *            The unique identifier of the machine learning transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportLabelsTaskRunRequest withTransformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path where you export the labels.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 path where you export the labels.
     *         </p>
     */
    public String getOutputS3Path() {
        return outputS3Path;
    }

    /**
     * <p>
     * The Amazon S3 path where you export the labels.
     * </p>
     *
     * @param outputS3Path <p>
     *            The Amazon S3 path where you export the labels.
     *            </p>
     */
    public void setOutputS3Path(String outputS3Path) {
        this.outputS3Path = outputS3Path;
    }

    /**
     * <p>
     * The Amazon S3 path where you export the labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputS3Path <p>
     *            The Amazon S3 path where you export the labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartExportLabelsTaskRunRequest withOutputS3Path(String outputS3Path) {
        this.outputS3Path = outputS3Path;
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
        if (getTransformId() != null)
            sb.append("TransformId: " + getTransformId() + ",");
        if (getOutputS3Path() != null)
            sb.append("OutputS3Path: " + getOutputS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransformId() == null) ? 0 : getTransformId().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3Path() == null) ? 0 : getOutputS3Path().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExportLabelsTaskRunRequest == false)
            return false;
        StartExportLabelsTaskRunRequest other = (StartExportLabelsTaskRunRequest) obj;

        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null
                && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getOutputS3Path() == null ^ this.getOutputS3Path() == null)
            return false;
        if (other.getOutputS3Path() != null
                && other.getOutputS3Path().equals(this.getOutputS3Path()) == false)
            return false;
        return true;
    }
}
