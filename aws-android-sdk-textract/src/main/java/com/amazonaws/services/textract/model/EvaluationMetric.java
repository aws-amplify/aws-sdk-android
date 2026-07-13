/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * The evaluation metrics (F1 score, Precision, and Recall) for an adapter
 * version.
 * </p>
 */
public class EvaluationMetric implements Serializable {
    /**
     * <p>
     * The F1 score for an adapter version.
     * </p>
     */
    private Float f1Score;

    /**
     * <p>
     * The Precision score for an adapter version.
     * </p>
     */
    private Float precision;

    /**
     * <p>
     * The Recall score for an adapter version.
     * </p>
     */
    private Float recall;

    /**
     * <p>
     * The F1 score for an adapter version.
     * </p>
     *
     * @return <p>
     *         The F1 score for an adapter version.
     *         </p>
     */
    public Float getF1Score() {
        return f1Score;
    }

    /**
     * <p>
     * The F1 score for an adapter version.
     * </p>
     *
     * @param f1Score <p>
     *            The F1 score for an adapter version.
     *            </p>
     */
    public void setF1Score(Float f1Score) {
        this.f1Score = f1Score;
    }

    /**
     * <p>
     * The F1 score for an adapter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param f1Score <p>
     *            The F1 score for an adapter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationMetric withF1Score(Float f1Score) {
        this.f1Score = f1Score;
        return this;
    }

    /**
     * <p>
     * The Precision score for an adapter version.
     * </p>
     *
     * @return <p>
     *         The Precision score for an adapter version.
     *         </p>
     */
    public Float getPrecision() {
        return precision;
    }

    /**
     * <p>
     * The Precision score for an adapter version.
     * </p>
     *
     * @param precision <p>
     *            The Precision score for an adapter version.
     *            </p>
     */
    public void setPrecision(Float precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * The Precision score for an adapter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param precision <p>
     *            The Precision score for an adapter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationMetric withPrecision(Float precision) {
        this.precision = precision;
        return this;
    }

    /**
     * <p>
     * The Recall score for an adapter version.
     * </p>
     *
     * @return <p>
     *         The Recall score for an adapter version.
     *         </p>
     */
    public Float getRecall() {
        return recall;
    }

    /**
     * <p>
     * The Recall score for an adapter version.
     * </p>
     *
     * @param recall <p>
     *            The Recall score for an adapter version.
     *            </p>
     */
    public void setRecall(Float recall) {
        this.recall = recall;
    }

    /**
     * <p>
     * The Recall score for an adapter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recall <p>
     *            The Recall score for an adapter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EvaluationMetric withRecall(Float recall) {
        this.recall = recall;
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
        if (getPrecision() != null)
            sb.append("Precision: " + getPrecision() + ",");
        if (getRecall() != null)
            sb.append("Recall: " + getRecall());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getF1Score() == null) ? 0 : getF1Score().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getRecall() == null) ? 0 : getRecall().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationMetric == false)
            return false;
        EvaluationMetric other = (EvaluationMetric) obj;

        if (other.getF1Score() == null ^ this.getF1Score() == null)
            return false;
        if (other.getF1Score() != null && other.getF1Score().equals(this.getF1Score()) == false)
            return false;
        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null
                && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        if (other.getRecall() == null ^ this.getRecall() == null)
            return false;
        if (other.getRecall() != null && other.getRecall().equals(this.getRecall()) == false)
            return false;
        return true;
    }
}
