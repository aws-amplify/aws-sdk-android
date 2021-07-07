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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a set of temporary security credentials for users who have been
 * authenticated via a SAML authentication response. This operation provides a
 * mechanism for tying an enterprise identity store or directory to role-based
 * Amazon Web Services access without user-specific credentials or
 * configuration. For a comparison of <code>AssumeRoleWithSAML</code> with the
 * other API operations that produce temporary credentials, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
 * >Requesting Temporary Security Credentials</a> and <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
 * >Comparing the STS API operations</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * The temporary security credentials returned by this operation consist of an
 * access key ID, a secret access key, and a security token. Applications can
 * use these temporary security credentials to sign calls to Amazon Web Services
 * services.
 * </p>
 * <p>
 * <b>Session Duration</b>
 * </p>
 * <p>
 * By default, the temporary security credentials created by
 * <code>AssumeRoleWithSAML</code> last for one hour. However, you can use the
 * optional <code>DurationSeconds</code> parameter to specify the duration of
 * your session. Your role session lasts for the duration that you specify, or
 * until the time specified in the SAML authentication response's
 * <code>SessionNotOnOrAfter</code> value, whichever is shorter. You can provide
 * a <code>DurationSeconds</code> value from 900 seconds (15 minutes) up to the
 * maximum session duration setting for the role. This setting can have a value
 * from 1 hour to 12 hours. To learn how to view the maximum value for your
 * role, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
 * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM User
 * Guide</i>. The maximum session duration limit applies when you use the
 * <code>AssumeRole*</code> API operations or the <code>assume-role*</code> CLI
 * commands. However the limit does not apply when you use those operations to
 * create a console URL. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html"
 * >Using IAM Roles</a> in the <i>IAM User Guide</i>.
 * </p>
 * <note>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html#iam-term-role-chaining"
 * >Role chaining</a> limits your CLI or Amazon Web Services API role session to
 * a maximum of one hour. When you use the <code>AssumeRole</code> API operation
 * to assume a role, you can specify the duration of your role session with the
 * <code>DurationSeconds</code> parameter. You can specify a parameter value of
 * up to 43200 seconds (12 hours), depending on the maximum session duration
 * setting for your role. However, if you assume a role using role chaining and
 * provide a <code>DurationSeconds</code> parameter value greater than one hour,
 * the operation fails.
 * </p>
 * </note>
 * <p>
 * <b>Permissions</b>
 * </p>
 * <p>
 * The temporary security credentials created by <code>AssumeRoleWithSAML</code>
 * can be used to make API calls to any Amazon Web Services service with the
 * following exception: you cannot call the STS <code>GetFederationToken</code>
 * or <code>GetSessionToken</code> API operations.
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
 * Calling <code>AssumeRoleWithSAML</code> does not require the use of Amazon
 * Web Services security credentials. The identity of the caller is validated by
 * using keys in the metadata document that is uploaded for the SAML provider
 * entity for your identity provider.
 * </p>
 * <important>
 * <p>
 * Calling <code>AssumeRoleWithSAML</code> can result in an entry in your
 * CloudTrail logs. The entry includes the value in the <code>NameID</code>
 * element of the SAML assertion. We recommend that you use a
 * <code>NameIDType</code> that is not associated with any personally
 * identifiable information (PII). For example, you could instead use the
 * persistent identifier (
 * <code>urn:oasis:names:tc:SAML:2.0:nameid-format:persistent</code>).
 * </p>
 * </important>
 * <p>
 * <b>Tags</b>
 * </p>
 * <p>
 * (Optional) You can configure your IdP to pass attributes into your SAML
 * assertion as session tags. Each session tag consists of a key name and an
 * associated value. For more information about session tags, see <a href=
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
 * role. When you do, session tags override the role's tags with the same key.
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
 * <b>SAML Configuration</b>
 * </p>
 * <p>
 * Before your application can call <code>AssumeRoleWithSAML</code>, you must
 * configure your SAML identity provider (IdP) to issue the claims required by
 * Amazon Web Services. Additionally, you must use Identity and Access
 * Management (IAM) to create a SAML provider entity in your Amazon Web Services
 * account that represents your identity provider. You must also create an IAM
 * role that specifies this SAML provider in its trust policy.
 * </p>
 * <p>
 * For more information, see the following resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html"
 * >About SAML 2.0-based Federation</a> in the <i>IAM User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml.html"
 * >Creating SAML Identity Providers</a> in the <i>IAM User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_create_saml_relying-party.html"
 * >Configuring a Relying Party and Claims</a> in the <i>IAM User Guide</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-idp_saml.html"
 * >Creating a Role for SAML 2.0 Federation</a> in the <i>IAM User Guide</i>.
 * </p>
 * </li>
 * </ul>
 */
public class AssumeRoleWithSAMLRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes
     * the IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     */
    private String principalArn;

    /**
     * <p>
     * The base64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     * >Configuring a Relying Party and Adding Claims</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 100000<br/>
     */
    private String sAMLAssertion;

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
     * The duration, in seconds, of the role session. Your role session lasts
     * for the duration that you specify for the <code>DurationSeconds</code>
     * parameter, or until the time specified in the SAML authentication
     * response's <code>SessionNotOnOrAfter</code> value, whichever is shorter.
     * You can provide a <code>DurationSeconds</code> value from 900 seconds (15
     * minutes) up to the maximum session duration setting for the role. This
     * setting can have a value from 1 hour to 12 hours. If you specify a value
     * higher than this setting, the operation fails. For example, if you
     * specify a session duration of 12 hours, but your administrator set the
     * maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a href=
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
     * >Creating a URL that Enables Federated Users to Access the Management
     * Console</a> in the <i>IAM User Guide</i>.
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
    public AssumeRoleWithSAMLRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes
     * the IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the SAML provider in IAM that
     *         describes the IdP.
     *         </p>
     */
    public String getPrincipalArn() {
        return principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes
     * the IdP.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param principalArn <p>
     *            The Amazon Resource Name (ARN) of the SAML provider in IAM
     *            that describes the IdP.
     *            </p>
     */
    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes
     * the IdP.
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
     * @param principalArn <p>
     *            The Amazon Resource Name (ARN) of the SAML provider in IAM
     *            that describes the IdP.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLRequest withPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
        return this;
    }

    /**
     * <p>
     * The base64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     * >Configuring a Relying Party and Adding Claims</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 100000<br/>
     *
     * @return <p>
     *         The base64 encoded SAML authentication response provided by the
     *         IdP.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     *         >Configuring a Relying Party and Adding Claims</a> in the <i>IAM
     *         User Guide</i>.
     *         </p>
     */
    public String getSAMLAssertion() {
        return sAMLAssertion;
    }

    /**
     * <p>
     * The base64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     * >Configuring a Relying Party and Adding Claims</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 100000<br/>
     *
     * @param sAMLAssertion <p>
     *            The base64 encoded SAML authentication response provided by
     *            the IdP.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     *            >Configuring a Relying Party and Adding Claims</a> in the
     *            <i>IAM User Guide</i>.
     *            </p>
     */
    public void setSAMLAssertion(String sAMLAssertion) {
        this.sAMLAssertion = sAMLAssertion;
    }

    /**
     * <p>
     * The base64 encoded SAML authentication response provided by the IdP.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     * >Configuring a Relying Party and Adding Claims</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 100000<br/>
     *
     * @param sAMLAssertion <p>
     *            The base64 encoded SAML authentication response provided by
     *            the IdP.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/create-role-saml-IdP-tasks.html"
     *            >Configuring a Relying Party and Adding Claims</a> in the
     *            <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLRequest withSAMLAssertion(String sAMLAssertion) {
        this.sAMLAssertion = sAMLAssertion;
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
    public AssumeRoleWithSAMLRequest withPolicyArns(PolicyDescriptorType... policyArns) {
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
    public AssumeRoleWithSAMLRequest withPolicyArns(
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
    public AssumeRoleWithSAMLRequest withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. Your role session lasts
     * for the duration that you specify for the <code>DurationSeconds</code>
     * parameter, or until the time specified in the SAML authentication
     * response's <code>SessionNotOnOrAfter</code> value, whichever is shorter.
     * You can provide a <code>DurationSeconds</code> value from 900 seconds (15
     * minutes) up to the maximum session duration setting for the role. This
     * setting can have a value from 1 hour to 12 hours. If you specify a value
     * higher than this setting, the operation fails. For example, if you
     * specify a session duration of 12 hours, but your administrator set the
     * maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a href=
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
     * >Creating a URL that Enables Federated Users to Access the Management
     * Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @return <p>
     *         The duration, in seconds, of the role session. Your role session
     *         lasts for the duration that you specify for the
     *         <code>DurationSeconds</code> parameter, or until the time
     *         specified in the SAML authentication response's
     *         <code>SessionNotOnOrAfter</code> value, whichever is shorter. You
     *         can provide a <code>DurationSeconds</code> value from 900 seconds
     *         (15 minutes) up to the maximum session duration setting for the
     *         role. This setting can have a value from 1 hour to 12 hours. If
     *         you specify a value higher than this setting, the operation
     *         fails. For example, if you specify a session duration of 12
     *         hours, but your administrator set the maximum session duration to
     *         6 hours, your operation fails. To learn how to view the maximum
     *         value for your role, see <a href=
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
     *         >Creating a URL that Enables Federated Users to Access the
     *         Management Console</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         </note>
     */
    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. Your role session lasts
     * for the duration that you specify for the <code>DurationSeconds</code>
     * parameter, or until the time specified in the SAML authentication
     * response's <code>SessionNotOnOrAfter</code> value, whichever is shorter.
     * You can provide a <code>DurationSeconds</code> value from 900 seconds (15
     * minutes) up to the maximum session duration setting for the role. This
     * setting can have a value from 1 hour to 12 hours. If you specify a value
     * higher than this setting, the operation fails. For example, if you
     * specify a session duration of 12 hours, but your administrator set the
     * maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a href=
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
     * >Creating a URL that Enables Federated Users to Access the Management
     * Console</a> in the <i>IAM User Guide</i>.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>900 - 43200<br/>
     *
     * @param durationSeconds <p>
     *            The duration, in seconds, of the role session. Your role
     *            session lasts for the duration that you specify for the
     *            <code>DurationSeconds</code> parameter, or until the time
     *            specified in the SAML authentication response's
     *            <code>SessionNotOnOrAfter</code> value, whichever is shorter.
     *            You can provide a <code>DurationSeconds</code> value from 900
     *            seconds (15 minutes) up to the maximum session duration
     *            setting for the role. This setting can have a value from 1
     *            hour to 12 hours. If you specify a value higher than this
     *            setting, the operation fails. For example, if you specify a
     *            session duration of 12 hours, but your administrator set the
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
     *            Management Console</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            </note>
     */
    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. Your role session lasts
     * for the duration that you specify for the <code>DurationSeconds</code>
     * parameter, or until the time specified in the SAML authentication
     * response's <code>SessionNotOnOrAfter</code> value, whichever is shorter.
     * You can provide a <code>DurationSeconds</code> value from 900 seconds (15
     * minutes) up to the maximum session duration setting for the role. This
     * setting can have a value from 1 hour to 12 hours. If you specify a value
     * higher than this setting, the operation fails. For example, if you
     * specify a session duration of 12 hours, but your administrator set the
     * maximum session duration to 6 hours, your operation fails. To learn how
     * to view the maximum value for your role, see <a href=
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
     * >Creating a URL that Enables Federated Users to Access the Management
     * Console</a> in the <i>IAM User Guide</i>.
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
     *            The duration, in seconds, of the role session. Your role
     *            session lasts for the duration that you specify for the
     *            <code>DurationSeconds</code> parameter, or until the time
     *            specified in the SAML authentication response's
     *            <code>SessionNotOnOrAfter</code> value, whichever is shorter.
     *            You can provide a <code>DurationSeconds</code> value from 900
     *            seconds (15 minutes) up to the maximum session duration
     *            setting for the role. This setting can have a value from 1
     *            hour to 12 hours. If you specify a value higher than this
     *            setting, the operation fails. For example, if you specify a
     *            session duration of 12 hours, but your administrator set the
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
     *            Management Console</a> in the <i>IAM User Guide</i>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssumeRoleWithSAMLRequest withDurationSeconds(Integer durationSeconds) {
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
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: " + getPrincipalArn() + ",");
        if (getSAMLAssertion() != null)
            sb.append("SAMLAssertion: " + getSAMLAssertion() + ",");
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
                + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode
                + ((getSAMLAssertion() == null) ? 0 : getSAMLAssertion().hashCode());
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

        if (obj instanceof AssumeRoleWithSAMLRequest == false)
            return false;
        AssumeRoleWithSAMLRequest other = (AssumeRoleWithSAMLRequest) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null
                && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getSAMLAssertion() == null ^ this.getSAMLAssertion() == null)
            return false;
        if (other.getSAMLAssertion() != null
                && other.getSAMLAssertion().equals(this.getSAMLAssertion()) == false)
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
