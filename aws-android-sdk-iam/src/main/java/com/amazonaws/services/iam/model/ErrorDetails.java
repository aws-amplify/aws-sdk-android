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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the reason that the operation failed.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>GetOrganizationsAccessReport</a>, <a>GetServiceLastAccessedDetails</a>,
 * and <a>GetServiceLastAccessedDetailsWithEntities</a> operations.
 * </p>
 */
public class ErrorDetails implements Serializable {
    /**
     * <p>
     * Detailed information about the reason that the operation failed.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code associated with the operation failure.
     * </p>
     */
    private String code;

    /**
     * <p>
     * Detailed information about the reason that the operation failed.
     * </p>
     *
     * @return <p>
     *         Detailed information about the reason that the operation failed.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Detailed information about the reason that the operation failed.
     * </p>
     *
     * @param message <p>
     *            Detailed information about the reason that the operation
     *            failed.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Detailed information about the reason that the operation failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Detailed information about the reason that the operation
     *            failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorDetails withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The error code associated with the operation failure.
     * </p>
     *
     * @return <p>
     *         The error code associated with the operation failure.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The error code associated with the operation failure.
     * </p>
     *
     * @param code <p>
     *            The error code associated with the operation failure.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code associated with the operation failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            The error code associated with the operation failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorDetails withCode(String code) {
        this.code = code;
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getCode() != null)
            sb.append("Code: " + getCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorDetails == false)
            return false;
        ErrorDetails other = (ErrorDetails) obj;

        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        return true;
    }
}
