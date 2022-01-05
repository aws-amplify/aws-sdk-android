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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * The evaluation results for the training of a model.
 * </p>
 */
public class EvaluationResult implements Serializable {
    /**
     * <p>
     * The F1 score for the evaluation of all labels. The F1 score metric
     * evaluates the overall precision and recall performance of the model as a
     * single value. A higher value indicates better precision and recall
     * performance. A lower score indicates that precision, recall, or both are
     * performing poorly.
     * </p>
     */
    private Float f1Score;

    /**
     * <p>
     * The S3 bucket that contains the training summary.
     * </p>
     */
    private Summary summary;

    /**
     * <p>
     * The F1 score for the evaluation of all labels. The F1 score metric
     * evaluates the overall precision and recall performance of the model as a
     * single value. A higher value indicates better precision and recall
     * performance. A lower score indicates that precision, recall, or both are
     * performing poorly.
     * </p>
     *
     * @return <p>
     *         The F1 score for the evaluation of all labels. The F1 score
     *         metric evaluates the overall precision and recall performance of
     *         the model as a single value. A higher value indicates better
     *         precision and recall performance. A lower score indicates that
     *         precision, recall, or both are performing poorly.
     *         </p>
     */
    public Float getF1Score() {
        return f1Score;
    }

    /**
     * <p>
     * The F1 score for the evaluation of all labels. The F1 score metric
     * evaluates the overall precision and recall performance of the model as a
     * single value. A higher value indicates better precision and recall
     * performance. A lower score indicates that precision, recall, or both are
     * performing poorly.
     * </p>
     *
     * @param f1Score <p>
     *            The F1 score for the evaluation of all labels. The F1 score
     *            metric evaluates the overall precision and recall performance
     *            of the model as a single value. A higher value indicates
     *            better precision and recall performance. A lower score
     *            indicates that precision, recall, or both are performing
     *            poorly.
     *            </p>
     */
    public void setF1Score(Float f1Score) {
        this.f1Score = f1Score;
    }

    /**
     * <p>
     * The F1 score for the evaluation of all labels. The F1 score metric
     * evaluates the overall precision and recall performance of the model as a
     * single value. A higher value indicates better precision and recall
     * performance. A lower score indicates that precision, recall, or both are
     * performing poorly.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param f1Score <p>
     *            The F1 score for the evaluation of all labels. The F1 score
     *            metric evaluates the overall precision and recall performance
     *            of the model as a single value. A higher value indicates
     *            better precision and recall performance. A lower score
     *            indicates that precision, recall, or both are performing
     *            poorly.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withF1Score(Float f1Score) {
        this.f1Score = f1Score;
        return this;
    }

    /**
     * <p>
     * The S3 bucket that contains the training summary.
     * </p>
     *
     * @return <p>
     *         The S3 bucket that contains the training summary.
     *         </p>
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     * <p>
     * The S3 bucket that contains the training summary.
     * </p>
     *
     * @param summary <p>
     *            The S3 bucket that contains the training summary.
     *            </p>
     */
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The S3 bucket that contains the training summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summary <p>
     *            The S3 bucket that contains the training summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationResult withSummary(Summary summary) {
        this.summary = summary;
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
        if (getF1Score() != null)
            sb.append("F1Score: " + getF1Score() + ",");
        if (getSummary() != null)
            sb.append("Summary: " + getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getF1Score() == null) ? 0 : getF1Score().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResult == false)
            return false;
        EvaluationResult other = (EvaluationResult) obj;

        if (other.getF1Score() == null ^ this.getF1Score() == null)
            return false;
        if (other.getF1Score() != null && other.getF1Score().equals(this.getF1Score()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }
}
