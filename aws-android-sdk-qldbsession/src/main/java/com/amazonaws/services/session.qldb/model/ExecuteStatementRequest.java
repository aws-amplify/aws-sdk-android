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
 * Specifies a request to execute a statement.
 * </p>
 */
public class ExecuteStatementRequest implements Serializable {
    /**
     * <p>
     * Specifies the transaction ID of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String transactionId;

    /**
     * <p>
     * Specifies the statement of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     */
    private String statement;

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     */
    private java.util.List<ValueHolder> parameters;

    /**
     * <p>
     * Specifies the transaction ID of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         Specifies the transaction ID of the request.
     *         </p>
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param transactionId <p>
     *            Specifies the transaction ID of the request.
     *            </p>
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * Specifies the transaction ID of the request.
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
     *            Specifies the transaction ID of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecuteStatementRequest withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * <p>
     * Specifies the statement of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @return <p>
     *         Specifies the statement of the request.
     *         </p>
     */
    public String getStatement() {
        return statement;
    }

    /**
     * <p>
     * Specifies the statement of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param statement <p>
     *            Specifies the statement of the request.
     *            </p>
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * Specifies the statement of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param statement <p>
     *            Specifies the statement of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecuteStatementRequest withStatement(String statement) {
        this.statement = statement;
        return this;
    }

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     *
     * @return <p>
     *         Specifies the parameters for the parameterized statement in the
     *         request.
     *         </p>
     */
    public java.util.List<ValueHolder> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     *
     * @param parameters <p>
     *            Specifies the parameters for the parameterized statement in
     *            the request.
     *            </p>
     */
    public void setParameters(java.util.Collection<ValueHolder> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new java.util.ArrayList<ValueHolder>(parameters);
    }

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Specifies the parameters for the parameterized statement in
     *            the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecuteStatementRequest withParameters(ValueHolder... parameters) {
        if (getParameters() == null) {
            this.parameters = new java.util.ArrayList<ValueHolder>(parameters.length);
        }
        for (ValueHolder value : parameters) {
            this.parameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the parameters for the parameterized statement in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            Specifies the parameters for the parameterized statement in
     *            the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecuteStatementRequest withParameters(java.util.Collection<ValueHolder> parameters) {
        setParameters(parameters);
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
        if (getStatement() != null)
            sb.append("Statement: " + getStatement() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteStatementRequest == false)
            return false;
        ExecuteStatementRequest other = (ExecuteStatementRequest) obj;

        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null
                && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null
                && other.getStatement().equals(this.getStatement()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
