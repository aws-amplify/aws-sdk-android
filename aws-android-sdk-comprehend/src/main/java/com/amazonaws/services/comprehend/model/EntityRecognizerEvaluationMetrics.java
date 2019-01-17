/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed information about the accuracy of an entity recognizer.
 * </p>
 */
public class EntityRecognizerEvaluationMetrics implements Serializable {
    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data.
     * High precision means that the recognizer returned substantially more
     * relevant results than irrelevant ones.
     * </p>
     */
    private Double precision;

    /**
     * <p>
     * A measure of how complete the recognizer results are for the test data.
     * High recall means that the recognizer returned most of the relevant
     * results.
     * </p>
     */
    private Double recall;

    /**
     * <p>
     * A measure of how accurate the recognizer results are for the test data.
     * It is derived from the <code>Precision</code> and <code>Recall</code>
     * values. The <code>F1Score</code> is the harmonic average of the two
     * scores. The highest score is 1, and the worst score is 0.
     * </p>
     */
    private Double f1Score;

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data.
     * High precision means that the recognizer returned substantially more
     * relevant results than irrelevant ones.
     * </p>
     *
     * @return <p>
     *         A measure of the usefulness of the recognizer results in the test
     *         data. High precision means that the recognizer returned
     *         substantially more relevant results than irrelevant ones.
     *         </p>
     */
    public Double getPrecision() {
        return precision;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data.
     * High precision means that the recognizer returned substantially more
     * relevant results than irrelevant ones.
     * </p>
     *
     * @param precision <p>
     *            A measure of the usefulness of the recognizer results in the
     *            test data. High precision means that the recognizer returned
     *            substantially more relevant results than irrelevant ones.
     *            </p>
     */
    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data.
     * High precision means that the recognizer returned substantially more
     * relevant results than irrelevant ones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param precision <p>
     *            A measure of the usefulness of the recognizer results in the
     *            test data. High precision means that the recognizer returned
     *            substantially more relevant results than irrelevant ones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerEvaluationMetrics withPrecision(Double precision) {
        this.precision = precision;
        return this;
    }

    /**
     * <p>
     * A measure of how complete the recognizer results are for the test data.
     * High recall means that the recognizer returned most of the relevant
     * results.
     * </p>
     *
     * @return <p>
     *         A measure of how complete the recognizer results are for the test
     *         data. High recall means that the recognizer returned most of the
     *         relevant results.
     *         </p>
     */
    public Double getRecall() {
        return recall;
    }

    /**
     * <p>
     * A measure of how complete the recognizer results are for the test data.
     * High recall means that the recognizer returned most of the relevant
     * results.
     * </p>
     *
     * @param recall <p>
     *            A measure of how complete the recognizer results are for the
     *            test data. High recall means that the recognizer returned most
     *            of the relevant results.
     *            </p>
     */
    public void setRecall(Double recall) {
        this.recall = recall;
    }

    /**
     * <p>
     * A measure of how complete the recognizer results are for the test data.
     * High recall means that the recognizer returned most of the relevant
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recall <p>
     *            A measure of how complete the recognizer results are for the
     *            test data. High recall means that the recognizer returned most
     *            of the relevant results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerEvaluationMetrics withRecall(Double recall) {
        this.recall = recall;
        return this;
    }

    /**
     * <p>
     * A measure of how accurate the recognizer results are for the test data.
     * It is derived from the <code>Precision</code> and <code>Recall</code>
     * values. The <code>F1Score</code> is the harmonic average of the two
     * scores. The highest score is 1, and the worst score is 0.
     * </p>
     *
     * @return <p>
     *         A measure of how accurate the recognizer results are for the test
     *         data. It is derived from the <code>Precision</code> and
     *         <code>Recall</code> values. The <code>F1Score</code> is the
     *         harmonic average of the two scores. The highest score is 1, and
     *         the worst score is 0.
     *         </p>
     */
    public Double getF1Score() {
        return f1Score;
    }

    /**
     * <p>
     * A measure of how accurate the recognizer results are for the test data.
     * It is derived from the <code>Precision</code> and <code>Recall</code>
     * values. The <code>F1Score</code> is the harmonic average of the two
     * scores. The highest score is 1, and the worst score is 0.
     * </p>
     *
     * @param f1Score <p>
     *            A measure of how accurate the recognizer results are for the
     *            test data. It is derived from the <code>Precision</code> and
     *            <code>Recall</code> values. The <code>F1Score</code> is the
     *            harmonic average of the two scores. The highest score is 1,
     *            and the worst score is 0.
     *            </p>
     */
    public void setF1Score(Double f1Score) {
        this.f1Score = f1Score;
    }

    /**
     * <p>
     * A measure of how accurate the recognizer results are for the test data.
     * It is derived from the <code>Precision</code> and <code>Recall</code>
     * values. The <code>F1Score</code> is the harmonic average of the two
     * scores. The highest score is 1, and the worst score is 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param f1Score <p>
     *            A measure of how accurate the recognizer results are for the
     *            test data. It is derived from the <code>Precision</code> and
     *            <code>Recall</code> values. The <code>F1Score</code> is the
     *            harmonic average of the two scores. The highest score is 1,
     *            and the worst score is 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerEvaluationMetrics withF1Score(Double f1Score) {
        this.f1Score = f1Score;
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
        if (getPrecision() != null)
            sb.append("Precision: " + getPrecision() + ",");
        if (getRecall() != null)
            sb.append("Recall: " + getRecall() + ",");
        if (getF1Score() != null)
            sb.append("F1Score: " + getF1Score());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getRecall() == null) ? 0 : getRecall().hashCode());
        hashCode = prime * hashCode + ((getF1Score() == null) ? 0 : getF1Score().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerEvaluationMetrics == false)
            return false;
        EntityRecognizerEvaluationMetrics other = (EntityRecognizerEvaluationMetrics) obj;

        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null
                && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        if (other.getRecall() == null ^ this.getRecall() == null)
            return false;
        if (other.getRecall() != null && other.getRecall().equals(this.getRecall()) == false)
            return false;
        if (other.getF1Score() == null ^ this.getF1Score() == null)
            return false;
        if (other.getF1Score() != null && other.getF1Score().equals(this.getF1Score()) == false)
            return false;
        return true;
    }
}
