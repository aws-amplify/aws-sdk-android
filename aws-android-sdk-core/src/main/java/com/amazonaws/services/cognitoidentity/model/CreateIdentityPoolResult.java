/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An object representing an Amazon Cognito identity pool.
 * </p>
 */
public class CreateIdentityPoolResult implements Serializable {
    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * <p>
     * A string that you provide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
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
     * Optional key:value pairs mapping provider names to provider app IDs.
     * </p>
     */
    private java.util.Map<String, String> supportedLoginProviders;

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     */
    private String developerProviderName;

    /**
     * <p>
     * A list of OpendID Connect provider ARNs.
     * </p>
     */
    private java.util.List<String> openIdConnectProviderARNs;

    /**
     * <p>
     * A list representing an Amazon Cognito user pool and its client ID.
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
     * The tags that are assigned to the identity pool. A tag is a label that
     * you can apply to identity pools to categorize and manage them in
     * different ways, such as by purpose, owner, environment, or other
     * criteria.
     * </p>
     */
    private java.util.Map<String, String> identityPoolTags;

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return <p>
     *         An identity pool ID in the format REGION:GUID.
     *         </p>
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            An identity pool ID in the format REGION:GUID.
     *            </p>
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * An identity pool ID in the format REGION:GUID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId <p>
     *            An identity pool ID in the format REGION:GUID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolResult withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * <p>
     * A string that you provide.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w ]+<br/>
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
     * <b>Pattern: </b>[\w ]+<br/>
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
     * <b>Pattern: </b>[\w ]+<br/>
     *
     * @param identityPoolName <p>
     *            A string that you provide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolResult withIdentityPoolName(String identityPoolName) {
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
    public CreateIdentityPoolResult withAllowUnauthenticatedIdentities(
            Boolean allowUnauthenticatedIdentities) {
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
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
    public CreateIdentityPoolResult withSupportedLoginProviders(
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
    public CreateIdentityPoolResult addSupportedLoginProvidersEntry(String key, String value) {
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
    public CreateIdentityPoolResult clearSupportedLoginProvidersEntries() {
        this.supportedLoginProviders = null;
        return this;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @return <p>
     *         The "domain" by which Cognito will refer to your users.
     *         </p>
     */
    public String getDeveloperProviderName() {
        return developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w._-]+<br/>
     *
     * @param developerProviderName <p>
     *            The "domain" by which Cognito will refer to your users.
     *            </p>
     */
    public void setDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
    }

    /**
     * <p>
     * The "domain" by which Cognito will refer to your users.
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
     *            The "domain" by which Cognito will refer to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolResult withDeveloperProviderName(String developerProviderName) {
        this.developerProviderName = developerProviderName;
        return this;
    }

    /**
     * <p>
     * A list of OpendID Connect provider ARNs.
     * </p>
     *
     * @return <p>
     *         A list of OpendID Connect provider ARNs.
     *         </p>
     */
    public java.util.List<String> getOpenIdConnectProviderARNs() {
        return openIdConnectProviderARNs;
    }

    /**
     * <p>
     * A list of OpendID Connect provider ARNs.
     * </p>
     *
     * @param openIdConnectProviderARNs <p>
     *            A list of OpendID Connect provider ARNs.
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
     * A list of OpendID Connect provider ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openIdConnectProviderARNs <p>
     *            A list of OpendID Connect provider ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolResult withOpenIdConnectProviderARNs(
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
     * A list of OpendID Connect provider ARNs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openIdConnectProviderARNs <p>
     *            A list of OpendID Connect provider ARNs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolResult withOpenIdConnectProviderARNs(
            java.util.Collection<String> openIdConnectProviderARNs) {
        setOpenIdConnectProviderARNs(openIdConnectProviderARNs);
        return this;
    }

    /**
     * <p>
     * A list representing an Amazon Cognito user pool and its client ID.
     * </p>
     *
     * @return <p>
     *         A list representing an Amazon Cognito user pool and its client
     *         ID.
     *         </p>
     */
    public java.util.List<CognitoIdentityProvider> getCognitoIdentityProviders() {
        return cognitoIdentityProviders;
    }

    /**
     * <p>
     * A list representing an Amazon Cognito user pool and its client ID.
     * </p>
     *
     * @param cognitoIdentityProviders <p>
     *            A list representing an Amazon Cognito user pool and its client
     *            ID.
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
     * A list representing an Amazon Cognito user pool and its client ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoIdentityProviders <p>
     *            A list representing an Amazon Cognito user pool and its client
     *            ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolResult withCognitoIdentityProviders(
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
     * A list representing an Amazon Cognito user pool and its client ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cognitoIdentityProviders <p>
     *            A list representing an Amazon Cognito user pool and its client
     *            ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolResult withCognitoIdentityProviders(
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
    public CreateIdentityPoolResult withSamlProviderARNs(String... samlProviderARNs) {
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
    public CreateIdentityPoolResult withSamlProviderARNs(
            java.util.Collection<String> samlProviderARNs) {
        setSamlProviderARNs(samlProviderARNs);
        return this;
    }

    /**
     * <p>
     * The tags that are assigned to the identity pool. A tag is a label that
     * you can apply to identity pools to categorize and manage them in
     * different ways, such as by purpose, owner, environment, or other
     * criteria.
     * </p>
     *
     * @return <p>
     *         The tags that are assigned to the identity pool. A tag is a label
     *         that you can apply to identity pools to categorize and manage
     *         them in different ways, such as by purpose, owner, environment,
     *         or other criteria.
     *         </p>
     */
    public java.util.Map<String, String> getIdentityPoolTags() {
        return identityPoolTags;
    }

    /**
     * <p>
     * The tags that are assigned to the identity pool. A tag is a label that
     * you can apply to identity pools to categorize and manage them in
     * different ways, such as by purpose, owner, environment, or other
     * criteria.
     * </p>
     *
     * @param identityPoolTags <p>
     *            The tags that are assigned to the identity pool. A tag is a
     *            label that you can apply to identity pools to categorize and
     *            manage them in different ways, such as by purpose, owner,
     *            environment, or other criteria.
     *            </p>
     */
    public void setIdentityPoolTags(java.util.Map<String, String> identityPoolTags) {
        this.identityPoolTags = identityPoolTags;
    }

    /**
     * <p>
     * The tags that are assigned to the identity pool. A tag is a label that
     * you can apply to identity pools to categorize and manage them in
     * different ways, such as by purpose, owner, environment, or other
     * criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityPoolTags <p>
     *            The tags that are assigned to the identity pool. A tag is a
     *            label that you can apply to identity pools to categorize and
     *            manage them in different ways, such as by purpose, owner,
     *            environment, or other criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateIdentityPoolResult withIdentityPoolTags(
            java.util.Map<String, String> identityPoolTags) {
        this.identityPoolTags = identityPoolTags;
        return this;
    }

    /**
     * <p>
     * The tags that are assigned to the identity pool. A tag is a label that
     * you can apply to identity pools to categorize and manage them in
     * different ways, such as by purpose, owner, environment, or other
     * criteria.
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
    public CreateIdentityPoolResult addIdentityPoolTagsEntry(String key, String value) {
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
    public CreateIdentityPoolResult clearIdentityPoolTagsEntries() {
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityPoolName() != null)
            sb.append("IdentityPoolName: " + getIdentityPoolName() + ",");
        if (getAllowUnauthenticatedIdentities() != null)
            sb.append("AllowUnauthenticatedIdentities: " + getAllowUnauthenticatedIdentities()
                    + ",");
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
                + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityPoolName() == null) ? 0 : getIdentityPoolName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowUnauthenticatedIdentities() == null) ? 0
                        : getAllowUnauthenticatedIdentities().hashCode());
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

        if (obj instanceof CreateIdentityPoolResult == false)
            return false;
        CreateIdentityPoolResult other = (CreateIdentityPoolResult) obj;

        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null
                && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
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
