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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class ListNotebookInstancesResult implements Serializable {
    /**
     * <p>
     * If the response to the previous <code>ListNotebookInstances</code>
     * request was truncated, Amazon SageMaker returns this token. To retrieve
     * the next set of notebook instances, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each
     * notebook instance.
     * </p>
     */
    private java.util.List<NotebookInstanceSummary> notebookInstances;

    /**
     * <p>
     * If the response to the previous <code>ListNotebookInstances</code>
     * request was truncated, Amazon SageMaker returns this token. To retrieve
     * the next set of notebook instances, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response to the previous
     *         <code>ListNotebookInstances</code> request was truncated, Amazon
     *         SageMaker returns this token. To retrieve the next set of
     *         notebook instances, use the token in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response to the previous <code>ListNotebookInstances</code>
     * request was truncated, Amazon SageMaker returns this token. To retrieve
     * the next set of notebook instances, use the token in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response to the previous
     *            <code>ListNotebookInstances</code> request was truncated,
     *            Amazon SageMaker returns this token. To retrieve the next set
     *            of notebook instances, use the token in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to the previous <code>ListNotebookInstances</code>
     * request was truncated, Amazon SageMaker returns this token. To retrieve
     * the next set of notebook instances, use the token in the next request.
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
     *            If the response to the previous
     *            <code>ListNotebookInstances</code> request was truncated,
     *            Amazon SageMaker returns this token. To retrieve the next set
     *            of notebook instances, use the token in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each
     * notebook instance.
     * </p>
     *
     * @return <p>
     *         An array of <code>NotebookInstanceSummary</code> objects, one for
     *         each notebook instance.
     *         </p>
     */
    public java.util.List<NotebookInstanceSummary> getNotebookInstances() {
        return notebookInstances;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each
     * notebook instance.
     * </p>
     *
     * @param notebookInstances <p>
     *            An array of <code>NotebookInstanceSummary</code> objects, one
     *            for each notebook instance.
     *            </p>
     */
    public void setNotebookInstances(java.util.Collection<NotebookInstanceSummary> notebookInstances) {
        if (notebookInstances == null) {
            this.notebookInstances = null;
            return;
        }

        this.notebookInstances = new java.util.ArrayList<NotebookInstanceSummary>(notebookInstances);
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each
     * notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notebookInstances <p>
     *            An array of <code>NotebookInstanceSummary</code> objects, one
     *            for each notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesResult withNotebookInstances(
            NotebookInstanceSummary... notebookInstances) {
        if (getNotebookInstances() == null) {
            this.notebookInstances = new java.util.ArrayList<NotebookInstanceSummary>(
                    notebookInstances.length);
        }
        for (NotebookInstanceSummary value : notebookInstances) {
            this.notebookInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceSummary</code> objects, one for each
     * notebook instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notebookInstances <p>
     *            An array of <code>NotebookInstanceSummary</code> objects, one
     *            for each notebook instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstancesResult withNotebookInstances(
            java.util.Collection<NotebookInstanceSummary> notebookInstances) {
        setNotebookInstances(notebookInstances);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getNotebookInstances() != null)
            sb.append("NotebookInstances: " + getNotebookInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getNotebookInstances() == null) ? 0 : getNotebookInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotebookInstancesResult == false)
            return false;
        ListNotebookInstancesResult other = (ListNotebookInstancesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNotebookInstances() == null ^ this.getNotebookInstances() == null)
            return false;
        if (other.getNotebookInstances() != null
                && other.getNotebookInstances().equals(this.getNotebookInstances()) == false)
            return false;
        return true;
    }
}
