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

package com.amazonaws.services.es.model;

import java.io.Serializable;

public class ErrorDetails implements Serializable {
    /**
     * The new value for the errorType property for this object.
     */
    private String errorType;

    /**
     * The new value for the errorMessage property for this object.
     */
    private String errorMessage;

    /**
     * Returns the value of the errorType property for this object.
     *
     * @return The value of the errorType property for this object.
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of errorType
     *
     * @param errorType The new value for the errorType property for this
     *            object.
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * Sets the value of the errorType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorType The new value for the errorType property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorDetails withErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }

    /**
     * Returns the value of the errorMessage property for this object.
     *
     * @return The value of the errorMessage property for this object.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of errorMessage
     *
     * @param errorMessage The new value for the errorMessage property for this
     *            object.
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Sets the value of the errorMessage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage The new value for the errorMessage property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorDetails withErrorMessage(String errorMessage) {
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
        if (getErrorType() != null)
            sb.append("ErrorType: " + getErrorType() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
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

        if (obj instanceof ErrorDetails == false)
            return false;
        ErrorDetails other = (ErrorDetails) obj;

        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null
                && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
