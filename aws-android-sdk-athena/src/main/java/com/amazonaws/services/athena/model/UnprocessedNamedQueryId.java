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
 * Information about a named query ID that could not be processed.
 * </p>
 */
public class UnprocessedNamedQueryId implements Serializable {
    /**
     * <p>
     * The unique identifier of the named query.
     * </p>
     */
    private String namedQueryId;

    /**
     * <p>
     * The error code returned when the processing request for the named query
     * failed, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String errorCode;

    /**
     * <p>
     * The error message returned when the processing request for the named
     * query failed, if applicable.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The unique identifier of the named query.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the named query.
     *         </p>
     */
    public String getNamedQueryId() {
        return namedQueryId;
    }

    /**
     * <p>
     * The unique identifier of the named query.
     * </p>
     *
     * @param namedQueryId <p>
     *            The unique identifier of the named query.
     *            </p>
     */
    public void setNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }

    /**
     * <p>
     * The unique identifier of the named query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namedQueryId <p>
     *            The unique identifier of the named query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedNamedQueryId withNamedQueryId(String namedQueryId) {
        this.namedQueryId = namedQueryId;
        return this;
    }

    /**
     * <p>
     * The error code returned when the processing request for the named query
     * failed, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The error code returned when the processing request for the named
     *         query failed, if applicable.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code returned when the processing request for the named query
     * failed, if applicable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param errorCode <p>
     *            The error code returned when the processing request for the
     *            named query failed, if applicable.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code returned when the processing request for the named query
     * failed, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param errorCode <p>
     *            The error code returned when the processing request for the
     *            named query failed, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedNamedQueryId withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error message returned when the processing request for the named
     * query failed, if applicable.
     * </p>
     *
     * @return <p>
     *         The error message returned when the processing request for the
     *         named query failed, if applicable.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message returned when the processing request for the named
     * query failed, if applicable.
     * </p>
     *
     * @param errorMessage <p>
     *            The error message returned when the processing request for the
     *            named query failed, if applicable.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message returned when the processing request for the named
     * query failed, if applicable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            The error message returned when the processing request for the
     *            named query failed, if applicable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UnprocessedNamedQueryId withErrorMessage(String errorMessage) {
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
        if (getNamedQueryId() != null)
            sb.append("NamedQueryId: " + getNamedQueryId() + ",");
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
                + ((getNamedQueryId() == null) ? 0 : getNamedQueryId().hashCode());
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

        if (obj instanceof UnprocessedNamedQueryId == false)
            return false;
        UnprocessedNamedQueryId other = (UnprocessedNamedQueryId) obj;

        if (other.getNamedQueryId() == null ^ this.getNamedQueryId() == null)
            return false;
        if (other.getNamedQueryId() != null
                && other.getNamedQueryId().equals(this.getNamedQueryId()) == false)
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
