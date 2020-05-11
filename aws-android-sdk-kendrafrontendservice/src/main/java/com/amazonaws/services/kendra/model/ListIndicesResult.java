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

public class ListIndicesResult implements Serializable {
    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     */
    private java.util.List<IndexConfigurationSummary> indexConfigurationSummaryItems;

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you
     * can use in the subsequent request to retrieve the next set of indexes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     *
     * @return <p>
     *         An array of summary information for one or more indexes.
     *         </p>
     */
    public java.util.List<IndexConfigurationSummary> getIndexConfigurationSummaryItems() {
        return indexConfigurationSummaryItems;
    }

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     *
     * @param indexConfigurationSummaryItems <p>
     *            An array of summary information for one or more indexes.
     *            </p>
     */
    public void setIndexConfigurationSummaryItems(
            java.util.Collection<IndexConfigurationSummary> indexConfigurationSummaryItems) {
        if (indexConfigurationSummaryItems == null) {
            this.indexConfigurationSummaryItems = null;
            return;
        }

        this.indexConfigurationSummaryItems = new java.util.ArrayList<IndexConfigurationSummary>(
                indexConfigurationSummaryItems);
    }

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param indexConfigurationSummaryItems <p>
     *            An array of summary information for one or more indexes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIndicesResult withIndexConfigurationSummaryItems(
            IndexConfigurationSummary... indexConfigurationSummaryItems) {
        if (getIndexConfigurationSummaryItems() == null) {
            this.indexConfigurationSummaryItems = new java.util.ArrayList<IndexConfigurationSummary>(
                    indexConfigurationSummaryItems.length);
        }
        for (IndexConfigurationSummary value : indexConfigurationSummaryItems) {
            this.indexConfigurationSummaryItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of summary information for one or more indexes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param indexConfigurationSummaryItems <p>
     *            An array of summary information for one or more indexes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIndicesResult withIndexConfigurationSummaryItems(
            java.util.Collection<IndexConfigurationSummary> indexConfigurationSummaryItems) {
        setIndexConfigurationSummaryItems(indexConfigurationSummaryItems);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you
     * can use in the subsequent request to retrieve the next set of indexes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Kendra returns this token
     *         that you can use in the subsequent request to retrieve the next
     *         set of indexes.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you
     * can use in the subsequent request to retrieve the next set of indexes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Kendra returns this token
     *            that you can use in the subsequent request to retrieve the
     *            next set of indexes.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Kendra returns this token that you
     * can use in the subsequent request to retrieve the next set of indexes.
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
     *            next set of indexes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListIndicesResult withNextToken(String nextToken) {
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
        if (getIndexConfigurationSummaryItems() != null)
            sb.append("IndexConfigurationSummaryItems: " + getIndexConfigurationSummaryItems()
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
                + ((getIndexConfigurationSummaryItems() == null) ? 0
                        : getIndexConfigurationSummaryItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIndicesResult == false)
            return false;
        ListIndicesResult other = (ListIndicesResult) obj;

        if (other.getIndexConfigurationSummaryItems() == null
                ^ this.getIndexConfigurationSummaryItems() == null)
            return false;
        if (other.getIndexConfigurationSummaryItems() != null
                && other.getIndexConfigurationSummaryItems().equals(
                        this.getIndexConfigurationSummaryItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
