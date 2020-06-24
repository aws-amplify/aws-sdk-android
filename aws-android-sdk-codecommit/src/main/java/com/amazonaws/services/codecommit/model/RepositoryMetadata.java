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
 * Information about a repository.
 * </p>
 */
public class RepositoryMetadata implements Serializable {
    /**
     * <p>
     * The ID of the AWS account associated with the repository.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The ID of the repository.
     * </p>
     */
    private String repositoryId;

    /**
     * <p>
     * The repository's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     */
    private String repositoryName;

    /**
     * <p>
     * A comment or description about the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String repositoryDescription;

    /**
     * <p>
     * The repository's default branch name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String defaultBranch;

    /**
     * <p>
     * The date and time the repository was last modified, in timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The date and time the repository was created, in timestamp format.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The URL to use for cloning the repository over HTTPS.
     * </p>
     */
    private String cloneUrlHttp;

    /**
     * <p>
     * The URL to use for cloning the repository over SSH.
     * </p>
     */
    private String cloneUrlSsh;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the AWS account associated with the repository.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account associated with the repository.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The ID of the AWS account associated with the repository.
     * </p>
     *
     * @param accountId <p>
     *            The ID of the AWS account associated with the repository.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the AWS account associated with the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The ID of the AWS account associated with the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The ID of the repository.
     * </p>
     *
     * @return <p>
     *         The ID of the repository.
     *         </p>
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * <p>
     * The ID of the repository.
     * </p>
     *
     * @param repositoryId <p>
     *            The ID of the repository.
     *            </p>
     */
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param repositoryId <p>
     *            The ID of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * <p>
     * The repository's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @return <p>
     *         The repository's name.
     *         </p>
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * <p>
     * The repository's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>[\w\.-]+<br/>
     *
     * @param repositoryName <p>
     *            The repository's name.
     *            </p>
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository's name.
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
     *            The repository's name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * <p>
     * A comment or description about the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         A comment or description about the repository.
     *         </p>
     */
    public String getRepositoryDescription() {
        return repositoryDescription;
    }

    /**
     * <p>
     * A comment or description about the repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param repositoryDescription <p>
     *            A comment or description about the repository.
     *            </p>
     */
    public void setRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    /**
     * <p>
     * A comment or description about the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param repositoryDescription <p>
     *            A comment or description about the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withRepositoryDescription(String repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
        return this;
    }

    /**
     * <p>
     * The repository's default branch name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The repository's default branch name.
     *         </p>
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * <p>
     * The repository's default branch name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param defaultBranch <p>
     *            The repository's default branch name.
     *            </p>
     */
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * <p>
     * The repository's default branch name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param defaultBranch <p>
     *            The repository's default branch name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * <p>
     * The date and time the repository was last modified, in timestamp format.
     * </p>
     *
     * @return <p>
     *         The date and time the repository was last modified, in timestamp
     *         format.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the repository was last modified, in timestamp format.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date and time the repository was last modified, in
     *            timestamp format.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the repository was last modified, in timestamp format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date and time the repository was last modified, in
     *            timestamp format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date and time the repository was created, in timestamp format.
     * </p>
     *
     * @return <p>
     *         The date and time the repository was created, in timestamp
     *         format.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time the repository was created, in timestamp format.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time the repository was created, in timestamp
     *            format.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the repository was created, in timestamp format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time the repository was created, in timestamp
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over HTTPS.
     * </p>
     *
     * @return <p>
     *         The URL to use for cloning the repository over HTTPS.
     *         </p>
     */
    public String getCloneUrlHttp() {
        return cloneUrlHttp;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over HTTPS.
     * </p>
     *
     * @param cloneUrlHttp <p>
     *            The URL to use for cloning the repository over HTTPS.
     *            </p>
     */
    public void setCloneUrlHttp(String cloneUrlHttp) {
        this.cloneUrlHttp = cloneUrlHttp;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over HTTPS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloneUrlHttp <p>
     *            The URL to use for cloning the repository over HTTPS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withCloneUrlHttp(String cloneUrlHttp) {
        this.cloneUrlHttp = cloneUrlHttp;
        return this;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over SSH.
     * </p>
     *
     * @return <p>
     *         The URL to use for cloning the repository over SSH.
     *         </p>
     */
    public String getCloneUrlSsh() {
        return cloneUrlSsh;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over SSH.
     * </p>
     *
     * @param cloneUrlSsh <p>
     *            The URL to use for cloning the repository over SSH.
     *            </p>
     */
    public void setCloneUrlSsh(String cloneUrlSsh) {
        this.cloneUrlSsh = cloneUrlSsh;
    }

    /**
     * <p>
     * The URL to use for cloning the repository over SSH.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloneUrlSsh <p>
     *            The URL to use for cloning the repository over SSH.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withCloneUrlSsh(String cloneUrlSsh) {
        this.cloneUrlSsh = cloneUrlSsh;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the repository.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the repository.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryMetadata withArn(String arn) {
        this.arn = arn;
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
        if (getAccountId() != null)
            sb.append("accountId: " + getAccountId() + ",");
        if (getRepositoryId() != null)
            sb.append("repositoryId: " + getRepositoryId() + ",");
        if (getRepositoryName() != null)
            sb.append("repositoryName: " + getRepositoryName() + ",");
        if (getRepositoryDescription() != null)
            sb.append("repositoryDescription: " + getRepositoryDescription() + ",");
        if (getDefaultBranch() != null)
            sb.append("defaultBranch: " + getDefaultBranch() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getCloneUrlHttp() != null)
            sb.append("cloneUrlHttp: " + getCloneUrlHttp() + ",");
        if (getCloneUrlSsh() != null)
            sb.append("cloneUrlSsh: " + getCloneUrlSsh() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getRepositoryId() == null) ? 0 : getRepositoryId().hashCode());
        hashCode = prime * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime
                * hashCode
                + ((getRepositoryDescription() == null) ? 0 : getRepositoryDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultBranch() == null) ? 0 : getDefaultBranch().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getCloneUrlHttp() == null) ? 0 : getCloneUrlHttp().hashCode());
        hashCode = prime * hashCode
                + ((getCloneUrlSsh() == null) ? 0 : getCloneUrlSsh().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryMetadata == false)
            return false;
        RepositoryMetadata other = (RepositoryMetadata) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRepositoryId() == null ^ this.getRepositoryId() == null)
            return false;
        if (other.getRepositoryId() != null
                && other.getRepositoryId().equals(this.getRepositoryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryDescription() == null ^ this.getRepositoryDescription() == null)
            return false;
        if (other.getRepositoryDescription() != null
                && other.getRepositoryDescription().equals(this.getRepositoryDescription()) == false)
            return false;
        if (other.getDefaultBranch() == null ^ this.getDefaultBranch() == null)
            return false;
        if (other.getDefaultBranch() != null
                && other.getDefaultBranch().equals(this.getDefaultBranch()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCloneUrlHttp() == null ^ this.getCloneUrlHttp() == null)
            return false;
        if (other.getCloneUrlHttp() != null
                && other.getCloneUrlHttp().equals(this.getCloneUrlHttp()) == false)
            return false;
        if (other.getCloneUrlSsh() == null ^ this.getCloneUrlSsh() == null)
            return false;
        if (other.getCloneUrlSsh() != null
                && other.getCloneUrlSsh().equals(this.getCloneUrlSsh()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }
}
