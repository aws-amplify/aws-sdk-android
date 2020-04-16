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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Specifies the details of authentication used by a proxy to log in as a
 * specific database user.
 * </p>
 */
public class UserAuthConfig implements Serializable {
    /**
     * <p>
     * A user-specified description about the authentication used by a proxy to
     * log in as a specific database user.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the database user to which the proxy connects.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the
     * proxy to the underlying database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECRETS
     */
    private String authScheme;

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the secret that the proxy
     * uses to authenticate to the RDS DB instance or Aurora DB cluster. These
     * secrets are stored within Amazon Secrets Manager.
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, REQUIRED
     */
    private String iAMAuth;

    /**
     * <p>
     * A user-specified description about the authentication used by a proxy to
     * log in as a specific database user.
     * </p>
     *
     * @return <p>
     *         A user-specified description about the authentication used by a
     *         proxy to log in as a specific database user.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A user-specified description about the authentication used by a proxy to
     * log in as a specific database user.
     * </p>
     *
     * @param description <p>
     *            A user-specified description about the authentication used by
     *            a proxy to log in as a specific database user.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-specified description about the authentication used by a proxy to
     * log in as a specific database user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            A user-specified description about the authentication used by
     *            a proxy to log in as a specific database user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserAuthConfig withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the database user to which the proxy connects.
     * </p>
     *
     * @return <p>
     *         The name of the database user to which the proxy connects.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the database user to which the proxy connects.
     * </p>
     *
     * @param userName <p>
     *            The name of the database user to which the proxy connects.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the database user to which the proxy connects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userName <p>
     *            The name of the database user to which the proxy connects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserAuthConfig withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the
     * proxy to the underlying database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECRETS
     *
     * @return <p>
     *         The type of authentication that the proxy uses for connections
     *         from the proxy to the underlying database.
     *         </p>
     * @see AuthScheme
     */
    public String getAuthScheme() {
        return authScheme;
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the
     * proxy to the underlying database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECRETS
     *
     * @param authScheme <p>
     *            The type of authentication that the proxy uses for connections
     *            from the proxy to the underlying database.
     *            </p>
     * @see AuthScheme
     */
    public void setAuthScheme(String authScheme) {
        this.authScheme = authScheme;
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the
     * proxy to the underlying database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECRETS
     *
     * @param authScheme <p>
     *            The type of authentication that the proxy uses for connections
     *            from the proxy to the underlying database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthScheme
     */
    public UserAuthConfig withAuthScheme(String authScheme) {
        this.authScheme = authScheme;
        return this;
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the
     * proxy to the underlying database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECRETS
     *
     * @param authScheme <p>
     *            The type of authentication that the proxy uses for connections
     *            from the proxy to the underlying database.
     *            </p>
     * @see AuthScheme
     */
    public void setAuthScheme(AuthScheme authScheme) {
        this.authScheme = authScheme.toString();
    }

    /**
     * <p>
     * The type of authentication that the proxy uses for connections from the
     * proxy to the underlying database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SECRETS
     *
     * @param authScheme <p>
     *            The type of authentication that the proxy uses for connections
     *            from the proxy to the underlying database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AuthScheme
     */
    public UserAuthConfig withAuthScheme(AuthScheme authScheme) {
        this.authScheme = authScheme.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the secret that the proxy
     * uses to authenticate to the RDS DB instance or Aurora DB cluster. These
     * secrets are stored within Amazon Secrets Manager.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) representing the secret that the
     *         proxy uses to authenticate to the RDS DB instance or Aurora DB
     *         cluster. These secrets are stored within Amazon Secrets Manager.
     *         </p>
     */
    public String getSecretArn() {
        return secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the secret that the proxy
     * uses to authenticate to the RDS DB instance or Aurora DB cluster. These
     * secrets are stored within Amazon Secrets Manager.
     * </p>
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) representing the secret that
     *            the proxy uses to authenticate to the RDS DB instance or
     *            Aurora DB cluster. These secrets are stored within Amazon
     *            Secrets Manager.
     *            </p>
     */
    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the secret that the proxy
     * uses to authenticate to the RDS DB instance or Aurora DB cluster. These
     * secrets are stored within Amazon Secrets Manager.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param secretArn <p>
     *            The Amazon Resource Name (ARN) representing the secret that
     *            the proxy uses to authenticate to the RDS DB instance or
     *            Aurora DB cluster. These secrets are stored within Amazon
     *            Secrets Manager.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserAuthConfig withSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, REQUIRED
     *
     * @return <p>
     *         Whether to require or disallow AWS Identity and Access Management
     *         (IAM) authentication for connections to the proxy.
     *         </p>
     * @see IAMAuthMode
     */
    public String getIAMAuth() {
        return iAMAuth;
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, REQUIRED
     *
     * @param iAMAuth <p>
     *            Whether to require or disallow AWS Identity and Access
     *            Management (IAM) authentication for connections to the proxy.
     *            </p>
     * @see IAMAuthMode
     */
    public void setIAMAuth(String iAMAuth) {
        this.iAMAuth = iAMAuth;
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, REQUIRED
     *
     * @param iAMAuth <p>
     *            Whether to require or disallow AWS Identity and Access
     *            Management (IAM) authentication for connections to the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IAMAuthMode
     */
    public UserAuthConfig withIAMAuth(String iAMAuth) {
        this.iAMAuth = iAMAuth;
        return this;
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, REQUIRED
     *
     * @param iAMAuth <p>
     *            Whether to require or disallow AWS Identity and Access
     *            Management (IAM) authentication for connections to the proxy.
     *            </p>
     * @see IAMAuthMode
     */
    public void setIAMAuth(IAMAuthMode iAMAuth) {
        this.iAMAuth = iAMAuth.toString();
    }

    /**
     * <p>
     * Whether to require or disallow AWS Identity and Access Management (IAM)
     * authentication for connections to the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, REQUIRED
     *
     * @param iAMAuth <p>
     *            Whether to require or disallow AWS Identity and Access
     *            Management (IAM) authentication for connections to the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IAMAuthMode
     */
    public UserAuthConfig withIAMAuth(IAMAuthMode iAMAuth) {
        this.iAMAuth = iAMAuth.toString();
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getAuthScheme() != null)
            sb.append("AuthScheme: " + getAuthScheme() + ",");
        if (getSecretArn() != null)
            sb.append("SecretArn: " + getSecretArn() + ",");
        if (getIAMAuth() != null)
            sb.append("IAMAuth: " + getIAMAuth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getAuthScheme() == null) ? 0 : getAuthScheme().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getIAMAuth() == null) ? 0 : getIAMAuth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserAuthConfig == false)
            return false;
        UserAuthConfig other = (UserAuthConfig) obj;

        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAuthScheme() == null ^ this.getAuthScheme() == null)
            return false;
        if (other.getAuthScheme() != null
                && other.getAuthScheme().equals(this.getAuthScheme()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null
                && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getIAMAuth() == null ^ this.getIAMAuth() == null)
            return false;
        if (other.getIAMAuth() != null && other.getIAMAuth().equals(this.getIAMAuth()) == false)
            return false;
        return true;
    }
}
