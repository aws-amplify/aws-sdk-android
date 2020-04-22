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

package com.amazonaws.services.amazoncodegurureviewer.model;

import java.io.Serializable;

public class ListCodeReviewsResult implements Serializable {
    /**
     * <p>
     * A list of code reviews that meet the criteria of the request.
     * </p>
     */
    private java.util.List<CodeReviewSummary> codeReviewSummaries;

    /**
     * <p>
     * Pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of code reviews that meet the criteria of the request.
     * </p>
     *
     * @return <p>
     *         A list of code reviews that meet the criteria of the request.
     *         </p>
     */
    public java.util.List<CodeReviewSummary> getCodeReviewSummaries() {
        return codeReviewSummaries;
    }

    /**
     * <p>
     * A list of code reviews that meet the criteria of the request.
     * </p>
     *
     * @param codeReviewSummaries <p>
     *            A list of code reviews that meet the criteria of the request.
     *            </p>
     */
    public void setCodeReviewSummaries(java.util.Collection<CodeReviewSummary> codeReviewSummaries) {
        if (codeReviewSummaries == null) {
            this.codeReviewSummaries = null;
            return;
        }

        this.codeReviewSummaries = new java.util.ArrayList<CodeReviewSummary>(codeReviewSummaries);
    }

    /**
     * <p>
     * A list of code reviews that meet the criteria of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeReviewSummaries <p>
     *            A list of code reviews that meet the criteria of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsResult withCodeReviewSummaries(CodeReviewSummary... codeReviewSummaries) {
        if (getCodeReviewSummaries() == null) {
            this.codeReviewSummaries = new java.util.ArrayList<CodeReviewSummary>(
                    codeReviewSummaries.length);
        }
        for (CodeReviewSummary value : codeReviewSummaries) {
            this.codeReviewSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of code reviews that meet the criteria of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeReviewSummaries <p>
     *            A list of code reviews that meet the criteria of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsResult withCodeReviewSummaries(
            java.util.Collection<CodeReviewSummary> codeReviewSummaries) {
        setCodeReviewSummaries(codeReviewSummaries);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Pagination token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            Pagination token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            Pagination token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCodeReviewsResult withNextToken(String nextToken) {
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
        if (getCodeReviewSummaries() != null)
            sb.append("CodeReviewSummaries: " + getCodeReviewSummaries() + ",");
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
                + ((getCodeReviewSummaries() == null) ? 0 : getCodeReviewSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCodeReviewsResult == false)
            return false;
        ListCodeReviewsResult other = (ListCodeReviewsResult) obj;

        if (other.getCodeReviewSummaries() == null ^ this.getCodeReviewSummaries() == null)
            return false;
        if (other.getCodeReviewSummaries() != null
                && other.getCodeReviewSummaries().equals(this.getCodeReviewSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
