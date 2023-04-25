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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListEvaluationFormsResult implements Serializable {
    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an
     * instance.
     * </p>
     */
    private java.util.List<EvaluationFormSummary> evaluationFormSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an
     * instance.
     * </p>
     *
     * @return <p>
     *         Provides details about a list of evaluation forms belonging to an
     *         instance.
     *         </p>
     */
    public java.util.List<EvaluationFormSummary> getEvaluationFormSummaryList() {
        return evaluationFormSummaryList;
    }

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an
     * instance.
     * </p>
     *
     * @param evaluationFormSummaryList <p>
     *            Provides details about a list of evaluation forms belonging to
     *            an instance.
     *            </p>
     */
    public void setEvaluationFormSummaryList(
            java.util.Collection<EvaluationFormSummary> evaluationFormSummaryList) {
        if (evaluationFormSummaryList == null) {
            this.evaluationFormSummaryList = null;
            return;
        }

        this.evaluationFormSummaryList = new java.util.ArrayList<EvaluationFormSummary>(
                evaluationFormSummaryList);
    }

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationFormSummaryList <p>
     *            Provides details about a list of evaluation forms belonging to
     *            an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEvaluationFormsResult withEvaluationFormSummaryList(
            EvaluationFormSummary... evaluationFormSummaryList) {
        if (getEvaluationFormSummaryList() == null) {
            this.evaluationFormSummaryList = new java.util.ArrayList<EvaluationFormSummary>(
                    evaluationFormSummaryList.length);
        }
        for (EvaluationFormSummary value : evaluationFormSummaryList) {
            this.evaluationFormSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationFormSummaryList <p>
     *            Provides details about a list of evaluation forms belonging to
     *            an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEvaluationFormsResult withEvaluationFormSummaryList(
            java.util.Collection<EvaluationFormSummary> evaluationFormSummaryList) {
        setEvaluationFormSummaryList(evaluationFormSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEvaluationFormsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getEvaluationFormSummaryList() != null)
            sb.append("EvaluationFormSummaryList: " + getEvaluationFormSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEvaluationFormSummaryList() == null) ? 0 : getEvaluationFormSummaryList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEvaluationFormsResult == false)
            return false;
        ListEvaluationFormsResult other = (ListEvaluationFormsResult) obj;

        if (other.getEvaluationFormSummaryList() == null
                ^ this.getEvaluationFormSummaryList() == null)
            return false;
        if (other.getEvaluationFormSummaryList() != null
                && other.getEvaluationFormSummaryList().equals(this.getEvaluationFormSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
