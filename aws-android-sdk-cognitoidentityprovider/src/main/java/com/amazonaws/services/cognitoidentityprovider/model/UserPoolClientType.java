/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains information about a user pool client.
 * </p>
 */
public class UserPoolClientType implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String clientName;

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     */
    private String clientSecret;

    /**
     * <p>
     * The date and time, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format, when the item was modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The date and time, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format, when the item was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The refresh token time limit. After this limit expires, your user can't
     * use their refresh token. To specify the time unit for
     * <code>RefreshTokenValidity</code> as <code>seconds</code>,
     * <code>minutes</code>, <code>hours</code>, or <code>days</code>, set a
     * <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>RefreshTokenValidity</code> as
     * <code>10</code> and <code>TokenValidityUnits</code> as <code>days</code>,
     * your user can refresh their session and retrieve new access and ID tokens
     * for 10 days.
     * </p>
     * <p>
     * The default time unit for <code>RefreshTokenValidity</code> in an API
     * request is days. You can't set <code>RefreshTokenValidity</code> to 0. If
     * you do, Amazon Cognito overrides the value with the default value of 30
     * days. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your refresh tokens are valid for 30 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 315360000<br/>
     */
    private Integer refreshTokenValidity;

    /**
     * <p>
     * The access token time limit. After this limit expires, your user can't
     * use their access token. To specify the time unit for
     * <code>AccessTokenValidity</code> as <code>seconds</code>,
     * <code>minutes</code>, <code>hours</code>, or <code>days</code>, set a
     * <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>AccessTokenValidity</code> to
     * <code>10</code> and <code>TokenValidityUnits</code> to <code>hours</code>
     * , your user can authorize access with their access token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API
     * request is hours. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your access tokens are valid for one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     */
    private Integer accessTokenValidity;

    /**
     * <p>
     * The ID token time limit. After this limit expires, your user can't use
     * their ID token. To specify the time unit for <code>IdTokenValidity</code>
     * as <code>seconds</code>, <code>minutes</code>, <code>hours</code>, or
     * <code>days</code>, set a <code>TokenValidityUnits</code> value in your
     * API request.
     * </p>
     * <p>
     * For example, when you set <code>IdTokenValidity</code> as <code>10</code>
     * and <code>TokenValidityUnits</code> as <code>hours</code>, your user can
     * authenticate their session with their ID token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>IdTokenValidity</code> in an API request
     * is hours. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your ID tokens are valid for one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     */
    private Integer idTokenValidity;

    /**
     * <p>
     * The time units used to specify the token validity times of each token
     * type: ID, access, and refresh.
     * </p>
     */
    private TokenValidityUnitsType tokenValidityUnits;

    /**
     * <p>
     * The Read-only attributes.
     * </p>
     */
    private java.util.List<String> readAttributes;

    /**
     * <p>
     * The writeable attributes.
     * </p>
     */
    private java.util.List<String> writeAttributes;

    /**
     * <p>
     * The authentication flows that you want your user pool client to support.
     * For each app client in your user pool, you can sign in your users with
     * any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom
     * authentication process that you define with Lambda functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your
     * user client supports <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     * <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, your app passes a user name and password to Amazon
     * Cognito in the request, instead of using the Secure Remote Password (SRP)
     * protocol to securely transmit the password.
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
     * authentication. In this flow, Amazon Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values
     * <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     * <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     * <code>ExplicitAuthFlows</code> values to user pool clients at the same
     * time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     */
    private java.util.List<String> explicitAuthFlows;

    /**
     * <p>
     * A list of provider names for the IdPs that this client supports. The
     * following are supported: <code>COGNITO</code>, <code>Facebook</code>,
     * <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC
     * providers.
     * </p>
     */
    private java.util.List<String> supportedIdentityProviders;

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the IdPs.
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
     * A list of allowed logout URLs for the IdPs.
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
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the
     * response. This code can be exchanged for access tokens with the
     * <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes)
     * directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint
     * directly to a non-person user using a combination of the client ID and
     * client secret.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<String> allowedOAuthFlows;

    /**
     * <p>
     * The OAuth scopes that your app client supports. Possible values that
     * OAuth provides are <code>phone</code>, <code>email</code>,
     * <code>openid</code>, and <code>profile</code>. Possible values that
     * Amazon Web Services provides are
     * <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports
     * custom scopes that you create in Resource Servers.
     * </p>
     */
    private java.util.List<String> allowedOAuthScopes;

    /**
     * <p>
     * Set to <code>true</code> to use OAuth 2.0 features in your user pool app
     * client.
     * </p>
     * <p>
     * <code>AllowedOAuthFlowsUserPoolClient</code> must be <code>true</code>
     * before you can configure the following features in your app client.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CallBackURLs</code>: Callback URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LogoutURLs</code>: Sign-out redirect URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthFlows</code>: Support for authorization code, implicit,
     * and client credentials OAuth 2.0 grants.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To use OAuth 2.0 features, configure one of these features in the Amazon
     * Cognito console or set <code>AllowedOAuthFlowsUserPoolClient</code> to
     * <code>true</code> in a <code>CreateUserPoolClient</code> or
     * <code>UpdateUserPoolClient</code> API request. If you don't set a value
     * for <code>AllowedOAuthFlowsUserPoolClient</code> in a request with the
     * CLI or SDKs, it defaults to <code>false</code>.
     * </p>
     */
    private Boolean allowedOAuthFlowsUserPoolClient;

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for the user pool client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito user pools only support sending events to Amazon Pinpoint
     * projects in the US East (N. Virginia) us-east-1 Region, regardless of the
     * Region where the user pool resides.
     * </p>
     * </note>
     */
    private AnalyticsConfigurationType analyticsConfiguration;

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during
     * authentication, account confirmation, and password recovery when the user
     * doesn't exist in the user pool. When set to <code>ENABLED</code> and the
     * user doesn't exist, authentication returns an error indicating either the
     * username or password was incorrect. Account confirmation and password
     * recovery return a response indicating a code was sent to a simulated
     * destination. When set to <code>LEGACY</code>, those APIs return a
     * <code>UserNotFoundException</code> exception if the user doesn't exist in
     * the user pool.
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
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito
     * where user existence related errors aren't prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     */
    private String preventUserExistenceErrors;

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client.
     * When you create a new user pool client, token revocation is activated by
     * default. For more information about revoking tokens, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     */
    private Boolean enableTokenRevocation;

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true,
     * Amazon Cognito accepts an <code>IpAddress</code> value that you send in
     * the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon
     * Cognito advanced security for risk analysis. You can send
     * <code>UserContextData</code> when you sign in Amazon Cognito native users
     * with the <code>InitiateAuth</code> and
     * <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you
     * can't send your user's source IP address to Amazon Cognito advanced
     * security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect
     * whether you can send a source IP address in a <code>ContextData</code>
     * parameter with the authenticated API operations
     * <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate
     * <code>EnablePropagateAdditionalUserContextData</code> in an app client
     * that has a client secret. For more information about propagation of user
     * context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     */
    private Boolean enablePropagateAdditionalUserContextData;

    /**
     * <p>
     * Amazon Cognito creates a session token for each API request in an
     * authentication flow. <code>AuthSessionValidity</code> is the duration, in
     * minutes, of that session token. Your user pool native user must respond
     * to each authentication challenge before the session expires.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3 - 15<br/>
     */
    private Integer authSessionValidity;

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool client.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool client.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool client.
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
     *            The user pool ID for the user pool client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         The client name from the user pool request of the client type.
     *         </p>
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param clientName <p>
     *            The client name from the user pool request of the client type.
     *            </p>
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
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
     *            The client name from the user pool request of the client type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The ID of the client associated with the user pool.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The ID of the client associated with the user pool.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientId <p>
     *            The ID of the client associated with the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @return <p>
     *         The client secret from the user pool request of the client type.
     *         </p>
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientSecret <p>
     *            The client secret from the user pool request of the client
     *            type.
     *            </p>
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+]+<br/>
     *
     * @param clientSecret <p>
     *            The client secret from the user pool request of the client
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format, when the item was modified.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format, when the item was modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format, when the item was modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date and time, in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format, when the item was modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format, when the item was modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date and time, in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format, when the item was modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format, when the item was created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *         8601</a> format, when the item was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format, when the item was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time, in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format, when the item was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     * 8601</a> format, when the item was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time, in <a href=
     *            "https://www.iso.org/iso-8601-date-and-time-format.html">ISO
     *            8601</a> format, when the item was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The refresh token time limit. After this limit expires, your user can't
     * use their refresh token. To specify the time unit for
     * <code>RefreshTokenValidity</code> as <code>seconds</code>,
     * <code>minutes</code>, <code>hours</code>, or <code>days</code>, set a
     * <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>RefreshTokenValidity</code> as
     * <code>10</code> and <code>TokenValidityUnits</code> as <code>days</code>,
     * your user can refresh their session and retrieve new access and ID tokens
     * for 10 days.
     * </p>
     * <p>
     * The default time unit for <code>RefreshTokenValidity</code> in an API
     * request is days. You can't set <code>RefreshTokenValidity</code> to 0. If
     * you do, Amazon Cognito overrides the value with the default value of 30
     * days. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your refresh tokens are valid for 30 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 315360000<br/>
     *
     * @return <p>
     *         The refresh token time limit. After this limit expires, your user
     *         can't use their refresh token. To specify the time unit for
     *         <code>RefreshTokenValidity</code> as <code>seconds</code>,
     *         <code>minutes</code>, <code>hours</code>, or <code>days</code>,
     *         set a <code>TokenValidityUnits</code> value in your API request.
     *         </p>
     *         <p>
     *         For example, when you set <code>RefreshTokenValidity</code> as
     *         <code>10</code> and <code>TokenValidityUnits</code> as
     *         <code>days</code>, your user can refresh their session and
     *         retrieve new access and ID tokens for 10 days.
     *         </p>
     *         <p>
     *         The default time unit for <code>RefreshTokenValidity</code> in an
     *         API request is days. You can't set
     *         <code>RefreshTokenValidity</code> to 0. If you do, Amazon Cognito
     *         overrides the value with the default value of 30 days. <i>Valid
     *         range</i> is displayed below in seconds.
     *         </p>
     *         <p>
     *         If you don't specify otherwise in the configuration of your app
     *         client, your refresh tokens are valid for 30 days.
     *         </p>
     */
    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    /**
     * <p>
     * The refresh token time limit. After this limit expires, your user can't
     * use their refresh token. To specify the time unit for
     * <code>RefreshTokenValidity</code> as <code>seconds</code>,
     * <code>minutes</code>, <code>hours</code>, or <code>days</code>, set a
     * <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>RefreshTokenValidity</code> as
     * <code>10</code> and <code>TokenValidityUnits</code> as <code>days</code>,
     * your user can refresh their session and retrieve new access and ID tokens
     * for 10 days.
     * </p>
     * <p>
     * The default time unit for <code>RefreshTokenValidity</code> in an API
     * request is days. You can't set <code>RefreshTokenValidity</code> to 0. If
     * you do, Amazon Cognito overrides the value with the default value of 30
     * days. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your refresh tokens are valid for 30 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 315360000<br/>
     *
     * @param refreshTokenValidity <p>
     *            The refresh token time limit. After this limit expires, your
     *            user can't use their refresh token. To specify the time unit
     *            for <code>RefreshTokenValidity</code> as <code>seconds</code>,
     *            <code>minutes</code>, <code>hours</code>, or <code>days</code>
     *            , set a <code>TokenValidityUnits</code> value in your API
     *            request.
     *            </p>
     *            <p>
     *            For example, when you set <code>RefreshTokenValidity</code> as
     *            <code>10</code> and <code>TokenValidityUnits</code> as
     *            <code>days</code>, your user can refresh their session and
     *            retrieve new access and ID tokens for 10 days.
     *            </p>
     *            <p>
     *            The default time unit for <code>RefreshTokenValidity</code> in
     *            an API request is days. You can't set
     *            <code>RefreshTokenValidity</code> to 0. If you do, Amazon
     *            Cognito overrides the value with the default value of 30 days.
     *            <i>Valid range</i> is displayed below in seconds.
     *            </p>
     *            <p>
     *            If you don't specify otherwise in the configuration of your
     *            app client, your refresh tokens are valid for 30 days.
     *            </p>
     */
    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    /**
     * <p>
     * The refresh token time limit. After this limit expires, your user can't
     * use their refresh token. To specify the time unit for
     * <code>RefreshTokenValidity</code> as <code>seconds</code>,
     * <code>minutes</code>, <code>hours</code>, or <code>days</code>, set a
     * <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>RefreshTokenValidity</code> as
     * <code>10</code> and <code>TokenValidityUnits</code> as <code>days</code>,
     * your user can refresh their session and retrieve new access and ID tokens
     * for 10 days.
     * </p>
     * <p>
     * The default time unit for <code>RefreshTokenValidity</code> in an API
     * request is days. You can't set <code>RefreshTokenValidity</code> to 0. If
     * you do, Amazon Cognito overrides the value with the default value of 30
     * days. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your refresh tokens are valid for 30 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 315360000<br/>
     *
     * @param refreshTokenValidity <p>
     *            The refresh token time limit. After this limit expires, your
     *            user can't use their refresh token. To specify the time unit
     *            for <code>RefreshTokenValidity</code> as <code>seconds</code>,
     *            <code>minutes</code>, <code>hours</code>, or <code>days</code>
     *            , set a <code>TokenValidityUnits</code> value in your API
     *            request.
     *            </p>
     *            <p>
     *            For example, when you set <code>RefreshTokenValidity</code> as
     *            <code>10</code> and <code>TokenValidityUnits</code> as
     *            <code>days</code>, your user can refresh their session and
     *            retrieve new access and ID tokens for 10 days.
     *            </p>
     *            <p>
     *            The default time unit for <code>RefreshTokenValidity</code> in
     *            an API request is days. You can't set
     *            <code>RefreshTokenValidity</code> to 0. If you do, Amazon
     *            Cognito overrides the value with the default value of 30 days.
     *            <i>Valid range</i> is displayed below in seconds.
     *            </p>
     *            <p>
     *            If you don't specify otherwise in the configuration of your
     *            app client, your refresh tokens are valid for 30 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
        return this;
    }

    /**
     * <p>
     * The access token time limit. After this limit expires, your user can't
     * use their access token. To specify the time unit for
     * <code>AccessTokenValidity</code> as <code>seconds</code>,
     * <code>minutes</code>, <code>hours</code>, or <code>days</code>, set a
     * <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>AccessTokenValidity</code> to
     * <code>10</code> and <code>TokenValidityUnits</code> to <code>hours</code>
     * , your user can authorize access with their access token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API
     * request is hours. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your access tokens are valid for one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @return <p>
     *         The access token time limit. After this limit expires, your user
     *         can't use their access token. To specify the time unit for
     *         <code>AccessTokenValidity</code> as <code>seconds</code>,
     *         <code>minutes</code>, <code>hours</code>, or <code>days</code>,
     *         set a <code>TokenValidityUnits</code> value in your API request.
     *         </p>
     *         <p>
     *         For example, when you set <code>AccessTokenValidity</code> to
     *         <code>10</code> and <code>TokenValidityUnits</code> to
     *         <code>hours</code>, your user can authorize access with their
     *         access token for 10 hours.
     *         </p>
     *         <p>
     *         The default time unit for <code>AccessTokenValidity</code> in an
     *         API request is hours. <i>Valid range</i> is displayed below in
     *         seconds.
     *         </p>
     *         <p>
     *         If you don't specify otherwise in the configuration of your app
     *         client, your access tokens are valid for one hour.
     *         </p>
     */
    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    /**
     * <p>
     * The access token time limit. After this limit expires, your user can't
     * use their access token. To specify the time unit for
     * <code>AccessTokenValidity</code> as <code>seconds</code>,
     * <code>minutes</code>, <code>hours</code>, or <code>days</code>, set a
     * <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>AccessTokenValidity</code> to
     * <code>10</code> and <code>TokenValidityUnits</code> to <code>hours</code>
     * , your user can authorize access with their access token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API
     * request is hours. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your access tokens are valid for one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param accessTokenValidity <p>
     *            The access token time limit. After this limit expires, your
     *            user can't use their access token. To specify the time unit
     *            for <code>AccessTokenValidity</code> as <code>seconds</code>,
     *            <code>minutes</code>, <code>hours</code>, or <code>days</code>
     *            , set a <code>TokenValidityUnits</code> value in your API
     *            request.
     *            </p>
     *            <p>
     *            For example, when you set <code>AccessTokenValidity</code> to
     *            <code>10</code> and <code>TokenValidityUnits</code> to
     *            <code>hours</code>, your user can authorize access with their
     *            access token for 10 hours.
     *            </p>
     *            <p>
     *            The default time unit for <code>AccessTokenValidity</code> in
     *            an API request is hours. <i>Valid range</i> is displayed below
     *            in seconds.
     *            </p>
     *            <p>
     *            If you don't specify otherwise in the configuration of your
     *            app client, your access tokens are valid for one hour.
     *            </p>
     */
    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    /**
     * <p>
     * The access token time limit. After this limit expires, your user can't
     * use their access token. To specify the time unit for
     * <code>AccessTokenValidity</code> as <code>seconds</code>,
     * <code>minutes</code>, <code>hours</code>, or <code>days</code>, set a
     * <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>AccessTokenValidity</code> to
     * <code>10</code> and <code>TokenValidityUnits</code> to <code>hours</code>
     * , your user can authorize access with their access token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API
     * request is hours. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your access tokens are valid for one hour.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param accessTokenValidity <p>
     *            The access token time limit. After this limit expires, your
     *            user can't use their access token. To specify the time unit
     *            for <code>AccessTokenValidity</code> as <code>seconds</code>,
     *            <code>minutes</code>, <code>hours</code>, or <code>days</code>
     *            , set a <code>TokenValidityUnits</code> value in your API
     *            request.
     *            </p>
     *            <p>
     *            For example, when you set <code>AccessTokenValidity</code> to
     *            <code>10</code> and <code>TokenValidityUnits</code> to
     *            <code>hours</code>, your user can authorize access with their
     *            access token for 10 hours.
     *            </p>
     *            <p>
     *            The default time unit for <code>AccessTokenValidity</code> in
     *            an API request is hours. <i>Valid range</i> is displayed below
     *            in seconds.
     *            </p>
     *            <p>
     *            If you don't specify otherwise in the configuration of your
     *            app client, your access tokens are valid for one hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
        return this;
    }

    /**
     * <p>
     * The ID token time limit. After this limit expires, your user can't use
     * their ID token. To specify the time unit for <code>IdTokenValidity</code>
     * as <code>seconds</code>, <code>minutes</code>, <code>hours</code>, or
     * <code>days</code>, set a <code>TokenValidityUnits</code> value in your
     * API request.
     * </p>
     * <p>
     * For example, when you set <code>IdTokenValidity</code> as <code>10</code>
     * and <code>TokenValidityUnits</code> as <code>hours</code>, your user can
     * authenticate their session with their ID token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>IdTokenValidity</code> in an API request
     * is hours. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your ID tokens are valid for one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @return <p>
     *         The ID token time limit. After this limit expires, your user
     *         can't use their ID token. To specify the time unit for
     *         <code>IdTokenValidity</code> as <code>seconds</code>,
     *         <code>minutes</code>, <code>hours</code>, or <code>days</code>,
     *         set a <code>TokenValidityUnits</code> value in your API request.
     *         </p>
     *         <p>
     *         For example, when you set <code>IdTokenValidity</code> as
     *         <code>10</code> and <code>TokenValidityUnits</code> as
     *         <code>hours</code>, your user can authenticate their session with
     *         their ID token for 10 hours.
     *         </p>
     *         <p>
     *         The default time unit for <code>IdTokenValidity</code> in an API
     *         request is hours. <i>Valid range</i> is displayed below in
     *         seconds.
     *         </p>
     *         <p>
     *         If you don't specify otherwise in the configuration of your app
     *         client, your ID tokens are valid for one hour.
     *         </p>
     */
    public Integer getIdTokenValidity() {
        return idTokenValidity;
    }

    /**
     * <p>
     * The ID token time limit. After this limit expires, your user can't use
     * their ID token. To specify the time unit for <code>IdTokenValidity</code>
     * as <code>seconds</code>, <code>minutes</code>, <code>hours</code>, or
     * <code>days</code>, set a <code>TokenValidityUnits</code> value in your
     * API request.
     * </p>
     * <p>
     * For example, when you set <code>IdTokenValidity</code> as <code>10</code>
     * and <code>TokenValidityUnits</code> as <code>hours</code>, your user can
     * authenticate their session with their ID token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>IdTokenValidity</code> in an API request
     * is hours. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your ID tokens are valid for one hour.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param idTokenValidity <p>
     *            The ID token time limit. After this limit expires, your user
     *            can't use their ID token. To specify the time unit for
     *            <code>IdTokenValidity</code> as <code>seconds</code>,
     *            <code>minutes</code>, <code>hours</code>, or <code>days</code>
     *            , set a <code>TokenValidityUnits</code> value in your API
     *            request.
     *            </p>
     *            <p>
     *            For example, when you set <code>IdTokenValidity</code> as
     *            <code>10</code> and <code>TokenValidityUnits</code> as
     *            <code>hours</code>, your user can authenticate their session
     *            with their ID token for 10 hours.
     *            </p>
     *            <p>
     *            The default time unit for <code>IdTokenValidity</code> in an
     *            API request is hours. <i>Valid range</i> is displayed below in
     *            seconds.
     *            </p>
     *            <p>
     *            If you don't specify otherwise in the configuration of your
     *            app client, your ID tokens are valid for one hour.
     *            </p>
     */
    public void setIdTokenValidity(Integer idTokenValidity) {
        this.idTokenValidity = idTokenValidity;
    }

    /**
     * <p>
     * The ID token time limit. After this limit expires, your user can't use
     * their ID token. To specify the time unit for <code>IdTokenValidity</code>
     * as <code>seconds</code>, <code>minutes</code>, <code>hours</code>, or
     * <code>days</code>, set a <code>TokenValidityUnits</code> value in your
     * API request.
     * </p>
     * <p>
     * For example, when you set <code>IdTokenValidity</code> as <code>10</code>
     * and <code>TokenValidityUnits</code> as <code>hours</code>, your user can
     * authenticate their session with their ID token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>IdTokenValidity</code> in an API request
     * is hours. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client,
     * your ID tokens are valid for one hour.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 86400<br/>
     *
     * @param idTokenValidity <p>
     *            The ID token time limit. After this limit expires, your user
     *            can't use their ID token. To specify the time unit for
     *            <code>IdTokenValidity</code> as <code>seconds</code>,
     *            <code>minutes</code>, <code>hours</code>, or <code>days</code>
     *            , set a <code>TokenValidityUnits</code> value in your API
     *            request.
     *            </p>
     *            <p>
     *            For example, when you set <code>IdTokenValidity</code> as
     *            <code>10</code> and <code>TokenValidityUnits</code> as
     *            <code>hours</code>, your user can authenticate their session
     *            with their ID token for 10 hours.
     *            </p>
     *            <p>
     *            The default time unit for <code>IdTokenValidity</code> in an
     *            API request is hours. <i>Valid range</i> is displayed below in
     *            seconds.
     *            </p>
     *            <p>
     *            If you don't specify otherwise in the configuration of your
     *            app client, your ID tokens are valid for one hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withIdTokenValidity(Integer idTokenValidity) {
        this.idTokenValidity = idTokenValidity;
        return this;
    }

    /**
     * <p>
     * The time units used to specify the token validity times of each token
     * type: ID, access, and refresh.
     * </p>
     *
     * @return <p>
     *         The time units used to specify the token validity times of each
     *         token type: ID, access, and refresh.
     *         </p>
     */
    public TokenValidityUnitsType getTokenValidityUnits() {
        return tokenValidityUnits;
    }

    /**
     * <p>
     * The time units used to specify the token validity times of each token
     * type: ID, access, and refresh.
     * </p>
     *
     * @param tokenValidityUnits <p>
     *            The time units used to specify the token validity times of
     *            each token type: ID, access, and refresh.
     *            </p>
     */
    public void setTokenValidityUnits(TokenValidityUnitsType tokenValidityUnits) {
        this.tokenValidityUnits = tokenValidityUnits;
    }

    /**
     * <p>
     * The time units used to specify the token validity times of each token
     * type: ID, access, and refresh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tokenValidityUnits <p>
     *            The time units used to specify the token validity times of
     *            each token type: ID, access, and refresh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withTokenValidityUnits(TokenValidityUnitsType tokenValidityUnits) {
        this.tokenValidityUnits = tokenValidityUnits;
        return this;
    }

    /**
     * <p>
     * The Read-only attributes.
     * </p>
     *
     * @return <p>
     *         The Read-only attributes.
     *         </p>
     */
    public java.util.List<String> getReadAttributes() {
        return readAttributes;
    }

    /**
     * <p>
     * The Read-only attributes.
     * </p>
     *
     * @param readAttributes <p>
     *            The Read-only attributes.
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
     * The Read-only attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readAttributes <p>
     *            The Read-only attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withReadAttributes(String... readAttributes) {
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
     * The Read-only attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readAttributes <p>
     *            The Read-only attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withReadAttributes(java.util.Collection<String> readAttributes) {
        setReadAttributes(readAttributes);
        return this;
    }

    /**
     * <p>
     * The writeable attributes.
     * </p>
     *
     * @return <p>
     *         The writeable attributes.
     *         </p>
     */
    public java.util.List<String> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * <p>
     * The writeable attributes.
     * </p>
     *
     * @param writeAttributes <p>
     *            The writeable attributes.
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
     * The writeable attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeAttributes <p>
     *            The writeable attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withWriteAttributes(String... writeAttributes) {
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
     * The writeable attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeAttributes <p>
     *            The writeable attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withWriteAttributes(java.util.Collection<String> writeAttributes) {
        setWriteAttributes(writeAttributes);
        return this;
    }

    /**
     * <p>
     * The authentication flows that you want your user pool client to support.
     * For each app client in your user pool, you can sign in your users with
     * any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom
     * authentication process that you define with Lambda functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your
     * user client supports <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     * <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, your app passes a user name and password to Amazon
     * Cognito in the request, instead of using the Secure Remote Password (SRP)
     * protocol to securely transmit the password.
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
     * authentication. In this flow, Amazon Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values
     * <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     * <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     * <code>ExplicitAuthFlows</code> values to user pool clients at the same
     * time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     *
     * @return <p>
     *         The authentication flows that you want your user pool client to
     *         support. For each app client in your user pool, you can sign in
     *         your users with any combination of one or more flows, including
     *         with a user name and Secure Remote Password (SRP), a user name
     *         and password, or a custom authentication process that you define
     *         with Lambda functions.
     *         </p>
     *         <note>
     *         <p>
     *         If you don't specify a value for <code>ExplicitAuthFlows</code>,
     *         your user client supports <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     *         <code>ALLOW_USER_SRP_AUTH</code>, and
     *         <code>ALLOW_CUSTOM_AUTH</code>.
     *         </p>
     *         </note>
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
     *         flow, your app passes a user name and password to Amazon Cognito
     *         in the request, instead of using the Secure Remote Password (SRP)
     *         protocol to securely transmit the password.
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
     *         authentication. In this flow, Amazon Cognito receives the
     *         password in the request instead of using the SRP protocol to
     *         verify passwords.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based
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
     *         <p>
     *         In some environments, you will see the values
     *         <code>ADMIN_NO_SRP_AUTH</code>,
     *         <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     *         <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *         <code>ExplicitAuthFlows</code> values to user pool clients at the
     *         same time as values that begin with <code>ALLOW_</code>, like
     *         <code>ALLOW_USER_SRP_AUTH</code>.
     *         </p>
     */
    public java.util.List<String> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * <p>
     * The authentication flows that you want your user pool client to support.
     * For each app client in your user pool, you can sign in your users with
     * any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom
     * authentication process that you define with Lambda functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your
     * user client supports <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     * <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, your app passes a user name and password to Amazon
     * Cognito in the request, instead of using the Secure Remote Password (SRP)
     * protocol to securely transmit the password.
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
     * authentication. In this flow, Amazon Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values
     * <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     * <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     * <code>ExplicitAuthFlows</code> values to user pool clients at the same
     * time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     *
     * @param explicitAuthFlows <p>
     *            The authentication flows that you want your user pool client
     *            to support. For each app client in your user pool, you can
     *            sign in your users with any combination of one or more flows,
     *            including with a user name and Secure Remote Password (SRP), a
     *            user name and password, or a custom authentication process
     *            that you define with Lambda functions.
     *            </p>
     *            <note>
     *            <p>
     *            If you don't specify a value for
     *            <code>ExplicitAuthFlows</code>, your user client supports
     *            <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     *            <code>ALLOW_USER_SRP_AUTH</code>, and
     *            <code>ALLOW_CUSTOM_AUTH</code>.
     *            </p>
     *            </note>
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
     *            authentication flow, your app passes a user name and password
     *            to Amazon Cognito in the request, instead of using the Secure
     *            Remote Password (SRP) protocol to securely transmit the
     *            password.
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
     *            password-based authentication. In this flow, Amazon Cognito
     *            receives the password in the request instead of using the SRP
     *            protocol to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based
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
     *            <p>
     *            In some environments, you will see the values
     *            <code>ADMIN_NO_SRP_AUTH</code>,
     *            <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     *            <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *            <code>ExplicitAuthFlows</code> values to user pool clients at
     *            the same time as values that begin with <code>ALLOW_</code>,
     *            like <code>ALLOW_USER_SRP_AUTH</code>.
     *            </p>
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
     * The authentication flows that you want your user pool client to support.
     * For each app client in your user pool, you can sign in your users with
     * any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom
     * authentication process that you define with Lambda functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your
     * user client supports <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     * <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, your app passes a user name and password to Amazon
     * Cognito in the request, instead of using the Secure Remote Password (SRP)
     * protocol to securely transmit the password.
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
     * authentication. In this flow, Amazon Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values
     * <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     * <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     * <code>ExplicitAuthFlows</code> values to user pool clients at the same
     * time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param explicitAuthFlows <p>
     *            The authentication flows that you want your user pool client
     *            to support. For each app client in your user pool, you can
     *            sign in your users with any combination of one or more flows,
     *            including with a user name and Secure Remote Password (SRP), a
     *            user name and password, or a custom authentication process
     *            that you define with Lambda functions.
     *            </p>
     *            <note>
     *            <p>
     *            If you don't specify a value for
     *            <code>ExplicitAuthFlows</code>, your user client supports
     *            <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     *            <code>ALLOW_USER_SRP_AUTH</code>, and
     *            <code>ALLOW_CUSTOM_AUTH</code>.
     *            </p>
     *            </note>
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
     *            authentication flow, your app passes a user name and password
     *            to Amazon Cognito in the request, instead of using the Secure
     *            Remote Password (SRP) protocol to securely transmit the
     *            password.
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
     *            password-based authentication. In this flow, Amazon Cognito
     *            receives the password in the request instead of using the SRP
     *            protocol to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based
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
     *            <p>
     *            In some environments, you will see the values
     *            <code>ADMIN_NO_SRP_AUTH</code>,
     *            <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     *            <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *            <code>ExplicitAuthFlows</code> values to user pool clients at
     *            the same time as values that begin with <code>ALLOW_</code>,
     *            like <code>ALLOW_USER_SRP_AUTH</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withExplicitAuthFlows(String... explicitAuthFlows) {
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
     * The authentication flows that you want your user pool client to support.
     * For each app client in your user pool, you can sign in your users with
     * any combination of one or more flows, including with a user name and
     * Secure Remote Password (SRP), a user name and password, or a custom
     * authentication process that you define with Lambda functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your
     * user client supports <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     * <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user
     * password authentication flow <code>ADMIN_USER_PASSWORD_AUTH</code>. This
     * setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With this
     * authentication flow, your app passes a user name and password to Amazon
     * Cognito in the request, instead of using the Secure Remote Password (SRP)
     * protocol to securely transmit the password.
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
     * authentication. In this flow, Amazon Cognito receives the password in the
     * request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values
     * <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     * <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     * <code>ExplicitAuthFlows</code> values to user pool clients at the same
     * time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param explicitAuthFlows <p>
     *            The authentication flows that you want your user pool client
     *            to support. For each app client in your user pool, you can
     *            sign in your users with any combination of one or more flows,
     *            including with a user name and Secure Remote Password (SRP), a
     *            user name and password, or a custom authentication process
     *            that you define with Lambda functions.
     *            </p>
     *            <note>
     *            <p>
     *            If you don't specify a value for
     *            <code>ExplicitAuthFlows</code>, your user client supports
     *            <code>ALLOW_REFRESH_TOKEN_AUTH</code>,
     *            <code>ALLOW_USER_SRP_AUTH</code>, and
     *            <code>ALLOW_CUSTOM_AUTH</code>.
     *            </p>
     *            </note>
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
     *            authentication flow, your app passes a user name and password
     *            to Amazon Cognito in the request, instead of using the Secure
     *            Remote Password (SRP) protocol to securely transmit the
     *            password.
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
     *            password-based authentication. In this flow, Amazon Cognito
     *            receives the password in the request instead of using the SRP
     *            protocol to verify passwords.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based
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
     *            <p>
     *            In some environments, you will see the values
     *            <code>ADMIN_NO_SRP_AUTH</code>,
     *            <code>CUSTOM_AUTH_FLOW_ONLY</code>, or
     *            <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *            <code>ExplicitAuthFlows</code> values to user pool clients at
     *            the same time as values that begin with <code>ALLOW_</code>,
     *            like <code>ALLOW_USER_SRP_AUTH</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        setExplicitAuthFlows(explicitAuthFlows);
        return this;
    }

    /**
     * <p>
     * A list of provider names for the IdPs that this client supports. The
     * following are supported: <code>COGNITO</code>, <code>Facebook</code>,
     * <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC
     * providers.
     * </p>
     *
     * @return <p>
     *         A list of provider names for the IdPs that this client supports.
     *         The following are supported: <code>COGNITO</code>,
     *         <code>Facebook</code>, <code>Google</code>,
     *         <code>SignInWithApple</code>, <code>LoginWithAmazon</code>, and
     *         the names of your own SAML and OIDC providers.
     *         </p>
     */
    public java.util.List<String> getSupportedIdentityProviders() {
        return supportedIdentityProviders;
    }

    /**
     * <p>
     * A list of provider names for the IdPs that this client supports. The
     * following are supported: <code>COGNITO</code>, <code>Facebook</code>,
     * <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC
     * providers.
     * </p>
     *
     * @param supportedIdentityProviders <p>
     *            A list of provider names for the IdPs that this client
     *            supports. The following are supported: <code>COGNITO</code>,
     *            <code>Facebook</code>, <code>Google</code>,
     *            <code>SignInWithApple</code>, <code>LoginWithAmazon</code>,
     *            and the names of your own SAML and OIDC providers.
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
     * A list of provider names for the IdPs that this client supports. The
     * following are supported: <code>COGNITO</code>, <code>Facebook</code>,
     * <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC
     * providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedIdentityProviders <p>
     *            A list of provider names for the IdPs that this client
     *            supports. The following are supported: <code>COGNITO</code>,
     *            <code>Facebook</code>, <code>Google</code>,
     *            <code>SignInWithApple</code>, <code>LoginWithAmazon</code>,
     *            and the names of your own SAML and OIDC providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withSupportedIdentityProviders(String... supportedIdentityProviders) {
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
     * A list of provider names for the IdPs that this client supports. The
     * following are supported: <code>COGNITO</code>, <code>Facebook</code>,
     * <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC
     * providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedIdentityProviders <p>
     *            A list of provider names for the IdPs that this client
     *            supports. The following are supported: <code>COGNITO</code>,
     *            <code>Facebook</code>, <code>Google</code>,
     *            <code>SignInWithApple</code>, <code>LoginWithAmazon</code>,
     *            and the names of your own SAML and OIDC providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withSupportedIdentityProviders(
            java.util.Collection<String> supportedIdentityProviders) {
        setSupportedIdentityProviders(supportedIdentityProviders);
        return this;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the IdPs.
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
     *         A list of allowed redirect (callback) URLs for the IdPs.
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
     * A list of allowed redirect (callback) URLs for the IdPs.
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
     *            A list of allowed redirect (callback) URLs for the IdPs.
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
     * A list of allowed redirect (callback) URLs for the IdPs.
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
     *            A list of allowed redirect (callback) URLs for the IdPs.
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
    public UserPoolClientType withCallbackURLs(String... callbackURLs) {
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
     * A list of allowed redirect (callback) URLs for the IdPs.
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
     *            A list of allowed redirect (callback) URLs for the IdPs.
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
    public UserPoolClientType withCallbackURLs(java.util.Collection<String> callbackURLs) {
        setCallbackURLs(callbackURLs);
        return this;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the IdPs.
     * </p>
     *
     * @return <p>
     *         A list of allowed logout URLs for the IdPs.
     *         </p>
     */
    public java.util.List<String> getLogoutURLs() {
        return logoutURLs;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the IdPs.
     * </p>
     *
     * @param logoutURLs <p>
     *            A list of allowed logout URLs for the IdPs.
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
     * A list of allowed logout URLs for the IdPs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logoutURLs <p>
     *            A list of allowed logout URLs for the IdPs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withLogoutURLs(String... logoutURLs) {
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
     * A list of allowed logout URLs for the IdPs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logoutURLs <p>
     *            A list of allowed logout URLs for the IdPs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withLogoutURLs(java.util.Collection<String> logoutURLs) {
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
    public UserPoolClientType withDefaultRedirectURI(String defaultRedirectURI) {
        this.defaultRedirectURI = defaultRedirectURI;
        return this;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the
     * response. This code can be exchanged for access tokens with the
     * <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes)
     * directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint
     * directly to a non-person user using a combination of the client ID and
     * client secret.
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The allowed OAuth flows.
     *         </p>
     *         <dl>
     *         <dt>code</dt>
     *         <dd>
     *         <p>
     *         Use a code grant flow, which provides an authorization code as
     *         the response. This code can be exchanged for access tokens with
     *         the <code>/oauth2/token</code> endpoint.
     *         </p>
     *         </dd>
     *         <dt>implicit</dt>
     *         <dd>
     *         <p>
     *         Issue the access token (and, optionally, ID token, based on
     *         scopes) directly to your user.
     *         </p>
     *         </dd>
     *         <dt>client_credentials</dt>
     *         <dd>
     *         <p>
     *         Issue the access token from the <code>/oauth2/token</code>
     *         endpoint directly to a non-person user using a combination of the
     *         client ID and client secret.
     *         </p>
     *         </dd>
     *         </dl>
     */
    public java.util.List<String> getAllowedOAuthFlows() {
        return allowedOAuthFlows;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the
     * response. This code can be exchanged for access tokens with the
     * <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes)
     * directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint
     * directly to a non-person user using a combination of the client ID and
     * client secret.
     * </p>
     * </dd>
     * </dl>
     *
     * @param allowedOAuthFlows <p>
     *            The allowed OAuth flows.
     *            </p>
     *            <dl>
     *            <dt>code</dt>
     *            <dd>
     *            <p>
     *            Use a code grant flow, which provides an authorization code as
     *            the response. This code can be exchanged for access tokens
     *            with the <code>/oauth2/token</code> endpoint.
     *            </p>
     *            </dd>
     *            <dt>implicit</dt>
     *            <dd>
     *            <p>
     *            Issue the access token (and, optionally, ID token, based on
     *            scopes) directly to your user.
     *            </p>
     *            </dd>
     *            <dt>client_credentials</dt>
     *            <dd>
     *            <p>
     *            Issue the access token from the <code>/oauth2/token</code>
     *            endpoint directly to a non-person user using a combination of
     *            the client ID and client secret.
     *            </p>
     *            </dd>
     *            </dl>
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
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the
     * response. This code can be exchanged for access tokens with the
     * <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes)
     * directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint
     * directly to a non-person user using a combination of the client ID and
     * client secret.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthFlows <p>
     *            The allowed OAuth flows.
     *            </p>
     *            <dl>
     *            <dt>code</dt>
     *            <dd>
     *            <p>
     *            Use a code grant flow, which provides an authorization code as
     *            the response. This code can be exchanged for access tokens
     *            with the <code>/oauth2/token</code> endpoint.
     *            </p>
     *            </dd>
     *            <dt>implicit</dt>
     *            <dd>
     *            <p>
     *            Issue the access token (and, optionally, ID token, based on
     *            scopes) directly to your user.
     *            </p>
     *            </dd>
     *            <dt>client_credentials</dt>
     *            <dd>
     *            <p>
     *            Issue the access token from the <code>/oauth2/token</code>
     *            endpoint directly to a non-person user using a combination of
     *            the client ID and client secret.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withAllowedOAuthFlows(String... allowedOAuthFlows) {
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
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the
     * response. This code can be exchanged for access tokens with the
     * <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes)
     * directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint
     * directly to a non-person user using a combination of the client ID and
     * client secret.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthFlows <p>
     *            The allowed OAuth flows.
     *            </p>
     *            <dl>
     *            <dt>code</dt>
     *            <dd>
     *            <p>
     *            Use a code grant flow, which provides an authorization code as
     *            the response. This code can be exchanged for access tokens
     *            with the <code>/oauth2/token</code> endpoint.
     *            </p>
     *            </dd>
     *            <dt>implicit</dt>
     *            <dd>
     *            <p>
     *            Issue the access token (and, optionally, ID token, based on
     *            scopes) directly to your user.
     *            </p>
     *            </dd>
     *            <dt>client_credentials</dt>
     *            <dd>
     *            <p>
     *            Issue the access token from the <code>/oauth2/token</code>
     *            endpoint directly to a non-person user using a combination of
     *            the client ID and client secret.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withAllowedOAuthFlows(java.util.Collection<String> allowedOAuthFlows) {
        setAllowedOAuthFlows(allowedOAuthFlows);
        return this;
    }

    /**
     * <p>
     * The OAuth scopes that your app client supports. Possible values that
     * OAuth provides are <code>phone</code>, <code>email</code>,
     * <code>openid</code>, and <code>profile</code>. Possible values that
     * Amazon Web Services provides are
     * <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports
     * custom scopes that you create in Resource Servers.
     * </p>
     *
     * @return <p>
     *         The OAuth scopes that your app client supports. Possible values
     *         that OAuth provides are <code>phone</code>, <code>email</code>,
     *         <code>openid</code>, and <code>profile</code>. Possible values
     *         that Amazon Web Services provides are
     *         <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also
     *         supports custom scopes that you create in Resource Servers.
     *         </p>
     */
    public java.util.List<String> getAllowedOAuthScopes() {
        return allowedOAuthScopes;
    }

    /**
     * <p>
     * The OAuth scopes that your app client supports. Possible values that
     * OAuth provides are <code>phone</code>, <code>email</code>,
     * <code>openid</code>, and <code>profile</code>. Possible values that
     * Amazon Web Services provides are
     * <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports
     * custom scopes that you create in Resource Servers.
     * </p>
     *
     * @param allowedOAuthScopes <p>
     *            The OAuth scopes that your app client supports. Possible
     *            values that OAuth provides are <code>phone</code>,
     *            <code>email</code>, <code>openid</code>, and
     *            <code>profile</code>. Possible values that Amazon Web Services
     *            provides are <code>aws.cognito.signin.user.admin</code>.
     *            Amazon Cognito also supports custom scopes that you create in
     *            Resource Servers.
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
     * The OAuth scopes that your app client supports. Possible values that
     * OAuth provides are <code>phone</code>, <code>email</code>,
     * <code>openid</code>, and <code>profile</code>. Possible values that
     * Amazon Web Services provides are
     * <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports
     * custom scopes that you create in Resource Servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthScopes <p>
     *            The OAuth scopes that your app client supports. Possible
     *            values that OAuth provides are <code>phone</code>,
     *            <code>email</code>, <code>openid</code>, and
     *            <code>profile</code>. Possible values that Amazon Web Services
     *            provides are <code>aws.cognito.signin.user.admin</code>.
     *            Amazon Cognito also supports custom scopes that you create in
     *            Resource Servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withAllowedOAuthScopes(String... allowedOAuthScopes) {
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
     * The OAuth scopes that your app client supports. Possible values that
     * OAuth provides are <code>phone</code>, <code>email</code>,
     * <code>openid</code>, and <code>profile</code>. Possible values that
     * Amazon Web Services provides are
     * <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports
     * custom scopes that you create in Resource Servers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthScopes <p>
     *            The OAuth scopes that your app client supports. Possible
     *            values that OAuth provides are <code>phone</code>,
     *            <code>email</code>, <code>openid</code>, and
     *            <code>profile</code>. Possible values that Amazon Web Services
     *            provides are <code>aws.cognito.signin.user.admin</code>.
     *            Amazon Cognito also supports custom scopes that you create in
     *            Resource Servers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withAllowedOAuthScopes(java.util.Collection<String> allowedOAuthScopes) {
        setAllowedOAuthScopes(allowedOAuthScopes);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to use OAuth 2.0 features in your user pool app
     * client.
     * </p>
     * <p>
     * <code>AllowedOAuthFlowsUserPoolClient</code> must be <code>true</code>
     * before you can configure the following features in your app client.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CallBackURLs</code>: Callback URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LogoutURLs</code>: Sign-out redirect URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthFlows</code>: Support for authorization code, implicit,
     * and client credentials OAuth 2.0 grants.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To use OAuth 2.0 features, configure one of these features in the Amazon
     * Cognito console or set <code>AllowedOAuthFlowsUserPoolClient</code> to
     * <code>true</code> in a <code>CreateUserPoolClient</code> or
     * <code>UpdateUserPoolClient</code> API request. If you don't set a value
     * for <code>AllowedOAuthFlowsUserPoolClient</code> in a request with the
     * CLI or SDKs, it defaults to <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to use OAuth 2.0 features in your user
     *         pool app client.
     *         </p>
     *         <p>
     *         <code>AllowedOAuthFlowsUserPoolClient</code> must be
     *         <code>true</code> before you can configure the following features
     *         in your app client.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CallBackURLs</code>: Callback URLs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LogoutURLs</code>: Sign-out redirect URLs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AllowedOAuthFlows</code>: Support for authorization code,
     *         implicit, and client credentials OAuth 2.0 grants.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To use OAuth 2.0 features, configure one of these features in the
     *         Amazon Cognito console or set
     *         <code>AllowedOAuthFlowsUserPoolClient</code> to <code>true</code>
     *         in a <code>CreateUserPoolClient</code> or
     *         <code>UpdateUserPoolClient</code> API request. If you don't set a
     *         value for <code>AllowedOAuthFlowsUserPoolClient</code> in a
     *         request with the CLI or SDKs, it defaults to <code>false</code>.
     *         </p>
     */
    public Boolean isAllowedOAuthFlowsUserPoolClient() {
        return allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to <code>true</code> to use OAuth 2.0 features in your user pool app
     * client.
     * </p>
     * <p>
     * <code>AllowedOAuthFlowsUserPoolClient</code> must be <code>true</code>
     * before you can configure the following features in your app client.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CallBackURLs</code>: Callback URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LogoutURLs</code>: Sign-out redirect URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthFlows</code>: Support for authorization code, implicit,
     * and client credentials OAuth 2.0 grants.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To use OAuth 2.0 features, configure one of these features in the Amazon
     * Cognito console or set <code>AllowedOAuthFlowsUserPoolClient</code> to
     * <code>true</code> in a <code>CreateUserPoolClient</code> or
     * <code>UpdateUserPoolClient</code> API request. If you don't set a value
     * for <code>AllowedOAuthFlowsUserPoolClient</code> in a request with the
     * CLI or SDKs, it defaults to <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to use OAuth 2.0 features in your user
     *         pool app client.
     *         </p>
     *         <p>
     *         <code>AllowedOAuthFlowsUserPoolClient</code> must be
     *         <code>true</code> before you can configure the following features
     *         in your app client.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CallBackURLs</code>: Callback URLs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LogoutURLs</code>: Sign-out redirect URLs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AllowedOAuthFlows</code>: Support for authorization code,
     *         implicit, and client credentials OAuth 2.0 grants.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To use OAuth 2.0 features, configure one of these features in the
     *         Amazon Cognito console or set
     *         <code>AllowedOAuthFlowsUserPoolClient</code> to <code>true</code>
     *         in a <code>CreateUserPoolClient</code> or
     *         <code>UpdateUserPoolClient</code> API request. If you don't set a
     *         value for <code>AllowedOAuthFlowsUserPoolClient</code> in a
     *         request with the CLI or SDKs, it defaults to <code>false</code>.
     *         </p>
     */
    public Boolean getAllowedOAuthFlowsUserPoolClient() {
        return allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to <code>true</code> to use OAuth 2.0 features in your user pool app
     * client.
     * </p>
     * <p>
     * <code>AllowedOAuthFlowsUserPoolClient</code> must be <code>true</code>
     * before you can configure the following features in your app client.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CallBackURLs</code>: Callback URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LogoutURLs</code>: Sign-out redirect URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthFlows</code>: Support for authorization code, implicit,
     * and client credentials OAuth 2.0 grants.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To use OAuth 2.0 features, configure one of these features in the Amazon
     * Cognito console or set <code>AllowedOAuthFlowsUserPoolClient</code> to
     * <code>true</code> in a <code>CreateUserPoolClient</code> or
     * <code>UpdateUserPoolClient</code> API request. If you don't set a value
     * for <code>AllowedOAuthFlowsUserPoolClient</code> in a request with the
     * CLI or SDKs, it defaults to <code>false</code>.
     * </p>
     *
     * @param allowedOAuthFlowsUserPoolClient <p>
     *            Set to <code>true</code> to use OAuth 2.0 features in your
     *            user pool app client.
     *            </p>
     *            <p>
     *            <code>AllowedOAuthFlowsUserPoolClient</code> must be
     *            <code>true</code> before you can configure the following
     *            features in your app client.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CallBackURLs</code>: Callback URLs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LogoutURLs</code>: Sign-out redirect URLs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AllowedOAuthFlows</code>: Support for authorization
     *            code, implicit, and client credentials OAuth 2.0 grants.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To use OAuth 2.0 features, configure one of these features in
     *            the Amazon Cognito console or set
     *            <code>AllowedOAuthFlowsUserPoolClient</code> to
     *            <code>true</code> in a <code>CreateUserPoolClient</code> or
     *            <code>UpdateUserPoolClient</code> API request. If you don't
     *            set a value for <code>AllowedOAuthFlowsUserPoolClient</code>
     *            in a request with the CLI or SDKs, it defaults to
     *            <code>false</code>.
     *            </p>
     */
    public void setAllowedOAuthFlowsUserPoolClient(Boolean allowedOAuthFlowsUserPoolClient) {
        this.allowedOAuthFlowsUserPoolClient = allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to <code>true</code> to use OAuth 2.0 features in your user pool app
     * client.
     * </p>
     * <p>
     * <code>AllowedOAuthFlowsUserPoolClient</code> must be <code>true</code>
     * before you can configure the following features in your app client.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CallBackURLs</code>: Callback URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LogoutURLs</code>: Sign-out redirect URLs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllowedOAuthFlows</code>: Support for authorization code, implicit,
     * and client credentials OAuth 2.0 grants.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To use OAuth 2.0 features, configure one of these features in the Amazon
     * Cognito console or set <code>AllowedOAuthFlowsUserPoolClient</code> to
     * <code>true</code> in a <code>CreateUserPoolClient</code> or
     * <code>UpdateUserPoolClient</code> API request. If you don't set a value
     * for <code>AllowedOAuthFlowsUserPoolClient</code> in a request with the
     * CLI or SDKs, it defaults to <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedOAuthFlowsUserPoolClient <p>
     *            Set to <code>true</code> to use OAuth 2.0 features in your
     *            user pool app client.
     *            </p>
     *            <p>
     *            <code>AllowedOAuthFlowsUserPoolClient</code> must be
     *            <code>true</code> before you can configure the following
     *            features in your app client.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>CallBackURLs</code>: Callback URLs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>LogoutURLs</code>: Sign-out redirect URLs.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AllowedOAuthScopes</code>: OAuth 2.0 scopes.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AllowedOAuthFlows</code>: Support for authorization
     *            code, implicit, and client credentials OAuth 2.0 grants.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To use OAuth 2.0 features, configure one of these features in
     *            the Amazon Cognito console or set
     *            <code>AllowedOAuthFlowsUserPoolClient</code> to
     *            <code>true</code> in a <code>CreateUserPoolClient</code> or
     *            <code>UpdateUserPoolClient</code> API request. If you don't
     *            set a value for <code>AllowedOAuthFlowsUserPoolClient</code>
     *            in a request with the CLI or SDKs, it defaults to
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withAllowedOAuthFlowsUserPoolClient(
            Boolean allowedOAuthFlowsUserPoolClient) {
        this.allowedOAuthFlowsUserPoolClient = allowedOAuthFlowsUserPoolClient;
        return this;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for the user pool client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito user pools only support sending events to Amazon Pinpoint
     * projects in the US East (N. Virginia) us-east-1 Region, regardless of the
     * Region where the user pool resides.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Amazon Pinpoint analytics configuration for the user pool
     *         client.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon Cognito user pools only support sending events to Amazon
     *         Pinpoint projects in the US East (N. Virginia) us-east-1 Region,
     *         regardless of the Region where the user pool resides.
     *         </p>
     *         </note>
     */
    public AnalyticsConfigurationType getAnalyticsConfiguration() {
        return analyticsConfiguration;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for the user pool client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito user pools only support sending events to Amazon Pinpoint
     * projects in the US East (N. Virginia) us-east-1 Region, regardless of the
     * Region where the user pool resides.
     * </p>
     * </note>
     *
     * @param analyticsConfiguration <p>
     *            The Amazon Pinpoint analytics configuration for the user pool
     *            client.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Cognito user pools only support sending events to
     *            Amazon Pinpoint projects in the US East (N. Virginia)
     *            us-east-1 Region, regardless of the Region where the user pool
     *            resides.
     *            </p>
     *            </note>
     */
    public void setAnalyticsConfiguration(AnalyticsConfigurationType analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for the user pool client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito user pools only support sending events to Amazon Pinpoint
     * projects in the US East (N. Virginia) us-east-1 Region, regardless of the
     * Region where the user pool resides.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsConfiguration <p>
     *            The Amazon Pinpoint analytics configuration for the user pool
     *            client.
     *            </p>
     *            <note>
     *            <p>
     *            Amazon Cognito user pools only support sending events to
     *            Amazon Pinpoint projects in the US East (N. Virginia)
     *            us-east-1 Region, regardless of the Region where the user pool
     *            resides.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withAnalyticsConfiguration(
            AnalyticsConfigurationType analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
        return this;
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during
     * authentication, account confirmation, and password recovery when the user
     * doesn't exist in the user pool. When set to <code>ENABLED</code> and the
     * user doesn't exist, authentication returns an error indicating either the
     * username or password was incorrect. Account confirmation and password
     * recovery return a response indicating a code was sent to a simulated
     * destination. When set to <code>LEGACY</code>, those APIs return a
     * <code>UserNotFoundException</code> exception if the user doesn't exist in
     * the user pool.
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
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito
     * where user existence related errors aren't prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @return <p>
     *         Errors and responses that you want Amazon Cognito APIs to return
     *         during authentication, account confirmation, and password
     *         recovery when the user doesn't exist in the user pool. When set
     *         to <code>ENABLED</code> and the user doesn't exist,
     *         authentication returns an error indicating either the username or
     *         password was incorrect. Account confirmation and password
     *         recovery return a response indicating a code was sent to a
     *         simulated destination. When set to <code>LEGACY</code>, those
     *         APIs return a <code>UserNotFoundException</code> exception if the
     *         user doesn't exist in the user pool.
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
     *         <code>LEGACY</code> - This represents the old behavior of Amazon
     *         Cognito where user existence related errors aren't prevented.
     *         </p>
     *         </li>
     *         </ul>
     * @see PreventUserExistenceErrorTypes
     */
    public String getPreventUserExistenceErrors() {
        return preventUserExistenceErrors;
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during
     * authentication, account confirmation, and password recovery when the user
     * doesn't exist in the user pool. When set to <code>ENABLED</code> and the
     * user doesn't exist, authentication returns an error indicating either the
     * username or password was incorrect. Account confirmation and password
     * recovery return a response indicating a code was sent to a simulated
     * destination. When set to <code>LEGACY</code>, those APIs return a
     * <code>UserNotFoundException</code> exception if the user doesn't exist in
     * the user pool.
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
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito
     * where user existence related errors aren't prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @param preventUserExistenceErrors <p>
     *            Errors and responses that you want Amazon Cognito APIs to
     *            return during authentication, account confirmation, and
     *            password recovery when the user doesn't exist in the user
     *            pool. When set to <code>ENABLED</code> and the user doesn't
     *            exist, authentication returns an error indicating either the
     *            username or password was incorrect. Account confirmation and
     *            password recovery return a response indicating a code was sent
     *            to a simulated destination. When set to <code>LEGACY</code>,
     *            those APIs return a <code>UserNotFoundException</code>
     *            exception if the user doesn't exist in the user pool.
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
     *            Amazon Cognito where user existence related errors aren't
     *            prevented.
     *            </p>
     *            </li>
     *            </ul>
     * @see PreventUserExistenceErrorTypes
     */
    public void setPreventUserExistenceErrors(String preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors;
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during
     * authentication, account confirmation, and password recovery when the user
     * doesn't exist in the user pool. When set to <code>ENABLED</code> and the
     * user doesn't exist, authentication returns an error indicating either the
     * username or password was incorrect. Account confirmation and password
     * recovery return a response indicating a code was sent to a simulated
     * destination. When set to <code>LEGACY</code>, those APIs return a
     * <code>UserNotFoundException</code> exception if the user doesn't exist in
     * the user pool.
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
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito
     * where user existence related errors aren't prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @param preventUserExistenceErrors <p>
     *            Errors and responses that you want Amazon Cognito APIs to
     *            return during authentication, account confirmation, and
     *            password recovery when the user doesn't exist in the user
     *            pool. When set to <code>ENABLED</code> and the user doesn't
     *            exist, authentication returns an error indicating either the
     *            username or password was incorrect. Account confirmation and
     *            password recovery return a response indicating a code was sent
     *            to a simulated destination. When set to <code>LEGACY</code>,
     *            those APIs return a <code>UserNotFoundException</code>
     *            exception if the user doesn't exist in the user pool.
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
     *            Amazon Cognito where user existence related errors aren't
     *            prevented.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PreventUserExistenceErrorTypes
     */
    public UserPoolClientType withPreventUserExistenceErrors(String preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors;
        return this;
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during
     * authentication, account confirmation, and password recovery when the user
     * doesn't exist in the user pool. When set to <code>ENABLED</code> and the
     * user doesn't exist, authentication returns an error indicating either the
     * username or password was incorrect. Account confirmation and password
     * recovery return a response indicating a code was sent to a simulated
     * destination. When set to <code>LEGACY</code>, those APIs return a
     * <code>UserNotFoundException</code> exception if the user doesn't exist in
     * the user pool.
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
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito
     * where user existence related errors aren't prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @param preventUserExistenceErrors <p>
     *            Errors and responses that you want Amazon Cognito APIs to
     *            return during authentication, account confirmation, and
     *            password recovery when the user doesn't exist in the user
     *            pool. When set to <code>ENABLED</code> and the user doesn't
     *            exist, authentication returns an error indicating either the
     *            username or password was incorrect. Account confirmation and
     *            password recovery return a response indicating a code was sent
     *            to a simulated destination. When set to <code>LEGACY</code>,
     *            those APIs return a <code>UserNotFoundException</code>
     *            exception if the user doesn't exist in the user pool.
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
     *            Amazon Cognito where user existence related errors aren't
     *            prevented.
     *            </p>
     *            </li>
     *            </ul>
     * @see PreventUserExistenceErrorTypes
     */
    public void setPreventUserExistenceErrors(
            PreventUserExistenceErrorTypes preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors.toString();
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during
     * authentication, account confirmation, and password recovery when the user
     * doesn't exist in the user pool. When set to <code>ENABLED</code> and the
     * user doesn't exist, authentication returns an error indicating either the
     * username or password was incorrect. Account confirmation and password
     * recovery return a response indicating a code was sent to a simulated
     * destination. When set to <code>LEGACY</code>, those APIs return a
     * <code>UserNotFoundException</code> exception if the user doesn't exist in
     * the user pool.
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
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito
     * where user existence related errors aren't prevented.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>LEGACY, ENABLED
     *
     * @param preventUserExistenceErrors <p>
     *            Errors and responses that you want Amazon Cognito APIs to
     *            return during authentication, account confirmation, and
     *            password recovery when the user doesn't exist in the user
     *            pool. When set to <code>ENABLED</code> and the user doesn't
     *            exist, authentication returns an error indicating either the
     *            username or password was incorrect. Account confirmation and
     *            password recovery return a response indicating a code was sent
     *            to a simulated destination. When set to <code>LEGACY</code>,
     *            those APIs return a <code>UserNotFoundException</code>
     *            exception if the user doesn't exist in the user pool.
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
     *            Amazon Cognito where user existence related errors aren't
     *            prevented.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PreventUserExistenceErrorTypes
     */
    public UserPoolClientType withPreventUserExistenceErrors(
            PreventUserExistenceErrorTypes preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client.
     * When you create a new user pool client, token revocation is activated by
     * default. For more information about revoking tokens, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     *
     * @return <p>
     *         Indicates whether token revocation is activated for the user pool
     *         client. When you create a new user pool client, token revocation
     *         is activated by default. For more information about revoking
     *         tokens, see <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     *         >RevokeToken</a>.
     *         </p>
     */
    public Boolean isEnableTokenRevocation() {
        return enableTokenRevocation;
    }

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client.
     * When you create a new user pool client, token revocation is activated by
     * default. For more information about revoking tokens, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     *
     * @return <p>
     *         Indicates whether token revocation is activated for the user pool
     *         client. When you create a new user pool client, token revocation
     *         is activated by default. For more information about revoking
     *         tokens, see <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     *         >RevokeToken</a>.
     *         </p>
     */
    public Boolean getEnableTokenRevocation() {
        return enableTokenRevocation;
    }

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client.
     * When you create a new user pool client, token revocation is activated by
     * default. For more information about revoking tokens, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     *
     * @param enableTokenRevocation <p>
     *            Indicates whether token revocation is activated for the user
     *            pool client. When you create a new user pool client, token
     *            revocation is activated by default. For more information about
     *            revoking tokens, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     *            >RevokeToken</a>.
     *            </p>
     */
    public void setEnableTokenRevocation(Boolean enableTokenRevocation) {
        this.enableTokenRevocation = enableTokenRevocation;
    }

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client.
     * When you create a new user pool client, token revocation is activated by
     * default. For more information about revoking tokens, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableTokenRevocation <p>
     *            Indicates whether token revocation is activated for the user
     *            pool client. When you create a new user pool client, token
     *            revocation is activated by default. For more information about
     *            revoking tokens, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     *            >RevokeToken</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withEnableTokenRevocation(Boolean enableTokenRevocation) {
        this.enableTokenRevocation = enableTokenRevocation;
        return this;
    }

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true,
     * Amazon Cognito accepts an <code>IpAddress</code> value that you send in
     * the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon
     * Cognito advanced security for risk analysis. You can send
     * <code>UserContextData</code> when you sign in Amazon Cognito native users
     * with the <code>InitiateAuth</code> and
     * <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you
     * can't send your user's source IP address to Amazon Cognito advanced
     * security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect
     * whether you can send a source IP address in a <code>ContextData</code>
     * parameter with the authenticated API operations
     * <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate
     * <code>EnablePropagateAdditionalUserContextData</code> in an app client
     * that has a client secret. For more information about propagation of user
     * context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     *
     * @return <p>
     *         When <code>EnablePropagateAdditionalUserContextData</code> is
     *         true, Amazon Cognito accepts an <code>IpAddress</code> value that
     *         you send in the <code>UserContextData</code> parameter. The
     *         <code>UserContextData</code> parameter sends information to
     *         Amazon Cognito advanced security for risk analysis. You can send
     *         <code>UserContextData</code> when you sign in Amazon Cognito
     *         native users with the <code>InitiateAuth</code> and
     *         <code>RespondToAuthChallenge</code> API operations.
     *         </p>
     *         <p>
     *         When <code>EnablePropagateAdditionalUserContextData</code> is
     *         false, you can't send your user's source IP address to Amazon
     *         Cognito advanced security with unauthenticated API operations.
     *         <code>EnablePropagateAdditionalUserContextData</code> doesn't
     *         affect whether you can send a source IP address in a
     *         <code>ContextData</code> parameter with the authenticated API
     *         operations <code>AdminInitiateAuth</code> and
     *         <code>AdminRespondToAuthChallenge</code>.
     *         </p>
     *         <p>
     *         You can only activate
     *         <code>EnablePropagateAdditionalUserContextData</code> in an app
     *         client that has a client secret. For more information about
     *         propagation of user context data, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *         >Adding user device and session data to API requests</a>.
     *         </p>
     */
    public Boolean isEnablePropagateAdditionalUserContextData() {
        return enablePropagateAdditionalUserContextData;
    }

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true,
     * Amazon Cognito accepts an <code>IpAddress</code> value that you send in
     * the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon
     * Cognito advanced security for risk analysis. You can send
     * <code>UserContextData</code> when you sign in Amazon Cognito native users
     * with the <code>InitiateAuth</code> and
     * <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you
     * can't send your user's source IP address to Amazon Cognito advanced
     * security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect
     * whether you can send a source IP address in a <code>ContextData</code>
     * parameter with the authenticated API operations
     * <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate
     * <code>EnablePropagateAdditionalUserContextData</code> in an app client
     * that has a client secret. For more information about propagation of user
     * context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     *
     * @return <p>
     *         When <code>EnablePropagateAdditionalUserContextData</code> is
     *         true, Amazon Cognito accepts an <code>IpAddress</code> value that
     *         you send in the <code>UserContextData</code> parameter. The
     *         <code>UserContextData</code> parameter sends information to
     *         Amazon Cognito advanced security for risk analysis. You can send
     *         <code>UserContextData</code> when you sign in Amazon Cognito
     *         native users with the <code>InitiateAuth</code> and
     *         <code>RespondToAuthChallenge</code> API operations.
     *         </p>
     *         <p>
     *         When <code>EnablePropagateAdditionalUserContextData</code> is
     *         false, you can't send your user's source IP address to Amazon
     *         Cognito advanced security with unauthenticated API operations.
     *         <code>EnablePropagateAdditionalUserContextData</code> doesn't
     *         affect whether you can send a source IP address in a
     *         <code>ContextData</code> parameter with the authenticated API
     *         operations <code>AdminInitiateAuth</code> and
     *         <code>AdminRespondToAuthChallenge</code>.
     *         </p>
     *         <p>
     *         You can only activate
     *         <code>EnablePropagateAdditionalUserContextData</code> in an app
     *         client that has a client secret. For more information about
     *         propagation of user context data, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *         >Adding user device and session data to API requests</a>.
     *         </p>
     */
    public Boolean getEnablePropagateAdditionalUserContextData() {
        return enablePropagateAdditionalUserContextData;
    }

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true,
     * Amazon Cognito accepts an <code>IpAddress</code> value that you send in
     * the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon
     * Cognito advanced security for risk analysis. You can send
     * <code>UserContextData</code> when you sign in Amazon Cognito native users
     * with the <code>InitiateAuth</code> and
     * <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you
     * can't send your user's source IP address to Amazon Cognito advanced
     * security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect
     * whether you can send a source IP address in a <code>ContextData</code>
     * parameter with the authenticated API operations
     * <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate
     * <code>EnablePropagateAdditionalUserContextData</code> in an app client
     * that has a client secret. For more information about propagation of user
     * context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     *
     * @param enablePropagateAdditionalUserContextData <p>
     *            When <code>EnablePropagateAdditionalUserContextData</code> is
     *            true, Amazon Cognito accepts an <code>IpAddress</code> value
     *            that you send in the <code>UserContextData</code> parameter.
     *            The <code>UserContextData</code> parameter sends information
     *            to Amazon Cognito advanced security for risk analysis. You can
     *            send <code>UserContextData</code> when you sign in Amazon
     *            Cognito native users with the <code>InitiateAuth</code> and
     *            <code>RespondToAuthChallenge</code> API operations.
     *            </p>
     *            <p>
     *            When <code>EnablePropagateAdditionalUserContextData</code> is
     *            false, you can't send your user's source IP address to Amazon
     *            Cognito advanced security with unauthenticated API operations.
     *            <code>EnablePropagateAdditionalUserContextData</code> doesn't
     *            affect whether you can send a source IP address in a
     *            <code>ContextData</code> parameter with the authenticated API
     *            operations <code>AdminInitiateAuth</code> and
     *            <code>AdminRespondToAuthChallenge</code>.
     *            </p>
     *            <p>
     *            You can only activate
     *            <code>EnablePropagateAdditionalUserContextData</code> in an
     *            app client that has a client secret. For more information
     *            about propagation of user context data, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *            >Adding user device and session data to API requests</a>.
     *            </p>
     */
    public void setEnablePropagateAdditionalUserContextData(
            Boolean enablePropagateAdditionalUserContextData) {
        this.enablePropagateAdditionalUserContextData = enablePropagateAdditionalUserContextData;
    }

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true,
     * Amazon Cognito accepts an <code>IpAddress</code> value that you send in
     * the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon
     * Cognito advanced security for risk analysis. You can send
     * <code>UserContextData</code> when you sign in Amazon Cognito native users
     * with the <code>InitiateAuth</code> and
     * <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you
     * can't send your user's source IP address to Amazon Cognito advanced
     * security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect
     * whether you can send a source IP address in a <code>ContextData</code>
     * parameter with the authenticated API operations
     * <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate
     * <code>EnablePropagateAdditionalUserContextData</code> in an app client
     * that has a client secret. For more information about propagation of user
     * context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enablePropagateAdditionalUserContextData <p>
     *            When <code>EnablePropagateAdditionalUserContextData</code> is
     *            true, Amazon Cognito accepts an <code>IpAddress</code> value
     *            that you send in the <code>UserContextData</code> parameter.
     *            The <code>UserContextData</code> parameter sends information
     *            to Amazon Cognito advanced security for risk analysis. You can
     *            send <code>UserContextData</code> when you sign in Amazon
     *            Cognito native users with the <code>InitiateAuth</code> and
     *            <code>RespondToAuthChallenge</code> API operations.
     *            </p>
     *            <p>
     *            When <code>EnablePropagateAdditionalUserContextData</code> is
     *            false, you can't send your user's source IP address to Amazon
     *            Cognito advanced security with unauthenticated API operations.
     *            <code>EnablePropagateAdditionalUserContextData</code> doesn't
     *            affect whether you can send a source IP address in a
     *            <code>ContextData</code> parameter with the authenticated API
     *            operations <code>AdminInitiateAuth</code> and
     *            <code>AdminRespondToAuthChallenge</code>.
     *            </p>
     *            <p>
     *            You can only activate
     *            <code>EnablePropagateAdditionalUserContextData</code> in an
     *            app client that has a client secret. For more information
     *            about propagation of user context data, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *            >Adding user device and session data to API requests</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withEnablePropagateAdditionalUserContextData(
            Boolean enablePropagateAdditionalUserContextData) {
        this.enablePropagateAdditionalUserContextData = enablePropagateAdditionalUserContextData;
        return this;
    }

    /**
     * <p>
     * Amazon Cognito creates a session token for each API request in an
     * authentication flow. <code>AuthSessionValidity</code> is the duration, in
     * minutes, of that session token. Your user pool native user must respond
     * to each authentication challenge before the session expires.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3 - 15<br/>
     *
     * @return <p>
     *         Amazon Cognito creates a session token for each API request in an
     *         authentication flow. <code>AuthSessionValidity</code> is the
     *         duration, in minutes, of that session token. Your user pool
     *         native user must respond to each authentication challenge before
     *         the session expires.
     *         </p>
     */
    public Integer getAuthSessionValidity() {
        return authSessionValidity;
    }

    /**
     * <p>
     * Amazon Cognito creates a session token for each API request in an
     * authentication flow. <code>AuthSessionValidity</code> is the duration, in
     * minutes, of that session token. Your user pool native user must respond
     * to each authentication challenge before the session expires.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3 - 15<br/>
     *
     * @param authSessionValidity <p>
     *            Amazon Cognito creates a session token for each API request in
     *            an authentication flow. <code>AuthSessionValidity</code> is
     *            the duration, in minutes, of that session token. Your user
     *            pool native user must respond to each authentication challenge
     *            before the session expires.
     *            </p>
     */
    public void setAuthSessionValidity(Integer authSessionValidity) {
        this.authSessionValidity = authSessionValidity;
    }

    /**
     * <p>
     * Amazon Cognito creates a session token for each API request in an
     * authentication flow. <code>AuthSessionValidity</code> is the duration, in
     * minutes, of that session token. Your user pool native user must respond
     * to each authentication challenge before the session expires.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>3 - 15<br/>
     *
     * @param authSessionValidity <p>
     *            Amazon Cognito creates a session token for each API request in
     *            an authentication flow. <code>AuthSessionValidity</code> is
     *            the duration, in minutes, of that session token. Your user
     *            pool native user must respond to each authentication challenge
     *            before the session expires.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolClientType withAuthSessionValidity(Integer authSessionValidity) {
        this.authSessionValidity = authSessionValidity;
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
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: " + getClientSecret() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getRefreshTokenValidity() != null)
            sb.append("RefreshTokenValidity: " + getRefreshTokenValidity() + ",");
        if (getAccessTokenValidity() != null)
            sb.append("AccessTokenValidity: " + getAccessTokenValidity() + ",");
        if (getIdTokenValidity() != null)
            sb.append("IdTokenValidity: " + getIdTokenValidity() + ",");
        if (getTokenValidityUnits() != null)
            sb.append("TokenValidityUnits: " + getTokenValidityUnits() + ",");
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
            sb.append("PreventUserExistenceErrors: " + getPreventUserExistenceErrors() + ",");
        if (getEnableTokenRevocation() != null)
            sb.append("EnableTokenRevocation: " + getEnableTokenRevocation() + ",");
        if (getEnablePropagateAdditionalUserContextData() != null)
            sb.append("EnablePropagateAdditionalUserContextData: "
                    + getEnablePropagateAdditionalUserContextData() + ",");
        if (getAuthSessionValidity() != null)
            sb.append("AuthSessionValidity: " + getAuthSessionValidity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getRefreshTokenValidity() == null) ? 0 : getRefreshTokenValidity().hashCode());
        hashCode = prime * hashCode
                + ((getAccessTokenValidity() == null) ? 0 : getAccessTokenValidity().hashCode());
        hashCode = prime * hashCode
                + ((getIdTokenValidity() == null) ? 0 : getIdTokenValidity().hashCode());
        hashCode = prime * hashCode
                + ((getTokenValidityUnits() == null) ? 0 : getTokenValidityUnits().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getEnableTokenRevocation() == null) ? 0 : getEnableTokenRevocation().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnablePropagateAdditionalUserContextData() == null) ? 0
                        : getEnablePropagateAdditionalUserContextData().hashCode());
        hashCode = prime * hashCode
                + ((getAuthSessionValidity() == null) ? 0 : getAuthSessionValidity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolClientType == false)
            return false;
        UserPoolClientType other = (UserPoolClientType) obj;

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
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null
                && other.getClientSecret().equals(this.getClientSecret()) == false)
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
        if (other.getRefreshTokenValidity() == null ^ this.getRefreshTokenValidity() == null)
            return false;
        if (other.getRefreshTokenValidity() != null
                && other.getRefreshTokenValidity().equals(this.getRefreshTokenValidity()) == false)
            return false;
        if (other.getAccessTokenValidity() == null ^ this.getAccessTokenValidity() == null)
            return false;
        if (other.getAccessTokenValidity() != null
                && other.getAccessTokenValidity().equals(this.getAccessTokenValidity()) == false)
            return false;
        if (other.getIdTokenValidity() == null ^ this.getIdTokenValidity() == null)
            return false;
        if (other.getIdTokenValidity() != null
                && other.getIdTokenValidity().equals(this.getIdTokenValidity()) == false)
            return false;
        if (other.getTokenValidityUnits() == null ^ this.getTokenValidityUnits() == null)
            return false;
        if (other.getTokenValidityUnits() != null
                && other.getTokenValidityUnits().equals(this.getTokenValidityUnits()) == false)
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
        if (other.getEnableTokenRevocation() == null ^ this.getEnableTokenRevocation() == null)
            return false;
        if (other.getEnableTokenRevocation() != null
                && other.getEnableTokenRevocation().equals(this.getEnableTokenRevocation()) == false)
            return false;
        if (other.getEnablePropagateAdditionalUserContextData() == null
                ^ this.getEnablePropagateAdditionalUserContextData() == null)
            return false;
        if (other.getEnablePropagateAdditionalUserContextData() != null
                && other.getEnablePropagateAdditionalUserContextData().equals(
                        this.getEnablePropagateAdditionalUserContextData()) == false)
            return false;
        if (other.getAuthSessionValidity() == null ^ this.getAuthSessionValidity() == null)
            return false;
        if (other.getAuthSessionValidity() != null
                && other.getAuthSessionValidity().equals(this.getAuthSessionValidity()) == false)
            return false;
        return true;
    }
}
