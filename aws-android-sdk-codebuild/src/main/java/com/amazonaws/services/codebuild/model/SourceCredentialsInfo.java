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

/**
 * <p>
 * Information about the credentials for a GitHub, GitHub Enterprise, or
 * Bitbucket repository.
 * </p>
 */
public class SourceCredentialsInfo implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String arn;

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB,
     * GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     */
    private String serverType;

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are
     * OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     */
    private String authType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the token.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the token.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceCredentialsInfo withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB,
     * GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @return <p>
     *         The type of source provider. The valid options are GITHUB,
     *         GITHUB_ENTERPRISE, or BITBUCKET.
     *         </p>
     * @see ServerType
     */
    public String getServerType() {
        return serverType;
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB,
     * GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @param serverType <p>
     *            The type of source provider. The valid options are GITHUB,
     *            GITHUB_ENTERPRISE, or BITBUCKET.
     *            </p>
     * @see ServerType
     */
    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB,
     * GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @param serverType <p>
     *            The type of source provider. The valid options are GITHUB,
     *            GITHUB_ENTERPRISE, or BITBUCKET.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerType
     */
    public SourceCredentialsInfo withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB,
     * GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @param serverType <p>
     *            The type of source provider. The valid options are GITHUB,
     *            GITHUB_ENTERPRISE, or BITBUCKET.
     *            </p>
     * @see ServerType
     */
    public void setServerType(ServerType serverType) {
        this.serverType = serverType.toString();
    }

    /**
     * <p>
     * The type of source provider. The valid options are GITHUB,
     * GITHUB_ENTERPRISE, or BITBUCKET.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GITHUB, BITBUCKET, GITHUB_ENTERPRISE
     *
     * @param serverType <p>
     *            The type of source provider. The valid options are GITHUB,
     *            GITHUB_ENTERPRISE, or BITBUCKET.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServerType
     */
    public SourceCredentialsInfo withServerType(ServerType serverType) {
        this.serverType = serverType.toString();
        return this;
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are
     * OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @return <p>
     *         The type of authentication used by the credentials. Valid options
     *         are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *         </p>
     * @see AuthType
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are
     * OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @param authType <p>
     *            The type of authentication used by the credentials. Valid
     *            options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *            </p>
     * @see AuthType
     */
    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are
     * OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @param authType <p>
     *            The type of authentication used by the credentials. Valid
     *            options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthType
     */
    public SourceCredentialsInfo withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are
     * OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @param authType <p>
     *            The type of authentication used by the credentials. Valid
     *            options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *            </p>
     * @see AuthType
     */
    public void setAuthType(AuthType authType) {
        this.authType = authType.toString();
    }

    /**
     * <p>
     * The type of authentication used by the credentials. Valid options are
     * OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OAUTH, BASIC_AUTH, PERSONAL_ACCESS_TOKEN
     *
     * @param authType <p>
     *            The type of authentication used by the credentials. Valid
     *            options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthType
     */
    public SourceCredentialsInfo withAuthType(AuthType authType) {
        this.authType = authType.toString();
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getServerType() != null)
            sb.append("serverType: " + getServerType() + ",");
        if (getAuthType() != null)
            sb.append("authType: " + getAuthType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getServerType() == null) ? 0 : getServerType().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceCredentialsInfo == false)
            return false;
        SourceCredentialsInfo other = (SourceCredentialsInfo) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        return true;
    }
}
