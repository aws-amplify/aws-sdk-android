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

public class ListDataSourcesResult implements Serializable {
    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     */
    private java.util.List<DataSourceSummary> summaryItems;

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you
     * can use in the subsequent request to retrieve the next set of data
     * sources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     *
     * @return <p>
     *         An array of summary information for one or more data sources.
     *         </p>
     */
    public java.util.List<DataSourceSummary> getSummaryItems() {
        return summaryItems;
    }

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     *
     * @param summaryItems <p>
     *            An array of summary information for one or more data sources.
     *            </p>
     */
    public void setSummaryItems(java.util.Collection<DataSourceSummary> summaryItems) {
        if (summaryItems == null) {
            this.summaryItems = null;
            return;
        }

        this.summaryItems = new java.util.ArrayList<DataSourceSummary>(summaryItems);
    }

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryItems <p>
     *            An array of summary information for one or more data sources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourcesResult withSummaryItems(DataSourceSummary... summaryItems) {
        if (getSummaryItems() == null) {
            this.summaryItems = new java.util.ArrayList<DataSourceSummary>(summaryItems.length);
        }
        for (DataSourceSummary value : summaryItems) {
            this.summaryItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more data sources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryItems <p>
     *            An array of summary information for one or more data sources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourcesResult withSummaryItems(
            java.util.Collection<DataSourceSummary> summaryItems) {
        setSummaryItems(summaryItems);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you
     * can use in the subsequent request to retrieve the next set of data
     * sources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Kendra returns this token
     *         that you can use in the subsequent request to retrieve the next
     *         set of data sources.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you
     * can use in the subsequent request to retrieve the next set of data
     * sources.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Kendra returns this token
     *            that you can use in the subsequent request to retrieve the
     *            next set of data sources.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you
     * can use in the subsequent request to retrieve the next set of data
     * sources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Kendra returns this token
     *            that you can use in the subsequent request to retrieve the
     *            next set of data sources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDataSourcesResult withNextToken(String nextToken) {
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
        if (getSummaryItems() != null)
            sb.append("SummaryItems: " + getSummaryItems() + ",");
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
                + ((getSummaryItems() == null) ? 0 : getSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDataSourcesResult == false)
            return false;
        ListDataSourcesResult other = (ListDataSourcesResult) obj;

        if (other.getSummaryItems() == null ^ this.getSummaryItems() == null)
            return false;
        if (other.getSummaryItems() != null
                && other.getSummaryItems().equals(this.getSummaryItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
