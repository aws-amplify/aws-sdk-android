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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>AssumeRoleWithWebIdentity</a>
 * request, including temporary AWS credentials that can be used to make AWS
 * requests.
 * </p>
 */
public class AssumeRoleWithWebIdentityResult implements Serializable {
    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security token.
     * </p>
     * <note>
     * <p>
     * The size of the security token that STS API operations return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size.
     * </p>
     * </note>
     */
    private Credentials credentials;

    /**
     * <p>
     * The unique user identifier that is returned by the identity provider.
     * This identifier is associated with the <code>WebIdentityToken</code> that
     * was submitted with the <code>AssumeRoleWithWebIdentity</code> call. The
     * identifier is typically unique to the user and the application that
     * acquired the <code>WebIdentityToken</code> (pairwise identifier). For
     * OpenID Connect ID tokens, this field contains the value returned by the
     * identity provider as the token's <code>sub</code> (Subject) claim.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 255<br/>
     */
    private String subjectFromWebIdentityToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary security
     * credentials. For example, you can reference these credentials as a
     * principal in a resource-based policy by using the ARN or assumed role ID.
     * The ARN and ID include the <code>RoleSessionName</code> that you
     * specified when you called <code>AssumeRole</code>.
     * </p>
     */
    private AssumedRoleUser assumedRoleUser;

    /**
     * <p>
     * A percentage value that indicates the packed size of the session policies
     * and session tags combined passed in the request. The request fails if the
     * packed size is greater than 100 percent, which means the policies and
     * tags exceeded the allowed space.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer packedPolicySize;

    /**
     * <p>
     * The issuing authority of the web identity token presented. For OpenID
     * Connect ID tokens, this contains the value of the <code>iss</code> field.
     * For OAuth 2.0 access tokens, this contains the value of the
     * <code>ProviderId</code> parameter that was passed in the
     * <code>AssumeRoleWithWebIdentity</code> request.
     * </p>
     */
    private String provider;

    /**
     * <p>
     * The intended audience (also known as client ID) of the web identity
     * token. This is traditionally the client identifier issued to the
     * application that requested the web identity token.
     * </p>
     */
    private String audience;

    /**
     * <p>
     * The value of the source identity that is returned in the JSON web token
     * (JWT) from the identity provider.
     * </p>
     * <p>
     * You can require users to set a source identity value when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. That way, actions that are taken with the
     * role are associated with that user. After the source identity is set, the
     * value cannot be changed. It is present in the request for all actions
     * that are taken by the role and persists across <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     * >chained role</a> sessions. You can configure your identity provider to
     * use an attribute associated with your users, like user name or email, as
     * the source identity when calling <code>AssumeRoleWithWebIdentity</code>.
     * You do this by adding a claim to the JSON web token. To learn more about
     * OIDC tokens and claims, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html"
     * >Using Tokens with User Pools</a> in the <i>Amazon Cognito Developer
     * Guide</i>. For more information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String sourceIdentity;

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security token.
     * </p>
     * <note>
     * <p>
     * The size of the security token that STS API operations return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size.
     * </p>
     * </note>
     *
     * @return <p>
     *         The temporary security credentials, which include an access key
     *         ID, a secret access key, and a security token.
     *         </p>
     *         <note>
     *         <p>
     *         The size of the security token that STS API operations return is
     *         not fixed. We strongly recommend that you make no assumptions
     *         about the maximum size.
     *         </p>
     *         </note>
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security token.
     * </p>
     * <note>
     * <p>
     * The size of the security token that STS API operations return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size.
     * </p>
     * </note>
     *
     * @param credentials <p>
     *            The temporary security credentials, which include an access
     *            key ID, a secret access key, and a security token.
     *            </p>
     *            <note>
     *            <p>
     *            The size of the security token that STS API operations return
     *            is not fixed. We strongly recommend that you make no
     *            assumptions about the maximum size.
     *            </p>
     *            </note>
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a
     * secret access key, and a security token.
     * </p>
     * <note>
     * <p>
     * The size of the security token that STS API operations return is not
     * fixed. We strongly recommend that you make no assumptions about the
     * maximum size.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentials <p>
     *            The temporary security credentials, which include an access
     *            key ID, a secret access key, and a security token.
     *            </p>
     *            <note>
     *            <p>
     *            The size of the security token that STS API operations return
     *            is not fixed. We strongly recommend that you make no
     *            assumptions about the maximum size.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * <p>
     * The unique user identifier that is returned by the identity provider.
     * This identifier is associated with the <code>WebIdentityToken</code> that
     * was submitted with the <code>AssumeRoleWithWebIdentity</code> call. The
     * identifier is typically unique to the user and the application that
     * acquired the <code>WebIdentityToken</code> (pairwise identifier). For
     * OpenID Connect ID tokens, this field contains the value returned by the
     * identity provider as the token's <code>sub</code> (Subject) claim.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 255<br/>
     *
     * @return <p>
     *         The unique user identifier that is returned by the identity
     *         provider. This identifier is associated with the
     *         <code>WebIdentityToken</code> that was submitted with the
     *         <code>AssumeRoleWithWebIdentity</code> call. The identifier is
     *         typically unique to the user and the application that acquired
     *         the <code>WebIdentityToken</code> (pairwise identifier). For
     *         OpenID Connect ID tokens, this field contains the value returned
     *         by the identity provider as the token's <code>sub</code>
     *         (Subject) claim.
     *         </p>
     */
    public String getSubjectFromWebIdentityToken() {
        return subjectFromWebIdentityToken;
    }

    /**
     * <p>
     * The unique user identifier that is returned by the identity provider.
     * This identifier is associated with the <code>WebIdentityToken</code> that
     * was submitted with the <code>AssumeRoleWithWebIdentity</code> call. The
     * identifier is typically unique to the user and the application that
     * acquired the <code>WebIdentityToken</code> (pairwise identifier). For
     * OpenID Connect ID tokens, this field contains the value returned by the
     * identity provider as the token's <code>sub</code> (Subject) claim.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 255<br/>
     *
     * @param subjectFromWebIdentityToken <p>
     *            The unique user identifier that is returned by the identity
     *            provider. This identifier is associated with the
     *            <code>WebIdentityToken</code> that was submitted with the
     *            <code>AssumeRoleWithWebIdentity</code> call. The identifier is
     *            typically unique to the user and the application that acquired
     *            the <code>WebIdentityToken</code> (pairwise identifier). For
     *            OpenID Connect ID tokens, this field contains the value
     *            returned by the identity provider as the token's
     *            <code>sub</code> (Subject) claim.
     *            </p>
     */
    public void setSubjectFromWebIdentityToken(String subjectFromWebIdentityToken) {
        this.subjectFromWebIdentityToken = subjectFromWebIdentityToken;
    }

    /**
     * <p>
     * The unique user identifier that is returned by the identity provider.
     * This identifier is associated with the <code>WebIdentityToken</code> that
     * was submitted with the <code>AssumeRoleWithWebIdentity</code> call. The
     * identifier is typically unique to the user and the application that
     * acquired the <code>WebIdentityToken</code> (pairwise identifier). For
     * OpenID Connect ID tokens, this field contains the value returned by the
     * identity provider as the token's <code>sub</code> (Subject) claim.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 255<br/>
     *
     * @param subjectFromWebIdentityToken <p>
     *            The unique user identifier that is returned by the identity
     *            provider. This identifier is associated with the
     *            <code>WebIdentityToken</code> that was submitted with the
     *            <code>AssumeRoleWithWebIdentity</code> call. The identifier is
     *            typically unique to the user and the application that acquired
     *            the <code>WebIdentityToken</code> (pairwise identifier). For
     *            OpenID Connect ID tokens, this field contains the value
     *            returned by the identity provider as the token's
     *            <code>sub</code> (Subject) claim.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityResult withSubjectFromWebIdentityToken(
            String subjectFromWebIdentityToken) {
        this.subjectFromWebIdentityToken = subjectFromWebIdentityToken;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary security
     * credentials. For example, you can reference these credentials as a
     * principal in a resource-based policy by using the ARN or assumed role ID.
     * The ARN and ID include the <code>RoleSessionName</code> that you
     * specified when you called <code>AssumeRole</code>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) and the assumed role ID, which are
     *         identifiers that you can use to refer to the resulting temporary
     *         security credentials. For example, you can reference these
     *         credentials as a principal in a resource-based policy by using
     *         the ARN or assumed role ID. The ARN and ID include the
     *         <code>RoleSessionName</code> that you specified when you called
     *         <code>AssumeRole</code>.
     *         </p>
     */
    public AssumedRoleUser getAssumedRoleUser() {
        return assumedRoleUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary security
     * credentials. For example, you can reference these credentials as a
     * principal in a resource-based policy by using the ARN or assumed role ID.
     * The ARN and ID include the <code>RoleSessionName</code> that you
     * specified when you called <code>AssumeRole</code>.
     * </p>
     *
     * @param assumedRoleUser <p>
     *            The Amazon Resource Name (ARN) and the assumed role ID, which
     *            are identifiers that you can use to refer to the resulting
     *            temporary security credentials. For example, you can reference
     *            these credentials as a principal in a resource-based policy by
     *            using the ARN or assumed role ID. The ARN and ID include the
     *            <code>RoleSessionName</code> that you specified when you
     *            called <code>AssumeRole</code>.
     *            </p>
     */
    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) and the assumed role ID, which are
     * identifiers that you can use to refer to the resulting temporary security
     * credentials. For example, you can reference these credentials as a
     * principal in a resource-based policy by using the ARN or assumed role ID.
     * The ARN and ID include the <code>RoleSessionName</code> that you
     * specified when you called <code>AssumeRole</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assumedRoleUser <p>
     *            The Amazon Resource Name (ARN) and the assumed role ID, which
     *            are identifiers that you can use to refer to the resulting
     *            temporary security credentials. For example, you can reference
     *            these credentials as a principal in a resource-based policy by
     *            using the ARN or assumed role ID. The ARN and ID include the
     *            <code>RoleSessionName</code> that you specified when you
     *            called <code>AssumeRole</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
        return this;
    }

    /**
     * <p>
     * A percentage value that indicates the packed size of the session policies
     * and session tags combined passed in the request. The request fails if the
     * packed size is greater than 100 percent, which means the policies and
     * tags exceeded the allowed space.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         A percentage value that indicates the packed size of the session
     *         policies and session tags combined passed in the request. The
     *         request fails if the packed size is greater than 100 percent,
     *         which means the policies and tags exceeded the allowed space.
     *         </p>
     */
    public Integer getPackedPolicySize() {
        return packedPolicySize;
    }

    /**
     * <p>
     * A percentage value that indicates the packed size of the session policies
     * and session tags combined passed in the request. The request fails if the
     * packed size is greater than 100 percent, which means the policies and
     * tags exceeded the allowed space.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize <p>
     *            A percentage value that indicates the packed size of the
     *            session policies and session tags combined passed in the
     *            request. The request fails if the packed size is greater than
     *            100 percent, which means the policies and tags exceeded the
     *            allowed space.
     *            </p>
     */
    public void setPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
    }

    /**
     * <p>
     * A percentage value that indicates the packed size of the session policies
     * and session tags combined passed in the request. The request fails if the
     * packed size is greater than 100 percent, which means the policies and
     * tags exceeded the allowed space.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param packedPolicySize <p>
     *            A percentage value that indicates the packed size of the
     *            session policies and session tags combined passed in the
     *            request. The request fails if the packed size is greater than
     *            100 percent, which means the policies and tags exceeded the
     *            allowed space.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityResult withPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
        return this;
    }

    /**
     * <p>
     * The issuing authority of the web identity token presented. For OpenID
     * Connect ID tokens, this contains the value of the <code>iss</code> field.
     * For OAuth 2.0 access tokens, this contains the value of the
     * <code>ProviderId</code> parameter that was passed in the
     * <code>AssumeRoleWithWebIdentity</code> request.
     * </p>
     *
     * @return <p>
     *         The issuing authority of the web identity token presented. For
     *         OpenID Connect ID tokens, this contains the value of the
     *         <code>iss</code> field. For OAuth 2.0 access tokens, this
     *         contains the value of the <code>ProviderId</code> parameter that
     *         was passed in the <code>AssumeRoleWithWebIdentity</code> request.
     *         </p>
     */
    public String getProvider() {
        return provider;
    }

    /**
     * <p>
     * The issuing authority of the web identity token presented. For OpenID
     * Connect ID tokens, this contains the value of the <code>iss</code> field.
     * For OAuth 2.0 access tokens, this contains the value of the
     * <code>ProviderId</code> parameter that was passed in the
     * <code>AssumeRoleWithWebIdentity</code> request.
     * </p>
     *
     * @param provider <p>
     *            The issuing authority of the web identity token presented. For
     *            OpenID Connect ID tokens, this contains the value of the
     *            <code>iss</code> field. For OAuth 2.0 access tokens, this
     *            contains the value of the <code>ProviderId</code> parameter
     *            that was passed in the <code>AssumeRoleWithWebIdentity</code>
     *            request.
     *            </p>
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The issuing authority of the web identity token presented. For OpenID
     * Connect ID tokens, this contains the value of the <code>iss</code> field.
     * For OAuth 2.0 access tokens, this contains the value of the
     * <code>ProviderId</code> parameter that was passed in the
     * <code>AssumeRoleWithWebIdentity</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provider <p>
     *            The issuing authority of the web identity token presented. For
     *            OpenID Connect ID tokens, this contains the value of the
     *            <code>iss</code> field. For OAuth 2.0 access tokens, this
     *            contains the value of the <code>ProviderId</code> parameter
     *            that was passed in the <code>AssumeRoleWithWebIdentity</code>
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityResult withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * <p>
     * The intended audience (also known as client ID) of the web identity
     * token. This is traditionally the client identifier issued to the
     * application that requested the web identity token.
     * </p>
     *
     * @return <p>
     *         The intended audience (also known as client ID) of the web
     *         identity token. This is traditionally the client identifier
     *         issued to the application that requested the web identity token.
     *         </p>
     */
    public String getAudience() {
        return audience;
    }

    /**
     * <p>
     * The intended audience (also known as client ID) of the web identity
     * token. This is traditionally the client identifier issued to the
     * application that requested the web identity token.
     * </p>
     *
     * @param audience <p>
     *            The intended audience (also known as client ID) of the web
     *            identity token. This is traditionally the client identifier
     *            issued to the application that requested the web identity
     *            token.
     *            </p>
     */
    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * <p>
     * The intended audience (also known as client ID) of the web identity
     * token. This is traditionally the client identifier issued to the
     * application that requested the web identity token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audience <p>
     *            The intended audience (also known as client ID) of the web
     *            identity token. This is traditionally the client identifier
     *            issued to the application that requested the web identity
     *            token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityResult withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * <p>
     * The value of the source identity that is returned in the JSON web token
     * (JWT) from the identity provider.
     * </p>
     * <p>
     * You can require users to set a source identity value when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. That way, actions that are taken with the
     * role are associated with that user. After the source identity is set, the
     * value cannot be changed. It is present in the request for all actions
     * that are taken by the role and persists across <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     * >chained role</a> sessions. You can configure your identity provider to
     * use an attribute associated with your users, like user name or email, as
     * the source identity when calling <code>AssumeRoleWithWebIdentity</code>.
     * You do this by adding a claim to the JSON web token. To learn more about
     * OIDC tokens and claims, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html"
     * >Using Tokens with User Pools</a> in the <i>Amazon Cognito Developer
     * Guide</i>. For more information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         The value of the source identity that is returned in the JSON web
     *         token (JWT) from the identity provider.
     *         </p>
     *         <p>
     *         You can require users to set a source identity value when they
     *         assume a role. You do this by using the
     *         <code>sts:SourceIdentity</code> condition key in a role trust
     *         policy. That way, actions that are taken with the role are
     *         associated with that user. After the source identity is set, the
     *         value cannot be changed. It is present in the request for all
     *         actions that are taken by the role and persists across <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     *         >chained role</a> sessions. You can configure your identity
     *         provider to use an attribute associated with your users, like
     *         user name or email, as the source identity when calling
     *         <code>AssumeRoleWithWebIdentity</code>. You do this by adding a
     *         claim to the JSON web token. To learn more about OIDC tokens and
     *         claims, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html"
     *         >Using Tokens with User Pools</a> in the <i>Amazon Cognito
     *         Developer Guide</i>. For more information about using source
     *         identity, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *         >Monitor and control actions taken with assumed roles</a> in the
     *         <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@-
     *         </p>
     */
    public String getSourceIdentity() {
        return sourceIdentity;
    }

    /**
     * <p>
     * The value of the source identity that is returned in the JSON web token
     * (JWT) from the identity provider.
     * </p>
     * <p>
     * You can require users to set a source identity value when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. That way, actions that are taken with the
     * role are associated with that user. After the source identity is set, the
     * value cannot be changed. It is present in the request for all actions
     * that are taken by the role and persists across <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     * >chained role</a> sessions. You can configure your identity provider to
     * use an attribute associated with your users, like user name or email, as
     * the source identity when calling <code>AssumeRoleWithWebIdentity</code>.
     * You do this by adding a claim to the JSON web token. To learn more about
     * OIDC tokens and claims, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html"
     * >Using Tokens with User Pools</a> in the <i>Amazon Cognito Developer
     * Guide</i>. For more information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param sourceIdentity <p>
     *            The value of the source identity that is returned in the JSON
     *            web token (JWT) from the identity provider.
     *            </p>
     *            <p>
     *            You can require users to set a source identity value when they
     *            assume a role. You do this by using the
     *            <code>sts:SourceIdentity</code> condition key in a role trust
     *            policy. That way, actions that are taken with the role are
     *            associated with that user. After the source identity is set,
     *            the value cannot be changed. It is present in the request for
     *            all actions that are taken by the role and persists across <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     *            >chained role</a> sessions. You can configure your identity
     *            provider to use an attribute associated with your users, like
     *            user name or email, as the source identity when calling
     *            <code>AssumeRoleWithWebIdentity</code>. You do this by adding
     *            a claim to the JSON web token. To learn more about OIDC tokens
     *            and claims, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html"
     *            >Using Tokens with User Pools</a> in the <i>Amazon Cognito
     *            Developer Guide</i>. For more information about using source
     *            identity, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *            >Monitor and control actions taken with assumed roles</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     */
    public void setSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
    }

    /**
     * <p>
     * The value of the source identity that is returned in the JSON web token
     * (JWT) from the identity provider.
     * </p>
     * <p>
     * You can require users to set a source identity value when they assume a
     * role. You do this by using the <code>sts:SourceIdentity</code> condition
     * key in a role trust policy. That way, actions that are taken with the
     * role are associated with that user. After the source identity is set, the
     * value cannot be changed. It is present in the request for all actions
     * that are taken by the role and persists across <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     * >chained role</a> sessions. You can configure your identity provider to
     * use an attribute associated with your users, like user name or email, as
     * the source identity when calling <code>AssumeRoleWithWebIdentity</code>.
     * You do this by adding a claim to the JSON web token. To learn more about
     * OIDC tokens and claims, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html"
     * >Using Tokens with User Pools</a> in the <i>Amazon Cognito Developer
     * Guide</i>. For more information about using source identity, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >Monitor and control actions taken with assumed roles</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * The regex used to validate this parameter is a string of characters
     * consisting of upper- and lower-case alphanumeric characters with no
     * spaces. You can also include underscores or any of the following
     * characters: =,.@-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param sourceIdentity <p>
     *            The value of the source identity that is returned in the JSON
     *            web token (JWT) from the identity provider.
     *            </p>
     *            <p>
     *            You can require users to set a source identity value when they
     *            assume a role. You do this by using the
     *            <code>sts:SourceIdentity</code> condition key in a role trust
     *            policy. That way, actions that are taken with the role are
     *            associated with that user. After the source identity is set,
     *            the value cannot be changed. It is present in the request for
     *            all actions that are taken by the role and persists across <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining"
     *            >chained role</a> sessions. You can configure your identity
     *            provider to use an attribute associated with your users, like
     *            user name or email, as the source identity when calling
     *            <code>AssumeRoleWithWebIdentity</code>. You do this by adding
     *            a claim to the JSON web token. To learn more about OIDC tokens
     *            and claims, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-using-tokens-with-identity-providers.html"
     *            >Using Tokens with User Pools</a> in the <i>Amazon Cognito
     *            Developer Guide</i>. For more information about using source
     *            identity, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *            >Monitor and control actions taken with assumed roles</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityResult withSourceIdentity(String sourceIdentity) {
        this.sourceIdentity = sourceIdentity;
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
        if (getCredentials() != null)
            sb.append("Credentials: " + getCredentials() + ",");
        if (getSubjectFromWebIdentityToken() != null)
            sb.append("SubjectFromWebIdentityToken: " + getSubjectFromWebIdentityToken() + ",");
        if (getAssumedRoleUser() != null)
            sb.append("AssumedRoleUser: " + getAssumedRoleUser() + ",");
        if (getPackedPolicySize() != null)
            sb.append("PackedPolicySize: " + getPackedPolicySize() + ",");
        if (getProvider() != null)
            sb.append("Provider: " + getProvider() + ",");
        if (getAudience() != null)
            sb.append("Audience: " + getAudience() + ",");
        if (getSourceIdentity() != null)
            sb.append("SourceIdentity: " + getSourceIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime
                * hashCode
                + ((getSubjectFromWebIdentityToken() == null) ? 0
                        : getSubjectFromWebIdentityToken().hashCode());
        hashCode = prime * hashCode
                + ((getAssumedRoleUser() == null) ? 0 : getAssumedRoleUser().hashCode());
        hashCode = prime * hashCode
                + ((getPackedPolicySize() == null) ? 0 : getPackedPolicySize().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getAudience() == null) ? 0 : getAudience().hashCode());
        hashCode = prime * hashCode
                + ((getSourceIdentity() == null) ? 0 : getSourceIdentity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleWithWebIdentityResult == false)
            return false;
        AssumeRoleWithWebIdentityResult other = (AssumeRoleWithWebIdentityResult) obj;

        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null
                && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getSubjectFromWebIdentityToken() == null
                ^ this.getSubjectFromWebIdentityToken() == null)
            return false;
        if (other.getSubjectFromWebIdentityToken() != null
                && other.getSubjectFromWebIdentityToken().equals(
                        this.getSubjectFromWebIdentityToken()) == false)
            return false;
        if (other.getAssumedRoleUser() == null ^ this.getAssumedRoleUser() == null)
            return false;
        if (other.getAssumedRoleUser() != null
                && other.getAssumedRoleUser().equals(this.getAssumedRoleUser()) == false)
            return false;
        if (other.getPackedPolicySize() == null ^ this.getPackedPolicySize() == null)
            return false;
        if (other.getPackedPolicySize() != null
                && other.getPackedPolicySize().equals(this.getPackedPolicySize()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getAudience() == null ^ this.getAudience() == null)
            return false;
        if (other.getAudience() != null && other.getAudience().equals(this.getAudience()) == false)
            return false;
        if (other.getSourceIdentity() == null ^ this.getSourceIdentity() == null)
            return false;
        if (other.getSourceIdentity() != null
                && other.getSourceIdentity().equals(this.getSourceIdentity()) == false)
            return false;
        return true;
    }
}
