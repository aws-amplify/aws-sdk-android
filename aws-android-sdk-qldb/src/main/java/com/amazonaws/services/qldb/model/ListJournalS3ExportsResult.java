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

public class ListJournalS3ExportsResult implements Serializable {
    /**
     * <p>
     * The array of journal export job descriptions for all ledgers that are
     * associated with the current AWS account and Region.
     * </p>
     */
    private java.util.List<JournalS3ExportDescription> journalS3Exports;

    /**
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
     * <code>NextToken</code> in a subsequent <code>ListJournalS3Exports</code>
     * call.
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
     * The array of journal export job descriptions for all ledgers that are
     * associated with the current AWS account and Region.
     * </p>
     *
     * @return <p>
     *         The array of journal export job descriptions for all ledgers that
     *         are associated with the current AWS account and Region.
     *         </p>
     */
    public java.util.List<JournalS3ExportDescription> getJournalS3Exports() {
        return journalS3Exports;
    }

    /**
     * <p>
     * The array of journal export job descriptions for all ledgers that are
     * associated with the current AWS account and Region.
     * </p>
     *
     * @param journalS3Exports <p>
     *            The array of journal export job descriptions for all ledgers
     *            that are associated with the current AWS account and Region.
     *            </p>
     */
    public void setJournalS3Exports(
            java.util.Collection<JournalS3ExportDescription> journalS3Exports) {
        if (journalS3Exports == null) {
            this.journalS3Exports = null;
            return;
        }

        this.journalS3Exports = new java.util.ArrayList<JournalS3ExportDescription>(
                journalS3Exports);
    }

    /**
     * <p>
     * The array of journal export job descriptions for all ledgers that are
     * associated with the current AWS account and Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journalS3Exports <p>
     *            The array of journal export job descriptions for all ledgers
     *            that are associated with the current AWS account and Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalS3ExportsResult withJournalS3Exports(
            JournalS3ExportDescription... journalS3Exports) {
        if (getJournalS3Exports() == null) {
            this.journalS3Exports = new java.util.ArrayList<JournalS3ExportDescription>(
                    journalS3Exports.length);
        }
        for (JournalS3ExportDescription value : journalS3Exports) {
            this.journalS3Exports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The array of journal export job descriptions for all ledgers that are
     * associated with the current AWS account and Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journalS3Exports <p>
     *            The array of journal export job descriptions for all ledgers
     *            that are associated with the current AWS account and Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalS3ExportsResult withJournalS3Exports(
            java.util.Collection<JournalS3ExportDescription> journalS3Exports) {
        setJournalS3Exports(journalS3Exports);
        return this;
    }

    /**
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
     * <code>NextToken</code> in a subsequent <code>ListJournalS3Exports</code>
     * call.
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
     *         If <code>NextToken</code> is empty, then the last page of results
     *         has been processed and there are no more results to be retrieved.
     *         </p>
     *         </li> <li>
     *         <p>
     *         If <code>NextToken</code> is <i>not</i> empty, then there are
     *         more results available. To retrieve the next page of results, use
     *         the value of <code>NextToken</code> in a subsequent <code>
     *         ListJournalS3Exports</code> call.
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
     * If <code>NextToken</code> is empty, then the last page of results has
     * been processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more
     * results available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent <code>ListJournalS3Exports</code>
     * call.
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
     *            If <code>NextToken</code> is empty, then the last page of
     *            results has been processed and there are no more results to be
     *            retrieved.
     *            </p>
     *            </li> <li>
     *            <p>
     *            If <code>NextToken</code> is <i>not</i> empty, then there are
     *            more results available. To retrieve the next page of results,
     *            use the value of <code>NextToken</code> in a subsequent <code>
     *            ListJournalS3Exports</code> call.
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
     * If <code>NextToken</code> is empty, then the last page of results has
     * been processed and there are no more results to be retrieved.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>NextToken</code> is <i>not</i> empty, then there are more
     * results available. To retrieve the next page of results, use the value of
     * <code>NextToken</code> in a subsequent <code>ListJournalS3Exports</code>
     * call.
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
     *            If <code>NextToken</code> is empty, then the last page of
     *            results has been processed and there are no more results to be
     *            retrieved.
     *            </p>
     *            </li> <li>
     *            <p>
     *            If <code>NextToken</code> is <i>not</i> empty, then there are
     *            more results available. To retrieve the next page of results,
     *            use the value of <code>NextToken</code> in a subsequent <code>
     *            ListJournalS3Exports</code> call.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalS3ExportsResult withNextToken(String nextToken) {
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
        if (getJournalS3Exports() != null)
            sb.append("JournalS3Exports: " + getJournalS3Exports() + ",");
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
                + ((getJournalS3Exports() == null) ? 0 : getJournalS3Exports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJournalS3ExportsResult == false)
            return false;
        ListJournalS3ExportsResult other = (ListJournalS3ExportsResult) obj;

        if (other.getJournalS3Exports() == null ^ this.getJournalS3Exports() == null)
            return false;
        if (other.getJournalS3Exports() != null
                && other.getJournalS3Exports().equals(this.getJournalS3Exports()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
