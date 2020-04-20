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

/**
 * <p>
 * The evaluation metrics for the find matches algorithm. The quality of your
 * machine learning transform is measured by getting your transform to predict
 * some matches and comparing the results to known matches from the same
 * dataset. The quality metrics are based on a subset of your data, so they are
 * not precise.
 * </p>
 */
public class FindMatchesMetrics implements Serializable {
    /**
     * <p>
     * The area under the precision/recall curve (AUPRC) is a single number
     * measuring the overall quality of the transform, that is independent of
     * the choice made for precision vs. recall. Higher values indicate that you
     * have a more attractive precision vs. recall tradeoff.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Double areaUnderPRCurve;

    /**
     * <p>
     * The precision metric indicates when often your transform is correct when
     * it predicts a match. Specifically, it measures how well the transform
     * finds true positives from the total true positives possible.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Double precision;

    /**
     * <p>
     * The recall metric indicates that for an actual match, how often your
     * transform predicts the match. Specifically, it measures how well the
     * transform finds true positives from the total records in the source data.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Double recall;

    /**
     * <p>
     * The maximum F1 metric indicates the transform's accuracy between 0 and 1,
     * where 1 is the best accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/F1_score">F1 score</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Double f1;

    /**
     * <p>
     * The confusion matrix shows you what your transform is predicting
     * accurately and what types of errors it is making.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Confusion_matrix">Confusion
     * matrix</a> in Wikipedia.
     * </p>
     */
    private ConfusionMatrix confusionMatrix;

    /**
     * <p>
     * The area under the precision/recall curve (AUPRC) is a single number
     * measuring the overall quality of the transform, that is independent of
     * the choice made for precision vs. recall. Higher values indicate that you
     * have a more attractive precision vs. recall tradeoff.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The area under the precision/recall curve (AUPRC) is a single
     *         number measuring the overall quality of the transform, that is
     *         independent of the choice made for precision vs. recall. Higher
     *         values indicate that you have a more attractive precision vs.
     *         recall tradeoff.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *         >Precision and recall</a> in Wikipedia.
     *         </p>
     */
    public Double getAreaUnderPRCurve() {
        return areaUnderPRCurve;
    }

    /**
     * <p>
     * The area under the precision/recall curve (AUPRC) is a single number
     * measuring the overall quality of the transform, that is independent of
     * the choice made for precision vs. recall. Higher values indicate that you
     * have a more attractive precision vs. recall tradeoff.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param areaUnderPRCurve <p>
     *            The area under the precision/recall curve (AUPRC) is a single
     *            number measuring the overall quality of the transform, that is
     *            independent of the choice made for precision vs. recall.
     *            Higher values indicate that you have a more attractive
     *            precision vs. recall tradeoff.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *            >Precision and recall</a> in Wikipedia.
     *            </p>
     */
    public void setAreaUnderPRCurve(Double areaUnderPRCurve) {
        this.areaUnderPRCurve = areaUnderPRCurve;
    }

    /**
     * <p>
     * The area under the precision/recall curve (AUPRC) is a single number
     * measuring the overall quality of the transform, that is independent of
     * the choice made for precision vs. recall. Higher values indicate that you
     * have a more attractive precision vs. recall tradeoff.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param areaUnderPRCurve <p>
     *            The area under the precision/recall curve (AUPRC) is a single
     *            number measuring the overall quality of the transform, that is
     *            independent of the choice made for precision vs. recall.
     *            Higher values indicate that you have a more attractive
     *            precision vs. recall tradeoff.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *            >Precision and recall</a> in Wikipedia.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesMetrics withAreaUnderPRCurve(Double areaUnderPRCurve) {
        this.areaUnderPRCurve = areaUnderPRCurve;
        return this;
    }

    /**
     * <p>
     * The precision metric indicates when often your transform is correct when
     * it predicts a match. Specifically, it measures how well the transform
     * finds true positives from the total true positives possible.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The precision metric indicates when often your transform is
     *         correct when it predicts a match. Specifically, it measures how
     *         well the transform finds true positives from the total true
     *         positives possible.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *         >Precision and recall</a> in Wikipedia.
     *         </p>
     */
    public Double getPrecision() {
        return precision;
    }

    /**
     * <p>
     * The precision metric indicates when often your transform is correct when
     * it predicts a match. Specifically, it measures how well the transform
     * finds true positives from the total true positives possible.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param precision <p>
     *            The precision metric indicates when often your transform is
     *            correct when it predicts a match. Specifically, it measures
     *            how well the transform finds true positives from the total
     *            true positives possible.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *            >Precision and recall</a> in Wikipedia.
     *            </p>
     */
    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * The precision metric indicates when often your transform is correct when
     * it predicts a match. Specifically, it measures how well the transform
     * finds true positives from the total true positives possible.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param precision <p>
     *            The precision metric indicates when often your transform is
     *            correct when it predicts a match. Specifically, it measures
     *            how well the transform finds true positives from the total
     *            true positives possible.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *            >Precision and recall</a> in Wikipedia.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesMetrics withPrecision(Double precision) {
        this.precision = precision;
        return this;
    }

    /**
     * <p>
     * The recall metric indicates that for an actual match, how often your
     * transform predicts the match. Specifically, it measures how well the
     * transform finds true positives from the total records in the source data.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The recall metric indicates that for an actual match, how often
     *         your transform predicts the match. Specifically, it measures how
     *         well the transform finds true positives from the total records in
     *         the source data.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *         >Precision and recall</a> in Wikipedia.
     *         </p>
     */
    public Double getRecall() {
        return recall;
    }

    /**
     * <p>
     * The recall metric indicates that for an actual match, how often your
     * transform predicts the match. Specifically, it measures how well the
     * transform finds true positives from the total records in the source data.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param recall <p>
     *            The recall metric indicates that for an actual match, how
     *            often your transform predicts the match. Specifically, it
     *            measures how well the transform finds true positives from the
     *            total records in the source data.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *            >Precision and recall</a> in Wikipedia.
     *            </p>
     */
    public void setRecall(Double recall) {
        this.recall = recall;
    }

    /**
     * <p>
     * The recall metric indicates that for an actual match, how often your
     * transform predicts the match. Specifically, it measures how well the
     * transform finds true positives from the total records in the source data.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Precision_and_recall">Precision and
     * recall</a> in Wikipedia.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param recall <p>
     *            The recall metric indicates that for an actual match, how
     *            often your transform predicts the match. Specifically, it
     *            measures how well the transform finds true positives from the
     *            total records in the source data.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/Precision_and_recall"
     *            >Precision and recall</a> in Wikipedia.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesMetrics withRecall(Double recall) {
        this.recall = recall;
        return this;
    }

    /**
     * <p>
     * The maximum F1 metric indicates the transform's accuracy between 0 and 1,
     * where 1 is the best accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/F1_score">F1 score</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The maximum F1 metric indicates the transform's accuracy between
     *         0 and 1, where 1 is the best accuracy.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://en.wikipedia.org/wiki/F1_score">F1 score</a> in
     *         Wikipedia.
     *         </p>
     */
    public Double getF1() {
        return f1;
    }

    /**
     * <p>
     * The maximum F1 metric indicates the transform's accuracy between 0 and 1,
     * where 1 is the best accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/F1_score">F1 score</a> in Wikipedia.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param f1 <p>
     *            The maximum F1 metric indicates the transform's accuracy
     *            between 0 and 1, where 1 is the best accuracy.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/F1_score">F1 score</a> in
     *            Wikipedia.
     *            </p>
     */
    public void setF1(Double f1) {
        this.f1 = f1;
    }

    /**
     * <p>
     * The maximum F1 metric indicates the transform's accuracy between 0 and 1,
     * where 1 is the best accuracy.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/F1_score">F1 score</a> in Wikipedia.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param f1 <p>
     *            The maximum F1 metric indicates the transform's accuracy
     *            between 0 and 1, where 1 is the best accuracy.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/F1_score">F1 score</a> in
     *            Wikipedia.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesMetrics withF1(Double f1) {
        this.f1 = f1;
        return this;
    }

    /**
     * <p>
     * The confusion matrix shows you what your transform is predicting
     * accurately and what types of errors it is making.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Confusion_matrix">Confusion
     * matrix</a> in Wikipedia.
     * </p>
     *
     * @return <p>
     *         The confusion matrix shows you what your transform is predicting
     *         accurately and what types of errors it is making.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://en.wikipedia.org/wiki/Confusion_matrix">Confusion
     *         matrix</a> in Wikipedia.
     *         </p>
     */
    public ConfusionMatrix getConfusionMatrix() {
        return confusionMatrix;
    }

    /**
     * <p>
     * The confusion matrix shows you what your transform is predicting
     * accurately and what types of errors it is making.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Confusion_matrix">Confusion
     * matrix</a> in Wikipedia.
     * </p>
     *
     * @param confusionMatrix <p>
     *            The confusion matrix shows you what your transform is
     *            predicting accurately and what types of errors it is making.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/Confusion_matrix"
     *            >Confusion matrix</a> in Wikipedia.
     *            </p>
     */
    public void setConfusionMatrix(ConfusionMatrix confusionMatrix) {
        this.confusionMatrix = confusionMatrix;
    }

    /**
     * <p>
     * The confusion matrix shows you what your transform is predicting
     * accurately and what types of errors it is making.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://en.wikipedia.org/wiki/Confusion_matrix">Confusion
     * matrix</a> in Wikipedia.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param confusionMatrix <p>
     *            The confusion matrix shows you what your transform is
     *            predicting accurately and what types of errors it is making.
     *            </p>
     *            <p>
     *            For more information, see <a
     *            href="https://en.wikipedia.org/wiki/Confusion_matrix"
     *            >Confusion matrix</a> in Wikipedia.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesMetrics withConfusionMatrix(ConfusionMatrix confusionMatrix) {
        this.confusionMatrix = confusionMatrix;
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
        if (getAreaUnderPRCurve() != null)
            sb.append("AreaUnderPRCurve: " + getAreaUnderPRCurve() + ",");
        if (getPrecision() != null)
            sb.append("Precision: " + getPrecision() + ",");
        if (getRecall() != null)
            sb.append("Recall: " + getRecall() + ",");
        if (getF1() != null)
            sb.append("F1: " + getF1() + ",");
        if (getConfusionMatrix() != null)
            sb.append("ConfusionMatrix: " + getConfusionMatrix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAreaUnderPRCurve() == null) ? 0 : getAreaUnderPRCurve().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getRecall() == null) ? 0 : getRecall().hashCode());
        hashCode = prime * hashCode + ((getF1() == null) ? 0 : getF1().hashCode());
        hashCode = prime * hashCode
                + ((getConfusionMatrix() == null) ? 0 : getConfusionMatrix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindMatchesMetrics == false)
            return false;
        FindMatchesMetrics other = (FindMatchesMetrics) obj;

        if (other.getAreaUnderPRCurve() == null ^ this.getAreaUnderPRCurve() == null)
            return false;
        if (other.getAreaUnderPRCurve() != null
                && other.getAreaUnderPRCurve().equals(this.getAreaUnderPRCurve()) == false)
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
        if (other.getF1() == null ^ this.getF1() == null)
            return false;
        if (other.getF1() != null && other.getF1().equals(this.getF1()) == false)
            return false;
        if (other.getConfusionMatrix() == null ^ this.getConfusionMatrix() == null)
            return false;
        if (other.getConfusionMatrix() != null
                && other.getConfusionMatrix().equals(this.getConfusionMatrix()) == false)
            return false;
        return true;
    }
}
