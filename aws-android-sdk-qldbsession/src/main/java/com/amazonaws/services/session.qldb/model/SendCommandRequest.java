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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sends a command to an Amazon QLDB ledger.
 * </p>
 * <note>
 * <p>
 * Instead of interacting directly with this API, we recommend that you use the
 * Amazon QLDB Driver or the QLDB Shell to execute data transactions on a
 * ledger.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you are working with an AWS SDK, use the QLDB Driver. The driver provides
 * a high-level abstraction layer above this <code>qldbsession</code> data plane
 * and manages <code>SendCommand</code> API calls for you. For information and a
 * list of supported programming languages, see <a href=
 * "https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-driver.html"
 * >Getting started with the driver</a> in the <i>Amazon QLDB Developer
 * Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you are working with the AWS Command Line Interface (AWS CLI), use the
 * QLDB Shell. The shell is a command line interface that uses the QLDB Driver
 * to interact with a ledger. For information, see <a href=
 * "https://docs.aws.amazon.com/qldb/latest/developerguide/data-shell.html"
 * >Accessing Amazon QLDB using the QLDB Shell</a>.
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class SendCommandRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the session token for the current command. A session token is
     * constant throughout the life of the session.
     * </p>
     * <p>
     * To obtain a session token, run the <code>StartSession</code> command.
     * This <code>SessionToken</code> is required for every subsequent command
     * that is issued during the current session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     */
    private String sessionToken;

    /**
     * <p>
     * Command to start a new session. A session token is obtained as part of
     * the response.
     * </p>
     */
    private StartSessionRequest startSession;

    /**
     * <p>
     * Command to start a new transaction.
     * </p>
     */
    private StartTransactionRequest startTransaction;

    /**
     * <p>
     * Command to end the current session.
     * </p>
     */
    private EndSessionRequest endSession;

    /**
     * <p>
     * Command to commit the specified transaction.
     * </p>
     */
    private CommitTransactionRequest commitTransaction;

    /**
     * <p>
     * Command to abort the current transaction.
     * </p>
     */
    private AbortTransactionRequest abortTransaction;

    /**
     * <p>
     * Command to execute a statement in the specified transaction.
     * </p>
     */
    private ExecuteStatementRequest executeStatement;

    /**
     * <p>
     * Command to fetch a page.
     * </p>
     */
    private FetchPageRequest fetchPage;

    /**
     * <p>
     * Specifies the session token for the current command. A session token is
     * constant throughout the life of the session.
     * </p>
     * <p>
     * To obtain a session token, run the <code>StartSession</code> command.
     * This <code>SessionToken</code> is required for every subsequent command
     * that is issued during the current session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @return <p>
     *         Specifies the session token for the current command. A session
     *         token is constant throughout the life of the session.
     *         </p>
     *         <p>
     *         To obtain a session token, run the <code>StartSession</code>
     *         command. This <code>SessionToken</code> is required for every
     *         subsequent command that is issued during the current session.
     *         </p>
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * <p>
     * Specifies the session token for the current command. A session token is
     * constant throughout the life of the session.
     * </p>
     * <p>
     * To obtain a session token, run the <code>StartSession</code> command.
     * This <code>SessionToken</code> is required for every subsequent command
     * that is issued during the current session.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param sessionToken <p>
     *            Specifies the session token for the current command. A session
     *            token is constant throughout the life of the session.
     *            </p>
     *            <p>
     *            To obtain a session token, run the <code>StartSession</code>
     *            command. This <code>SessionToken</code> is required for every
     *            subsequent command that is issued during the current session.
     *            </p>
     */
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * Specifies the session token for the current command. A session token is
     * constant throughout the life of the session.
     * </p>
     * <p>
     * To obtain a session token, run the <code>StartSession</code> command.
     * This <code>SessionToken</code> is required for every subsequent command
     * that is issued during the current session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 1024<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9+/=]+$<br/>
     *
     * @param sessionToken <p>
     *            Specifies the session token for the current command. A session
     *            token is constant throughout the life of the session.
     *            </p>
     *            <p>
     *            To obtain a session token, run the <code>StartSession</code>
     *            command. This <code>SessionToken</code> is required for every
     *            subsequent command that is issued during the current session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    /**
     * <p>
     * Command to start a new session. A session token is obtained as part of
     * the response.
     * </p>
     *
     * @return <p>
     *         Command to start a new session. A session token is obtained as
     *         part of the response.
     *         </p>
     */
    public StartSessionRequest getStartSession() {
        return startSession;
    }

    /**
     * <p>
     * Command to start a new session. A session token is obtained as part of
     * the response.
     * </p>
     *
     * @param startSession <p>
     *            Command to start a new session. A session token is obtained as
     *            part of the response.
     *            </p>
     */
    public void setStartSession(StartSessionRequest startSession) {
        this.startSession = startSession;
    }

    /**
     * <p>
     * Command to start a new session. A session token is obtained as part of
     * the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startSession <p>
     *            Command to start a new session. A session token is obtained as
     *            part of the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withStartSession(StartSessionRequest startSession) {
        this.startSession = startSession;
        return this;
    }

    /**
     * <p>
     * Command to start a new transaction.
     * </p>
     *
     * @return <p>
     *         Command to start a new transaction.
     *         </p>
     */
    public StartTransactionRequest getStartTransaction() {
        return startTransaction;
    }

    /**
     * <p>
     * Command to start a new transaction.
     * </p>
     *
     * @param startTransaction <p>
     *            Command to start a new transaction.
     *            </p>
     */
    public void setStartTransaction(StartTransactionRequest startTransaction) {
        this.startTransaction = startTransaction;
    }

    /**
     * <p>
     * Command to start a new transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTransaction <p>
     *            Command to start a new transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withStartTransaction(StartTransactionRequest startTransaction) {
        this.startTransaction = startTransaction;
        return this;
    }

    /**
     * <p>
     * Command to end the current session.
     * </p>
     *
     * @return <p>
     *         Command to end the current session.
     *         </p>
     */
    public EndSessionRequest getEndSession() {
        return endSession;
    }

    /**
     * <p>
     * Command to end the current session.
     * </p>
     *
     * @param endSession <p>
     *            Command to end the current session.
     *            </p>
     */
    public void setEndSession(EndSessionRequest endSession) {
        this.endSession = endSession;
    }

    /**
     * <p>
     * Command to end the current session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endSession <p>
     *            Command to end the current session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withEndSession(EndSessionRequest endSession) {
        this.endSession = endSession;
        return this;
    }

    /**
     * <p>
     * Command to commit the specified transaction.
     * </p>
     *
     * @return <p>
     *         Command to commit the specified transaction.
     *         </p>
     */
    public CommitTransactionRequest getCommitTransaction() {
        return commitTransaction;
    }

    /**
     * <p>
     * Command to commit the specified transaction.
     * </p>
     *
     * @param commitTransaction <p>
     *            Command to commit the specified transaction.
     *            </p>
     */
    public void setCommitTransaction(CommitTransactionRequest commitTransaction) {
        this.commitTransaction = commitTransaction;
    }

    /**
     * <p>
     * Command to commit the specified transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitTransaction <p>
     *            Command to commit the specified transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withCommitTransaction(CommitTransactionRequest commitTransaction) {
        this.commitTransaction = commitTransaction;
        return this;
    }

    /**
     * <p>
     * Command to abort the current transaction.
     * </p>
     *
     * @return <p>
     *         Command to abort the current transaction.
     *         </p>
     */
    public AbortTransactionRequest getAbortTransaction() {
        return abortTransaction;
    }

    /**
     * <p>
     * Command to abort the current transaction.
     * </p>
     *
     * @param abortTransaction <p>
     *            Command to abort the current transaction.
     *            </p>
     */
    public void setAbortTransaction(AbortTransactionRequest abortTransaction) {
        this.abortTransaction = abortTransaction;
    }

    /**
     * <p>
     * Command to abort the current transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortTransaction <p>
     *            Command to abort the current transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withAbortTransaction(AbortTransactionRequest abortTransaction) {
        this.abortTransaction = abortTransaction;
        return this;
    }

    /**
     * <p>
     * Command to execute a statement in the specified transaction.
     * </p>
     *
     * @return <p>
     *         Command to execute a statement in the specified transaction.
     *         </p>
     */
    public ExecuteStatementRequest getExecuteStatement() {
        return executeStatement;
    }

    /**
     * <p>
     * Command to execute a statement in the specified transaction.
     * </p>
     *
     * @param executeStatement <p>
     *            Command to execute a statement in the specified transaction.
     *            </p>
     */
    public void setExecuteStatement(ExecuteStatementRequest executeStatement) {
        this.executeStatement = executeStatement;
    }

    /**
     * <p>
     * Command to execute a statement in the specified transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param executeStatement <p>
     *            Command to execute a statement in the specified transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withExecuteStatement(ExecuteStatementRequest executeStatement) {
        this.executeStatement = executeStatement;
        return this;
    }

    /**
     * <p>
     * Command to fetch a page.
     * </p>
     *
     * @return <p>
     *         Command to fetch a page.
     *         </p>
     */
    public FetchPageRequest getFetchPage() {
        return fetchPage;
    }

    /**
     * <p>
     * Command to fetch a page.
     * </p>
     *
     * @param fetchPage <p>
     *            Command to fetch a page.
     *            </p>
     */
    public void setFetchPage(FetchPageRequest fetchPage) {
        this.fetchPage = fetchPage;
    }

    /**
     * <p>
     * Command to fetch a page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fetchPage <p>
     *            Command to fetch a page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendCommandRequest withFetchPage(FetchPageRequest fetchPage) {
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
        if (getSessionToken() != null)
            sb.append("SessionToken: " + getSessionToken() + ",");
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
                + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
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

        if (obj instanceof SendCommandRequest == false)
            return false;
        SendCommandRequest other = (SendCommandRequest) obj;

        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null
                && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
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
