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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Links an existing user account in a user pool (<code>DestinationUser</code>)
 * to an identity from an external identity provider (<code>SourceUser</code>)
 * based on a specified attribute name and value from the external identity
 * provider. This allows you to create a link from the existing user account to
 * an external federated user identity that has not yet been used to sign in, so
 * that the federated user identity can be used to sign in as the existing user
 * account.
 * </p>
 * <p>
 * For example, if there is an existing user with a username and password, this
 * API links that user to a federated user identity, so that when the federated
 * user identity is used, the user signs in as the existing user account.
 * </p>
 * <important>
 * <p>
 * Because this API allows a user with an external federated identity to sign in
 * as an existing user in the user pool, it is critical that it only be used
 * with external identity providers and provider attributes that have been
 * trusted by the application owner.
 * </p>
 * </important>
 * <p>
 * See also .
 * </p>
 * <p>
 * This action is enabled only for admin access and requires developer
 * credentials.
 * </p>
 */
public class AdminLinkProviderForUserRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     */
    private String userPoolId;

    /**
     * <p>
     * The existing user in the user pool to be linked to the external identity
     * provider user account. Can be a native (Username + Password) Cognito User
     * Pools user or a federated user (for example, a SAML or Facebook user). If
     * the user doesn't exist, an exception is thrown. This is the user that is
     * returned when the new user (with the linked identity provider attribute)
     * signs in.
     * </p>
     * <p>
     * For a native username + password user, the
     * <code>ProviderAttributeValue</code> for the <code>DestinationUser</code>
     * should be the username in the user pool. For a federated user, it should
     * be the provider-specific <code>user_id</code>.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> of the
     * <code>DestinationUser</code> is ignored.
     * </p>
     * <p>
     * The <code>ProviderName</code> should be set to <code>Cognito</code> for
     * users in Cognito user pools.
     * </p>
     */
    private ProviderUserIdentifierType destinationUser;

    /**
     * <p>
     * An external identity provider account for a user who does not currently
     * exist yet in the user pool. This user must be a federated user (for
     * example, a SAML or Facebook user), not another native user.
     * </p>
     * <p>
     * If the <code>SourceUser</code> is a federated social identity provider
     * user (Facebook, Google, or Login with Amazon), you must set the
     * <code>ProviderAttributeName</code> to <code>Cognito_Subject</code>. For
     * social identity providers, the <code>ProviderName</code> will be
     * <code>Facebook</code>, <code>Google</code>, or
     * <code>LoginWithAmazon</code>, and Cognito will automatically parse the
     * Facebook, Google, and Login with Amazon tokens for <code>id</code>,
     * <code>sub</code>, and <code>user_id</code>, respectively. The
     * <code>ProviderAttributeValue</code> for the user must be the same value
     * as the <code>id</code>, <code>sub</code>, or <code>user_id</code> value
     * found in the social identity provider token.
     * </p>
     * <p/>
     * <p>
     * For SAML, the <code>ProviderAttributeName</code> can be any value that
     * matches a claim in the SAML assertion. If you wish to link SAML users
     * based on the subject of the SAML assertion, you should map the subject to
     * a claim through the SAML identity provider and submit that claim name as
     * the <code>ProviderAttributeName</code>. If you set
     * <code>ProviderAttributeName</code> to <code>Cognito_Subject</code>,
     * Cognito will automatically parse the default unique identifier found in
     * the subject from the SAML token.
     * </p>
     */
    private ProviderUserIdentifierType sourceUser;

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     *
     * @return <p>
     *         The user pool ID for the user pool.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminLinkProviderForUserRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The existing user in the user pool to be linked to the external identity
     * provider user account. Can be a native (Username + Password) Cognito User
     * Pools user or a federated user (for example, a SAML or Facebook user). If
     * the user doesn't exist, an exception is thrown. This is the user that is
     * returned when the new user (with the linked identity provider attribute)
     * signs in.
     * </p>
     * <p>
     * For a native username + password user, the
     * <code>ProviderAttributeValue</code> for the <code>DestinationUser</code>
     * should be the username in the user pool. For a federated user, it should
     * be the provider-specific <code>user_id</code>.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> of the
     * <code>DestinationUser</code> is ignored.
     * </p>
     * <p>
     * The <code>ProviderName</code> should be set to <code>Cognito</code> for
     * users in Cognito user pools.
     * </p>
     *
     * @return <p>
     *         The existing user in the user pool to be linked to the external
     *         identity provider user account. Can be a native (Username +
     *         Password) Cognito User Pools user or a federated user (for
     *         example, a SAML or Facebook user). If the user doesn't exist, an
     *         exception is thrown. This is the user that is returned when the
     *         new user (with the linked identity provider attribute) signs in.
     *         </p>
     *         <p>
     *         For a native username + password user, the
     *         <code>ProviderAttributeValue</code> for the
     *         <code>DestinationUser</code> should be the username in the user
     *         pool. For a federated user, it should be the provider-specific
     *         <code>user_id</code>.
     *         </p>
     *         <p>
     *         The <code>ProviderAttributeName</code> of the
     *         <code>DestinationUser</code> is ignored.
     *         </p>
     *         <p>
     *         The <code>ProviderName</code> should be set to
     *         <code>Cognito</code> for users in Cognito user pools.
     *         </p>
     */
    public ProviderUserIdentifierType getDestinationUser() {
        return destinationUser;
    }

    /**
     * <p>
     * The existing user in the user pool to be linked to the external identity
     * provider user account. Can be a native (Username + Password) Cognito User
     * Pools user or a federated user (for example, a SAML or Facebook user). If
     * the user doesn't exist, an exception is thrown. This is the user that is
     * returned when the new user (with the linked identity provider attribute)
     * signs in.
     * </p>
     * <p>
     * For a native username + password user, the
     * <code>ProviderAttributeValue</code> for the <code>DestinationUser</code>
     * should be the username in the user pool. For a federated user, it should
     * be the provider-specific <code>user_id</code>.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> of the
     * <code>DestinationUser</code> is ignored.
     * </p>
     * <p>
     * The <code>ProviderName</code> should be set to <code>Cognito</code> for
     * users in Cognito user pools.
     * </p>
     *
     * @param destinationUser <p>
     *            The existing user in the user pool to be linked to the
     *            external identity provider user account. Can be a native
     *            (Username + Password) Cognito User Pools user or a federated
     *            user (for example, a SAML or Facebook user). If the user
     *            doesn't exist, an exception is thrown. This is the user that
     *            is returned when the new user (with the linked identity
     *            provider attribute) signs in.
     *            </p>
     *            <p>
     *            For a native username + password user, the
     *            <code>ProviderAttributeValue</code> for the
     *            <code>DestinationUser</code> should be the username in the
     *            user pool. For a federated user, it should be the
     *            provider-specific <code>user_id</code>.
     *            </p>
     *            <p>
     *            The <code>ProviderAttributeName</code> of the
     *            <code>DestinationUser</code> is ignored.
     *            </p>
     *            <p>
     *            The <code>ProviderName</code> should be set to
     *            <code>Cognito</code> for users in Cognito user pools.
     *            </p>
     */
    public void setDestinationUser(ProviderUserIdentifierType destinationUser) {
        this.destinationUser = destinationUser;
    }

    /**
     * <p>
     * The existing user in the user pool to be linked to the external identity
     * provider user account. Can be a native (Username + Password) Cognito User
     * Pools user or a federated user (for example, a SAML or Facebook user). If
     * the user doesn't exist, an exception is thrown. This is the user that is
     * returned when the new user (with the linked identity provider attribute)
     * signs in.
     * </p>
     * <p>
     * For a native username + password user, the
     * <code>ProviderAttributeValue</code> for the <code>DestinationUser</code>
     * should be the username in the user pool. For a federated user, it should
     * be the provider-specific <code>user_id</code>.
     * </p>
     * <p>
     * The <code>ProviderAttributeName</code> of the
     * <code>DestinationUser</code> is ignored.
     * </p>
     * <p>
     * The <code>ProviderName</code> should be set to <code>Cognito</code> for
     * users in Cognito user pools.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationUser <p>
     *            The existing user in the user pool to be linked to the
     *            external identity provider user account. Can be a native
     *            (Username + Password) Cognito User Pools user or a federated
     *            user (for example, a SAML or Facebook user). If the user
     *            doesn't exist, an exception is thrown. This is the user that
     *            is returned when the new user (with the linked identity
     *            provider attribute) signs in.
     *            </p>
     *            <p>
     *            For a native username + password user, the
     *            <code>ProviderAttributeValue</code> for the
     *            <code>DestinationUser</code> should be the username in the
     *            user pool. For a federated user, it should be the
     *            provider-specific <code>user_id</code>.
     *            </p>
     *            <p>
     *            The <code>ProviderAttributeName</code> of the
     *            <code>DestinationUser</code> is ignored.
     *            </p>
     *            <p>
     *            The <code>ProviderName</code> should be set to
     *            <code>Cognito</code> for users in Cognito user pools.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminLinkProviderForUserRequest withDestinationUser(
            ProviderUserIdentifierType destinationUser) {
        this.destinationUser = destinationUser;
        return this;
    }

    /**
     * <p>
     * An external identity provider account for a user who does not currently
     * exist yet in the user pool. This user must be a federated user (for
     * example, a SAML or Facebook user), not another native user.
     * </p>
     * <p>
     * If the <code>SourceUser</code> is a federated social identity provider
     * user (Facebook, Google, or Login with Amazon), you must set the
     * <code>ProviderAttributeName</code> to <code>Cognito_Subject</code>. For
     * social identity providers, the <code>ProviderName</code> will be
     * <code>Facebook</code>, <code>Google</code>, or
     * <code>LoginWithAmazon</code>, and Cognito will automatically parse the
     * Facebook, Google, and Login with Amazon tokens for <code>id</code>,
     * <code>sub</code>, and <code>user_id</code>, respectively. The
     * <code>ProviderAttributeValue</code> for the user must be the same value
     * as the <code>id</code>, <code>sub</code>, or <code>user_id</code> value
     * found in the social identity provider token.
     * </p>
     * <p/>
     * <p>
     * For SAML, the <code>ProviderAttributeName</code> can be any value that
     * matches a claim in the SAML assertion. If you wish to link SAML users
     * based on the subject of the SAML assertion, you should map the subject to
     * a claim through the SAML identity provider and submit that claim name as
     * the <code>ProviderAttributeName</code>. If you set
     * <code>ProviderAttributeName</code> to <code>Cognito_Subject</code>,
     * Cognito will automatically parse the default unique identifier found in
     * the subject from the SAML token.
     * </p>
     *
     * @return <p>
     *         An external identity provider account for a user who does not
     *         currently exist yet in the user pool. This user must be a
     *         federated user (for example, a SAML or Facebook user), not
     *         another native user.
     *         </p>
     *         <p>
     *         If the <code>SourceUser</code> is a federated social identity
     *         provider user (Facebook, Google, or Login with Amazon), you must
     *         set the <code>ProviderAttributeName</code> to
     *         <code>Cognito_Subject</code>. For social identity providers, the
     *         <code>ProviderName</code> will be <code>Facebook</code>,
     *         <code>Google</code>, or <code>LoginWithAmazon</code>, and Cognito
     *         will automatically parse the Facebook, Google, and Login with
     *         Amazon tokens for <code>id</code>, <code>sub</code>, and
     *         <code>user_id</code>, respectively. The
     *         <code>ProviderAttributeValue</code> for the user must be the same
     *         value as the <code>id</code>, <code>sub</code>, or
     *         <code>user_id</code> value found in the social identity provider
     *         token.
     *         </p>
     *         <p/>
     *         <p>
     *         For SAML, the <code>ProviderAttributeName</code> can be any value
     *         that matches a claim in the SAML assertion. If you wish to link
     *         SAML users based on the subject of the SAML assertion, you should
     *         map the subject to a claim through the SAML identity provider and
     *         submit that claim name as the <code>ProviderAttributeName</code>.
     *         If you set <code>ProviderAttributeName</code> to
     *         <code>Cognito_Subject</code>, Cognito will automatically parse
     *         the default unique identifier found in the subject from the SAML
     *         token.
     *         </p>
     */
    public ProviderUserIdentifierType getSourceUser() {
        return sourceUser;
    }

    /**
     * <p>
     * An external identity provider account for a user who does not currently
     * exist yet in the user pool. This user must be a federated user (for
     * example, a SAML or Facebook user), not another native user.
     * </p>
     * <p>
     * If the <code>SourceUser</code> is a federated social identity provider
     * user (Facebook, Google, or Login with Amazon), you must set the
     * <code>ProviderAttributeName</code> to <code>Cognito_Subject</code>. For
     * social identity providers, the <code>ProviderName</code> will be
     * <code>Facebook</code>, <code>Google</code>, or
     * <code>LoginWithAmazon</code>, and Cognito will automatically parse the
     * Facebook, Google, and Login with Amazon tokens for <code>id</code>,
     * <code>sub</code>, and <code>user_id</code>, respectively. The
     * <code>ProviderAttributeValue</code> for the user must be the same value
     * as the <code>id</code>, <code>sub</code>, or <code>user_id</code> value
     * found in the social identity provider token.
     * </p>
     * <p/>
     * <p>
     * For SAML, the <code>ProviderAttributeName</code> can be any value that
     * matches a claim in the SAML assertion. If you wish to link SAML users
     * based on the subject of the SAML assertion, you should map the subject to
     * a claim through the SAML identity provider and submit that claim name as
     * the <code>ProviderAttributeName</code>. If you set
     * <code>ProviderAttributeName</code> to <code>Cognito_Subject</code>,
     * Cognito will automatically parse the default unique identifier found in
     * the subject from the SAML token.
     * </p>
     *
     * @param sourceUser <p>
     *            An external identity provider account for a user who does not
     *            currently exist yet in the user pool. This user must be a
     *            federated user (for example, a SAML or Facebook user), not
     *            another native user.
     *            </p>
     *            <p>
     *            If the <code>SourceUser</code> is a federated social identity
     *            provider user (Facebook, Google, or Login with Amazon), you
     *            must set the <code>ProviderAttributeName</code> to
     *            <code>Cognito_Subject</code>. For social identity providers,
     *            the <code>ProviderName</code> will be <code>Facebook</code>,
     *            <code>Google</code>, or <code>LoginWithAmazon</code>, and
     *            Cognito will automatically parse the Facebook, Google, and
     *            Login with Amazon tokens for <code>id</code>, <code>sub</code>
     *            , and <code>user_id</code>, respectively. The
     *            <code>ProviderAttributeValue</code> for the user must be the
     *            same value as the <code>id</code>, <code>sub</code>, or
     *            <code>user_id</code> value found in the social identity
     *            provider token.
     *            </p>
     *            <p/>
     *            <p>
     *            For SAML, the <code>ProviderAttributeName</code> can be any
     *            value that matches a claim in the SAML assertion. If you wish
     *            to link SAML users based on the subject of the SAML assertion,
     *            you should map the subject to a claim through the SAML
     *            identity provider and submit that claim name as the
     *            <code>ProviderAttributeName</code>. If you set
     *            <code>ProviderAttributeName</code> to
     *            <code>Cognito_Subject</code>, Cognito will automatically parse
     *            the default unique identifier found in the subject from the
     *            SAML token.
     *            </p>
     */
    public void setSourceUser(ProviderUserIdentifierType sourceUser) {
        this.sourceUser = sourceUser;
    }

    /**
     * <p>
     * An external identity provider account for a user who does not currently
     * exist yet in the user pool. This user must be a federated user (for
     * example, a SAML or Facebook user), not another native user.
     * </p>
     * <p>
     * If the <code>SourceUser</code> is a federated social identity provider
     * user (Facebook, Google, or Login with Amazon), you must set the
     * <code>ProviderAttributeName</code> to <code>Cognito_Subject</code>. For
     * social identity providers, the <code>ProviderName</code> will be
     * <code>Facebook</code>, <code>Google</code>, or
     * <code>LoginWithAmazon</code>, and Cognito will automatically parse the
     * Facebook, Google, and Login with Amazon tokens for <code>id</code>,
     * <code>sub</code>, and <code>user_id</code>, respectively. The
     * <code>ProviderAttributeValue</code> for the user must be the same value
     * as the <code>id</code>, <code>sub</code>, or <code>user_id</code> value
     * found in the social identity provider token.
     * </p>
     * <p/>
     * <p>
     * For SAML, the <code>ProviderAttributeName</code> can be any value that
     * matches a claim in the SAML assertion. If you wish to link SAML users
     * based on the subject of the SAML assertion, you should map the subject to
     * a claim through the SAML identity provider and submit that claim name as
     * the <code>ProviderAttributeName</code>. If you set
     * <code>ProviderAttributeName</code> to <code>Cognito_Subject</code>,
     * Cognito will automatically parse the default unique identifier found in
     * the subject from the SAML token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceUser <p>
     *            An external identity provider account for a user who does not
     *            currently exist yet in the user pool. This user must be a
     *            federated user (for example, a SAML or Facebook user), not
     *            another native user.
     *            </p>
     *            <p>
     *            If the <code>SourceUser</code> is a federated social identity
     *            provider user (Facebook, Google, or Login with Amazon), you
     *            must set the <code>ProviderAttributeName</code> to
     *            <code>Cognito_Subject</code>. For social identity providers,
     *            the <code>ProviderName</code> will be <code>Facebook</code>,
     *            <code>Google</code>, or <code>LoginWithAmazon</code>, and
     *            Cognito will automatically parse the Facebook, Google, and
     *            Login with Amazon tokens for <code>id</code>, <code>sub</code>
     *            , and <code>user_id</code>, respectively. The
     *            <code>ProviderAttributeValue</code> for the user must be the
     *            same value as the <code>id</code>, <code>sub</code>, or
     *            <code>user_id</code> value found in the social identity
     *            provider token.
     *            </p>
     *            <p/>
     *            <p>
     *            For SAML, the <code>ProviderAttributeName</code> can be any
     *            value that matches a claim in the SAML assertion. If you wish
     *            to link SAML users based on the subject of the SAML assertion,
     *            you should map the subject to a claim through the SAML
     *            identity provider and submit that claim name as the
     *            <code>ProviderAttributeName</code>. If you set
     *            <code>ProviderAttributeName</code> to
     *            <code>Cognito_Subject</code>, Cognito will automatically parse
     *            the default unique identifier found in the subject from the
     *            SAML token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminLinkProviderForUserRequest withSourceUser(ProviderUserIdentifierType sourceUser) {
        this.sourceUser = sourceUser;
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
        if (getDestinationUser() != null)
            sb.append("DestinationUser: " + getDestinationUser() + ",");
        if (getSourceUser() != null)
            sb.append("SourceUser: " + getSourceUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationUser() == null) ? 0 : getDestinationUser().hashCode());
        hashCode = prime * hashCode + ((getSourceUser() == null) ? 0 : getSourceUser().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminLinkProviderForUserRequest == false)
            return false;
        AdminLinkProviderForUserRequest other = (AdminLinkProviderForUserRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getDestinationUser() == null ^ this.getDestinationUser() == null)
            return false;
        if (other.getDestinationUser() != null
                && other.getDestinationUser().equals(this.getDestinationUser()) == false)
            return false;
        if (other.getSourceUser() == null ^ this.getSourceUser() == null)
            return false;
        if (other.getSourceUser() != null
                && other.getSourceUser().equals(this.getSourceUser()) == false)
            return false;
        return true;
    }
}
