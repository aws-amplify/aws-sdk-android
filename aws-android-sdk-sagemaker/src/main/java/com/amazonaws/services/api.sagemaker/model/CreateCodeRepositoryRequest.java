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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Git repository as a resource in your Amazon SageMaker account. You
 * can associate the repository with notebook instances so that you can use Git
 * source control for the notebooks you create. The Git repository is a resource
 * in your Amazon SageMaker account, so it can be associated with more than one
 * notebook instance, and it persists independently from the lifecycle of any
 * notebook instances it is associated with.
 * </p>
 * <p>
 * The repository can be hosted either in <a
 * href="https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html"
 * >AWS CodeCommit</a> or in any other Git repository.
 * </p>
 */
public class CreateCodeRepositoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Git repository. The name must have 1 to 63 characters.
     * Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     */
    private String codeRepositoryName;

    /**
     * <p>
     * Specifies details about the repository, including the URL where the
     * repository is located, the default branch, and credentials to use to
     * access the repository.
     * </p>
     */
    private GitConfig gitConfig;

    /**
     * <p>
     * The name of the Git repository. The name must have 1 to 63 characters.
     * Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the Git repository. The name must have 1 to 63
     *         characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     *         </p>
     */
    public String getCodeRepositoryName() {
        return codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository. The name must have 1 to 63 characters.
     * Valid characters are a-z, A-Z, 0-9, and - (hyphen).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*$<br/>
     *
     * @param codeRepositoryName <p>
     *            The name of the Git repository. The name must have 1 to 63
     *            characters. Valid characters are a-z, A-Z, 0-9, and -
     *            (hyphen).
     *            </p>
     */
    public void setCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository. The name must have 1 to 63 characters.
     * Valid characters are a-z, A-Z, 0-9, and - (hyphen).
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
     *            The name of the Git repository. The name must have 1 to 63
     *            characters. Valid characters are a-z, A-Z, 0-9, and -
     *            (hyphen).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCodeRepositoryRequest withCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
        return this;
    }

    /**
     * <p>
     * Specifies details about the repository, including the URL where the
     * repository is located, the default branch, and credentials to use to
     * access the repository.
     * </p>
     *
     * @return <p>
     *         Specifies details about the repository, including the URL where
     *         the repository is located, the default branch, and credentials to
     *         use to access the repository.
     *         </p>
     */
    public GitConfig getGitConfig() {
        return gitConfig;
    }

    /**
     * <p>
     * Specifies details about the repository, including the URL where the
     * repository is located, the default branch, and credentials to use to
     * access the repository.
     * </p>
     *
     * @param gitConfig <p>
     *            Specifies details about the repository, including the URL
     *            where the repository is located, the default branch, and
     *            credentials to use to access the repository.
     *            </p>
     */
    public void setGitConfig(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
    }

    /**
     * <p>
     * Specifies details about the repository, including the URL where the
     * repository is located, the default branch, and credentials to use to
     * access the repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gitConfig <p>
     *            Specifies details about the repository, including the URL
     *            where the repository is located, the default branch, and
     *            credentials to use to access the repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCodeRepositoryRequest withGitConfig(GitConfig gitConfig) {
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
        hashCode = prime * hashCode + ((getGitConfig() == null) ? 0 : getGitConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCodeRepositoryRequest == false)
            return false;
        CreateCodeRepositoryRequest other = (CreateCodeRepositoryRequest) obj;

        if (other.getCodeRepositoryName() == null ^ this.getCodeRepositoryName() == null)
            return false;
        if (other.getCodeRepositoryName() != null
                && other.getCodeRepositoryName().equals(this.getCodeRepositoryName()) == false)
            return false;
        if (other.getGitConfig() == null ^ this.getGitConfig() == null)
            return false;
        if (other.getGitConfig() != null
                && other.getGitConfig().equals(this.getGitConfig()) == false)
            return false;
        return true;
    }
}
