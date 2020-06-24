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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Returns information about errors in a BatchDescribeMergeConflicts operation.
 * </p>
 */
public class BatchDescribeMergeConflictsError implements Serializable {
    /**
     * <p>
     * The path to the file.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The name of the exception.
     * </p>
     */
    private String exceptionName;

    /**
     * <p>
     * The message provided by the exception.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The path to the file.
     * </p>
     *
     * @return <p>
     *         The path to the file.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The path to the file.
     * </p>
     *
     * @param filePath <p>
     *            The path to the file.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The path to the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The path to the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDescribeMergeConflictsError withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     *
     * @return <p>
     *         The name of the exception.
     *         </p>
     */
    public String getExceptionName() {
        return exceptionName;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     *
     * @param exceptionName <p>
     *            The name of the exception.
     *            </p>
     */
    public void setExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
    }

    /**
     * <p>
     * The name of the exception.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exceptionName <p>
     *            The name of the exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDescribeMergeConflictsError withExceptionName(String exceptionName) {
        this.exceptionName = exceptionName;
        return this;
    }

    /**
     * <p>
     * The message provided by the exception.
     * </p>
     *
     * @return <p>
     *         The message provided by the exception.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message provided by the exception.
     * </p>
     *
     * @param message <p>
     *            The message provided by the exception.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message provided by the exception.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The message provided by the exception.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDescribeMergeConflictsError withMessage(String message) {
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
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath() + ",");
        if (getExceptionName() != null)
            sb.append("exceptionName: " + getExceptionName() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode
                + ((getExceptionName() == null) ? 0 : getExceptionName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeMergeConflictsError == false)
            return false;
        BatchDescribeMergeConflictsError other = (BatchDescribeMergeConflictsError) obj;

        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getExceptionName() == null ^ this.getExceptionName() == null)
            return false;
        if (other.getExceptionName() != null
                && other.getExceptionName().equals(this.getExceptionName()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
