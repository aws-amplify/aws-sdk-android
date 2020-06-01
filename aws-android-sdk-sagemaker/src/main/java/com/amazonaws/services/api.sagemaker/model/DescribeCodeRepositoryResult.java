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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class DescribeCodeRepositoryResult implements Serializable {
    /**
     * <p>
     * The name of the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String codeRepositoryName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*
     * <br/>
     */
    private String codeRepositoryArn;

    /**
     * <p>
     * The date and time that the repository was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The date and time that the repository was last changed.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Configuration details about the repository, including the URL where the
     * repository is located, the default branch, and the Amazon Resource Name
     * (ARN) of the AWS Secrets Manager secret that contains the credentials
     * used to access the repository.
     * </p>
     */
    private GitConfig gitConfig;

    /**
     * <p>
     * The name of the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the Git repository.
     *         </p>
     */
    public String getCodeRepositoryName() {
        return codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param codeRepositoryName <p>
     *            The name of the Git repository.
     *            </p>
     */
    public void setCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param codeRepositoryName <p>
     *            The name of the Git repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCodeRepositoryResult withCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Git repository.
     *         </p>
     */
    public String getCodeRepositoryArn() {
        return codeRepositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*
     * <br/>
     *
     * @param codeRepositoryArn <p>
     *            The Amazon Resource Name (ARN) of the Git repository.
     *            </p>
     */
    public void setCodeRepositoryArn(String codeRepositoryArn) {
        this.codeRepositoryArn = codeRepositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Git repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*
     * <br/>
     *
     * @param codeRepositoryArn <p>
     *            The Amazon Resource Name (ARN) of the Git repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCodeRepositoryResult withCodeRepositoryArn(String codeRepositoryArn) {
        this.codeRepositoryArn = codeRepositoryArn;
        return this;
    }

    /**
     * <p>
     * The date and time that the repository was created.
     * </p>
     *
     * @return <p>
     *         The date and time that the repository was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The date and time that the repository was created.
     * </p>
     *
     * @param creationTime <p>
     *            The date and time that the repository was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the repository was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The date and time that the repository was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCodeRepositoryResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The date and time that the repository was last changed.
     * </p>
     *
     * @return <p>
     *         The date and time that the repository was last changed.
     *         </p>
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the repository was last changed.
     * </p>
     *
     * @param lastModifiedTime <p>
     *            The date and time that the repository was last changed.
     *            </p>
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the repository was last changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedTime <p>
     *            The date and time that the repository was last changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCodeRepositoryResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * <p>
     * Configuration details about the repository, including the URL where the
     * repository is located, the default branch, and the Amazon Resource Name
     * (ARN) of the AWS Secrets Manager secret that contains the credentials
     * used to access the repository.
     * </p>
     *
     * @return <p>
     *         Configuration details about the repository, including the URL
     *         where the repository is located, the default branch, and the
     *         Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
     *         contains the credentials used to access the repository.
     *         </p>
     */
    public GitConfig getGitConfig() {
        return gitConfig;
    }

    /**
     * <p>
     * Configuration details about the repository, including the URL where the
     * repository is located, the default branch, and the Amazon Resource Name
     * (ARN) of the AWS Secrets Manager secret that contains the credentials
     * used to access the repository.
     * </p>
     *
     * @param gitConfig <p>
     *            Configuration details about the repository, including the URL
     *            where the repository is located, the default branch, and the
     *            Amazon Resource Name (ARN) of the AWS Secrets Manager secret
     *            that contains the credentials used to access the repository.
     *            </p>
     */
    public void setGitConfig(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
    }

    /**
     * <p>
     * Configuration details about the repository, including the URL where the
     * repository is located, the default branch, and the Amazon Resource Name
     * (ARN) of the AWS Secrets Manager secret that contains the credentials
     * used to access the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gitConfig <p>
     *            Configuration details about the repository, including the URL
     *            where the repository is located, the default branch, and the
     *            Amazon Resource Name (ARN) of the AWS Secrets Manager secret
     *            that contains the credentials used to access the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCodeRepositoryResult withGitConfig(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
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
        if (getCodeRepositoryName() != null)
            sb.append("CodeRepositoryName: " + getCodeRepositoryName() + ",");
        if (getCodeRepositoryArn() != null)
            sb.append("CodeRepositoryArn: " + getCodeRepositoryArn() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getGitConfig() != null)
            sb.append("GitConfig: " + getGitConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCodeRepositoryName() == null) ? 0 : getCodeRepositoryName().hashCode());
        hashCode = prime * hashCode
                + ((getCodeRepositoryArn() == null) ? 0 : getCodeRepositoryArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getGitConfig() == null) ? 0 : getGitConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCodeRepositoryResult == false)
            return false;
        DescribeCodeRepositoryResult other = (DescribeCodeRepositoryResult) obj;

        if (other.getCodeRepositoryName() == null ^ this.getCodeRepositoryName() == null)
            return false;
        if (other.getCodeRepositoryName() != null
                && other.getCodeRepositoryName().equals(this.getCodeRepositoryName()) == false)
            return false;
        if (other.getCodeRepositoryArn() == null ^ this.getCodeRepositoryArn() == null)
            return false;
        if (other.getCodeRepositoryArn() != null
                && other.getCodeRepositoryArn().equals(this.getCodeRepositoryArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null
                && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getGitConfig() == null ^ this.getGitConfig() == null)
            return false;
        if (other.getGitConfig() != null
                && other.getGitConfig().equals(this.getGitConfig()) == false)
            return false;
        return true;
    }
}
