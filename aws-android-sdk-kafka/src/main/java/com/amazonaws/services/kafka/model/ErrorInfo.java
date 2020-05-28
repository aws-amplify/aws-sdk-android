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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Returns information about an error state of the cluster.
 * </p>
 */
public class ErrorInfo implements Serializable {
    /**
     * 
     <p>
     * A number describing the error programmatically.
     * </p>
     */
    private String errorCode;

    /**
     * 
     <p>
     * An optional field to provide more details about the error.
     * </p>
     */
    private String errorString;

    /**
     * 
     <p>
     * A number describing the error programmatically.
     * </p>
     * 
     * @return <p>
     *         A number describing the error programmatically.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 
     <p>
     * A number describing the error programmatically.
     * </p>
     * 
     * @param errorCode <p>
     *            A number describing the error programmatically.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 
     <p>
     * A number describing the error programmatically.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            A number describing the error programmatically.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorInfo withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 
     <p>
     * An optional field to provide more details about the error.
     * </p>
     * 
     * @return <p>
     *         An optional field to provide more details about the error.
     *         </p>
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * 
     <p>
     * An optional field to provide more details about the error.
     * </p>
     * 
     * @param errorString <p>
     *            An optional field to provide more details about the error.
     *            </p>
     */
    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

    /**
     * 
     <p>
     * An optional field to provide more details about the error.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorString <p>
     *            An optional field to provide more details about the error.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ErrorInfo withErrorString(String errorString) {
        this.errorString = errorString;
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
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorString() != null)
            sb.append("ErrorString: " + getErrorString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorString() == null) ? 0 : getErrorString().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorInfo == false)
            return false;
        ErrorInfo other = (ErrorInfo) obj;

        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorString() == null ^ this.getErrorString() == null)
            return false;
        if (other.getErrorString() != null
                && other.getErrorString().equals(this.getErrorString()) == false)
            return false;
        return true;
    }
}
