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

package com.amazonaws.services.qldb.model;

import java.io.Serializable;

public class ListLedgersResult implements Serializable {
    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS
     * account and Region.
     * </p>
     */
    private java.util.List<LedgerSummary> ledgers;

    /**
     * <p>
     * A pagination token, indicating whether there are more results available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, then the last page of results has
     * been processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more
     * results available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS
     * account and Region.
     * </p>
     *
     * @return <p>
     *         The array of ledger summaries that are associated with the
     *         current AWS account and Region.
     *         </p>
     */
    public java.util.List<LedgerSummary> getLedgers() {
        return ledgers;
    }

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS
     * account and Region.
     * </p>
     *
     * @param ledgers <p>
     *            The array of ledger summaries that are associated with the
     *            current AWS account and Region.
     *            </p>
     */
    public void setLedgers(java.util.Collection<LedgerSummary> ledgers) {
        if (ledgers == null) {
            this.ledgers = null;
            return;
        }

        this.ledgers = new java.util.ArrayList<LedgerSummary>(ledgers);
    }

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS
     * account and Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ledgers <p>
     *            The array of ledger summaries that are associated with the
     *            current AWS account and Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLedgersResult withLedgers(LedgerSummary... ledgers) {
        if (getLedgers() == null) {
            this.ledgers = new java.util.ArrayList<LedgerSummary>(ledgers.length);
        }
        for (LedgerSummary value : ledgers) {
            this.ledgers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of ledger summaries that are associated with the current AWS
     * account and Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ledgers <p>
     *            The array of ledger summaries that are associated with the
     *            current AWS account and Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLedgersResult withLedgers(java.util.Collection<LedgerSummary> ledgers) {
        setLedgers(ledgers);
        return this;
    }

    /**
     * <p>
     * A pagination token, indicating whether there are more results available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, then the last page of results has
     * been processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more
     * results available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @return <p>
     *         A pagination token, indicating whether there are more results
     *         available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>NextToken</code> is empty, then the last page of results
     *         has been processed and there are no more results to be retrieved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>NextToken</code> is <i>not</i> empty, then there are
     *         more results available. To retrieve the next page of results, use
     *         the value of <code>NextToken</code> in a subsequent
     *         <code>ListLedgers</code> call.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token, indicating whether there are more results available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, then the last page of results has
     * been processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more
     * results available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextToken <p>
     *            A pagination token, indicating whether there are more results
     *            available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>NextToken</code> is empty, then the last page of
     *            results has been processed and there are no more results to be
     *            retrieved.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>NextToken</code> is <i>not</i> empty, then there are
     *            more results available. To retrieve the next page of results,
     *            use the value of <code>NextToken</code> in a subsequent
     *            <code>ListLedgers</code> call.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token, indicating whether there are more results available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, then the last page of results has
     * been processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more
     * results available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent <code>ListLedgers</code> call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextToken <p>
     *            A pagination token, indicating whether there are more results
     *            available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If <code>NextToken</code> is empty, then the last page of
     *            results has been processed and there are no more results to be
     *            retrieved.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If <code>NextToken</code> is <i>not</i> empty, then there are
     *            more results available. To retrieve the next page of results,
     *            use the value of <code>NextToken</code> in a subsequent
     *            <code>ListLedgers</code> call.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLedgersResult withNextToken(String nextToken) {
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
        if (getLedgers() != null)
            sb.append("Ledgers: " + getLedgers() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgers() == null) ? 0 : getLedgers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLedgersResult == false)
            return false;
        ListLedgersResult other = (ListLedgersResult) obj;

        if (other.getLedgers() == null ^ this.getLedgers() == null)
            return false;
        if (other.getLedgers() != null && other.getLedgers().equals(this.getLedgers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
