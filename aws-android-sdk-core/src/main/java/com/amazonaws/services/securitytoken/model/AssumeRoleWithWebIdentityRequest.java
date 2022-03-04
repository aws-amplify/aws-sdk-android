/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a set of temporary security credentials for users who have been
 * authenticated in a mobile or web application with a web identity provider.
 * Example providers include the OAuth 2.0 providers Login with Amazon and
 * Facebook, or any OpenID Connect-compatible identity provider such as Google
 * or <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-identity.html"
 * >Amazon Cognito federated identities</a>.
 * </p>
 * <note>
 * <p>
 * For mobile applications, we recommend that you use Amazon Cognito. You can
 * use Amazon Cognito with the <a href="http://aws.amazon.com/sdkforios/">Amazon
 * Web Services SDK for iOS Developer Guide</a> and the <a
 * href="http://aws.amazon.com/sdkforandroid/">Amazon Web Services SDK for
 * Android Developer Guide</a> to uniquely identify a user. You can also supply
 * the user with a consistent identity throughout the lifetime of an
 * application.
 * </p>
 * <p>
 * To learn more about Amazon Cognito, see <a href=
 * "https://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840"
 * >Amazon Cognito Overview</a> in <i>Amazon Web Services SDK for Android
 * Developer Guide</i> and <a href=
 * "https://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664"
 * >Amazon Cognito Overview</a> in the <i>Amazon Web Services SDK for iOS
 * Developer Guide</i>.
 * </p>
 * </note>
 * <p>
 * Calling <code>AssumeRoleWithWebIdentity</code> does not require the use of
 * Amazon Web Services security credentials. Therefore, you can distribute an
 * application (for example, on mobile devices) that requests temporary security
 * credentials without including long-term Amazon Web Services credentials in
 * the application. You also don't need to deploy server-based proxy services
 * that use long-term Amazon Web Services credentials. Instead, the identity of
 * the caller is validated by using a token from the web identity provider. For
 * a comparison of <code>AssumeRoleWithWebIdentity</code> with the other API
 * operations that produce temporary credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
 * >Requesting Temporary Security Credentials</a> and <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
 * >Comparing the Amazon Web Services STS API operations</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * <p>
 * The temporary security credentials returned by this API consist of an access
 * key ID, a secret access key, and a security token. Applications can use these
 * temporary security credentials to sign calls to Amazon Web Services service
 * API operations.
 * </p>
 * <p>
 * <b>Session Duration</b>
 * </p>
 * <p>
 * By default, the temporary security credentials created by
 * <code>AssumeRoleWithWebIdentity</code> last for one hour. However, you can
 * use the optional <code>DurationSeconds</code> parameter to specify the
 * duration of your session. You can provide a value from 900 seconds (15
 * minutes) up to the maximum session duration setting for the role. This
 * setting can have a value from 1 hour to 12 hours. To learn how to view the
 * maximum value for your role, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
 * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User
 * Guide</i>. The maximum session duration limit applies when you use the
 * <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
 * commands. However the limit does not apply when you use those operations to
 * create a console URL. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
 * >Using IAM Roles</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * The temporary security credentials created by
 * <code>AssumeRoleWithWebIdentity</code> can be used to make API calls to any
 * Amazon Web Services service with the following exception: you cannot call the
 * STS <code>GetFederationToken</code> or <code>GetSessionToken</code> API
 * operations.
 * </p>
 * <p>
 * (Optional) You can pass inline or managed <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >session policies</a> to this operation. You can pass a single JSON policy
 * document to use as an inline session policy. You can also specify up to 10
 * managed policies to use as managed session policies. The plaintext that you
 * use for both inline and managed session policies can't exceed 2,048
 * characters. Passing policies to this operation returns new temporary
 * credentials. The resulting session's permissions are the intersection of the
 * role's identity-based policy and the session policies. You can use the role's
 * temporary credentials in subsequent Amazon Web Services API calls to access
 * resources in the account that owns the role. You cannot use session policies
 * to grant more permissions than those allowed by the identity-based policy of
 * the role that is being assumed. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
 * >Session Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Tags</b>
 * </p>
 * <p>
 * (Optional) You can configure your IdP to pass attributes into your web
 * identity token as session tags. Each session tag consists of a key name and
 * an associated value. For more information about session tags, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html"
 * >Passing Session Tags in STS</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * You can pass up to 50 session tags. The plaintext session tag keys can’t
 * exceed 128 characters and the values can’t exceed 256 characters. For these
 * and additional limits, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length"
 * >IAM and STS Character Limits</a> in the <i>IAM User Guide</i>.
 * </p>
 * <note>
 * <p>
 * An Amazon Web Services conversion compresses the passed session policies and
 * session tags into a packed binary format that has a separate limit. Your
 * request can fail for this limit even if your plaintext meets the other
 * requirements. The <code>PackedPolicySize</code> response element indicates by
 * percentage how close the policies and tags for your request are to the upper
 * size limit.
 * </p>
 * </note>
 * <p>
 * You can pass a session tag with the same key as a tag that is attached to the
 * role. When you do, the session tag overrides the role tag with the same key.
 * </p>
 * <p>
 * An administrator must grant you the permissions necessary to pass session
 * tags. The administrator can also create granular permissions to allow you to
 * pass only specific session tags. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_attribute-based-access-control.html"
 * >Tutorial: Using Tags for Attribute-Based Access Control</a> in the <i>IAM
 * User Guide</i>.
 * </p>
 * <p>
 * You can set the session tags as transitive. Transitive tags persist during
 * role chaining. For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html#id_session-tags_role-chaining"
 * >Chaining Roles with Session Tags</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * <b>Identities</b>
 * </p>
 * <p>
 * Before your application can call <code>AssumeRoleWithWebIdentity</code>, you
 * must have an identity token from a supported identity provider and create a
 * role that the application can assume. The role that your application assumes
 * must trust the identity provider that is associated with the identity token.
 * In other words, the identity provider must be specified in the role's trust
 * policy.
 * </p>
 * <important>
 * <p>
 * Calling <code>AssumeRoleWithWebIdentity</code> can result in an entry in your
 * CloudTrail logs. The entry includes the <a
 * href="http://openid.net/specs/openid-connect-core-1_0.html#Claims"
 * >Subject</a> of the provided web identity token. We recommend that you avoid
 * using any personally identifiable information (PII) in this field. For
 * example, you could instead use a GUID or a pairwise identifier, as <a
 * href="http://openid.net/specs/openid-connect-core-1_0.html#SubjectIDTypes"
 * >suggested in the OIDC specification</a>.
 * </p>
 * </important>
 * <p>
 * For more information about how to use web identity federation and the
 * <code>AssumeRoleWithWebIdentity</code> API, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html"
 * >Using Web Identity Federation API Operations for Mobile Apps</a> and <a
 * href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
 * >Federation Through a Web-based Identity Provider</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://aws.amazon.com/blogs/aws/the-aws-web-identity-federation-playground/"
 * > Web Identity Federation Playground</a>. Walk through the process of
 * authenticating through Login with Amazon, Facebook, or Google, getting
 * temporary security credentials, and then using those credentials to make a
 * request to Amazon Web Services.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/sdkforios/">Amazon Web Services SDK for iOS
 * Developer Guide</a> and <a href="http://aws.amazon.com/sdkforandroid/">Amazon
 * Web Services SDK for Android Developer Guide</a>. These toolkits contain
 * sample apps that show how to invoke the identity providers. The toolkits then
 * show how to use the information from these providers to get and use temporary
 * security credentials.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "http://aws.amazon.com/articles/web-identity-federation-with-mobile-applications"
 * >Web Identity Federation with Mobile Applications</a>. This article discusses
 * web identity federation and shows an example of how to use web identity
 * federation to get access to content in Amazon S3.
 * </p>
 * </li>
 * </ul>
 */
public class AssumeRoleWithWebIdentityRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     */
    private String roleArn;

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name
     * or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name is
     * included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
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
    private String roleSessionName;

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by
     * the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web identity
     * provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 20000<br/>
     */
    private String webIdentityToken;

    /**
     * <p>
     * The fully qualified host component of the domain name of the OAuth 2.0
     * identity provider. Do not specify this value for an OpenID Connect
     * identity provider.
     * </p>
     * <p>
     * Currently <code>www.amazon.com</code> and <code>graph.facebook.com</code>
     * are the only supported identity providers for OAuth 2.0 access tokens. Do
     * not include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     */
    private String providerId;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private java.util.List<PolicyDescriptorType> policyArns;

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns
     * new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session
     * policies. You can use the role's temporary credentials in subsequent
     * Amazon Web Services API calls to access resources in the account that
     * owns the role. You cannot use session policies to grant more permissions
     * than those allowed by the identity-based policy of the role that is being
     * assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String policy;

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails. To learn how to view the maximum value for your role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the Amazon Web
     * Services Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role that the caller is
     *            assuming.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role that the caller is
     *            assuming.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name
     * or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name is
     * included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
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
     *         An identifier for the assumed role session. Typically, you pass
     *         the name or identifier that is associated with the user who is
     *         using your application. That way, the temporary security
     *         credentials that your application will use are associated with
     *         that user. This session name is included as part of the ARN and
     *         assumed role ID in the <code>AssumedRoleUser</code> response
     *         element.
     *         </p>
     *         <p>
     *         The regex used to validate this parameter is a string of
     *         characters consisting of upper- and lower-case alphanumeric
     *         characters with no spaces. You can also include underscores or
     *         any of the following characters: =,.@-
     *         </p>
     */
    public String getRoleSessionName() {
        return roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name
     * or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name is
     * included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
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
     * @param roleSessionName <p>
     *            An identifier for the assumed role session. Typically, you
     *            pass the name or identifier that is associated with the user
     *            who is using your application. That way, the temporary
     *            security credentials that your application will use are
     *            associated with that user. This session name is included as
     *            part of the ARN and assumed role ID in the
     *            <code>AssumedRoleUser</code> response element.
     *            </p>
     *            <p>
     *            The regex used to validate this parameter is a string of
     *            characters consisting of upper- and lower-case alphanumeric
     *            characters with no spaces. You can also include underscores or
     *            any of the following characters: =,.@-
     *            </p>
     */
    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name
     * or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name is
     * included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
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
     * @param roleSessionName <p>
     *            An identifier for the assumed role session. Typically, you
     *            pass the name or identifier that is associated with the user
     *            who is using your application. That way, the temporary
     *            security credentials that your application will use are
     *            associated with that user. This session name is included as
     *            part of the ARN and assumed role ID in the
     *            <code>AssumedRoleUser</code> response element.
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
    public AssumeRoleWithWebIdentityRequest withRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
        return this;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by
     * the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web identity
     * provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 20000<br/>
     *
     * @return <p>
     *         The OAuth 2.0 access token or OpenID Connect ID token that is
     *         provided by the identity provider. Your application must get this
     *         token by authenticating the user who is using your application
     *         with a web identity provider before the application makes an
     *         <code>AssumeRoleWithWebIdentity</code> call.
     *         </p>
     */
    public String getWebIdentityToken() {
        return webIdentityToken;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by
     * the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web identity
     * provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 20000<br/>
     *
     * @param webIdentityToken <p>
     *            The OAuth 2.0 access token or OpenID Connect ID token that is
     *            provided by the identity provider. Your application must get
     *            this token by authenticating the user who is using your
     *            application with a web identity provider before the
     *            application makes an <code>AssumeRoleWithWebIdentity</code>
     *            call.
     *            </p>
     */
    public void setWebIdentityToken(String webIdentityToken) {
        this.webIdentityToken = webIdentityToken;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by
     * the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web identity
     * provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 20000<br/>
     *
     * @param webIdentityToken <p>
     *            The OAuth 2.0 access token or OpenID Connect ID token that is
     *            provided by the identity provider. Your application must get
     *            this token by authenticating the user who is using your
     *            application with a web identity provider before the
     *            application makes an <code>AssumeRoleWithWebIdentity</code>
     *            call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityRequest withWebIdentityToken(String webIdentityToken) {
        this.webIdentityToken = webIdentityToken;
        return this;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the OAuth 2.0
     * identity provider. Do not specify this value for an OpenID Connect
     * identity provider.
     * </p>
     * <p>
     * Currently <code>www.amazon.com</code> and <code>graph.facebook.com</code>
     * are the only supported identity providers for OAuth 2.0 access tokens. Do
     * not include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @return <p>
     *         The fully qualified host component of the domain name of the
     *         OAuth 2.0 identity provider. Do not specify this value for an
     *         OpenID Connect identity provider.
     *         </p>
     *         <p>
     *         Currently <code>www.amazon.com</code> and
     *         <code>graph.facebook.com</code> are the only supported identity
     *         providers for OAuth 2.0 access tokens. Do not include URL schemes
     *         and port numbers.
     *         </p>
     *         <p>
     *         Do not specify this value for OpenID Connect ID tokens.
     *         </p>
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the OAuth 2.0
     * identity provider. Do not specify this value for an OpenID Connect
     * identity provider.
     * </p>
     * <p>
     * Currently <code>www.amazon.com</code> and <code>graph.facebook.com</code>
     * are the only supported identity providers for OAuth 2.0 access tokens. Do
     * not include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @param providerId <p>
     *            The fully qualified host component of the domain name of the
     *            OAuth 2.0 identity provider. Do not specify this value for an
     *            OpenID Connect identity provider.
     *            </p>
     *            <p>
     *            Currently <code>www.amazon.com</code> and
     *            <code>graph.facebook.com</code> are the only supported
     *            identity providers for OAuth 2.0 access tokens. Do not include
     *            URL schemes and port numbers.
     *            </p>
     *            <p>
     *            Do not specify this value for OpenID Connect ID tokens.
     *            </p>
     */
    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the OAuth 2.0
     * identity provider. Do not specify this value for an OpenID Connect
     * identity provider.
     * </p>
     * <p>
     * Currently <code>www.amazon.com</code> and <code>graph.facebook.com</code>
     * are the only supported identity providers for OAuth 2.0 access tokens. Do
     * not include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @param providerId <p>
     *            The fully qualified host component of the domain name of the
     *            OAuth 2.0 identity provider. Do not specify this value for an
     *            OpenID Connect identity provider.
     *            </p>
     *            <p>
     *            Currently <code>www.amazon.com</code> and
     *            <code>graph.facebook.com</code> are the only supported
     *            identity providers for OAuth 2.0 access tokens. Do not include
     *            URL schemes and port numbers.
     *            </p>
     *            <p>
     *            Do not specify this value for OpenID Connect ID tokens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityRequest withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Names (ARNs) of the IAM managed policies that
     *         you want to use as managed session policies. The policies must
     *         exist in the same account as the role.
     *         </p>
     *         <p>
     *         This parameter is optional. You can provide up to 10 managed
     *         policy ARNs. However, the plaintext that you use for both inline
     *         and managed session policies can't exceed 2,048 characters. For
     *         more information about ARNs, see <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *         Namespaces</a> in the Amazon Web Services General Reference.
     *         </p>
     *         <note>
     *         <p>
     *         An Amazon Web Services conversion compresses the passed session
     *         policies and session tags into a packed binary format that has a
     *         separate limit. Your request can fail for this limit even if your
     *         plaintext meets the other requirements. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policies and tags for your request are
     *         to the upper size limit.
     *         </p>
     *         </note>
     *         <p>
     *         Passing policies to this operation returns new temporary
     *         credentials. The resulting session's permissions are the
     *         intersection of the role's identity-based policy and the session
     *         policies. You can use the role's temporary credentials in
     *         subsequent Amazon Web Services API calls to access resources in
     *         the account that owns the role. You cannot use session policies
     *         to grant more permissions than those allowed by the
     *         identity-based policy of the role that is being assumed. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >Session Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public java.util.List<PolicyDescriptorType> getPolicyArns() {
        return policyArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as managed session policies. The policies
     *            must exist in the same account as the role.
     *            </p>
     *            <p>
     *            This parameter is optional. You can provide up to 10 managed
     *            policy ARNs. However, the plaintext that you use for both
     *            inline and managed session policies can't exceed 2,048
     *            characters. For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent Amazon Web Services API calls to access
     *            resources in the account that owns the role. You cannot use
     *            session policies to grant more permissions than those allowed
     *            by the identity-based policy of the role that is being
     *            assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setPolicyArns(java.util.Collection<PolicyDescriptorType> policyArns) {
        if (policyArns == null) {
            this.policyArns = null;
            return;
        }

        this.policyArns = new java.util.ArrayList<PolicyDescriptorType>(policyArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as managed session policies. The policies
     *            must exist in the same account as the role.
     *            </p>
     *            <p>
     *            This parameter is optional. You can provide up to 10 managed
     *            policy ARNs. However, the plaintext that you use for both
     *            inline and managed session policies can't exceed 2,048
     *            characters. For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent Amazon Web Services API calls to access
     *            resources in the account that owns the role. You cannot use
     *            session policies to grant more permissions than those allowed
     *            by the identity-based policy of the role that is being
     *            assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityRequest withPolicyArns(PolicyDescriptorType... policyArns) {
        if (getPolicyArns() == null) {
            this.policyArns = new java.util.ArrayList<PolicyDescriptorType>(policyArns.length);
        }
        for (PolicyDescriptorType value : policyArns) {
            this.policyArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the IAM managed policies that you
     * want to use as managed session policies. The policies must exist in the
     * same account as the role.
     * </p>
     * <p>
     * This parameter is optional. You can provide up to 10 managed policy ARNs.
     * However, the plaintext that you use for both inline and managed session
     * policies can't exceed 2,048 characters. For more information about ARNs,
     * see <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Names (ARNs) and Amazon Web Services Service
     * Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Passing policies to this operation returns new temporary credentials. The
     * resulting session's permissions are the intersection of the role's
     * identity-based policy and the session policies. You can use the role's
     * temporary credentials in subsequent Amazon Web Services API calls to
     * access resources in the account that owns the role. You cannot use
     * session policies to grant more permissions than those allowed by the
     * identity-based policy of the role that is being assumed. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArns <p>
     *            The Amazon Resource Names (ARNs) of the IAM managed policies
     *            that you want to use as managed session policies. The policies
     *            must exist in the same account as the role.
     *            </p>
     *            <p>
     *            This parameter is optional. You can provide up to 10 managed
     *            policy ARNs. However, the plaintext that you use for both
     *            inline and managed session policies can't exceed 2,048
     *            characters. For more information about ARNs, see <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *            >Amazon Resource Names (ARNs) and Amazon Web Services Service
     *            Namespaces</a> in the Amazon Web Services General Reference.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     *            <p>
     *            Passing policies to this operation returns new temporary
     *            credentials. The resulting session's permissions are the
     *            intersection of the role's identity-based policy and the
     *            session policies. You can use the role's temporary credentials
     *            in subsequent Amazon Web Services API calls to access
     *            resources in the account that owns the role. You cannot use
     *            session policies to grant more permissions than those allowed
     *            by the identity-based policy of the role that is being
     *            assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityRequest withPolicyArns(
            java.util.Collection<PolicyDescriptorType> policyArns) {
        setPolicyArns(policyArns);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns
     * new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session
     * policies. You can use the role's temporary credentials in subsequent
     * Amazon Web Services API calls to access resources in the account that
     * owns the role. You cannot use session policies to grant more permissions
     * than those allowed by the identity-based policy of the role that is being
     * assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         An IAM policy in JSON format that you want to use as an inline
     *         session policy.
     *         </p>
     *         <p>
     *         This parameter is optional. Passing policies to this operation
     *         returns new temporary credentials. The resulting session's
     *         permissions are the intersection of the role's identity-based
     *         policy and the session policies. You can use the role's temporary
     *         credentials in subsequent Amazon Web Services API calls to access
     *         resources in the account that owns the role. You cannot use
     *         session policies to grant more permissions than those allowed by
     *         the identity-based policy of the role that is being assumed. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *         >Session Policies</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         The plaintext that you use for both inline and managed session
     *         policies can't exceed 2,048 characters. The JSON policy
     *         characters can be any ASCII character from the space character to
     *         the end of the valid character list ( through \u00FF). It can
     *         also include the tab ( ), linefeed ( ), and carriage return ( )
     *         characters.
     *         </p>
     *         <note>
     *         <p>
     *         An Amazon Web Services conversion compresses the passed session
     *         policies and session tags into a packed binary format that has a
     *         separate limit. Your request can fail for this limit even if your
     *         plaintext meets the other requirements. The
     *         <code>PackedPolicySize</code> response element indicates by
     *         percentage how close the policies and tags for your request are
     *         to the upper size limit.
     *         </p>
     *         </note>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns
     * new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session
     * policies. You can use the role's temporary credentials in subsequent
     * Amazon Web Services API calls to access resources in the account that
     * owns the role. You cannot use session policies to grant more permissions
     * than those allowed by the identity-based policy of the role that is being
     * assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format that you want to use as an inline
     *            session policy.
     *            </p>
     *            <p>
     *            This parameter is optional. Passing policies to this operation
     *            returns new temporary credentials. The resulting session's
     *            permissions are the intersection of the role's identity-based
     *            policy and the session policies. You can use the role's
     *            temporary credentials in subsequent Amazon Web Services API
     *            calls to access resources in the account that owns the role.
     *            You cannot use session policies to grant more permissions than
     *            those allowed by the identity-based policy of the role that is
     *            being assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The plaintext that you use for both inline and managed session
     *            policies can't exceed 2,048 characters. The JSON policy
     *            characters can be any ASCII character from the space character
     *            to the end of the valid character list ( through \u00FF). It
     *            can also include the tab ( ), linefeed ( ), and carriage
     *            return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format that you want to use as an inline session
     * policy.
     * </p>
     * <p>
     * This parameter is optional. Passing policies to this operation returns
     * new temporary credentials. The resulting session's permissions are the
     * intersection of the role's identity-based policy and the session
     * policies. You can use the role's temporary credentials in subsequent
     * Amazon Web Services API calls to access resources in the account that
     * owns the role. You cannot use session policies to grant more permissions
     * than those allowed by the identity-based policy of the role that is being
     * assumed. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     * >Session Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The plaintext that you use for both inline and managed session policies
     * can't exceed 2,048 characters. The JSON policy characters can be any
     * ASCII character from the space character to the end of the valid
     * character list ( through \u00FF). It can also include the tab ( ),
     * linefeed ( ), and carriage return ( ) characters.
     * </p>
     * <note>
     * <p>
     * An Amazon Web Services conversion compresses the passed session policies
     * and session tags into a packed binary format that has a separate limit.
     * Your request can fail for this limit even if your plaintext meets the
     * other requirements. The <code>PackedPolicySize</code> response element
     * indicates by percentage how close the policies and tags for your request
     * are to the upper size limit.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param policy <p>
     *            An IAM policy in JSON format that you want to use as an inline
     *            session policy.
     *            </p>
     *            <p>
     *            This parameter is optional. Passing policies to this operation
     *            returns new temporary credentials. The resulting session's
     *            permissions are the intersection of the role's identity-based
     *            policy and the session policies. You can use the role's
     *            temporary credentials in subsequent Amazon Web Services API
     *            calls to access resources in the account that owns the role.
     *            You cannot use session policies to grant more permissions than
     *            those allowed by the identity-based policy of the role that is
     *            being assumed. For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session"
     *            >Session Policies</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            The plaintext that you use for both inline and managed session
     *            policies can't exceed 2,048 characters. The JSON policy
     *            characters can be any ASCII character from the space character
     *            to the end of the valid character list ( through \u00FF). It
     *            can also include the tab ( ), linefeed ( ), and carriage
     *            return ( ) characters.
     *            </p>
     *            <note>
     *            <p>
     *            An Amazon Web Services conversion compresses the passed
     *            session policies and session tags into a packed binary format
     *            that has a separate limit. Your request can fail for this
     *            limit even if your plaintext meets the other requirements. The
     *            <code>PackedPolicySize</code> response element indicates by
     *            percentage how close the policies and tags for your request
     *            are to the upper size limit.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails. To learn how to view the maximum value for your role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the Amazon Web
     * Services Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @return <p>
     *         The duration, in seconds, of the role session. The value can
     *         range from 900 seconds (15 minutes) up to the maximum session
     *         duration setting for the role. This setting can have a value from
     *         1 hour to 12 hours. If you specify a value higher than this
     *         setting, the operation fails. For example, if you specify a
     *         session duration of 12 hours, but your administrator set the
     *         maximum session duration to 6 hours, your operation fails. To
     *         learn how to view the maximum value for your role, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *         >View the Maximum Session Duration Setting for a Role</a> in the
     *         <i>IAM User Guide</i>.
     *         </p>
     *         <p>
     *         By default, the value is set to <code>3600</code> seconds.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>DurationSeconds</code> parameter is separate from the
     *         duration of a console session that you might request using the
     *         returned credentials. The request to the federation endpoint for
     *         a console sign-in token takes a <code>SessionDuration</code>
     *         parameter that specifies the maximum length of the console
     *         session. For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *         >Creating a URL that Enables Federated Users to Access the Amazon
     *         Web Services Management Console</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         </note>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails. To learn how to view the maximum value for your role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the Amazon Web
     * Services Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, of the role session. The value can
     *            range from 900 seconds (15 minutes) up to the maximum session
     *            duration setting for the role. This setting can have a value
     *            from 1 hour to 12 hours. If you specify a value higher than
     *            this setting, the operation fails. For example, if you specify
     *            a session duration of 12 hours, but your administrator set the
     *            maximum session duration to 6 hours, your operation fails. To
     *            learn how to view the maximum value for your role, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *            >View the Maximum Session Duration Setting for a Role</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            By default, the value is set to <code>3600</code> seconds.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>DurationSeconds</code> parameter is separate from
     *            the duration of a console session that you might request using
     *            the returned credentials. The request to the federation
     *            endpoint for a console sign-in token takes a
     *            <code>SessionDuration</code> parameter that specifies the
     *            maximum length of the console session. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *            >Creating a URL that Enables Federated Users to Access the
     *            Amazon Web Services Management Console</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            </note>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) up to the maximum session duration setting for
     * the role. This setting can have a value from 1 hour to 12 hours. If you
     * specify a value higher than this setting, the operation fails. For
     * example, if you specify a session duration of 12 hours, but your
     * administrator set the maximum session duration to 6 hours, your operation
     * fails. To learn how to view the maximum value for your role, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>.
     * </p>
     * <p>
     * By default, the value is set to <code>3600</code> seconds.
     * </p>
     * <note>
     * <p>
     * The <code>DurationSeconds</code> parameter is separate from the duration
     * of a console session that you might request using the returned
     * credentials. The request to the federation endpoint for a console sign-in
     * token takes a <code>SessionDuration</code> parameter that specifies the
     * maximum length of the console session. For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     * >Creating a URL that Enables Federated Users to Access the Amazon Web
     * Services Management Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, of the role session. The value can
     *            range from 900 seconds (15 minutes) up to the maximum session
     *            duration setting for the role. This setting can have a value
     *            from 1 hour to 12 hours. If you specify a value higher than
     *            this setting, the operation fails. For example, if you specify
     *            a session duration of 12 hours, but your administrator set the
     *            maximum session duration to 6 hours, your operation fails. To
     *            learn how to view the maximum value for your role, see <a
     *            href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     *            >View the Maximum Session Duration Setting for a Role</a> in
     *            the <i>IAM User Guide</i>.
     *            </p>
     *            <p>
     *            By default, the value is set to <code>3600</code> seconds.
     *            </p>
     *            <note>
     *            <p>
     *            The <code>DurationSeconds</code> parameter is separate from
     *            the duration of a console session that you might request using
     *            the returned credentials. The request to the federation
     *            endpoint for a console sign-in token takes a
     *            <code>SessionDuration</code> parameter that specifies the
     *            maximum length of the console session. For more information,
     *            see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-custom-url.html"
     *            >Creating a URL that Enables Federated Users to Access the
     *            Amazon Web Services Management Console</a> in the <i>IAM User
     *            Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithWebIdentityRequest withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getRoleSessionName() != null)
            sb.append("RoleSessionName: " + getRoleSessionName() + ",");
        if (getWebIdentityToken() != null)
            sb.append("WebIdentityToken: " + getWebIdentityToken() + ",");
        if (getProviderId() != null)
            sb.append("ProviderId: " + getProviderId() + ",");
        if (getPolicyArns() != null)
            sb.append("PolicyArns: " + getPolicyArns() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getRoleSessionName() == null) ? 0 : getRoleSessionName().hashCode());
        hashCode = prime * hashCode
                + ((getWebIdentityToken() == null) ? 0 : getWebIdentityToken().hashCode());
        hashCode = prime * hashCode + ((getProviderId() == null) ? 0 : getProviderId().hashCode());
        hashCode = prime * hashCode + ((getPolicyArns() == null) ? 0 : getPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleWithWebIdentityRequest == false)
            return false;
        AssumeRoleWithWebIdentityRequest other = (AssumeRoleWithWebIdentityRequest) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoleSessionName() == null ^ this.getRoleSessionName() == null)
            return false;
        if (other.getRoleSessionName() != null
                && other.getRoleSessionName().equals(this.getRoleSessionName()) == false)
            return false;
        if (other.getWebIdentityToken() == null ^ this.getWebIdentityToken() == null)
            return false;
        if (other.getWebIdentityToken() != null
                && other.getWebIdentityToken().equals(this.getWebIdentityToken()) == false)
            return false;
        if (other.getProviderId() == null ^ this.getProviderId() == null)
            return false;
        if (other.getProviderId() != null
                && other.getProviderId().equals(this.getProviderId()) == false)
            return false;
        if (other.getPolicyArns() == null ^ this.getPolicyArns() == null)
            return false;
        if (other.getPolicyArns() != null
                && other.getPolicyArns().equals(this.getPolicyArns()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }
}
