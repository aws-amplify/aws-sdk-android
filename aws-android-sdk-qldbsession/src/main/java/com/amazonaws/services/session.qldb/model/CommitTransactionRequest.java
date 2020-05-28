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
 * Contains the details of the transaction to commit.
 * </p>
 */
public class CommitTransactionRequest implements Serializable {
    /**
     * <p>
     * Specifies the transaction ID of the transaction to commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String transactionId;

    /**
     * <p>
     * Specifies the commit digest for the transaction to commit. For every
     * active transaction, the commit digest must be passed. QLDB validates
     * <code>CommitDigest</code> and rejects the commit with an error if the
     * digest computed on the client does not match the digest computed by QLDB.
     * </p>
     */
    private java.nio.ByteBuffer commitDigest;

    /**
     * <p>
     * Specifies the transaction ID of the transaction to commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         Specifies the transaction ID of the transaction to commit.
     *         </p>
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the transaction to commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param transactionId <p>
     *            Specifies the transaction ID of the transaction to commit.
     *            </p>
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the transaction to commit.
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
     *            Specifies the transaction ID of the transaction to commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommitTransactionRequest withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * <p>
     * Specifies the commit digest for the transaction to commit. For every
     * active transaction, the commit digest must be passed. QLDB validates
     * <code>CommitDigest</code> and rejects the commit with an error if the
     * digest computed on the client does not match the digest computed by QLDB.
     * </p>
     *
     * @return <p>
     *         Specifies the commit digest for the transaction to commit. For
     *         every active transaction, the commit digest must be passed. QLDB
     *         validates <code>CommitDigest</code> and rejects the commit with
     *         an error if the digest computed on the client does not match the
     *         digest computed by QLDB.
     *         </p>
     */
    public java.nio.ByteBuffer getCommitDigest() {
        return commitDigest;
    }

    /**
     * <p>
     * Specifies the commit digest for the transaction to commit. For every
     * active transaction, the commit digest must be passed. QLDB validates
     * <code>CommitDigest</code> and rejects the commit with an error if the
     * digest computed on the client does not match the digest computed by QLDB.
     * </p>
     *
     * @param commitDigest <p>
     *            Specifies the commit digest for the transaction to commit. For
     *            every active transaction, the commit digest must be passed.
     *            QLDB validates <code>CommitDigest</code> and rejects the
     *            commit with an error if the digest computed on the client does
     *            not match the digest computed by QLDB.
     *            </p>
     */
    public void setCommitDigest(java.nio.ByteBuffer commitDigest) {
        this.commitDigest = commitDigest;
    }

    /**
     * <p>
     * Specifies the commit digest for the transaction to commit. For every
     * active transaction, the commit digest must be passed. QLDB validates
     * <code>CommitDigest</code> and rejects the commit with an error if the
     * digest computed on the client does not match the digest computed by QLDB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitDigest <p>
     *            Specifies the commit digest for the transaction to commit. For
     *            every active transaction, the commit digest must be passed.
     *            QLDB validates <code>CommitDigest</code> and rejects the
     *            commit with an error if the digest computed on the client does
     *            not match the digest computed by QLDB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommitTransactionRequest withCommitDigest(java.nio.ByteBuffer commitDigest) {
        this.commitDigest = commitDigest;
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
        if (getCommitDigest() != null)
            sb.append("CommitDigest: " + getCommitDigest());
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
                + ((getCommitDigest() == null) ? 0 : getCommitDigest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitTransactionRequest == false)
            return false;
        CommitTransactionRequest other = (CommitTransactionRequest) obj;

        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null
                && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getCommitDigest() == null ^ this.getCommitDigest() == null)
            return false;
        if (other.getCommitDigest() != null
                && other.getCommitDigest().equals(this.getCommitDigest()) == false)
            return false;
        return true;
    }
}
