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

public class ListDocumentClassifierSummariesResult implements Serializable {
    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     */
    private java.util.List<DocumentClassifierSummary> documentClassifierSummariesList;

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     *
     * @return <p>
     *         The list of summaries of document classifiers.
     *         </p>
     */
    public java.util.List<DocumentClassifierSummary> getDocumentClassifierSummariesList() {
        return documentClassifierSummariesList;
    }

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     *
     * @param documentClassifierSummariesList <p>
     *            The list of summaries of document classifiers.
     *            </p>
     */
    public void setDocumentClassifierSummariesList(
            java.util.Collection<DocumentClassifierSummary> documentClassifierSummariesList) {
        if (documentClassifierSummariesList == null) {
            this.documentClassifierSummariesList = null;
            return;
        }

        this.documentClassifierSummariesList = new java.util.ArrayList<DocumentClassifierSummary>(
                documentClassifierSummariesList);
    }

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentClassifierSummariesList <p>
     *            The list of summaries of document classifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentClassifierSummariesResult withDocumentClassifierSummariesList(
            DocumentClassifierSummary... documentClassifierSummariesList) {
        if (getDocumentClassifierSummariesList() == null) {
            this.documentClassifierSummariesList = new java.util.ArrayList<DocumentClassifierSummary>(
                    documentClassifierSummariesList.length);
        }
        for (DocumentClassifierSummary value : documentClassifierSummariesList) {
            this.documentClassifierSummariesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of summaries of document classifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentClassifierSummariesList <p>
     *            The list of summaries of document classifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentClassifierSummariesResult withDocumentClassifierSummariesList(
            java.util.Collection<DocumentClassifierSummary> documentClassifierSummariesList) {
        setDocumentClassifierSummariesList(documentClassifierSummariesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Identifies the next page of results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Identifies the next page of results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDocumentClassifierSummariesResult withNextToken(String nextToken) {
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
        if (getDocumentClassifierSummariesList() != null)
            sb.append("DocumentClassifierSummariesList: " + getDocumentClassifierSummariesList()
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
                + ((getDocumentClassifierSummariesList() == null) ? 0
                        : getDocumentClassifierSummariesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDocumentClassifierSummariesResult == false)
            return false;
        ListDocumentClassifierSummariesResult other = (ListDocumentClassifierSummariesResult) obj;

        if (other.getDocumentClassifierSummariesList() == null
                ^ this.getDocumentClassifierSummariesList() == null)
            return false;
        if (other.getDocumentClassifierSummariesList() != null
                && other.getDocumentClassifierSummariesList().equals(
                        this.getDocumentClassifierSummariesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
