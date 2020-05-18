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

public class ListJournalKinesisStreamsForLedgerResult implements Serializable {
    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the
     * given ledger.
     * </p>
     */
    private java.util.List<JournalKinesisStreamDescription> streams;

    /**
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, the last page of results has been
     * processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, more results are
     * available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent
     * <code>ListJournalKinesisStreamsForLedger</code> call.
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
     * The array of QLDB journal stream descriptors that are associated with the
     * given ledger.
     * </p>
     *
     * @return <p>
     *         The array of QLDB journal stream descriptors that are associated
     *         with the given ledger.
     *         </p>
     */
    public java.util.List<JournalKinesisStreamDescription> getStreams() {
        return streams;
    }

    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the
     * given ledger.
     * </p>
     *
     * @param streams <p>
     *            The array of QLDB journal stream descriptors that are
     *            associated with the given ledger.
     *            </p>
     */
    public void setStreams(java.util.Collection<JournalKinesisStreamDescription> streams) {
        if (streams == null) {
            this.streams = null;
            return;
        }

        this.streams = new java.util.ArrayList<JournalKinesisStreamDescription>(streams);
    }

    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the
     * given ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streams <p>
     *            The array of QLDB journal stream descriptors that are
     *            associated with the given ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalKinesisStreamsForLedgerResult withStreams(
            JournalKinesisStreamDescription... streams) {
        if (getStreams() == null) {
            this.streams = new java.util.ArrayList<JournalKinesisStreamDescription>(streams.length);
        }
        for (JournalKinesisStreamDescription value : streams) {
            this.streams.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of QLDB journal stream descriptors that are associated with the
     * given ledger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param streams <p>
     *            The array of QLDB journal stream descriptors that are
     *            associated with the given ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalKinesisStreamsForLedgerResult withStreams(
            java.util.Collection<JournalKinesisStreamDescription> streams) {
        setStreams(streams);
        return this;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, the last page of results has been
     * processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, more results are
     * available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent
     * <code>ListJournalKinesisStreamsForLedger</code> call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @return <ul>
     *         <li>
     *         <p>
     *         If <code>NextToken</code> is empty, the last page of results has
     *         been processed and there are no more results to be retrieved.
     *         </p>
     *         </li> <li>
     *         <p>
     *         If <code>NextToken</code> is <i>not</i> empty, more results are
     *         available. To retrieve the next page of results, use the value of
     *         <code>NextToken</code> in a subsequent <code>
     *         ListJournalKinesisStreamsForLedger</code> call.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, the last page of results has been
     * processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, more results are
     * available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent
     * <code>ListJournalKinesisStreamsForLedger</code> call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextToken <ul>
     *            <li>
     *            <p>
     *            If <code>NextToken</code> is empty, the last page of results
     *            has been processed and there are no more results to be
     *            retrieved.
     *            </p>
     *            </li> <li>
     *            <p>
     *            If <code>NextToken</code> is <i>not</i> empty, more results
     *            are available. To retrieve the next page of results, use the
     *            value of <code>NextToken</code> in a subsequent <code>
     *            ListJournalKinesisStreamsForLedger</code> call.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <ul>
     * <li>
     * <p>
     * If <code>NextToken</code> is empty, the last page of results has been
     * processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, more results are
     * available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent
     * <code>ListJournalKinesisStreamsForLedger</code> call.
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
     * @param nextToken <ul>
     *            <li>
     *            <p>
     *            If <code>NextToken</code> is empty, the last page of results
     *            has been processed and there are no more results to be
     *            retrieved.
     *            </p>
     *            </li> <li>
     *            <p>
     *            If <code>NextToken</code> is <i>not</i> empty, more results
     *            are available. To retrieve the next page of results, use the
     *            value of <code>NextToken</code> in a subsequent <code>
     *            ListJournalKinesisStreamsForLedger</code> call.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalKinesisStreamsForLedgerResult withNextToken(String nextToken) {
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
        if (getStreams() != null)
            sb.append("Streams: " + getStreams() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreams() == null) ? 0 : getStreams().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJournalKinesisStreamsForLedgerResult == false)
            return false;
        ListJournalKinesisStreamsForLedgerResult other = (ListJournalKinesisStreamsForLedgerResult) obj;

        if (other.getStreams() == null ^ this.getStreams() == null)
            return false;
        if (other.getStreams() != null && other.getStreams().equals(this.getStreams()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
