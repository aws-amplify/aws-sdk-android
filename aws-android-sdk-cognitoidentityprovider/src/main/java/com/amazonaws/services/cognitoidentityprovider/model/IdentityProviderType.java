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
 * A container for information about an IdP.
 * </p>
 */
public class IdentityProviderType implements Serializable {
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
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String providerName;

    /**
     * <p>
     * The IdP type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon,
     * SignInWithApple, OIDC
     */
    private String providerType;

    /**
     * <p>
     * The IdP details. The following list describes the provider detail keys
     * for each IdP type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * api_version
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * <p>
     * <i>You can submit a private_key when you add or update an IdP. Describe
     * operations don't return the private key.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * The following keys are only present if Amazon Cognito didn't discover
     * them at the <code>oidc_issuer</code> URL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * authorize_url
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito sets the value of the following keys automatically. They
     * are read-only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * attributes_url_add_attributes
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile or MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignout <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> providerDetails;

    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
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
    public IdentityProviderType withUserPoolId(String userPoolId) {
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
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
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
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
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
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param providerName <p>
     *            The IdP name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityProviderType withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon,
     * SignInWithApple, OIDC
     *
     * @return <p>
     *         The IdP type.
     *         </p>
     * @see IdentityProviderTypeType
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon,
     * SignInWithApple, OIDC
     *
     * @param providerType <p>
     *            The IdP type.
     *            </p>
     * @see IdentityProviderTypeType
     */
    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon,
     * SignInWithApple, OIDC
     *
     * @param providerType <p>
     *            The IdP type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderTypeType
     */
    public IdentityProviderType withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon,
     * SignInWithApple, OIDC
     *
     * @param providerType <p>
     *            The IdP type.
     *            </p>
     * @see IdentityProviderTypeType
     */
    public void setProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SAML, Facebook, Google, LoginWithAmazon,
     * SignInWithApple, OIDC
     *
     * @param providerType <p>
     *            The IdP type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityProviderTypeType
     */
    public IdentityProviderType withProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The IdP details. The following list describes the provider detail keys
     * for each IdP type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * api_version
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * <p>
     * <i>You can submit a private_key when you add or update an IdP. Describe
     * operations don't return the private key.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * The following keys are only present if Amazon Cognito didn't discover
     * them at the <code>oidc_issuer</code> URL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * authorize_url
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito sets the value of the following keys automatically. They
     * are read-only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * attributes_url_add_attributes
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile or MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignout <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The IdP details. The following list describes the provider detail
     *         keys for each IdP type.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For Google and Login with Amazon:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         client_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         client_secret
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_scopes
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For Facebook:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         client_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         client_secret
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_scopes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         api_version
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For Sign in with Apple:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         client_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         team_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         key_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         private_key
     *         </p>
     *         <p>
     *         <i>You can submit a private_key when you add or update an IdP.
     *         Describe operations don't return the private key.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_scopes
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For OIDC providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         client_id
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         client_secret
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         attributes_request_method
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         oidc_issuer
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authorize_scopes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The following keys are only present if Amazon Cognito didn't
     *         discover them at the <code>oidc_issuer</code> URL.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         authorize_url
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         token_url
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         attributes_url
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         jwks_uri
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Cognito sets the value of the following keys
     *         automatically. They are read-only.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         attributes_url_add_attributes
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For SAML providers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         MetadataFile or MetadataURL
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IDPSignout <i>optional</i>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, String> getProviderDetails() {
        return providerDetails;
    }

    /**
     * <p>
     * The IdP details. The following list describes the provider detail keys
     * for each IdP type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * api_version
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * <p>
     * <i>You can submit a private_key when you add or update an IdP. Describe
     * operations don't return the private key.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * The following keys are only present if Amazon Cognito didn't discover
     * them at the <code>oidc_issuer</code> URL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * authorize_url
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito sets the value of the following keys automatically. They
     * are read-only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * attributes_url_add_attributes
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile or MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignout <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param providerDetails <p>
     *            The IdP details. The following list describes the provider
     *            detail keys for each IdP type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For Google and Login with Amazon:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            client_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            client_secret
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            authorize_scopes
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            For Facebook:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            client_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            client_secret
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            authorize_scopes
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            api_version
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            For Sign in with Apple:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            client_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            team_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            key_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            private_key
     *            </p>
     *            <p>
     *            <i>You can submit a private_key when you add or update an IdP.
     *            Describe operations don't return the private key.</i>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            authorize_scopes
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            For OIDC providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            client_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            client_secret
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            attributes_request_method
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            oidc_issuer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            authorize_scopes
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The following keys are only present if Amazon Cognito didn't
     *            discover them at the <code>oidc_issuer</code> URL.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            authorize_url
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            token_url
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            attributes_url
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            jwks_uri
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Cognito sets the value of the following keys
     *            automatically. They are read-only.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            attributes_url_add_attributes
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            For SAML providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            MetadataFile or MetadataURL
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IDPSignout <i>optional</i>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setProviderDetails(java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
    }

    /**
     * <p>
     * The IdP details. The following list describes the provider detail keys
     * for each IdP type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * api_version
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * <p>
     * <i>You can submit a private_key when you add or update an IdP. Describe
     * operations don't return the private key.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * The following keys are only present if Amazon Cognito didn't discover
     * them at the <code>oidc_issuer</code> URL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * authorize_url
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito sets the value of the following keys automatically. They
     * are read-only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * attributes_url_add_attributes
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile or MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignout <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param providerDetails <p>
     *            The IdP details. The following list describes the provider
     *            detail keys for each IdP type.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For Google and Login with Amazon:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            client_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            client_secret
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            authorize_scopes
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            For Facebook:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            client_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            client_secret
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            authorize_scopes
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            api_version
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            For Sign in with Apple:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            client_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            team_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            key_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            private_key
     *            </p>
     *            <p>
     *            <i>You can submit a private_key when you add or update an IdP.
     *            Describe operations don't return the private key.</i>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            authorize_scopes
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            For OIDC providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            client_id
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            client_secret
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            attributes_request_method
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            oidc_issuer
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            authorize_scopes
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The following keys are only present if Amazon Cognito didn't
     *            discover them at the <code>oidc_issuer</code> URL.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            authorize_url
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            token_url
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            attributes_url
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            jwks_uri
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Cognito sets the value of the following keys
     *            automatically. They are read-only.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            attributes_url_add_attributes
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            For SAML providers:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            MetadataFile or MetadataURL
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            IDPSignout <i>optional</i>
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityProviderType withProviderDetails(java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
        return this;
    }

    /**
     * <p>
     * The IdP details. The following list describes the provider detail keys
     * for each IdP type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Google and Login with Amazon:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Facebook:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * api_version
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For Sign in with Apple:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * team_id
     * </p>
     * </li>
     * <li>
     * <p>
     * key_id
     * </p>
     * </li>
     * <li>
     * <p>
     * private_key
     * </p>
     * <p>
     * <i>You can submit a private_key when you add or update an IdP. Describe
     * operations don't return the private key.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For OIDC providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * client_id
     * </p>
     * </li>
     * <li>
     * <p>
     * client_secret
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_request_method
     * </p>
     * </li>
     * <li>
     * <p>
     * oidc_issuer
     * </p>
     * </li>
     * <li>
     * <p>
     * authorize_scopes
     * </p>
     * </li>
     * <li>
     * <p>
     * The following keys are only present if Amazon Cognito didn't discover
     * them at the <code>oidc_issuer</code> URL.
     * </p>
     * <ul>
     * <li>
     * <p>
     * authorize_url
     * </p>
     * </li>
     * <li>
     * <p>
     * token_url
     * </p>
     * </li>
     * <li>
     * <p>
     * attributes_url
     * </p>
     * </li>
     * <li>
     * <p>
     * jwks_uri
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Amazon Cognito sets the value of the following keys automatically. They
     * are read-only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * attributes_url_add_attributes
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For SAML providers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * MetadataFile or MetadataURL
     * </p>
     * </li>
     * <li>
     * <p>
     * IDPSignout <i>optional</i>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
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
    public IdentityProviderType addProviderDetailsEntry(String key, String value) {
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
    public IdentityProviderType clearProviderDetailsEntries() {
        this.providerDetails = null;
        return this;
    }

    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
     * </p>
     *
     * @return <p>
     *         A mapping of IdP attributes to standard and custom user pool
     *         attributes.
     *         </p>
     */
    public java.util.Map<String, String> getAttributeMapping() {
        return attributeMapping;
    }

    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
     * </p>
     *
     * @param attributeMapping <p>
     *            A mapping of IdP attributes to standard and custom user pool
     *            attributes.
     *            </p>
     */
    public void setAttributeMapping(java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
    }

    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeMapping <p>
     *            A mapping of IdP attributes to standard and custom user pool
     *            attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityProviderType withAttributeMapping(java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
        return this;
    }

    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
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
    public IdentityProviderType addAttributeMappingEntry(String key, String value) {
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
    public IdentityProviderType clearAttributeMappingEntries() {
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
    public IdentityProviderType withIdpIdentifiers(String... idpIdentifiers) {
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
    public IdentityProviderType withIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        setIdpIdentifiers(idpIdentifiers);
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
    public IdentityProviderType withLastModifiedDate(java.util.Date lastModifiedDate) {
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
    public IdentityProviderType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
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
        if (getProviderType() != null)
            sb.append("ProviderType: " + getProviderType() + ",");
        if (getProviderDetails() != null)
            sb.append("ProviderDetails: " + getProviderDetails() + ",");
        if (getAttributeMapping() != null)
            sb.append("AttributeMapping: " + getAttributeMapping() + ",");
        if (getIdpIdentifiers() != null)
            sb.append("IdpIdentifiers: " + getIdpIdentifiers() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
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
                + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode
                + ((getProviderDetails() == null) ? 0 : getProviderDetails().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeMapping() == null) ? 0 : getAttributeMapping().hashCode());
        hashCode = prime * hashCode
                + ((getIdpIdentifiers() == null) ? 0 : getIdpIdentifiers().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderType == false)
            return false;
        IdentityProviderType other = (IdentityProviderType) obj;

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
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null
                && other.getProviderType().equals(this.getProviderType()) == false)
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
        return true;
    }
}
