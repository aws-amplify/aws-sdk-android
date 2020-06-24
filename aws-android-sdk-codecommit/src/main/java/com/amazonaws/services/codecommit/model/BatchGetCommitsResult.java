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

public class BatchGetCommitsResult implements Serializable {
    /**
     * <p>
     * An array of commit data type objects, each of which contains information
     * about a specified commit.
     * </p>
     */
    private java.util.List<Commit> commits;

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For
     * example, if one of the commit IDs was a shortened SHA ID or that commit
     * was not found in the specified repository, the ID returns an error object
     * with more information.
     * </p>
     */
    private java.util.List<BatchGetCommitsError> errors;

    /**
     * <p>
     * An array of commit data type objects, each of which contains information
     * about a specified commit.
     * </p>
     *
     * @return <p>
     *         An array of commit data type objects, each of which contains
     *         information about a specified commit.
     *         </p>
     */
    public java.util.List<Commit> getCommits() {
        return commits;
    }

    /**
     * <p>
     * An array of commit data type objects, each of which contains information
     * about a specified commit.
     * </p>
     *
     * @param commits <p>
     *            An array of commit data type objects, each of which contains
     *            information about a specified commit.
     *            </p>
     */
    public void setCommits(java.util.Collection<Commit> commits) {
        if (commits == null) {
            this.commits = null;
            return;
        }

        this.commits = new java.util.ArrayList<Commit>(commits);
    }

    /**
     * <p>
     * An array of commit data type objects, each of which contains information
     * about a specified commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commits <p>
     *            An array of commit data type objects, each of which contains
     *            information about a specified commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsResult withCommits(Commit... commits) {
        if (getCommits() == null) {
            this.commits = new java.util.ArrayList<Commit>(commits.length);
        }
        for (Commit value : commits) {
            this.commits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of commit data type objects, each of which contains information
     * about a specified commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commits <p>
     *            An array of commit data type objects, each of which contains
     *            information about a specified commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsResult withCommits(java.util.Collection<Commit> commits) {
        setCommits(commits);
        return this;
    }

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For
     * example, if one of the commit IDs was a shortened SHA ID or that commit
     * was not found in the specified repository, the ID returns an error object
     * with more information.
     * </p>
     *
     * @return <p>
     *         Returns any commit IDs for which information could not be found.
     *         For example, if one of the commit IDs was a shortened SHA ID or
     *         that commit was not found in the specified repository, the ID
     *         returns an error object with more information.
     *         </p>
     */
    public java.util.List<BatchGetCommitsError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For
     * example, if one of the commit IDs was a shortened SHA ID or that commit
     * was not found in the specified repository, the ID returns an error object
     * with more information.
     * </p>
     *
     * @param errors <p>
     *            Returns any commit IDs for which information could not be
     *            found. For example, if one of the commit IDs was a shortened
     *            SHA ID or that commit was not found in the specified
     *            repository, the ID returns an error object with more
     *            information.
     *            </p>
     */
    public void setErrors(java.util.Collection<BatchGetCommitsError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetCommitsError>(errors);
    }

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For
     * example, if one of the commit IDs was a shortened SHA ID or that commit
     * was not found in the specified repository, the ID returns an error object
     * with more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Returns any commit IDs for which information could not be
     *            found. For example, if one of the commit IDs was a shortened
     *            SHA ID or that commit was not found in the specified
     *            repository, the ID returns an error object with more
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsResult withErrors(BatchGetCommitsError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<BatchGetCommitsError>(errors.length);
        }
        for (BatchGetCommitsError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns any commit IDs for which information could not be found. For
     * example, if one of the commit IDs was a shortened SHA ID or that commit
     * was not found in the specified repository, the ID returns an error object
     * with more information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Returns any commit IDs for which information could not be
     *            found. For example, if one of the commit IDs was a shortened
     *            SHA ID or that commit was not found in the specified
     *            repository, the ID returns an error object with more
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetCommitsResult withErrors(java.util.Collection<BatchGetCommitsError> errors) {
        setErrors(errors);
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
        if (getCommits() != null)
            sb.append("commits: " + getCommits() + ",");
        if (getErrors() != null)
            sb.append("errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommits() == null) ? 0 : getCommits().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCommitsResult == false)
            return false;
        BatchGetCommitsResult other = (BatchGetCommitsResult) obj;

        if (other.getCommits() == null ^ this.getCommits() == null)
            return false;
        if (other.getCommits() != null && other.getCommits().equals(this.getCommits()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
