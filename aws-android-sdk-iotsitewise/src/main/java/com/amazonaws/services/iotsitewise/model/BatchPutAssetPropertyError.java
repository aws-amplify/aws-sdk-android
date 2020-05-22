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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains error information from updating a batch of asset property values.
 * </p>
 */
public class BatchPutAssetPropertyError implements Serializable {
    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceNotFoundException,
     * InvalidRequestException, InternalFailureException,
     * ServiceUnavailableException, ThrottlingException, LimitExceededException,
     * ConflictingOperationException, TimestampOutOfRangeException,
     * AccessDeniedException
     */
    private String errorCode;

    /**
     * <p>
     * The associated error message.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     */
    private java.util.List<TimeInNanos> timestamps;

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceNotFoundException,
     * InvalidRequestException, InternalFailureException,
     * ServiceUnavailableException, ThrottlingException, LimitExceededException,
     * ConflictingOperationException, TimestampOutOfRangeException,
     * AccessDeniedException
     *
     * @return <p>
     *         The error code.
     *         </p>
     * @see BatchPutAssetPropertyValueErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceNotFoundException,
     * InvalidRequestException, InternalFailureException,
     * ServiceUnavailableException, ThrottlingException, LimitExceededException,
     * ConflictingOperationException, TimestampOutOfRangeException,
     * AccessDeniedException
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @see BatchPutAssetPropertyValueErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceNotFoundException,
     * InvalidRequestException, InternalFailureException,
     * ServiceUnavailableException, ThrottlingException, LimitExceededException,
     * ConflictingOperationException, TimestampOutOfRangeException,
     * AccessDeniedException
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchPutAssetPropertyValueErrorCode
     */
    public BatchPutAssetPropertyError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceNotFoundException,
     * InvalidRequestException, InternalFailureException,
     * ServiceUnavailableException, ThrottlingException, LimitExceededException,
     * ConflictingOperationException, TimestampOutOfRangeException,
     * AccessDeniedException
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @see BatchPutAssetPropertyValueErrorCode
     */
    public void setErrorCode(BatchPutAssetPropertyValueErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * The error code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ResourceNotFoundException,
     * InvalidRequestException, InternalFailureException,
     * ServiceUnavailableException, ThrottlingException, LimitExceededException,
     * ConflictingOperationException, TimestampOutOfRangeException,
     * AccessDeniedException
     *
     * @param errorCode <p>
     *            The error code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchPutAssetPropertyValueErrorCode
     */
    public BatchPutAssetPropertyError withErrorCode(BatchPutAssetPropertyValueErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The associated error message.
     * </p>
     *
     * @return <p>
     *         The associated error message.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The associated error message.
     * </p>
     *
     * @param errorMessage <p>
     *            The associated error message.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The associated error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            The associated error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     *
     * @return <p>
     *         A list of timestamps for each error, if any.
     *         </p>
     */
    public java.util.List<TimeInNanos> getTimestamps() {
        return timestamps;
    }

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     *
     * @param timestamps <p>
     *            A list of timestamps for each error, if any.
     *            </p>
     */
    public void setTimestamps(java.util.Collection<TimeInNanos> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new java.util.ArrayList<TimeInNanos>(timestamps);
    }

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamps <p>
     *            A list of timestamps for each error, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyError withTimestamps(TimeInNanos... timestamps) {
        if (getTimestamps() == null) {
            this.timestamps = new java.util.ArrayList<TimeInNanos>(timestamps.length);
        }
        for (TimeInNanos value : timestamps) {
            this.timestamps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of timestamps for each error, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamps <p>
     *            A list of timestamps for each error, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutAssetPropertyError withTimestamps(java.util.Collection<TimeInNanos> timestamps) {
        setTimestamps(timestamps);
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
        if (getErrorCode() != null)
            sb.append("errorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("errorMessage: " + getErrorMessage() + ",");
        if (getTimestamps() != null)
            sb.append("timestamps: " + getTimestamps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutAssetPropertyError == false)
            return false;
        BatchPutAssetPropertyError other = (BatchPutAssetPropertyError) obj;

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
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null
                && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        return true;
    }
}
