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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the result metrics for the test data associated with an
 * documentation classifier.
 * </p>
 */
public class ClassifierEvaluationMetrics implements Serializable {
    /**
     * <p>
     * The fraction of the labels that were correct recognized. It is computed
     * by dividing the number of labels in the test documents that were
     * correctly recognized by the total number of labels in the test documents.
     * </p>
     */
    private Double accuracy;

    /**
     * <p>
     * A measure of the usefulness of the classifier results in the test data.
     * High precision means that the classifier returned substantially more
     * relevant results than irrelevant ones.
     * </p>
     */
    private Double precision;

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data.
     * High recall means that the classifier returned most of the relevant
     * results.
     * </p>
     */
    private Double recall;

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data.
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
     * relevant results than irrelevant ones. Unlike the Precision metric which
     * comes from averaging the precision of all available labels, this is based
     * on the overall score of all precision scores added together.
     * </p>
     */
    private Double microPrecision;

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data.
     * High recall means that the classifier returned most of the relevant
     * results. Specifically, this indicates how many of the correct categories
     * in the text that the model can predict. It is a percentage of correct
     * categories in the text that can found. Instead of averaging the recall
     * scores of all labels (as with Recall), micro Recall is based on the
     * overall score of all recall scores added together.
     * </p>
     */
    private Double microRecall;

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data.
     * It is a combination of the <code>Micro Precision</code> and
     * <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the
     * harmonic mean of the two scores. The highest score is 1, and the worst
     * score is 0.
     * </p>
     */
    private Double microF1Score;

    /**
     * <p>
     * Indicates the fraction of labels that are incorrectly predicted. Also
     * seen as the fraction of wrong labels compared to the total number of
     * labels. Scores closer to zero are better.
     * </p>
     */
    private Double hammingLoss;

    /**
     * <p>
     * The fraction of the labels that were correct recognized. It is computed
     * by dividing the number of labels in the test documents that were
     * correctly recognized by the total number of labels in the test documents.
     * </p>
     *
     * @return <p>
     *         The fraction of the labels that were correct recognized. It is
     *         computed by dividing the number of labels in the test documents
     *         that were correctly recognized by the total number of labels in
     *         the test documents.
     *         </p>
     */
    public Double getAccuracy() {
        return accuracy;
    }

    /**
     * <p>
     * The fraction of the labels that were correct recognized. It is computed
     * by dividing the number of labels in the test documents that were
     * correctly recognized by the total number of labels in the test documents.
     * </p>
     *
     * @param accuracy <p>
     *            The fraction of the labels that were correct recognized. It is
     *            computed by dividing the number of labels in the test
     *            documents that were correctly recognized by the total number
     *            of labels in the test documents.
     *            </p>
     */
    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * <p>
     * The fraction of the labels that were correct recognized. It is computed
     * by dividing the number of labels in the test documents that were
     * correctly recognized by the total number of labels in the test documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accuracy <p>
     *            The fraction of the labels that were correct recognized. It is
     *            computed by dividing the number of labels in the test
     *            documents that were correctly recognized by the total number
     *            of labels in the test documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierEvaluationMetrics withAccuracy(Double accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * <p>
     * A measure of the usefulness of the classifier results in the test data.
     * High precision means that the classifier returned substantially more
     * relevant results than irrelevant ones.
     * </p>
     *
     * @return <p>
     *         A measure of the usefulness of the classifier results in the test
     *         data. High precision means that the classifier returned
     *         substantially more relevant results than irrelevant ones.
     *         </p>
     */
    public Double getPrecision() {
        return precision;
    }

    /**
     * <p>
     * A measure of the usefulness of the classifier results in the test data.
     * High precision means that the classifier returned substantially more
     * relevant results than irrelevant ones.
     * </p>
     *
     * @param precision <p>
     *            A measure of the usefulness of the classifier results in the
     *            test data. High precision means that the classifier returned
     *            substantially more relevant results than irrelevant ones.
     *            </p>
     */
    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * A measure of the usefulness of the classifier results in the test data.
     * High precision means that the classifier returned substantially more
     * relevant results than irrelevant ones.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param precision <p>
     *            A measure of the usefulness of the classifier results in the
     *            test data. High precision means that the classifier returned
     *            substantially more relevant results than irrelevant ones.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierEvaluationMetrics withPrecision(Double precision) {
        this.precision = precision;
        return this;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data.
     * High recall means that the classifier returned most of the relevant
     * results.
     * </p>
     *
     * @return <p>
     *         A measure of how complete the classifier results are for the test
     *         data. High recall means that the classifier returned most of the
     *         relevant results.
     *         </p>
     */
    public Double getRecall() {
        return recall;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data.
     * High recall means that the classifier returned most of the relevant
     * results.
     * </p>
     *
     * @param recall <p>
     *            A measure of how complete the classifier results are for the
     *            test data. High recall means that the classifier returned most
     *            of the relevant results.
     *            </p>
     */
    public void setRecall(Double recall) {
        this.recall = recall;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data.
     * High recall means that the classifier returned most of the relevant
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recall <p>
     *            A measure of how complete the classifier results are for the
     *            test data. High recall means that the classifier returned most
     *            of the relevant results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierEvaluationMetrics withRecall(Double recall) {
        this.recall = recall;
        return this;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data.
     * It is derived from the <code>Precision</code> and <code>Recall</code>
     * values. The <code>F1Score</code> is the harmonic average of the two
     * scores. The highest score is 1, and the worst score is 0.
     * </p>
     *
     * @return <p>
     *         A measure of how accurate the classifier results are for the test
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
     * A measure of how accurate the classifier results are for the test data.
     * It is derived from the <code>Precision</code> and <code>Recall</code>
     * values. The <code>F1Score</code> is the harmonic average of the two
     * scores. The highest score is 1, and the worst score is 0.
     * </p>
     *
     * @param f1Score <p>
     *            A measure of how accurate the classifier results are for the
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
     * A measure of how accurate the classifier results are for the test data.
     * It is derived from the <code>Precision</code> and <code>Recall</code>
     * values. The <code>F1Score</code> is the harmonic average of the two
     * scores. The highest score is 1, and the worst score is 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param f1Score <p>
     *            A measure of how accurate the classifier results are for the
     *            test data. It is derived from the <code>Precision</code> and
     *            <code>Recall</code> values. The <code>F1Score</code> is the
     *            harmonic average of the two scores. The highest score is 1,
     *            and the worst score is 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierEvaluationMetrics withF1Score(Double f1Score) {
        this.f1Score = f1Score;
        return this;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data.
     * High precision means that the recognizer returned substantially more
     * relevant results than irrelevant ones. Unlike the Precision metric which
     * comes from averaging the precision of all available labels, this is based
     * on the overall score of all precision scores added together.
     * </p>
     *
     * @return <p>
     *         A measure of the usefulness of the recognizer results in the test
     *         data. High precision means that the recognizer returned
     *         substantially more relevant results than irrelevant ones. Unlike
     *         the Precision metric which comes from averaging the precision of
     *         all available labels, this is based on the overall score of all
     *         precision scores added together.
     *         </p>
     */
    public Double getMicroPrecision() {
        return microPrecision;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data.
     * High precision means that the recognizer returned substantially more
     * relevant results than irrelevant ones. Unlike the Precision metric which
     * comes from averaging the precision of all available labels, this is based
     * on the overall score of all precision scores added together.
     * </p>
     *
     * @param microPrecision <p>
     *            A measure of the usefulness of the recognizer results in the
     *            test data. High precision means that the recognizer returned
     *            substantially more relevant results than irrelevant ones.
     *            Unlike the Precision metric which comes from averaging the
     *            precision of all available labels, this is based on the
     *            overall score of all precision scores added together.
     *            </p>
     */
    public void setMicroPrecision(Double microPrecision) {
        this.microPrecision = microPrecision;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data.
     * High precision means that the recognizer returned substantially more
     * relevant results than irrelevant ones. Unlike the Precision metric which
     * comes from averaging the precision of all available labels, this is based
     * on the overall score of all precision scores added together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param microPrecision <p>
     *            A measure of the usefulness of the recognizer results in the
     *            test data. High precision means that the recognizer returned
     *            substantially more relevant results than irrelevant ones.
     *            Unlike the Precision metric which comes from averaging the
     *            precision of all available labels, this is based on the
     *            overall score of all precision scores added together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierEvaluationMetrics withMicroPrecision(Double microPrecision) {
        this.microPrecision = microPrecision;
        return this;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data.
     * High recall means that the classifier returned most of the relevant
     * results. Specifically, this indicates how many of the correct categories
     * in the text that the model can predict. It is a percentage of correct
     * categories in the text that can found. Instead of averaging the recall
     * scores of all labels (as with Recall), micro Recall is based on the
     * overall score of all recall scores added together.
     * </p>
     *
     * @return <p>
     *         A measure of how complete the classifier results are for the test
     *         data. High recall means that the classifier returned most of the
     *         relevant results. Specifically, this indicates how many of the
     *         correct categories in the text that the model can predict. It is
     *         a percentage of correct categories in the text that can found.
     *         Instead of averaging the recall scores of all labels (as with
     *         Recall), micro Recall is based on the overall score of all recall
     *         scores added together.
     *         </p>
     */
    public Double getMicroRecall() {
        return microRecall;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data.
     * High recall means that the classifier returned most of the relevant
     * results. Specifically, this indicates how many of the correct categories
     * in the text that the model can predict. It is a percentage of correct
     * categories in the text that can found. Instead of averaging the recall
     * scores of all labels (as with Recall), micro Recall is based on the
     * overall score of all recall scores added together.
     * </p>
     *
     * @param microRecall <p>
     *            A measure of how complete the classifier results are for the
     *            test data. High recall means that the classifier returned most
     *            of the relevant results. Specifically, this indicates how many
     *            of the correct categories in the text that the model can
     *            predict. It is a percentage of correct categories in the text
     *            that can found. Instead of averaging the recall scores of all
     *            labels (as with Recall), micro Recall is based on the overall
     *            score of all recall scores added together.
     *            </p>
     */
    public void setMicroRecall(Double microRecall) {
        this.microRecall = microRecall;
    }

    /**
     * <p>
     * A measure of how complete the classifier results are for the test data.
     * High recall means that the classifier returned most of the relevant
     * results. Specifically, this indicates how many of the correct categories
     * in the text that the model can predict. It is a percentage of correct
     * categories in the text that can found. Instead of averaging the recall
     * scores of all labels (as with Recall), micro Recall is based on the
     * overall score of all recall scores added together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param microRecall <p>
     *            A measure of how complete the classifier results are for the
     *            test data. High recall means that the classifier returned most
     *            of the relevant results. Specifically, this indicates how many
     *            of the correct categories in the text that the model can
     *            predict. It is a percentage of correct categories in the text
     *            that can found. Instead of averaging the recall scores of all
     *            labels (as with Recall), micro Recall is based on the overall
     *            score of all recall scores added together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierEvaluationMetrics withMicroRecall(Double microRecall) {
        this.microRecall = microRecall;
        return this;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data.
     * It is a combination of the <code>Micro Precision</code> and
     * <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the
     * harmonic mean of the two scores. The highest score is 1, and the worst
     * score is 0.
     * </p>
     *
     * @return <p>
     *         A measure of how accurate the classifier results are for the test
     *         data. It is a combination of the <code>Micro Precision</code> and
     *         <code>Micro Recall</code> values. The <code>Micro F1Score</code>
     *         is the harmonic mean of the two scores. The highest score is 1,
     *         and the worst score is 0.
     *         </p>
     */
    public Double getMicroF1Score() {
        return microF1Score;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data.
     * It is a combination of the <code>Micro Precision</code> and
     * <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the
     * harmonic mean of the two scores. The highest score is 1, and the worst
     * score is 0.
     * </p>
     *
     * @param microF1Score <p>
     *            A measure of how accurate the classifier results are for the
     *            test data. It is a combination of the
     *            <code>Micro Precision</code> and <code>Micro Recall</code>
     *            values. The <code>Micro F1Score</code> is the harmonic mean of
     *            the two scores. The highest score is 1, and the worst score is
     *            0.
     *            </p>
     */
    public void setMicroF1Score(Double microF1Score) {
        this.microF1Score = microF1Score;
    }

    /**
     * <p>
     * A measure of how accurate the classifier results are for the test data.
     * It is a combination of the <code>Micro Precision</code> and
     * <code>Micro Recall</code> values. The <code>Micro F1Score</code> is the
     * harmonic mean of the two scores. The highest score is 1, and the worst
     * score is 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param microF1Score <p>
     *            A measure of how accurate the classifier results are for the
     *            test data. It is a combination of the
     *            <code>Micro Precision</code> and <code>Micro Recall</code>
     *            values. The <code>Micro F1Score</code> is the harmonic mean of
     *            the two scores. The highest score is 1, and the worst score is
     *            0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierEvaluationMetrics withMicroF1Score(Double microF1Score) {
        this.microF1Score = microF1Score;
        return this;
    }

    /**
     * <p>
     * Indicates the fraction of labels that are incorrectly predicted. Also
     * seen as the fraction of wrong labels compared to the total number of
     * labels. Scores closer to zero are better.
     * </p>
     *
     * @return <p>
     *         Indicates the fraction of labels that are incorrectly predicted.
     *         Also seen as the fraction of wrong labels compared to the total
     *         number of labels. Scores closer to zero are better.
     *         </p>
     */
    public Double getHammingLoss() {
        return hammingLoss;
    }

    /**
     * <p>
     * Indicates the fraction of labels that are incorrectly predicted. Also
     * seen as the fraction of wrong labels compared to the total number of
     * labels. Scores closer to zero are better.
     * </p>
     *
     * @param hammingLoss <p>
     *            Indicates the fraction of labels that are incorrectly
     *            predicted. Also seen as the fraction of wrong labels compared
     *            to the total number of labels. Scores closer to zero are
     *            better.
     *            </p>
     */
    public void setHammingLoss(Double hammingLoss) {
        this.hammingLoss = hammingLoss;
    }

    /**
     * <p>
     * Indicates the fraction of labels that are incorrectly predicted. Also
     * seen as the fraction of wrong labels compared to the total number of
     * labels. Scores closer to zero are better.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hammingLoss <p>
     *            Indicates the fraction of labels that are incorrectly
     *            predicted. Also seen as the fraction of wrong labels compared
     *            to the total number of labels. Scores closer to zero are
     *            better.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierEvaluationMetrics withHammingLoss(Double hammingLoss) {
        this.hammingLoss = hammingLoss;
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
        if (getAccuracy() != null)
            sb.append("Accuracy: " + getAccuracy() + ",");
        if (getPrecision() != null)
            sb.append("Precision: " + getPrecision() + ",");
        if (getRecall() != null)
            sb.append("Recall: " + getRecall() + ",");
        if (getF1Score() != null)
            sb.append("F1Score: " + getF1Score() + ",");
        if (getMicroPrecision() != null)
            sb.append("MicroPrecision: " + getMicroPrecision() + ",");
        if (getMicroRecall() != null)
            sb.append("MicroRecall: " + getMicroRecall() + ",");
        if (getMicroF1Score() != null)
            sb.append("MicroF1Score: " + getMicroF1Score() + ",");
        if (getHammingLoss() != null)
            sb.append("HammingLoss: " + getHammingLoss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccuracy() == null) ? 0 : getAccuracy().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getRecall() == null) ? 0 : getRecall().hashCode());
        hashCode = prime * hashCode + ((getF1Score() == null) ? 0 : getF1Score().hashCode());
        hashCode = prime * hashCode
                + ((getMicroPrecision() == null) ? 0 : getMicroPrecision().hashCode());
        hashCode = prime * hashCode
                + ((getMicroRecall() == null) ? 0 : getMicroRecall().hashCode());
        hashCode = prime * hashCode
                + ((getMicroF1Score() == null) ? 0 : getMicroF1Score().hashCode());
        hashCode = prime * hashCode
                + ((getHammingLoss() == null) ? 0 : getHammingLoss().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifierEvaluationMetrics == false)
            return false;
        ClassifierEvaluationMetrics other = (ClassifierEvaluationMetrics) obj;

        if (other.getAccuracy() == null ^ this.getAccuracy() == null)
            return false;
        if (other.getAccuracy() != null && other.getAccuracy().equals(this.getAccuracy()) == false)
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
        if (other.getF1Score() == null ^ this.getF1Score() == null)
            return false;
        if (other.getF1Score() != null && other.getF1Score().equals(this.getF1Score()) == false)
            return false;
        if (other.getMicroPrecision() == null ^ this.getMicroPrecision() == null)
            return false;
        if (other.getMicroPrecision() != null
                && other.getMicroPrecision().equals(this.getMicroPrecision()) == false)
            return false;
        if (other.getMicroRecall() == null ^ this.getMicroRecall() == null)
            return false;
        if (other.getMicroRecall() != null
                && other.getMicroRecall().equals(this.getMicroRecall()) == false)
            return false;
        if (other.getMicroF1Score() == null ^ this.getMicroF1Score() == null)
            return false;
        if (other.getMicroF1Score() != null
                && other.getMicroF1Score().equals(this.getMicroF1Score()) == false)
            return false;
        if (other.getHammingLoss() == null ^ this.getHammingLoss() == null)
            return false;
        if (other.getHammingLoss() != null
                && other.getHammingLoss().equals(this.getHammingLoss()) == false)
            return false;
        return true;
    }
}
