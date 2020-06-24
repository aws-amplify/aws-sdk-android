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
 * Returns the base-64 encoded contents of a specified file and its metadata.
 * </p>
 */
public class GetFileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The fully quaified reference that identifies the commit that contains the
     * file. For example, you can specify a full commit ID, a tag, a branch
     * name, or a reference such as refs/heads/master. If none is provided, the
     * head commit is used.
     * </p>
     */
    private String commitSpecifier;

    /**
     * <p>
     * The fully qualified path to the file, including the full name and
     * extension of the file. For example, /examples/file.md is the fully
     * qualified path to a file named file.md in a folder named examples.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository that contains the file.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the file.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file.
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
     *            The name of the repository that contains the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFileRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The fully quaified reference that identifies the commit that contains the
     * file. For example, you can specify a full commit ID, a tag, a branch
     * name, or a reference such as refs/heads/master. If none is provided, the
     * head commit is used.
     * </p>
     *
     * @return <p>
     *         The fully quaified reference that identifies the commit that
     *         contains the file. For example, you can specify a full commit ID,
     *         a tag, a branch name, or a reference such as refs/heads/master.
     *         If none is provided, the head commit is used.
     *         </p>
     */
    public String getCommitSpecifier() {
        return commitSpecifier;
    }

    /**
     * <p>
     * The fully quaified reference that identifies the commit that contains the
     * file. For example, you can specify a full commit ID, a tag, a branch
     * name, or a reference such as refs/heads/master. If none is provided, the
     * head commit is used.
     * </p>
     *
     * @param commitSpecifier <p>
     *            The fully quaified reference that identifies the commit that
     *            contains the file. For example, you can specify a full commit
     *            ID, a tag, a branch name, or a reference such as
     *            refs/heads/master. If none is provided, the head commit is
     *            used.
     *            </p>
     */
    public void setCommitSpecifier(String commitSpecifier) {
        this.commitSpecifier = commitSpecifier;
    }

    /**
     * <p>
     * The fully quaified reference that identifies the commit that contains the
     * file. For example, you can specify a full commit ID, a tag, a branch
     * name, or a reference such as refs/heads/master. If none is provided, the
     * head commit is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitSpecifier <p>
     *            The fully quaified reference that identifies the commit that
     *            contains the file. For example, you can specify a full commit
     *            ID, a tag, a branch name, or a reference such as
     *            refs/heads/master. If none is provided, the head commit is
     *            used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFileRequest withCommitSpecifier(String commitSpecifier) {
        this.commitSpecifier = commitSpecifier;
        return this;
    }

    /**
     * <p>
     * The fully qualified path to the file, including the full name and
     * extension of the file. For example, /examples/file.md is the fully
     * qualified path to a file named file.md in a folder named examples.
     * </p>
     *
     * @return <p>
     *         The fully qualified path to the file, including the full name and
     *         extension of the file. For example, /examples/file.md is the
     *         fully qualified path to a file named file.md in a folder named
     *         examples.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The fully qualified path to the file, including the full name and
     * extension of the file. For example, /examples/file.md is the fully
     * qualified path to a file named file.md in a folder named examples.
     * </p>
     *
     * @param filePath <p>
     *            The fully qualified path to the file, including the full name
     *            and extension of the file. For example, /examples/file.md is
     *            the fully qualified path to a file named file.md in a folder
     *            named examples.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The fully qualified path to the file, including the full name and
     * extension of the file. For example, /examples/file.md is the fully
     * qualified path to a file named file.md in a folder named examples.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The fully qualified path to the file, including the full name
     *            and extension of the file. For example, /examples/file.md is
     *            the fully qualified path to a file named file.md in a folder
     *            named examples.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFileRequest withFilePath(String filePath) {
        this.filePath = filePath;
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
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath());
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
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFileRequest == false)
            return false;
        GetFileRequest other = (GetFileRequest) obj;

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
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        return true;
    }
}
