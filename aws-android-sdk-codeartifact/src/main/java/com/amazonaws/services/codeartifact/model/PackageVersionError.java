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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

/**
 * <p>
 * An error associated with package.
 * </p>
 */
public class PackageVersionError implements Serializable {
    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALREADY_EXISTS, MISMATCHED_REVISION,
     * MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED
     */
    private String errorCode;

    /**
     * <p>
     * The error message associated with the error.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALREADY_EXISTS, MISMATCHED_REVISION,
     * MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED
     *
     * @return <p>
     *         The error code associated with the error. Valid error codes are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALREADY_EXISTS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISMATCHED_REVISION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISMATCHED_STATUS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_ALLOWED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_FOUND</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIPPED</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see PackageVersionErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALREADY_EXISTS, MISMATCHED_REVISION,
     * MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED
     *
     * @param errorCode <p>
     *            The error code associated with the error. Valid error codes
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALREADY_EXISTS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_REVISION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_STATUS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_ALLOWED</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_FOUND</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SKIPPED</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see PackageVersionErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALREADY_EXISTS, MISMATCHED_REVISION,
     * MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED
     *
     * @param errorCode <p>
     *            The error code associated with the error. Valid error codes
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALREADY_EXISTS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_REVISION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_STATUS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_ALLOWED</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_FOUND</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SKIPPED</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageVersionErrorCode
     */
    public PackageVersionError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALREADY_EXISTS, MISMATCHED_REVISION,
     * MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED
     *
     * @param errorCode <p>
     *            The error code associated with the error. Valid error codes
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALREADY_EXISTS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_REVISION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_STATUS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_ALLOWED</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_FOUND</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SKIPPED</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see PackageVersionErrorCode
     */
    public void setErrorCode(PackageVersionErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * The error code associated with the error. Valid error codes are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALREADY_EXISTS, MISMATCHED_REVISION,
     * MISMATCHED_STATUS, NOT_ALLOWED, NOT_FOUND, SKIPPED
     *
     * @param errorCode <p>
     *            The error code associated with the error. Valid error codes
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALREADY_EXISTS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_REVISION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_STATUS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_ALLOWED</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_FOUND</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SKIPPED</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageVersionErrorCode
     */
    public PackageVersionError withErrorCode(PackageVersionErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The error message associated with the error.
     * </p>
     *
     * @return <p>
     *         The error message associated with the error.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message associated with the error.
     * </p>
     *
     * @param errorMessage <p>
     *            The error message associated with the error.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message associated with the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            The error message associated with the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionError withErrorMessage(String errorMessage) {
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
        if (getErrorCode() != null)
            sb.append("errorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("errorMessage: " + getErrorMessage());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageVersionError == false)
            return false;
        PackageVersionError other = (PackageVersionError) obj;

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
