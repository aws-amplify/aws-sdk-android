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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables you to provide additional labels (examples of truth) to be used to
 * teach the machine learning transform and improve its quality. This API
 * operation is generally used as part of the active learning workflow that
 * starts with the <code>StartMLLabelingSetGenerationTaskRun</code> call and
 * that ultimately results in improving the quality of your machine learning
 * transform.
 * </p>
 * <p>
 * After the <code>StartMLLabelingSetGenerationTaskRun</code> finishes, AWS Glue
 * machine learning will have generated a series of questions for humans to
 * answer. (Answering these questions is often called 'labeling' in the machine
 * learning workflows). In the case of the <code>FindMatches</code> transform,
 * these questions are of the form, “What is the correct way to group these rows
 * together into groups composed entirely of matching records?” After the
 * labeling process is finished, users upload their answers/labels with a call
 * to <code>StartImportLabelsTaskRun</code>. After
 * <code>StartImportLabelsTaskRun</code> finishes, all future runs of the
 * machine learning transform use the new and improved labels and perform a
 * higher-quality transformation.
 * </p>
 * <p>
 * By default, <code>StartMLLabelingSetGenerationTaskRun</code> continually
 * learns from and combines all labels that you upload unless you set
 * <code>Replace</code> to true. If you set <code>Replace</code> to true,
 * <code>StartImportLabelsTaskRun</code> deletes and forgets all previously
 * uploaded labels and learns only from the exact set that you upload. Replacing
 * labels can be helpful if you realize that you previously uploaded incorrect
 * labels, and you believe that they are having a negative effect on your
 * transform quality.
 * </p>
 * <p>
 * You can check on the status of your task run by calling the
 * <code>GetMLTaskRun</code> operation.
 * </p>
 */
public class StartImportLabelsTaskRunRequest extends AmazonWebServiceRequest implements
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
     * The Amazon Simple Storage Service (Amazon S3) path from where you import
     * the labels.
     * </p>
     */
    private String inputS3Path;

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     */
    private Boolean replaceAllLabels;

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
    public StartImportLabelsTaskRunRequest withTransformId(String transformId) {
        this.transformId = transformId;
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you import
     * the labels.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Storage Service (Amazon S3) path from where you
     *         import the labels.
     *         </p>
     */
    public String getInputS3Path() {
        return inputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you import
     * the labels.
     * </p>
     *
     * @param inputS3Path <p>
     *            The Amazon Simple Storage Service (Amazon S3) path from where
     *            you import the labels.
     *            </p>
     */
    public void setInputS3Path(String inputS3Path) {
        this.inputS3Path = inputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you import
     * the labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputS3Path <p>
     *            The Amazon Simple Storage Service (Amazon S3) path from where
     *            you import the labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartImportLabelsTaskRunRequest withInputS3Path(String inputS3Path) {
        this.inputS3Path = inputS3Path;
        return this;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     *
     * @return <p>
     *         Indicates whether to overwrite your existing labels.
     *         </p>
     */
    public Boolean isReplaceAllLabels() {
        return replaceAllLabels;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     *
     * @return <p>
     *         Indicates whether to overwrite your existing labels.
     *         </p>
     */
    public Boolean getReplaceAllLabels() {
        return replaceAllLabels;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     *
     * @param replaceAllLabels <p>
     *            Indicates whether to overwrite your existing labels.
     *            </p>
     */
    public void setReplaceAllLabels(Boolean replaceAllLabels) {
        this.replaceAllLabels = replaceAllLabels;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replaceAllLabels <p>
     *            Indicates whether to overwrite your existing labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartImportLabelsTaskRunRequest withReplaceAllLabels(Boolean replaceAllLabels) {
        this.replaceAllLabels = replaceAllLabels;
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
        if (getInputS3Path() != null)
            sb.append("InputS3Path: " + getInputS3Path() + ",");
        if (getReplaceAllLabels() != null)
            sb.append("ReplaceAllLabels: " + getReplaceAllLabels());
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
                + ((getInputS3Path() == null) ? 0 : getInputS3Path().hashCode());
        hashCode = prime * hashCode
                + ((getReplaceAllLabels() == null) ? 0 : getReplaceAllLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportLabelsTaskRunRequest == false)
            return false;
        StartImportLabelsTaskRunRequest other = (StartImportLabelsTaskRunRequest) obj;

        if (other.getTransformId() == null ^ this.getTransformId() == null)
            return false;
        if (other.getTransformId() != null
                && other.getTransformId().equals(this.getTransformId()) == false)
            return false;
        if (other.getInputS3Path() == null ^ this.getInputS3Path() == null)
            return false;
        if (other.getInputS3Path() != null
                && other.getInputS3Path().equals(this.getInputS3Path()) == false)
            return false;
        if (other.getReplaceAllLabels() == null ^ this.getReplaceAllLabels() == null)
            return false;
        if (other.getReplaceAllLabels() != null
                && other.getReplaceAllLabels().equals(this.getReplaceAllLabels()) == false)
            return false;
        return true;
    }
}
