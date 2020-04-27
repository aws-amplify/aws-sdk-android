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

public class ListNotebookInstanceLifecycleConfigsResult implements Serializable {
    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To get
     * the next set of lifecycle configurations, use it in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects,
     * each listing a lifecycle configuration.
     * </p>
     */
    private java.util.List<NotebookInstanceLifecycleConfigSummary> notebookInstanceLifecycleConfigs;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To get
     * the next set of lifecycle configurations, use it in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To get the next set of lifecycle configurations, use it in
     *         the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To get
     * the next set of lifecycle configurations, use it in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To get the next set of lifecycle configurations, use it
     *            in the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To get
     * the next set of lifecycle configurations, use it in the next request.
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
     *            token. To get the next set of lifecycle configurations, use it
     *            in the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstanceLifecycleConfigsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects,
     * each listing a lifecycle configuration.
     * </p>
     *
     * @return <p>
     *         An array of <code>NotebookInstanceLifecycleConfiguration</code>
     *         objects, each listing a lifecycle configuration.
     *         </p>
     */
    public java.util.List<NotebookInstanceLifecycleConfigSummary> getNotebookInstanceLifecycleConfigs() {
        return notebookInstanceLifecycleConfigs;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects,
     * each listing a lifecycle configuration.
     * </p>
     *
     * @param notebookInstanceLifecycleConfigs <p>
     *            An array of
     *            <code>NotebookInstanceLifecycleConfiguration</code> objects,
     *            each listing a lifecycle configuration.
     *            </p>
     */
    public void setNotebookInstanceLifecycleConfigs(
            java.util.Collection<NotebookInstanceLifecycleConfigSummary> notebookInstanceLifecycleConfigs) {
        if (notebookInstanceLifecycleConfigs == null) {
            this.notebookInstanceLifecycleConfigs = null;
            return;
        }

        this.notebookInstanceLifecycleConfigs = new java.util.ArrayList<NotebookInstanceLifecycleConfigSummary>(
                notebookInstanceLifecycleConfigs);
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects,
     * each listing a lifecycle configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notebookInstanceLifecycleConfigs <p>
     *            An array of
     *            <code>NotebookInstanceLifecycleConfiguration</code> objects,
     *            each listing a lifecycle configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstanceLifecycleConfigsResult withNotebookInstanceLifecycleConfigs(
            NotebookInstanceLifecycleConfigSummary... notebookInstanceLifecycleConfigs) {
        if (getNotebookInstanceLifecycleConfigs() == null) {
            this.notebookInstanceLifecycleConfigs = new java.util.ArrayList<NotebookInstanceLifecycleConfigSummary>(
                    notebookInstanceLifecycleConfigs.length);
        }
        for (NotebookInstanceLifecycleConfigSummary value : notebookInstanceLifecycleConfigs) {
            this.notebookInstanceLifecycleConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>NotebookInstanceLifecycleConfiguration</code> objects,
     * each listing a lifecycle configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notebookInstanceLifecycleConfigs <p>
     *            An array of
     *            <code>NotebookInstanceLifecycleConfiguration</code> objects,
     *            each listing a lifecycle configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListNotebookInstanceLifecycleConfigsResult withNotebookInstanceLifecycleConfigs(
            java.util.Collection<NotebookInstanceLifecycleConfigSummary> notebookInstanceLifecycleConfigs) {
        setNotebookInstanceLifecycleConfigs(notebookInstanceLifecycleConfigs);
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
        if (getNotebookInstanceLifecycleConfigs() != null)
            sb.append("NotebookInstanceLifecycleConfigs: " + getNotebookInstanceLifecycleConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotebookInstanceLifecycleConfigs() == null) ? 0
                        : getNotebookInstanceLifecycleConfigs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotebookInstanceLifecycleConfigsResult == false)
            return false;
        ListNotebookInstanceLifecycleConfigsResult other = (ListNotebookInstanceLifecycleConfigsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNotebookInstanceLifecycleConfigs() == null
                ^ this.getNotebookInstanceLifecycleConfigs() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigs() != null
                && other.getNotebookInstanceLifecycleConfigs().equals(
                        this.getNotebookInstanceLifecycleConfigs()) == false)
            return false;
        return true;
    }
}
