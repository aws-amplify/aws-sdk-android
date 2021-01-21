/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new identity pool. The identity pool is a store of user identity
 * information that is specific to your AWS account. The keys for
 * <code>SupportedLoginProviders</code> are as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Facebook: <code>graph.facebook.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Google: <code>accounts.google.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon: <code>www.amazon.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Twitter: <code>api.twitter.com</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * Digits: <code>www.digits.com</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * You must use AWS Developer credentials to call this API.
 * </p>
 */
public class CreateIdentityPoolRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string that you provide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String identityPoolName;

    /**
     * <p>
     * TRUE if the identity pool supports unauthenticated logins.
     * </p>
     */
    private Boolean allowUnauthenticatedIdentities;

    /**
     * <p>
     * Enables or disables the Basic (Classic) authentication flow. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     * >Identity Pools (Federated Identities) Authentication Flow</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     */
    private Boolean allowClassicFlow;

    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     */
    private java.util.Map<String, String> supportedLoginProviders;

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This name acts as
     * a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as period
     * (<code>.</code>), underscore (<code>_</code>), and dash (<code>-</code>).
     * </p>
     * <p>
     * Once you have set a developer provider name, you cannot change it. Please
     * take care in setting this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     */
    private String developerProviderName;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the OpenID Connect providers.
     * </p>
     */
    private java.util.List<String> openIdConnectProviderARNs;

    /**
     * <p>
     * An array of Amazon Cognito user pools and their client IDs.
     * </p>
     */
    private java.util.List<CognitoIdentityProvider> cognitoIdentityProviders;

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     */
    private java.util.List<String> samlProviderARNs;

    /**
     * <p>
     * Tags to assign to the identity pool. A tag is a label that you can apply
     * to identity pools to categorize and manage them in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     */
    private java.util.Map<String, String> identityPoolTags;

    /**
     * <p>
     * A string that you provide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         A string that you provide.
     *         </p>
     */
    public String getIdentityPoolName() {
        return identityPoolName;
    }

    /**
     * <p>
     * A string that you provide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param identityPoolName <p>
     *            A string that you provide.
     *            </p>
     */
    public void setIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
    }

    /**
     * <p>
     * A string that you provide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param identityPoolName <p>
     *            A string that you provide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withIdentityPoolName(String identityPoolName) {
        this.identityPoolName = identityPoolName;
        return this;
    }

    /**
     * <p>
     * TRUE if the identity pool supports unauthenticated logins.
     * </p>
     *
     * @return <p>
     *         TRUE if the identity pool supports unauthenticated logins.
     *         </p>
     */
    public Boolean isAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }

    /**
     * <p>
     * TRUE if the identity pool supports unauthenticated logins.
     * </p>
     *
     * @return <p>
     *         TRUE if the identity pool supports unauthenticated logins.
     *         </p>
     */
    public Boolean getAllowUnauthenticatedIdentities() {
        return allowUnauthenticatedIdentities;
    }

    /**
     * <p>
     * TRUE if the identity pool supports unauthenticated logins.
     * </p>
     *
     * @param allowUnauthenticatedIdentities <p>
     *            TRUE if the identity pool supports unauthenticated logins.
     *            </p>
     */
    public void setAllowUnauthenticatedIdentities(Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
    }

    /**
     * <p>
     * TRUE if the identity pool supports unauthenticated logins.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowUnauthenticatedIdentities <p>
     *            TRUE if the identity pool supports unauthenticated logins.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withAllowUnauthenticatedIdentities(
            Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
        return this;
    }

    /**
     * <p>
     * Enables or disables the Basic (Classic) authentication flow. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     * >Identity Pools (Federated Identities) Authentication Flow</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Enables or disables the Basic (Classic) authentication flow. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     *         >Identity Pools (Federated Identities) Authentication Flow</a> in
     *         the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     */
    public Boolean isAllowClassicFlow() {
        return allowClassicFlow;
    }

    /**
     * <p>
     * Enables or disables the Basic (Classic) authentication flow. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     * >Identity Pools (Federated Identities) Authentication Flow</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Enables or disables the Basic (Classic) authentication flow. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     *         >Identity Pools (Federated Identities) Authentication Flow</a> in
     *         the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     */
    public Boolean getAllowClassicFlow() {
        return allowClassicFlow;
    }

    /**
     * <p>
     * Enables or disables the Basic (Classic) authentication flow. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     * >Identity Pools (Federated Identities) Authentication Flow</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     *
     * @param allowClassicFlow <p>
     *            Enables or disables the Basic (Classic) authentication flow.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     *            >Identity Pools (Federated Identities) Authentication Flow</a>
     *            in the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     */
    public void setAllowClassicFlow(Boolean allowClassicFlow) {
        this.allowClassicFlow = allowClassicFlow;
    }

    /**
     * <p>
     * Enables or disables the Basic (Classic) authentication flow. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     * >Identity Pools (Federated Identities) Authentication Flow</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowClassicFlow <p>
     *            Enables or disables the Basic (Classic) authentication flow.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html"
     *            >Identity Pools (Federated Identities) Authentication Flow</a>
     *            in the <i>Amazon Cognito Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withAllowClassicFlow(Boolean allowClassicFlow) {
        this.allowClassicFlow = allowClassicFlow;
        return this;
    }

    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     *
     * @return <p>
     *         Optional key:value pairs mapping provider names to provider app
     *         IDs.
     *         </p>
     */
    public java.util.Map<String, String> getSupportedLoginProviders() {
        return supportedLoginProviders;
    }

    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     *
     * @param supportedLoginProviders <p>
     *            Optional key:value pairs mapping provider names to provider
     *            app IDs.
     *            </p>
     */
    public void setSupportedLoginProviders(java.util.Map<String, String> supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
    }

    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedLoginProviders <p>
     *            Optional key:value pairs mapping provider names to provider
     *            app IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withSupportedLoginProviders(
            java.util.Map<String, String> supportedLoginProviders) {
        this.supportedLoginProviders = supportedLoginProviders;
        return this;
    }

    /**
     * <p>
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     * <p>
     * The method adds a new key-value pair into SupportedLoginProviders
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into SupportedLoginProviders.
     * @param value The corresponding value of the entry to be added into
     *            SupportedLoginProviders.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest addSupportedLoginProvidersEntry(String key, String value) {
        if (null == this.supportedLoginProviders) {
            this.supportedLoginProviders = new java.util.HashMap<String, String>();
        }
        if (this.supportedLoginProviders.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.supportedLoginProviders.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SupportedLoginProviders.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateIdentityPoolRequest clearSupportedLoginProvidersEntries() {
        this.supportedLoginProviders = null;
        return this;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This name acts as
     * a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as period
     * (<code>.</code>), underscore (<code>_</code>), and dash (<code>-</code>).
     * </p>
     * <p>
     * Once you have set a developer provider name, you cannot change it. Please
     * take care in setting this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @return <p>
     *         The "domain" by which Cognito will refer to your users. This name
     *         acts as a placeholder that allows your backend and the Cognito
     *         service to communicate about the developer provider. For the
     *         <code>DeveloperProviderName</code>, you can use letters as well
     *         as period (<code>.</code>), underscore (<code>_</code>), and dash
     *         (<code>-</code>).
     *         </p>
     *         <p>
     *         Once you have set a developer provider name, you cannot change
     *         it. Please take care in setting this parameter.
     *         </p>
     */
    public String getDeveloperProviderName() {
        return developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This name acts as
     * a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as period
     * (<code>.</code>), underscore (<code>_</code>), and dash (<code>-</code>).
     * </p>
     * <p>
     * Once you have set a developer provider name, you cannot change it. Please
     * take care in setting this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName <p>
     *            The "domain" by which Cognito will refer to your users. This
     *            name acts as a placeholder that allows your backend and the
     *            Cognito service to communicate about the developer provider.
     *            For the <code>DeveloperProviderName</code>, you can use
     *            letters as well as period (<code>.</code>), underscore (
     *            <code>_</code>), and dash (<code>-</code>).
     *            </p>
     *            <p>
     *            Once you have set a developer provider name, you cannot change
     *            it. Please take care in setting this parameter.
     *            </p>
     */
    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users. This name acts as
     * a placeholder that allows your backend and the Cognito service to
     * communicate about the developer provider. For the
     * <code>DeveloperProviderName</code>, you can use letters as well as period
     * (<code>.</code>), underscore (<code>_</code>), and dash (<code>-</code>).
     * </p>
     * <p>
     * Once you have set a developer provider name, you cannot change it. Please
     * take care in setting this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName <p>
     *            The "domain" by which Cognito will refer to your users. This
     *            name acts as a placeholder that allows your backend and the
     *            Cognito service to communicate about the developer provider.
     *            For the <code>DeveloperProviderName</code>, you can use
     *            letters as well as period (<code>.</code>), underscore (
     *            <code>_</code>), and dash (<code>-</code>).
     *            </p>
     *            <p>
     *            Once you have set a developer provider name, you cannot change
     *            it. Please take care in setting this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the OpenID Connect providers.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARN) of the OpenID Connect providers.
     *         </p>
     */
    public java.util.List<String> getOpenIdConnectProviderARNs() {
        return openIdConnectProviderARNs;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the OpenID Connect providers.
     * </p>
     *
     * @param openIdConnectProviderARNs <p>
     *            The Amazon Resource Names (ARN) of the OpenID Connect
     *            providers.
     *            </p>
     */
    public void setOpenIdConnectProviderARNs(java.util.Collection<String> openIdConnectProviderARNs) {
        if (openIdConnectProviderARNs == null) {
            this.openIdConnectProviderARNs = null;
            return;
        }

        this.openIdConnectProviderARNs = new java.util.ArrayList<String>(openIdConnectProviderARNs);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the OpenID Connect providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openIdConnectProviderARNs <p>
     *            The Amazon Resource Names (ARN) of the OpenID Connect
     *            providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withOpenIdConnectProviderARNs(
            String... openIdConnectProviderARNs) {
        if (getOpenIdConnectProviderARNs() == null) {
            this.openIdConnectProviderARNs = new java.util.ArrayList<String>(
                    openIdConnectProviderARNs.length);
        }
        for (String value : openIdConnectProviderARNs) {
            this.openIdConnectProviderARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the OpenID Connect providers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openIdConnectProviderARNs <p>
     *            The Amazon Resource Names (ARN) of the OpenID Connect
     *            providers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withOpenIdConnectProviderARNs(
            java.util.Collection<String> openIdConnectProviderARNs) {
        setOpenIdConnectProviderARNs(openIdConnectProviderARNs);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Cognito user pools and their client IDs.
     * </p>
     *
     * @return <p>
     *         An array of Amazon Cognito user pools and their client IDs.
     *         </p>
     */
    public java.util.List<CognitoIdentityProvider> getCognitoIdentityProviders() {
        return cognitoIdentityProviders;
    }

    /**
     * <p>
     * An array of Amazon Cognito user pools and their client IDs.
     * </p>
     *
     * @param cognitoIdentityProviders <p>
     *            An array of Amazon Cognito user pools and their client IDs.
     *            </p>
     */
    public void setCognitoIdentityProviders(
            java.util.Collection<CognitoIdentityProvider> cognitoIdentityProviders) {
        if (cognitoIdentityProviders == null) {
            this.cognitoIdentityProviders = null;
            return;
        }

        this.cognitoIdentityProviders = new java.util.ArrayList<CognitoIdentityProvider>(
                cognitoIdentityProviders);
    }

    /**
     * <p>
     * An array of Amazon Cognito user pools and their client IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoIdentityProviders <p>
     *            An array of Amazon Cognito user pools and their client IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withCognitoIdentityProviders(
            CognitoIdentityProvider... cognitoIdentityProviders) {
        if (getCognitoIdentityProviders() == null) {
            this.cognitoIdentityProviders = new java.util.ArrayList<CognitoIdentityProvider>(
                    cognitoIdentityProviders.length);
        }
        for (CognitoIdentityProvider value : cognitoIdentityProviders) {
            this.cognitoIdentityProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Cognito user pools and their client IDs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoIdentityProviders <p>
     *            An array of Amazon Cognito user pools and their client IDs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withCognitoIdentityProviders(
            java.util.Collection<CognitoIdentityProvider> cognitoIdentityProviders) {
        setCognitoIdentityProviders(cognitoIdentityProviders);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     *
     * @return <p>
     *         An array of Amazon Resource Names (ARNs) of the SAML provider for
     *         your identity pool.
     *         </p>
     */
    public java.util.List<String> getSamlProviderARNs() {
        return samlProviderARNs;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     *
     * @param samlProviderARNs <p>
     *            An array of Amazon Resource Names (ARNs) of the SAML provider
     *            for your identity pool.
     *            </p>
     */
    public void setSamlProviderARNs(java.util.Collection<String> samlProviderARNs) {
        if (samlProviderARNs == null) {
            this.samlProviderARNs = null;
            return;
        }

        this.samlProviderARNs = new java.util.ArrayList<String>(samlProviderARNs);
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param samlProviderARNs <p>
     *            An array of Amazon Resource Names (ARNs) of the SAML provider
     *            for your identity pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withSamlProviderARNs(String... samlProviderARNs) {
        if (getSamlProviderARNs() == null) {
            this.samlProviderARNs = new java.util.ArrayList<String>(samlProviderARNs.length);
        }
        for (String value : samlProviderARNs) {
            this.samlProviderARNs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your
     * identity pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param samlProviderARNs <p>
     *            An array of Amazon Resource Names (ARNs) of the SAML provider
     *            for your identity pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withSamlProviderARNs(
            java.util.Collection<String> samlProviderARNs) {
        setSamlProviderARNs(samlProviderARNs);
        return this;
    }

    /**
     * <p>
     * Tags to assign to the identity pool. A tag is a label that you can apply
     * to identity pools to categorize and manage them in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     *
     * @return <p>
     *         Tags to assign to the identity pool. A tag is a label that you
     *         can apply to identity pools to categorize and manage them in
     *         different ways, such as by purpose, owner, environment, or other
     *         criteria.
     *         </p>
     */
    public java.util.Map<String, String> getIdentityPoolTags() {
        return identityPoolTags;
    }

    /**
     * <p>
     * Tags to assign to the identity pool. A tag is a label that you can apply
     * to identity pools to categorize and manage them in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     *
     * @param identityPoolTags <p>
     *            Tags to assign to the identity pool. A tag is a label that you
     *            can apply to identity pools to categorize and manage them in
     *            different ways, such as by purpose, owner, environment, or
     *            other criteria.
     *            </p>
     */
    public void setIdentityPoolTags(java.util.Map<String, String> identityPoolTags) {
        this.identityPoolTags = identityPoolTags;
    }

    /**
     * <p>
     * Tags to assign to the identity pool. A tag is a label that you can apply
     * to identity pools to categorize and manage them in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityPoolTags <p>
     *            Tags to assign to the identity pool. A tag is a label that you
     *            can apply to identity pools to categorize and manage them in
     *            different ways, such as by purpose, owner, environment, or
     *            other criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest withIdentityPoolTags(
            java.util.Map<String, String> identityPoolTags) {
        this.identityPoolTags = identityPoolTags;
        return this;
    }

    /**
     * <p>
     * Tags to assign to the identity pool. A tag is a label that you can apply
     * to identity pools to categorize and manage them in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * The method adds a new key-value pair into IdentityPoolTags parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into IdentityPoolTags.
     * @param value The corresponding value of the entry to be added into
     *            IdentityPoolTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolRequest addIdentityPoolTagsEntry(String key, String value) {
        if (null == this.identityPoolTags) {
            this.identityPoolTags = new java.util.HashMap<String, String>();
        }
        if (this.identityPoolTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.identityPoolTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IdentityPoolTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateIdentityPoolRequest clearIdentityPoolTagsEntries() {
        this.identityPoolTags = null;
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
        if (getIdentityPoolName() != null)
            sb.append("IdentityPoolName: " + getIdentityPoolName() + ",");
        if (getAllowUnauthenticatedIdentities() != null)
            sb.append("AllowUnauthenticatedIdentities: " + getAllowUnauthenticatedIdentities()
                    + ",");
        if (getAllowClassicFlow() != null)
            sb.append("AllowClassicFlow: " + getAllowClassicFlow() + ",");
        if (getSupportedLoginProviders() != null)
            sb.append("SupportedLoginProviders: " + getSupportedLoginProviders() + ",");
        if (getDeveloperProviderName() != null)
            sb.append("DeveloperProviderName: " + getDeveloperProviderName() + ",");
        if (getOpenIdConnectProviderARNs() != null)
            sb.append("OpenIdConnectProviderARNs: " + getOpenIdConnectProviderARNs() + ",");
        if (getCognitoIdentityProviders() != null)
            sb.append("CognitoIdentityProviders: " + getCognitoIdentityProviders() + ",");
        if (getSamlProviderARNs() != null)
            sb.append("SamlProviderARNs: " + getSamlProviderARNs() + ",");
        if (getIdentityPoolTags() != null)
            sb.append("IdentityPoolTags: " + getIdentityPoolTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityPoolName() == null) ? 0 : getIdentityPoolName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowUnauthenticatedIdentities() == null) ? 0
                        : getAllowUnauthenticatedIdentities().hashCode());
        hashCode = prime * hashCode
                + ((getAllowClassicFlow() == null) ? 0 : getAllowClassicFlow().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedLoginProviders() == null) ? 0 : getSupportedLoginProviders()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDeveloperProviderName() == null) ? 0 : getDeveloperProviderName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOpenIdConnectProviderARNs() == null) ? 0 : getOpenIdConnectProviderARNs()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCognitoIdentityProviders() == null) ? 0 : getCognitoIdentityProviders()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSamlProviderARNs() == null) ? 0 : getSamlProviderARNs().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityPoolTags() == null) ? 0 : getIdentityPoolTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdentityPoolRequest == false)
            return false;
        CreateIdentityPoolRequest other = (CreateIdentityPoolRequest) obj;

        if (other.getIdentityPoolName() == null ^ this.getIdentityPoolName() == null)
            return false;
        if (other.getIdentityPoolName() != null
                && other.getIdentityPoolName().equals(this.getIdentityPoolName()) == false)
            return false;
        if (other.getAllowUnauthenticatedIdentities() == null
                ^ this.getAllowUnauthenticatedIdentities() == null)
            return false;
        if (other.getAllowUnauthenticatedIdentities() != null
                && other.getAllowUnauthenticatedIdentities().equals(
                        this.getAllowUnauthenticatedIdentities()) == false)
            return false;
        if (other.getAllowClassicFlow() == null ^ this.getAllowClassicFlow() == null)
            return false;
        if (other.getAllowClassicFlow() != null
                && other.getAllowClassicFlow().equals(this.getAllowClassicFlow()) == false)
            return false;
        if (other.getSupportedLoginProviders() == null ^ this.getSupportedLoginProviders() == null)
            return false;
        if (other.getSupportedLoginProviders() != null
                && other.getSupportedLoginProviders().equals(this.getSupportedLoginProviders()) == false)
            return false;
        if (other.getDeveloperProviderName() == null ^ this.getDeveloperProviderName() == null)
            return false;
        if (other.getDeveloperProviderName() != null
                && other.getDeveloperProviderName().equals(this.getDeveloperProviderName()) == false)
            return false;
        if (other.getOpenIdConnectProviderARNs() == null
                ^ this.getOpenIdConnectProviderARNs() == null)
            return false;
        if (other.getOpenIdConnectProviderARNs() != null
                && other.getOpenIdConnectProviderARNs().equals(this.getOpenIdConnectProviderARNs()) == false)
            return false;
        if (other.getCognitoIdentityProviders() == null
                ^ this.getCognitoIdentityProviders() == null)
            return false;
        if (other.getCognitoIdentityProviders() != null
                && other.getCognitoIdentityProviders().equals(this.getCognitoIdentityProviders()) == false)
            return false;
        if (other.getSamlProviderARNs() == null ^ this.getSamlProviderARNs() == null)
            return false;
        if (other.getSamlProviderARNs() != null
                && other.getSamlProviderARNs().equals(this.getSamlProviderARNs()) == false)
            return false;
        if (other.getIdentityPoolTags() == null ^ this.getIdentityPoolTags() == null)
            return false;
        if (other.getIdentityPoolTags() != null
                && other.getIdentityPoolTags().equals(this.getIdentityPoolTags()) == false)
            return false;
        return true;
    }
}
