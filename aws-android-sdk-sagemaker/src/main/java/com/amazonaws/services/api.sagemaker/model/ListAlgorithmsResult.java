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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class ListAlgorithmsResult implements Serializable {
    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which
     * lists an algorithm.
     * </p>
     */
    private java.util.List<AlgorithmSummary> algorithmSummaryList;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of algorithms, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which
     * lists an algorithm.
     * </p>
     *
     * @return <p>
     *         &gt;An array of <code>AlgorithmSummary</code> objects, each of
     *         which lists an algorithm.
     *         </p>
     */
    public java.util.List<AlgorithmSummary> getAlgorithmSummaryList() {
        return algorithmSummaryList;
    }

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which
     * lists an algorithm.
     * </p>
     *
     * @param algorithmSummaryList <p>
     *            &gt;An array of <code>AlgorithmSummary</code> objects, each of
     *            which lists an algorithm.
     *            </p>
     */
    public void setAlgorithmSummaryList(java.util.Collection<AlgorithmSummary> algorithmSummaryList) {
        if (algorithmSummaryList == null) {
            this.algorithmSummaryList = null;
            return;
        }

        this.algorithmSummaryList = new java.util.ArrayList<AlgorithmSummary>(algorithmSummaryList);
    }

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which
     * lists an algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmSummaryList <p>
     *            &gt;An array of <code>AlgorithmSummary</code> objects, each of
     *            which lists an algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAlgorithmsResult withAlgorithmSummaryList(AlgorithmSummary... algorithmSummaryList) {
        if (getAlgorithmSummaryList() == null) {
            this.algorithmSummaryList = new java.util.ArrayList<AlgorithmSummary>(
                    algorithmSummaryList.length);
        }
        for (AlgorithmSummary value : algorithmSummaryList) {
            this.algorithmSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * &gt;An array of <code>AlgorithmSummary</code> objects, each of which
     * lists an algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param algorithmSummaryList <p>
     *            &gt;An array of <code>AlgorithmSummary</code> objects, each of
     *            which lists an algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAlgorithmsResult withAlgorithmSummaryList(
            java.util.Collection<AlgorithmSummary> algorithmSummaryList) {
        setAlgorithmSummaryList(algorithmSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of algorithms, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of algorithms, use it in the
     *         subsequent request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of algorithms, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of algorithms, use it in the
     *            subsequent request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of algorithms, use it in the subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of algorithms, use it in the
     *            subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAlgorithmsResult withNextToken(String nextToken) {
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
        if (getAlgorithmSummaryList() != null)
            sb.append("AlgorithmSummaryList: " + getAlgorithmSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlgorithmSummaryList() == null) ? 0 : getAlgorithmSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAlgorithmsResult == false)
            return false;
        ListAlgorithmsResult other = (ListAlgorithmsResult) obj;

        if (other.getAlgorithmSummaryList() == null ^ this.getAlgorithmSummaryList() == null)
            return false;
        if (other.getAlgorithmSummaryList() != null
                && other.getAlgorithmSummaryList().equals(this.getAlgorithmSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
