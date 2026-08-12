/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Updates IdP information for a user pool.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito evaluates Identity and Access Management (IAM) policies in
 * requests for this API operation. For this operation, you must use IAM
 * credentials to authorize requests, and you must grant yourself the
 * corresponding IAM permission in a policy.
 * </p>
 * <p class="title">
 * <b>Learn more</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-signing.html"
 * >Signing Amazon Web Services API Requests</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pools-API-operations.html"
 * >Using the Amazon Cognito user pools API and user pool endpoints</a>
 * </p>
 * </li>
 * </ul>
 * </note>
 */
public class UpdateIdentityProviderRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The IdP name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\p{Z}]+<br/>
     */
    private String providerName;

    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider.
     * The following examples describe the provider detail keys for each IdP
     * type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover
     * endpoint URLs from <code>oidc_issuer</code>: <code>attributes_url</code>,
     * <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>
     * .
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata
     * document with all quote (") characters escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.Map<String, String> providerDetails;

    /**
     * <p>
     * The IdP attribute mapping to be changed.
     * </p>
     */
    private java.util.Map<String, String> attributeMapping;

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     */
    private java.util.List<String> idpIdentifiers;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
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
     *            The user pool ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIdentityProviderRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The IdP name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\p{Z}]+<br/>
     *
     * @return <p>
     *         The IdP name.
     *         </p>
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * <p>
     * The IdP name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\p{Z}]+<br/>
     *
     * @param providerName <p>
     *            The IdP name.
     *            </p>
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The IdP name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\p{Z}]+<br/>
     *
     * @param providerName <p>
     *            The IdP name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIdentityProviderRequest withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider.
     * The following examples describe the provider detail keys for each IdP
     * type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover
     * endpoint URLs from <code>oidc_issuer</code>: <code>attributes_url</code>,
     * <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>
     * .
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata
     * document with all quote (") characters escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     *
     * @return <p>
     *         The scopes, URLs, and identifiers for your external identity
     *         provider. The following examples describe the provider detail
     *         keys for each IdP type. These values and their schema are subject
     *         to change. Social IdP <code>authorize_scopes</code> values must
     *         match the values listed here.
     *         </p>
     *         <dl>
     *         <dt>OpenID Connect (OIDC)</dt>
     *         <dd>
     *         <p>
     *         Amazon Cognito accepts the following elements when it can't
     *         discover endpoint URLs from <code>oidc_issuer</code>:
     *         <code>attributes_url</code>, <code>authorize_url</code>,
     *         <code>jwks_uri</code>, <code>token_url</code>.
     *         </p>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *         </p>
     *         </dd>
     *         <dt>SAML</dt>
     *         <dd>
     *         <p>
     *         Create or update request with Metadata URL:
     *         <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *         </p>
     *         <p>
     *         Create or update request with Metadata file:
     *         <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *         </p>
     *         <p>
     *         The value of <code>MetadataFile</code> must be the plaintext
     *         metadata document with all quote (") characters escaped by
     *         backslashes.
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     *         </p>
     *         </dd>
     *         <dt>LoginWithAmazon</dt>
     *         <dd>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     *         </p>
     *         </dd>
     *         <dt>Google</dt>
     *         <dd>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     *         </p>
     *         </dd>
     *         <dt>SignInWithApple</dt>
     *         <dd>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     *         </p>
     *         </dd>
     *         <dt>Facebook</dt>
     *         <dd>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     *         </p>
     *         </dd>
     *         </dl>
     */
    public java.util.Map<String, String> getProviderDetails() {
        return providerDetails;
    }

    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider.
     * The following examples describe the provider detail keys for each IdP
     * type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover
     * endpoint URLs from <code>oidc_issuer</code>: <code>attributes_url</code>,
     * <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>
     * .
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata
     * document with all quote (") characters escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     *
     * @param providerDetails <p>
     *            The scopes, URLs, and identifiers for your external identity
     *            provider. The following examples describe the provider detail
     *            keys for each IdP type. These values and their schema are
     *            subject to change. Social IdP <code>authorize_scopes</code>
     *            values must match the values listed here.
     *            </p>
     *            <dl>
     *            <dt>OpenID Connect (OIDC)</dt>
     *            <dd>
     *            <p>
     *            Amazon Cognito accepts the following elements when it can't
     *            discover endpoint URLs from <code>oidc_issuer</code>:
     *            <code>attributes_url</code>, <code>authorize_url</code>,
     *            <code>jwks_uri</code>, <code>token_url</code>.
     *            </p>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *            </p>
     *            </dd>
     *            <dt>SAML</dt>
     *            <dd>
     *            <p>
     *            Create or update request with Metadata URL:
     *            <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *            </p>
     *            <p>
     *            Create or update request with Metadata file:
     *            <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *            </p>
     *            <p>
     *            The value of <code>MetadataFile</code> must be the plaintext
     *            metadata document with all quote (") characters escaped by
     *            backslashes.
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     *            </p>
     *            </dd>
     *            <dt>LoginWithAmazon</dt>
     *            <dd>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     *            </p>
     *            </dd>
     *            <dt>Google</dt>
     *            <dd>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     *            </p>
     *            </dd>
     *            <dt>SignInWithApple</dt>
     *            <dd>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     *            </p>
     *            </dd>
     *            <dt>Facebook</dt>
     *            <dd>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     *            </p>
     *            </dd>
     *            </dl>
     */
    public void setProviderDetails(java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
    }

    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider.
     * The following examples describe the provider detail keys for each IdP
     * type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover
     * endpoint URLs from <code>oidc_issuer</code>: <code>attributes_url</code>,
     * <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>
     * .
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata
     * document with all quote (") characters escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerDetails <p>
     *            The scopes, URLs, and identifiers for your external identity
     *            provider. The following examples describe the provider detail
     *            keys for each IdP type. These values and their schema are
     *            subject to change. Social IdP <code>authorize_scopes</code>
     *            values must match the values listed here.
     *            </p>
     *            <dl>
     *            <dt>OpenID Connect (OIDC)</dt>
     *            <dd>
     *            <p>
     *            Amazon Cognito accepts the following elements when it can't
     *            discover endpoint URLs from <code>oidc_issuer</code>:
     *            <code>attributes_url</code>, <code>authorize_url</code>,
     *            <code>jwks_uri</code>, <code>token_url</code>.
     *            </p>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *            </p>
     *            </dd>
     *            <dt>SAML</dt>
     *            <dd>
     *            <p>
     *            Create or update request with Metadata URL:
     *            <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *            </p>
     *            <p>
     *            Create or update request with Metadata file:
     *            <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *            </p>
     *            <p>
     *            The value of <code>MetadataFile</code> must be the plaintext
     *            metadata document with all quote (") characters escaped by
     *            backslashes.
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     *            </p>
     *            </dd>
     *            <dt>LoginWithAmazon</dt>
     *            <dd>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     *            </p>
     *            </dd>
     *            <dt>Google</dt>
     *            <dd>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     *            </p>
     *            </dd>
     *            <dt>SignInWithApple</dt>
     *            <dd>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     *            </p>
     *            </dd>
     *            <dt>Facebook</dt>
     *            <dd>
     *            <p>
     *            Create or update request:
     *            <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     *            </p>
     *            <p>
     *            Describe response:
     *            <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIdentityProviderRequest withProviderDetails(
            java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
        return this;
    }

    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider.
     * The following examples describe the provider detail keys for each IdP
     * type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover
     * endpoint URLs from <code>oidc_issuer</code>: <code>attributes_url</code>,
     * <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>
     * .
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata
     * document with all quote (") characters escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     * <p>
     * The method adds a new key-value pair into ProviderDetails parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into ProviderDetails.
     * @param value The corresponding value of the entry to be added into
     *            ProviderDetails.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIdentityProviderRequest addProviderDetailsEntry(String key, String value) {
        if (null == this.providerDetails) {
            this.providerDetails = new java.util.HashMap<String, String>();
        }
        if (this.providerDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.providerDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProviderDetails.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateIdentityProviderRequest clearProviderDetailsEntries() {
        this.providerDetails = null;
        return this;
    }

    /**
     * <p>
     * The IdP attribute mapping to be changed.
     * </p>
     *
     * @return <p>
     *         The IdP attribute mapping to be changed.
     *         </p>
     */
    public java.util.Map<String, String> getAttributeMapping() {
        return attributeMapping;
    }

    /**
     * <p>
     * The IdP attribute mapping to be changed.
     * </p>
     *
     * @param attributeMapping <p>
     *            The IdP attribute mapping to be changed.
     *            </p>
     */
    public void setAttributeMapping(java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
    }

    /**
     * <p>
     * The IdP attribute mapping to be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeMapping <p>
     *            The IdP attribute mapping to be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIdentityProviderRequest withAttributeMapping(
            java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
        return this;
    }

    /**
     * <p>
     * The IdP attribute mapping to be changed.
     * </p>
     * <p>
     * The method adds a new key-value pair into AttributeMapping parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into AttributeMapping.
     * @param value The corresponding value of the entry to be added into
     *            AttributeMapping.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIdentityProviderRequest addAttributeMappingEntry(String key, String value) {
        if (null == this.attributeMapping) {
            this.attributeMapping = new java.util.HashMap<String, String>();
        }
        if (this.attributeMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributeMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeMapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateIdentityProviderRequest clearAttributeMappingEntries() {
        this.attributeMapping = null;
        return this;
    }

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     *
     * @return <p>
     *         A list of IdP identifiers.
     *         </p>
     */
    public java.util.List<String> getIdpIdentifiers() {
        return idpIdentifiers;
    }

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     *
     * @param idpIdentifiers <p>
     *            A list of IdP identifiers.
     *            </p>
     */
    public void setIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        if (idpIdentifiers == null) {
            this.idpIdentifiers = null;
            return;
        }

        this.idpIdentifiers = new java.util.ArrayList<String>(idpIdentifiers);
    }

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idpIdentifiers <p>
     *            A list of IdP identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIdentityProviderRequest withIdpIdentifiers(String... idpIdentifiers) {
        if (getIdpIdentifiers() == null) {
            this.idpIdentifiers = new java.util.ArrayList<String>(idpIdentifiers.length);
        }
        for (String value : idpIdentifiers) {
            this.idpIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param idpIdentifiers <p>
     *            A list of IdP identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateIdentityProviderRequest withIdpIdentifiers(
            java.util.Collection<String> idpIdentifiers) {
        setIdpIdentifiers(idpIdentifiers);
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
        if (getProviderName() != null)
            sb.append("ProviderName: " + getProviderName() + ",");
        if (getProviderDetails() != null)
            sb.append("ProviderDetails: " + getProviderDetails() + ",");
        if (getAttributeMapping() != null)
            sb.append("AttributeMapping: " + getAttributeMapping() + ",");
        if (getIdpIdentifiers() != null)
            sb.append("IdpIdentifiers: " + getIdpIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode
                + ((getProviderDetails() == null) ? 0 : getProviderDetails().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeMapping() == null) ? 0 : getAttributeMapping().hashCode());
        hashCode = prime * hashCode
                + ((getIdpIdentifiers() == null) ? 0 : getIdpIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIdentityProviderRequest == false)
            return false;
        UpdateIdentityProviderRequest other = (UpdateIdentityProviderRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null
                && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderDetails() == null ^ this.getProviderDetails() == null)
            return false;
        if (other.getProviderDetails() != null
                && other.getProviderDetails().equals(this.getProviderDetails()) == false)
            return false;
        if (other.getAttributeMapping() == null ^ this.getAttributeMapping() == null)
            return false;
        if (other.getAttributeMapping() != null
                && other.getAttributeMapping().equals(this.getAttributeMapping()) == false)
            return false;
        if (other.getIdpIdentifiers() == null ^ this.getIdpIdentifiers() == null)
            return false;
        if (other.getIdpIdentifiers() != null
                && other.getIdpIdentifiers().equals(this.getIdpIdentifiers()) == false)
            return false;
        return true;
    }
}
