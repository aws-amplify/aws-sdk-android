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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of all Amazon QLDB journal stream descriptors for a given
 * ledger. The output of each stream descriptor includes the same details that
 * are returned by <code>DescribeJournalKinesisStream</code>.
 * </p>
 * <p>
 * This action returns a maximum of <code>MaxResults</code> items. It is
 * paginated so that you can retrieve all the items by calling
 * <code>ListJournalKinesisStreamsForLedger</code> multiple times.
 * </p>
 */
public class ListJournalKinesisStreamsForLedgerRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     */
    private String ledgerName;

    /**
     * <p>
     * The maximum number of results to return in a single
     * <code>ListJournalKinesisStreamsForLedger</code> request. (The actual
     * number of results returned might be fewer.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of
     * results. If you received a value for <code>NextToken</code> in the
     * response from a previous <code>ListJournalKinesisStreamsForLedger</code>
     * call, you should use that value as input here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @return <p>
     *         The name of the ledger.
     *         </p>
     */
    public String getLedgerName() {
        return ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param ledgerName <p>
     *            The name of the ledger.
     *            </p>
     */
    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>(?!^.*--)(?!^[0-9]+$)(?!^-)(?!.*-$)^[A-Za-z0-9-]+$<br/>
     *
     * @param ledgerName <p>
     *            The name of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalKinesisStreamsForLedgerRequest withLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single
     * <code>ListJournalKinesisStreamsForLedger</code> request. (The actual
     * number of results returned might be fewer.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single
     *         <code>ListJournalKinesisStreamsForLedger</code> request. (The
     *         actual number of results returned might be fewer.)
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single
     * <code>ListJournalKinesisStreamsForLedger</code> request. (The actual
     * number of results returned might be fewer.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single
     *            <code>ListJournalKinesisStreamsForLedger</code> request. (The
     *            actual number of results returned might be fewer.)
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single
     * <code>ListJournalKinesisStreamsForLedger</code> request. (The actual
     * number of results returned might be fewer.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single
     *            <code>ListJournalKinesisStreamsForLedger</code> request. (The
     *            actual number of results returned might be fewer.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalKinesisStreamsForLedgerRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of
     * results. If you received a value for <code>NextToken</code> in the
     * response from a previous <code>ListJournalKinesisStreamsForLedger</code>
     * call, you should use that value as input here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @return <p>
     *         A pagination token, indicating that you want to retrieve the next
     *         page of results. If you received a value for
     *         <code>NextToken</code> in the response from a previous
     *         <code>ListJournalKinesisStreamsForLedger</code> call, you should
     *         use that value as input here.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of
     * results. If you received a value for <code>NextToken</code> in the
     * response from a previous <code>ListJournalKinesisStreamsForLedger</code>
     * call, you should use that value as input here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextToken <p>
     *            A pagination token, indicating that you want to retrieve the
     *            next page of results. If you received a value for
     *            <code>NextToken</code> in the response from a previous
     *            <code>ListJournalKinesisStreamsForLedger</code> call, you
     *            should use that value as input here.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of
     * results. If you received a value for <code>NextToken</code> in the
     * response from a previous <code>ListJournalKinesisStreamsForLedger</code>
     * call, you should use that value as input here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextToken <p>
     *            A pagination token, indicating that you want to retrieve the
     *            next page of results. If you received a value for
     *            <code>NextToken</code> in the response from a previous
     *            <code>ListJournalKinesisStreamsForLedger</code> call, you
     *            should use that value as input here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalKinesisStreamsForLedgerRequest withNextToken(String nextToken) {
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
        if (getLedgerName() != null)
            sb.append("LedgerName: " + getLedgerName() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
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

        if (obj instanceof ListJournalKinesisStreamsForLedgerRequest == false)
            return false;
        ListJournalKinesisStreamsForLedgerRequest other = (ListJournalKinesisStreamsForLedgerRequest) obj;

        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null
                && other.getLedgerName().equals(this.getLedgerName()) == false)
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
