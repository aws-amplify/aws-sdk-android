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
 * Returns an array of journal export job descriptions for a specified ledger.
 * </p>
 * <p>
 * This action returns a maximum of <code>MaxResults</code> items, and is
 * paginated so that you can retrieve all the items by calling
 * <code>ListJournalS3ExportsForLedger</code> multiple times.
 * </p>
 * <p>
 * This action does not return any expired export jobs. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/qldb/latest/developerguide/export-journal.request.html#export-journal.request.expiration"
 * >Export Job Expiration</a> in the <i>Amazon QLDB Developer Guide</i>.
 * </p>
 */
public class ListJournalS3ExportsForLedgerRequest extends AmazonWebServiceRequest implements
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
    private String name;

    /**
     * <p>
     * The maximum number of results to return in a single
     * <code>ListJournalS3ExportsForLedger</code> request. (The actual number of
     * results returned might be fewer.)
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
     * response from a previous <code>ListJournalS3ExportsForLedger</code> call,
     * then you should use that value as input here.
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
    public String getName() {
        return name;
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
     * @param name <p>
     *            The name of the ledger.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
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
     * @param name <p>
     *            The name of the ledger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalS3ExportsForLedgerRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single
     * <code>ListJournalS3ExportsForLedger</code> request. (The actual number of
     * results returned might be fewer.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single
     *         <code>ListJournalS3ExportsForLedger</code> request. (The actual
     *         number of results returned might be fewer.)
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single
     * <code>ListJournalS3ExportsForLedger</code> request. (The actual number of
     * results returned might be fewer.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single
     *            <code>ListJournalS3ExportsForLedger</code> request. (The
     *            actual number of results returned might be fewer.)
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single
     * <code>ListJournalS3ExportsForLedger</code> request. (The actual number of
     * results returned might be fewer.)
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
     *            <code>ListJournalS3ExportsForLedger</code> request. (The
     *            actual number of results returned might be fewer.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalS3ExportsForLedgerRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A pagination token, indicating that you want to retrieve the next page of
     * results. If you received a value for <code>NextToken</code> in the
     * response from a previous <code>ListJournalS3ExportsForLedger</code> call,
     * then you should use that value as input here.
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
     *         <code>ListJournalS3ExportsForLedger</code> call, then you should
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
     * response from a previous <code>ListJournalS3ExportsForLedger</code> call,
     * then you should use that value as input here.
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
     *            <code>ListJournalS3ExportsForLedger</code> call, then you
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
     * response from a previous <code>ListJournalS3ExportsForLedger</code> call,
     * then you should use that value as input here.
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
     *            <code>ListJournalS3ExportsForLedger</code> call, then you
     *            should use that value as input here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListJournalS3ExportsForLedgerRequest withNextToken(String nextToken) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
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

        if (obj instanceof ListJournalS3ExportsForLedgerRequest == false)
            return false;
        ListJournalS3ExportsForLedgerRequest other = (ListJournalS3ExportsForLedgerRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
