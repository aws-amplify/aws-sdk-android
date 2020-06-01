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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a query execution that failed to process.
 * </p>
 */
public class UnprocessedQueryExecutionId implements Serializable {
    /**
     * <p>
     * The unique identifier of the query execution.
     * </p>
     */
    private String queryExecutionId;

    /**
     * <p>
     * The error code returned when the query execution failed to process, if
     * applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String errorCode;

    /**
     * <p>
     * The error message returned when the query execution failed to process, if
     * applicable.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The unique identifier of the query execution.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the query execution.
     *         </p>
     */
    public String getQueryExecutionId() {
        return queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the query execution.
     * </p>
     *
     * @param queryExecutionId <p>
     *            The unique identifier of the query execution.
     *            </p>
     */
    public void setQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the query execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryExecutionId <p>
     *            The unique identifier of the query execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedQueryExecutionId withQueryExecutionId(String queryExecutionId) {
        this.queryExecutionId = queryExecutionId;
        return this;
    }

    /**
     * <p>
     * The error code returned when the query execution failed to process, if
     * applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The error code returned when the query execution failed to
     *         process, if applicable.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code returned when the query execution failed to process, if
     * applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param errorCode <p>
     *            The error code returned when the query execution failed to
     *            process, if applicable.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code returned when the query execution failed to process, if
     * applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param errorCode <p>
     *            The error code returned when the query execution failed to
     *            process, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedQueryExecutionId withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error message returned when the query execution failed to process, if
     * applicable.
     * </p>
     *
     * @return <p>
     *         The error message returned when the query execution failed to
     *         process, if applicable.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message returned when the query execution failed to process, if
     * applicable.
     * </p>
     *
     * @param errorMessage <p>
     *            The error message returned when the query execution failed to
     *            process, if applicable.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message returned when the query execution failed to process, if
     * applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            The error message returned when the query execution failed to
     *            process, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedQueryExecutionId withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getQueryExecutionId() != null)
            sb.append("QueryExecutionId: " + getQueryExecutionId() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueryExecutionId() == null) ? 0 : getQueryExecutionId().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedQueryExecutionId == false)
            return false;
        UnprocessedQueryExecutionId other = (UnprocessedQueryExecutionId) obj;

        if (other.getQueryExecutionId() == null ^ this.getQueryExecutionId() == null)
            return false;
        if (other.getQueryExecutionId() != null
                && other.getQueryExecutionId().equals(this.getQueryExecutionId()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
