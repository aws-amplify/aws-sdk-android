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

/**
 * <p>
 * Specifies configuration details for a Git repository in your AWS account.
 * </p>
 */
public class GitConfig implements Serializable {
    /**
     * <p>
     * The URL where the Git repository is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$<br/>
     */
    private String repositoryUrl;

    /**
     * <p>
     * The default branch for the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^ ~^:?*\[]+<br/>
     */
    private String branch;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
     * contains the credentials used to access the git repository. The secret
     * must have a staging label of <code>AWSCURRENT</code> and must be in the
     * following format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:secretsmanager:[a-z0-9\-]*:[0-9]{12}:secret:.*<br/>
     */
    private String secretArn;

    /**
     * <p>
     * The URL where the Git repository is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The URL where the Git repository is located.
     *         </p>
     */
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * <p>
     * The URL where the Git repository is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$<br/>
     *
     * @param repositoryUrl <p>
     *            The URL where the Git repository is located.
     *            </p>
     */
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    /**
     * <p>
     * The URL where the Git repository is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^https://([^/]+)/?(.*)$<br/>
     *
     * @param repositoryUrl <p>
     *            The URL where the Git repository is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GitConfig withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * <p>
     * The default branch for the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^ ~^:?*\[]+<br/>
     *
     * @return <p>
     *         The default branch for the Git repository.
     *         </p>
     */
    public String getBranch() {
        return branch;
    }

    /**
     * <p>
     * The default branch for the Git repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^ ~^:?*\[]+<br/>
     *
     * @param branch <p>
     *            The default branch for the Git repository.
     *            </p>
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The default branch for the Git repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[^ ~^:?*\[]+<br/>
     *
     * @param branch <p>
     *            The default branch for the Git repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GitConfig withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
     * contains the credentials used to access the git repository. The secret
     * must have a staging label of <code>AWSCURRENT</code> and must be in the
     * following format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:secretsmanager:[a-z0-9\-]*:[0-9]{12}:secret:.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS Secrets Manager secret
     *         that contains the credentials used to access the git repository.
     *         The secret must have a staging label of <code>AWSCURRENT</code>
     *         and must be in the following format:
     *         </p>
     *         <p>
     *         <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     *         </p>
     */
    public String getSecretArn() {
        return secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
     * contains the credentials used to access the git repository. The secret
     * must have a staging label of <code>AWSCURRENT</code> and must be in the
     * following format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:secretsmanager:[a-z0-9\-]*:[0-9]{12}:secret:.*<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Secrets Manager
     *            secret that contains the credentials used to access the git
     *            repository. The secret must have a staging label of
     *            <code>AWSCURRENT</code> and must be in the following format:
     *            </p>
     *            <p>
     *            <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     *            </p>
     */
    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
     * contains the credentials used to access the git repository. The secret
     * must have a staging label of <code>AWSCURRENT</code> and must be in the
     * following format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:secretsmanager:[a-z0-9\-]*:[0-9]{12}:secret:.*<br/>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) of the AWS Secrets Manager
     *            secret that contains the credentials used to access the git
     *            repository. The secret must have a staging label of
     *            <code>AWSCURRENT</code> and must be in the following format:
     *            </p>
     *            <p>
     *            <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GitConfig withSecretArn(String secretArn) {
        this.secretArn = secretArn;
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
        if (getRepositoryUrl() != null)
            sb.append("RepositoryUrl: " + getRepositoryUrl() + ",");
        if (getBranch() != null)
            sb.append("Branch: " + getBranch() + ",");
        if (getSecretArn() != null)
            sb.append("SecretArn: " + getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryUrl() == null) ? 0 : getRepositoryUrl().hashCode());
        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitConfig == false)
            return false;
        GitConfig other = (GitConfig) obj;

        if (other.getRepositoryUrl() == null ^ this.getRepositoryUrl() == null)
            return false;
        if (other.getRepositoryUrl() != null
                && other.getRepositoryUrl().equals(this.getRepositoryUrl()) == false)
            return false;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null
                && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }
}
