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

package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves a list of archive rules created for the specified analyzer.
 * </p>
 */
public class ListArchiveRulesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the analyzer to retrieve rules from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     */
    private String analyzerName;

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the analyzer to retrieve rules from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @return <p>
     *         The name of the analyzer to retrieve rules from.
     *         </p>
     */
    public String getAnalyzerName() {
        return analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer to retrieve rules from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param analyzerName <p>
     *            The name of the analyzer to retrieve rules from.
     *            </p>
     */
    public void setAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
    }

    /**
     * <p>
     * The name of the analyzer to retrieve rules from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[A-Za-z][A-Za-z0-9_.-]*$<br/>
     *
     * @param analyzerName <p>
     *            The name of the analyzer to retrieve rules from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListArchiveRulesRequest withAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     *
     * @return <p>
     *         The maximum number of results to return in the request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in the request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            The maximum number of results to return in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListArchiveRulesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @return <p>
     *         A token used for pagination of results returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token used for pagination of results returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListArchiveRulesRequest withNextToken(String nextToken) {
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
        if (getAnalyzerName() != null)
            sb.append("analyzerName: " + getAnalyzerName() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnalyzerName() == null) ? 0 : getAnalyzerName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListArchiveRulesRequest == false)
            return false;
        ListArchiveRulesRequest other = (ListArchiveRulesRequest) obj;

        if (other.getAnalyzerName() == null ^ this.getAnalyzerName() == null)
            return false;
        if (other.getAnalyzerName() != null
                && other.getAnalyzerName().equals(this.getAnalyzerName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
