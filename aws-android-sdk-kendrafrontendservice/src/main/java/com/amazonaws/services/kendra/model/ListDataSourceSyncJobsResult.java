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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

public class ListDataSourceSyncJobsResult implements Serializable {
    /**
     * <p>
     * A history of synchronization jobs for the data source.
     * </p>
     */
    private java.util.List<DataSourceSyncJob> history;

    /**
     * <p>
     * The <code>GetDataSourceSyncJobHistory</code> operation returns a page of
     * vocabularies at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list
     * than the page size, Amazon Kendra returns the NextPage token. Include the
     * token in the next request to the <code>GetDataSourceSyncJobHistory</code>
     * operation to return in the next page of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A history of synchronization jobs for the data source.
     * </p>
     *
     * @return <p>
     *         A history of synchronization jobs for the data source.
     *         </p>
     */
    public java.util.List<DataSourceSyncJob> getHistory() {
        return history;
    }

    /**
     * <p>
     * A history of synchronization jobs for the data source.
     * </p>
     *
     * @param history <p>
     *            A history of synchronization jobs for the data source.
     *            </p>
     */
    public void setHistory(java.util.Collection<DataSourceSyncJob> history) {
        if (history == null) {
            this.history = null;
            return;
        }

        this.history = new java.util.ArrayList<DataSourceSyncJob>(history);
    }

    /**
     * <p>
     * A history of synchronization jobs for the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param history <p>
     *            A history of synchronization jobs for the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourceSyncJobsResult withHistory(DataSourceSyncJob... history) {
        if (getHistory() == null) {
            this.history = new java.util.ArrayList<DataSourceSyncJob>(history.length);
        }
        for (DataSourceSyncJob value : history) {
            this.history.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A history of synchronization jobs for the data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param history <p>
     *            A history of synchronization jobs for the data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourceSyncJobsResult withHistory(java.util.Collection<DataSourceSyncJob> history) {
        setHistory(history);
        return this;
    }

    /**
     * <p>
     * The <code>GetDataSourceSyncJobHistory</code> operation returns a page of
     * vocabularies at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list
     * than the page size, Amazon Kendra returns the NextPage token. Include the
     * token in the next request to the <code>GetDataSourceSyncJobHistory</code>
     * operation to return in the next page of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @return <p>
     *         The <code>GetDataSourceSyncJobHistory</code> operation returns a
     *         page of vocabularies at a time. The maximum size of the page is
     *         set by the <code>MaxResults</code> parameter. If there are more
     *         jobs in the list than the page size, Amazon Kendra returns the
     *         NextPage token. Include the token in the next request to the
     *         <code>GetDataSourceSyncJobHistory</code> operation to return in
     *         the next page of jobs.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>GetDataSourceSyncJobHistory</code> operation returns a page of
     * vocabularies at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list
     * than the page size, Amazon Kendra returns the NextPage token. Include the
     * token in the next request to the <code>GetDataSourceSyncJobHistory</code>
     * operation to return in the next page of jobs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            The <code>GetDataSourceSyncJobHistory</code> operation returns
     *            a page of vocabularies at a time. The maximum size of the page
     *            is set by the <code>MaxResults</code> parameter. If there are
     *            more jobs in the list than the page size, Amazon Kendra
     *            returns the NextPage token. Include the token in the next
     *            request to the <code>GetDataSourceSyncJobHistory</code>
     *            operation to return in the next page of jobs.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>GetDataSourceSyncJobHistory</code> operation returns a page of
     * vocabularies at a time. The maximum size of the page is set by the
     * <code>MaxResults</code> parameter. If there are more jobs in the list
     * than the page size, Amazon Kendra returns the NextPage token. Include the
     * token in the next request to the <code>GetDataSourceSyncJobHistory</code>
     * operation to return in the next page of jobs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            The <code>GetDataSourceSyncJobHistory</code> operation returns
     *            a page of vocabularies at a time. The maximum size of the page
     *            is set by the <code>MaxResults</code> parameter. If there are
     *            more jobs in the list than the page size, Amazon Kendra
     *            returns the NextPage token. Include the token in the next
     *            request to the <code>GetDataSourceSyncJobHistory</code>
     *            operation to return in the next page of jobs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourceSyncJobsResult withNextToken(String nextToken) {
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
        if (getHistory() != null)
            sb.append("History: " + getHistory() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHistory() == null) ? 0 : getHistory().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSourceSyncJobsResult == false)
            return false;
        ListDataSourceSyncJobsResult other = (ListDataSourceSyncJobsResult) obj;

        if (other.getHistory() == null ^ this.getHistory() == null)
            return false;
        if (other.getHistory() != null && other.getHistory().equals(this.getHistory()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
