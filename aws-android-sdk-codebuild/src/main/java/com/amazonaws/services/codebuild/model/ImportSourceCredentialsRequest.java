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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Imports the source repository credentials for an AWS CodeBuild project that
 * has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket
 * repository.
 * </p>
 */
public class ImportSourceCredentialsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This
     * parameter is not valid for other types of source providers or
     * connections.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String username;

    /**
     * <p>
     * For GitHub or GitHub Enterprise, this is the personal access token. For
     * Bitbucket, this is the app password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String token;

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     */
    private String serverType;

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub
     * Enterprise, or Bitbucket repository. An OAUTH connection is not supported
     * by the API and must be created using the AWS CodeBuild console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     */
    private String authType;

    /**
     * <p>
     * Set to <code>false</code> to prevent overwriting the repository source
     * credentials. Set to <code>true</code> to overwrite the repository source
     * credentials. The default value is <code>true</code>.
     * </p>
     */
    private Boolean shouldOverwrite;

    /**
     * <p>
     * The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This
     * parameter is not valid for other types of source providers or
     * connections.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The Bitbucket username when the <code>authType</code> is
     *         BASIC_AUTH. This parameter is not valid for other types of source
     *         providers or connections.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This
     * parameter is not valid for other types of source providers or
     * connections.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param username <p>
     *            The Bitbucket username when the <code>authType</code> is
     *            BASIC_AUTH. This parameter is not valid for other types of
     *            source providers or connections.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The Bitbucket username when the <code>authType</code> is BASIC_AUTH. This
     * parameter is not valid for other types of source providers or
     * connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param username <p>
     *            The Bitbucket username when the <code>authType</code> is
     *            BASIC_AUTH. This parameter is not valid for other types of
     *            source providers or connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSourceCredentialsRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * For GitHub or GitHub Enterprise, this is the personal access token. For
     * Bitbucket, this is the app password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         For GitHub or GitHub Enterprise, this is the personal access
     *         token. For Bitbucket, this is the app password.
     *         </p>
     */
    public String getToken() {
        return token;
    }

    /**
     * <p>
     * For GitHub or GitHub Enterprise, this is the personal access token. For
     * Bitbucket, this is the app password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param token <p>
     *            For GitHub or GitHub Enterprise, this is the personal access
     *            token. For Bitbucket, this is the app password.
     *            </p>
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * For GitHub or GitHub Enterprise, this is the personal access token. For
     * Bitbucket, this is the app password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param token <p>
     *            For GitHub or GitHub Enterprise, this is the personal access
     *            token. For Bitbucket, this is the app password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSourceCredentialsRequest withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @return <p>
     *         The source provider used for this project.
     *         </p>
     * @see ServerType
     */
    public String getServerType() {
        return serverType;
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @param serverType <p>
     *            The source provider used for this project.
     *            </p>
     * @see ServerType
     */
    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @param serverType <p>
     *            The source provider used for this project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerType
     */
    public ImportSourceCredentialsRequest withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @param serverType <p>
     *            The source provider used for this project.
     *            </p>
     * @see ServerType
     */
    public void setServerType(ServerType serverType) {
        this.serverType = serverType.toString();
    }

    /**
     * <p>
     * The source provider used for this project.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @param serverType <p>
     *            The source provider used for this project.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerType
     */
    public ImportSourceCredentialsRequest withServerType(ServerType serverType) {
        this.serverType = serverType.toString();
        return this;
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub
     * Enterprise, or Bitbucket repository. An OAUTH connection is not supported
     * by the API and must be created using the AWS CodeBuild console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @return <p>
     *         The type of authentication used to connect to a GitHub, GitHub
     *         Enterprise, or Bitbucket repository. An OAUTH connection is not
     *         supported by the API and must be created using the AWS CodeBuild
     *         console.
     *         </p>
     * @see AuthType
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub
     * Enterprise, or Bitbucket repository. An OAUTH connection is not supported
     * by the API and must be created using the AWS CodeBuild console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @param authType <p>
     *            The type of authentication used to connect to a GitHub, GitHub
     *            Enterprise, or Bitbucket repository. An OAUTH connection is
     *            not supported by the API and must be created using the AWS
     *            CodeBuild console.
     *            </p>
     * @see AuthType
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub
     * Enterprise, or Bitbucket repository. An OAUTH connection is not supported
     * by the API and must be created using the AWS CodeBuild console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @param authType <p>
     *            The type of authentication used to connect to a GitHub, GitHub
     *            Enterprise, or Bitbucket repository. An OAUTH connection is
     *            not supported by the API and must be created using the AWS
     *            CodeBuild console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthType
     */
    public ImportSourceCredentialsRequest withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub
     * Enterprise, or Bitbucket repository. An OAUTH connection is not supported
     * by the API and must be created using the AWS CodeBuild console.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @param authType <p>
     *            The type of authentication used to connect to a GitHub, GitHub
     *            Enterprise, or Bitbucket repository. An OAUTH connection is
     *            not supported by the API and must be created using the AWS
     *            CodeBuild console.
     *            </p>
     * @see AuthType
     */
    public void setAuthType(AuthType authType) {
        this.authType = authType.toString();
    }

    /**
     * <p>
     * The type of authentication used to connect to a GitHub, GitHub
     * Enterprise, or Bitbucket repository. An OAUTH connection is not supported
     * by the API and must be created using the AWS CodeBuild console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @param authType <p>
     *            The type of authentication used to connect to a GitHub, GitHub
     *            Enterprise, or Bitbucket repository. An OAUTH connection is
     *            not supported by the API and must be created using the AWS
     *            CodeBuild console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthType
     */
    public ImportSourceCredentialsRequest withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * Set to <code>false</code> to prevent overwriting the repository source
     * credentials. Set to <code>true</code> to overwrite the repository source
     * credentials. The default value is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Set to <code>false</code> to prevent overwriting the repository
     *         source credentials. Set to <code>true</code> to overwrite the
     *         repository source credentials. The default value is
     *         <code>true</code>.
     *         </p>
     */
    public Boolean isShouldOverwrite() {
        return shouldOverwrite;
    }

    /**
     * <p>
     * Set to <code>false</code> to prevent overwriting the repository source
     * credentials. Set to <code>true</code> to overwrite the repository source
     * credentials. The default value is <code>true</code>.
     * </p>
     *
     * @return <p>
     *         Set to <code>false</code> to prevent overwriting the repository
     *         source credentials. Set to <code>true</code> to overwrite the
     *         repository source credentials. The default value is
     *         <code>true</code>.
     *         </p>
     */
    public Boolean getShouldOverwrite() {
        return shouldOverwrite;
    }

    /**
     * <p>
     * Set to <code>false</code> to prevent overwriting the repository source
     * credentials. Set to <code>true</code> to overwrite the repository source
     * credentials. The default value is <code>true</code>.
     * </p>
     *
     * @param shouldOverwrite <p>
     *            Set to <code>false</code> to prevent overwriting the
     *            repository source credentials. Set to <code>true</code> to
     *            overwrite the repository source credentials. The default value
     *            is <code>true</code>.
     *            </p>
     */
    public void setShouldOverwrite(Boolean shouldOverwrite) {
        this.shouldOverwrite = shouldOverwrite;
    }

    /**
     * <p>
     * Set to <code>false</code> to prevent overwriting the repository source
     * credentials. Set to <code>true</code> to overwrite the repository source
     * credentials. The default value is <code>true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param shouldOverwrite <p>
     *            Set to <code>false</code> to prevent overwriting the
     *            repository source credentials. Set to <code>true</code> to
     *            overwrite the repository source credentials. The default value
     *            is <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportSourceCredentialsRequest withShouldOverwrite(Boolean shouldOverwrite) {
        this.shouldOverwrite = shouldOverwrite;
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
        if (getUsername() != null)
            sb.append("username: " + getUsername() + ",");
        if (getToken() != null)
            sb.append("token: " + getToken() + ",");
        if (getServerType() != null)
            sb.append("serverType: " + getServerType() + ",");
        if (getAuthType() != null)
            sb.append("authType: " + getAuthType() + ",");
        if (getShouldOverwrite() != null)
            sb.append("shouldOverwrite: " + getShouldOverwrite());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getServerType() == null) ? 0 : getServerType().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode
                + ((getShouldOverwrite() == null) ? 0 : getShouldOverwrite().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSourceCredentialsRequest == false)
            return false;
        ImportSourceCredentialsRequest other = (ImportSourceCredentialsRequest) obj;

        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getServerType() == null ^ this.getServerType() == null)
            return false;
        if (other.getServerType() != null
                && other.getServerType().equals(this.getServerType()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getShouldOverwrite() == null ^ this.getShouldOverwrite() == null)
            return false;
        if (other.getShouldOverwrite() != null
                && other.getShouldOverwrite().equals(this.getShouldOverwrite()) == false)
            return false;
        return true;
    }
}
