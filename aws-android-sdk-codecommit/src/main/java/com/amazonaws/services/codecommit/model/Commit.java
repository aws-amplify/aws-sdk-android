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
 * Returns information about a specific commit.
 * </p>
 */
public class Commit implements Serializable {
    /**
     * <p>
     * The full SHA ID of the specified commit.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     */
    private String treeId;

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID
     * is the full commit ID.
     * </p>
     */
    private java.util.List<String> parents;

    /**
     * <p>
     * The commit message associated with the specified commit.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Information about the author of the specified commit. Information
     * includes the date in timestamp format with GMT offset, the name of the
     * author, and the email address for the author, as configured in Git.
     * </p>
     */
    private UserInfo author;

    /**
     * <p>
     * Information about the person who committed the specified commit, also
     * known as the committer. Information includes the date in timestamp format
     * with GMT offset, the name of the committer, and the email address for the
     * committer, as configured in Git.
     * </p>
     * <p>
     * For more information about the difference between an author and a
     * committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a>
     * in Pro Git by Scott Chacon and Ben Straub.
     * </p>
     */
    private UserInfo committer;

    /**
     * <p>
     * Any other data associated with the specified commit.
     * </p>
     */
    private String additionalData;

    /**
     * <p>
     * The full SHA ID of the specified commit.
     * </p>
     *
     * @return <p>
     *         The full SHA ID of the specified commit.
     *         </p>
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * <p>
     * The full SHA ID of the specified commit.
     * </p>
     *
     * @param commitId <p>
     *            The full SHA ID of the specified commit.
     *            </p>
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The full SHA ID of the specified commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitId <p>
     *            The full SHA ID of the specified commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Commit withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     *
     * @return <p>
     *         Tree information for the specified commit.
     *         </p>
     */
    public String getTreeId() {
        return treeId;
    }

    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     *
     * @param treeId <p>
     *            Tree information for the specified commit.
     *            </p>
     */
    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    /**
     * <p>
     * Tree information for the specified commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param treeId <p>
     *            Tree information for the specified commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Commit withTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID
     * is the full commit ID.
     * </p>
     *
     * @return <p>
     *         A list of parent commits for the specified commit. Each parent
     *         commit ID is the full commit ID.
     *         </p>
     */
    public java.util.List<String> getParents() {
        return parents;
    }

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID
     * is the full commit ID.
     * </p>
     *
     * @param parents <p>
     *            A list of parent commits for the specified commit. Each parent
     *            commit ID is the full commit ID.
     *            </p>
     */
    public void setParents(java.util.Collection<String> parents) {
        if (parents == null) {
            this.parents = null;
            return;
        }

        this.parents = new java.util.ArrayList<String>(parents);
    }

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID
     * is the full commit ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parents <p>
     *            A list of parent commits for the specified commit. Each parent
     *            commit ID is the full commit ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Commit withParents(String... parents) {
        if (getParents() == null) {
            this.parents = new java.util.ArrayList<String>(parents.length);
        }
        for (String value : parents) {
            this.parents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of parent commits for the specified commit. Each parent commit ID
     * is the full commit ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parents <p>
     *            A list of parent commits for the specified commit. Each parent
     *            commit ID is the full commit ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Commit withParents(java.util.Collection<String> parents) {
        setParents(parents);
        return this;
    }

    /**
     * <p>
     * The commit message associated with the specified commit.
     * </p>
     *
     * @return <p>
     *         The commit message associated with the specified commit.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The commit message associated with the specified commit.
     * </p>
     *
     * @param message <p>
     *            The commit message associated with the specified commit.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The commit message associated with the specified commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The commit message associated with the specified commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Commit withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * Information about the author of the specified commit. Information
     * includes the date in timestamp format with GMT offset, the name of the
     * author, and the email address for the author, as configured in Git.
     * </p>
     *
     * @return <p>
     *         Information about the author of the specified commit. Information
     *         includes the date in timestamp format with GMT offset, the name
     *         of the author, and the email address for the author, as
     *         configured in Git.
     *         </p>
     */
    public UserInfo getAuthor() {
        return author;
    }

    /**
     * <p>
     * Information about the author of the specified commit. Information
     * includes the date in timestamp format with GMT offset, the name of the
     * author, and the email address for the author, as configured in Git.
     * </p>
     *
     * @param author <p>
     *            Information about the author of the specified commit.
     *            Information includes the date in timestamp format with GMT
     *            offset, the name of the author, and the email address for the
     *            author, as configured in Git.
     *            </p>
     */
    public void setAuthor(UserInfo author) {
        this.author = author;
    }

    /**
     * <p>
     * Information about the author of the specified commit. Information
     * includes the date in timestamp format with GMT offset, the name of the
     * author, and the email address for the author, as configured in Git.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param author <p>
     *            Information about the author of the specified commit.
     *            Information includes the date in timestamp format with GMT
     *            offset, the name of the author, and the email address for the
     *            author, as configured in Git.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Commit withAuthor(UserInfo author) {
        this.author = author;
        return this;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also
     * known as the committer. Information includes the date in timestamp format
     * with GMT offset, the name of the committer, and the email address for the
     * committer, as configured in Git.
     * </p>
     * <p>
     * For more information about the difference between an author and a
     * committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a>
     * in Pro Git by Scott Chacon and Ben Straub.
     * </p>
     *
     * @return <p>
     *         Information about the person who committed the specified commit,
     *         also known as the committer. Information includes the date in
     *         timestamp format with GMT offset, the name of the committer, and
     *         the email address for the committer, as configured in Git.
     *         </p>
     *         <p>
     *         For more information about the difference between an author and a
     *         committer in Git, see <a
     *         href="http://git-scm.com/book/ch2-3.html">Viewing the Commit
     *         History</a> in Pro Git by Scott Chacon and Ben Straub.
     *         </p>
     */
    public UserInfo getCommitter() {
        return committer;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also
     * known as the committer. Information includes the date in timestamp format
     * with GMT offset, the name of the committer, and the email address for the
     * committer, as configured in Git.
     * </p>
     * <p>
     * For more information about the difference between an author and a
     * committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a>
     * in Pro Git by Scott Chacon and Ben Straub.
     * </p>
     *
     * @param committer <p>
     *            Information about the person who committed the specified
     *            commit, also known as the committer. Information includes the
     *            date in timestamp format with GMT offset, the name of the
     *            committer, and the email address for the committer, as
     *            configured in Git.
     *            </p>
     *            <p>
     *            For more information about the difference between an author
     *            and a committer in Git, see <a
     *            href="http://git-scm.com/book/ch2-3.html">Viewing the Commit
     *            History</a> in Pro Git by Scott Chacon and Ben Straub.
     *            </p>
     */
    public void setCommitter(UserInfo committer) {
        this.committer = committer;
    }

    /**
     * <p>
     * Information about the person who committed the specified commit, also
     * known as the committer. Information includes the date in timestamp format
     * with GMT offset, the name of the committer, and the email address for the
     * committer, as configured in Git.
     * </p>
     * <p>
     * For more information about the difference between an author and a
     * committer in Git, see <a
     * href="http://git-scm.com/book/ch2-3.html">Viewing the Commit History</a>
     * in Pro Git by Scott Chacon and Ben Straub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param committer <p>
     *            Information about the person who committed the specified
     *            commit, also known as the committer. Information includes the
     *            date in timestamp format with GMT offset, the name of the
     *            committer, and the email address for the committer, as
     *            configured in Git.
     *            </p>
     *            <p>
     *            For more information about the difference between an author
     *            and a committer in Git, see <a
     *            href="http://git-scm.com/book/ch2-3.html">Viewing the Commit
     *            History</a> in Pro Git by Scott Chacon and Ben Straub.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Commit withCommitter(UserInfo committer) {
        this.committer = committer;
        return this;
    }

    /**
     * <p>
     * Any other data associated with the specified commit.
     * </p>
     *
     * @return <p>
     *         Any other data associated with the specified commit.
     *         </p>
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * <p>
     * Any other data associated with the specified commit.
     * </p>
     *
     * @param additionalData <p>
     *            Any other data associated with the specified commit.
     *            </p>
     */
    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    /**
     * <p>
     * Any other data associated with the specified commit.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalData <p>
     *            Any other data associated with the specified commit.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Commit withAdditionalData(String additionalData) {
        this.additionalData = additionalData;
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
        if (getTreeId() != null)
            sb.append("treeId: " + getTreeId() + ",");
        if (getParents() != null)
            sb.append("parents: " + getParents() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage() + ",");
        if (getAuthor() != null)
            sb.append("author: " + getAuthor() + ",");
        if (getCommitter() != null)
            sb.append("committer: " + getCommitter() + ",");
        if (getAdditionalData() != null)
            sb.append("additionalData: " + getAdditionalData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getTreeId() == null) ? 0 : getTreeId().hashCode());
        hashCode = prime * hashCode + ((getParents() == null) ? 0 : getParents().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getCommitter() == null) ? 0 : getCommitter().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalData() == null) ? 0 : getAdditionalData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Commit == false)
            return false;
        Commit other = (Commit) obj;

        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getTreeId() == null ^ this.getTreeId() == null)
            return false;
        if (other.getTreeId() != null && other.getTreeId().equals(this.getTreeId()) == false)
            return false;
        if (other.getParents() == null ^ this.getParents() == null)
            return false;
        if (other.getParents() != null && other.getParents().equals(this.getParents()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getAuthor() == null ^ this.getAuthor() == null)
            return false;
        if (other.getAuthor() != null && other.getAuthor().equals(this.getAuthor()) == false)
            return false;
        if (other.getCommitter() == null ^ this.getCommitter() == null)
            return false;
        if (other.getCommitter() != null
                && other.getCommitter().equals(this.getCommitter()) == false)
            return false;
        if (other.getAdditionalData() == null ^ this.getAdditionalData() == null)
            return false;
        if (other.getAdditionalData() != null
                && other.getAdditionalData().equals(this.getAdditionalData()) == false)
            return false;
        return true;
    }
}
