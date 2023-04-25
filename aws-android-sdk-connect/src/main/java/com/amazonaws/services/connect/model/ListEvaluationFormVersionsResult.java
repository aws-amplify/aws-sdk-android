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

public class ListEvaluationFormVersionsResult implements Serializable {
    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an
     * instance.
     * </p>
     */
    private java.util.List<EvaluationFormVersionSummary> evaluationFormVersionSummaryList;

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
    public java.util.List<EvaluationFormVersionSummary> getEvaluationFormVersionSummaryList() {
        return evaluationFormVersionSummaryList;
    }

    /**
     * <p>
     * Provides details about a list of evaluation forms belonging to an
     * instance.
     * </p>
     *
     * @param evaluationFormVersionSummaryList <p>
     *            Provides details about a list of evaluation forms belonging to
     *            an instance.
     *            </p>
     */
    public void setEvaluationFormVersionSummaryList(
            java.util.Collection<EvaluationFormVersionSummary> evaluationFormVersionSummaryList) {
        if (evaluationFormVersionSummaryList == null) {
            this.evaluationFormVersionSummaryList = null;
            return;
        }

        this.evaluationFormVersionSummaryList = new java.util.ArrayList<EvaluationFormVersionSummary>(
                evaluationFormVersionSummaryList);
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
     * @param evaluationFormVersionSummaryList <p>
     *            Provides details about a list of evaluation forms belonging to
     *            an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEvaluationFormVersionsResult withEvaluationFormVersionSummaryList(
            EvaluationFormVersionSummary... evaluationFormVersionSummaryList) {
        if (getEvaluationFormVersionSummaryList() == null) {
            this.evaluationFormVersionSummaryList = new java.util.ArrayList<EvaluationFormVersionSummary>(
                    evaluationFormVersionSummaryList.length);
        }
        for (EvaluationFormVersionSummary value : evaluationFormVersionSummaryList) {
            this.evaluationFormVersionSummaryList.add(value);
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
     * @param evaluationFormVersionSummaryList <p>
     *            Provides details about a list of evaluation forms belonging to
     *            an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEvaluationFormVersionsResult withEvaluationFormVersionSummaryList(
            java.util.Collection<EvaluationFormVersionSummary> evaluationFormVersionSummaryList) {
        setEvaluationFormVersionSummaryList(evaluationFormVersionSummaryList);
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
    public ListEvaluationFormVersionsResult withNextToken(String nextToken) {
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
        if (getEvaluationFormVersionSummaryList() != null)
            sb.append("EvaluationFormVersionSummaryList: " + getEvaluationFormVersionSummaryList()
                    + ",");
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
                + ((getEvaluationFormVersionSummaryList() == null) ? 0
                        : getEvaluationFormVersionSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEvaluationFormVersionsResult == false)
            return false;
        ListEvaluationFormVersionsResult other = (ListEvaluationFormVersionsResult) obj;

        if (other.getEvaluationFormVersionSummaryList() == null
                ^ this.getEvaluationFormVersionSummaryList() == null)
            return false;
        if (other.getEvaluationFormVersionSummaryList() != null
                && other.getEvaluationFormVersionSummaryList().equals(
                        this.getEvaluationFormVersionSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
