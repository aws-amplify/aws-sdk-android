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
 * Adds or updates a file in a branch in an AWS CodeCommit repository, and
 * generates a commit for the addition in the specified branch.
 * </p>
 */
public class PutFileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository where you want to add or update the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The name of the branch where you want to add or update the file. If this
     * is an empty repository, this branch is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String branchName;

    /**
     * <p>
     * The content of the file, in binary object format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     */
    private java.nio.ByteBuffer fileContent;

    /**
     * <p>
     * The name of the file you want to add or update, including the relative
     * path to the file in the repository.
     * </p>
     * <note>
     * <p>
     * If the path does not currently exist in the repository, the path is
     * created as part of adding the file.
     * </p>
     * </note>
     */
    private String filePath;

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are
     * listed here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String fileMode;

    /**
     * <p>
     * The full commit ID of the head commit in the branch where you want to add
     * or update the file. If this is an empty repository, no commit ID is
     * required. If this is not an empty repository, a commit ID is required.
     * </p>
     * <p>
     * The commit ID must match the ID of the head commit at the time of the
     * operation. Otherwise, an error occurs, and the file is not added or
     * updated.
     * </p>
     */
    private String parentCommitId;

    /**
     * <p>
     * A message about why this file was added or updated. Although it is
     * optional, a message makes the commit history for your repository more
     * useful.
     * </p>
     */
    private String commitMessage;

    /**
     * <p>
     * The name of the person adding or updating the file. Although it is
     * optional, a name makes the commit history for your repository more
     * useful.
     * </p>
     */
    private String name;

    /**
     * <p>
     * An email address for the person adding or updating the file.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The name of the repository where you want to add or update the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you want to add or update the
     *         file.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to add or update the file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you want to add or update the
     *            file.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you want to add or update the file.
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
     *            The name of the repository where you want to add or update the
     *            file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The name of the branch where you want to add or update the file. If this
     * is an empty repository, this branch is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the branch where you want to add or update the file.
     *         If this is an empty repository, this branch is created.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The name of the branch where you want to add or update the file. If this
     * is an empty repository, this branch is created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param branchName <p>
     *            The name of the branch where you want to add or update the
     *            file. If this is an empty repository, this branch is created.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch where you want to add or update the file. If this
     * is an empty repository, this branch is created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param branchName <p>
     *            The name of the branch where you want to add or update the
     *            file. If this is an empty repository, this branch is created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * The content of the file, in binary object format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @return <p>
     *         The content of the file, in binary object format.
     *         </p>
     */
    public java.nio.ByteBuffer getFileContent() {
        return fileContent;
    }

    /**
     * <p>
     * The content of the file, in binary object format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param fileContent <p>
     *            The content of the file, in binary object format.
     *            </p>
     */
    public void setFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * <p>
     * The content of the file, in binary object format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 6291456<br/>
     *
     * @param fileContent <p>
     *            The content of the file, in binary object format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileRequest withFileContent(java.nio.ByteBuffer fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    /**
     * <p>
     * The name of the file you want to add or update, including the relative
     * path to the file in the repository.
     * </p>
     * <note>
     * <p>
     * If the path does not currently exist in the repository, the path is
     * created as part of adding the file.
     * </p>
     * </note>
     *
     * @return <p>
     *         The name of the file you want to add or update, including the
     *         relative path to the file in the repository.
     *         </p>
     *         <note>
     *         <p>
     *         If the path does not currently exist in the repository, the path
     *         is created as part of adding the file.
     *         </p>
     *         </note>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The name of the file you want to add or update, including the relative
     * path to the file in the repository.
     * </p>
     * <note>
     * <p>
     * If the path does not currently exist in the repository, the path is
     * created as part of adding the file.
     * </p>
     * </note>
     *
     * @param filePath <p>
     *            The name of the file you want to add or update, including the
     *            relative path to the file in the repository.
     *            </p>
     *            <note>
     *            <p>
     *            If the path does not currently exist in the repository, the
     *            path is created as part of adding the file.
     *            </p>
     *            </note>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The name of the file you want to add or update, including the relative
     * path to the file in the repository.
     * </p>
     * <note>
     * <p>
     * If the path does not currently exist in the repository, the path is
     * created as part of adding the file.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The name of the file you want to add or update, including the
     *            relative path to the file in the repository.
     *            </p>
     *            <note>
     *            <p>
     *            If the path does not currently exist in the repository, the
     *            path is created as part of adding the file.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are
     * listed here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The file mode permissions of the blob. Valid file mode
     *         permissions are listed here.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getFileMode() {
        return fileMode;
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are
     * listed here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode permissions of the blob. Valid file mode
     *            permissions are listed here.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(String fileMode) {
        this.fileMode = fileMode;
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are
     * listed here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode permissions of the blob. Valid file mode
     *            permissions are listed here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public PutFileRequest withFileMode(String fileMode) {
        this.fileMode = fileMode;
        return this;
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are
     * listed here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode permissions of the blob. Valid file mode
     *            permissions are listed here.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
    }

    /**
     * <p>
     * The file mode permissions of the blob. Valid file mode permissions are
     * listed here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param fileMode <p>
     *            The file mode permissions of the blob. Valid file mode
     *            permissions are listed here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public PutFileRequest withFileMode(FileModeTypeEnum fileMode) {
        this.fileMode = fileMode.toString();
        return this;
    }

    /**
     * <p>
     * The full commit ID of the head commit in the branch where you want to add
     * or update the file. If this is an empty repository, no commit ID is
     * required. If this is not an empty repository, a commit ID is required.
     * </p>
     * <p>
     * The commit ID must match the ID of the head commit at the time of the
     * operation. Otherwise, an error occurs, and the file is not added or
     * updated.
     * </p>
     *
     * @return <p>
     *         The full commit ID of the head commit in the branch where you
     *         want to add or update the file. If this is an empty repository,
     *         no commit ID is required. If this is not an empty repository, a
     *         commit ID is required.
     *         </p>
     *         <p>
     *         The commit ID must match the ID of the head commit at the time of
     *         the operation. Otherwise, an error occurs, and the file is not
     *         added or updated.
     *         </p>
     */
    public String getParentCommitId() {
        return parentCommitId;
    }

    /**
     * <p>
     * The full commit ID of the head commit in the branch where you want to add
     * or update the file. If this is an empty repository, no commit ID is
     * required. If this is not an empty repository, a commit ID is required.
     * </p>
     * <p>
     * The commit ID must match the ID of the head commit at the time of the
     * operation. Otherwise, an error occurs, and the file is not added or
     * updated.
     * </p>
     *
     * @param parentCommitId <p>
     *            The full commit ID of the head commit in the branch where you
     *            want to add or update the file. If this is an empty
     *            repository, no commit ID is required. If this is not an empty
     *            repository, a commit ID is required.
     *            </p>
     *            <p>
     *            The commit ID must match the ID of the head commit at the time
     *            of the operation. Otherwise, an error occurs, and the file is
     *            not added or updated.
     *            </p>
     */
    public void setParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
    }

    /**
     * <p>
     * The full commit ID of the head commit in the branch where you want to add
     * or update the file. If this is an empty repository, no commit ID is
     * required. If this is not an empty repository, a commit ID is required.
     * </p>
     * <p>
     * The commit ID must match the ID of the head commit at the time of the
     * operation. Otherwise, an error occurs, and the file is not added or
     * updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentCommitId <p>
     *            The full commit ID of the head commit in the branch where you
     *            want to add or update the file. If this is an empty
     *            repository, no commit ID is required. If this is not an empty
     *            repository, a commit ID is required.
     *            </p>
     *            <p>
     *            The commit ID must match the ID of the head commit at the time
     *            of the operation. Otherwise, an error occurs, and the file is
     *            not added or updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileRequest withParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
        return this;
    }

    /**
     * <p>
     * A message about why this file was added or updated. Although it is
     * optional, a message makes the commit history for your repository more
     * useful.
     * </p>
     *
     * @return <p>
     *         A message about why this file was added or updated. Although it
     *         is optional, a message makes the commit history for your
     *         repository more useful.
     *         </p>
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     * <p>
     * A message about why this file was added or updated. Although it is
     * optional, a message makes the commit history for your repository more
     * useful.
     * </p>
     *
     * @param commitMessage <p>
     *            A message about why this file was added or updated. Although
     *            it is optional, a message makes the commit history for your
     *            repository more useful.
     *            </p>
     */
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * A message about why this file was added or updated. Although it is
     * optional, a message makes the commit history for your repository more
     * useful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitMessage <p>
     *            A message about why this file was added or updated. Although
     *            it is optional, a message makes the commit history for your
     *            repository more useful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileRequest withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * <p>
     * The name of the person adding or updating the file. Although it is
     * optional, a name makes the commit history for your repository more
     * useful.
     * </p>
     *
     * @return <p>
     *         The name of the person adding or updating the file. Although it
     *         is optional, a name makes the commit history for your repository
     *         more useful.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the person adding or updating the file. Although it is
     * optional, a name makes the commit history for your repository more
     * useful.
     * </p>
     *
     * @param name <p>
     *            The name of the person adding or updating the file. Although
     *            it is optional, a name makes the commit history for your
     *            repository more useful.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the person adding or updating the file. Although it is
     * optional, a name makes the commit history for your repository more
     * useful.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the person adding or updating the file. Although
     *            it is optional, a name makes the commit history for your
     *            repository more useful.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An email address for the person adding or updating the file.
     * </p>
     *
     * @return <p>
     *         An email address for the person adding or updating the file.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * An email address for the person adding or updating the file.
     * </p>
     *
     * @param email <p>
     *            An email address for the person adding or updating the file.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * An email address for the person adding or updating the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            An email address for the person adding or updating the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutFileRequest withEmail(String email) {
        this.email = email;
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
        if (getBranchName() != null)
            sb.append("branchName: " + getBranchName() + ",");
        if (getFileContent() != null)
            sb.append("fileContent: " + getFileContent() + ",");
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath() + ",");
        if (getFileMode() != null)
            sb.append("fileMode: " + getFileMode() + ",");
        if (getParentCommitId() != null)
            sb.append("parentCommitId: " + getParentCommitId() + ",");
        if (getCommitMessage() != null)
            sb.append("commitMessage: " + getCommitMessage() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getEmail() != null)
            sb.append("email: " + getEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode
                + ((getFileContent() == null) ? 0 : getFileContent().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getFileMode() == null) ? 0 : getFileMode().hashCode());
        hashCode = prime * hashCode
                + ((getParentCommitId() == null) ? 0 : getParentCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFileRequest == false)
            return false;
        PutFileRequest other = (PutFileRequest) obj;

        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null
                && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getFileContent() == null ^ this.getFileContent() == null)
            return false;
        if (other.getFileContent() != null
                && other.getFileContent().equals(this.getFileContent()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getFileMode() == null ^ this.getFileMode() == null)
            return false;
        if (other.getFileMode() != null && other.getFileMode().equals(this.getFileMode()) == false)
            return false;
        if (other.getParentCommitId() == null ^ this.getParentCommitId() == null)
            return false;
        if (other.getParentCommitId() != null
                && other.getParentCommitId().equals(this.getParentCommitId()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null
                && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        return true;
    }
}
