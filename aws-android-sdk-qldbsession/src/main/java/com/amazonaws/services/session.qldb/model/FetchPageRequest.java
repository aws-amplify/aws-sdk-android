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

package com.amazonaws.services.session.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the details of the page to be fetched.
 * </p>
 */
public class FetchPageRequest implements Serializable {
    /**
     * <p>
     * Specifies the transaction ID of the page to be fetched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String transactionId;

    /**
     * <p>
     * Specifies the next page token of the page to be fetched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Specifies the transaction ID of the page to be fetched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         Specifies the transaction ID of the page to be fetched.
     *         </p>
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the page to be fetched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param transactionId <p>
     *            Specifies the transaction ID of the page to be fetched.
     *            </p>
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the page to be fetched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param transactionId <p>
     *            Specifies the transaction ID of the page to be fetched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FetchPageRequest withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * <p>
     * Specifies the next page token of the page to be fetched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @return <p>
     *         Specifies the next page token of the page to be fetched.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * Specifies the next page token of the page to be fetched.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextPageToken <p>
     *            Specifies the next page token of the page to be fetched.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * Specifies the next page token of the page to be fetched.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param nextPageToken <p>
     *            Specifies the next page token of the page to be fetched.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FetchPageRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getTransactionId() != null)
            sb.append("TransactionId: " + getTransactionId() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FetchPageRequest == false)
            return false;
        FetchPageRequest other = (FetchPageRequest) obj;

        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null
                && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
