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
 * Returns information about errors in a BatchGetCommits operation.
 * </p>
 */
public class BatchGetCommitsError implements Serializable {
    /**
     * <p>
     * A commit ID that either could not be found or was not in a valid format.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * An error code that specifies whether the commit ID was not valid or not
     * found.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * An error message that provides detail about why the commit ID either was
     * not found or was not valid.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * A commit ID that either could not be found or was not in a valid format.
     * </p>
     *
     * @return <p>
     *         A commit ID that either could not be found or was not in a valid
     *         format.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * A commit ID that either could not be found or was not in a valid format.
     * </p>
     *
     * @param commitId <p>
     *            A commit ID that either could not be found or was not in a
     *            valid format.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * A commit ID that either could not be found or was not in a valid format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitId <p>
     *            A commit ID that either could not be found or was not in a
     *            valid format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsError withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * An error code that specifies whether the commit ID was not valid or not
     * found.
     * </p>
     *
     * @return <p>
     *         An error code that specifies whether the commit ID was not valid
     *         or not found.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * An error code that specifies whether the commit ID was not valid or not
     * found.
     * </p>
     *
     * @param errorCode <p>
     *            An error code that specifies whether the commit ID was not
     *            valid or not found.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code that specifies whether the commit ID was not valid or not
     * found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            An error code that specifies whether the commit ID was not
     *            valid or not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * An error message that provides detail about why the commit ID either was
     * not found or was not valid.
     * </p>
     *
     * @return <p>
     *         An error message that provides detail about why the commit ID
     *         either was not found or was not valid.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * An error message that provides detail about why the commit ID either was
     * not found or was not valid.
     * </p>
     *
     * @param errorMessage <p>
     *            An error message that provides detail about why the commit ID
     *            either was not found or was not valid.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message that provides detail about why the commit ID either was
     * not found or was not valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            An error message that provides detail about why the commit ID
     *            either was not found or was not valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsError withErrorMessage(String errorMessage) {
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
        if (getCommitId() != null)
            sb.append("commitId: " + getCommitId() + ",");
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

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
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

        if (obj instanceof BatchGetCommitsError == false)
            return false;
        BatchGetCommitsError other = (BatchGetCommitsError) obj;

        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
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
