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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a failure a contributor insights operation.
 * </p>
 */
public class FailureException implements Serializable {
    /**
     * <p>
     * Exception name.
     * </p>
     */
    private String exceptionName;

    /**
     * <p>
     * Description of the failure.
     * </p>
     */
    private String exceptionDescription;

    /**
     * <p>
     * Exception name.
     * </p>
     *
     * @return <p>
     *         Exception name.
     *         </p>
     */
    public String getExceptionName() {
        return exceptionName;
    }

    /**
     * <p>
     * Exception name.
     * </p>
     *
     * @param exceptionName <p>
     *            Exception name.
     *            </p>
     */
    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    /**
     * <p>
     * Exception name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exceptionName <p>
     *            Exception name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailureException withExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
        return this;
    }

    /**
     * <p>
     * Description of the failure.
     * </p>
     *
     * @return <p>
     *         Description of the failure.
     *         </p>
     */
    public String getExceptionDescription() {
        return exceptionDescription;
    }

    /**
     * <p>
     * Description of the failure.
     * </p>
     *
     * @param exceptionDescription <p>
     *            Description of the failure.
     *            </p>
     */
    public void setExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }

    /**
     * <p>
     * Description of the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exceptionDescription <p>
     *            Description of the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailureException withExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
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
        if (getExceptionName() != null)
            sb.append("ExceptionName: " + getExceptionName() + ",");
        if (getExceptionDescription() != null)
            sb.append("ExceptionDescription: " + getExceptionDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExceptionName() == null) ? 0 : getExceptionName().hashCode());
        hashCode = prime * hashCode
                + ((getExceptionDescription() == null) ? 0 : getExceptionDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailureException == false)
            return false;
        FailureException other = (FailureException) obj;

        if (other.getExceptionName() == null ^ this.getExceptionName() == null)
            return false;
        if (other.getExceptionName() != null
                && other.getExceptionName().equals(this.getExceptionName()) == false)
            return false;
        if (other.getExceptionDescription() == null ^ this.getExceptionDescription() == null)
            return false;
        if (other.getExceptionDescription() != null
                && other.getExceptionDescription().equals(this.getExceptionDescription()) == false)
            return false;
        return true;
    }
}
