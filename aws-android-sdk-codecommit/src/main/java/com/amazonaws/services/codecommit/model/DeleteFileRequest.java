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
 * Deletes a specified file from a specified branch. A commit is created on the
 * branch that contains the revision. The file still exists in the commits
 * earlier to the commit that contains the deletion.
 * </p>
 */
public class DeleteFileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the repository that contains the file to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * The name of the branch where the commit that deletes the file is made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String branchName;

    /**
     * <p>
     * The fully qualified path to the file that to be deleted, including the
     * full name and extension of that file. For example, /examples/file.md is a
     * fully qualified path to a file named file.md in a folder named examples.
     * </p>
     */
    private String filePath;

    /**
     * <p>
     * The ID of the commit that is the tip of the branch where you want to
     * create the commit that deletes the file. This must be the HEAD commit for
     * the branch. The commit that deletes the file is created from this commit
     * ID.
     * </p>
     */
    private String parentCommitId;

    /**
     * <p>
     * If a file is the only object in the folder or directory, specifies
     * whether to delete the folder or directory that contains the file. By
     * default, empty folders are deleted. This includes empty folders that are
     * part of the directory structure. For example, if the path to a file is
     * dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file
     * in dir4 also deletes the empty folders dir4, dir3, and dir2.
     * </p>
     */
    private Boolean keepEmptyFolders;

    /**
     * <p>
     * The commit message you want to include as part of deleting the file.
     * Commit messages are limited to 256 KB. If no message is specified, a
     * default message is used.
     * </p>
     */
    private String commitMessage;

    /**
     * <p>
     * The name of the author of the commit that deletes the file. If no name is
     * specified, the user's ARN is used as the author name and committer name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The email address for the commit that deletes the file. If no email
     * address is specified, the email address is left blank.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The name of the repository that contains the file to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The name of the repository that contains the file to delete.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The name of the repository that contains the file to delete.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the file to delete.
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
     *            The name of the repository that contains the file to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileRequest withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * The name of the branch where the commit that deletes the file is made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The name of the branch where the commit that deletes the file is
     *         made.
     *         </p>
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * <p>
     * The name of the branch where the commit that deletes the file is made.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param branchName <p>
     *            The name of the branch where the commit that deletes the file
     *            is made.
     *            </p>
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch where the commit that deletes the file is made.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param branchName <p>
     *            The name of the branch where the commit that deletes the file
     *            is made.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileRequest withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * <p>
     * The fully qualified path to the file that to be deleted, including the
     * full name and extension of that file. For example, /examples/file.md is a
     * fully qualified path to a file named file.md in a folder named examples.
     * </p>
     *
     * @return <p>
     *         The fully qualified path to the file that to be deleted,
     *         including the full name and extension of that file. For example,
     *         /examples/file.md is a fully qualified path to a file named
     *         file.md in a folder named examples.
     *         </p>
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * <p>
     * The fully qualified path to the file that to be deleted, including the
     * full name and extension of that file. For example, /examples/file.md is a
     * fully qualified path to a file named file.md in a folder named examples.
     * </p>
     *
     * @param filePath <p>
     *            The fully qualified path to the file that to be deleted,
     *            including the full name and extension of that file. For
     *            example, /examples/file.md is a fully qualified path to a file
     *            named file.md in a folder named examples.
     *            </p>
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The fully qualified path to the file that to be deleted, including the
     * full name and extension of that file. For example, /examples/file.md is a
     * fully qualified path to a file named file.md in a folder named examples.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filePath <p>
     *            The fully qualified path to the file that to be deleted,
     *            including the full name and extension of that file. For
     *            example, /examples/file.md is a fully qualified path to a file
     *            named file.md in a folder named examples.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileRequest withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * <p>
     * The ID of the commit that is the tip of the branch where you want to
     * create the commit that deletes the file. This must be the HEAD commit for
     * the branch. The commit that deletes the file is created from this commit
     * ID.
     * </p>
     *
     * @return <p>
     *         The ID of the commit that is the tip of the branch where you want
     *         to create the commit that deletes the file. This must be the HEAD
     *         commit for the branch. The commit that deletes the file is
     *         created from this commit ID.
     *         </p>
     */
    public String getParentCommitId() {
        return parentCommitId;
    }

    /**
     * <p>
     * The ID of the commit that is the tip of the branch where you want to
     * create the commit that deletes the file. This must be the HEAD commit for
     * the branch. The commit that deletes the file is created from this commit
     * ID.
     * </p>
     *
     * @param parentCommitId <p>
     *            The ID of the commit that is the tip of the branch where you
     *            want to create the commit that deletes the file. This must be
     *            the HEAD commit for the branch. The commit that deletes the
     *            file is created from this commit ID.
     *            </p>
     */
    public void setParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
    }

    /**
     * <p>
     * The ID of the commit that is the tip of the branch where you want to
     * create the commit that deletes the file. This must be the HEAD commit for
     * the branch. The commit that deletes the file is created from this commit
     * ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parentCommitId <p>
     *            The ID of the commit that is the tip of the branch where you
     *            want to create the commit that deletes the file. This must be
     *            the HEAD commit for the branch. The commit that deletes the
     *            file is created from this commit ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileRequest withParentCommitId(String parentCommitId) {
        this.parentCommitId = parentCommitId;
        return this;
    }

    /**
     * <p>
     * If a file is the only object in the folder or directory, specifies
     * whether to delete the folder or directory that contains the file. By
     * default, empty folders are deleted. This includes empty folders that are
     * part of the directory structure. For example, if the path to a file is
     * dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file
     * in dir4 also deletes the empty folders dir4, dir3, and dir2.
     * </p>
     *
     * @return <p>
     *         If a file is the only object in the folder or directory,
     *         specifies whether to delete the folder or directory that contains
     *         the file. By default, empty folders are deleted. This includes
     *         empty folders that are part of the directory structure. For
     *         example, if the path to a file is dir1/dir2/dir3/dir4, and dir2
     *         and dir3 are empty, deleting the last file in dir4 also deletes
     *         the empty folders dir4, dir3, and dir2.
     *         </p>
     */
    public Boolean isKeepEmptyFolders() {
        return keepEmptyFolders;
    }

    /**
     * <p>
     * If a file is the only object in the folder or directory, specifies
     * whether to delete the folder or directory that contains the file. By
     * default, empty folders are deleted. This includes empty folders that are
     * part of the directory structure. For example, if the path to a file is
     * dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file
     * in dir4 also deletes the empty folders dir4, dir3, and dir2.
     * </p>
     *
     * @return <p>
     *         If a file is the only object in the folder or directory,
     *         specifies whether to delete the folder or directory that contains
     *         the file. By default, empty folders are deleted. This includes
     *         empty folders that are part of the directory structure. For
     *         example, if the path to a file is dir1/dir2/dir3/dir4, and dir2
     *         and dir3 are empty, deleting the last file in dir4 also deletes
     *         the empty folders dir4, dir3, and dir2.
     *         </p>
     */
    public Boolean getKeepEmptyFolders() {
        return keepEmptyFolders;
    }

    /**
     * <p>
     * If a file is the only object in the folder or directory, specifies
     * whether to delete the folder or directory that contains the file. By
     * default, empty folders are deleted. This includes empty folders that are
     * part of the directory structure. For example, if the path to a file is
     * dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file
     * in dir4 also deletes the empty folders dir4, dir3, and dir2.
     * </p>
     *
     * @param keepEmptyFolders <p>
     *            If a file is the only object in the folder or directory,
     *            specifies whether to delete the folder or directory that
     *            contains the file. By default, empty folders are deleted. This
     *            includes empty folders that are part of the directory
     *            structure. For example, if the path to a file is
     *            dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the
     *            last file in dir4 also deletes the empty folders dir4, dir3,
     *            and dir2.
     *            </p>
     */
    public void setKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
    }

    /**
     * <p>
     * If a file is the only object in the folder or directory, specifies
     * whether to delete the folder or directory that contains the file. By
     * default, empty folders are deleted. This includes empty folders that are
     * part of the directory structure. For example, if the path to a file is
     * dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file
     * in dir4 also deletes the empty folders dir4, dir3, and dir2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param keepEmptyFolders <p>
     *            If a file is the only object in the folder or directory,
     *            specifies whether to delete the folder or directory that
     *            contains the file. By default, empty folders are deleted. This
     *            includes empty folders that are part of the directory
     *            structure. For example, if the path to a file is
     *            dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the
     *            last file in dir4 also deletes the empty folders dir4, dir3,
     *            and dir2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileRequest withKeepEmptyFolders(Boolean keepEmptyFolders) {
        this.keepEmptyFolders = keepEmptyFolders;
        return this;
    }

    /**
     * <p>
     * The commit message you want to include as part of deleting the file.
     * Commit messages are limited to 256 KB. If no message is specified, a
     * default message is used.
     * </p>
     *
     * @return <p>
     *         The commit message you want to include as part of deleting the
     *         file. Commit messages are limited to 256 KB. If no message is
     *         specified, a default message is used.
     *         </p>
     */
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     * <p>
     * The commit message you want to include as part of deleting the file.
     * Commit messages are limited to 256 KB. If no message is specified, a
     * default message is used.
     * </p>
     *
     * @param commitMessage <p>
     *            The commit message you want to include as part of deleting the
     *            file. Commit messages are limited to 256 KB. If no message is
     *            specified, a default message is used.
     *            </p>
     */
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * The commit message you want to include as part of deleting the file.
     * Commit messages are limited to 256 KB. If no message is specified, a
     * default message is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitMessage <p>
     *            The commit message you want to include as part of deleting the
     *            file. Commit messages are limited to 256 KB. If no message is
     *            specified, a default message is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileRequest withCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * <p>
     * The name of the author of the commit that deletes the file. If no name is
     * specified, the user's ARN is used as the author name and committer name.
     * </p>
     *
     * @return <p>
     *         The name of the author of the commit that deletes the file. If no
     *         name is specified, the user's ARN is used as the author name and
     *         committer name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the author of the commit that deletes the file. If no name is
     * specified, the user's ARN is used as the author name and committer name.
     * </p>
     *
     * @param name <p>
     *            The name of the author of the commit that deletes the file. If
     *            no name is specified, the user's ARN is used as the author
     *            name and committer name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the author of the commit that deletes the file. If no name is
     * specified, the user's ARN is used as the author name and committer name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the author of the commit that deletes the file. If
     *            no name is specified, the user's ARN is used as the author
     *            name and committer name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The email address for the commit that deletes the file. If no email
     * address is specified, the email address is left blank.
     * </p>
     *
     * @return <p>
     *         The email address for the commit that deletes the file. If no
     *         email address is specified, the email address is left blank.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address for the commit that deletes the file. If no email
     * address is specified, the email address is left blank.
     * </p>
     *
     * @param email <p>
     *            The email address for the commit that deletes the file. If no
     *            email address is specified, the email address is left blank.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address for the commit that deletes the file. If no email
     * address is specified, the email address is left blank.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The email address for the commit that deletes the file. If no
     *            email address is specified, the email address is left blank.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteFileRequest withEmail(String email) {
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
        if (getFilePath() != null)
            sb.append("filePath: " + getFilePath() + ",");
        if (getParentCommitId() != null)
            sb.append("parentCommitId: " + getParentCommitId() + ",");
        if (getKeepEmptyFolders() != null)
            sb.append("keepEmptyFolders: " + getKeepEmptyFolders() + ",");
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
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode
                + ((getParentCommitId() == null) ? 0 : getParentCommitId().hashCode());
        hashCode = prime * hashCode
                + ((getKeepEmptyFolders() == null) ? 0 : getKeepEmptyFolders().hashCode());
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

        if (obj instanceof DeleteFileRequest == false)
            return false;
        DeleteFileRequest other = (DeleteFileRequest) obj;

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
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getParentCommitId() == null ^ this.getParentCommitId() == null)
            return false;
        if (other.getParentCommitId() != null
                && other.getParentCommitId().equals(this.getParentCommitId()) == false)
            return false;
        if (other.getKeepEmptyFolders() == null ^ this.getKeepEmptyFolders() == null)
            return false;
        if (other.getKeepEmptyFolders() != null
                && other.getKeepEmptyFolders().equals(this.getKeepEmptyFolders()) == false)
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
