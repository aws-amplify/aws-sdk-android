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
 * Returns information about a submodule reference in a repository folder.
 * </p>
 */
public class SubModule implements Serializable {
    /**
     * <p>
     * The commit ID that contains the reference to the submodule.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * The fully qualified path to the folder that contains the reference to the
     * submodule.
     * </p>
     */
    private String absolutePath;

    /**
     * <p>
     * The relative path of the submodule from the folder where the query
     * originated.
     * </p>
     */
    private String relativePath;

    /**
     * <p>
     * The commit ID that contains the reference to the submodule.
     * </p>
     *
     * @return <p>
     *         The commit ID that contains the reference to the submodule.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * The commit ID that contains the reference to the submodule.
     * </p>
     *
     * @param commitId <p>
     *            The commit ID that contains the reference to the submodule.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The commit ID that contains the reference to the submodule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitId <p>
     *            The commit ID that contains the reference to the submodule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubModule withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * The fully qualified path to the folder that contains the reference to the
     * submodule.
     * </p>
     *
     * @return <p>
     *         The fully qualified path to the folder that contains the
     *         reference to the submodule.
     *         </p>
     */
    public String getAbsolutePath() {
        return absolutePath;
    }

    /**
     * <p>
     * The fully qualified path to the folder that contains the reference to the
     * submodule.
     * </p>
     *
     * @param absolutePath <p>
     *            The fully qualified path to the folder that contains the
     *            reference to the submodule.
     *            </p>
     */
    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    /**
     * <p>
     * The fully qualified path to the folder that contains the reference to the
     * submodule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param absolutePath <p>
     *            The fully qualified path to the folder that contains the
     *            reference to the submodule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubModule withAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
        return this;
    }

    /**
     * <p>
     * The relative path of the submodule from the folder where the query
     * originated.
     * </p>
     *
     * @return <p>
     *         The relative path of the submodule from the folder where the
     *         query originated.
     *         </p>
     */
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * <p>
     * The relative path of the submodule from the folder where the query
     * originated.
     * </p>
     *
     * @param relativePath <p>
     *            The relative path of the submodule from the folder where the
     *            query originated.
     *            </p>
     */
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * <p>
     * The relative path of the submodule from the folder where the query
     * originated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relativePath <p>
     *            The relative path of the submodule from the folder where the
     *            query originated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubModule withRelativePath(String relativePath) {
        this.relativePath = relativePath;
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
        if (getAbsolutePath() != null)
            sb.append("absolutePath: " + getAbsolutePath() + ",");
        if (getRelativePath() != null)
            sb.append("relativePath: " + getRelativePath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getAbsolutePath() == null) ? 0 : getAbsolutePath().hashCode());
        hashCode = prime * hashCode
                + ((getRelativePath() == null) ? 0 : getRelativePath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubModule == false)
            return false;
        SubModule other = (SubModule) obj;

        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getAbsolutePath() == null ^ this.getAbsolutePath() == null)
            return false;
        if (other.getAbsolutePath() != null
                && other.getAbsolutePath().equals(this.getAbsolutePath()) == false)
            return false;
        if (other.getRelativePath() == null ^ this.getRelativePath() == null)
            return false;
        if (other.getRelativePath() != null
                && other.getRelativePath().equals(this.getRelativePath()) == false)
            return false;
        return true;
    }
}
