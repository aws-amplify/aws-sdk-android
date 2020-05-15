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

/**
 * <p>
 * The parameters to configure the find matches transform.
 * </p>
 */
public class FindMatchesParameters implements Serializable {
    /**
     * <p>
     * The name of a column that uniquely identifies rows in the source table.
     * Used to help identify matching records.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String primaryKeyColumnName;

    /**
     * <p>
     * The value selected when tuning your transform for a balance between
     * precision and recall. A value of 0.5 means no preference; a value of 1.0
     * means a bias purely for precision, and a value of 0.0 means a bias for
     * recall. Because this is a tradeoff, choosing values close to 1.0 means
     * very low recall, and choosing values close to 0.0 results in very low
     * precision.
     * </p>
     * <p>
     * The precision metric indicates how often your model is correct when it
     * predicts a match.
     * </p>
     * <p>
     * The recall metric indicates that for an actual match, how often your
     * model predicts the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Double precisionRecallTradeoff;

    /**
     * <p>
     * The value that is selected when tuning your transform for a balance
     * between accuracy and cost. A value of 0.5 means that the system balances
     * accuracy and cost concerns. A value of 1.0 means a bias purely for
     * accuracy, which typically results in a higher cost, sometimes
     * substantially higher. A value of 0.0 means a bias purely for cost, which
     * results in a less accurate <code>FindMatches</code> transform, sometimes
     * with unacceptable accuracy.
     * </p>
     * <p>
     * Accuracy measures how well the transform finds true positives and true
     * negatives. Increasing accuracy requires more machine resources and cost.
     * But it also results in increased recall.
     * </p>
     * <p>
     * Cost measures how many compute resources, and thus money, are consumed to
     * run the transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     */
    private Double accuracyCostTradeoff;

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided
     * labels from users. If the value is <code>True</code>, the
     * <code>find matches</code> transform forces the output to match the
     * provided labels. The results override the normal conflation results. If
     * the value is <code>False</code>, the <code>find matches</code> transform
     * does not ensure all the labels provided are respected, and the results
     * rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation
     * execution time.
     * </p>
     */
    private Boolean enforceProvidedLabels;

    /**
     * <p>
     * The name of a column that uniquely identifies rows in the source table.
     * Used to help identify matching records.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of a column that uniquely identifies rows in the source
     *         table. Used to help identify matching records.
     *         </p>
     */
    public String getPrimaryKeyColumnName() {
        return primaryKeyColumnName;
    }

    /**
     * <p>
     * The name of a column that uniquely identifies rows in the source table.
     * Used to help identify matching records.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param primaryKeyColumnName <p>
     *            The name of a column that uniquely identifies rows in the
     *            source table. Used to help identify matching records.
     *            </p>
     */
    public void setPrimaryKeyColumnName(String primaryKeyColumnName) {
        this.primaryKeyColumnName = primaryKeyColumnName;
    }

    /**
     * <p>
     * The name of a column that uniquely identifies rows in the source table.
     * Used to help identify matching records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param primaryKeyColumnName <p>
     *            The name of a column that uniquely identifies rows in the
     *            source table. Used to help identify matching records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesParameters withPrimaryKeyColumnName(String primaryKeyColumnName) {
        this.primaryKeyColumnName = primaryKeyColumnName;
        return this;
    }

    /**
     * <p>
     * The value selected when tuning your transform for a balance between
     * precision and recall. A value of 0.5 means no preference; a value of 1.0
     * means a bias purely for precision, and a value of 0.0 means a bias for
     * recall. Because this is a tradeoff, choosing values close to 1.0 means
     * very low recall, and choosing values close to 0.0 results in very low
     * precision.
     * </p>
     * <p>
     * The precision metric indicates how often your model is correct when it
     * predicts a match.
     * </p>
     * <p>
     * The recall metric indicates that for an actual match, how often your
     * model predicts the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The value selected when tuning your transform for a balance
     *         between precision and recall. A value of 0.5 means no preference;
     *         a value of 1.0 means a bias purely for precision, and a value of
     *         0.0 means a bias for recall. Because this is a tradeoff, choosing
     *         values close to 1.0 means very low recall, and choosing values
     *         close to 0.0 results in very low precision.
     *         </p>
     *         <p>
     *         The precision metric indicates how often your model is correct
     *         when it predicts a match.
     *         </p>
     *         <p>
     *         The recall metric indicates that for an actual match, how often
     *         your model predicts the match.
     *         </p>
     */
    public Double getPrecisionRecallTradeoff() {
        return precisionRecallTradeoff;
    }

    /**
     * <p>
     * The value selected when tuning your transform for a balance between
     * precision and recall. A value of 0.5 means no preference; a value of 1.0
     * means a bias purely for precision, and a value of 0.0 means a bias for
     * recall. Because this is a tradeoff, choosing values close to 1.0 means
     * very low recall, and choosing values close to 0.0 results in very low
     * precision.
     * </p>
     * <p>
     * The precision metric indicates how often your model is correct when it
     * predicts a match.
     * </p>
     * <p>
     * The recall metric indicates that for an actual match, how often your
     * model predicts the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param precisionRecallTradeoff <p>
     *            The value selected when tuning your transform for a balance
     *            between precision and recall. A value of 0.5 means no
     *            preference; a value of 1.0 means a bias purely for precision,
     *            and a value of 0.0 means a bias for recall. Because this is a
     *            tradeoff, choosing values close to 1.0 means very low recall,
     *            and choosing values close to 0.0 results in very low
     *            precision.
     *            </p>
     *            <p>
     *            The precision metric indicates how often your model is correct
     *            when it predicts a match.
     *            </p>
     *            <p>
     *            The recall metric indicates that for an actual match, how
     *            often your model predicts the match.
     *            </p>
     */
    public void setPrecisionRecallTradeoff(Double precisionRecallTradeoff) {
        this.precisionRecallTradeoff = precisionRecallTradeoff;
    }

    /**
     * <p>
     * The value selected when tuning your transform for a balance between
     * precision and recall. A value of 0.5 means no preference; a value of 1.0
     * means a bias purely for precision, and a value of 0.0 means a bias for
     * recall. Because this is a tradeoff, choosing values close to 1.0 means
     * very low recall, and choosing values close to 0.0 results in very low
     * precision.
     * </p>
     * <p>
     * The precision metric indicates how often your model is correct when it
     * predicts a match.
     * </p>
     * <p>
     * The recall metric indicates that for an actual match, how often your
     * model predicts the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param precisionRecallTradeoff <p>
     *            The value selected when tuning your transform for a balance
     *            between precision and recall. A value of 0.5 means no
     *            preference; a value of 1.0 means a bias purely for precision,
     *            and a value of 0.0 means a bias for recall. Because this is a
     *            tradeoff, choosing values close to 1.0 means very low recall,
     *            and choosing values close to 0.0 results in very low
     *            precision.
     *            </p>
     *            <p>
     *            The precision metric indicates how often your model is correct
     *            when it predicts a match.
     *            </p>
     *            <p>
     *            The recall metric indicates that for an actual match, how
     *            often your model predicts the match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesParameters withPrecisionRecallTradeoff(Double precisionRecallTradeoff) {
        this.precisionRecallTradeoff = precisionRecallTradeoff;
        return this;
    }

    /**
     * <p>
     * The value that is selected when tuning your transform for a balance
     * between accuracy and cost. A value of 0.5 means that the system balances
     * accuracy and cost concerns. A value of 1.0 means a bias purely for
     * accuracy, which typically results in a higher cost, sometimes
     * substantially higher. A value of 0.0 means a bias purely for cost, which
     * results in a less accurate <code>FindMatches</code> transform, sometimes
     * with unacceptable accuracy.
     * </p>
     * <p>
     * Accuracy measures how well the transform finds true positives and true
     * negatives. Increasing accuracy requires more machine resources and cost.
     * But it also results in increased recall.
     * </p>
     * <p>
     * Cost measures how many compute resources, and thus money, are consumed to
     * run the transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @return <p>
     *         The value that is selected when tuning your transform for a
     *         balance between accuracy and cost. A value of 0.5 means that the
     *         system balances accuracy and cost concerns. A value of 1.0 means
     *         a bias purely for accuracy, which typically results in a higher
     *         cost, sometimes substantially higher. A value of 0.0 means a bias
     *         purely for cost, which results in a less accurate
     *         <code>FindMatches</code> transform, sometimes with unacceptable
     *         accuracy.
     *         </p>
     *         <p>
     *         Accuracy measures how well the transform finds true positives and
     *         true negatives. Increasing accuracy requires more machine
     *         resources and cost. But it also results in increased recall.
     *         </p>
     *         <p>
     *         Cost measures how many compute resources, and thus money, are
     *         consumed to run the transform.
     *         </p>
     */
    public Double getAccuracyCostTradeoff() {
        return accuracyCostTradeoff;
    }

    /**
     * <p>
     * The value that is selected when tuning your transform for a balance
     * between accuracy and cost. A value of 0.5 means that the system balances
     * accuracy and cost concerns. A value of 1.0 means a bias purely for
     * accuracy, which typically results in a higher cost, sometimes
     * substantially higher. A value of 0.0 means a bias purely for cost, which
     * results in a less accurate <code>FindMatches</code> transform, sometimes
     * with unacceptable accuracy.
     * </p>
     * <p>
     * Accuracy measures how well the transform finds true positives and true
     * negatives. Increasing accuracy requires more machine resources and cost.
     * But it also results in increased recall.
     * </p>
     * <p>
     * Cost measures how many compute resources, and thus money, are consumed to
     * run the transform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param accuracyCostTradeoff <p>
     *            The value that is selected when tuning your transform for a
     *            balance between accuracy and cost. A value of 0.5 means that
     *            the system balances accuracy and cost concerns. A value of 1.0
     *            means a bias purely for accuracy, which typically results in a
     *            higher cost, sometimes substantially higher. A value of 0.0
     *            means a bias purely for cost, which results in a less accurate
     *            <code>FindMatches</code> transform, sometimes with
     *            unacceptable accuracy.
     *            </p>
     *            <p>
     *            Accuracy measures how well the transform finds true positives
     *            and true negatives. Increasing accuracy requires more machine
     *            resources and cost. But it also results in increased recall.
     *            </p>
     *            <p>
     *            Cost measures how many compute resources, and thus money, are
     *            consumed to run the transform.
     *            </p>
     */
    public void setAccuracyCostTradeoff(Double accuracyCostTradeoff) {
        this.accuracyCostTradeoff = accuracyCostTradeoff;
    }

    /**
     * <p>
     * The value that is selected when tuning your transform for a balance
     * between accuracy and cost. A value of 0.5 means that the system balances
     * accuracy and cost concerns. A value of 1.0 means a bias purely for
     * accuracy, which typically results in a higher cost, sometimes
     * substantially higher. A value of 0.0 means a bias purely for cost, which
     * results in a less accurate <code>FindMatches</code> transform, sometimes
     * with unacceptable accuracy.
     * </p>
     * <p>
     * Accuracy measures how well the transform finds true positives and true
     * negatives. Increasing accuracy requires more machine resources and cost.
     * But it also results in increased recall.
     * </p>
     * <p>
     * Cost measures how many compute resources, and thus money, are consumed to
     * run the transform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1<br/>
     *
     * @param accuracyCostTradeoff <p>
     *            The value that is selected when tuning your transform for a
     *            balance between accuracy and cost. A value of 0.5 means that
     *            the system balances accuracy and cost concerns. A value of 1.0
     *            means a bias purely for accuracy, which typically results in a
     *            higher cost, sometimes substantially higher. A value of 0.0
     *            means a bias purely for cost, which results in a less accurate
     *            <code>FindMatches</code> transform, sometimes with
     *            unacceptable accuracy.
     *            </p>
     *            <p>
     *            Accuracy measures how well the transform finds true positives
     *            and true negatives. Increasing accuracy requires more machine
     *            resources and cost. But it also results in increased recall.
     *            </p>
     *            <p>
     *            Cost measures how many compute resources, and thus money, are
     *            consumed to run the transform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesParameters withAccuracyCostTradeoff(Double accuracyCostTradeoff) {
        this.accuracyCostTradeoff = accuracyCostTradeoff;
        return this;
    }

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided
     * labels from users. If the value is <code>True</code>, the
     * <code>find matches</code> transform forces the output to match the
     * provided labels. The results override the normal conflation results. If
     * the value is <code>False</code>, the <code>find matches</code> transform
     * does not ensure all the labels provided are respected, and the results
     * rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation
     * execution time.
     * </p>
     *
     * @return <p>
     *         The value to switch on or off to force the output to match the
     *         provided labels from users. If the value is <code>True</code>,
     *         the <code>find matches</code> transform forces the output to
     *         match the provided labels. The results override the normal
     *         conflation results. If the value is <code>False</code>, the
     *         <code>find matches</code> transform does not ensure all the
     *         labels provided are respected, and the results rely on the
     *         trained model.
     *         </p>
     *         <p>
     *         Note that setting this value to true may increase the conflation
     *         execution time.
     *         </p>
     */
    public Boolean isEnforceProvidedLabels() {
        return enforceProvidedLabels;
    }

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided
     * labels from users. If the value is <code>True</code>, the
     * <code>find matches</code> transform forces the output to match the
     * provided labels. The results override the normal conflation results. If
     * the value is <code>False</code>, the <code>find matches</code> transform
     * does not ensure all the labels provided are respected, and the results
     * rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation
     * execution time.
     * </p>
     *
     * @return <p>
     *         The value to switch on or off to force the output to match the
     *         provided labels from users. If the value is <code>True</code>,
     *         the <code>find matches</code> transform forces the output to
     *         match the provided labels. The results override the normal
     *         conflation results. If the value is <code>False</code>, the
     *         <code>find matches</code> transform does not ensure all the
     *         labels provided are respected, and the results rely on the
     *         trained model.
     *         </p>
     *         <p>
     *         Note that setting this value to true may increase the conflation
     *         execution time.
     *         </p>
     */
    public Boolean getEnforceProvidedLabels() {
        return enforceProvidedLabels;
    }

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided
     * labels from users. If the value is <code>True</code>, the
     * <code>find matches</code> transform forces the output to match the
     * provided labels. The results override the normal conflation results. If
     * the value is <code>False</code>, the <code>find matches</code> transform
     * does not ensure all the labels provided are respected, and the results
     * rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation
     * execution time.
     * </p>
     *
     * @param enforceProvidedLabels <p>
     *            The value to switch on or off to force the output to match the
     *            provided labels from users. If the value is <code>True</code>,
     *            the <code>find matches</code> transform forces the output to
     *            match the provided labels. The results override the normal
     *            conflation results. If the value is <code>False</code>, the
     *            <code>find matches</code> transform does not ensure all the
     *            labels provided are respected, and the results rely on the
     *            trained model.
     *            </p>
     *            <p>
     *            Note that setting this value to true may increase the
     *            conflation execution time.
     *            </p>
     */
    public void setEnforceProvidedLabels(Boolean enforceProvidedLabels) {
        this.enforceProvidedLabels = enforceProvidedLabels;
    }

    /**
     * <p>
     * The value to switch on or off to force the output to match the provided
     * labels from users. If the value is <code>True</code>, the
     * <code>find matches</code> transform forces the output to match the
     * provided labels. The results override the normal conflation results. If
     * the value is <code>False</code>, the <code>find matches</code> transform
     * does not ensure all the labels provided are respected, and the results
     * rely on the trained model.
     * </p>
     * <p>
     * Note that setting this value to true may increase the conflation
     * execution time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enforceProvidedLabels <p>
     *            The value to switch on or off to force the output to match the
     *            provided labels from users. If the value is <code>True</code>,
     *            the <code>find matches</code> transform forces the output to
     *            match the provided labels. The results override the normal
     *            conflation results. If the value is <code>False</code>, the
     *            <code>find matches</code> transform does not ensure all the
     *            labels provided are respected, and the results rely on the
     *            trained model.
     *            </p>
     *            <p>
     *            Note that setting this value to true may increase the
     *            conflation execution time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FindMatchesParameters withEnforceProvidedLabels(Boolean enforceProvidedLabels) {
        this.enforceProvidedLabels = enforceProvidedLabels;
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
        if (getPrimaryKeyColumnName() != null)
            sb.append("PrimaryKeyColumnName: " + getPrimaryKeyColumnName() + ",");
        if (getPrecisionRecallTradeoff() != null)
            sb.append("PrecisionRecallTradeoff: " + getPrecisionRecallTradeoff() + ",");
        if (getAccuracyCostTradeoff() != null)
            sb.append("AccuracyCostTradeoff: " + getAccuracyCostTradeoff() + ",");
        if (getEnforceProvidedLabels() != null)
            sb.append("EnforceProvidedLabels: " + getEnforceProvidedLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPrimaryKeyColumnName() == null) ? 0 : getPrimaryKeyColumnName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrecisionRecallTradeoff() == null) ? 0 : getPrecisionRecallTradeoff()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAccuracyCostTradeoff() == null) ? 0 : getAccuracyCostTradeoff().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnforceProvidedLabels() == null) ? 0 : getEnforceProvidedLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindMatchesParameters == false)
            return false;
        FindMatchesParameters other = (FindMatchesParameters) obj;

        if (other.getPrimaryKeyColumnName() == null ^ this.getPrimaryKeyColumnName() == null)
            return false;
        if (other.getPrimaryKeyColumnName() != null
                && other.getPrimaryKeyColumnName().equals(this.getPrimaryKeyColumnName()) == false)
            return false;
        if (other.getPrecisionRecallTradeoff() == null ^ this.getPrecisionRecallTradeoff() == null)
            return false;
        if (other.getPrecisionRecallTradeoff() != null
                && other.getPrecisionRecallTradeoff().equals(this.getPrecisionRecallTradeoff()) == false)
            return false;
        if (other.getAccuracyCostTradeoff() == null ^ this.getAccuracyCostTradeoff() == null)
            return false;
        if (other.getAccuracyCostTradeoff() != null
                && other.getAccuracyCostTradeoff().equals(this.getAccuracyCostTradeoff()) == false)
            return false;
        if (other.getEnforceProvidedLabels() == null ^ this.getEnforceProvidedLabels() == null)
            return false;
        if (other.getEnforceProvidedLabels() != null
                && other.getEnforceProvidedLabels().equals(this.getEnforceProvidedLabels()) == false)
            return false;
        return true;
    }
}
