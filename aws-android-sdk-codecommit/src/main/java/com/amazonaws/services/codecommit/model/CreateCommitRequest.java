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
 * Creates a commit for a repository on the tip of a specified branch.
 * </p>
 */
public class CreateCommitRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository where you create the commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The name of the branch where you create the commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String branchName;

    /**
     * <p>
     * The ID of the commit that is the parent of the commit you create. Not
     * required if this is an empty repository.
     * </p>
     */
    private String parentCommitId;

    /**
     * <p>
     * The name of the author who created the commit. This information is used
     * as both the author and committer for the commit.
     * </p>
     */
    private String authorName;

    /**
     * <p>
     * The email address of the person who created the commit.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The commit message you want to include in the commit. Commit messages are
     * limited to 256 KB. If no message is specified, a default message is used.
     * </p>
     */
    private String commitMessage;

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If true, a ..gitkeep
     * file is created for empty folders. The default is false.
     * </p>
     */
    private Boolean keepEmptyFolders;

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     */
    private java.util.List<PutFileEntry> putFiles;

    /**
     * <p>
     * The files to delete in this commit. These files still exist in earlier
     * commits.
     * </p>
     */
    private java.util.List<DeleteFileEntry> deleteFiles;

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     */
    private java.util.List<SetFileModeEntry> setFileModes;

    /**
     * <p>
     * The name of the repository where you create the commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository where you create the commit.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you create the commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository where you create the commit.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where you create the commit.
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
     *            The name of the repository where you create the commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The name of the branch where you create the commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the branch where you create the commit.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The name of the branch where you create the commit.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param branchName <p>
     *            The name of the branch where you create the commit.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch where you create the commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param branchName <p>
     *            The name of the branch where you create the commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * The ID of the commit that is the parent of the commit you create. Not
     * required if this is an empty repository.
     * </p>
     *
     * @return <p>
     *         The ID of the commit that is the parent of the commit you create.
     *         Not required if this is an empty repository.
     *         </p>
     */
    public String getParentCommitId() {
        return parentCommitId;
    }

    /**
     * <p>
     * The ID of the commit that is the parent of the commit you create. Not
     * required if this is an empty repository.
     * </p>
     *
     * @param parentCommitId <p>
     *            The ID of the commit that is the parent of the commit you
     *            create. Not required if this is an empty repository.
     *            </p>
     */
    public void setParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
    }

    /**
     * <p>
     * The ID of the commit that is the parent of the commit you create. Not
     * required if this is an empty repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentCommitId <p>
     *            The ID of the commit that is the parent of the commit you
     *            create. Not required if this is an empty repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
        return this;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used
     * as both the author and committer for the commit.
     * </p>
     *
     * @return <p>
     *         The name of the author who created the commit. This information
     *         is used as both the author and committer for the commit.
     *         </p>
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used
     * as both the author and committer for the commit.
     * </p>
     *
     * @param authorName <p>
     *            The name of the author who created the commit. This
     *            information is used as both the author and committer for the
     *            commit.
     *            </p>
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * <p>
     * The name of the author who created the commit. This information is used
     * as both the author and committer for the commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorName <p>
     *            The name of the author who created the commit. This
     *            information is used as both the author and committer for the
     *            commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * <p>
     * The email address of the person who created the commit.
     * </p>
     *
     * @return <p>
     *         The email address of the person who created the commit.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address of the person who created the commit.
     * </p>
     *
     * @param email <p>
     *            The email address of the person who created the commit.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the person who created the commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The email address of the person who created the commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The commit message you want to include in the commit. Commit messages are
     * limited to 256 KB. If no message is specified, a default message is used.
     * </p>
     *
     * @return <p>
     *         The commit message you want to include in the commit. Commit
     *         messages are limited to 256 KB. If no message is specified, a
     *         default message is used.
     *         </p>
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     * <p>
     * The commit message you want to include in the commit. Commit messages are
     * limited to 256 KB. If no message is specified, a default message is used.
     * </p>
     *
     * @param commitMessage <p>
     *            The commit message you want to include in the commit. Commit
     *            messages are limited to 256 KB. If no message is specified, a
     *            default message is used.
     *            </p>
     */
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message you want to include in the commit. Commit messages are
     * limited to 256 KB. If no message is specified, a default message is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitMessage <p>
     *            The commit message you want to include in the commit. Commit
     *            messages are limited to 256 KB. If no message is specified, a
     *            default message is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If true, a ..gitkeep
     * file is created for empty folders. The default is false.
     * </p>
     *
     * @return <p>
     *         If the commit contains deletions, whether to keep a folder or
     *         folder structure if the changes leave the folders empty. If true,
     *         a ..gitkeep file is created for empty folders. The default is
     *         false.
     *         </p>
     */
    public Boolean isKeepEmptyFolders() {
        return keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If true, a ..gitkeep
     * file is created for empty folders. The default is false.
     * </p>
     *
     * @return <p>
     *         If the commit contains deletions, whether to keep a folder or
     *         folder structure if the changes leave the folders empty. If true,
     *         a ..gitkeep file is created for empty folders. The default is
     *         false.
     *         </p>
     */
    public Boolean getKeepEmptyFolders() {
        return keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If true, a ..gitkeep
     * file is created for empty folders. The default is false.
     * </p>
     *
     * @param keepEmptyFolders <p>
     *            If the commit contains deletions, whether to keep a folder or
     *            folder structure if the changes leave the folders empty. If
     *            true, a ..gitkeep file is created for empty folders. The
     *            default is false.
     *            </p>
     */
    public void setKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
    }

    /**
     * <p>
     * If the commit contains deletions, whether to keep a folder or folder
     * structure if the changes leave the folders empty. If true, a ..gitkeep
     * file is created for empty folders. The default is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keepEmptyFolders <p>
     *            If the commit contains deletions, whether to keep a folder or
     *            folder structure if the changes leave the folders empty. If
     *            true, a ..gitkeep file is created for empty folders. The
     *            default is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
        return this;
    }

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     *
     * @return <p>
     *         The files to add or update in this commit.
     *         </p>
     */
    public java.util.List<PutFileEntry> getPutFiles() {
        return putFiles;
    }

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     *
     * @param putFiles <p>
     *            The files to add or update in this commit.
     *            </p>
     */
    public void setPutFiles(java.util.Collection<PutFileEntry> putFiles) {
        if (putFiles == null) {
            this.putFiles = null;
            return;
        }

        this.putFiles = new java.util.ArrayList<PutFileEntry>(putFiles);
    }

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param putFiles <p>
     *            The files to add or update in this commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withPutFiles(PutFileEntry... putFiles) {
        if (getPutFiles() == null) {
            this.putFiles = new java.util.ArrayList<PutFileEntry>(putFiles.length);
        }
        for (PutFileEntry value : putFiles) {
            this.putFiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The files to add or update in this commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param putFiles <p>
     *            The files to add or update in this commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withPutFiles(java.util.Collection<PutFileEntry> putFiles) {
        setPutFiles(putFiles);
        return this;
    }

    /**
     * <p>
     * The files to delete in this commit. These files still exist in earlier
     * commits.
     * </p>
     *
     * @return <p>
     *         The files to delete in this commit. These files still exist in
     *         earlier commits.
     *         </p>
     */
    public java.util.List<DeleteFileEntry> getDeleteFiles() {
        return deleteFiles;
    }

    /**
     * <p>
     * The files to delete in this commit. These files still exist in earlier
     * commits.
     * </p>
     *
     * @param deleteFiles <p>
     *            The files to delete in this commit. These files still exist in
     *            earlier commits.
     *            </p>
     */
    public void setDeleteFiles(java.util.Collection<DeleteFileEntry> deleteFiles) {
        if (deleteFiles == null) {
            this.deleteFiles = null;
            return;
        }

        this.deleteFiles = new java.util.ArrayList<DeleteFileEntry>(deleteFiles);
    }

    /**
     * <p>
     * The files to delete in this commit. These files still exist in earlier
     * commits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteFiles <p>
     *            The files to delete in this commit. These files still exist in
     *            earlier commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withDeleteFiles(DeleteFileEntry... deleteFiles) {
        if (getDeleteFiles() == null) {
            this.deleteFiles = new java.util.ArrayList<DeleteFileEntry>(deleteFiles.length);
        }
        for (DeleteFileEntry value : deleteFiles) {
            this.deleteFiles.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The files to delete in this commit. These files still exist in earlier
     * commits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteFiles <p>
     *            The files to delete in this commit. These files still exist in
     *            earlier commits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withDeleteFiles(java.util.Collection<DeleteFileEntry> deleteFiles) {
        setDeleteFiles(deleteFiles);
        return this;
    }

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     *
     * @return <p>
     *         The file modes to update for files in this commit.
     *         </p>
     */
    public java.util.List<SetFileModeEntry> getSetFileModes() {
        return setFileModes;
    }

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     *
     * @param setFileModes <p>
     *            The file modes to update for files in this commit.
     *            </p>
     */
    public void setSetFileModes(java.util.Collection<SetFileModeEntry> setFileModes) {
        if (setFileModes == null) {
            this.setFileModes = null;
            return;
        }

        this.setFileModes = new java.util.ArrayList<SetFileModeEntry>(setFileModes);
    }

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setFileModes <p>
     *            The file modes to update for files in this commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withSetFileModes(SetFileModeEntry... setFileModes) {
        if (getSetFileModes() == null) {
            this.setFileModes = new java.util.ArrayList<SetFileModeEntry>(setFileModes.length);
        }
        for (SetFileModeEntry value : setFileModes) {
            this.setFileModes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The file modes to update for files in this commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setFileModes <p>
     *            The file modes to update for files in this commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCommitRequest withSetFileModes(java.util.Collection<SetFileModeEntry> setFileModes) {
        setSetFileModes(setFileModes);
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
        if (getParentCommitId() != null)
            sb.append("parentCommitId: " + getParentCommitId() + ",");
        if (getAuthorName() != null)
            sb.append("authorName: " + getAuthorName() + ",");
        if (getEmail() != null)
            sb.append("email: " + getEmail() + ",");
        if (getCommitMessage() != null)
            sb.append("commitMessage: " + getCommitMessage() + ",");
        if (getKeepEmptyFolders() != null)
            sb.append("keepEmptyFolders: " + getKeepEmptyFolders() + ",");
        if (getPutFiles() != null)
            sb.append("putFiles: " + getPutFiles() + ",");
        if (getDeleteFiles() != null)
            sb.append("deleteFiles: " + getDeleteFiles() + ",");
        if (getSetFileModes() != null)
            sb.append("setFileModes: " + getSetFileModes());
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
                + ((getParentCommitId() == null) ? 0 : getParentCommitId().hashCode());
        hashCode = prime * hashCode + ((getAuthorName() == null) ? 0 : getAuthorName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode
                + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode
                + ((getKeepEmptyFolders() == null) ? 0 : getKeepEmptyFolders().hashCode());
        hashCode = prime * hashCode + ((getPutFiles() == null) ? 0 : getPutFiles().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteFiles() == null) ? 0 : getDeleteFiles().hashCode());
        hashCode = prime * hashCode
                + ((getSetFileModes() == null) ? 0 : getSetFileModes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCommitRequest == false)
            return false;
        CreateCommitRequest other = (CreateCommitRequest) obj;

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
        if (other.getParentCommitId() == null ^ this.getParentCommitId() == null)
            return false;
        if (other.getParentCommitId() != null
                && other.getParentCommitId().equals(this.getParentCommitId()) == false)
            return false;
        if (other.getAuthorName() == null ^ this.getAuthorName() == null)
            return false;
        if (other.getAuthorName() != null
                && other.getAuthorName().equals(this.getAuthorName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null
                && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getKeepEmptyFolders() == null ^ this.getKeepEmptyFolders() == null)
            return false;
        if (other.getKeepEmptyFolders() != null
                && other.getKeepEmptyFolders().equals(this.getKeepEmptyFolders()) == false)
            return false;
        if (other.getPutFiles() == null ^ this.getPutFiles() == null)
            return false;
        if (other.getPutFiles() != null && other.getPutFiles().equals(this.getPutFiles()) == false)
            return false;
        if (other.getDeleteFiles() == null ^ this.getDeleteFiles() == null)
            return false;
        if (other.getDeleteFiles() != null
                && other.getDeleteFiles().equals(this.getDeleteFiles()) == false)
            return false;
        if (other.getSetFileModes() == null ^ this.getSetFileModes() == null)
            return false;
        if (other.getSetFileModes() != null
                && other.getSetFileModes().equals(this.getSetFileModes()) == false)
            return false;
        return true;
    }
}
