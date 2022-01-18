/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the batch request error details associated with the request.
 * </p>
 */
public class BatchItemError implements Serializable {
    /**
     * <p>
     * The error code associated with the batch request error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDeniedError, ConflictError,
     * InternalServerError, ResourceNotFoundError, ThrottlingError,
     * ValidationError
     */
    private String code;

    /**
     * <p>
     * A message with the reason for the batch request error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code associated with the batch request error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDeniedError, ConflictError,
     * InternalServerError, ResourceNotFoundError, ThrottlingError,
     * ValidationError
     *
     * @return <p>
     *         The error code associated with the batch request error.
     *         </p>
     * @see BatchItemErrorCode
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The error code associated with the batch request error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDeniedError, ConflictError,
     * InternalServerError, ResourceNotFoundError, ThrottlingError,
     * ValidationError
     *
     * @param code <p>
     *            The error code associated with the batch request error.
     *            </p>
     * @see BatchItemErrorCode
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code associated with the batch request error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDeniedError, ConflictError,
     * InternalServerError, ResourceNotFoundError, ThrottlingError,
     * ValidationError
     *
     * @param code <p>
     *            The error code associated with the batch request error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchItemErrorCode
     */
    public BatchItemError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The error code associated with the batch request error.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDeniedError, ConflictError,
     * InternalServerError, ResourceNotFoundError, ThrottlingError,
     * ValidationError
     *
     * @param code <p>
     *            The error code associated with the batch request error.
     *            </p>
     * @see BatchItemErrorCode
     */
    public void setCode(BatchItemErrorCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The error code associated with the batch request error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AccessDeniedError, ConflictError,
     * InternalServerError, ResourceNotFoundError, ThrottlingError,
     * ValidationError
     *
     * @param code <p>
     *            The error code associated with the batch request error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchItemErrorCode
     */
    public BatchItemError withCode(BatchItemErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A message with the reason for the batch request error.
     * </p>
     *
     * @return <p>
     *         A message with the reason for the batch request error.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A message with the reason for the batch request error.
     * </p>
     *
     * @param message <p>
     *            A message with the reason for the batch request error.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message with the reason for the batch request error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A message with the reason for the batch request error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchItemError withMessage(String message) {
        this.message = message;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchItemError == false)
            return false;
        BatchItemError other = (BatchItemError) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
