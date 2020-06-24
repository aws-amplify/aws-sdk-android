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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the contents of a specified folder in a repository.
 * </p>
 */
public class GetFolderRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * A fully qualified reference used to identify a commit that contains the
     * version of the folder's content to return. A fully qualified reference
     * can be a commit ID, branch name, tag, or reference such as HEAD. If no
     * specifier is provided, the folder content is returned as it exists in the
     * HEAD commit.
     * </p>
     */
    private String commitSpecifier;

    /**
     * <p>
     * The fully qualified path to the folder whose contents are returned,
     * including the folder name. For example, /examples is a fully-qualified
     * path to a folder named examples that was created off of the root
     * directory (/) of a repository.
     * </p>
     */
    private String folderPath;

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * A fully qualified reference used to identify a commit that contains the
     * version of the folder's content to return. A fully qualified reference
     * can be a commit ID, branch name, tag, or reference such as HEAD. If no
     * specifier is provided, the folder content is returned as it exists in the
     * HEAD commit.
     * </p>
     *
     * @return <p>
     *         A fully qualified reference used to identify a commit that
     *         contains the version of the folder's content to return. A fully
     *         qualified reference can be a commit ID, branch name, tag, or
     *         reference such as HEAD. If no specifier is provided, the folder
     *         content is returned as it exists in the HEAD commit.
     *         </p>
     */
    public String getCommitSpecifier() {
        return commitSpecifier;
    }

    /**
     * <p>
     * A fully qualified reference used to identify a commit that contains the
     * version of the folder's content to return. A fully qualified reference
     * can be a commit ID, branch name, tag, or reference such as HEAD. If no
     * specifier is provided, the folder content is returned as it exists in the
     * HEAD commit.
     * </p>
     *
     * @param commitSpecifier <p>
     *            A fully qualified reference used to identify a commit that
     *            contains the version of the folder's content to return. A
     *            fully qualified reference can be a commit ID, branch name,
     *            tag, or reference such as HEAD. If no specifier is provided,
     *            the folder content is returned as it exists in the HEAD
     *            commit.
     *            </p>
     */
    public void setCommitSpecifier(String commitSpecifier) {
        this.commitSpecifier = commitSpecifier;
    }

    /**
     * <p>
     * A fully qualified reference used to identify a commit that contains the
     * version of the folder's content to return. A fully qualified reference
     * can be a commit ID, branch name, tag, or reference such as HEAD. If no
     * specifier is provided, the folder content is returned as it exists in the
     * HEAD commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitSpecifier <p>
     *            A fully qualified reference used to identify a commit that
     *            contains the version of the folder's content to return. A
     *            fully qualified reference can be a commit ID, branch name,
     *            tag, or reference such as HEAD. If no specifier is provided,
     *            the folder content is returned as it exists in the HEAD
     *            commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderRequest withCommitSpecifier(String commitSpecifier) {
        this.commitSpecifier = commitSpecifier;
        return this;
    }

    /**
     * <p>
     * The fully qualified path to the folder whose contents are returned,
     * including the folder name. For example, /examples is a fully-qualified
     * path to a folder named examples that was created off of the root
     * directory (/) of a repository.
     * </p>
     *
     * @return <p>
     *         The fully qualified path to the folder whose contents are
     *         returned, including the folder name. For example, /examples is a
     *         fully-qualified path to a folder named examples that was created
     *         off of the root directory (/) of a repository.
     *         </p>
     */
    public String getFolderPath() {
        return folderPath;
    }

    /**
     * <p>
     * The fully qualified path to the folder whose contents are returned,
     * including the folder name. For example, /examples is a fully-qualified
     * path to a folder named examples that was created off of the root
     * directory (/) of a repository.
     * </p>
     *
     * @param folderPath <p>
     *            The fully qualified path to the folder whose contents are
     *            returned, including the folder name. For example, /examples is
     *            a fully-qualified path to a folder named examples that was
     *            created off of the root directory (/) of a repository.
     *            </p>
     */
    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    /**
     * <p>
     * The fully qualified path to the folder whose contents are returned,
     * including the folder name. For example, /examples is a fully-qualified
     * path to a folder named examples that was created off of the root
     * directory (/) of a repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param folderPath <p>
     *            The fully qualified path to the folder whose contents are
     *            returned, including the folder name. For example, /examples is
     *            a fully-qualified path to a folder named examples that was
     *            created off of the root directory (/) of a repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFolderRequest withFolderPath(String folderPath) {
        this.folderPath = folderPath;
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
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getCommitSpecifier() != null)
            sb.append("commitSpecifier: " + getCommitSpecifier() + ",");
        if (getFolderPath() != null)
            sb.append("folderPath: " + getFolderPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode
                + ((getCommitSpecifier() == null) ? 0 : getCommitSpecifier().hashCode());
        hashCode = prime * hashCode + ((getFolderPath() == null) ? 0 : getFolderPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFolderRequest == false)
            return false;
        GetFolderRequest other = (GetFolderRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getCommitSpecifier() == null ^ this.getCommitSpecifier() == null)
            return false;
        if (other.getCommitSpecifier() != null
                && other.getCommitSpecifier().equals(this.getCommitSpecifier()) == false)
            return false;
        if (other.getFolderPath() == null ^ this.getFolderPath() == null)
            return false;
        if (other.getFolderPath() != null
                && other.getFolderPath().equals(this.getFolderPath()) == false)
            return false;
        return true;
    }
}
