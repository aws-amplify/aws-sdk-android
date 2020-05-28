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

public class SendCommandResult implements Serializable {
    /**
     * <p>
     * Contains the details of the started session that includes a session
     * token. This <code>SessionToken</code> is required for every subsequent
     * command that is issued during the current session.
     * </p>
     */
    private StartSessionResult startSession;

    /**
     * <p>
     * Contains the details of the started transaction.
     * </p>
     */
    private StartTransactionResult startTransaction;

    /**
     * <p>
     * Contains the details of the ended session.
     * </p>
     */
    private EndSessionResult endSession;

    /**
     * <p>
     * Contains the details of the committed transaction.
     * </p>
     */
    private CommitTransactionResult commitTransaction;

    /**
     * <p>
     * Contains the details of the aborted transaction.
     * </p>
     */
    private AbortTransactionResult abortTransaction;

    /**
     * <p>
     * Contains the details of the executed statement.
     * </p>
     */
    private ExecuteStatementResult executeStatement;

    /**
     * <p>
     * Contains the details of the fetched page.
     * </p>
     */
    private FetchPageResult fetchPage;

    /**
     * <p>
     * Contains the details of the started session that includes a session
     * token. This <code>SessionToken</code> is required for every subsequent
     * command that is issued during the current session.
     * </p>
     *
     * @return <p>
     *         Contains the details of the started session that includes a
     *         session token. This <code>SessionToken</code> is required for
     *         every subsequent command that is issued during the current
     *         session.
     *         </p>
     */
    public StartSessionResult getStartSession() {
        return startSession;
    }

    /**
     * <p>
     * Contains the details of the started session that includes a session
     * token. This <code>SessionToken</code> is required for every subsequent
     * command that is issued during the current session.
     * </p>
     *
     * @param startSession <p>
     *            Contains the details of the started session that includes a
     *            session token. This <code>SessionToken</code> is required for
     *            every subsequent command that is issued during the current
     *            session.
     *            </p>
     */
    public void setStartSession(StartSessionResult startSession) {
        this.startSession = startSession;
    }

    /**
     * <p>
     * Contains the details of the started session that includes a session
     * token. This <code>SessionToken</code> is required for every subsequent
     * command that is issued during the current session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startSession <p>
     *            Contains the details of the started session that includes a
     *            session token. This <code>SessionToken</code> is required for
     *            every subsequent command that is issued during the current
     *            session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandResult withStartSession(StartSessionResult startSession) {
        this.startSession = startSession;
        return this;
    }

    /**
     * <p>
     * Contains the details of the started transaction.
     * </p>
     *
     * @return <p>
     *         Contains the details of the started transaction.
     *         </p>
     */
    public StartTransactionResult getStartTransaction() {
        return startTransaction;
    }

    /**
     * <p>
     * Contains the details of the started transaction.
     * </p>
     *
     * @param startTransaction <p>
     *            Contains the details of the started transaction.
     *            </p>
     */
    public void setStartTransaction(StartTransactionResult startTransaction) {
        this.startTransaction = startTransaction;
    }

    /**
     * <p>
     * Contains the details of the started transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTransaction <p>
     *            Contains the details of the started transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandResult withStartTransaction(StartTransactionResult startTransaction) {
        this.startTransaction = startTransaction;
        return this;
    }

    /**
     * <p>
     * Contains the details of the ended session.
     * </p>
     *
     * @return <p>
     *         Contains the details of the ended session.
     *         </p>
     */
    public EndSessionResult getEndSession() {
        return endSession;
    }

    /**
     * <p>
     * Contains the details of the ended session.
     * </p>
     *
     * @param endSession <p>
     *            Contains the details of the ended session.
     *            </p>
     */
    public void setEndSession(EndSessionResult endSession) {
        this.endSession = endSession;
    }

    /**
     * <p>
     * Contains the details of the ended session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endSession <p>
     *            Contains the details of the ended session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandResult withEndSession(EndSessionResult endSession) {
        this.endSession = endSession;
        return this;
    }

    /**
     * <p>
     * Contains the details of the committed transaction.
     * </p>
     *
     * @return <p>
     *         Contains the details of the committed transaction.
     *         </p>
     */
    public CommitTransactionResult getCommitTransaction() {
        return commitTransaction;
    }

    /**
     * <p>
     * Contains the details of the committed transaction.
     * </p>
     *
     * @param commitTransaction <p>
     *            Contains the details of the committed transaction.
     *            </p>
     */
    public void setCommitTransaction(CommitTransactionResult commitTransaction) {
        this.commitTransaction = commitTransaction;
    }

    /**
     * <p>
     * Contains the details of the committed transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitTransaction <p>
     *            Contains the details of the committed transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandResult withCommitTransaction(CommitTransactionResult commitTransaction) {
        this.commitTransaction = commitTransaction;
        return this;
    }

    /**
     * <p>
     * Contains the details of the aborted transaction.
     * </p>
     *
     * @return <p>
     *         Contains the details of the aborted transaction.
     *         </p>
     */
    public AbortTransactionResult getAbortTransaction() {
        return abortTransaction;
    }

    /**
     * <p>
     * Contains the details of the aborted transaction.
     * </p>
     *
     * @param abortTransaction <p>
     *            Contains the details of the aborted transaction.
     *            </p>
     */
    public void setAbortTransaction(AbortTransactionResult abortTransaction) {
        this.abortTransaction = abortTransaction;
    }

    /**
     * <p>
     * Contains the details of the aborted transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortTransaction <p>
     *            Contains the details of the aborted transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandResult withAbortTransaction(AbortTransactionResult abortTransaction) {
        this.abortTransaction = abortTransaction;
        return this;
    }

    /**
     * <p>
     * Contains the details of the executed statement.
     * </p>
     *
     * @return <p>
     *         Contains the details of the executed statement.
     *         </p>
     */
    public ExecuteStatementResult getExecuteStatement() {
        return executeStatement;
    }

    /**
     * <p>
     * Contains the details of the executed statement.
     * </p>
     *
     * @param executeStatement <p>
     *            Contains the details of the executed statement.
     *            </p>
     */
    public void setExecuteStatement(ExecuteStatementResult executeStatement) {
        this.executeStatement = executeStatement;
    }

    /**
     * <p>
     * Contains the details of the executed statement.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executeStatement <p>
     *            Contains the details of the executed statement.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandResult withExecuteStatement(ExecuteStatementResult executeStatement) {
        this.executeStatement = executeStatement;
        return this;
    }

    /**
     * <p>
     * Contains the details of the fetched page.
     * </p>
     *
     * @return <p>
     *         Contains the details of the fetched page.
     *         </p>
     */
    public FetchPageResult getFetchPage() {
        return fetchPage;
    }

    /**
     * <p>
     * Contains the details of the fetched page.
     * </p>
     *
     * @param fetchPage <p>
     *            Contains the details of the fetched page.
     *            </p>
     */
    public void setFetchPage(FetchPageResult fetchPage) {
        this.fetchPage = fetchPage;
    }

    /**
     * <p>
     * Contains the details of the fetched page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fetchPage <p>
     *            Contains the details of the fetched page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandResult withFetchPage(FetchPageResult fetchPage) {
        this.fetchPage = fetchPage;
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
        if (getStartSession() != null)
            sb.append("StartSession: " + getStartSession() + ",");
        if (getStartTransaction() != null)
            sb.append("StartTransaction: " + getStartTransaction() + ",");
        if (getEndSession() != null)
            sb.append("EndSession: " + getEndSession() + ",");
        if (getCommitTransaction() != null)
            sb.append("CommitTransaction: " + getCommitTransaction() + ",");
        if (getAbortTransaction() != null)
            sb.append("AbortTransaction: " + getAbortTransaction() + ",");
        if (getExecuteStatement() != null)
            sb.append("ExecuteStatement: " + getExecuteStatement() + ",");
        if (getFetchPage() != null)
            sb.append("FetchPage: " + getFetchPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStartSession() == null) ? 0 : getStartSession().hashCode());
        hashCode = prime * hashCode
                + ((getStartTransaction() == null) ? 0 : getStartTransaction().hashCode());
        hashCode = prime * hashCode + ((getEndSession() == null) ? 0 : getEndSession().hashCode());
        hashCode = prime * hashCode
                + ((getCommitTransaction() == null) ? 0 : getCommitTransaction().hashCode());
        hashCode = prime * hashCode
                + ((getAbortTransaction() == null) ? 0 : getAbortTransaction().hashCode());
        hashCode = prime * hashCode
                + ((getExecuteStatement() == null) ? 0 : getExecuteStatement().hashCode());
        hashCode = prime * hashCode + ((getFetchPage() == null) ? 0 : getFetchPage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendCommandResult == false)
            return false;
        SendCommandResult other = (SendCommandResult) obj;

        if (other.getStartSession() == null ^ this.getStartSession() == null)
            return false;
        if (other.getStartSession() != null
                && other.getStartSession().equals(this.getStartSession()) == false)
            return false;
        if (other.getStartTransaction() == null ^ this.getStartTransaction() == null)
            return false;
        if (other.getStartTransaction() != null
                && other.getStartTransaction().equals(this.getStartTransaction()) == false)
            return false;
        if (other.getEndSession() == null ^ this.getEndSession() == null)
            return false;
        if (other.getEndSession() != null
                && other.getEndSession().equals(this.getEndSession()) == false)
            return false;
        if (other.getCommitTransaction() == null ^ this.getCommitTransaction() == null)
            return false;
        if (other.getCommitTransaction() != null
                && other.getCommitTransaction().equals(this.getCommitTransaction()) == false)
            return false;
        if (other.getAbortTransaction() == null ^ this.getAbortTransaction() == null)
            return false;
        if (other.getAbortTransaction() != null
                && other.getAbortTransaction().equals(this.getAbortTransaction()) == false)
            return false;
        if (other.getExecuteStatement() == null ^ this.getExecuteStatement() == null)
            return false;
        if (other.getExecuteStatement() != null
                && other.getExecuteStatement().equals(this.getExecuteStatement()) == false)
            return false;
        if (other.getFetchPage() == null ^ this.getFetchPage() == null)
            return false;
        if (other.getFetchPage() != null
                && other.getFetchPage().equals(this.getFetchPage()) == false)
            return false;
        return true;
    }
}
