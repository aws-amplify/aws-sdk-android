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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates the user pool client.
 * </p>
 */
public class CreateUserPoolClientRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String clientName;

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     */
    private Boolean generateSecret;

    /**
     * <p>
     * The time limit, in days, after which the refresh token is no longer valid
     * and cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3650<br/>
     */
    private Integer refreshTokenValidity;

    /**
     * <p>
     * The read attributes.
     * </p>
     */
    private java.util.List<String> readAttributes;

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider,
     * this array must include all attributes that are mapped to identity
     * provider attributes. Amazon Cognito updates mapped attributes when users
     * sign in to your application through an identity provider. If your app
     * client lacks write access to a mapped attribute, Amazon Cognito throws an
     * error when it attempts to update the attribute. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     */
    private java.util.List<String> writeAttributes;

    /**
     * <p>
     * The authentication flows that are supported by the user pool clients.
     * Flow names without the <code>ALLOW_</code> prefix are deprecated in favor
     * of new names with the <code>ALLOW_</code> prefix. Note that values with
     * <code>ALLOW_</code> prefix cannot be used along with values without
     * <code>ALLOW_</code> prefix.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, Cognito receives the password in the request instead
     * of using the SRP (Secure Remote Password protocol) protocol to verify
     * passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     * authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based
     * authentication. In this flow, Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> explicitAuthFlows;

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on
     * this client. The following are supported: <code>COGNITO</code>,
     * <code>Facebook</code>, <code>Google</code> and
     * <code>LoginWithAmazon</code>.
     * </p>
     */
    private java.util.List<String> supportedIdentityProviders;

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     */
    private java.util.List<String> callbackURLs;

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     */
    private java.util.List<String> logoutURLs;

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String defaultRedirectURI;

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an
     * authorization code as the response. This code can be exchanged for access
     * tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>implicit</code> to specify that the client should get the
     * access token (and, optionally, ID token, based on scopes) directly.
     * </p>
     * <p>
     * Set to <code>client_credentials</code> to specify that the client should
     * get the access token (and, optionally, ID token, based on scopes) from
     * the token endpoint using a combination of client and client_secret.
     * </p>
     */
    private java.util.List<String> allowedOAuthFlows;

    /**
     * <p>
     * The allowed OAuth scopes. Possible values provided by OAuth are:
     * <code>phone</code>, <code>email</code>, <code>openid</code>, and
     * <code>profile</code>. Possible values provided by AWS are:
     * <code>aws.cognito.signin.user.admin</code>. Custom scopes created in
     * Resource Servers are also supported.
     * </p>
     */
    private java.util.List<String> allowedOAuthScopes;

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when
     * interacting with Cognito user pools.
     * </p>
     */
    private Boolean allowedOAuthFlowsUserPoolClient;

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for collecting metrics for
     * this user pool.
     * </p>
     * <note>
     * <p>
     * Cognito User Pools only supports sending events to Amazon Pinpoint
     * projects in the US East (N. Virginia) us-east-1 Region, regardless of the
     * region in which the user pool resides.
     * </p>
     * </note>
     */
    private AnalyticsConfigurationType analyticsConfiguration;

    /**
     * <p>
     * Use this setting to choose which errors and responses are returned by
     * Cognito APIs during authentication, account confirmation, and password
     * recovery when the user does not exist in the user pool. When set to
     * <code>ENABLED</code> and the user does not exist, authentication returns
     * an error indicating either the username or password was incorrect, and
     * account confirmation and password recovery return a response indicating a
     * code was sent to a simulated destination. When set to <code>LEGACY</code>
     * , those APIs will return a <code>UserNotFoundException</code> exception
     * if the user does not exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Cognito where
     * user existence related errors are not prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting affects the behavior of following APIs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>AdminInitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AdminRespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>InitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmSignUp</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResendConfirmationCode</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * After February 15th 2020, the value of
     * <code>PreventUserExistenceErrors</code> will default to
     * <code>ENABLED</code> for newly created user pool clients if no value is
     * provided.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     */
    private String preventUserExistenceErrors;

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool where you want to create a
     *         user pool client.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to create a
     *            user pool client.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where you want to create a
     *            user pool client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         The client name for the user pool client you would like to
     *         create.
     *         </p>
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param clientName <p>
     *            The client name for the user pool client you would like to
     *            create.
     *            </p>
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param clientName <p>
     *            The client name for the user pool client you would like to
     *            create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     *
     * @return <p>
     *         Boolean to specify whether you want to generate a secret for the
     *         user pool client being created.
     *         </p>
     */
    public Boolean isGenerateSecret() {
        return generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     *
     * @return <p>
     *         Boolean to specify whether you want to generate a secret for the
     *         user pool client being created.
     *         </p>
     */
    public Boolean getGenerateSecret() {
        return generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     *
     * @param generateSecret <p>
     *            Boolean to specify whether you want to generate a secret for
     *            the user pool client being created.
     *            </p>
     */
    public void setGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generateSecret <p>
     *            Boolean to specify whether you want to generate a secret for
     *            the user pool client being created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
        return this;
    }

    /**
     * <p>
     * The time limit, in days, after which the refresh token is no longer valid
     * and cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3650<br/>
     *
     * @return <p>
     *         The time limit, in days, after which the refresh token is no
     *         longer valid and cannot be used.
     *         </p>
     */
    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    /**
     * <p>
     * The time limit, in days, after which the refresh token is no longer valid
     * and cannot be used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3650<br/>
     *
     * @param refreshTokenValidity <p>
     *            The time limit, in days, after which the refresh token is no
     *            longer valid and cannot be used.
     *            </p>
     */
    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    /**
     * <p>
     * The time limit, in days, after which the refresh token is no longer valid
     * and cannot be used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3650<br/>
     *
     * @param refreshTokenValidity <p>
     *            The time limit, in days, after which the refresh token is no
     *            longer valid and cannot be used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     *
     * @return <p>
     *         The read attributes.
     *         </p>
     */
    public java.util.List<String> getReadAttributes() {
        return readAttributes;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     *
     * @param readAttributes <p>
     *            The read attributes.
     *            </p>
     */
    public void setReadAttributes(java.util.Collection<String> readAttributes) {
        if (readAttributes == null) {
            this.readAttributes = null;
            return;
        }

        this.readAttributes = new java.util.ArrayList<String>(readAttributes);
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readAttributes <p>
     *            The read attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withReadAttributes(String... readAttributes) {
        if (getReadAttributes() == null) {
            this.readAttributes = new java.util.ArrayList<String>(readAttributes.length);
        }
        for (String value : readAttributes) {
            this.readAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readAttributes <p>
     *            The read attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withReadAttributes(
            java.util.Collection<String> readAttributes) {
        setReadAttributes(readAttributes);
        return this;
    }

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider,
     * this array must include all attributes that are mapped to identity
     * provider attributes. Amazon Cognito updates mapped attributes when users
     * sign in to your application through an identity provider. If your app
     * client lacks write access to a mapped attribute, Amazon Cognito throws an
     * error when it attempts to update the attribute. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     *
     * @return <p>
     *         The user pool attributes that the app client can write to.
     *         </p>
     *         <p>
     *         If your app client allows users to sign in through an identity
     *         provider, this array must include all attributes that are mapped
     *         to identity provider attributes. Amazon Cognito updates mapped
     *         attributes when users sign in to your application through an
     *         identity provider. If your app client lacks write access to a
     *         mapped attribute, Amazon Cognito throws an error when it attempts
     *         to update the attribute. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *         >Specifying Identity Provider Attribute Mappings for Your User
     *         Pool</a>.
     *         </p>
     */
    public java.util.List<String> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider,
     * this array must include all attributes that are mapped to identity
     * provider attributes. Amazon Cognito updates mapped attributes when users
     * sign in to your application through an identity provider. If your app
     * client lacks write access to a mapped attribute, Amazon Cognito throws an
     * error when it attempts to update the attribute. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     *
     * @param writeAttributes <p>
     *            The user pool attributes that the app client can write to.
     *            </p>
     *            <p>
     *            If your app client allows users to sign in through an identity
     *            provider, this array must include all attributes that are
     *            mapped to identity provider attributes. Amazon Cognito updates
     *            mapped attributes when users sign in to your application
     *            through an identity provider. If your app client lacks write
     *            access to a mapped attribute, Amazon Cognito throws an error
     *            when it attempts to update the attribute. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *            >Specifying Identity Provider Attribute Mappings for Your User
     *            Pool</a>.
     *            </p>
     */
    public void setWriteAttributes(java.util.Collection<String> writeAttributes) {
        if (writeAttributes == null) {
            this.writeAttributes = null;
            return;
        }

        this.writeAttributes = new java.util.ArrayList<String>(writeAttributes);
    }

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider,
     * this array must include all attributes that are mapped to identity
     * provider attributes. Amazon Cognito updates mapped attributes when users
     * sign in to your application through an identity provider. If your app
     * client lacks write access to a mapped attribute, Amazon Cognito throws an
     * error when it attempts to update the attribute. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeAttributes <p>
     *            The user pool attributes that the app client can write to.
     *            </p>
     *            <p>
     *            If your app client allows users to sign in through an identity
     *            provider, this array must include all attributes that are
     *            mapped to identity provider attributes. Amazon Cognito updates
     *            mapped attributes when users sign in to your application
     *            through an identity provider. If your app client lacks write
     *            access to a mapped attribute, Amazon Cognito throws an error
     *            when it attempts to update the attribute. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *            >Specifying Identity Provider Attribute Mappings for Your User
     *            Pool</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withWriteAttributes(String... writeAttributes) {
        if (getWriteAttributes() == null) {
            this.writeAttributes = new java.util.ArrayList<String>(writeAttributes.length);
        }
        for (String value : writeAttributes) {
            this.writeAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider,
     * this array must include all attributes that are mapped to identity
     * provider attributes. Amazon Cognito updates mapped attributes when users
     * sign in to your application through an identity provider. If your app
     * client lacks write access to a mapped attribute, Amazon Cognito throws an
     * error when it attempts to update the attribute. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeAttributes <p>
     *            The user pool attributes that the app client can write to.
     *            </p>
     *            <p>
     *            If your app client allows users to sign in through an identity
     *            provider, this array must include all attributes that are
     *            mapped to identity provider attributes. Amazon Cognito updates
     *            mapped attributes when users sign in to your application
     *            through an identity provider. If your app client lacks write
     *            access to a mapped attribute, Amazon Cognito throws an error
     *            when it attempts to update the attribute. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *            >Specifying Identity Provider Attribute Mappings for Your User
     *            Pool</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withWriteAttributes(
            java.util.Collection<String> writeAttributes) {
        setWriteAttributes(writeAttributes);
        return this;
    }

    /**
     * <p>
     * The authentication flows that are supported by the user pool clients.
     * Flow names without the <code>ALLOW_</code> prefix are deprecated in favor
     * of new names with the <code>ALLOW_</code> prefix. Note that values with
     * <code>ALLOW_</code> prefix cannot be used along with values without
     * <code>ALLOW_</code> prefix.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, Cognito receives the password in the request instead
     * of using the SRP (Secure Remote Password protocol) protocol to verify
     * passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     * authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based
     * authentication. In this flow, Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The authentication flows that are supported by the user pool
     *         clients. Flow names without the <code>ALLOW_</code> prefix are
     *         deprecated in favor of new names with the <code>ALLOW_</code>
     *         prefix. Note that values with <code>ALLOW_</code> prefix cannot
     *         be used along with values without <code>ALLOW_</code> prefix.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based
     *         user password authentication flow
     *         <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the
     *         <code>ADMIN_NO_SRP_AUTH</code> setting. With this authentication
     *         flow, Cognito receives the password in the request instead of
     *         using the SRP (Secure Remote Password protocol) protocol to
     *         verify passwords.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     *         authentication.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based
     *         authentication. In this flow, Cognito receives the password in
     *         the request instead of using the SRP protocol to verify
     *         passwords.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based
     *         authentication.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh
     *         tokens.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * <p>
     * The authentication flows that are supported by the user pool clients.
     * Flow names without the <code>ALLOW_</code> prefix are deprecated in favor
     * of new names with the <code>ALLOW_</code> prefix. Note that values with
     * <code>ALLOW_</code> prefix cannot be used along with values without
     * <code>ALLOW_</code> prefix.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, Cognito receives the password in the request instead
     * of using the SRP (Secure Remote Password protocol) protocol to verify
     * passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     * authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based
     * authentication. In this flow, Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     *
     * @param explicitAuthFlows <p>
     *            The authentication flows that are supported by the user pool
     *            clients. Flow names without the <code>ALLOW_</code> prefix are
     *            deprecated in favor of new names with the <code>ALLOW_</code>
     *            prefix. Note that values with <code>ALLOW_</code> prefix
     *            cannot be used along with values without <code>ALLOW_</code>
     *            prefix.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin
     *            based user password authentication flow
     *            <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces
     *            the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     *            authentication flow, Cognito receives the password in the
     *            request instead of using the SRP (Secure Remote Password
     *            protocol) protocol to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     *            authentication.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user
     *            password-based authentication. In this flow, Cognito receives
     *            the password in the request instead of using the SRP protocol
     *            to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based
     *            authentication.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to
     *            refresh tokens.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        if (explicitAuthFlows == null) {
            this.explicitAuthFlows = null;
            return;
        }

        this.explicitAuthFlows = new java.util.ArrayList<String>(explicitAuthFlows);
    }

    /**
     * <p>
     * The authentication flows that are supported by the user pool clients.
     * Flow names without the <code>ALLOW_</code> prefix are deprecated in favor
     * of new names with the <code>ALLOW_</code> prefix. Note that values with
     * <code>ALLOW_</code> prefix cannot be used along with values without
     * <code>ALLOW_</code> prefix.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, Cognito receives the password in the request instead
     * of using the SRP (Secure Remote Password protocol) protocol to verify
     * passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     * authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based
     * authentication. In this flow, Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param explicitAuthFlows <p>
     *            The authentication flows that are supported by the user pool
     *            clients. Flow names without the <code>ALLOW_</code> prefix are
     *            deprecated in favor of new names with the <code>ALLOW_</code>
     *            prefix. Note that values with <code>ALLOW_</code> prefix
     *            cannot be used along with values without <code>ALLOW_</code>
     *            prefix.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin
     *            based user password authentication flow
     *            <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces
     *            the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     *            authentication flow, Cognito receives the password in the
     *            request instead of using the SRP (Secure Remote Password
     *            protocol) protocol to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     *            authentication.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user
     *            password-based authentication. In this flow, Cognito receives
     *            the password in the request instead of using the SRP protocol
     *            to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based
     *            authentication.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to
     *            refresh tokens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withExplicitAuthFlows(String... explicitAuthFlows) {
        if (getExplicitAuthFlows() == null) {
            this.explicitAuthFlows = new java.util.ArrayList<String>(explicitAuthFlows.length);
        }
        for (String value : explicitAuthFlows) {
            this.explicitAuthFlows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The authentication flows that are supported by the user pool clients.
     * Flow names without the <code>ALLOW_</code> prefix are deprecated in favor
     * of new names with the <code>ALLOW_</code> prefix. Note that values with
     * <code>ALLOW_</code> prefix cannot be used along with values without
     * <code>ALLOW_</code> prefix.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, Cognito receives the password in the request instead
     * of using the SRP (Secure Remote Password protocol) protocol to verify
     * passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     * authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based
     * authentication. In this flow, Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param explicitAuthFlows <p>
     *            The authentication flows that are supported by the user pool
     *            clients. Flow names without the <code>ALLOW_</code> prefix are
     *            deprecated in favor of new names with the <code>ALLOW_</code>
     *            prefix. Note that values with <code>ALLOW_</code> prefix
     *            cannot be used along with values without <code>ALLOW_</code>
     *            prefix.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin
     *            based user password authentication flow
     *            <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces
     *            the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     *            authentication flow, Cognito receives the password in the
     *            request instead of using the SRP (Secure Remote Password
     *            protocol) protocol to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based
     *            authentication.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user
     *            password-based authentication. In this flow, Cognito receives
     *            the password in the request instead of using the SRP protocol
     *            to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP based
     *            authentication.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to
     *            refresh tokens.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withExplicitAuthFlows(
            java.util.Collection<String> explicitAuthFlows) {
        setExplicitAuthFlows(explicitAuthFlows);
        return this;
    }

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on
     * this client. The following are supported: <code>COGNITO</code>,
     * <code>Facebook</code>, <code>Google</code> and
     * <code>LoginWithAmazon</code>.
     * </p>
     *
     * @return <p>
     *         A list of provider names for the identity providers that are
     *         supported on this client. The following are supported:
     *         <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>
     *         and <code>LoginWithAmazon</code>.
     *         </p>
     */
    public java.util.List<String> getSupportedIdentityProviders() {
        return supportedIdentityProviders;
    }

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on
     * this client. The following are supported: <code>COGNITO</code>,
     * <code>Facebook</code>, <code>Google</code> and
     * <code>LoginWithAmazon</code>.
     * </p>
     *
     * @param supportedIdentityProviders <p>
     *            A list of provider names for the identity providers that are
     *            supported on this client. The following are supported:
     *            <code>COGNITO</code>, <code>Facebook</code>,
     *            <code>Google</code> and <code>LoginWithAmazon</code>.
     *            </p>
     */
    public void setSupportedIdentityProviders(
            java.util.Collection<String> supportedIdentityProviders) {
        if (supportedIdentityProviders == null) {
            this.supportedIdentityProviders = null;
            return;
        }

        this.supportedIdentityProviders = new java.util.ArrayList<String>(
                supportedIdentityProviders);
    }

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on
     * this client. The following are supported: <code>COGNITO</code>,
     * <code>Facebook</code>, <code>Google</code> and
     * <code>LoginWithAmazon</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedIdentityProviders <p>
     *            A list of provider names for the identity providers that are
     *            supported on this client. The following are supported:
     *            <code>COGNITO</code>, <code>Facebook</code>,
     *            <code>Google</code> and <code>LoginWithAmazon</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withSupportedIdentityProviders(
            String... supportedIdentityProviders) {
        if (getSupportedIdentityProviders() == null) {
            this.supportedIdentityProviders = new java.util.ArrayList<String>(
                    supportedIdentityProviders.length);
        }
        for (String value : supportedIdentityProviders) {
            this.supportedIdentityProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on
     * this client. The following are supported: <code>COGNITO</code>,
     * <code>Facebook</code>, <code>Google</code> and
     * <code>LoginWithAmazon</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedIdentityProviders <p>
     *            A list of provider names for the identity providers that are
     *            supported on this client. The following are supported:
     *            <code>COGNITO</code>, <code>Facebook</code>,
     *            <code>Google</code> and <code>LoginWithAmazon</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withSupportedIdentityProviders(
            java.util.Collection<String> supportedIdentityProviders) {
        setSupportedIdentityProviders(supportedIdentityProviders);
        return this;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     *
     * @return <p>
     *         A list of allowed redirect (callback) URLs for the identity
     *         providers.
     *         </p>
     *         <p>
     *         A redirect URI must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Be an absolute URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be registered with the authorization server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not include a fragment component.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         See <a
     *         href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth
     *         2.0 - Redirection Endpoint</a>.
     *         </p>
     *         <p>
     *         Amazon Cognito requires HTTPS over HTTP except for
     *         http://localhost for testing purposes only.
     *         </p>
     *         <p>
     *         App callback URLs such as myapp://example are also supported.
     *         </p>
     */
    public java.util.List<String> getCallbackURLs() {
        return callbackURLs;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     *
     * @param callbackURLs <p>
     *            A list of allowed redirect (callback) URLs for the identity
     *            providers.
     *            </p>
     *            <p>
     *            A redirect URI must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Be an absolute URI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Be registered with the authorization server.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Not include a fragment component.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            See <a
     *            href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth
     *            2.0 - Redirection Endpoint</a>.
     *            </p>
     *            <p>
     *            Amazon Cognito requires HTTPS over HTTP except for
     *            http://localhost for testing purposes only.
     *            </p>
     *            <p>
     *            App callback URLs such as myapp://example are also supported.
     *            </p>
     */
    public void setCallbackURLs(java.util.Collection<String> callbackURLs) {
        if (callbackURLs == null) {
            this.callbackURLs = null;
            return;
        }

        this.callbackURLs = new java.util.ArrayList<String>(callbackURLs);
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callbackURLs <p>
     *            A list of allowed redirect (callback) URLs for the identity
     *            providers.
     *            </p>
     *            <p>
     *            A redirect URI must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Be an absolute URI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Be registered with the authorization server.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Not include a fragment component.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            See <a
     *            href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth
     *            2.0 - Redirection Endpoint</a>.
     *            </p>
     *            <p>
     *            Amazon Cognito requires HTTPS over HTTP except for
     *            http://localhost for testing purposes only.
     *            </p>
     *            <p>
     *            App callback URLs such as myapp://example are also supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withCallbackURLs(String... callbackURLs) {
        if (getCallbackURLs() == null) {
            this.callbackURLs = new java.util.ArrayList<String>(callbackURLs.length);
        }
        for (String value : callbackURLs) {
            this.callbackURLs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param callbackURLs <p>
     *            A list of allowed redirect (callback) URLs for the identity
     *            providers.
     *            </p>
     *            <p>
     *            A redirect URI must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Be an absolute URI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Be registered with the authorization server.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Not include a fragment component.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            See <a
     *            href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth
     *            2.0 - Redirection Endpoint</a>.
     *            </p>
     *            <p>
     *            Amazon Cognito requires HTTPS over HTTP except for
     *            http://localhost for testing purposes only.
     *            </p>
     *            <p>
     *            App callback URLs such as myapp://example are also supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withCallbackURLs(java.util.Collection<String> callbackURLs) {
        setCallbackURLs(callbackURLs);
        return this;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     *
     * @return <p>
     *         A list of allowed logout URLs for the identity providers.
     *         </p>
     */
    public java.util.List<String> getLogoutURLs() {
        return logoutURLs;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     *
     * @param logoutURLs <p>
     *            A list of allowed logout URLs for the identity providers.
     *            </p>
     */
    public void setLogoutURLs(java.util.Collection<String> logoutURLs) {
        if (logoutURLs == null) {
            this.logoutURLs = null;
            return;
        }

        this.logoutURLs = new java.util.ArrayList<String>(logoutURLs);
    }

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logoutURLs <p>
     *            A list of allowed logout URLs for the identity providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withLogoutURLs(String... logoutURLs) {
        if (getLogoutURLs() == null) {
            this.logoutURLs = new java.util.ArrayList<String>(logoutURLs.length);
        }
        for (String value : logoutURLs) {
            this.logoutURLs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logoutURLs <p>
     *            A list of allowed logout URLs for the identity providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withLogoutURLs(java.util.Collection<String> logoutURLs) {
        setLogoutURLs(logoutURLs);
        return this;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The default redirect URI. Must be in the
     *         <code>CallbackURLs</code> list.
     *         </p>
     *         <p>
     *         A redirect URI must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Be an absolute URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be registered with the authorization server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not include a fragment component.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         See <a
     *         href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth
     *         2.0 - Redirection Endpoint</a>.
     *         </p>
     *         <p>
     *         Amazon Cognito requires HTTPS over HTTP except for
     *         http://localhost for testing purposes only.
     *         </p>
     *         <p>
     *         App callback URLs such as myapp://example are also supported.
     *         </p>
     */
    public String getDefaultRedirectURI() {
        return defaultRedirectURI;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param defaultRedirectURI <p>
     *            The default redirect URI. Must be in the
     *            <code>CallbackURLs</code> list.
     *            </p>
     *            <p>
     *            A redirect URI must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Be an absolute URI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Be registered with the authorization server.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Not include a fragment component.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            See <a
     *            href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth
     *            2.0 - Redirection Endpoint</a>.
     *            </p>
     *            <p>
     *            Amazon Cognito requires HTTPS over HTTP except for
     *            http://localhost for testing purposes only.
     *            </p>
     *            <p>
     *            App callback URLs such as myapp://example are also supported.
     *            </p>
     */
    public void setDefaultRedirectURI(String defaultRedirectURI) {
        this.defaultRedirectURI = defaultRedirectURI;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0
     * - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for
     * testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param defaultRedirectURI <p>
     *            The default redirect URI. Must be in the
     *            <code>CallbackURLs</code> list.
     *            </p>
     *            <p>
     *            A redirect URI must:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Be an absolute URI.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Be registered with the authorization server.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Not include a fragment component.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            See <a
     *            href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth
     *            2.0 - Redirection Endpoint</a>.
     *            </p>
     *            <p>
     *            Amazon Cognito requires HTTPS over HTTP except for
     *            http://localhost for testing purposes only.
     *            </p>
     *            <p>
     *            App callback URLs such as myapp://example are also supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withDefaultRedirectURI(String defaultRedirectURI) {
        this.defaultRedirectURI = defaultRedirectURI;
        return this;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an
     * authorization code as the response. This code can be exchanged for access
     * tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>implicit</code> to specify that the client should get the
     * access token (and, optionally, ID token, based on scopes) directly.
     * </p>
     * <p>
     * Set to <code>client_credentials</code> to specify that the client should
     * get the access token (and, optionally, ID token, based on scopes) from
     * the token endpoint using a combination of client and client_secret.
     * </p>
     *
     * @return <p>
     *         The allowed OAuth flows.
     *         </p>
     *         <p>
     *         Set to <code>code</code> to initiate a code grant flow, which
     *         provides an authorization code as the response. This code can be
     *         exchanged for access tokens with the token endpoint.
     *         </p>
     *         <p>
     *         Set to <code>implicit</code> to specify that the client should
     *         get the access token (and, optionally, ID token, based on scopes)
     *         directly.
     *         </p>
     *         <p>
     *         Set to <code>client_credentials</code> to specify that the client
     *         should get the access token (and, optionally, ID token, based on
     *         scopes) from the token endpoint using a combination of client and
     *         client_secret.
     *         </p>
     */
    public java.util.List<String> getAllowedOAuthFlows() {
        return allowedOAuthFlows;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an
     * authorization code as the response. This code can be exchanged for access
     * tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>implicit</code> to specify that the client should get the
     * access token (and, optionally, ID token, based on scopes) directly.
     * </p>
     * <p>
     * Set to <code>client_credentials</code> to specify that the client should
     * get the access token (and, optionally, ID token, based on scopes) from
     * the token endpoint using a combination of client and client_secret.
     * </p>
     *
     * @param allowedOAuthFlows <p>
     *            The allowed OAuth flows.
     *            </p>
     *            <p>
     *            Set to <code>code</code> to initiate a code grant flow, which
     *            provides an authorization code as the response. This code can
     *            be exchanged for access tokens with the token endpoint.
     *            </p>
     *            <p>
     *            Set to <code>implicit</code> to specify that the client should
     *            get the access token (and, optionally, ID token, based on
     *            scopes) directly.
     *            </p>
     *            <p>
     *            Set to <code>client_credentials</code> to specify that the
     *            client should get the access token (and, optionally, ID token,
     *            based on scopes) from the token endpoint using a combination
     *            of client and client_secret.
     *            </p>
     */
    public void setAllowedOAuthFlows(java.util.Collection<String> allowedOAuthFlows) {
        if (allowedOAuthFlows == null) {
            this.allowedOAuthFlows = null;
            return;
        }

        this.allowedOAuthFlows = new java.util.ArrayList<String>(allowedOAuthFlows);
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an
     * authorization code as the response. This code can be exchanged for access
     * tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>implicit</code> to specify that the client should get the
     * access token (and, optionally, ID token, based on scopes) directly.
     * </p>
     * <p>
     * Set to <code>client_credentials</code> to specify that the client should
     * get the access token (and, optionally, ID token, based on scopes) from
     * the token endpoint using a combination of client and client_secret.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthFlows <p>
     *            The allowed OAuth flows.
     *            </p>
     *            <p>
     *            Set to <code>code</code> to initiate a code grant flow, which
     *            provides an authorization code as the response. This code can
     *            be exchanged for access tokens with the token endpoint.
     *            </p>
     *            <p>
     *            Set to <code>implicit</code> to specify that the client should
     *            get the access token (and, optionally, ID token, based on
     *            scopes) directly.
     *            </p>
     *            <p>
     *            Set to <code>client_credentials</code> to specify that the
     *            client should get the access token (and, optionally, ID token,
     *            based on scopes) from the token endpoint using a combination
     *            of client and client_secret.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withAllowedOAuthFlows(String... allowedOAuthFlows) {
        if (getAllowedOAuthFlows() == null) {
            this.allowedOAuthFlows = new java.util.ArrayList<String>(allowedOAuthFlows.length);
        }
        for (String value : allowedOAuthFlows) {
            this.allowedOAuthFlows.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an
     * authorization code as the response. This code can be exchanged for access
     * tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>implicit</code> to specify that the client should get the
     * access token (and, optionally, ID token, based on scopes) directly.
     * </p>
     * <p>
     * Set to <code>client_credentials</code> to specify that the client should
     * get the access token (and, optionally, ID token, based on scopes) from
     * the token endpoint using a combination of client and client_secret.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthFlows <p>
     *            The allowed OAuth flows.
     *            </p>
     *            <p>
     *            Set to <code>code</code> to initiate a code grant flow, which
     *            provides an authorization code as the response. This code can
     *            be exchanged for access tokens with the token endpoint.
     *            </p>
     *            <p>
     *            Set to <code>implicit</code> to specify that the client should
     *            get the access token (and, optionally, ID token, based on
     *            scopes) directly.
     *            </p>
     *            <p>
     *            Set to <code>client_credentials</code> to specify that the
     *            client should get the access token (and, optionally, ID token,
     *            based on scopes) from the token endpoint using a combination
     *            of client and client_secret.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withAllowedOAuthFlows(
            java.util.Collection<String> allowedOAuthFlows) {
        setAllowedOAuthFlows(allowedOAuthFlows);
        return this;
    }

    /**
     * <p>
     * The allowed OAuth scopes. Possible values provided by OAuth are:
     * <code>phone</code>, <code>email</code>, <code>openid</code>, and
     * <code>profile</code>. Possible values provided by AWS are:
     * <code>aws.cognito.signin.user.admin</code>. Custom scopes created in
     * Resource Servers are also supported.
     * </p>
     *
     * @return <p>
     *         The allowed OAuth scopes. Possible values provided by OAuth are:
     *         <code>phone</code>, <code>email</code>, <code>openid</code>, and
     *         <code>profile</code>. Possible values provided by AWS are:
     *         <code>aws.cognito.signin.user.admin</code>. Custom scopes created
     *         in Resource Servers are also supported.
     *         </p>
     */
    public java.util.List<String> getAllowedOAuthScopes() {
        return allowedOAuthScopes;
    }

    /**
     * <p>
     * The allowed OAuth scopes. Possible values provided by OAuth are:
     * <code>phone</code>, <code>email</code>, <code>openid</code>, and
     * <code>profile</code>. Possible values provided by AWS are:
     * <code>aws.cognito.signin.user.admin</code>. Custom scopes created in
     * Resource Servers are also supported.
     * </p>
     *
     * @param allowedOAuthScopes <p>
     *            The allowed OAuth scopes. Possible values provided by OAuth
     *            are: <code>phone</code>, <code>email</code>,
     *            <code>openid</code>, and <code>profile</code>. Possible values
     *            provided by AWS are:
     *            <code>aws.cognito.signin.user.admin</code>. Custom scopes
     *            created in Resource Servers are also supported.
     *            </p>
     */
    public void setAllowedOAuthScopes(java.util.Collection<String> allowedOAuthScopes) {
        if (allowedOAuthScopes == null) {
            this.allowedOAuthScopes = null;
            return;
        }

        this.allowedOAuthScopes = new java.util.ArrayList<String>(allowedOAuthScopes);
    }

    /**
     * <p>
     * The allowed OAuth scopes. Possible values provided by OAuth are:
     * <code>phone</code>, <code>email</code>, <code>openid</code>, and
     * <code>profile</code>. Possible values provided by AWS are:
     * <code>aws.cognito.signin.user.admin</code>. Custom scopes created in
     * Resource Servers are also supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthScopes <p>
     *            The allowed OAuth scopes. Possible values provided by OAuth
     *            are: <code>phone</code>, <code>email</code>,
     *            <code>openid</code>, and <code>profile</code>. Possible values
     *            provided by AWS are:
     *            <code>aws.cognito.signin.user.admin</code>. Custom scopes
     *            created in Resource Servers are also supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withAllowedOAuthScopes(String... allowedOAuthScopes) {
        if (getAllowedOAuthScopes() == null) {
            this.allowedOAuthScopes = new java.util.ArrayList<String>(allowedOAuthScopes.length);
        }
        for (String value : allowedOAuthScopes) {
            this.allowedOAuthScopes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The allowed OAuth scopes. Possible values provided by OAuth are:
     * <code>phone</code>, <code>email</code>, <code>openid</code>, and
     * <code>profile</code>. Possible values provided by AWS are:
     * <code>aws.cognito.signin.user.admin</code>. Custom scopes created in
     * Resource Servers are also supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthScopes <p>
     *            The allowed OAuth scopes. Possible values provided by OAuth
     *            are: <code>phone</code>, <code>email</code>,
     *            <code>openid</code>, and <code>profile</code>. Possible values
     *            provided by AWS are:
     *            <code>aws.cognito.signin.user.admin</code>. Custom scopes
     *            created in Resource Servers are also supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withAllowedOAuthScopes(
            java.util.Collection<String> allowedOAuthScopes) {
        setAllowedOAuthScopes(allowedOAuthScopes);
        return this;
    }

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when
     * interacting with Cognito user pools.
     * </p>
     *
     * @return <p>
     *         Set to true if the client is allowed to follow the OAuth protocol
     *         when interacting with Cognito user pools.
     *         </p>
     */
    public Boolean isAllowedOAuthFlowsUserPoolClient() {
        return allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when
     * interacting with Cognito user pools.
     * </p>
     *
     * @return <p>
     *         Set to true if the client is allowed to follow the OAuth protocol
     *         when interacting with Cognito user pools.
     *         </p>
     */
    public Boolean getAllowedOAuthFlowsUserPoolClient() {
        return allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when
     * interacting with Cognito user pools.
     * </p>
     *
     * @param allowedOAuthFlowsUserPoolClient <p>
     *            Set to true if the client is allowed to follow the OAuth
     *            protocol when interacting with Cognito user pools.
     *            </p>
     */
    public void setAllowedOAuthFlowsUserPoolClient(Boolean allowedOAuthFlowsUserPoolClient) {
        this.allowedOAuthFlowsUserPoolClient = allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when
     * interacting with Cognito user pools.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthFlowsUserPoolClient <p>
     *            Set to true if the client is allowed to follow the OAuth
     *            protocol when interacting with Cognito user pools.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withAllowedOAuthFlowsUserPoolClient(
            Boolean allowedOAuthFlowsUserPoolClient) {
        this.allowedOAuthFlowsUserPoolClient = allowedOAuthFlowsUserPoolClient;
        return this;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for collecting metrics for
     * this user pool.
     * </p>
     * <note>
     * <p>
     * Cognito User Pools only supports sending events to Amazon Pinpoint
     * projects in the US East (N. Virginia) us-east-1 Region, regardless of the
     * region in which the user pool resides.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Pinpoint analytics configuration for collecting
     *         metrics for this user pool.
     *         </p>
     *         <note>
     *         <p>
     *         Cognito User Pools only supports sending events to Amazon
     *         Pinpoint projects in the US East (N. Virginia) us-east-1 Region,
     *         regardless of the region in which the user pool resides.
     *         </p>
     *         </note>
     */
    public AnalyticsConfigurationType getAnalyticsConfiguration() {
        return analyticsConfiguration;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for collecting metrics for
     * this user pool.
     * </p>
     * <note>
     * <p>
     * Cognito User Pools only supports sending events to Amazon Pinpoint
     * projects in the US East (N. Virginia) us-east-1 Region, regardless of the
     * region in which the user pool resides.
     * </p>
     * </note>
     *
     * @param analyticsConfiguration <p>
     *            The Amazon Pinpoint analytics configuration for collecting
     *            metrics for this user pool.
     *            </p>
     *            <note>
     *            <p>
     *            Cognito User Pools only supports sending events to Amazon
     *            Pinpoint projects in the US East (N. Virginia) us-east-1
     *            Region, regardless of the region in which the user pool
     *            resides.
     *            </p>
     *            </note>
     */
    public void setAnalyticsConfiguration(AnalyticsConfigurationType analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for collecting metrics for
     * this user pool.
     * </p>
     * <note>
     * <p>
     * Cognito User Pools only supports sending events to Amazon Pinpoint
     * projects in the US East (N. Virginia) us-east-1 Region, regardless of the
     * region in which the user pool resides.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsConfiguration <p>
     *            The Amazon Pinpoint analytics configuration for collecting
     *            metrics for this user pool.
     *            </p>
     *            <note>
     *            <p>
     *            Cognito User Pools only supports sending events to Amazon
     *            Pinpoint projects in the US East (N. Virginia) us-east-1
     *            Region, regardless of the region in which the user pool
     *            resides.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolClientRequest withAnalyticsConfiguration(
            AnalyticsConfigurationType analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
        return this;
    }

    /**
     * <p>
     * Use this setting to choose which errors and responses are returned by
     * Cognito APIs during authentication, account confirmation, and password
     * recovery when the user does not exist in the user pool. When set to
     * <code>ENABLED</code> and the user does not exist, authentication returns
     * an error indicating either the username or password was incorrect, and
     * account confirmation and password recovery return a response indicating a
     * code was sent to a simulated destination. When set to <code>LEGACY</code>
     * , those APIs will return a <code>UserNotFoundException</code> exception
     * if the user does not exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Cognito where
     * user existence related errors are not prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting affects the behavior of following APIs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>AdminInitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AdminRespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>InitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmSignUp</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResendConfirmationCode</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * After February 15th 2020, the value of
     * <code>PreventUserExistenceErrors</code> will default to
     * <code>ENABLED</code> for newly created user pool clients if no value is
     * provided.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @return <p>
     *         Use this setting to choose which errors and responses are
     *         returned by Cognito APIs during authentication, account
     *         confirmation, and password recovery when the user does not exist
     *         in the user pool. When set to <code>ENABLED</code> and the user
     *         does not exist, authentication returns an error indicating either
     *         the username or password was incorrect, and account confirmation
     *         and password recovery return a response indicating a code was
     *         sent to a simulated destination. When set to <code>LEGACY</code>,
     *         those APIs will return a <code>UserNotFoundException</code>
     *         exception if the user does not exist in the user pool.
     *         </p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - This prevents user existence-related
     *         errors.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LEGACY</code> - This represents the old behavior of Cognito
     *         where user existence related errors are not prevented.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This setting affects the behavior of following APIs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a>AdminInitiateAuth</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>AdminRespondToAuthChallenge</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>InitiateAuth</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>RespondToAuthChallenge</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ForgotPassword</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ConfirmForgotPassword</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ConfirmSignUp</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a>ResendConfirmationCode</a>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         After February 15th 2020, the value of
     *         <code>PreventUserExistenceErrors</code> will default to
     *         <code>ENABLED</code> for newly created user pool clients if no
     *         value is provided.
     *         </p>
     *         </note>
     * @see PreventUserExistenceErrorTypes
     */
    public String getPreventUserExistenceErrors() {
        return preventUserExistenceErrors;
    }

    /**
     * <p>
     * Use this setting to choose which errors and responses are returned by
     * Cognito APIs during authentication, account confirmation, and password
     * recovery when the user does not exist in the user pool. When set to
     * <code>ENABLED</code> and the user does not exist, authentication returns
     * an error indicating either the username or password was incorrect, and
     * account confirmation and password recovery return a response indicating a
     * code was sent to a simulated destination. When set to <code>LEGACY</code>
     * , those APIs will return a <code>UserNotFoundException</code> exception
     * if the user does not exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Cognito where
     * user existence related errors are not prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting affects the behavior of following APIs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>AdminInitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AdminRespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>InitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmSignUp</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResendConfirmationCode</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * After February 15th 2020, the value of
     * <code>PreventUserExistenceErrors</code> will default to
     * <code>ENABLED</code> for newly created user pool clients if no value is
     * provided.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @param preventUserExistenceErrors <p>
     *            Use this setting to choose which errors and responses are
     *            returned by Cognito APIs during authentication, account
     *            confirmation, and password recovery when the user does not
     *            exist in the user pool. When set to <code>ENABLED</code> and
     *            the user does not exist, authentication returns an error
     *            indicating either the username or password was incorrect, and
     *            account confirmation and password recovery return a response
     *            indicating a code was sent to a simulated destination. When
     *            set to <code>LEGACY</code>, those APIs will return a
     *            <code>UserNotFoundException</code> exception if the user does
     *            not exist in the user pool.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - This prevents user existence-related
     *            errors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LEGACY</code> - This represents the old behavior of
     *            Cognito where user existence related errors are not prevented.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This setting affects the behavior of following APIs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>AdminInitiateAuth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>AdminRespondToAuthChallenge</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>InitiateAuth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>RespondToAuthChallenge</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ForgotPassword</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ConfirmForgotPassword</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ConfirmSignUp</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ResendConfirmationCode</a>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            After February 15th 2020, the value of
     *            <code>PreventUserExistenceErrors</code> will default to
     *            <code>ENABLED</code> for newly created user pool clients if no
     *            value is provided.
     *            </p>
     *            </note>
     * @see PreventUserExistenceErrorTypes
     */
    public void setPreventUserExistenceErrors(String preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors;
    }

    /**
     * <p>
     * Use this setting to choose which errors and responses are returned by
     * Cognito APIs during authentication, account confirmation, and password
     * recovery when the user does not exist in the user pool. When set to
     * <code>ENABLED</code> and the user does not exist, authentication returns
     * an error indicating either the username or password was incorrect, and
     * account confirmation and password recovery return a response indicating a
     * code was sent to a simulated destination. When set to <code>LEGACY</code>
     * , those APIs will return a <code>UserNotFoundException</code> exception
     * if the user does not exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Cognito where
     * user existence related errors are not prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting affects the behavior of following APIs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>AdminInitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AdminRespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>InitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmSignUp</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResendConfirmationCode</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * After February 15th 2020, the value of
     * <code>PreventUserExistenceErrors</code> will default to
     * <code>ENABLED</code> for newly created user pool clients if no value is
     * provided.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @param preventUserExistenceErrors <p>
     *            Use this setting to choose which errors and responses are
     *            returned by Cognito APIs during authentication, account
     *            confirmation, and password recovery when the user does not
     *            exist in the user pool. When set to <code>ENABLED</code> and
     *            the user does not exist, authentication returns an error
     *            indicating either the username or password was incorrect, and
     *            account confirmation and password recovery return a response
     *            indicating a code was sent to a simulated destination. When
     *            set to <code>LEGACY</code>, those APIs will return a
     *            <code>UserNotFoundException</code> exception if the user does
     *            not exist in the user pool.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - This prevents user existence-related
     *            errors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LEGACY</code> - This represents the old behavior of
     *            Cognito where user existence related errors are not prevented.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This setting affects the behavior of following APIs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>AdminInitiateAuth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>AdminRespondToAuthChallenge</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>InitiateAuth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>RespondToAuthChallenge</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ForgotPassword</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ConfirmForgotPassword</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ConfirmSignUp</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ResendConfirmationCode</a>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            After February 15th 2020, the value of
     *            <code>PreventUserExistenceErrors</code> will default to
     *            <code>ENABLED</code> for newly created user pool clients if no
     *            value is provided.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PreventUserExistenceErrorTypes
     */
    public CreateUserPoolClientRequest withPreventUserExistenceErrors(
            String preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors;
        return this;
    }

    /**
     * <p>
     * Use this setting to choose which errors and responses are returned by
     * Cognito APIs during authentication, account confirmation, and password
     * recovery when the user does not exist in the user pool. When set to
     * <code>ENABLED</code> and the user does not exist, authentication returns
     * an error indicating either the username or password was incorrect, and
     * account confirmation and password recovery return a response indicating a
     * code was sent to a simulated destination. When set to <code>LEGACY</code>
     * , those APIs will return a <code>UserNotFoundException</code> exception
     * if the user does not exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Cognito where
     * user existence related errors are not prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting affects the behavior of following APIs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>AdminInitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AdminRespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>InitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmSignUp</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResendConfirmationCode</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * After February 15th 2020, the value of
     * <code>PreventUserExistenceErrors</code> will default to
     * <code>ENABLED</code> for newly created user pool clients if no value is
     * provided.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @param preventUserExistenceErrors <p>
     *            Use this setting to choose which errors and responses are
     *            returned by Cognito APIs during authentication, account
     *            confirmation, and password recovery when the user does not
     *            exist in the user pool. When set to <code>ENABLED</code> and
     *            the user does not exist, authentication returns an error
     *            indicating either the username or password was incorrect, and
     *            account confirmation and password recovery return a response
     *            indicating a code was sent to a simulated destination. When
     *            set to <code>LEGACY</code>, those APIs will return a
     *            <code>UserNotFoundException</code> exception if the user does
     *            not exist in the user pool.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - This prevents user existence-related
     *            errors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LEGACY</code> - This represents the old behavior of
     *            Cognito where user existence related errors are not prevented.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This setting affects the behavior of following APIs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>AdminInitiateAuth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>AdminRespondToAuthChallenge</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>InitiateAuth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>RespondToAuthChallenge</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ForgotPassword</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ConfirmForgotPassword</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ConfirmSignUp</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ResendConfirmationCode</a>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            After February 15th 2020, the value of
     *            <code>PreventUserExistenceErrors</code> will default to
     *            <code>ENABLED</code> for newly created user pool clients if no
     *            value is provided.
     *            </p>
     *            </note>
     * @see PreventUserExistenceErrorTypes
     */
    public void setPreventUserExistenceErrors(
            PreventUserExistenceErrorTypes preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors.toString();
    }

    /**
     * <p>
     * Use this setting to choose which errors and responses are returned by
     * Cognito APIs during authentication, account confirmation, and password
     * recovery when the user does not exist in the user pool. When set to
     * <code>ENABLED</code> and the user does not exist, authentication returns
     * an error indicating either the username or password was incorrect, and
     * account confirmation and password recovery return a response indicating a
     * code was sent to a simulated destination. When set to <code>LEGACY</code>
     * , those APIs will return a <code>UserNotFoundException</code> exception
     * if the user does not exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Cognito where
     * user existence related errors are not prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting affects the behavior of following APIs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>AdminInitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>AdminRespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>InitiateAuth</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>RespondToAuthChallenge</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmForgotPassword</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ConfirmSignUp</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ResendConfirmationCode</a>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * After February 15th 2020, the value of
     * <code>PreventUserExistenceErrors</code> will default to
     * <code>ENABLED</code> for newly created user pool clients if no value is
     * provided.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @param preventUserExistenceErrors <p>
     *            Use this setting to choose which errors and responses are
     *            returned by Cognito APIs during authentication, account
     *            confirmation, and password recovery when the user does not
     *            exist in the user pool. When set to <code>ENABLED</code> and
     *            the user does not exist, authentication returns an error
     *            indicating either the username or password was incorrect, and
     *            account confirmation and password recovery return a response
     *            indicating a code was sent to a simulated destination. When
     *            set to <code>LEGACY</code>, those APIs will return a
     *            <code>UserNotFoundException</code> exception if the user does
     *            not exist in the user pool.
     *            </p>
     *            <p>
     *            Valid values include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ENABLED</code> - This prevents user existence-related
     *            errors.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LEGACY</code> - This represents the old behavior of
     *            Cognito where user existence related errors are not prevented.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            This setting affects the behavior of following APIs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a>AdminInitiateAuth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>AdminRespondToAuthChallenge</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>InitiateAuth</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>RespondToAuthChallenge</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ForgotPassword</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ConfirmForgotPassword</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ConfirmSignUp</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a>ResendConfirmationCode</a>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            After February 15th 2020, the value of
     *            <code>PreventUserExistenceErrors</code> will default to
     *            <code>ENABLED</code> for newly created user pool clients if no
     *            value is provided.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PreventUserExistenceErrorTypes
     */
    public CreateUserPoolClientRequest withPreventUserExistenceErrors(
            PreventUserExistenceErrorTypes preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors.toString();
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getClientName() != null)
            sb.append("ClientName: " + getClientName() + ",");
        if (getGenerateSecret() != null)
            sb.append("GenerateSecret: " + getGenerateSecret() + ",");
        if (getRefreshTokenValidity() != null)
            sb.append("RefreshTokenValidity: " + getRefreshTokenValidity() + ",");
        if (getReadAttributes() != null)
            sb.append("ReadAttributes: " + getReadAttributes() + ",");
        if (getWriteAttributes() != null)
            sb.append("WriteAttributes: " + getWriteAttributes() + ",");
        if (getExplicitAuthFlows() != null)
            sb.append("ExplicitAuthFlows: " + getExplicitAuthFlows() + ",");
        if (getSupportedIdentityProviders() != null)
            sb.append("SupportedIdentityProviders: " + getSupportedIdentityProviders() + ",");
        if (getCallbackURLs() != null)
            sb.append("CallbackURLs: " + getCallbackURLs() + ",");
        if (getLogoutURLs() != null)
            sb.append("LogoutURLs: " + getLogoutURLs() + ",");
        if (getDefaultRedirectURI() != null)
            sb.append("DefaultRedirectURI: " + getDefaultRedirectURI() + ",");
        if (getAllowedOAuthFlows() != null)
            sb.append("AllowedOAuthFlows: " + getAllowedOAuthFlows() + ",");
        if (getAllowedOAuthScopes() != null)
            sb.append("AllowedOAuthScopes: " + getAllowedOAuthScopes() + ",");
        if (getAllowedOAuthFlowsUserPoolClient() != null)
            sb.append("AllowedOAuthFlowsUserPoolClient: " + getAllowedOAuthFlowsUserPoolClient()
                    + ",");
        if (getAnalyticsConfiguration() != null)
            sb.append("AnalyticsConfiguration: " + getAnalyticsConfiguration() + ",");
        if (getPreventUserExistenceErrors() != null)
            sb.append("PreventUserExistenceErrors: " + getPreventUserExistenceErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode
                + ((getGenerateSecret() == null) ? 0 : getGenerateSecret().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshTokenValidity() == null) ? 0 : getRefreshTokenValidity().hashCode());
        hashCode = prime * hashCode
                + ((getReadAttributes() == null) ? 0 : getReadAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getWriteAttributes() == null) ? 0 : getWriteAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getExplicitAuthFlows() == null) ? 0 : getExplicitAuthFlows().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedIdentityProviders() == null) ? 0 : getSupportedIdentityProviders()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCallbackURLs() == null) ? 0 : getCallbackURLs().hashCode());
        hashCode = prime * hashCode + ((getLogoutURLs() == null) ? 0 : getLogoutURLs().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultRedirectURI() == null) ? 0 : getDefaultRedirectURI().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedOAuthFlows() == null) ? 0 : getAllowedOAuthFlows().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedOAuthScopes() == null) ? 0 : getAllowedOAuthScopes().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowedOAuthFlowsUserPoolClient() == null) ? 0
                        : getAllowedOAuthFlowsUserPoolClient().hashCode());
        hashCode = prime
                * hashCode
                + ((getAnalyticsConfiguration() == null) ? 0 : getAnalyticsConfiguration()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPreventUserExistenceErrors() == null) ? 0 : getPreventUserExistenceErrors()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolClientRequest == false)
            return false;
        CreateUserPoolClientRequest other = (CreateUserPoolClientRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null
                && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getGenerateSecret() == null ^ this.getGenerateSecret() == null)
            return false;
        if (other.getGenerateSecret() != null
                && other.getGenerateSecret().equals(this.getGenerateSecret()) == false)
            return false;
        if (other.getRefreshTokenValidity() == null ^ this.getRefreshTokenValidity() == null)
            return false;
        if (other.getRefreshTokenValidity() != null
                && other.getRefreshTokenValidity().equals(this.getRefreshTokenValidity()) == false)
            return false;
        if (other.getReadAttributes() == null ^ this.getReadAttributes() == null)
            return false;
        if (other.getReadAttributes() != null
                && other.getReadAttributes().equals(this.getReadAttributes()) == false)
            return false;
        if (other.getWriteAttributes() == null ^ this.getWriteAttributes() == null)
            return false;
        if (other.getWriteAttributes() != null
                && other.getWriteAttributes().equals(this.getWriteAttributes()) == false)
            return false;
        if (other.getExplicitAuthFlows() == null ^ this.getExplicitAuthFlows() == null)
            return false;
        if (other.getExplicitAuthFlows() != null
                && other.getExplicitAuthFlows().equals(this.getExplicitAuthFlows()) == false)
            return false;
        if (other.getSupportedIdentityProviders() == null
                ^ this.getSupportedIdentityProviders() == null)
            return false;
        if (other.getSupportedIdentityProviders() != null
                && other.getSupportedIdentityProviders().equals(
                        this.getSupportedIdentityProviders()) == false)
            return false;
        if (other.getCallbackURLs() == null ^ this.getCallbackURLs() == null)
            return false;
        if (other.getCallbackURLs() != null
                && other.getCallbackURLs().equals(this.getCallbackURLs()) == false)
            return false;
        if (other.getLogoutURLs() == null ^ this.getLogoutURLs() == null)
            return false;
        if (other.getLogoutURLs() != null
                && other.getLogoutURLs().equals(this.getLogoutURLs()) == false)
            return false;
        if (other.getDefaultRedirectURI() == null ^ this.getDefaultRedirectURI() == null)
            return false;
        if (other.getDefaultRedirectURI() != null
                && other.getDefaultRedirectURI().equals(this.getDefaultRedirectURI()) == false)
            return false;
        if (other.getAllowedOAuthFlows() == null ^ this.getAllowedOAuthFlows() == null)
            return false;
        if (other.getAllowedOAuthFlows() != null
                && other.getAllowedOAuthFlows().equals(this.getAllowedOAuthFlows()) == false)
            return false;
        if (other.getAllowedOAuthScopes() == null ^ this.getAllowedOAuthScopes() == null)
            return false;
        if (other.getAllowedOAuthScopes() != null
                && other.getAllowedOAuthScopes().equals(this.getAllowedOAuthScopes()) == false)
            return false;
        if (other.getAllowedOAuthFlowsUserPoolClient() == null
                ^ this.getAllowedOAuthFlowsUserPoolClient() == null)
            return false;
        if (other.getAllowedOAuthFlowsUserPoolClient() != null
                && other.getAllowedOAuthFlowsUserPoolClient().equals(
                        this.getAllowedOAuthFlowsUserPoolClient()) == false)
            return false;
        if (other.getAnalyticsConfiguration() == null ^ this.getAnalyticsConfiguration() == null)
            return false;
        if (other.getAnalyticsConfiguration() != null
                && other.getAnalyticsConfiguration().equals(this.getAnalyticsConfiguration()) == false)
            return false;
        if (other.getPreventUserExistenceErrors() == null
                ^ this.getPreventUserExistenceErrors() == null)
            return false;
        if (other.getPreventUserExistenceErrors() != null
                && other.getPreventUserExistenceErrors().equals(
                        this.getPreventUserExistenceErrors()) == false)
            return false;
        return true;
    }
}
